package com.example;

import com.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {


//        Java based config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        Alien obj1 = (Alien) context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();


//        Desktop dt = context.getBean("com2",Desktop.class);
//        dt.compile();










        /**
         * Below the code for xml config in spring
         * Framework
         *
         */

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  // create a container
//        Alien obj1 = (Alien) context.getBean("alien");
//    	obj1.setAge(21);
//        System.out.println(obj1.getAge());
//
//        obj1.code();
////
////    	Alien obj2 = (Alien) context.getBean("alien1");
////    	System.out.println(obj2.age);
////    	//obj2.code();

    }
}