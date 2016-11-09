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

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory;

public class VariablesListPart extends AbstractApogySessionBasedPart {

	@Override
	protected Composite createContentComposite(Composite parent) {
		return new Composite(parent, SWT.None); 
				
//				VariablesListComposite(parent, SWT.None) {
//			@Override
//			protected void newSelection(ISelection selection) {
//				if (selection.isEmpty()){
//					setNullSelection();					
//				}else {
//					List<Variable> variables = ((VariablesListComposite) getContentComposite()).getSelectedVariable();
//					if (!variables.isEmpty()){
//						VariablesListPartSelection selectionSent = ApogyCoreInvocatorUIFactory.eINSTANCE.createVariablesListPartSelection();
//						selectionSent.setVariables(variables);		
//						
//						selectionService.setSelection(selectionSent);						
//					}
//				}
//			}
//		};
	}
	
	@Override
	protected void newInvocatorSession(InvocatorSession invocatorSession) {
//		((VariablesListComposite) getContentComposite())
//		.setVariablesList(invocatorSession.getEnvironment().getVariablesList());
	}

	@Override
	protected void setNullSelection() {
		selectionService.setSelection(ApogyCoreInvocatorUIFactory.eINSTANCE.createVariablesListPartSelection());
	}
}