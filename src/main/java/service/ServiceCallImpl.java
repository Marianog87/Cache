package service;

import org.springframework.stereotype.Component;

@Component
public class ServiceCallImpl implements ServiceCall {

    private static String[] airports = {"Airport 1","Airport 2","Airport 3","Airport 4","Airport 5"};
    private int times;

    public ServiceCallImpl() {
       this.times=0;
    }
    public int getTimes() {
        return this.times;
    }
    public String[] getAirports() {
        ++ times ;
        return airports;
    }
}
