package ca.gc.asc_csa.eclipse.ros.utilities;

import java.util.Date;

public class RosMessageUtils 
{

	/**
	 * Converts a ROS Header Time to a Date.
	 * @param time The ROS Time.
	 * @return The associated Date.
	 */
	public static Date convertToDate(org.ros.message.Time time)
	{
		long milliseconds = Math.round(time.totalNsecs() * 0.001); 
		return new Date(milliseconds);
	}
}
