package org.intellij.myspring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class FileContext implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof FileContext){
        System.out.println("postProcessBeforeInitialization :"+bean.getClass());
        System.out.println("postProcessBeforeInitialization :"+beanName);
        System.out.println("---");}
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization :"+bean.getClass());
        System.out.println("postProcessAfterInitialization :"+beanName);
        System.out.println("---");
        return bean;
    }

    @PostConstruct
    public void init(){
        System.out.println("File handler init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("File handler destroyed");
    }

    public void readFile(){
        System.out.println("reading File");
    }
}

