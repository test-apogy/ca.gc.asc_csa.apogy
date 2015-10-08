package org.eclipse.symphony.core.environment.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.environment.EarthSky;
import org.eclipse.symphony.core.environment.ui.composites.EarthSkyComposite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;

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
