package com.pingbid.Exception;

import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by rvignesh on 10/14/2016.
 */
public interface ExceptionAttributes {

    Map<String,Object> getExceptionAttributes(Exception exception, HttpServletRequest httpRequest, HttpStatus httpStatus);
}
