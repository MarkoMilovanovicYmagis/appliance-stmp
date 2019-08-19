package com.ymagis.emulator.appliancestmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ApplianceStmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplianceStmpApplication.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
        }
    }

}
