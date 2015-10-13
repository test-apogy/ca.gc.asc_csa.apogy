package org.eclipse.symphony.common.emf.ui.adapters;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.emf.FixedTimeSource;
import org.eclipse.symphony.common.emf.ui.TimeSourceCompositeProvider;
import org.eclipse.symphony.common.emf.ui.composites.AbstractTimeSourceComposite;
import org.eclipse.symphony.common.emf.ui.composites.FixedTimeSourceComposite;

public class FixedTimeSourceTimeSourceCompositeProvider implements TimeSourceCompositeProvider<FixedTimeSource> 
{
	@Override
	public boolean isAdapterFor(FixedTimeSource obj) 
	{
		return obj instanceof FixedTimeSource;
	}

	@Override
	public AbstractTimeSourceComposite getComposite(Composite parent, int style, FixedTimeSource obj) 
	{
		if(isAdapterFor(obj))
		{
			return new FixedTimeSourceComposite(parent, style, obj);
		}
		else
		{
			return null;
		}
	}

	@Override
	public Class<?> getAdaptedClass() 
	{
		return FixedTimeSource.class;
	}
}
