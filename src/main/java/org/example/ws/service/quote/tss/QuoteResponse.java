package org.example.ws.service.quote.tss;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The QuoteResponse class models the attributes of a response from the "They
 * Said So" (TSS) remote Quote API. This class represents the top-level model of
 * the API response.
 * 
 * @author Matt Warman
 */
@JsonIgnoreProperties(
        ignoreUnknown = true)
public class QuoteResponse {

    /**
     * The success or failure status of the API call.
     */
    private QuoteResponseSuccess success;
    /**
     * The body of the API call response.
     */
    private QuoteResponseContents contents;

    /**
     * Construct a new QuoteResponse.
     */
    public QuoteResponse() {

    }

    /**
     * Returns the QuoteResponseSuccess object.
     * @return A QuoteResponseSuccess object.
     */
    public QuoteResponseSuccess getSuccess() {
        return success;
    }

    /**
     * Sets the QuoteResponseSuccess object.
     * @param success A QuoteResponseSuccess object.
     */
    public void setSuccess(QuoteResponseSuccess success) {
        this.success = success;
    }

    /**
     * A helper method which examines the internal value of the
     * QuoteResponseSuccess object and returns a boolean indicating the success
     * or failure of the API call.
     * @return A boolean whose value is <code>true</code> if the API call was
     *         successful, otherwise returns <code>false</code>.
     */
    public boolean isSuccess() {
        if (success != null && success.getTotal() > 0) {
            return true;
        }
        return false;
    }

    /**
     * Returns the QuoteResponseContents object.
     * @return A QuoteResponseContents object.
     */
    public QuoteResponseContents getContents() {
        return contents;
    }

    /**
     * Sets the QuoteResponseContents object.
     * @param contents A QuoteResponseContents object.
     */
    public void setContents(QuoteResponseContents contents) {
        this.contents = contents;
    }

    /**
     * A helper method which examines the internal value of the
     * QuoteResponseContents object and returns the first Quote object from the
     * Collection if the API call was successful and the Collection is not
     * empty.
     * @return A Quote object or <code>null</code>.
     */
    public Quote getQuote() {
        if (isSuccess()) {
            if (contents != null && contents.getQuotes().size() > 0) {
                return contents.getQuotes().get(0);
            }
        }
        return null;
    }

}
