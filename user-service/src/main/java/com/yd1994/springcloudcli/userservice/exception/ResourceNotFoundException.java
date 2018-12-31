package com.yd1994.springcloudcli.userservice.exception;

/**
 * 用于当资资源不存在时抛出的异常
 *
 * @author yd
 */
public class ResourceNotFoundException extends Exception {

    public ResourceNotFoundException() {
        super("资源不存在");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
