package ca.gc.asc_csa.symphony.environment.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.symphony.environment.GeographicCoordinates;
import ca.gc.asc_csa.symphony.environment.ui.composites.GeographicCoordinatesComposite;

public class GeographicCoordinatesSection extends AbstractExtendedPropertySection implements
		IFilter {

	@Override
	public boolean select(Object toTest) {
		return ca.gc.asc_csa.eclipse.converters.Activator.convert(toTest, GeographicCoordinates.class) != null;
	}

	@Override
	protected void render(EObject eObject) 
	{
		GeographicCoordinates geographicCoordinates = (GeographicCoordinates) ca.gc.asc_csa.eclipse.converters.Activator.convert(eObject, GeographicCoordinates.class);
		if (geographicCoordinates != null) 
		{			
			((GeographicCoordinatesComposite) getComposite()).setGeographicCoordinates(geographicCoordinates);
		}
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) 
	{
		GeographicCoordinatesComposite composite = new GeographicCoordinatesComposite(parent, SWT.NONE);
		composite.setEnableEditing(true);
		
		return composite;
	}
}