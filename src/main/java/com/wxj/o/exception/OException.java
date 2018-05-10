package com.wxj.o.exception;


public class OException extends Exception {
    private static final long serialVersionUID = -8641198158155821498L;

    public OException(String detailMessage) {
        super(detailMessage);
    }

    public static OException UNKNOWN() {
        return new OException("unknown exception!");
    }

    public static OException BREAKPOINT_NOT_EXIST() {
        return new OException("breakpoint file does not exist!");
    }

    public static OException BREAKPOINT_EXPIRED() {
        return new OException("breakpoint file has expired!");
    }
}
