package com.example.spring_thymyleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {
    @GetMapping("/")
    public String getInfo(@RequestParam(value = "param1",defaultValue = "param1") String param1,
                          @RequestParam(value = "name",defaultValue = "Przemyslaw") String name,
                          Model model){
        model.addAttribute("param1",param1);
        model.addAttribute("name",name);
        return "simplecontroller";
    }
}
