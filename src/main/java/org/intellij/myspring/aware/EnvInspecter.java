package org.intellij.myspring.aware;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvInspecter implements EnvironmentAware {
    @Override
    public void setEnvironment(Environment environment) {
        System.out.println(environment.getProperty("nisou"));
    }
}
