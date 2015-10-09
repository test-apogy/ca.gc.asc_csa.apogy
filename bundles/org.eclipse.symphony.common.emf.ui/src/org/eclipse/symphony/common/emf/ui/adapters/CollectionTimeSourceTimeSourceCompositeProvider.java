package org.eclipse.symphony.common.emf.ui.adapters;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.emf.ui.TimeSourceCompositeProvider;
import org.eclipse.symphony.common.emf.ui.composites.AbstractTimeSourceComposite;
import org.eclipse.symphony.common.emf.ui.composites.CollectionTimedTimeSourceComposite;

import ca.gc.asc_csa.eclipse.emf.ecore.CollectionTimedTimeSource;

public class CollectionTimeSourceTimeSourceCompositeProvider implements	TimeSourceCompositeProvider<CollectionTimedTimeSource> 
{
	@Override
	public boolean isAdapterFor(CollectionTimedTimeSource obj) 
	{
		return obj instanceof CollectionTimedTimeSource;
	}

	@Override
	public AbstractTimeSourceComposite getComposite(Composite parent, int style, CollectionTimedTimeSource obj) 
	{
		if(isAdapterFor(obj))
		{
			return new CollectionTimedTimeSourceComposite(parent, style, obj);
		}
		else
		{
			return null;
		}
	}

	@Override
	public Class<?> getAdaptedClass() {
		return CollectionTimedTimeSource.class;
	}
}
