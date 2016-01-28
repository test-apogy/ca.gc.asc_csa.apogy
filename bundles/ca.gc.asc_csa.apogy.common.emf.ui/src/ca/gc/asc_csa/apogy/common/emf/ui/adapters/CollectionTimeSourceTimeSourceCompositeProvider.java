package ca.gc.asc_csa.apogy.common.emf.ui.adapters;

import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.ui.TimeSourceCompositeProvider;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.AbstractTimeSourceComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.CollectionTimedTimeSourceComposite;

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
