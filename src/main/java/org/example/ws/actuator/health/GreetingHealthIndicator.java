package org.example.ws.actuator.health;

import java.util.Collection;

import org.example.ws.model.Greeting;
import org.example.ws.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * The GreetingHealthIndicator is a custom Spring Boot Actuator HealthIndicator
 * implementation. HealthIndicator classes are invoked when the Actuator
 * 'health' endpoint is invoked. Each HealthIndicator class assesses some
 * portion of the application's health, returing a Health object which indicates
 * that status and, optionally, additional health attributes.
 * 
 * @author Matt Warman
 */
@Component
public class GreetingHealthIndicator implements HealthIndicator {

    /**
     * The GreetingService business service.
     */
    @Autowired
    private GreetingService greetingService;

    @Override
    public Health health() {

        // Assess the application's Greeting health. If the application's
        // Greeting components have data to service user requests, the Greeting
        // component is considered 'healthy', otherwise it is not.

        Collection<Greeting> greetings = greetingService.findAll();

        if (greetings == null || greetings.size() == 0) {
            return Health.down().withDetail("count", 0).build();
        }

        return Health.up().withDetail("count", greetings.size()).build();
    }

}
