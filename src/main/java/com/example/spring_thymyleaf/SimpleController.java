package com.example.spring_thymyleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {
    @GetMapping("/")
    public String getInfo(@RequestParam(value = "name",defaultValue = "Przemysław") String name,
                          @RequestParam(value = "surname",defaultValue = "Stokłosa") String surname,
                          Model model){
        model.addAttribute("name",name);
        model.addAttribute("surname",surname);
        return "simplecontroller";
    }
}
