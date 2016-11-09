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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory;
import ca.gc.asc_csa.apogy.core.invocator.ui.ScriptBasedProgramsListPartSelection;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.ScriptBasedProgramsListComposite;

public class ScriptBasedProgramsListPart extends AbstractApogySessionBasedPart {

	@Override
	protected Composite createContentComposite(Composite parent) {
		return new ScriptBasedProgramsListComposite(parent, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				if (selection.isEmpty()){
					setNullSelection();					
				}else {
					Program program = ((ScriptBasedProgramsListComposite) getContentComposite()).getSelectedProgram();
					if (program != null){
						ScriptBasedProgramsListPartSelection selectionSent = ApogyCoreInvocatorUIFactory.eINSTANCE.createScriptBasedProgramsListPartSelection();
						selectionSent.setProgram(program);		
						
						selectionService.setSelection(selectionSent);						
					}
				}
			}
		};

	}

	@Override
	protected void setContentCompositeSelection(EObject eObject) {
		((ScriptBasedProgramsListComposite) getContentComposite())
		.setProgramsList(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getProgramsList());
	}

	@Override
	protected void setNullSelection() {
		selectionService.setSelection(ApogyCoreInvocatorUIFactory.eINSTANCE.createScriptBasedProgramsListPartSelection());
	}
}