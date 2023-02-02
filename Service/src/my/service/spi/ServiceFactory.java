package my.service.spi;

import my.service.impl.MyServiceImpl;
import my.service.spi.MyService;

public class ServiceFactory {
    public static MyService getMyServiceImpl(){
        return new MyServiceImpl();
    }
}
