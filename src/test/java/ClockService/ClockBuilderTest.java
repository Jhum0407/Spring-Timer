package ClockService;

import clock.ClockComponents.Clock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClockBuilderTest {
   Clock builder;
    long milliseconds;
    @Before
    public void setUp(){
        builder= new Clock();
        builder.setSeconds(11430000);
        builder.setHours(11430000);
        builder.setMinutes(11430000);
    }


    @Test
    public void getHours() throws Exception {

        assertEquals(3,builder.getHours(),0);
    }

    @Test
    public void getMinutes() throws Exception {

        assertEquals(10,builder.getMinutes(),0);
    }

    @Test
    public void getSeconds() throws Exception {

        assertEquals(30, builder.getSeconds(),0);
    }


    @Test
    public void getString() throws Exception {
    }

}