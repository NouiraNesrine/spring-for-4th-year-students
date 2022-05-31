package threading;

import org.springframework.context.ApplicationEvent;

import java.util.Calendar;
import java.util.Date;

public class OtherEvent extends ApplicationEvent {
    private Date date;
    public OtherEvent(Object source) {
        super(source);
        this.date = Calendar.getInstance().getTime();
    }

    public Date getDate() {
        return date;
    }
}
