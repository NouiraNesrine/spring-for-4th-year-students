package org.intellij.myspring.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DatabaseDevConfiguration implements IDatabaseConfiguration{
    @Override
    public void doSetup() {
        System.out.println("Dev env db conf");
    }

}
