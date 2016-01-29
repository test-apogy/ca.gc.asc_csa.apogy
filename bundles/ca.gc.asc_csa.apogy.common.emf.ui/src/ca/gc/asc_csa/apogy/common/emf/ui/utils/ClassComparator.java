package ca.gc.asc_csa.apogy.common.emf.ui.utils;

import java.util.Comparator;

public class ClassComparator implements Comparator<Class<?>> {

	@Override
	public int compare(Class<?> o1, Class<?> o2) 
	{
		if (o1.isAssignableFrom(o2)) 
		{
			return 1;
		} 
		else if (o2.isAssignableFrom(o1)) 
		{
			return -1;
		} 
		else 
		{
			String o1Name = o1.getName();
			String o2Name = o2.getName();
			return o1Name.compareTo(o2Name);
		}
	}
}
