package clock.ClockComponents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class ClockConverter {

    Clock clock = new Clock();


    public void buildClock(long time){
        if(isTimeRemaining(time)) {
            clock.setHours(time);
            clock.setMinutes(time);
            clock.setSeconds(time);
            clock.setLateSeconds();
        }
        else{
            clock.setHours(0);
            clock.setMinutes(0);
            clock.setSeconds(0);
            clock.setLateSeconds();
        }
    }

    public Clock getClock() {
        return clock;
    }

    public Boolean isTimeRemaining(long time){
        if (time<0){
            return false;
        }
        return true;
    }


    public String ConvertTimeToString(double time){
        if(time<10){
            return "0"+ (int)time;
        }
        return ""+(int)time;

    }
}
