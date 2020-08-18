package com.project.spring.DocRefiner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AppController
{

  @RequestMapping("")
  public ModelAndView index()
  {
    return new ModelAndView("/index");
  }
}
