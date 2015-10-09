package org.eclipse.symphony.common.emf.ecore.databinding;

import org.eclipse.core.databinding.observable.value.ValueDiff;

public class DefaultValueDiff extends ValueDiff 
{
	private Object oldValue;
	private Object newValue;
	
	public DefaultValueDiff(Object oldValue, Object newValue)
	{
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	
	@Override
	public Object getOldValue() 
	{	
		return oldValue;
	}
	@Override
	public Object getNewValue() 
	{	
		return newValue;
	}
}
