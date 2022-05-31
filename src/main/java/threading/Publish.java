package threading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Component
public class Publish{//} implements ApplicationEventPublisherAware {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    private static Map<Integer,String> messages = new HashMap<>();

    static {
        messages.put(1,"first message");
        messages.put(2,"2 message");
        messages.put(3,"3 message");
    }


    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
    public void publishMessage(){
        new SimpleAsyncTaskExecutor().execute(()->{
            for(int i=0;i<5;i++){
                int id = new Random().nextInt(5);
                Event ev = new Event("my source");
                applicationEventPublisher.publishEvent(ev);
            }
        });

    }

    public void publishDate(){
        new SimpleAsyncTaskExecutor().execute(()->{
            for(int i=0;i<5;i++){
                int id = new Random().nextInt(5);
                OtherEvent ev = new OtherEvent("seconde source");
                applicationEventPublisher.publishEvent(ev);
            }
        });

    }



}

