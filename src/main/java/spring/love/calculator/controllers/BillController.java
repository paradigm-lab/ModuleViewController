package spring.love.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BillController {

    @RequestMapping("/bill")
    public String showBillPage() {

        return "bill-payment.jsp";
    }

}
