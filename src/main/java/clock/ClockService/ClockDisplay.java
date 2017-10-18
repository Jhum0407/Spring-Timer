package clock.ClockService;
import clock.ClockComponents.Clock;
import clock.ClockComponents.ClockConverter;
import clock.ClockComponents.Duration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.text.ParseException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

@Service
public class
ClockDisplay {
    @Autowired
    ClockConverter converter;
    @Autowired
    Duration duration;

    public ClockDisplay() {

    }


    public String convertTime(double amount) {
        return converter.ConvertTimeToString(amount);
    }


    public String generateRemainingTime(String time) {
        if (converter.isTimeRemaining(duration.getDuration(time))) {
            converter.buildClock(duration.getDuration(time));
            return convertTime(converter.getClock().getHours()) + " : " + convertTime(converter.getClock().getMinutes())
                    + " : " + convertTime(converter.getClock().getSeconds());
        }
        return "";
    }

    @Async
    public String generateRemainingTimeAsync(String time) throws InterruptedException, ParseException, ExecutionException {
        CompletableFuture<String> alreadyCompleted = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                return generateRemainingTime(time);
            }
        });
        CompletableFuture<String> timeDisplay = alreadyCompleted.thenApply(clock ->{
                            return clock;
        });
        System.out.println(timeDisplay.get());
      return timeDisplay.get();
    }
}



