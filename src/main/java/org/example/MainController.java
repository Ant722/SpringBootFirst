package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.crypto.Data;
import java.util.Date;

@Controller
public class MainController {

    @GetMapping("/greeting") //http://localhost:8080/greeting
    public String greeting(@RequestParam(required = false, defaultValue = "World") String name, Model model) {

        model.addAttribute("name", name);
        return "greeting";
    }
    @RequestMapping("/greeting/data")
    public String showData(Model model){

        Date date = new Date();
        model.addAttribute("data", date.toString());

        return "data";
    }
}
