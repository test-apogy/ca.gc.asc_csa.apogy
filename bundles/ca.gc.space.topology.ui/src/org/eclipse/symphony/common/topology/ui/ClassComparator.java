package org.eclipse.symphony.common.topology.ui;

import java.util.Comparator;

public class ClassComparator implements Comparator<Class<?>> {

	@Override
	public int compare(Class<?> o1, Class<?> o2) {

		if (o1.isAssignableFrom(o2)) {
			return 1;
		} else if (o2.isAssignableFrom(o1)) {
			return -1;
		} else {
			return 1;
		}
	}

}
