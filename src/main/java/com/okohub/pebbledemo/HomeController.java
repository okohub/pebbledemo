package com.okohub.pebbledemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author onurozcan
 */
@Controller
public class HomeController {

  @GetMapping
  public String home(Model model) {
    model.addAttribute("unit", "tank");
    return "home";
  }
}
