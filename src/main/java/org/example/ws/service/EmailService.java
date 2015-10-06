package org.example.ws.service;

import java.util.concurrent.Future;

import org.example.ws.model.Greeting;

/**
 * The EmailService interface defines all public business behaviors for
 * composing and transmitting email messages.
 * 
 * This interface should be injected into EmailService clients, not the
 * implementation bean.
 * 
 * @author Matt Warman
 */
public interface EmailService {

    /**
     * Send a Greeting via email synchronously.
     * @param greeting A Greeting to send.
     * @return A Boolean whose value is TRUE if sent successfully; otherwise
     *         FALSE.
     */
    Boolean send(Greeting greeting);

    /**
     * Send a Greeting via email asynchronously.
     * @param greeting A Greeting to send.
     */
    void sendAsync(Greeting greeting);

    /**
     * Send a Greeting via email asynchronously. Returns a Future&lt;Boolean&gt;
     * response allowing the client to obtain the status of the operation once
     * it is completed.
     * @param greeting A Greeting to send.
     * @return A Future&lt;Boolean&gt; whose value is TRUE if sent successfully;
     *         otherwise, FALSE.
     */
    Future<Boolean> sendAsyncWithResult(Greeting greeting);

}
