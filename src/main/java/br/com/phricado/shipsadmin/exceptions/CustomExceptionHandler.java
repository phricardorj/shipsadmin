package br.com.phricado.shipsadmin.exceptions;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Produces
@Singleton
@Requires(classes = { CustomException.class, ExceptionHandler.class })
public class CustomExceptionHandler implements ExceptionHandler<CustomException, HttpResponse<ErrorMessage>> {

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public HttpResponse<ErrorMessage> handle(HttpRequest request, CustomException exception) {
        ErrorMessage message = new ErrorMessage();
        message.setMessage(exception.getMessage());
        message.setCurrentDate(LocalDateTime.now().format(dateTimeFormatter));
        message.setStatus(false);
        return HttpResponse.serverError(message).status(HttpStatus.BAD_REQUEST);
    }

}