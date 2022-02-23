package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.love.calculator.api.EmailDTO;
import spring.love.calculator.api.UserInfoDTO;
import spring.love.calculator.service.LCAppEmailService;
import spring.love.calculator.service.LCAppEmailServiceImpl;

import javax.servlet.http.HttpSession;
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
    public String processEmail(@SessionAttribute("userInfo") UserInfoDTO userInfoDTO, @ModelAttribute("emailDTO") EmailDTO emailDTO) {

        /*
        HttpSession session, Model model

        String userName =  (String) session.getAttribute("userName");
        String newUserName = "Mr " + userName;

        model.addAttribute("userName", newUserName);
        */

        /*
        @CookieValue("LCApp.userName") String userName, Model model) {
        model.addAttribute("userName", userName);
        */

        new LCAppEmailServiceImpl().sendEmail(userInfoDTO.getUserName(), emailDTO.getUserEmail(), "Friend");

        return "process-email-page";
    }

}
