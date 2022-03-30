package spring.love.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.love.calculator.api.MyBean;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class BeanTestController {

    @Autowired
    MyBean myBean;

    // For Every new Request we are going to get a new instance or object
    @RequestMapping("/testing")
    public void test(HttpServletResponse response) throws IOException {

        // I want to display the website name to my website views
        response.getWriter().write("The old website name: " + myBean.getWebsiteName() + "<br>");
        myBean.setWebsiteName("Kwawingu Updated!!!");
        response.getWriter().write("The new website name: " + myBean.getWebsiteName() + "<br>");

    }

    @RequestMapping("/testing1")
    public void test1(HttpServletResponse response) throws IOException {

        response.getWriter().write("My website name is: " + myBean.getWebsiteName() + "<br>");

    }
}
