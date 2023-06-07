package com.elect.Journal.controllers;


import ch.qos.logback.core.model.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AdministrationController {
    private  final AdministrationController administrationController;
@GetMapping("/")
    public String administration(Model model){
    return "administration";
}

}
