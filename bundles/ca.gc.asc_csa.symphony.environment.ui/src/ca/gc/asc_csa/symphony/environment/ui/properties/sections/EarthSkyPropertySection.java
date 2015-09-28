package ca.gc.asc_csa.symphony.environment.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.symphony.environment.EarthSky;
import ca.gc.asc_csa.symphony.environment.ui.composites.EarthSkyComposite;

public class EarthSkyPropertySection extends AbstractExtendedPropertySection {

	EarthSkyComposite composite;
	
	@Override
	public void createControls(Composite parent,TabbedPropertySheetPage aTabbedPropertySheetPage) {		
		super.createControls(parent, aTabbedPropertySheetPage);
		
	}
	
	@Override
	protected void render(EObject eObject) {
		composite.setEarthSky( (EarthSky) getEObject());		
	}
	
	@Override
	public boolean shouldUseExtraSpace() {	
		return true;
	}
	
	@Override
	protected Composite createComposite(Composite parent) {
		composite = new EarthSkyComposite(parent, SWT.NONE);
		return composite;
	}
}
