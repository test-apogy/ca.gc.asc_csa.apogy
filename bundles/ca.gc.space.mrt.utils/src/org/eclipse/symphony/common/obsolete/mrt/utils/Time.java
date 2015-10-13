package org.eclipse.symphony.common.obsolete.mrt.utils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;



/**
 * This class provides basic time functionality, such as, a sleep function, and a timer.
 * 
 * <PRE>
 * 
 * $Revision: 1.2.4.2 $
 * 15-Sep-06
 * 
 * Mobile Robotics Testbed (MRT).
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Qu?bec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE>
 * @author yiannis
 *
 */

public class Time {
	
	private static long startTime=0;
	/**
	 * Function that starts a timer.
	 * Repeat calls of this function would simply restart the same timer
	 *
	 */
	public void Start() {
		startTime=System.currentTimeMillis();
	}
	
	/**
	 * Return the amount of time it has passed in miliseconds since Start was called.
	 * @return the time since Start was called. 
	 */
	public long Duration() {
		return (System.currentTimeMillis()-startTime);
	}
	/**
	 * Return the amount of time it has passed in miliseconds since Start was called, 
	 * and resets the current time.
	 * @return the time since Start was called. 
	 */
	public long Stop() {
		long oldStart=startTime;
		startTime=System.currentTimeMillis();
		return (startTime-oldStart);
	}
	
	/**
	 * Function that sleeps for the duration of "duration" milisec.
	 * @param duration
	 */
	public static void sleep(int duration) {
		 try {
	            Thread.sleep(duration);
	        } catch (java.lang.InterruptedException ie) {}
	}
	
	public static String GetCurrentDateFormated(String format){
	    Calendar cal = Calendar.getInstance(TimeZone.getDefault());
	    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(format, new Locale("en","CA"));
	   
	    // Create the formatter object
	    sdf.setTimeZone(TimeZone.getDefault());
	    
	    // Return the formated string
	    return sdf.format(cal.getTime());
	}
	
	public static Date GetDateFromFormatedString(String format, String date) throws ParseException
	{
	    // Create the formatter object
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(format, new Locale("en","CA"));
	    //System.out.println(sdf.getAvailableLocales().length);
	  
	    // Parse the formatted string
	    return sdf.parse(date);
	}
	
	public static String GetDateFormated(String format, Date date){
	    Calendar cal = Calendar.getInstance(TimeZone.getDefault());
	    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(format, new Locale("en","CA"));
	   
	    // Create the formatter object
	    sdf.setTimeZone(TimeZone.getDefault());
	    
	    // Return the formated string
	    return sdf.format(date);
	}
}
