package ca.gc.asc_csa.apogy.common.ui.properties.sections;
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
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;


public class EMFFormsPropertySection extends
		AbstractExtendedPropertySection {

	private Composite parentComposite;
	
	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		parentComposite = parent;
		parentComposite.setLayout(new GridLayout(1, true));
	}
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		Control[] children = parentComposite.getChildren();
		for (Control control : children) {
			control.dispose();
		}		
		super.setInput(part, selection);
	}
	
	@Override
	protected void render(EObject eObject) {
		try {
			ECPSWTViewRenderer.INSTANCE.render(parentComposite, eObject);
			parentComposite.layout();			
		} catch (ECPRendererException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		parentComposite = parent;
		parentComposite.setLayout(new GridLayout(1, true));
		return null;
	}
}