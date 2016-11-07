package ca.gc.asc_csa.apogy.core.programs.controllers.ui.parts;
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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.parts.AbstractApogySessionBasedPart;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.ControllerConfigsComposite;

public class ControllerConfigsPart extends AbstractApogySessionBasedPart{
	
	protected Composite createContentComposite(Composite parent){
		return new ControllerConfigsComposite(parent, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) 
			{
				selectionService.setSelection(((TreeSelection)selection).getFirstElement());
			}
		};
	}

	protected void setSessionInComposite(InvocatorSession invocatorSession) {
		if (ApogyCoreInvocatorFacade.INSTANCE.getControllersGroup() != null) {
			((ControllerConfigsComposite) getContentComposite())
					.setControllersGroup(ApogyCoreInvocatorFacade.INSTANCE.getControllersGroup());
		}
	}
}