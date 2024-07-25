package com.example.config;


import com.example.Alien;
import com.example.Computer;
import com.example.Desktop;
import com.example.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    // We can use the bean annotation using name attribute
    // If you want to need multiple name use {} this brackets
    @Bean(name = "com2")
//    @Scope("prototype")
public Desktop desktop(){


    return  new Desktop();
}


@Bean
public Alien alien(Computer com ){

        Alien obj = new Alien();
        obj.setAge(25);
        obj.setComp(com);
    return obj;
}

@Bean
@Primary
public Laptop laptop(){

        return new Laptop();
}



}
