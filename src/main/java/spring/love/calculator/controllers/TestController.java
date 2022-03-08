package spring.love.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.Info;
import spring.love.calculator.api.WebsiteInfoDTO;

@Controller
public class TestController {

    @Autowired
    Info serverInfo;

    @RequestMapping("/test")
    public String testModelAttribute(@ModelAttribute("websiteInfo") WebsiteInfoDTO websiteInfoDTO) {
        System.out.println("@RequestMapping : inside testModelAttribute()");

        System.out.println(websiteInfoDTO.getWebsiteName());
        System.out.println(websiteInfoDTO.getWebsiteCategory());


        System.out.println("Ip address of the Server is: " + serverInfo.getServerIp());

        return "index2";
    }


    @ExceptionHandler(value = NullPointerException.class)
    public String handleNullPointerException() {

        return "nullPointerException";
    }

    @ExceptionHandler(value = Exception.class)
    public String handleAnyException() {

        return "exception";
    }

}
