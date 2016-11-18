package com.nick.pfinder.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("CharacterConfig.xml")
public class ApplicationServer {

    @Autowired
    private static PathfinderResourceConfig resourceConfig;

    public static void main(String[] args){
        SpringApplication.run(ApplicationServer.class, args);
    }
}