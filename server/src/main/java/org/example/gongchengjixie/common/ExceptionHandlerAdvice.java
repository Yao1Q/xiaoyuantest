package org.example.gongchengjixie.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ResponseBody
    @ExceptionHandler(value=Exception.class)
    public Result exceptionError(Exception e) {
        return Result.error(e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(value=SystemException.class)
    public Result exceptionFail(SystemException e) {
        return Result.fail(e.getMessage());
    }
}
