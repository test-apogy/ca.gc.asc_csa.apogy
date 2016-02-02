package ca.gc.asc_csa.apogy.common.topology.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.topology.ReferencedContentNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Referenced Content Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.impl.ReferencedContentNodeImpl#getReferencedContent <em>Referenced Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencedContentNodeImpl<T> extends ContentNodeImpl<T> implements
		ReferencedContentNode<T> {
	/**
	 * The cached value of the '{@link #getReferencedContent() <em>Referenced Content</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getReferencedContent()
	 * @generated
	 * @ordered
	 */
	protected T referencedContent;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencedContentNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyPackage.Literals.REFERENCED_CONTENT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetContent(T newContent, NotificationChain msgs) {
		return super.basicSetContent(newContent, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public T basicGetContent() {
		return getReferencedContent();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setContent(T newContent) {

		T oldContent = getContent();

		setReferencedContent(newContent);

		eNotify(new ENotificationImpl(this, Notification.RESOLVE,
				ApogyCommonTopologyPackage.CONTENT_NODE__CONTENT, oldContent, newContent));

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getReferencedContent() {
		if (referencedContent != null && ((EObject)referencedContent).eIsProxy()) {
			InternalEObject oldReferencedContent = (InternalEObject)referencedContent;
			referencedContent = (T)eResolveProxy(oldReferencedContent);
			if (referencedContent != oldReferencedContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonTopologyPackage.REFERENCED_CONTENT_NODE__REFERENCED_CONTENT, oldReferencedContent, referencedContent));
			}
		}
		return referencedContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetReferencedContent() {
		return referencedContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedContent(T newReferencedContent) {
		T oldReferencedContent = referencedContent;
		referencedContent = newReferencedContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyPackage.REFERENCED_CONTENT_NODE__REFERENCED_CONTENT, oldReferencedContent, referencedContent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.REFERENCED_CONTENT_NODE__REFERENCED_CONTENT:
				if (resolve) return getReferencedContent();
				return basicGetReferencedContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.REFERENCED_CONTENT_NODE__REFERENCED_CONTENT:
				setReferencedContent((T)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.REFERENCED_CONTENT_NODE__REFERENCED_CONTENT:
				setReferencedContent((T)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.REFERENCED_CONTENT_NODE__REFERENCED_CONTENT:
				return referencedContent != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public T getContent() {
		return getReferencedContent();
	}	

} // ReferencedContentNodeImpl
