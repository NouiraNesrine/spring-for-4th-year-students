package threading;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.support.TaskExecutorAdapter;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Configuration
@ComponentScan
public class SpringTaskExecutor {

    @Bean
    public SimpleAsyncTaskExecutor simpleAsyncTaskExecutor(){
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public SyncTaskExecutor syncTaskExecutor(){
        return new SyncTaskExecutor();
    }
    @Bean
    public TaskExecutorAdapter tskExecutorAdapter(){
        return new TaskExecutorAdapter(Executors.newFixedThreadPool(3));
    }






}
