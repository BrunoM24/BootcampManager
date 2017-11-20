package org.academiadecodigo.registerexercise.service;

import java.util.HashMap;
import java.util.Map;

/**
 * RegisterExercise Created by BrunoM24 on 13/11/2017.
 */


public final class ServiceRegistry {

    private static ServiceRegistry instance = null;

    private Map<String, Service> services = new HashMap<>();

    ServiceRegistry(){}

    public static synchronized ServiceRegistry getInstance(){
        if(instance == null){
            instance = new ServiceRegistry();
        }

        return instance;
    }

    public Service getService(String service) {
        return this.services.get(service);
    }

    public void addService(String serviceString, Service service){
        this.services.put(serviceString, service);
    }
}
