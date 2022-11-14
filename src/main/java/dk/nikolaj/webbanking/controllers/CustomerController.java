package dk.nikolaj.webbanking.controllers;

import dk.nikolaj.webbanking.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @RequestMapping({"/customers", "customers/index", "/customers/index.html"})
    public String listCustomers(Model model){

        model.addAttribute("customers", customerService.findAll());

        return "customers/index";
    }
}
