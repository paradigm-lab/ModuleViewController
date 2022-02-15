package spring.love.calculator.controllers;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.love.calculator.api.BillDTO;
import spring.love.calculator.formatter.billFormatter;
import spring.love.calculator.propertyeditor.MyCurrencyEditor;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;

@Controller
public class BillController {

    @RequestMapping("/bill")
    public String showBillPage(@ModelAttribute("userBill") BillDTO billDTO) {

        return "bill-payment";
    }

    @RequestMapping("/bill-successfully")
    public String showPaymentSuccessfully(@Valid @ModelAttribute("userBill") BillDTO billDTO, BindingResult result) {

        if (result.hasErrors()) {
            return "bill-payment";
        }

        return "bill-successfully";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {

        // Editor for the date field
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        CustomDateEditor customDateEditor = new CustomDateEditor(dateFormat, true);
        binder.registerCustomEditor(Date.class, "date", customDateEditor);

        // Register a custom editor for the amount field
        NumberFormat numberFormat = new DecimalFormat("##,###.00");
        CustomNumberEditor customNumberEditor = new CustomNumberEditor(BigDecimal.class, numberFormat, true);
        binder.registerCustomEditor(BigDecimal.class, "amount", customNumberEditor);

        // Register a custom editor for the currency
        MyCurrencyEditor myCurrencyEditor = new MyCurrencyEditor();
        binder.registerCustomEditor(Currency.class, "currency", myCurrencyEditor);

        // Adding a custom formatter
        binder.addCustomFormatter(new billFormatter());
    }
}
