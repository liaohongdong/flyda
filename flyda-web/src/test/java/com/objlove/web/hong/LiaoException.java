package com.objlove.web.hong;

public class LiaoException extends Exception {
    public LiaoException() {
        super();
        System.out.println("1111");
    }

    public LiaoException(String message) {
        super(message);
    }

    public LiaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public LiaoException(Throwable cause) {
        super(cause);
    }

    protected LiaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
