package org.example.ws.service.quote.tss;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Quote class models the attributes of a Quote, a famous or meaningful
 * phrase.
 * 
 * @author Matt Warman
 */
@JsonIgnoreProperties(
        ignoreUnknown = true)
public class Quote {

    /**
     * A uniquie identifier.
     */
    private String id;
    /**
     * The quote, or quote category, title.
     */
    private String title;
    /**
     * The quote text.
     */
    private String quote;
    /**
     * The length of the quote text.
     */
    private String length;
    /**
     * The date the quote was provided by the external service.
     */
    private Date date;
    /**
     * The person or entity to whom the quote is attributed.
     */
    private String author;
    /**
     * An image associated with the quote text.
     */
    private String background;
    /**
     * The category or general grouping to which the quote text belongs.
     */
    private String category;
    /**
     * An array of tags, often the categories, which are applicable to the quote
     * text.
     */
    private ArrayList<String> tags;

    /**
     * Construct a Quote instance.
     */
    public Quote() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

}
