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

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractEObjectSelectionPart;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory;
import ca.gc.asc_csa.apogy.core.invocator.ui.ProgramArgumentsPartSelection;
import ca.gc.asc_csa.apogy.core.invocator.ui.ProgramPartSelection;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.OperationCallDetailsComposite;

public class ProgramArgumentsPart extends AbstractEObjectSelectionPart {

	/**
	 * Injects a {@link ProgramPartSelection} in the part from the
	 * {@link ESelectionService}
	 * 
	 * @param selection
	 */
	@Inject
	@Optional
	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ProgramPartSelection selection) {
		if (selection != null) {
			setEObject(selection.getOperationCall());
		}
	}

	@Override
	protected void setSelectionInContentComposite(EObject eObject) {
		((OperationCallDetailsComposite) getContentComposite()).setOperationCall((OperationCall) eObject);
	}

	@Override
	protected Composite createContentComposite(Composite parent) {
		return new OperationCallDetailsComposite(parent, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				if (selection.isEmpty()) {
					setNullSelection();
				} else {
					EObject eObject = ((OperationCallDetailsComposite) getContentComposite()).getSelectedEObject();
					if (eObject != null) {
						ProgramArgumentsPartSelection selectionSent = ApogyCoreInvocatorUIFactory.eINSTANCE
								.createProgramArgumentsPartSelection();
						selectionSent.setEObject(eObject);
						selectionService.setSelection(selectionSent);
					}
				}
			}
		};
	}

	@Override
	protected void setNullSelection() {
		partService.activate(partService.findPart("ca.gc.asc_csa.apogy.rcp.part.ProgramArgumentsPart"));
		selectionService.setSelection(ApogyCoreInvocatorUIFactory.eINSTANCE.createProgramArgumentsPartSelection());
	}
}