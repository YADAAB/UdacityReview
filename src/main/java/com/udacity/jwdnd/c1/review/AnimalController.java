package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;

@Controller
public class AnimalController {

    private AnimalGreeting ag;
    public AnimalController(AnimalGreeting ag) {
        this.ag = ag;
    }

    @GetMapping("/greeting")
    public String getGreeting(@ModelAttribute("newgreeting") MessageForm messageform, Model model)
    {
        model.addAttribute("greetings", ag.getGreetings());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String addGreeting(@ModelAttribute("newgreeting") MessageForm messageform, Model model)
    {
        ag.addGreetings(messageform.getAnimalName(), messageform.getAdjective());
        model.addAttribute("greetings", ag.getGreetings());
        messageform.setAdjective("");
        messageform.setAnimalName("");
        return "greeting";
    }


}
