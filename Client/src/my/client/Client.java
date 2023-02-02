package my.client;

//import my.service.impl.MyServiceImpl;
import my.service.spi.MyService;
import my.service.spi.ServiceFactory;

import java.lang.reflect.Field;
import java.sql.DriverManager;
import java.util.ServiceLoader;


public class Client {
    public static void main(String[] args) throws Throwable{
        //DriverManager.getConnection("jdbc://java:package");
        //MyService myService = new MyServiceImpl();
        MyService myService = ServiceFactory.getMyServiceImpl();
        Class<?> clazz = myService.getClass();
        Field field = clazz.getDeclaredField("message");
        field.setAccessible(true);
        field.set(clazz , "Security failed up");
        System.out.println(myService.getMessage());
        System.out.println("------------------->");
        ServiceLoader<MyService> serviceServiceLoader = ServiceLoader.load(MyService.class);
        for (MyService ms :serviceServiceLoader){
            System.out.println(ms.getMessage());
        }
    }
}
