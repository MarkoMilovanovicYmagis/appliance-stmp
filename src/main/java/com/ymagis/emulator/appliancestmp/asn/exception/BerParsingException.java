package com.ymagis.emulator.appliancestmp.asn.exception;

public class BerParsingException extends RuntimeException {

    public BerParsingException() {
    }

    public BerParsingException(String message) {
        super(message);
    }

    public BerParsingException(Throwable cause) {
        super(cause);
    }

    public BerParsingException(String message, Throwable cause) {
        super(message, cause);
    }
}
