package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.EmailDTO;

@Controller
public class EmailController {

    @RequestMapping("/sendEmail")
    public String sendEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO) {

        return "send-email-page";
    }

    @RequestMapping("/process-email")
    public String processEmail(@ModelAttribute("") EmailDTO emailDTO) {

        return "process-email-page";
    }

}
