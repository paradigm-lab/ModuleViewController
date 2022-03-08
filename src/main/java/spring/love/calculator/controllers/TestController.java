package spring.love.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.Info;
import spring.love.calculator.api.WebsiteInfoDTO;

import java.io.IOException;

@Controller
public class TestController {

    @Autowired
    Info serverInfo;

    @RequestMapping("/test")
    public String testModelAttribute(@ModelAttribute("websiteInfo") WebsiteInfoDTO websiteInfoDTO) throws IOException {
        System.out.println("@RequestMapping : inside testModelAttribute()");

        System.out.println(websiteInfoDTO.getWebsiteName());
        System.out.println(websiteInfoDTO.getWebsiteCategory());

        if (1==1) {
            throw new IOException();
        }

        System.out.println("Ip address of the Server is: " + serverInfo.getServerIp());

        return "index2";
    }


    @ExceptionHandler(value = NullPointerException.class)
    public String handleNullPointerException() {

        return "nullPointerException";
    }

    // Generic Method
    @ExceptionHandler(value = Exception.class)
    public String handleAnyException() {

        return "exception";
    }

}
