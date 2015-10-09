package org.eclipse.symphony.common.emf.ui.adapters;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.emf.ui.TimeSourceCompositeProvider;
import org.eclipse.symphony.common.emf.ui.composites.AbstractTimeSourceComposite;
import org.eclipse.symphony.common.emf.ui.composites.SelectionBasedTimeSourceComposite;

import ca.gc.asc_csa.eclipse.emf.ecore.SelectionBasedTimeSource;

public class SelectionBasedTimeSourceTimeSourceCompositeProvider implements TimeSourceCompositeProvider<SelectionBasedTimeSource> 
{
	@Override
	public boolean isAdapterFor(SelectionBasedTimeSource obj) 
	{
		return obj instanceof SelectionBasedTimeSource;
	}

	@Override
	public AbstractTimeSourceComposite getComposite(Composite parent, int style, SelectionBasedTimeSource obj) 
	{
		if(isAdapterFor(obj))
		{
			return new SelectionBasedTimeSourceComposite(parent, style, obj);
		}
		else
		{
			return null;
		}
	}

	@Override
	public Class<?> getAdaptedClass() 
	{
		return SelectionBasedTimeSource.class;
	}
}
