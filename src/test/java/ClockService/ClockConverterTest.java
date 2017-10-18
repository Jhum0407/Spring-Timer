package ClockService;

import clock.ClockComponents.Clock;
import clock.ClockComponents.ClockConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ClockConverterTest {
    ClockConverter converter;
  Clock builder;

    @Before
    public void setUp(){
        converter=new ClockConverter();
        builder= new Clock();
        converter.buildClock(11430000);
    }
    @Test
    public void convertTimeToString() throws Exception {
assertEquals("03",converter.ConvertTimeToString(converter.getClock().getHours()));
    }

    @Test
    public void convertTimeToString2() throws Exception {
        assertEquals("10",converter.ConvertTimeToString(converter.getClock().getMinutes()));
    }

}