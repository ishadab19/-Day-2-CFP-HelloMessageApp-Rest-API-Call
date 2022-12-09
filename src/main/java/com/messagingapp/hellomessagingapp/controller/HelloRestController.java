package com.messagingapp.hellomessagingapp.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    //UC-1
    @RequestMapping(value = "/hello")
    public String hello() {
        return " Hello From BridgeLabz ";
    }
    @RequestMapping(value = "/sayhello",method = RequestMethod.GET)
    public String sayHello(){
        return "My name is Shadab";
    }

    //UC-2

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public String sayHelloAgain(@RequestParam(value = "name")String name){
        return "Hello " +name+ " From BridgeLabz!!!!";
    }

    @RequestMapping(value = "/query1",method = RequestMethod.PUT)
    public String sayHelloAgain(@RequestParam(value = "MobileNumber")long MobileNumber){
        return "Hello My Mobile Number is ==> " +MobileNumber;
    }



    }
