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
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;
import ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import com.google.common.base.Objects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Products List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListImpl#getDataProductsListsContainer <em>Data Products Lists Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListImpl#getOperationCallResultsList <em>Operation Call Results List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListImpl#getRecordingResultsList <em>Recording Results List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListImpl#getInvocatorSession <em>Invocator Session</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataProductsListImpl extends MinimalEObjectImpl.Container implements DataProductsList
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
	 * The cached value of the '{@link #getOperationCallResultsList() <em>Operation Call Results List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperationCallResultsList()
	 * @generated
	 * @ordered
	 */
  protected OperationCallResultsList operationCallResultsList;

  /**
	 * The cached value of the '{@link #getRecordingResultsList() <em>Recording Results List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRecordingResultsList()
	 * @generated
	 * @ordered
	 */
  protected RecordingResultsList recordingResultsList;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DataProductsListImpl()
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
		return ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsListsContainer getDataProductsListsContainer()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER) return null;
		return (DataProductsListsContainer)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsListsContainer basicGetDataProductsListsContainer()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER) return null;
		return (DataProductsListsContainer)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDataProductsListsContainer(DataProductsListsContainer newDataProductsListsContainer, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newDataProductsListsContainer, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDataProductsListsContainer(DataProductsListsContainer newDataProductsListsContainer)
  {
		if (newDataProductsListsContainer != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER && newDataProductsListsContainer != null)) {
			if (EcoreUtil.isAncestor(this, newDataProductsListsContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataProductsListsContainer != null)
				msgs = ((InternalEObject)newDataProductsListsContainer).eInverseAdd(this, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST, DataProductsListsContainer.class, msgs);
			msgs = basicSetDataProductsListsContainer(newDataProductsListsContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER, newDataProductsListsContainer, newDataProductsListsContainer));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallResultsList getOperationCallResultsList()
  {
		return operationCallResultsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOperationCallResultsList(OperationCallResultsList newOperationCallResultsList, NotificationChain msgs)
  {
		OperationCallResultsList oldOperationCallResultsList = operationCallResultsList;
		operationCallResultsList = newOperationCallResultsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST, oldOperationCallResultsList, newOperationCallResultsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOperationCallResultsList(OperationCallResultsList newOperationCallResultsList)
  {
		if (newOperationCallResultsList != operationCallResultsList) {
			NotificationChain msgs = null;
			if (operationCallResultsList != null)
				msgs = ((InternalEObject)operationCallResultsList).eInverseRemove(this, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST, OperationCallResultsList.class, msgs);
			if (newOperationCallResultsList != null)
				msgs = ((InternalEObject)newOperationCallResultsList).eInverseAdd(this, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST, OperationCallResultsList.class, msgs);
			msgs = basicSetOperationCallResultsList(newOperationCallResultsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST, newOperationCallResultsList, newOperationCallResultsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RecordingResultsList getRecordingResultsList()
  {
		return recordingResultsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRecordingResultsList(RecordingResultsList newRecordingResultsList, NotificationChain msgs)
  {
		RecordingResultsList oldRecordingResultsList = recordingResultsList;
		recordingResultsList = newRecordingResultsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST, oldRecordingResultsList, newRecordingResultsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRecordingResultsList(RecordingResultsList newRecordingResultsList)
  {
		if (newRecordingResultsList != recordingResultsList) {
			NotificationChain msgs = null;
			if (recordingResultsList != null)
				msgs = ((InternalEObject)recordingResultsList).eInverseRemove(this, ApogyCoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST, RecordingResultsList.class, msgs);
			if (newRecordingResultsList != null)
				msgs = ((InternalEObject)newRecordingResultsList).eInverseAdd(this, ApogyCoreInvocatorPackage.RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST, RecordingResultsList.class, msgs);
			msgs = basicSetRecordingResultsList(newRecordingResultsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST, newRecordingResultsList, newRecordingResultsList));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession getInvocatorSession() {
		DataProductsListsContainer _dataProductsListsContainer = this.getDataProductsListsContainer();
		boolean _equals = Objects.equal(_dataProductsListsContainer, null);
		if (_equals) {
			return null;
		}
		else {
			DataProductsListsContainer _dataProductsListsContainer_1 = this.getDataProductsListsContainer();
			return _dataProductsListsContainer_1.getInvocatorSession();
		}
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataProductsListsContainer((DataProductsListsContainer)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST:
				if (operationCallResultsList != null)
					msgs = ((InternalEObject)operationCallResultsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST, null, msgs);
				return basicSetOperationCallResultsList((OperationCallResultsList)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST:
				if (recordingResultsList != null)
					msgs = ((InternalEObject)recordingResultsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST, null, msgs);
				return basicSetRecordingResultsList((RecordingResultsList)otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER:
				return basicSetDataProductsListsContainer(null, msgs);
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST:
				return basicSetOperationCallResultsList(null, msgs);
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST:
				return basicSetRecordingResultsList(null, msgs);
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST, DataProductsListsContainer.class, msgs);
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__NAME:
				return getName();
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DESCRIPTION:
				return getDescription();
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER:
				if (resolve) return getDataProductsListsContainer();
				return basicGetDataProductsListsContainer();
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST:
				return getOperationCallResultsList();
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST:
				return getRecordingResultsList();
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__INVOCATOR_SESSION:
				return getInvocatorSession();
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER:
				setDataProductsListsContainer((DataProductsListsContainer)newValue);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST:
				setOperationCallResultsList((OperationCallResultsList)newValue);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST:
				setRecordingResultsList((RecordingResultsList)newValue);
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER:
				setDataProductsListsContainer((DataProductsListsContainer)null);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST:
				setOperationCallResultsList((OperationCallResultsList)null);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST:
				setRecordingResultsList((RecordingResultsList)null);
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER:
				return basicGetDataProductsListsContainer() != null;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST:
				return operationCallResultsList != null;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST:
				return recordingResultsList != null;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__INVOCATOR_SESSION:
				return getInvocatorSession() != null;
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
				case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
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
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DESCRIPTION;
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

} //DataProductsListImpl
