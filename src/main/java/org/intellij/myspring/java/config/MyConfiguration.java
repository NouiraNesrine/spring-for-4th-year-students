package org.intellij.myspring.java.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@Import(AdressConfiguration.class)
public class MyConfiguration {

    @Value("#{Adress}")
    private Adress adress;
    @Bean
    @DependsOn({"init"})
    public Person Person(){
        Person p = new Person(1,"nisou","nou",adress);

        return p;
    }

    @Bean
    public Init init(){
        return new Init();
    }



}
