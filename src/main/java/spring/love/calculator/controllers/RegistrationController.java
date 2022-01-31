package spring.love.calculator.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

    @RequestMapping("/register")
    public String showRegistrationPage(Model model) {
        UserRegistrationDTO dto = new UserRegistrationDTO();

        model.addAttribute("userReg", dto);

        return "user-registration-page";
    }

}
