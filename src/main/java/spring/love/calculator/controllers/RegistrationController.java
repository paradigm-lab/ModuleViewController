package spring.love.calculator.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

    @RequestMapping("/register")
    public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {
        dto.setName("Collins");
        return "user-registration-page";
    }

    @RequestMapping("/registration-success")
    public String processUserReg(@ModelAttribute("userReg") UserRegistrationDTO dto) {

        return "registration-success";
    }
}
