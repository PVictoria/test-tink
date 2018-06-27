package com.springboot.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  curl -i -X GET -H Accept:application/json "http://localhost:8080/apps"
 *  curl -i -X GET -H Accept:application/json "http://localhost:8080/apps/2"
 */

@RestController
public class AppRestController {
    @Autowired
    private ApplicationRepository applicationRepository;
    @RequestMapping("/apps")
    public List<Application> apps() {

       return applicationRepository.findAll();

    }

    @RequestMapping("/apps/{contactId}")
    public Application appById(@PathVariable Long contactId){
        Application app = new Application();
        try {
            app = applicationRepository.findById(contactId);

        }catch (Exception e){
            app.setProductName("Invalid data");

        }
        finally {
            return app;
        }
    }
}
