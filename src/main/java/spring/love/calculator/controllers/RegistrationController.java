package spring.love.calculator.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.CommunicationDTO;
import spring.love.calculator.api.Phone;
import spring.love.calculator.api.UserRegistrationDTO;

import javax.validation.Valid;
import java.util.List;

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
    public String processUserReg(@Valid @ModelAttribute("userReg") UserRegistrationDTO dto, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("My page has errors");

            // Adding the errors into a list and loop through them
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error);
            }

            return "user-registration-page";
        }

        return "registration-success";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        System.out.println("Inside the init binder method...");

        // binder.setDisallowedFields("name");
        

    }
}
