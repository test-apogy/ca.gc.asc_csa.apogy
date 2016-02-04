package ca.gc.asc_csa.apogy.common.topology.ui;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;

public class AdapterFactory<S extends ObjectAdapter<T, V, U>, T, V, U> {

	private boolean verbose = false;

	private List<S> adapters;
	private List<Class<?>> classes;
	private Map<Class<?>, S> classesToAdapterMap;

	/**
	 * 
	 * @param adapters
	 */
	public AdapterFactory(List<S> adapters) {
		this.adapters = adapters;
	}

	private List<Class<?>> getClasses() 
	{

		if (classes == null) {

			classes = new ArrayList<Class<?>>();

			// We get the registered adapters.
			Iterator<S> iterator = adapters.iterator();

			while (iterator.hasNext()) 
			{
				S adapter = iterator.next();

				getClassesToAdapterMap().put(adapter.getAdaptedClass(), adapter);

				classes.add(adapter.getAdaptedClass());

			}
		}

		return classes;
	}

	private Map<Class<?>, S> getClassesToAdapterMap() 
	{

		if (classesToAdapterMap == null) {

			classesToAdapterMap = new HashMap<Class<?>, S>();
		}

		return classesToAdapterMap;
	}

	/**
	 * Retrieves the appropriate adapter for node 'node'.
	 * 
	 * @param obj
	 *            the object we wish to get the adapter.
	 * @return the appropriate adapter for node 'node' or <code>null</code> if
	 *         none is found.
	 */
	public synchronized S getAdapterFor(V obj) 
	{	
		S adapter = null;

		// We go through all the classes.
		Iterator<Class<?>> iterator = getClasses().iterator();

		Object nodeContent = null;

		if (obj instanceof ContentNode<?>) 
		{
			ContentNode<?> cNode = (ContentNode<?>) obj;
			nodeContent = cNode.getContent();
		} 
		else 
		{
			nodeContent = obj;
		}

		try 
		{
			if (nodeContent != null) 
			{
				if (isVerbose()) 
				{
					for (Class<?> value : getClasses()) 
					{
						System.out.println(value.getName());
					}
				}

				Class<?> closestMatch = null;

				while (iterator.hasNext()) 
				{
					Class<?> c = iterator.next();
									
					
					// If c is a super class or interface of aClass
					if (c.isAssignableFrom(nodeContent.getClass())) 
					{
						if(isVerbose()) System.out.println("\t Found potential match with : " + c.getCanonicalName());
						
						
						// If no match found yet or the current match is a superclass of the current one.
						if ((closestMatch == null) || (closestMatch.isAssignableFrom(c))) 
						{
							closestMatch = c;
						} 
					}
				}

				if(isVerbose()) System.out.println("Closest Match : " + closestMatch);
				
				
				adapter = getClassesToAdapterMap().get(closestMatch);
			}
		} 
		catch (IllegalArgumentException e) 
		{ 
			// Multiple-inheritance is not acceptable !!!
			String message = "Multiple adapters found for <" + obj.getClass().getName() + "> !";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);	
		}

		if (adapter == null) 
		{
			String message = "Cannot find an adapter for object of type <" + obj.getClass().getName() + ">!";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);						
		} 
		else 
		{
			String message = "Using adapter <" + adapter.getClass().getName() + "> for class <" + obj.getClass().getName() + ">";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);		
		}

		return adapter;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public boolean isVerbose() {
		return verbose;
	}
}
