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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.AdvancedEditorComposite;

public class ApogyAdvancedEditorPart{

//	@Inject ESelectionService selectionService;
	private AdvancedEditorComposite advancedEditorComposite;
	private Adapter adapter;
	
	@PostConstruct	
	public void createPartControl(Composite parent, ESelectionService selectionService) {
		advancedEditorComposite = new AdvancedEditorComposite(parent, SWT.None, selectionService, null);
		InvocatorSession activeSession = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		advancedEditorComposite.setEObject(activeSession);
		
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getApogyCoreInvocatorFacadeAdapter());
//		EObjectComposite eObjectComposite = new EObjectComposite(parent, SWT.None);
//		eObjectComposite.setEObject(ApogyCoreInvocatorFactory.eINSTANCE.createInvocatorSession());
//		EObjectComposite eObjectComposite = new EObjectComposite(parent,
//				SWT.None) {
//			@Override
//			protected void newSelection(ISelection selection) {
//				selectionService.setSelection(selection);
//			}
//		};
//	
//		if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null){
//			eObjectComposite.setEObject(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
//		}
	}
	


public void updateSelection(ISelection arg0) {
	advancedEditorComposite.setEObject((EObject)arg0);
}		


private Adapter getApogyCoreInvocatorFacadeAdapter() {
	if (adapter == null) {
		adapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				advancedEditorComposite.setEObject((EObject) msg.getFeature());
			}
		};
	}
	return adapter;
}
}