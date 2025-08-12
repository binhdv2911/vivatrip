package com.osp.vivatrip.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(1001, "Uncategorized Exception"),
    INVALID_KEY(1002, "Invalid message key"),
    USER_EXISTED(1003, "Username already exists"),
    USERNAME_INVALID(1004, "Username must be at least 3 characters"),
    PASSWORD_INVALID(1005, "Password must be at least 8 characters"),
    USER_NOT_EXISTED(1006, "User not existed");
    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
