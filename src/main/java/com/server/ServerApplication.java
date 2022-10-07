package com.server;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@OpenAPIDefinition(servers = { @Server(url = "")})
public class ServerApplication {


    public static void main(String[] args) {
        System.out.println("Beta version 0.5");
        SpringApplication.run(ServerApplication.class, args);
    }

}
