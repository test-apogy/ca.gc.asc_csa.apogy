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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ContextsList;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.LocalTypesList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl#getLocalTypesList <em>Local Types List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl#getVariablesList <em>Variables List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl#getContextsList <em>Contexts List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.EnvironmentImpl#getActiveContext <em>Active Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getLocalTypesList() <em>Local Types List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalTypesList()
	 * @generated
	 * @ordered
	 */
	protected LocalTypesList localTypesList;

		/**
	 * The cached value of the '{@link #getVariablesList() <em>Variables List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariablesList()
	 * @generated
	 * @ordered
	 */
  protected VariablesList variablesList;

  /**
	 * The cached value of the '{@link #getContextsList() <em>Contexts List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContextsList()
	 * @generated
	 * @ordered
	 */
  protected ContextsList contextsList;

  /**
	 * The cached value of the '{@link #getActiveContext() <em>Active Context</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActiveContext()
	 * @generated
	 * @ordered
	 */
  protected Context activeContext;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EnvironmentImpl()
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
		return ApogyCoreInvocatorPackage.Literals.ENVIRONMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ENVIRONMENT__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription()
  {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription)
  {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ENVIRONMENT__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession getInvocatorSession()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION) return null;
		return (InvocatorSession)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession basicGetInvocatorSession()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION) return null;
		return (InvocatorSession)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInvocatorSession(InvocatorSession newInvocatorSession, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newInvocatorSession, ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInvocatorSession(InvocatorSession newInvocatorSession)
  {
		if (newInvocatorSession != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION && newInvocatorSession != null)) {
			if (EcoreUtil.isAncestor(this, newInvocatorSession))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInvocatorSession != null)
				msgs = ((InternalEObject)newInvocatorSession).eInverseAdd(this, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT, InvocatorSession.class, msgs);
			msgs = basicSetInvocatorSession(newInvocatorSession, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION, newInvocatorSession, newInvocatorSession));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalTypesList getLocalTypesList() {
		return localTypesList;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalTypesList(LocalTypesList newLocalTypesList, NotificationChain msgs) {
		LocalTypesList oldLocalTypesList = localTypesList;
		localTypesList = newLocalTypesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ENVIRONMENT__LOCAL_TYPES_LIST, oldLocalTypesList, newLocalTypesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalTypesList(LocalTypesList newLocalTypesList) {
		if (newLocalTypesList != localTypesList) {
			NotificationChain msgs = null;
			if (localTypesList != null)
				msgs = ((InternalEObject)localTypesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.ENVIRONMENT__LOCAL_TYPES_LIST, null, msgs);
			if (newLocalTypesList != null)
				msgs = ((InternalEObject)newLocalTypesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.ENVIRONMENT__LOCAL_TYPES_LIST, null, msgs);
			msgs = basicSetLocalTypesList(newLocalTypesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ENVIRONMENT__LOCAL_TYPES_LIST, newLocalTypesList, newLocalTypesList));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariablesList getVariablesList()
  {
		return variablesList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariablesList(VariablesList newVariablesList, NotificationChain msgs)
  {
		VariablesList oldVariablesList = variablesList;
		variablesList = newVariablesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST, oldVariablesList, newVariablesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariablesList(VariablesList newVariablesList)
  {
		if (newVariablesList != variablesList) {
			NotificationChain msgs = null;
			if (variablesList != null)
				msgs = ((InternalEObject)variablesList).eInverseRemove(this, ApogyCoreInvocatorPackage.VARIABLES_LIST__ENVIRONMENT, VariablesList.class, msgs);
			if (newVariablesList != null)
				msgs = ((InternalEObject)newVariablesList).eInverseAdd(this, ApogyCoreInvocatorPackage.VARIABLES_LIST__ENVIRONMENT, VariablesList.class, msgs);
			msgs = basicSetVariablesList(newVariablesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST, newVariablesList, newVariablesList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContextsList getContextsList()
  {
		return contextsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetContextsList(ContextsList newContextsList, NotificationChain msgs)
  {
		ContextsList oldContextsList = contextsList;
		contextsList = newContextsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST, oldContextsList, newContextsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setContextsList(ContextsList newContextsList)
  {
		if (newContextsList != contextsList) {
			NotificationChain msgs = null;
			if (contextsList != null)
				msgs = ((InternalEObject)contextsList).eInverseRemove(this, ApogyCoreInvocatorPackage.CONTEXTS_LIST__ENVIRONMENT, ContextsList.class, msgs);
			if (newContextsList != null)
				msgs = ((InternalEObject)newContextsList).eInverseAdd(this, ApogyCoreInvocatorPackage.CONTEXTS_LIST__ENVIRONMENT, ContextsList.class, msgs);
			msgs = basicSetContextsList(newContextsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST, newContextsList, newContextsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Context getActiveContext()
  {
		if (activeContext != null && activeContext.eIsProxy()) {
			InternalEObject oldActiveContext = (InternalEObject)activeContext;
			activeContext = (Context)eResolveProxy(oldActiveContext);
			if (activeContext != oldActiveContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT, oldActiveContext, activeContext));
			}
		}
		return activeContext;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Context basicGetActiveContext()
  {
		return activeContext;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setActiveContext(Context newActiveContext)
  {
		Context oldActiveContext = activeContext;
		activeContext = newActiveContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT, oldActiveContext, activeContext));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInvocatorSession((InvocatorSession)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				if (variablesList != null)
					msgs = ((InternalEObject)variablesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST, null, msgs);
				return basicSetVariablesList((VariablesList)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				if (contextsList != null)
					msgs = ((InternalEObject)contextsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST, null, msgs);
				return basicSetContextsList((ContextsList)otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				return basicSetInvocatorSession(null, msgs);
			case ApogyCoreInvocatorPackage.ENVIRONMENT__LOCAL_TYPES_LIST:
				return basicSetLocalTypesList(null, msgs);
			case ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				return basicSetVariablesList(null, msgs);
			case ApogyCoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				return basicSetContextsList(null, msgs);
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
			case ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT, InvocatorSession.class, msgs);
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
			case ApogyCoreInvocatorPackage.ENVIRONMENT__NAME:
				return getName();
			case ApogyCoreInvocatorPackage.ENVIRONMENT__DESCRIPTION:
				return getDescription();
			case ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				if (resolve) return getInvocatorSession();
				return basicGetInvocatorSession();
			case ApogyCoreInvocatorPackage.ENVIRONMENT__LOCAL_TYPES_LIST:
				return getLocalTypesList();
			case ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				return getVariablesList();
			case ApogyCoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				return getContextsList();
			case ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT:
				if (resolve) return getActiveContext();
				return basicGetActiveContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.ENVIRONMENT__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				setInvocatorSession((InvocatorSession)newValue);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__LOCAL_TYPES_LIST:
				setLocalTypesList((LocalTypesList)newValue);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				setVariablesList((VariablesList)newValue);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				setContextsList((ContextsList)newValue);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT:
				setActiveContext((Context)newValue);
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
			case ApogyCoreInvocatorPackage.ENVIRONMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				setInvocatorSession((InvocatorSession)null);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__LOCAL_TYPES_LIST:
				setLocalTypesList((LocalTypesList)null);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				setVariablesList((VariablesList)null);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				setContextsList((ContextsList)null);
				return;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT:
				setActiveContext((Context)null);
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
			case ApogyCoreInvocatorPackage.ENVIRONMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreInvocatorPackage.ENVIRONMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				return basicGetInvocatorSession() != null;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__LOCAL_TYPES_LIST:
				return localTypesList != null;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				return variablesList != null;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				return contextsList != null;
			case ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT:
				return activeContext != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case ApogyCoreInvocatorPackage.ENVIRONMENT__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCoreInvocatorPackage.ENVIRONMENT__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
