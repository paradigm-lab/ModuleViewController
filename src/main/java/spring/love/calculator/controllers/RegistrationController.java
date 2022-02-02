package spring.love.calculator.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.CommunicationDTO;
import spring.love.calculator.api.Phone;
import spring.love.calculator.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

    @RequestMapping("/register")
    public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {

        System.out.println("Inside the showRegistrationPage method");

        Phone phone = new Phone();
        phone.setCountryCode("255");
        phone.setUserNumber("0723280271");
        CommunicationDTO communicationDTO = new CommunicationDTO();
        communicationDTO.setPhone(phone);

        dto.setCommunicationDTO(communicationDTO);

        return "user-registration-page";
    }

    @RequestMapping("/registration-success")
    public String processUserReg(@ModelAttribute("userReg") UserRegistrationDTO dto) {

        return "registration-success";
    }
}
