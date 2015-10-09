package org.eclipse.symphony.core.environment.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.ui.properties.sections.AbstractExtendedPropertySection;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.ui.composites.GeographicCoordinatesComposite;

public class GeographicCoordinatesSection extends AbstractExtendedPropertySection implements
		IFilter {

	@Override
	public boolean select(Object toTest) {
		return org.eclipse.symphony.common.converters.Activator.convert(toTest, GeographicCoordinates.class) != null;
	}

	@Override
	protected void render(EObject eObject) 
	{
		GeographicCoordinates geographicCoordinates = (GeographicCoordinates) org.eclipse.symphony.common.converters.Activator.convert(eObject, GeographicCoordinates.class);
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