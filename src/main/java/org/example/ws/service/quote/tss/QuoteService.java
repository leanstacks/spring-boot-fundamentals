package org.example.ws.service.quote.tss;

/**
 * The QuoteService interface defines all public business behaviors for
 * operations Quote objects.
 * 
 * This interface should be injected into QuoteService clients, not the
 * implementation bean.
 * 
 * @author Matt Warman
 */
public interface QuoteService {

    /**
     * The 'inspirational' Quote category value.
     */
    String CATEGORY_INSPIRATIONAL = "inspire";

    /**
     * Retrieves the Quote of the day. A daily rotating Quote object.
     * @param category An optional String value of a Quote category to retrieve.
     *        If not specified, the default category value is used.
     * @return A Quote object or <code>null</code> if none found.
     */
    Quote getDaily(String category);

}
