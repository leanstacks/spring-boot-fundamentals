package org.example.ws.service;

import java.util.Collection;

import org.example.ws.model.Greeting;

public interface GreetingService {

    Collection<Greeting> findAll();

    Greeting findOne(Long id);

    Greeting create(Greeting greeting);

    Greeting update(Greeting greeting);

    void delete(Long id);

}
