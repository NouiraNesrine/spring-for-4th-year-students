package org.intellij.myspring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Configuration
@ComponentScan("org.intellij.myspring.java.config")
public class AdressConfiguration {

    @Bean
    @Primary
    public Adress Adress(){
        return new Adress("myst","mycit");
    }

    @Bean
    public Adress Adress1(){
        return new Adress("myst1","mycit1");
    }

    @Bean
    public Adress Adress2(){
        return new Adress("myst2","mycit2");
    }

    public Department getDep() {return new Department();}
}
