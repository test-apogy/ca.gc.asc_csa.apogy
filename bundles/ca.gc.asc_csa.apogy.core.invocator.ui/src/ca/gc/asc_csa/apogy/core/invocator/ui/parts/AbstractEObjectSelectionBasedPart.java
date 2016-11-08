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

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import ca.gc.asc_csa.apogy.core.invocator.ui.composites.NoEObjectSelectionComposite;

abstract public class AbstractEObjectSelectionBasedPart extends AbstractApogyPart {
	
	@Override
	abstract protected boolean isEObjectAcepted(EObject eObject);
	
	@Override
	@Inject
	@Optional
	protected void setEObject(@Named(IServiceConstants.ACTIVE_SELECTION) EObject eObject) {
		super.setEObject(eObject);
	}

//	@Inject
//	@Optional
//	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) EObject eObject) {
//		if (composite != null) {
//			if (this.acceptSelection) {
//				if (eObject != null && isSettableClass(eObject.getClass())) {
//					this.eObject = eObject;
//
//					if (getContentComposite() instanceof NoEObjectSelectionComposite) {
//						// Disposes the NoActiveSessionComposite
//						for (Control control : composite.getChildren()) {
//							control.dispose();
//						}
//						createContentComposite(composite);
//						composite.layout();
//					}
//					setContentCompositeSelection(eObject);
//
//				} else {
//					if (getContentComposite() != null
//							&& !(getContentComposite() instanceof NoEObjectSelectionComposite)) {
//						for (Control control : composite.getChildren()) {
//							control.dispose();
//						}
//					}
//					if (getContentComposite() == null) {
//						selectionService.setSelection(null);
//						new NoEObjectSelectionComposite(composite, SWT.None);
//						composite.layout();
//					};
//				}
//			}else if(getContentComposite() == null){
//				selectionService.setSelection(null);
//				new NoEObjectSelectionComposite(composite, SWT.None);
//				composite.layout();
//			}
//		}
//	}

//	/**
//	 * This method is called when the {@link EObject} needs to be changed or
//	 * initialized in the composite. If there is no active session, this method
//	 * disposes any existing content composite and replaces it with a
//	 * {@link NoEObjectSelectionComposite}. If there is an active session, it
//	 * disposes any NoActiveSessionComposite, replaces it with the content
//	 * composite and calls setSessionInComposite.
//	 * 
//	 * @param invocatorSession
//	 *            Reference to the InvocatorSession.
//	 */
//	@Inject
//	@Optional
//	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ApogySelection selection) {
//		if(composite != null){
//			if(selection != null && verifySelectionProviderPart(selection)){
//				setSelection((EObject)((TreeSelection)selection.getSelection()).getFirstElement());
//			}else{
//				setNoSelectionComposite();
//			}
//		}
//		if(composite != null){
//			if(selection == null || !verifySelectionProviderPart(selection)){
//				setNoSelectionComposite();
//			} else {
//				if (isSettableClass(((EObject) ((TreeSelection) selection.getSelection()).getFirstElement()).getClass())) {
//					if(eObject != null){
//						eObject.eAdapters().remove(getEObjectAdapter());
//					}
//					eObject = ((EObject) ((TreeSelection) selection.getSelection()).getFirstElement());
//					eObject.eAdapters().add(getEObjectAdapter());
//					
//					if(getContentComposite() instanceof NoEObjectSelectionComposite){
//						getContentComposite().dispose();
//					}
//					if(getContentComposite() == null){
//						createContentComposite(composite);
//						getContentComposite();
//					}
//					setContentCompositeSelection(eObject);
//				}else{
//					setNoSelectionComposite();
//				}
//			}
//		}
//		// If there is no selection
//		if (eObject == null || !isSettableClass(eObject.getClass())) {
//			// Verify if the content composite is not a
//			// NoEObjectSelectionComposite
//			if (getContentComposite() != null && !(getContentComposite() instanceof NoEObjectSelectionComposite)) {
//				// Disposes the content composite
//				getContentComposite().dispose();
//				new NoEObjectSelectionComposite(composite, SWT.None);
//			}
//		} else {
//			if (this.eObject != null) {
//				this.eObject.eAdapters().remove(getEObjectAdapter());
//			}
//			this.eObject = eObject;
//			this.eObject.eAdapters().add(getEObjectAdapter());
//			if (getContentComposite() instanceof NoEObjectSelectionComposite) {
//				// Disposes the NoEObjectSelectionComposite
//				getContentComposite().dispose();
//				createContentComposite(composite);	
//			}
//			if(getContentComposite() != null){
//				setContentCompositeSelection(eObject);
//			}
//			
//		}
//	}

//	@Inject
//	@Optional
//	public void receiveActivePart(@Named(IServiceConstants.ACTIVE_PART) MPart activePart) {
//		if (activePart != null && getAcceptedPartsIds().contains(activePart.getElementId())) {
//			System.out.println(true);
//			this.acceptSelection = true;
//		} else {
//			System.out.println(false);
//			this.acceptSelection = false;
//		}
//
//	}
	
	
	
//	private void setSelection(EObject eObject) {
//		// If there is no active session
//		if (eObject != null && isSettableClass(eObject.getClass())) {
//			if (this.eObject != null) {
//				this.eObject.eAdapters().remove(getEObjectAdapter());
//			}
//			this.eObject = eObject;
//			this.eObject.eAdapters().add(getEObjectAdapter());
//			if (getContentComposite() instanceof NoEObjectSelectionComposite) {
//				// Disposes the NoActiveSessionComposite
//				getContentComposite().dispose();
//				createContentComposite(composite);
//				composite.layout();
//			}
//			setContentCompositeSelection(eObject);
//
//		} else {
//			setNoSelectionComposite();
//		}
//
//	}
	
//	private void setNoSelectionComposite(){
//		if(getContentComposite() != null && !(getContentComposite() instanceof NoEObjectSelectionComposite)){
//			getContentComposite().dispose();
//		}
//		if(getContentComposite() == null){
//			new NoEObjectSelectionComposite(composite, SWT.None);
//			composite.layout();
//		}
//	}

//	@PreDestroy
//	protected void dispose() {
//		getContentComposite().dispose();
//		composite.dispose();
//	}
}