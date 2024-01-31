package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

  public static void main(String[] args) {
  //try with resources to fix this
    try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
      System.out.println(context.getBean("name"));
      System.out.println(context.getBean("age"));
      System.out.println(context.getBean("person"));
      System.out.println(context.getBean("address2"));
      System.out.println(context.getBean(Address.class));
      System.out.println(context.getBean("person2MethodCall"));
      System.out.println(context.getBean("person3Parameters"));
      System.out.println(context.getBean("person5Qualifier"));

    }  
   
  }

}
