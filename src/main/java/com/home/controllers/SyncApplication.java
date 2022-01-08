package com.home.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class SyncApplication extends SpringBootServletInitializer {
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(SyncApplication.class);
        }

        public static void main(String[] args) {
            SpringApplication.run(SyncApplication.class, args);
        }
}
