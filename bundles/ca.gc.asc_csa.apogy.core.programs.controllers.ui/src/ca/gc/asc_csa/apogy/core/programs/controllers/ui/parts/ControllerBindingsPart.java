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
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractSelectionBasedPart;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsPartSelection;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerConfigsPartSelection;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.ControllerBindingsComposite;

public class ControllerBindingsPart extends AbstractSelectionBasedPart{
	@Override
	protected Composite createContentComposite(Composite parent) {
		return new ControllerBindingsComposite(parent, SWT.None){
			@Override
			protected void newSelection(ISelection selection) 
			{
				if (selection.isEmpty()){
					setNullSelection();					
				}else {
					OperationCallControllerBinding operationCallControllerBinding = ((ControllerBindingsComposite) getContentComposite()).getOperationCallControllerBinding();
					if (operationCallControllerBinding  != null){
						ControllerBindingsPartSelection selectionSent = ApogyCoreProgramsControllersUIFactory.eINSTANCE.createControllerBindingsPartSelection();
						selectionSent.setOperationCallControllerBinding(operationCallControllerBinding);
						
						selectionService.setSelection(selectionSent);				
					}
				}
			}
		};
	}

	@Override
	protected void setSelectionInContentComposite(EObject eObject) {
		((ControllerBindingsComposite) getContentComposite()).setControllersConfiguration((ControllersConfiguration)eObject);
	}

	@Override
	protected void setNullSelection() {
		partService.activate(partService.findPart("ca.gc.asc_csa.apogy.rcp.part.ControllerBindingsPart"));
		selectionService.setSelection(ApogyCoreProgramsControllersUIFactory.eINSTANCE.createControllerBindingsPartSelection());
	}
	
	/**
	 * Injects a {@link ControllerConfigsPartSelection} in the part from the
	 * {@link ESelectionService}
	 * 
	 * @param selection
	 */
	@Inject
	@Optional
	private void setSelection(
			@Named(IServiceConstants.ACTIVE_SELECTION) ControllerConfigsPartSelection selection) {
		if (selection != null) {
			if (selection.getControllersConfiguration() != null) {
				setEObject(selection.getControllersConfiguration());
			}
		}
	}
}