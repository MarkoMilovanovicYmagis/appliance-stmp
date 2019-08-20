package com.ymagis.emulator.appliancestmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApplianceStmpApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplianceStmpApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplianceStmpApplication.class, args);
    }

}
