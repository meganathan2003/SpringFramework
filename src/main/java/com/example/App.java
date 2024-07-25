package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // But here we want to use the spring framework using external lib
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // This line is creating a new obj for you
        
        Laptop obj = (Laptop) context.getBean("laptop"); // You need to give me the samll case
//        obj.code();
//        System.out.println(obj);
    }
}
