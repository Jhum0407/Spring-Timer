package clock.ClockController;
import clock.ClockService.ClockDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.*;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


@Controller
@EnableAsync
public class ClockController {
    @Autowired
    ClockDisplay display;



    @Async
    @Scheduled(fixedRate = 1000)
    public String showTimeAsync() throws ParseException, InterruptedException, ExecutionException {

        return display.generateRemainingTimeAsync("2017-10-20 7:05:00");
    }









}
