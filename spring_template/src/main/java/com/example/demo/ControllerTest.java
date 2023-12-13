package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTest {

    @GetMapping("/test")
    public String test_metode(Model model) {
        String item = "Dette er en eksempeltekst for item.";
        model.addAttribute("item", item);
        return "tester";
    }
	
}
