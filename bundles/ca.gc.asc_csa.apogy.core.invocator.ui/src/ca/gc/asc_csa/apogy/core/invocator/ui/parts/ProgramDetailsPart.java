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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractSelectionBasedPart;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.ui.ProgramPartSelection;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.OperationCallDetailsComposite;

public class ProgramDetailsPart extends AbstractSelectionBasedPart{

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
		((OperationCallDetailsComposite) getContentComposite()).setOperationCall((OperationCall)eObject);
	}

	@Override
	protected Composite createContentComposite(Composite parent) {
		return new OperationCallDetailsComposite(composite, SWT.None);
	}
}