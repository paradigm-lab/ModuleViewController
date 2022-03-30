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

    @RequestMapping("/testing")
    public void test(HttpServletResponse response) throws IOException {

        // I want to display the website name to my website views
        response.getWriter().write("Cloud Service Provider " + myBean.getWebsiteName() + "<br>");
        myBean.setWebsiteName("Kwawingu Updated!!");
        response.getWriter().write("Cloud Service Provider " + myBean.getWebsiteName() + "<br>");

    }

}
