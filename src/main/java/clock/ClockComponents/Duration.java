package clock.ClockComponents;
import org.springframework.stereotype.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Duration {
    long milliseconds;

    public long getDuration(String date){

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            milliseconds= dateFormat.parse(date).getTime() - dateFormat.parse(dateFormat.format(new Date())).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return milliseconds;
    }
}
