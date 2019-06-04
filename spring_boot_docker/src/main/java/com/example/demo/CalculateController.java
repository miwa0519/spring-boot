package com.example.demo;
import com.example.demo.model.Form;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class CalculateController {
  @RequestMapping("/calculate")
  public String form(Model model){
    model.addAttribute("form", new Form());
    return "index";
  }

  @RequestMapping(value="/result", method = RequestMethod.POST)
  public String result(@ModelAttribute Form form, Model model){
    form.sumTotal();
    model.addAttribute("form", form);
    return "result";
  }
}