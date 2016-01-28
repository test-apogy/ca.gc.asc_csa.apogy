package ca.gc.asc_csa.apogy.common.converters.ui.utils;

import java.util.Comparator;

public class FullyQualifiedTypesNameComparator implements Comparator <Class<?>>{

	@Override
	public int compare(Class<?> o1, Class<?> o2) 
	{
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);
	}

}
