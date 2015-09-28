package ca.gc.asc_csa.eclipse.emf.ecore.ui.adapters;

import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.TimeSourceCompositeProvider;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.composites.AbstractTimeSourceComposite;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.composites.BrowseableTimeSourceComposite;

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
