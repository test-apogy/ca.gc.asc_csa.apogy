package ca.gc.asc_csa.apogy.common.emf.ui.utils;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import ca.gc.asc_csa.apogy.common.emf.ui.TimeSourceCompositeProvider;

@SuppressWarnings("rawtypes")
public class TimeSourceCompositeProviderFactory {

	/**
	 * This is a sorted map, the keys are sorted from the most to the less
	 * specific.
	 */
	private SortedSet<Class<?>> classes;

	private Map<Class<?>, TimeSourceCompositeProvider> classesToAdapterMap;
	private List<TimeSourceCompositeProvider> adapters;
	
	/**
	 * 
	 * @param adapters
	 */
	public TimeSourceCompositeProviderFactory(List<TimeSourceCompositeProvider> adapters) 
	{
		this.adapters = adapters;
	}

	/**
	 * Retrieves the appropriate adapter for the object
	 * 
	 * @param obj
	 *            the node we wish to get the adapter.
	 * @return the appropriate adapter for node 'node' or <code>null</code> if
	 *         none is found.
	 */
	public TimeSourceCompositeProvider getAdapterFor(Object obj) 
	{
		TimeSourceCompositeProvider adapter = null;

		// We go through all the classes.
		boolean found = false;

		Iterator<Class<?>> iterator = getClasses().iterator();
		while (iterator.hasNext() && !found) 
		{
			Class<?> adaptedClass = iterator.next();

			if (adaptedClass.isAssignableFrom(obj.getClass())) 
			{
				found = true;
				adapter = getClassesToAdapterMap().get(adaptedClass);
			}
		}
		
		return adapter;
	}
	
	private SortedSet<Class<?>> getClasses() 
	{
		classes = new TreeSet<Class<?>>(new ClassComparator());

		// We get the registered adapters.
		Iterator<TimeSourceCompositeProvider> iterator = adapters.iterator();

		while (iterator.hasNext()) 
		{
			TimeSourceCompositeProvider adapter = iterator.next();

			getClassesToAdapterMap().put(adapter.getAdaptedClass(), adapter);

			classes.add(adapter.getAdaptedClass());

		}
	
		return classes;
	}

	private Map<Class<?>, TimeSourceCompositeProvider> getClassesToAdapterMap() 
	{
		if (classesToAdapterMap == null) 
		{
			classesToAdapterMap = new HashMap<Class<?>, TimeSourceCompositeProvider>();
		}

		return classesToAdapterMap;
	}



}
