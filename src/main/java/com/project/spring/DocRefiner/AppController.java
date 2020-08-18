package com.project.spring.DocRefiner;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AppController
{
  @Resource
  private String someDummyBean1;
  @Resource
  private String someDummyBean2;
  @Resource
  private String xmlStringBean1;
  @Resource
  private String xmlStringBean2;

  @RequestMapping("")
  public ModelAndView index()
  {
    System.out.println(someDummyBean1);
    System.out.println(someDummyBean2);
    System.out.println(xmlStringBean1);
    System.out.println(xmlStringBean2);
    return new ModelAndView("/index");
  }
}
