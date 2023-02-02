package my.secondeServiceProvider;

import my.service.spi.MyService;

public class MyServiceImpl implements MyService {
    private static final String message = "Another secret message";

    @Override
    public String getMessage() {
        return message;
    }
}
