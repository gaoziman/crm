package com.manman.crm.exception;


import com.manman.crm.result.Result;
import com.manman.crm.result.ResultDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 满满
 */
@ControllerAdvice
public class BaseExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(BaseExceptionHandler.class);

    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public ResultDto handle(ServiceException exception){
        logger.info(exception.getMessage());
        return Result.error(exception.getCode(),exception.getMessage());
    }
}
