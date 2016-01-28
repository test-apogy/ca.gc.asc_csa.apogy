package ca.gc.asc_csa.apogy.common.emf.ui.adapters;

import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.SelectionBasedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.ui.TimeSourceCompositeProvider;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.AbstractTimeSourceComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.SelectionBasedTimeSourceComposite;

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
