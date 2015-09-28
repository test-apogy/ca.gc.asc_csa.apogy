package ca.gc.asc_csa.eclipse.converters.ui.utils;

import java.util.Comparator;

public class ShortTypesNameComparator implements Comparator <Class<?>>{

	@Override
	public int compare(Class<?> o1, Class<?> o2) 
	{
		String name1 = o1.getSimpleName();
		String name2 = o2.getSimpleName();
		return name1.compareTo(name2);
	}

}
