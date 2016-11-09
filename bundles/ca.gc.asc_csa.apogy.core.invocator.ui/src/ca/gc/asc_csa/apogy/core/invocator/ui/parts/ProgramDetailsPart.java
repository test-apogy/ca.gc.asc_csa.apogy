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
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallsListImpl;

public class ProgramDetailsPart extends AbstractEObjectSelectionBasedPart{

	@Override
	protected Composite createContentComposite(Composite parent) {
		return new EObjectComposite(parent, SWT.None) {
			protected void newSelection(ISelection selection) {
				selectionService.setSelection(((TreeSelection) selection).getFirstElement());
			}
		};
	}
	
	@Override
	protected boolean isEObjectAcepted(EObject eObject) {
		if (eObject instanceof OperationCallsListImpl) {
			return true;
		}
		return false;
	}

	@Override
	protected void setEObjectInComposite(EObject eObject) {
		((EObjectComposite) getContentComposite()).setEObject(eObject);
	}

}
//EObjectSelectionBasedPart {
//	@Override
//	protected void createContentComposite(Composite parent) {
//		parent.setLayout(new FillLayout());
//		new EObjectComposite(parent, SWT.None) {
//			protected void newSelection(ISelection selection) {
//				selectionService.setSelection(((TreeSelection) selection).getFirstElement());
//			}
//		};
//		parent.layout();
//	}
//
//	@Override
//	protected void setContentCompositeSelection(EObject eObject) {
//		((EObjectComposite) getContentComposite()).setEObject(eObject);
//	}
//
//	@Override
//	protected boolean isSettableClass(Class<? extends EObject> selectionClass) {
//		if (selectionClass == OperationCallsListImpl.class) {
//			return true;
//		}
//		return false;
//	}
//	
//	@Override
//	protected List<String> getAcceptedPartsIds() {
//		List<String> ids = new ArrayList<String>();
//		ids.add("ca.gc.asc_csa.apogy.rcp.part.ProgramsList");
//		return ids;
//	}
//}