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
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
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
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory;
import ca.gc.asc_csa.apogy.core.invocator.ui.ProgramPartSelection;
import ca.gc.asc_csa.apogy.core.invocator.ui.ScriptBasedProgramsListPartSelection;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.OperationCallsListComposite;

public class ProgramPart extends AbstractEObjectSelectionPart {

	@Override
	protected void createContentComposite(Composite parent, int style) {
		new OperationCallsListComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL) {
			protected void newSelection(ISelection selection) {
				if (selection.isEmpty()) {
					setNullSelection();
				} else {
					OperationCall operationCall = ((OperationCallsListComposite) getActualComposite())
							.getSelectedOperationCall();
					if (operationCall != null) {
						ProgramPartSelection selectionSent = ApogyCoreInvocatorUIFactory.eINSTANCE
								.createProgramPartSelection();
						selectionSent.setOperationCall(operationCall);

						selectionService.setSelection(selectionSent);
					}
				}
			}
		};
	}

	@Override
	protected void setCompositeContents(EObject eObject) {
		((OperationCallsListComposite) getActualComposite()).setOperationCallsList((OperationCallsList) eObject);
	}

	@Override
	protected void setNullSelection() {
		selectionService.setSelection(ApogyCoreInvocatorUIFactory.eINSTANCE.createProgramPartSelection());
	}

	@Override
	protected List<String> getSelectionProvidersIds() {
		List<String> ids = new ArrayList<>();

		ids.add("ca.gc.asc_csa.apogy.rcp.part.ScriptBasedProgramsListPart");

		return ids;
	}

	@Override
	protected List<ISelectionListener> getSelectionListeners() {
		List<ISelectionListener> listeners = new ArrayList<ISelectionListener>();

		listeners.add(new ISelectionListener() {
			@Override
			public void selectionChanged(MPart part, Object selection) {
				if (selection instanceof ScriptBasedProgramsListPartSelection) {
					setEObject(((ScriptBasedProgramsListPartSelection) selection).getProgram());;
				}
			}
		});

		return listeners;
	}
}