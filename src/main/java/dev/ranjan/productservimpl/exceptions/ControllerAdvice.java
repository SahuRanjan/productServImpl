package dev.ranjan.productservimpl.exceptions;

import dev.ranjan.productservimpl.dtos.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
//    @ExceptionHandler(NotFoundException.class)
//    private ResponseEntity<ExceptionDto> handleNotFoundException(NotFoundException notFoundException)
//    {
//        return new ResponseEntity(new ExceptionDto(HttpStatus.NOT_FOUND, notFoundException.getMessage()), HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
//    private ResponseEntity<ExceptionDto> handleArrayIndexOutOfBound(
//            ArrayIndexOutOfBoundsException notFoundException
//    ) {
//
//        return new ResponseEntity(new ExceptionDto(HttpStatus.NOT_FOUND, notFoundException.getMessage()), HttpStatus.NOT_FOUND);
//    }
}