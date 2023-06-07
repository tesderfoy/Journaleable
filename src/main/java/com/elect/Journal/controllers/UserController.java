package com.elect.Journal.controllers;


import com.elect.Journal.models.User;
import com.elect.Journal.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private  final UserService userService;
    @GetMapping("/registration")
    public String  registration(){
        return "registration";

    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("registration/teacher")
    public String createTeacher(User user, Model model){
        if(!userService.createTeacher(user)){
            model.addAttribute("errorMessage", "Польльзователь с логином: " +user.getLogin() +" уже существует");
            return  "registration/teacher";
        }

        userService.createTeacher(user);
        return "redirect:/login";
    }
    @PostMapping("registration/student")
    public String createStudent(User user, Model model){
        if(!userService.createTeacher(user)){
            model.addAttribute("errorMessage", "Польльзователь с логином: " +user.getLogin() +" уже существует");
            return  "registration/teacher";
        }
        userService.createTeacher(user);
        return "redirect:/login";
    }
    @GetMapping("hello")
    public  String securityUrl(){
        return "hello";
    }

}
