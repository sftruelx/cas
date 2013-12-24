package org.jasig.cas.logout;

/**
 * Contract that defines the format of the logout message sent to a client to indicate
 * that an SSO session has terminated.
 * @author Misagh Moayyed
 * @since 4.0
 */
public interface LogoutMessageBuilder {
    /**
     * Builds the logout message to be sent.
     *
     * @param request the request
     * @return the message. Message may or may not be encoded.
     */
    String build(LogoutRequest request);
}
