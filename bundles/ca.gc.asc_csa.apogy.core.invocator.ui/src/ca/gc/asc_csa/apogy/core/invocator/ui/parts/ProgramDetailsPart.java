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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractSelectionBasedPart;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory;
import ca.gc.asc_csa.apogy.core.invocator.ui.ProgramDetailsPartSelection;
import ca.gc.asc_csa.apogy.core.invocator.ui.ScriptBasedProgramsListPartSelection;

public class ProgramDetailsPart extends AbstractSelectionBasedPart{

	@Override
	protected Composite createContentComposite(Composite parent) {
		return new EObjectComposite(parent, SWT.None) {
			protected void newSelection(ISelection selection) {
				if(((TreeSelection) selection).getFirstElement() instanceof EObject){
					ProgramDetailsPartSelection selectionSent = ApogyCoreInvocatorUIFactory.eINSTANCE.createProgramDetailsPartSelection();
					selectionSent.setEObject((EObject)((TreeSelection) selection).getFirstElement());
					
					selectionService.setSelection(selectionSent);
				}
			}
		};
	}

	@Override
	protected void setSelectionInContentComposite(EObject eObject) {
		((EObjectComposite) getContentComposite()).setEObject(eObject);
	}

	@Override
	protected void setNullSelection() {
		selectionService.setSelection(ApogyCoreInvocatorUIFactory.eINSTANCE.createProgramDetailsPartSelection());
	}
	
	/**
	 * Injects a {@link ScriptBasedProgramsListPartSelection} in the part from the {@link ESelectionService}
	 * @param selection
	 */
	@Inject
	@Optional
	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ScriptBasedProgramsListPartSelection selection) {
		if(selection != null){
			setEObject(selection.getProgram());
		}
	}
}