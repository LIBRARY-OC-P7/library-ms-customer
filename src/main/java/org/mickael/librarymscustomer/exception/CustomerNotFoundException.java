package org.mickael.librarymscustomer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Customer Not Found")
public class CustomerNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;
    public CustomerNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
