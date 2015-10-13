package org.eclipse.symphony.common.emf.ui.adapters;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.emf.CurrentTimeSource;
import org.eclipse.symphony.common.emf.ui.TimeSourceCompositeProvider;
import org.eclipse.symphony.common.emf.ui.composites.AbstractTimeSourceComposite;
import org.eclipse.symphony.common.emf.ui.composites.CurrentTimeSourceComposite;

public class CurrentTimeSourceTimeSourceCompositeProvider implements TimeSourceCompositeProvider<CurrentTimeSource> 
{
	@Override
	public boolean isAdapterFor(CurrentTimeSource obj) 
	{
		return obj instanceof CurrentTimeSource;
	}

	@Override
	public AbstractTimeSourceComposite getComposite(Composite parent, int style, CurrentTimeSource obj) 
	{
		if(isAdapterFor(obj))
		{
			return new CurrentTimeSourceComposite(parent, style, obj);
		}
		else
		{
			return null;
		}
	}

	@Override
	public Class<?> getAdaptedClass() 
	{
		return CurrentTimeSource.class;
	}
}
