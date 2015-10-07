package org.eclipse.symphony.core.recordings.csv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.invocator.Activator;

public class CSVAdaptersRegistry 
{
	public static final String CSV_ADAPTER_POINT_ID = "org.eclipse.symphony.core.recordings.CSVAdapter";
	public static final String CSV_ADAPTER_POINT_ID_CLASS = "Class";
	
	private static CSVAdaptersRegistry instance = null;
	
	private List<CSVAdapter> csvAdapters;
	private List<Class<?>> classes;
	private Map<Class<?>, CSVAdapter> classesToAdapterMap;
	
	private CSVAdaptersRegistry()
	{		
	}
	
	public static CSVAdaptersRegistry getInstance()
	{
		if(instance == null)
		{
			instance = new CSVAdaptersRegistry();
		}
		
		return instance;
	}
	
	public CSVAdapter getCSVAdapter(Class<?> clazz)
	{
		if(clazz != null)
		{
			CSVAdapter csvAdapter = null;
			if(clazz != null)
			{
				Class<?> closestMatch = null;
	
				Iterator<Class<?>> iterator = getClasses().iterator();
				while (iterator.hasNext()) 
				{
					Class<?> c = iterator.next();
	
					if(c != null)
					{
						// If c is a super class or interface of aClass
						if (c.isAssignableFrom(clazz)) 
						{
							// If no match found yet or the current match is a
							// superclass of the current one.
							if ((closestMatch == null) || (closestMatch.isAssignableFrom(c))) 
							{
								closestMatch = c;
							} 
							else if (!c.isAssignableFrom(closestMatch)) 
							{
								throw new IllegalArgumentException("Cannot determine appropriate CSVAdapter!");
							}
						}
					}
				}
	
				csvAdapter = getClassesToAdapterMap().get(closestMatch);
			}
			
			return csvAdapter;
		}
		else
		{
			return null;
		}
	}
	
	public CSVAdapter getCSVAdapter(Object object)
	{
		CSVAdapter csvAdapter = null;
		if(object != null)
		{			
			Class<?> closestMatch = null;
	
				Iterator<Class<?>> iterator = getClasses().iterator();
				while (iterator.hasNext()) 
				{
					Class<?> c = iterator.next();
	
					if(c != null)
					{
						// If c is a super class or interface of aClass
						if (c.isAssignableFrom(object.getClass())) 
						{
							// If no match found yet or the current match is a
							// superclass of the current one.
							if ((closestMatch == null) || (closestMatch.isAssignableFrom(c))) 
							{
								closestMatch = c;
							} 
							else if (!c.isAssignableFrom(closestMatch)) 
							{
								throw new IllegalArgumentException("Cannot determine appropriate CSVAdapter!");
							}
						}
					}
	
				}
	
				csvAdapter = getClassesToAdapterMap().get(closestMatch);
		}		
		return csvAdapter;
	}
	
	public Map<Class<?>, CSVAdapter> getClassesToAdapterMap() 
	{
		if (classesToAdapterMap == null) 
		{

			classesToAdapterMap = new HashMap<Class<?>, CSVAdapter>();
		}

		return classesToAdapterMap;
	}
	
	public List<CSVAdapter> getRegisteredCSVAdapters()
	{
		if(csvAdapters == null)
		{
			csvAdapters = new ArrayList<CSVAdapter>();
					
			IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(CSV_ADAPTER_POINT_ID);

			IConfigurationElement[] contributors = extensionPoint.getConfigurationElements();

			for (int i = 0; i < contributors.length; i++) 
			{
				IConfigurationElement contributor = contributors[i];

				try 
				{
					CSVAdapter delegate = (CSVAdapter) contributor.createExecutableExtension(CSV_ADAPTER_POINT_ID_CLASS);
					csvAdapters.add(delegate);
					Logger.INSTANCE.log(Activator.ID, this, "Loaded CSVAdapter <" + delegate.getClass().getName() + ">", EventSeverity.INFO);								
				} 
				catch (CoreException e) 
				{
					e.printStackTrace();
					Logger.INSTANCE.log(Activator.ID, this, "Failed to load contributed CSVAdapter from <" + contributor.getContributor().getName() + ">", EventSeverity.ERROR, e);
				}
			}
			
			Logger.INSTANCE.log(Activator.ID, this, "Loaded  <" + csvAdapters.size() + "> CSVAdapter(s).", EventSeverity.INFO);			
		}
		
		return csvAdapters;
	}
	
	public List<Class<?>> getClasses() 
	{
		if (classes == null) {

			classes = new ArrayList<Class<?>>();

			// We get the registered adapters.
			Iterator<CSVAdapter> iterator = getRegisteredCSVAdapters().iterator();

			while (iterator.hasNext()) 
			{
				CSVAdapter delegate = iterator.next();

				getClassesToAdapterMap().put(delegate.getHandledClass(), delegate);

				classes.add(delegate.getHandledClass());
			}
		}

		return classes;
	}
	
	public int getNumberOfColumns(Object object)
	{
		int numberOfColumns = -1;
		CSVAdapter csvAdapter = getCSVAdapter(object);		
		if(csvAdapter != null)
		{
			numberOfColumns = csvAdapter.getNumberOfColumns(object.getClass());
		}
		
		return numberOfColumns;
	}
	
	public int getNumberOfColumns(Class<?> clazz)
	{
		int numberOfColumns = -1;
		CSVAdapter csvAdapter = getCSVAdapter(clazz);		
		if(csvAdapter != null)
		{
			numberOfColumns = csvAdapter.getNumberOfColumns(clazz);
		}
		
		return numberOfColumns;
	}
	
	public List<String> getTitleColumns(Class<?> clazz)
	{		
		CSVAdapter csvAdapter = getCSVAdapter(clazz);		
		if(csvAdapter != null)
		{
			return csvAdapter.getTitleColumns(clazz);
		}
		else
		{
			return new ArrayList<String>();
		}
	}
	
	public List<String> getValueColumns(Object object)
	{
		CSVAdapter csvAdapter = getCSVAdapter(object);		
		if(csvAdapter != null)
		{
			return csvAdapter.getValueColumns(object);
		}
		else
		{
			return new ArrayList<String>();
		}
	}
}
