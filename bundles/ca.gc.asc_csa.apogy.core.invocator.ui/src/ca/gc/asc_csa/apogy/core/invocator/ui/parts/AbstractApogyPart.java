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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import ca.gc.asc_csa.apogy.core.invocator.ui.composites.NoActiveSessionComposite;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.NoEObjectSelectionComposite;

abstract public class AbstractApogyPart {

	protected Composite composite;

	@Inject
	protected ESelectionService selectionService;

	@PostConstruct
	public void createPartControl(Composite parent) {
		composite = parent;
		composite.setLayout(new FillLayout());
		createContentComposite(composite);
		composite.layout();
		setEObject(null);
	}

	/**
	 * Specifies the {@link Composite} to create in the part
	 */
	abstract protected Composite createContentComposite(Composite parent);

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
	
	abstract protected void setNullSelection();
	
	protected void setEObject(EObject eObject) {
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
					setNoContentComposite();
				};
			}
		} else if (getContentComposite() == null) {
			setNoContentComposite();
		}
	}
	
	
	/**
	 * Sets the part's composite to a {@link NoActiveSessionComposite}
	 */
	protected void setNoContentComposite() {
		if (!(getContentComposite() instanceof NoActiveSessionComposite)) {
			// Disposes the content composite
			if (getContentComposite() != null) {
				getContentComposite().dispose();
			}
			getNoContentComposite();
			composite.layout();
			
			setNullSelection();
		}
	}
	
	abstract void getNoContentComposite();
	
//	
//	private Composite composite;
//	private Adapter adapter;
//
//	@Inject
//	protected ESelectionService selectionService;
//
//	@PostConstruct
//	public void createPartControl(Composite parent) {
//		composite = parent;
//		composite.setLayout(new FillLayout());
//
//		setEObject(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
//		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getApogyCoreInvocatorFacadeAdapter());
//	}
//
//	/**
//	 * Specifies the {@link Composite} to insert in the part
//	 */
//	abstract protected Composite createContentComposite(Composite parent);
//
//	/**
//	 * Determines if the {@link EObject} is an accepted instance by the part.
//	 * This method can be overwritten to filter the part input.
//	 * 
//	 * @param eObject
//	 *            The EObject to verify.
//	 * @return true if the eObject is the right type, false otherwise.
//	 */
//	protected boolean isEObjectAcepted(EObject eObject) {
//		if (eObject instanceof InvocatorSession) {
//			return true;
//		}
//		return false;
//	}
//
//	/**
//	 * Gets the content {@link Composite} in the part
//	 * 
//	 * @return Composite
//	 */
//	public Composite getContentComposite() {
//		if (composite != null && composite.getChildren().length > 0) {
//			return (Composite) composite.getChildren()[0];
//		}
//		return null;
//	}
//
//	/**
//	 * This method is called when the {@link EObject} needs to be changed or
//	 * initialized in the composite. This method can be overwritten to support
//	 * dependency injection.
//	 * 
//	 * @param invocatorSession
//	 *            Reference to the InvocatorSession.
//	 */
//	// @Inject //TODO
//	// @Optional // TODO
//	protected void setEObject(EObject eObject) {// TODO
//												// (@Named(IServiceConstants.ACTIVE_SELECTION)
//												// EObject eObject){
//		if (composite != null) {
//			if (getContentComposite() == null && !isEObjectAcepted(eObject)) {
//				setNoActiveSessionComposite();
//			}
//
//			// If the object is the class accepted by the part
//			if (isEObjectAcepted(eObject)) {
//				if (getContentComposite() == null || getContentComposite() instanceof NoActiveSessionComposite) {
//					if (getContentComposite() instanceof NoActiveSessionComposite) {
//						// Disposes the NoActiveSessionComposite
//						getContentComposite().dispose();
//					}
//					// Creates the content composite
//					createContentComposite(composite);
//					composite.layout();
//				}
//				setEObjectInComposite(eObject);
//			}
//		}
//	}
//
//	/**
//	 * This method is called when the {@link EObject} needs to be changed or
//	 * initialized in the content composite.
//	 * 
//	 * @param eObject
//	 *            Reference to the EObject.
//	 */
//	abstract protected void setEObjectInComposite(EObject eObject);
//
//	/**
//	 * Sets the part's composite to a {@link NoActiveSessionComposite}
//	 */
//	private void setNoActiveSessionComposite() {
//		if (!(getContentComposite() instanceof NoActiveSessionComposite)) {
//			// Disposes the content composite
//			if (getContentComposite() != null) {
//				getContentComposite().dispose();
//			}
//			new NoActiveSessionComposite(composite, SWT.None);
//			composite.layout();
//		}
//
//	}
//
//	/**
//	 * Gets an adapter that sets the part's composite to a
//	 * {@link NoActiveSessionComposite} if there is no active session.
//	 * 
//	 * @return the {@link Adapter}
//	 */
//	private Adapter getApogyCoreInvocatorFacadeAdapter() {
//		if (adapter == null) {
//			adapter = new AdapterImpl() {
//				@Override
//				public void notifyChanged(Notification msg) {
//					if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null) {
//						setEObject(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
//					} else {
//						setNoActiveSessionComposite();
//					}
//
//				}
//			};
//		}
//		return adapter;
//	}
//
//	@PreDestroy
//	protected void dispose() {
//		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().remove(getApogyCoreInvocatorFacadeAdapter());
//		if (composite != null) {
//			composite.dispose();
//		}
//	}
}