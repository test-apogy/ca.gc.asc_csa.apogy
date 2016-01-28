package ca.gc.asc_csa.apogy.common.emf.ui.adapters;

import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.FixedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.ui.TimeSourceCompositeProvider;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.AbstractTimeSourceComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.FixedTimeSourceComposite;

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
