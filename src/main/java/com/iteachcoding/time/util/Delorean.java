package com.iteachcoding.time.util;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Test class used to adjust a {@link LocalDate} as needed for Junit tests.
 * @author gandrews
 *
 */
public class Delorean {
	
    private static Clock clock = Clock.systemDefaultZone();
    private static final ZoneId ZONE_ID = ZoneId.systemDefault();
    
    private Delorean() { /* private */ }
    
    /**
     * Returns the {@link LocalDate} local {@link Clock} is set to.
     * @return - the current {@link LocalDate}
     */
    public static LocalDate now() {
        return LocalDate.now(getClock());
    }

    /**
     * Accelerate to 88 miles per hour. 
     * @param date - the {@link LocalDateTime} you wish to travel to.
     */
    public static void drive(final LocalDateTime date){
    	clock = Clock.fixed(date.atZone(ZONE_ID).toInstant(), ZONE_ID);
    }
    
    private static Clock getClock() {
    	return clock ;
    }
    
}
