package clock.ClockComponents;
import org.springframework.stereotype.Component;


public class Clock {
   private double days;
   private double hours;
   private double minutes;
   private double seconds;
   private double lateSeconds;
   private String dayString;



   public void setHours(long t){
       this.hours=(t/1000/60/60)%24;
   }
    public double getHours(){
        return hours;
    }

    public void setMinutes(long t){
        this.minutes = ((t/1000)/60)%60;
    }
    public double getMinutes(){
        return minutes;
    }

    public void setSeconds(long t){
        this.seconds= (t/1000)%60;
    }
    public double getSeconds(){
       return seconds;
    }

    public void setLateSeconds(){
        this.lateSeconds= getSeconds() +1;
    }
    public double getLateSeconds(){
        return lateSeconds;
    }
}
