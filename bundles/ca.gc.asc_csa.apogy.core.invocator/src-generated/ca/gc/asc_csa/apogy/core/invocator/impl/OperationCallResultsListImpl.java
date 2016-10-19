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
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResult;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import com.google.common.base.Objects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call Results List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListImpl#getResults <em>Results</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListImpl#getDataProductsList <em>Data Products List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListImpl#getInvocatorSession <em>Invocator Session</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationCallResultsListImpl extends MinimalEObjectImpl.Container implements OperationCallResultsList
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
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractResult> results;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallResultsListImpl()
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
		return ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_RESULTS_LIST;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__NAME, oldName, name));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DESCRIPTION, oldDescription, description));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractResult> getResults() {
		if (results == null) {
			results = new EObjectContainmentWithInverseEList<AbstractResult>(AbstractResult.class, this, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__RESULTS, ApogyCoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST);
		}
		return results;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProductsList getDataProductsList() {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST) return null;
		return (DataProductsList)eContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProductsList basicGetDataProductsList() {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST) return null;
		return (DataProductsList)eInternalContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataProductsList(DataProductsList newDataProductsList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataProductsList, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST, msgs);
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataProductsList(DataProductsList newDataProductsList) {
		if (newDataProductsList != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST && newDataProductsList != null)) {
			if (EcoreUtil.isAncestor(this, newDataProductsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataProductsList != null)
				msgs = ((InternalEObject)newDataProductsList).eInverseAdd(this, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST, DataProductsList.class, msgs);
			msgs = basicSetDataProductsList(newDataProductsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST, newDataProductsList, newDataProductsList));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession getInvocatorSession() {
		DataProductsList _dataProductsList = this.getDataProductsList();
		boolean _equals = Objects.equal(_dataProductsList, null);
		if (_equals) {
			return null;
		}
		else {
			DataProductsList _dataProductsList_1 = this.getDataProductsList();
			return _dataProductsList_1.getInvocatorSession();
		}
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__RESULTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResults()).basicAdd(otherEnd, msgs);
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataProductsList((DataProductsList)otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST:
				return basicSetDataProductsList(null, msgs);
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST, DataProductsList.class, msgs);
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__NAME:
				return getName();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DESCRIPTION:
				return getDescription();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__RESULTS:
				return getResults();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST:
				if (resolve) return getDataProductsList();
				return basicGetDataProductsList();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__INVOCATOR_SESSION:
				return getInvocatorSession();
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends AbstractResult>)newValue);
				return;
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST:
				setDataProductsList((DataProductsList)newValue);
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__RESULTS:
				getResults().clear();
				return;
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST:
				setDataProductsList((DataProductsList)null);
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__RESULTS:
				return results != null && !results.isEmpty();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST:
				return basicGetDataProductsList() != null;
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__INVOCATOR_SESSION:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST__DESCRIPTION;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //OperationCallResultsListImpl
