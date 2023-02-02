package my.service.impl;

import my.service.spi.MyService;

public class MyServiceImpl implements MyService {
    private static String message = "Secret message";

    @Override
    public String getMessage() {
        return message;
    }
}
