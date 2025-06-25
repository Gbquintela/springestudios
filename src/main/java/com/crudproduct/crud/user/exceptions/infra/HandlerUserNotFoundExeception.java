package com.crudproduct.crud.user.exceptions.infra;

import com.crudproduct.crud.core.RestErroMessage;
import com.crudproduct.crud.user.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.notification.UnableToSendNotificationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 * Tratamento de execeções quando um usuario não for encontrado
 * */
@ControllerAdvice
public class HandlerUserNotFoundExeception {

    @ExceptionHandler(UserNotFoundException.class)
    private ResponseEntity<RestErroMessage> userNotFound(
            UserNotFoundException exception
    ) {
        RestErroMessage treatResponse = new RestErroMessage(HttpStatus.NOT_FOUND,
                exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(treatResponse);
    }

}
