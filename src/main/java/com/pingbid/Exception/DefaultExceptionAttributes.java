package com.pingbid.Exception;

import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by rvignesh on 10/14/2016.
 */
public class DefaultExceptionAttributes implements ExceptionAttributes{

    private static final String TIMESTAMP = "timestamp";
    private static final String STATUS = "status";
    private static final String ERROR = "error";
    private static final String EXCEPTION = "exception";
    private static final String MESSAGE = "message";
    private static final String PATH = "path";

    @Override
    public Map<String, Object> getExceptionAttributes(Exception exception, HttpServletRequest httpRequest, HttpStatus httpStatus) {
        Map<String,Object> exceptionAttributes = new LinkedHashMap<String,Object>();

        exceptionAttributes.put(TIMESTAMP,new Date());
        addHtppStatus(exceptionAttributes,httpStatus);
        addExceptionDetail(exceptionAttributes,exception);
        addPath(exceptionAttributes,httpRequest);

        return exceptionAttributes;
    }

    private void addHtppStatus(Map<String, Object> exceptionAttributes,HttpStatus httpStatus){

        exceptionAttributes.put(STATUS,httpStatus.value());
        exceptionAttributes.put(ERROR,httpStatus.getReasonPhrase());

    }

    private void addExceptionDetail(Map<String, Object> exceptionAttributes,Exception exception){

        exceptionAttributes.put(EXCEPTION,exception.getClass().getName());
        exceptionAttributes.put(MESSAGE,exception.getMessage());

    }

    private void addPath(Map<String, Object> exceptionAttributes,HttpServletRequest httpRequest){

        exceptionAttributes.put(PATH,httpRequest.getServletPath());

    }
}
