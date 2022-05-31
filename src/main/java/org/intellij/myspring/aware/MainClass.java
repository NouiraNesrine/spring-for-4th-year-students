package org.intellij.myspring.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

    public static void main(String[] args){
        AnnotationConfigApplicationContext cont = new AnnotationConfigApplicationContext();
        StandardEnvironment env = new StandardEnvironment();
        MutablePropertySources source = env.getPropertySources();
        Map<String,Object> map = new HashMap<>();

        map.put("nisou","nou");
        source.addFirst(new MapPropertySource("mymap",map));
        cont.setEnvironment(env);
        cont.scan("org.intellij.myspring.aware");
        cont.refresh();
    }
}
