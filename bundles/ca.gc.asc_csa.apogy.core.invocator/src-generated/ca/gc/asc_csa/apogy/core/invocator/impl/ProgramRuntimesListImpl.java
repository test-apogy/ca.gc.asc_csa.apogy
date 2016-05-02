/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator.impl;

import ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Runtimes List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramRuntimesListImpl#getSession <em>Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramRuntimesListImpl#getProgramRuntimes <em>Program Runtimes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramRuntimesListImpl extends MinimalEObjectImpl.Container implements ProgramRuntimesList {
	/**
	 * The cached value of the '{@link #getProgramRuntimes() <em>Program Runtimes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramRuntimes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractProgramRuntime> programRuntimes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramRuntimesListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorPackage.Literals.PROGRAM_RUNTIMES_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession getSession() {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION) return null;
		return (InvocatorSession)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession basicGetSession() {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION) return null;
		return (InvocatorSession)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSession(InvocatorSession newSession, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSession, ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSession(InvocatorSession newSession) {
		if (newSession != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION && newSession != null)) {
			if (EcoreUtil.isAncestor(this, newSession))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSession != null)
				msgs = ((InternalEObject)newSession).eInverseAdd(this, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST, InvocatorSession.class, msgs);
			msgs = basicSetSession(newSession, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION, newSession, newSession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractProgramRuntime> getProgramRuntimes() {
		if (programRuntimes == null) {
			programRuntimes = new EObjectContainmentEList<AbstractProgramRuntime>(AbstractProgramRuntime.class, this, ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__PROGRAM_RUNTIMES);
		}
		return programRuntimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSession((InvocatorSession)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION:
				return basicSetSession(null, msgs);
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__PROGRAM_RUNTIMES:
				return ((InternalEList<?>)getProgramRuntimes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST, InvocatorSession.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION:
				if (resolve) return getSession();
				return basicGetSession();
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__PROGRAM_RUNTIMES:
				return getProgramRuntimes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION:
				setSession((InvocatorSession)newValue);
				return;
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__PROGRAM_RUNTIMES:
				getProgramRuntimes().clear();
				getProgramRuntimes().addAll((Collection<? extends AbstractProgramRuntime>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION:
				setSession((InvocatorSession)null);
				return;
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__PROGRAM_RUNTIMES:
				getProgramRuntimes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION:
				return basicGetSession() != null;
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__PROGRAM_RUNTIMES:
				return programRuntimes != null && !programRuntimes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramRuntimesListImpl
