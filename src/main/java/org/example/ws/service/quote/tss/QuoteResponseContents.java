package org.example.ws.service.quote.tss;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The QuoteResponseContents class is a container for the body of a response
 * from the "They Said So" (TSS) remote Quote API. This class holds the
 * object(s) returned from the call.
 * 
 * @author Matt Warman
 */
@JsonIgnoreProperties(
        ignoreUnknown = true)
public class QuoteResponseContents {

    /**
     * An array of Quote objects.
     */
    private ArrayList<Quote> quotes = new ArrayList<Quote>(0);

    /**
     * Contructs a new QuoteResponseContents object.
     */
    public QuoteResponseContents() {

    }

    /**
     * Returns the array of Quote objects.
     * @return An array of Quote objects.
     */
    public ArrayList<Quote> getQuotes() {
        return quotes;
    }

    /**
     * Sets the array of Quote objects.
     * @param quotes An array of Quote objects.
     */
    public void setQuotes(ArrayList<Quote> quotes) {
        if (quotes == null) {
            this.quotes = new ArrayList<Quote>(0);
        }
        this.quotes = quotes;
    }

}
