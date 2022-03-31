package spring.love.calculator.mvc2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.love.calculator.api.ApplicationScopeTest;
import spring.love.calculator.api.SingletonTest;

@Controller
@RequestMapping("/app2")
public class Controller2 {
    @Autowired
    private ApplicationScopeTest applicationScopeTest;

    @Autowired
    private SingletonTest singletonTest;

    @ResponseBody
    @RequestMapping("/accessValue")
    public String appTwo() {

        return "App Two >>> " + "ApplicationScopeTest value " + applicationScopeTest.getI() +
                " SingletonTest value " + singletonTest.getI();
    }
}
