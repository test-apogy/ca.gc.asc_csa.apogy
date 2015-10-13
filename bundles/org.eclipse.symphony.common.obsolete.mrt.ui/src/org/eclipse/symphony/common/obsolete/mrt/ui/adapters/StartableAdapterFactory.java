package org.eclipse.symphony.common.obsolete.mrt.ui.adapters;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.symphony.common.obsolete.mrt.Startable;
import org.eclipse.ui.IActionFilter;

public class StartableAdapterFactory implements IAdapterFactory
{
	private IActionFilter startableActionFilter;	

	public StartableAdapterFactory()
	{
		System.err.println("StartableAdapterFactory.StartableAdapterFactory()");
	}
	
	private IActionFilter getStartableActionFilter(){					
		if (startableActionFilter == null){
			startableActionFilter = new IActionFilter()
			{				
				public boolean testAttribute(Object target, String name, String value) 
				{
					Startable startable = (Startable) target;
					
					// System.out.println("name " + name + " value" + value + " target " + startable.isStarted());
					
					if (name.equals("isStarted"))
					{																
						if (value.equals("true"))
						{
							return startable.isStarted();
						}
						else if (value.equals("false"))
						{
							return !startable.isStarted();
						}				
					}										
					return false;
				}				
			};
		}				
		
		return startableActionFilter;
	}
	
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Object adaptableObject, Class adapterType)
	{
		if (adapterType == IActionFilter.class && adaptableObject instanceof Startable)
		{
			return getStartableActionFilter();
		}		
		return null;
	}

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList()
	{
		return new Class[] {IActionFilter.class};
	}
}
