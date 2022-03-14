package com.capgemini.exceptions;

import java.io.IOException;

public class ConnectionException extends RuntimeException {
    public ConnectionException(String message) {
        super(message);
    }
}
