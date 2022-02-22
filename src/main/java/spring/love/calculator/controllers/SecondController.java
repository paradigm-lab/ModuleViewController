package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpSession;

@Controller
public class SecondController {

    @RequestMapping("/normalMethod")
    public String handlingMethod3(@SessionAttribute("firstName") String firstName, Model model, HttpSession session) {

        // String firstName = (String) model.getAttribute("firstName");

        String newFirstName = "Mr " + firstName;
        model.addAttribute("firstName", newFirstName);

        System.out.println("Inside the new Controller method, Printing firstName: " + firstName);

        // Retrieving the session Attribute from http session
        String address = (String) session.getAttribute("address");
        String newAddress = address + " South Africa";
        model.addAttribute("address", newAddress);

        return "index";
    }

}
