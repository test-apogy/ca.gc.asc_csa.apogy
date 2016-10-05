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

import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ContextsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList;

import com.google.common.base.Objects;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl#isArchived <em>Archived</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl#getContextsList <em>Contexts List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl#getVariableImplementationsList <em>Variable Implementations List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl#getDataProductsList <em>Data Products List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl#getInstancesCreationDate <em>Instances Creation Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ContextImpl#getInstancesDisposalDate <em>Instances Disposal Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContextImpl extends MinimalEObjectImpl.Container implements Context
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
	 * The default value of the '{@link #isArchived() <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARCHIVED_EDEFAULT = false;

		/**
	 * The cached value of the '{@link #isArchived() <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchived()
	 * @generated
	 * @ordered
	 */
	protected boolean archived = ARCHIVED_EDEFAULT;

		/**
	 * The cached value of the '{@link #getVariableImplementationsList() <em>Variable Implementations List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariableImplementationsList()
	 * @generated
	 * @ordered
	 */
  protected VariableImplementationsList variableImplementationsList;

  /**
	 * The cached value of the '{@link #getDataProductsList() <em>Data Products List</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataProductsList()
	 * @generated
	 * @ordered
	 */
  protected DataProductsList dataProductsList;

  /**
	 * The default value of the '{@link #getInstancesCreationDate() <em>Instances Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstancesCreationDate()
	 * @generated
	 * @ordered
	 */
  protected static final Date INSTANCES_CREATION_DATE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getInstancesCreationDate() <em>Instances Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstancesCreationDate()
	 * @generated
	 * @ordered
	 */
  protected Date instancesCreationDate = INSTANCES_CREATION_DATE_EDEFAULT;

  /**
	 * The default value of the '{@link #getInstancesDisposalDate() <em>Instances Disposal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstancesDisposalDate()
	 * @generated
	 * @ordered
	 */
  protected static final Date INSTANCES_DISPOSAL_DATE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getInstancesDisposalDate() <em>Instances Disposal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstancesDisposalDate()
	 * @generated
	 * @ordered
	 */
  protected Date instancesDisposalDate = INSTANCES_DISPOSAL_DATE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ContextImpl()
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
		return ApogyCoreInvocatorPackage.Literals.CONTEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.CONTEXT__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArchived() {
		return archived;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchived(boolean newArchived) {
		boolean oldArchived = archived;
		archived = newArchived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.CONTEXT__ARCHIVED, oldArchived, archived));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContextsList getContextsList()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST) return null;
		return (ContextsList)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContextsList basicGetContextsList()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST) return null;
		return (ContextsList)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetContextsList(ContextsList newContextsList, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newContextsList, ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setContextsList(ContextsList newContextsList)
  {
		if (newContextsList != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST && newContextsList != null)) {
			if (EcoreUtil.isAncestor(this, newContextsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContextsList != null)
				msgs = ((InternalEObject)newContextsList).eInverseAdd(this, ApogyCoreInvocatorPackage.CONTEXTS_LIST__CONTEXTS, ContextsList.class, msgs);
			msgs = basicSetContextsList(newContextsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST, newContextsList, newContextsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableImplementationsList getVariableImplementationsListGen()
  {
		return variableImplementationsList;
	}

  /**
   * @generated_NOT
   */
  public VariableImplementationsList getVariableImplementationsList()
  {
	  VariableImplementationsList list = getVariableImplementationsListGen();
	  if (list == null){
		  list = ApogyCoreInvocatorFactory.eINSTANCE.createVariableImplementationsList();
		  setVariableImplementationsList(list);
		  
		  /**
		   * Instantiate the variable implementations.
		   */
		  Iterator<Variable> variables = getEnvironment().getVariablesList().getVariables().iterator();
		  while (variables.hasNext()){
			  Variable variable = variables.next();
			  VariableImplementation variableImplementation = ApogyCoreInvocatorFactory.eINSTANCE.createVariableImplementation();
			  variableImplementation.setVariable(variable);
			  
			  /** Create TypeMemberImplementations. */
			  variableImplementation.getTypeMemberImplementations().addAll(ApogyCoreInvocatorFacade.INSTANCE.createTypeMemberImplementations(variable.getVariableType()));			  
			  
			  list.getVariableImplementations().add(variableImplementation);
		  }
	  }
    return list;
  }
    
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariableImplementationsList(VariableImplementationsList newVariableImplementationsList, NotificationChain msgs)
  {
		VariableImplementationsList oldVariableImplementationsList = variableImplementationsList;
		variableImplementationsList = newVariableImplementationsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST, oldVariableImplementationsList, newVariableImplementationsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableImplementationsList(VariableImplementationsList newVariableImplementationsList)
  {
		if (newVariableImplementationsList != variableImplementationsList) {
			NotificationChain msgs = null;
			if (variableImplementationsList != null)
				msgs = ((InternalEObject)variableImplementationsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST, null, msgs);
			if (newVariableImplementationsList != null)
				msgs = ((InternalEObject)newVariableImplementationsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST, null, msgs);
			msgs = basicSetVariableImplementationsList(newVariableImplementationsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST, newVariableImplementationsList, newVariableImplementationsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Environment getEnvironment()
  {
		ContextsList _contextsList = this.getContextsList();
		boolean _equals = Objects.equal(_contextsList, null);
		if (_equals) {
			return null;
		}
		else {
			ContextsList _contextsList_1 = this.getContextsList();
			return _contextsList_1.getEnvironment();
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsList getDataProductsList()
  {
		if (dataProductsList != null && dataProductsList.eIsProxy()) {
			InternalEObject oldDataProductsList = (InternalEObject)dataProductsList;
			dataProductsList = (DataProductsList)eResolveProxy(oldDataProductsList);
			if (dataProductsList != oldDataProductsList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST, oldDataProductsList, dataProductsList));
			}
		}
		return dataProductsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsList basicGetDataProductsList()
  {
		return dataProductsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDataProductsList(DataProductsList newDataProductsList)
  {
		DataProductsList oldDataProductsList = dataProductsList;
		dataProductsList = newDataProductsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST, oldDataProductsList, dataProductsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date getInstancesCreationDate()
  {
		return instancesCreationDate;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInstancesCreationDate(Date newInstancesCreationDate)
  {
		Date oldInstancesCreationDate = instancesCreationDate;
		instancesCreationDate = newInstancesCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE, oldInstancesCreationDate, instancesCreationDate));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date getInstancesDisposalDate()
  {
		return instancesDisposalDate;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInstancesDisposalDate(Date newInstancesDisposalDate)
  {
		Date oldInstancesDisposalDate = instancesDisposalDate;
		instancesDisposalDate = newInstancesDisposalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE, oldInstancesDisposalDate, instancesDisposalDate));
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
			case ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				return basicSetContextsList(null, msgs);
			case ApogyCoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST:
				return basicSetVariableImplementationsList(null, msgs);
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
			case ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.CONTEXTS_LIST__CONTEXTS, ContextsList.class, msgs);
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
			case ApogyCoreInvocatorPackage.CONTEXT__NAME:
				return getName();
			case ApogyCoreInvocatorPackage.CONTEXT__ARCHIVED:
				return isArchived();
			case ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				if (resolve) return getContextsList();
				return basicGetContextsList();
			case ApogyCoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST:
				return getVariableImplementationsList();
			case ApogyCoreInvocatorPackage.CONTEXT__ENVIRONMENT:
				return getEnvironment();
			case ApogyCoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST:
				if (resolve) return getDataProductsList();
				return basicGetDataProductsList();
			case ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE:
				return getInstancesCreationDate();
			case ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE:
				return getInstancesDisposalDate();
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
			case ApogyCoreInvocatorPackage.CONTEXT__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__ARCHIVED:
				setArchived((Boolean)newValue);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				setContextsList((ContextsList)newValue);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST:
				setVariableImplementationsList((VariableImplementationsList)newValue);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST:
				setDataProductsList((DataProductsList)newValue);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE:
				setInstancesCreationDate((Date)newValue);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE:
				setInstancesDisposalDate((Date)newValue);
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
			case ApogyCoreInvocatorPackage.CONTEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__ARCHIVED:
				setArchived(ARCHIVED_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				setContextsList((ContextsList)null);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST:
				setVariableImplementationsList((VariableImplementationsList)null);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST:
				setDataProductsList((DataProductsList)null);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE:
				setInstancesCreationDate(INSTANCES_CREATION_DATE_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE:
				setInstancesDisposalDate(INSTANCES_DISPOSAL_DATE_EDEFAULT);
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
			case ApogyCoreInvocatorPackage.CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreInvocatorPackage.CONTEXT__ARCHIVED:
				return archived != ARCHIVED_EDEFAULT;
			case ApogyCoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				return basicGetContextsList() != null;
			case ApogyCoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST:
				return variableImplementationsList != null;
			case ApogyCoreInvocatorPackage.CONTEXT__ENVIRONMENT:
				return getEnvironment() != null;
			case ApogyCoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST:
				return dataProductsList != null;
			case ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE:
				return INSTANCES_CREATION_DATE_EDEFAULT == null ? instancesCreationDate != null : !INSTANCES_CREATION_DATE_EDEFAULT.equals(instancesCreationDate);
			case ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE:
				return INSTANCES_DISPOSAL_DATE_EDEFAULT == null ? instancesDisposalDate != null : !INSTANCES_DISPOSAL_DATE_EDEFAULT.equals(instancesDisposalDate);
		}
		return super.eIsSet(featureID);
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
		result.append(", archived: ");
		result.append(archived);
		result.append(", instancesCreationDate: ");
		result.append(instancesCreationDate);
		result.append(", instancesDisposalDate: ");
		result.append(instancesDisposalDate);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
