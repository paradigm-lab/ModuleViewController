package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.love.calculator.api.UserInfoDTO;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@Controller
public class LCAppController {


    @RequestMapping("/")
    public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfodto, HttpServletRequest request) {

        Cookie[] cookies = request.getCookies();

        for(Cookie temp : cookies) {
            if ("LCApp.userName".equals(temp.getName())) {
                String myUserName = temp.getValue();
                userInfodto.setUserName(myUserName);
            }
        }

        return "home-page";
    }

    /*
    @RequestMapping("/")
    public String showHomepage(Model model) {

       // Read the default property by fetching it from the dto


        UserInfoDTO userInfoDTO = new UserInfoDTO();
        model.addAttribute("userInfo", userInfoDTO);

        return "home-page";
    }
    */


    @RequestMapping("/process-homepage")
    public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result, HttpServletResponse response) {

        System.out.println(userInfoDTO.isTermAndCondition());

        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError temp : allErrors) {
                System.out.println(temp);
            }

            return "home-page";
        }

        // Create a cookie for the username
        // The cookie Constructor takes a key and the value which is a Map
        Cookie cookie = new Cookie("LCApp.userName",userInfoDTO.getUserName());
        cookie.setMaxAge(60*60*24);

        // Add the Cookie to the response object
        response.addCookie(cookie);
        // Write a service which will calculate the love % between the user and the crush name



        return "result-page";
    }

    /*

    @RequestMapping("/process-homepage")
    public String showResult(UserInfoDTO userInfoDTO, Model model) {

        // Writing the value to the properties  by fetching from the url
        System.out.println("User Name is: " + userInfoDTO.getUserName());
        System.out.println("Crush Name is: " + userInfoDTO.getCrushName());

        model.addAttribute("userInfo", userInfoDTO);

        return "result-page";
    }

     */

    /*
    @RequestMapping("/process-homepage")
    public String showResultPage(@RequestParam("userName") String userName1, @RequestParam("crushName") String crushName1, Model model) {
        System.out.println("User name is: " + userName1);
        System.out.println("Crush name is: " + crushName1);

        model.addAttribute("userName", userName1);
        model.addAttribute("crushName", crushName1);

        return "result-page";
    }
    */

}
