package org.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class WelcomeController {


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Map<String,String> greetings(){
        Map<String,String> map = new LinkedHashMap<>();
        map.put("status","success");
        map.put("code","1000");
        map.put("data","Welcome to Spring Boot Rest Application");
        return map;
    }

    @RequestMapping(value = "/params",method = RequestMethod.POST)
    public String printRequestParam(@RequestParam(value = "name",required = false)String name){
        return name!=null?name:"No params supplied.";
    }
    
    

}
