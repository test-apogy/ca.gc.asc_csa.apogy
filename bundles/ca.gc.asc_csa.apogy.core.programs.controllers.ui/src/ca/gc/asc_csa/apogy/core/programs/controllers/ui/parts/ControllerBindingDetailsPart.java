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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractEObjectSelectionPart;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsPartSelection;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.BindedEDataTypeArgumentComposite;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.OperationCallControllerBindingsDetailsComposite;

public class ControllerBindingDetailsPart extends AbstractEObjectSelectionPart {

	Composite parent;

	@Override
	protected void createContentComposite(Composite parent, int style) {
		this.parent = parent;
		new OperationCallControllerBindingsDetailsComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
	}

	@Override
	protected void setCompositeContents(EObject eObject) {
		if (eObject instanceof OperationCallControllerBinding) {
			if (!(getActualComposite() instanceof OperationCallControllerBindingsDetailsComposite)) {
				getActualComposite().dispose();
				new OperationCallControllerBindingsDetailsComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
				parent.layout();
			}
			((OperationCallControllerBindingsDetailsComposite) getActualComposite())
					.setOperationCallControllerBinding((OperationCallControllerBinding) eObject);
		} else {
			if (!(getActualComposite() instanceof BindedEDataTypeArgumentComposite)) {
				getActualComposite().dispose();
				new BindedEDataTypeArgumentComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
				parent.layout();
			}
			((BindedEDataTypeArgumentComposite) getActualComposite())
					.setBindedEDataTypeArgument((BindedEDataTypeArgument) eObject);
		}
	}

	@Override
	protected List<String> getSelectionProvidersIds() {
		List<String> ids = new ArrayList<>();

		ids.add("ca.gc.asc_csa.apogy.rcp.part.ControllerBindingsPart");

		return ids;
	}

	@Override
	protected List<ISelectionListener> getSelectionListeners() {
		List<ISelectionListener> listeners = new ArrayList<ISelectionListener>();

		listeners.add(new ISelectionListener() {
			@Override
			public void selectionChanged(MPart part, Object selection) {
				if (selection instanceof ControllerBindingsPartSelection) {
					setEObject(((ControllerBindingsPartSelection) selection).getEObject());
				}
			}
		});

		return listeners;
	}
}