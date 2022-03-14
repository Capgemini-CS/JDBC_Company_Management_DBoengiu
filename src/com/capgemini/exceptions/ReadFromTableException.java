package com.capgemini.exceptions;

import java.io.IOException;

public class ReadFromTableException extends RuntimeException {
    public ReadFromTableException(String message) {
        super(message);
    }
}
