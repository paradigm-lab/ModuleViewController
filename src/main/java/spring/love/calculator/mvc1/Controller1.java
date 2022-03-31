package spring.love.calculator.mvc1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.love.calculator.api.ApplicationScopeTest;
import spring.love.calculator.api.SingletonTest;

@Controller
@RequestMapping("/app1")
public class Controller1 {

    // This object is available in the Servlet Context
    @Autowired
    private ApplicationScopeTest applicationScopeTest;

    @Autowired
    private SingletonTest singletonTest;


    @ResponseBody
    @RequestMapping("/changeDefaultValue")
    public String test() {
        // Changing ApplicationScopeTest default value
        applicationScopeTest.setI(5);

        // Changing SingletonTest default value
        singletonTest.setI(5);

        return "App One >>>> " + "ApplicationScopeTest Value " + applicationScopeTest.getI() + " SingletonTest Value " + singletonTest.getI();
    }

}
