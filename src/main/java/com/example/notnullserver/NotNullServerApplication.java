package com.example.notnullserver;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import socket.MainServerSocket;

import java.util.logging.Logger;

@SpringBootApplication
public class NotNullServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotNullServerApplication.class, args);
    }

    @Bean(initMethod="main")
    public MainServerSocket getMainSocketBean() {
        return new MainServerSocket();
    }

}
