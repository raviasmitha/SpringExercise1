package com.stackroute.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController
{
  @RequestMapping("/")
  public String greet(Model model){
    User u = new User("Asmitha");
    model.addAttribute("name",u.getName());
    return "index";
  }

}

