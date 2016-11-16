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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.parts.AbstractApogySessionBasedPart;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerConfigsPartSelection;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.ControllerConfigsComposite;

public class ControllerConfigsPart extends AbstractApogySessionBasedPart {

	@Override
	protected Composite createContentComposite(Composite parent) {
		return new ControllerConfigsComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL) {
			@Override
			protected void newSelection(ISelection selection) {
				if (selection.isEmpty()) {
					setNullSelection();
				} else {
					ControllersConfiguration controllersConfiguration = ((ControllerConfigsComposite) getContentComposite())
							.getSelectedControllerConfiguration();
					if (controllersConfiguration != null) {
						ControllerConfigsPartSelection selectionSent = ApogyCoreProgramsControllersUIFactory.eINSTANCE
								.createControllerConfigsPartSelection();
						selectionSent.setControllersConfiguration(controllersConfiguration);

						selectionService.setSelection(selectionSent);
					}
				}
			}
		};
	}

	@Override
	protected void newInvocatorSession(InvocatorSession invocatorSession) {
		((ControllerConfigsComposite) getContentComposite())
				.setControllersGroup(ApogyCoreInvocatorFacade.INSTANCE.getControllersGroup());
	}
	
//	// TODO
//	@Override
//	protected Composite getNoContentComposite() {
//		return new ControllerConfigsComposite(composite, SWT.H_SCROLL | SWT.V_SCROLL);
//	}

	@Override
	protected void setNullSelection() {
		selectionService
				.setSelection(ApogyCoreProgramsControllersUIFactory.eINSTANCE.createControllerConfigsPartSelection());
	}
}