package ca.gc.asc_csa.apogy.common.emf.ui.adapters;

import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource;
import ca.gc.asc_csa.apogy.common.emf.ui.TimeSourceCompositeProvider;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.AbstractTimeSourceComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.CurrentTimeSourceComposite;

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
