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
import javax.management.InstanceAlreadyExistsException;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import ca.gc.asc_csa.apogy.core.invocator.ui.composites.NoActiveSessionComposite;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.NoEObjectSelectionComposite;

abstract public class AbstractSelectionBasedPart {
	private Composite composite;

	@Inject
	protected ESelectionService selectionService;

	@PostConstruct
	public void createPartControl(Composite parent) {
		composite = parent;
		composite.setLayout(new FillLayout());
		createContentComposite(composite);
		composite.layout();
		setSelection(null);
	}
	
	protected boolean isSelectionAcepted(Object object){
		for(Iterator<Object> ite = getAcceptedSelections().iterator(); ite.hasNext();) {
			Object object2 = ite.next();
			if(object instanceof object2.getClass()){
				return true;
			}
		}
		return false;
	};
	
	abstract protected List<Object> getAcceptedSelections(); 
	

	/**
	 * Specifies the {@link Composite} to create in the part
	 */
	abstract protected void createContentComposite(Composite parent);

	/**
	 * Gets the content {@link Composite} in the part
	 * 
	 * @return Composite
	 */
	public Composite getContentComposite() {
		if (composite != null) {
			if (composite.getChildren().length > 0) {
				return (Composite) composite.getChildren()[0];
			}
		}
		return null;
	}

	/**
	 * This method is called when the {@link EObject} needs to be changed or
	 * initialized in the content composite.
	 * 
	 * @param eObject
	 *            Reference to the EObject.
	 */
	abstract protected void setContentCompositeSelection(EObject eObject);
	
//	abstract protected boolean verifySelectionProviderPart(String partID);
	
	abstract protected void setNullSelection();
	
	private void setSelection(EObject eObject) {
		if (composite != null) {
			if (eObject != null) {
				if (getContentComposite() instanceof NoEObjectSelectionComposite) {
					// Disposes the NoActiveSessionComposite
					for (Control control : composite.getChildren()) {
						control.dispose();
					}
					createContentComposite(composite);
					composite.layout();
				}
				setContentCompositeSelection(eObject);

			} else {
				if (getContentComposite() != null && !(getContentComposite() instanceof NoEObjectSelectionComposite)) {
					for (Control control : composite.getChildren()) {
						control.dispose();
					}
				}
				if (getContentComposite() == null) {
					setNoActiveSessionComposite();
				};
			}
		} else if (getContentComposite() == null) {
			setNoActiveSessionComposite();
		}

	}
	
	
	/**
	 * Sets the part's composite to a {@link NoActiveSessionComposite}
	 */
	private void setNoActiveSessionComposite() {
		if (!(getContentComposite() instanceof NoActiveSessionComposite)) {
			// Disposes the content composite
			if (getContentComposite() != null) {
				getContentComposite().dispose();
			}
			new NoEObjectSelectionComposite(composite, SWT.None);
			composite.layout();
			
			setNullSelection();
		}

	}
	
	
//	@Inject
//	@Optional
//	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) EObject eObject) {
//		TODO
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

	@PreDestroy
	protected void dispose() {
		getContentComposite().dispose();
		composite.dispose();
	}
}