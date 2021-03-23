package com.springcourse.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class ParkingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkingSystemApplication.class);
    }

}
