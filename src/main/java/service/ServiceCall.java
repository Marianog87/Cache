package service;


import org.springframework.cache.annotation.Cacheable;


public interface ServiceCall {

    int getTimes();

    @Cacheable("messageCache")
    String[] getAirports();


}
