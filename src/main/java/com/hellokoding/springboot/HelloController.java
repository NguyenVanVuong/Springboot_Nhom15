package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
  //  @RequestMapping("/ICSSE")
 //   public void hello();
  //  {
       // return "ICSSE_2017";
   // }
    @RequestMapping("/ICSSE")
    public String hello2()
    {
        return "ICSSE_2017";
    }
}
