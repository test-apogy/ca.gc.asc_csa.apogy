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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallsListImpl;

public class SimpleProgramDetailsPart extends EObjectSelectionBasedPart {
	@Override
	protected void createContentComposite(Composite parent) {
		parent.setLayout(new FillLayout());
		new EObjectComposite(parent, SWT.None);
//		new ProgramsDetailsComposite(parent, SWT.None) {
////			@Override
////			protected void newSelection(ISelection selection) {
////				selectionService.setSelection(selection);
////			}
//		};
		parent.layout();
	}

	@Override
	protected void setContentCompositeSelection(EObject eObject) {
		((EObjectComposite) getContentComposite()).setEObject(eObject);
	}

	@Override
	protected boolean isSettableClass(Class<? extends EObject> selectionClass) {
		if (selectionClass == OperationCallsListImpl.class) {
			return true;
		}
		return false;
	}

//	@Override
//	protected boolean verifySelectionProviderPart(ApogySelection selection) {
//		if (selection.getPartID() == "ca.gc.asc_csa.apogy.core.invocator.ui.parts.ScriptBasedProgramsListPart") {
//			return true;
//		}
//		return false;
//	}
	
	@Override
	protected List<String> getAcceptedPartsIds() {
		List<String> ids = new ArrayList<String>();
		ids.add("ca.gc.asc_csa.apogy.rcp.part.ScriptBasedProgramsListPart");
		return ids;
	}
}