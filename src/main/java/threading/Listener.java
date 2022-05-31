package threading;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener { //implements ApplicationListener<Event> {
    @EventListener
    public void onApplicationEvent(Event event) {
        System.out.println(event.getSource());
        System.out.println(event.getMessage());
        System.out.println(event.getTimestamp());
    }

    @EventListener
    public void onApplicationEvent(OtherEvent event) {
        System.out.println(event.getSource());
        System.out.println(event.getDate());
        System.out.println(event.getTimestamp());
    }
}
