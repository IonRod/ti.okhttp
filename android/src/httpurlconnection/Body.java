/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2015 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 * 
 * 
 * Copied and modified from Apache's implementation (APL2 license):
 * org.apache.james.mime4j.message.Body
 */

package httpurlconnection;

/**
 * Encapsulates the body of an entity (see RFC 2045).
 * <p>
 * A body can be a {@link Message}, a {@link Multipart} or a {@link SingleBody}.
 * This interface should not be implemented directly by classes other than
 * those.
 */
public interface Body {

    /**
     * Gets the parent of this body.
     * 
     * @return the parent.
     */
    Entity getParent();

    /**
     * Sets the parent of this body.
     * 
     * @param parent
     *            the parent.
     */
    void setParent(Entity parent);

}