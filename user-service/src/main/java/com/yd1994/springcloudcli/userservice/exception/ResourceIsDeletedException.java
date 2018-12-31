package com.yd1994.springcloudcli.userservice.exception;

/**
 * 用于当资源曾经存在但被删除时抛出的异常
 *
 * @author yd
 */
public class ResourceIsDeletedException extends Exception {

    public ResourceIsDeletedException() {
        super("资源已经被删除");
    }

    public ResourceIsDeletedException(String message) {
        super(message);
    }
}
