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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractEObjectSelectionPart;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsPartSelection;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerConfigsPartSelection;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.ControllerBindingsComposite;

public class ControllerBindingsPart extends AbstractEObjectSelectionPart {
	@Override
	protected void createContentComposite(Composite parent, int style) {
		new ControllerBindingsComposite(parent, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				if (selection.isEmpty()) {
					setNullSelection();
				} else {
					// TODO .get(0)
					OperationCallControllerBinding operationCallControllerBinding = ((ControllerBindingsComposite) getActualComposite())
							.getSelectedBindings().get(0);
					if (operationCallControllerBinding != null) {
						ControllerBindingsPartSelection selectionSent = ApogyCoreProgramsControllersUIFactory.eINSTANCE
								.createControllerBindingsPartSelection();
						selectionSent.setOperationCallControllerBinding(operationCallControllerBinding);

						selectionService.setSelection(selectionSent);
					}
				}
			}
		};
	}

	@Override
	protected void setCompositeContents(EObject eObject) {
		((ControllerBindingsComposite) getActualComposite())
				.setControllersConfiguration((ControllersConfiguration) eObject);
	}

	@Override
	protected void setNullSelection() {
		selectionService
				.setSelection(ApogyCoreProgramsControllersUIFactory.eINSTANCE.createControllerBindingsPartSelection());
	}

	@Override
	protected List<String> getSelectionProvidersIds() {
		List<String> ids = new ArrayList<>();

		ids.add("ca.gc.asc_csa.apogy.rcp.part.ControllerConfigsPart");

		return ids;
	}

	@Override
	protected List<ISelectionListener> getSelectionListeners() {
		List<ISelectionListener> listeners = new ArrayList<ISelectionListener>();

		listeners.add(new ISelectionListener() {
			@Override
			public void selectionChanged(MPart part, Object selection) {
				if (selection instanceof ControllerConfigsPartSelection) {
					setEObject(((ControllerConfigsPartSelection) selection).getControllersConfiguration());
				}
			}
		});

		return listeners;
	}
}