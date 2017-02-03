package org.example.ws.web.api;

import org.example.ws.service.quote.tss.Quote;
import org.example.ws.service.quote.tss.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The QuoteController class is a RESTful web service controller. The
 * <code>@RestController</code> annotation informs Spring that each
 * <code>@RequestMapping</code> method returns a <code>@ResponseBody</code>
 * which, by default, contains a ResponseEntity converted into JSON with an
 * associated HTTP status code.
 * 
 * @author Matt Warman
 */
@RestController
public class QuoteController extends BaseController {

    /**
     * The QuoteService business service.
     */
    @Autowired
    private QuoteService quoteService;

    /**
     * Web service endpoint to fetch the Quote of the day.
     * 
     * If found, the Quote is returned as JSON with HTTP status 200.
     * 
     * If not found, the service returns an empty response body with HTTP status
     * 404.
     * 
     * @return A ResponseEntity containing a single Quote object, if found, and
     *         a HTTP status code as described in the method comment.
     */
    @RequestMapping(
            value = "/api/quotes/daily",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Quote> getQuoteOfTheDay() {
        logger.info("> getQuoteOfTheDay");

        Quote quote = quoteService.getDaily(QuoteService.CATEGORY_INSPIRATIONAL);

        if (quote == null) {
            return new ResponseEntity<Quote>(HttpStatus.NOT_FOUND);
        }
        logger.info("< getQuoteOfTheDay");
        return new ResponseEntity<Quote>(quote, HttpStatus.OK);
    }

}
