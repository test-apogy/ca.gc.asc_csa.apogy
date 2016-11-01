package ca.gc.asc_csa.apogy.core.invocator.impl;
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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programs List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramsListImpl#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramsListImpl#getProgramsGroups <em>Programs Groups</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramsListImpl#getActiveControllersGroup <em>Active Controllers Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramsListImpl extends MinimalEObjectImpl.Container implements ProgramsList
{
  /**
	 * The cached value of the '{@link #getProgramsGroups() <em>Programs Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramsGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramsGroup> programsGroups;
		/**
	 * The cached value of the '{@link #getActiveControllersGroup() <em>Active Controllers Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveControllersGroup()
	 * @generated
	 * @ordered
	 */
	protected ProgramsGroup activeControllersGroup;
		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProgramsListImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCoreInvocatorPackage.Literals.PROGRAMS_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession getInvocatorSession()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION) return null;
		return (InvocatorSession)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession basicGetInvocatorSession()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION) return null;
		return (InvocatorSession)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInvocatorSession(InvocatorSession newInvocatorSession, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newInvocatorSession, ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInvocatorSession(InvocatorSession newInvocatorSession)
  {
		if (newInvocatorSession != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION && newInvocatorSession != null)) {
			if (EcoreUtil.isAncestor(this, newInvocatorSession))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInvocatorSession != null)
				msgs = ((InternalEObject)newInvocatorSession).eInverseAdd(this, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST, InvocatorSession.class, msgs);
			msgs = basicSetInvocatorSession(newInvocatorSession, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION, newInvocatorSession, newInvocatorSession));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgramsGroup> getProgramsGroups() {
		if (programsGroups == null) {
			programsGroups = new EObjectContainmentWithInverseEList<ProgramsGroup>(ProgramsGroup.class, this, ApogyCoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS_GROUPS, ApogyCoreInvocatorPackage.PROGRAMS_GROUP__PROGRAMS_LIST);
		}
		return programsGroups;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ProgramsGroup getActiveControllersGroup() {
		if (this.eIsSet(ApogyCoreInvocatorPackage.Literals.PROGRAMS_LIST__ACTIVE_CONTROLLERS_GROUP)) {
			InternalEObject oldActiveControllersGroup = (InternalEObject)activeControllersGroup;
			activeControllersGroup = (ProgramsGroup)eResolveProxy(oldActiveControllersGroup);
			if (activeControllersGroup != oldActiveControllersGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.PROGRAMS_LIST__ACTIVE_CONTROLLERS_GROUP, oldActiveControllersGroup, activeControllersGroup));
			}
		}else{
			ProgramsGroup contollerGroup = (ProgramsGroup) ApogyCoreInvocatorFactory.eINSTANCE.create(ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP);
			getProgramsGroups().add(contollerGroup);
			this.eSet(ApogyCoreInvocatorPackage.Literals.PROGRAMS_LIST__ACTIVE_CONTROLLERS_GROUP, contollerGroup);
		}
		return activeControllersGroup;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramsGroup basicGetActiveControllersGroup() {
		return activeControllersGroup;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveControllersGroup(ProgramsGroup newActiveControllersGroup) {
		ProgramsGroup oldActiveControllersGroup = activeControllersGroup;
		activeControllersGroup = newActiveControllersGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.PROGRAMS_LIST__ACTIVE_CONTROLLERS_GROUP, oldActiveControllersGroup, activeControllersGroup));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInvocatorSession((InvocatorSession)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProgramsGroups()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				return basicSetInvocatorSession(null, msgs);
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS_GROUPS:
				return ((InternalEList<?>)getProgramsGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST, InvocatorSession.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				if (resolve) return getInvocatorSession();
				return basicGetInvocatorSession();
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS_GROUPS:
				return getProgramsGroups();
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__ACTIVE_CONTROLLERS_GROUP:
				if (resolve) return getActiveControllersGroup();
				return basicGetActiveControllersGroup();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				setInvocatorSession((InvocatorSession)newValue);
				return;
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS_GROUPS:
				getProgramsGroups().clear();
				getProgramsGroups().addAll((Collection<? extends ProgramsGroup>)newValue);
				return;
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__ACTIVE_CONTROLLERS_GROUP:
				setActiveControllersGroup((ProgramsGroup)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				setInvocatorSession((InvocatorSession)null);
				return;
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS_GROUPS:
				getProgramsGroups().clear();
				return;
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__ACTIVE_CONTROLLERS_GROUP:
				setActiveControllersGroup((ProgramsGroup)null);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				return basicGetInvocatorSession() != null;
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS_GROUPS:
				return programsGroups != null && !programsGroups.isEmpty();
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST__ACTIVE_CONTROLLERS_GROUP:
				return activeControllersGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramsListImpl
