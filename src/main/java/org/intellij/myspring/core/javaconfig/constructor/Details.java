package org.intellij.myspring.core.javaconfig.constructor;

import java.util.Properties;

public abstract class Details {

    private Properties details;

    public Properties getDetails() {
        return details;
    }

    public void setDetails(Properties details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Details{" +
                "details=" + details +
                '}';
    }
}
