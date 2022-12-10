package com.messagingapp.hellomessagingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class HelloMessagingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloMessagingAppApplication.class, args);
        System.out.println("Welcome To Hello Messaging Application");
    }

}
