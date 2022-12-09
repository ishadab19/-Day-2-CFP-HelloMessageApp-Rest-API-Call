package com.messagingapp.hellomessagingapp.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

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

    //UC-2//Passing name as Query parameter
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public String sayHelloAgain(@RequestParam(value = "name")String name){
        return "Hello " +name+ " From BridgeLabz!!!!";
    }

    @RequestMapping(value = "/query1",method = RequestMethod.PUT)
    public String sayHelloAgain(@RequestParam(value = "MobileNumber")long MobileNumber){
        return "Hello My Mobile Number is ==> " +MobileNumber;
    }

    //UC-3 //PathVariable
    @RequestMapping(value = "/path/{name}",method = RequestMethod.GET)
    public String passName(@PathVariable String name){
        return "Hello "+name+ "!!";
    }

    @RequestMapping(value = "/path1/{userId}",method = RequestMethod.PUT)
    public String passDetail(@PathVariable("userId")int userId){
        return "This is My UserID " + userId;
    }

    }
