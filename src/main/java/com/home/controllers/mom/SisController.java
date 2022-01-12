package com.home.controllers.mom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

    @ResponseBody
    @RequestMapping("/makeup")
    public String getMakeUpKit() {
        return "Just Take my make up kit";
    }

    @ResponseBody
    @RequestMapping("/book")
    public String getBooks() {
        System.out.println("This is getBooks() ...");
        return "Math book";
    }
}
