package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {

    @RequestMapping("/sendEmail")
    public String sendEmail() {

        return "send-email-page";
    }

}
