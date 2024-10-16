package com.jenkisboot;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsBootApplication {
    public static Logger logger= LoggerFactory.getLogger(JenkinsBootApplication.class);
    public static void main(String[] args) {
        logger.info("application executed");

        SpringApplication.run(JenkinsBootApplication.class,args);
    }
    @PostConstruct
    public void init(){
        logger.info("application started");
        }
}