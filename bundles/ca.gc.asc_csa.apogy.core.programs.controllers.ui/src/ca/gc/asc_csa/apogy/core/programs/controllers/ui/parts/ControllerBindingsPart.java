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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.ui.parts.EObjectSelectionBasedPart;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.ControllerBindingsComposite;

public class ControllerBindingsPart extends EObjectSelectionBasedPart{
	@Override
	protected void createContentComposite(Composite parent) {
		new ControllerBindingsComposite(parent, SWT.None){
			@Override
			protected void newSelection(ISelection selection) 
			{
				selectionService.setSelection(selection);
			}
		};
	}

	@Override
	protected void setContentCompositeSelection(EObject eObject) {
		((ControllerBindingsComposite) getContentComposite()).setControllersConfiguration((ControllersConfiguration)eObject);
	}

	@Override
	protected boolean isSettableClass(Class<? extends EObject> selectionClass) {
		if (selectionClass == ControllersConfiguration.class) {
			System.out.println("is settable classe");
			return true;
		}
		System.out.println("isnt settable classe");
		return false;
	}
	
	@Override
	protected List<String> getAcceptedPartsIds() {
		List<String> ids = new ArrayList<String>();
		ids.add("ca.gc.asc_csa.apogy.rcp.part.configurations");
		return ids;
	}
	
	
	
//	@Override
//	protected Composite createContentComposite(Composite parent) {
//		return new ControllerBindingsComposite(parent, SWT.None){
//			@Override
//			protected void newSelection(ISelection selection) 
//			{
//				selectionService.setSelection(selection);
//			}
//		};
//	}
//
//	@Override
//	protected void setContentCompositeSelection(EObject eObject) {
//		if(eObject instanceof ControllersConfiguration){
//			((ControllerBindingsComposite)getContentComposite()).setControllersConfiguration((ControllersConfiguration) eObject);
//		}
//	}
//
//	@Override
//	protected boolean isSettableClass(Class<? extends EObject> selectionClass) {
//		if(selectionClass == OperationCallControllerBinding.class){
//			return true;
//		}
//		return false;
//	}
}