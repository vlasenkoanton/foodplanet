package com.vlasenko.foodplanet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by A. Vlasenko on 18.07.2017.
 */

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
}
