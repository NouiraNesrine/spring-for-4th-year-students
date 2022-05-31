package org.intellij.myspring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Insects implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("display :" +applicationContext.getDisplayName());
        System.out.println("app name"+applicationContext.getApplicationName());
        System.out.println("start date"+applicationContext.getStartupDate());
    }
}
