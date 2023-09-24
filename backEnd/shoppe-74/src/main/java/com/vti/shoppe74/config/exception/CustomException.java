package com.vti.shoppe74.config.exception;

import lombok.Data;

import java.time.Instant;
@Data

public class CustomException extends  RuntimeException {
    private Instant timestamp;
    private int status;
    private String message;
    private String path;

    public CustomException(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
