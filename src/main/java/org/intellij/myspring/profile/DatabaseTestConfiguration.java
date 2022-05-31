package org.intellij.myspring.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class DatabaseTestConfiguration implements IDatabaseConfiguration{
    @Override
    public void doSetup() {
        System.out.println("test db conf");
    }
}
