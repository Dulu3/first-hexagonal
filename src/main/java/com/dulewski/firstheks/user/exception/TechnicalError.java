package com.dulewski.firstheks.user.exception;

import lombok.Data;
import org.springframework.http.HttpStatusCode;


@Data
class TechnicalError {
    public static final HttpStatusCode TEA_POT = HttpStatusCode.valueOf(418);
    private String body;

    public TechnicalError(String body) {
        this.body = body;
    }
}
