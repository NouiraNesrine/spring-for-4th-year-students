package threading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.support.TaskExecutorAdapter;
import org.springframework.stereotype.Component;

public class MyMain {

    public static void main(String[] args) {
        ApplicationContext ct = new AnnotationConfigApplicationContext(Conf.class);
        ct.getBean(Publish.class).publishMessage();
        ct.getBean(Publish.class).publishDate();
    }


}

