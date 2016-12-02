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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory;
import ca.gc.asc_csa.apogy.core.invocator.ui.VariablesListPartSelection;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.VariablesListComposite;

public class VariablesListPart extends AbstractSessionBasedPart {

	@Override
	protected void createContentComposite(Composite parent, int style) {
		new VariablesListComposite(parent, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				if (selection.isEmpty()){
					setNullSelection();					
				}else {
					VariableFeatureReference variableFeatureReference = ((VariablesListComposite)getActualComposite()).getSelectedVariableFeatureReference();
					if (variableFeatureReference != null) {
						VariablesListPartSelection selectionSent = ApogyCoreInvocatorUIFactory.eINSTANCE
								.createVariablesListPartSelection();
						selectionSent.setVariableFeatureReference(variableFeatureReference);

						selectionService.setSelection(selectionSent);
					}
				}
			}
		};
	}
	
	@Override
	protected void newInvocatorSession(InvocatorSession invocatorSession) {		
		((VariablesListComposite) getActualComposite())
		.setVariablesList(invocatorSession.getEnvironment().getVariablesList());
	}

	@Override
	protected void setNullSelection() {
		selectionService.setSelection(ApogyCoreInvocatorUIFactory.eINSTANCE.createVariablesListPartSelection());
	}
}