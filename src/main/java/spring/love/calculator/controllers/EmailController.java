package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.EmailDTO;

import java.util.Map;

@Controller
public class EmailController {

    @RequestMapping("/sendEmail")
    public String sendEmail(Model model) {

        /*
        @CookieValue("LCApp.userName") String userName, Model model) {
        // Getting the cookie using the key value and store the value in the userName
        model.addAttribute("userName", userName);
         */

        // @PathVariable("userName") String userName
        // String userName = pathVar.get("userName");
        // String hobby = pathVar.get("hobby");

        model.addAttribute("emailDTO", new EmailDTO());
        // model.addAttribute("userName", userName.toUpperCase());

        // Adding the log To check if the controller comes to my URL
        System.out.println("In my Controller method");

        return "send-email-page";
    }

    @RequestMapping("/process-email")
    public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO){

        /*
        @CookieValue("LCApp.userName") String userName, Model model) {
        model.addAttribute("userName", userName);
        */


        return "process-email-page";
    }

}
