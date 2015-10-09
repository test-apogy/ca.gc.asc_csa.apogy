package org.eclipse.symphony.common.emf;

import java.util.Comparator;

import org.eclipse.symphony.common.emf.Timed;

public class TimedComparator implements Comparator<Timed> 
{
	public TimedComparator() {	
	}
	
	@Override
	public int compare(Timed arg0, Timed arg1) 
	{
		long t1 = arg0.getTime().getTime();
		long t2 = arg1.getTime().getTime();
		
		if(t1 < t2)
		{
			return -1;
		}
		else if(t1 > t2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
