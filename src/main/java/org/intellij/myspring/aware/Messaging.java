package org.intellij.myspring.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

import java.util.Locale;

public class Messaging implements MessageSourceAware {
    @Override
    public void setMessageSource(MessageSource messageSource) {
        System.out.println(messageSource.getMessage("welcome",null,Locale.FRENCH));
    }
}
