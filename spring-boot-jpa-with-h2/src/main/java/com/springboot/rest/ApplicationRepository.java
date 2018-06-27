package com.springboot.rest;

import java.util.List;

public interface ApplicationRepository  {
    public List<Application> findAll();
    public Application findById(Long id) ;
}
