package ca.gc.asc_csa.apogy.core.programs.controllers.impl;
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.core.invocator.impl.EDataTypeArgumentImpl;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.FixedValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Value Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.FixedValueSourceImpl#getBindedEDataTypeArgument <em>Binded EData Type Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedValueSourceImpl extends EDataTypeArgumentImpl implements FixedValueSource
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FixedValueSourceImpl()
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
		return ApogyCoreProgramsControllersPackage.Literals.FIXED_VALUE_SOURCE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BindedEDataTypeArgument getBindedEDataTypeArgument()
  {
		if (eContainerFeatureID() != ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT) return null;
		return (BindedEDataTypeArgument)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BindedEDataTypeArgument basicGetBindedEDataTypeArgument()
  {
		if (eContainerFeatureID() != ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT) return null;
		return (BindedEDataTypeArgument)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetBindedEDataTypeArgument(BindedEDataTypeArgument newBindedEDataTypeArgument, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newBindedEDataTypeArgument, ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setBindedEDataTypeArgument(BindedEDataTypeArgument newBindedEDataTypeArgument)
  {
		if (newBindedEDataTypeArgument != eInternalContainer() || (eContainerFeatureID() != ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT && newBindedEDataTypeArgument != null)) {
			if (EcoreUtil.isAncestor(this, newBindedEDataTypeArgument))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBindedEDataTypeArgument != null)
				msgs = ((InternalEObject)newBindedEDataTypeArgument).eInverseAdd(this, ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE, BindedEDataTypeArgument.class, msgs);
			msgs = basicSetBindedEDataTypeArgument(newBindedEDataTypeArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT, newBindedEDataTypeArgument, newBindedEDataTypeArgument));
	}



  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Object getSourceValue()
  {	  
	  return getParameterValue();
  }
  
  @Override
  public EParameter getEParameter() 
  {	  
	  return getBindedEDataTypeArgument().getEParameter();
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
			case ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBindedEDataTypeArgument((BindedEDataTypeArgument)otherEnd, msgs);
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
			case ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				return basicSetBindedEDataTypeArgument(null, msgs);
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
			case ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				return eInternalContainer().eInverseRemove(this, ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE, BindedEDataTypeArgument.class, msgs);
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
			case ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				if (resolve) return getBindedEDataTypeArgument();
				return basicGetBindedEDataTypeArgument();
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
			case ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				setBindedEDataTypeArgument((BindedEDataTypeArgument)newValue);
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
			case ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				setBindedEDataTypeArgument((BindedEDataTypeArgument)null);
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
			case ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				return basicGetBindedEDataTypeArgument() != null;
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
		if (baseClass == ValueSource.class) {
			switch (derivedFeatureID) {
				case ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT: return ApogyCoreProgramsControllersPackage.VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT;
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
		if (baseClass == ValueSource.class) {
			switch (baseFeatureID) {
				case ApogyCoreProgramsControllersPackage.VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT: return ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT;
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
  public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
  {
		if (baseClass == ValueSource.class) {
			switch (baseOperationID) {
				case ApogyCoreProgramsControllersPackage.VALUE_SOURCE___GET_SOURCE_VALUE: return ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE___GET_SOURCE_VALUE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE___GET_SOURCE_VALUE:
				return getSourceValue();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FixedValueSourceImpl
