package org.intellij.myspring.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.intellij.myspring.lifecycle")
public class FileConfiguration {



    public FileContext fileContext(){
        return new FileContext();
    }
}
