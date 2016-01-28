package ca.gc.asc_csa.apogy.core.environment.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.ui.composites.GeographicCoordinatesComposite;

public class GeographicCoordinatesSection extends AbstractExtendedPropertySection implements IFilter
{
	@Override
	public boolean select(Object toTest)
	{
		return (ApogyCommonConvertersFacade.INSTANCE.convert(toTest, GeographicCoordinates.class) != null);
	}

	@Override
	protected void render(EObject eObject) 
	{
		GeographicCoordinates geographicCoordinates = (GeographicCoordinates) ApogyCommonConvertersFacade.INSTANCE.convert(eObject, GeographicCoordinates.class);
		if (geographicCoordinates != null) 
		{
			((GeographicCoordinatesComposite) getComposite()).setGeographicCoordinates(geographicCoordinates);
		}
	}

	@Override
	public boolean shouldUseExtraSpace()
	{
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