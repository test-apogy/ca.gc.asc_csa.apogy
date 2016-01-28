package org.eclipse.symphony.common.emf.ui.adapters;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.emf.BrowseableTimeSource;
import org.eclipse.symphony.common.emf.ui.TimeSourceCompositeProvider;
import org.eclipse.symphony.common.emf.ui.composites.AbstractTimeSourceComposite;
import org.eclipse.symphony.common.emf.ui.composites.BrowseableTimeSourceComposite;

public class BrowseableTimeSourceTimeSourceCompositeProvider implements	TimeSourceCompositeProvider<BrowseableTimeSource> 
{
	@Override
	public boolean isAdapterFor(BrowseableTimeSource obj) 
	{
		return obj instanceof BrowseableTimeSource;
	}

	@Override
	public AbstractTimeSourceComposite getComposite(Composite parent, int style, BrowseableTimeSource obj) 
	{
		if(isAdapterFor(obj))
		{
			return new BrowseableTimeSourceComposite(parent, style, obj);
		}
		else
		{
			return null;
		}
	}

	@Override
	public Class<?> getAdaptedClass() {
		return BrowseableTimeSource.class;
	}

}
