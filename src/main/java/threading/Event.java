package threading;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;


public class Event extends ApplicationEvent
{
    private String message;
    private static AtomicInteger counter = new AtomicInteger();

    public Event(String source) {
        super(source);
        this.message=generator(source);
    }

    public String getMessage() {
        return message;
    }

    private String generator(String message){
        StringBuilder builder = new StringBuilder();
        builder.append(" | Info | ")
                .append(Calendar.getInstance().getTime())
                .append(" | ")
                .append(" squence | ")
                .append(counter.getAndIncrement())
                .append(" # ")
                .append(message);
        return builder.toString();
    }
}
