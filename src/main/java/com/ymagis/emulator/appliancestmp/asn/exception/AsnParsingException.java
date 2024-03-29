package com.ymagis.emulator.appliancestmp.asn.exception;

public class AsnParsingException extends RuntimeException {

    public AsnParsingException() {
    }

    public AsnParsingException(String message) {
        super(message);
    }

    public AsnParsingException(Throwable cause) {
        super(cause);
    }

    public AsnParsingException(String message, Throwable cause) {
        super(message, cause);
    }
}