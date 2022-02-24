package spring.love.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import spring.love.calculator.api.UserInfoDTO;
import spring.love.calculator.service.LCAppService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
// When passing the SessionAttributes we need to make sure that it's the model object name
// Model attribute to session takes an array, so we can pass more than one Model in our session
// @SessionAttributes("{userInfo}, {EmailDTO}")
@SessionAttributes("userInfo")
public class LCAppController {

    @Autowired
    private LCAppService lcAppService;


    @RequestMapping("/")
    public String showHomePage(Model model) {

        // When we use the @ModelAttribute annotation then we need to pass the model attribute by our selves

        model.addAttribute("userInfo", new UserInfoDTO());


        /*

        HttpServletRequest

        Cookie[] cookies = request.getCookies();

        for(Cookie temp : cookies) {
            if ("LCApp.userName".equals(temp.getName())) {
                String myUserName = temp.getValue();
                userInfodto.setUserName(myUserName);
            }
        }
        */


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
    public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result, Model model) {

        System.out.println(userInfoDTO.isTermAndCondition());

        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError temp : allErrors) {
                System.out.println(temp);
            }

            return "home-page";
        }


        String appResult = lcAppService.calculateLove(userInfoDTO.getUserName(), userInfoDTO.getCrushName());
        userInfoDTO.setResult(appResult);

        // model.addAttribute("result", appResult);

        // The session object is now globally available
        // By Default, The Session objects are stored inside the server in memory
        // All the session object will be removed from the memory once you stop the server

        /*
                HttpServletRequest
        HttpSession session = request.getSession();
        session.setAttribute("userName", userInfoDTO.getUserName());

         */

        // Configuring the session timeout
        // if the users remains inactive for 120 minutes remove the userName object from the session
        // session.setMaxInactiveInterval(120);


        /*

        // HttpServletResponse

        // Create a cookie for the username
        // The cookie Constructor takes a key and the value which is a Map
        Cookie cookie = new Cookie("LCApp.userName",userInfoDTO.getUserName());
        cookie.setMaxAge(60*60*24);

        // Add the Cookie to the response object
        response.addCookie(cookie);
       */


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
