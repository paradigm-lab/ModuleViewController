package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes({"firstName", "lastName"})
public class FirstController {

    @RequestMapping("/first")
    public String handlingMethod1(Model model, HttpServletRequest request) {

        model.addAttribute("firstName", "Collins");
        model.addAttribute("lastName", "Boniface");

        model.addAttribute("next", "/second");

        HttpSession session = request.getSession();
        session.setAttribute("address", "Sakina");

        return "index";
    }

    @RequestMapping("/second")
    public String handlingMethod2(Model model1) {
        // Getting from the model object
        // Because the model is available in my Request Scope
        String firstName = (String) model1.getAttribute("firstName");
        System.out.println(firstName);

        String lastName = (String) model1.getAttribute("lastName");
        System.out.println(lastName);

        model1.addAttribute("firstName", firstName);
        model1.addAttribute("lastName", lastName);

        model1.addAttribute("next", "/third");

        // Removing the session attributes from the session scope
        // All the Session Attributes will be removed from the session scope
        // status.setComplete();

        return "index";
    }


    @RequestMapping("/third")
    public String handlingMethod3(Model model2, SessionStatus status, HttpSession session) {

        String lastName = (String) model2.getAttribute("lastName");
        System.out.println("Third request; Fetching from model: " + lastName);

        model2.addAttribute("lastName");

        model2.addAttribute("next", "/normalMethod");

        status.setComplete();

        String address = (String) session.getAttribute("address");
        String newAddress = address += "Home Sweet Home";

        model2.addAttribute("address", newAddress);

        return "index";
    }
}
