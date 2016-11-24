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

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractEObjectSelectionPart;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsPartSelection;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.ControllerBindingDetailsComposite;

public class ControllerBindingDetailsPart extends AbstractEObjectSelectionPart {

	@Override
	protected void createContentComposite(Composite parent, int style) {
		new ControllerBindingDetailsComposite(parent, SWT.None);
		
		selectionService.addSelectionListener("ca.gc.asc_csa.apogy.rcp.part.ControllerBindingsPart", new ISelectionListener() {
			@Override
			public void selectionChanged(MPart part, Object selection) {
				if(selection instanceof ControllerBindingsPartSelection){
					setSelection((ControllerBindingsPartSelection)selection);
				}
			}
		});
	}

	@Override
	protected void setCompositeContents(EObject eObject) {
		((ControllerBindingDetailsComposite) getActualComposite())
				.setOperationCallControllerBinding((OperationCallControllerBinding) eObject);
	}

	/**
	 * Injects a {@link ControllerBindingsSelection} in the part from the
	 * {@link ESelectionService}
	 * 
	 * @param selection
	 */
	@Inject
	@Optional
	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ControllerBindingsPartSelection selection) {
		if (selection != null) {
			if (selection.getOperationCallControllerBinding() == null) {
				setEObject(selection.getOperationCallControllerBinding());
			}
		}
	}
}