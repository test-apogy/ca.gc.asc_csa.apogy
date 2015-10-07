package org.eclipse.symphony.core.recordings;

import ca.gc.asc_csa.eclipse.emf.ecore.TimedComparator;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult;

public class AbstractResultTimeComparator implements java.util.Comparator<AbstractResult>
{
	protected TimedComparator timedComparator = new TimedComparator();
	
	protected boolean increasingOrder = true;
	
	public AbstractResultTimeComparator() 
	{	
	}
	
	public AbstractResultTimeComparator(boolean increasingOrder) 
	{	
		this.increasingOrder = increasingOrder;
	}
	
	@Override
	public int compare(AbstractResult o1, AbstractResult o2) 
	{
		int value = timedComparator.compare(o1, o2);
		
		if(value == 0)
		{						
			value = o1.hashCode() - o2.hashCode();
		}
		
		// Invert result if not increasing order.
		if(!increasingOrder)
		{
			if(value < 0)
			{
				value = 1;
			}
			else if(value > 0)
			{
				value = -1;
			}
		}
			
		return value;
	}
}
