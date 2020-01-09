package com.greetingtech.collection.db;

/**
 * @author greetingtech
 * @date 2020-01-09
 */
public class CollectionDbException extends RuntimeException {

    public CollectionDbException() {
    }

    public CollectionDbException(String message) {
        super(message);
    }

    public CollectionDbException(String message, Throwable cause) {
        super(message, cause);
    }

    public CollectionDbException(Throwable cause) {
        super(cause);
    }

    public CollectionDbException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
