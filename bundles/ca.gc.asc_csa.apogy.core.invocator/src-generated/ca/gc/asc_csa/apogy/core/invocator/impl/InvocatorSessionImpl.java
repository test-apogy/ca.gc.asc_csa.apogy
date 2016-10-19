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
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ToolsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocator Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.InvocatorSessionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.InvocatorSessionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.InvocatorSessionImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.InvocatorSessionImpl#getProgramsList <em>Programs List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.InvocatorSessionImpl#getProgramRuntimesList <em>Program Runtimes List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.InvocatorSessionImpl#getDataProductsListContainer <em>Data Products List Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.InvocatorSessionImpl#getToolsList <em>Tools List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvocatorSessionImpl extends MinimalEObjectImpl.Container implements InvocatorSession
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
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
  protected Environment environment;

  /**
	 * The cached value of the '{@link #getProgramsList() <em>Programs List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProgramsList()
	 * @generated
	 * @ordered
	 */
  protected ProgramsList programsList;

  /**
	 * The cached value of the '{@link #getProgramRuntimesList() <em>Program Runtimes List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramRuntimesList()
	 * @generated
	 * @ordered
	 */
	protected ProgramRuntimesList programRuntimesList;

		/**
	 * The cached value of the '{@link #getDataProductsListContainer() <em>Data Products List Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataProductsListContainer()
	 * @generated
	 * @ordered
	 */
  protected DataProductsListsContainer dataProductsListContainer;

  /**
	 * The cached value of the '{@link #getToolsList() <em>Tools List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getToolsList()
	 * @generated
	 * @ordered
	 */
  protected ToolsList toolsList;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSessionImpl()
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
		return ApogyCoreInvocatorPackage.Literals.INVOCATOR_SESSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Environment getEnvironment()
  {
		return environment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs)
  {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEnvironment(Environment newEnvironment)
  {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION, Environment.class, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION, Environment.class, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT, newEnvironment, newEnvironment));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProgramsList getProgramsList()
  {
		return programsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetProgramsList(ProgramsList newProgramsList, NotificationChain msgs)
  {
		ProgramsList oldProgramsList = programsList;
		programsList = newProgramsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST, oldProgramsList, newProgramsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setProgramsList(ProgramsList newProgramsList)
  {
		if (newProgramsList != programsList) {
			NotificationChain msgs = null;
			if (programsList != null)
				msgs = ((InternalEObject)programsList).eInverseRemove(this, ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION, ProgramsList.class, msgs);
			if (newProgramsList != null)
				msgs = ((InternalEObject)newProgramsList).eInverseAdd(this, ApogyCoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION, ProgramsList.class, msgs);
			msgs = basicSetProgramsList(newProgramsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST, newProgramsList, newProgramsList));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramRuntimesList getProgramRuntimesList() {
		return programRuntimesList;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramRuntimesList(ProgramRuntimesList newProgramRuntimesList, NotificationChain msgs) {
		ProgramRuntimesList oldProgramRuntimesList = programRuntimesList;
		programRuntimesList = newProgramRuntimesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST, oldProgramRuntimesList, newProgramRuntimesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramRuntimesList(ProgramRuntimesList newProgramRuntimesList) {
		if (newProgramRuntimesList != programRuntimesList) {
			NotificationChain msgs = null;
			if (programRuntimesList != null)
				msgs = ((InternalEObject)programRuntimesList).eInverseRemove(this, ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION, ProgramRuntimesList.class, msgs);
			if (newProgramRuntimesList != null)
				msgs = ((InternalEObject)newProgramRuntimesList).eInverseAdd(this, ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST__SESSION, ProgramRuntimesList.class, msgs);
			msgs = basicSetProgramRuntimesList(newProgramRuntimesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST, newProgramRuntimesList, newProgramRuntimesList));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsListsContainer getDataProductsListContainer()
  {
		return dataProductsListContainer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDataProductsListContainer(DataProductsListsContainer newDataProductsListContainer, NotificationChain msgs)
  {
		DataProductsListsContainer oldDataProductsListContainer = dataProductsListContainer;
		dataProductsListContainer = newDataProductsListContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER, oldDataProductsListContainer, newDataProductsListContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDataProductsListContainer(DataProductsListsContainer newDataProductsListContainer)
  {
		if (newDataProductsListContainer != dataProductsListContainer) {
			NotificationChain msgs = null;
			if (dataProductsListContainer != null)
				msgs = ((InternalEObject)dataProductsListContainer).eInverseRemove(this, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION, DataProductsListsContainer.class, msgs);
			if (newDataProductsListContainer != null)
				msgs = ((InternalEObject)newDataProductsListContainer).eInverseAdd(this, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION, DataProductsListsContainer.class, msgs);
			msgs = basicSetDataProductsListContainer(newDataProductsListContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER, newDataProductsListContainer, newDataProductsListContainer));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ToolsList getToolsList()
  {
		return toolsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetToolsList(ToolsList newToolsList, NotificationChain msgs)
  {
		ToolsList oldToolsList = toolsList;
		toolsList = newToolsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__TOOLS_LIST, oldToolsList, newToolsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setToolsList(ToolsList newToolsList)
  {
		if (newToolsList != toolsList) {
			NotificationChain msgs = null;
			if (toolsList != null)
				msgs = ((InternalEObject)toolsList).eInverseRemove(this, ApogyCoreInvocatorPackage.TOOLS_LIST__INVOCATOR_SESSION, ToolsList.class, msgs);
			if (newToolsList != null)
				msgs = ((InternalEObject)newToolsList).eInverseAdd(this, ApogyCoreInvocatorPackage.TOOLS_LIST__INVOCATOR_SESSION, ToolsList.class, msgs);
			msgs = basicSetToolsList(newToolsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__TOOLS_LIST, newToolsList, newToolsList));
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
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT:
				if (environment != null)
					msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT, null, msgs);
				return basicSetEnvironment((Environment)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST:
				if (programsList != null)
					msgs = ((InternalEObject)programsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST, null, msgs);
				return basicSetProgramsList((ProgramsList)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST:
				if (programRuntimesList != null)
					msgs = ((InternalEObject)programRuntimesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST, null, msgs);
				return basicSetProgramRuntimesList((ProgramRuntimesList)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER:
				if (dataProductsListContainer != null)
					msgs = ((InternalEObject)dataProductsListContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER, null, msgs);
				return basicSetDataProductsListContainer((DataProductsListsContainer)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__TOOLS_LIST:
				if (toolsList != null)
					msgs = ((InternalEObject)toolsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.INVOCATOR_SESSION__TOOLS_LIST, null, msgs);
				return basicSetToolsList((ToolsList)otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST:
				return basicSetProgramsList(null, msgs);
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST:
				return basicSetProgramRuntimesList(null, msgs);
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER:
				return basicSetDataProductsListContainer(null, msgs);
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__TOOLS_LIST:
				return basicSetToolsList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__NAME:
				return getName();
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DESCRIPTION:
				return getDescription();
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT:
				return getEnvironment();
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST:
				return getProgramsList();
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST:
				return getProgramRuntimesList();
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER:
				return getDataProductsListContainer();
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__TOOLS_LIST:
				return getToolsList();
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
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST:
				setProgramsList((ProgramsList)newValue);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST:
				setProgramRuntimesList((ProgramRuntimesList)newValue);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER:
				setDataProductsListContainer((DataProductsListsContainer)newValue);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__TOOLS_LIST:
				setToolsList((ToolsList)newValue);
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
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST:
				setProgramsList((ProgramsList)null);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST:
				setProgramRuntimesList((ProgramRuntimesList)null);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER:
				setDataProductsListContainer((DataProductsListsContainer)null);
				return;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__TOOLS_LIST:
				setToolsList((ToolsList)null);
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
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT:
				return environment != null;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST:
				return programsList != null;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__PROGRAM_RUNTIMES_LIST:
				return programRuntimesList != null;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER:
				return dataProductsListContainer != null;
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__TOOLS_LIST:
				return toolsList != null;
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
				case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
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
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DESCRIPTION;
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

} //InvocatorSessionImpl
