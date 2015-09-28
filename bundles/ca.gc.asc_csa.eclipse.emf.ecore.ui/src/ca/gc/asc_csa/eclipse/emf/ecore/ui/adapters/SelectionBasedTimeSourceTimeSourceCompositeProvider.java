package ca.gc.asc_csa.eclipse.emf.ecore.ui.adapters;

import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.emf.ecore.SelectionBasedTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.TimeSourceCompositeProvider;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.composites.AbstractTimeSourceComposite;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.composites.SelectionBasedTimeSourceComposite;

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
