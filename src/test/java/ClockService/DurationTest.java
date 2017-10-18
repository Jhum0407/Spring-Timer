package ClockService;

import clock.ClockComponents.Clock;
import clock.ClockComponents.ClockConverter;
import clock.ClockComponents.Duration;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class DurationTest {
    Duration duration;
  ClockConverter converter;

    @Before
    public void setUp() throws ParseException {
        duration=new Duration();
        converter= new ClockConverter();
        converter.buildClock(duration.getDuration("2017-10-18 22:59:00"));
    }
    @Test
    public void getDuration() throws Exception {

        assertEquals(28, converter.getClock().getMinutes(),0);
    }
    @Test
    public void getDuration2() throws Exception {

        assertEquals(6,converter.getClock().getHours(),0);
    }

}