package ca.gc.asc_csa.apogy.core.invocator.ui.parts;
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

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;

public class ApogyAdvancedEditorPart{

//	@Inject ESelectionService selectionService;
	
	@PostConstruct	
	public void createPartControl(Composite parent, ESelectionService selectionService) {
		EObjectComposite eObjectComposite = new EObjectComposite(parent,
				SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				selectionService.setSelection(selection);
			}
		};
	
		if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null){
			eObjectComposite.setEObject(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
		}
	}
}