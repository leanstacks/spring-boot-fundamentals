package org.example.ws.service.quote.tss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * The QuoteServiceBean encapsulates all business behaviors operating on the
 * Quote class.
 * 
 * @author Matt Warman
 */
@Service
public class QuoteServiceBean implements QuoteService {

    /**
     * The Logger for this class.
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * The <code>CounterService</code> captures metrics for Spring Actuator.
     */
    @Autowired
    private CounterService counterService;

    /**
     * The RestTemplate used to retrieve data from the remote Quote API.
     */
    private final RestTemplate restTemplate;

    /**
     * Construct a QuoteServiceBean with a RestTemplateBuilder used to
     * instantiate the RestTemplate used by this business service.
     * @param restTemplateBuilder A RestTemplateBuilder injected from the
     *        ApplicationContext.
     */
    public QuoteServiceBean(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Quote getDaily(String category) {
        logger.info("> getDaily");

        counterService.increment("method.invoked.quoteServiceBean.getDaily");

        String quoteCategory = QuoteService.CATEGORY_INSPIRATIONAL;
        if (category != null && category.trim().length() > 0) {
            quoteCategory = category.trim();
        }

        QuoteResponse quoteResponse = this.restTemplate.getForObject(
                "http://quotes.rest/qod.json?category={cat}",
                QuoteResponse.class, quoteCategory);

        Quote quote = quoteResponse.getQuote();

        logger.info("< getDaily");
        return quote;
    }

}
