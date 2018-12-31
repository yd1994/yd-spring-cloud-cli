package com.yd1994.springcloudcli.userservice.controller;

import com.yd1994.springcloudcli.userservice.exception.ResourceIsDeletedException;
import com.yd1994.springcloudcli.userservice.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局服务于rest api异常监听
 */
@RestControllerAdvice
public class RestErrorHandler {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity illegalArgumentException(IllegalArgumentException e) {
        if (log.isInfoEnabled()) {
            log.info("Returning HTTP 400 Bad Request: " + e.getMessage());
        }
        return ResponseEntity.badRequest().body(getMap(e.getMessage()));
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity resourceNotFoundException(ResourceNotFoundException e) {
        if (log.isDebugEnabled()) {
            log.debug("Returning HTTP 404 notFound: " + e.getMessage());
        }
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(ResourceIsDeletedException.class)
    public ResponseEntity resourceIsDeletedException(ResourceIsDeletedException e) {
        if (log.isDebugEnabled()) {
            log.debug("Returning HTTP 410 GONE: " + e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.GONE).body(getMap(e.getMessage()));
    }

    private Map<String, Object> getMap(String message) {

        Map<String, Object> map = new HashMap<>();
        map.put("message", message);

        return map;
    }

}
