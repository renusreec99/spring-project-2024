package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address ) {};
record Address(String firstline, String city) {};

@Configuration
public class HelloWorldConfiguration {

  
  @Bean
  public String name() {
    return "Renusree";
  }
  
  @Bean
  public int age() {
    return 24;
  }
  
  @Bean
  public Person person() {
    var person = new Person("Sush",25 , new Address("Monroe street", "Monroe"));
    return person;
  }
  
  @Bean(name = "address2")
  @Primary
  public Address address() {
    var address = new Address("19 Dalrymple St","Boston");
    return address;
  }
  @Bean(name = "address3")
  @Qualifier
  public Address address3() {
    var address = new Address("Thirumala Nagar","Benagluru");
    return address;
  }
  @Bean
  public Person person2MethodCall() {
    var person = new Person(name(),age(),address());
    return person;
  }
  @Bean
  public Person person3Parameters(String name, int age, Address address3) {
    var person = new Person(name,age,address3);
    return person;
  }
  @Bean
  @Qualifier("address3Qualifer")
  public Person person5Qualifier(String name, int age, Address address3) {
    var person = new Person(name,age,address3);
    return person;
  }
  
  @Bean
  @Primary
  public Person person4Parameters(String name, int age, Address address) {
    return new Person(name,age,address);
   
  }
}
