package ca.gc.asc_csa.apogy.core.environment.ui.properties.sections;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.apogy.core.environment.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.ui.composites.EarthSkyComposite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

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