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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentImpl;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binded EData Type Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.BindedEDataTypeArgumentImpl#getValueSource <em>Value Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindedEDataTypeArgumentImpl extends ArgumentImpl implements BindedEDataTypeArgument
{
  /**
	 * The cached value of the '{@link #getValueSource() <em>Value Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValueSource()
	 * @generated
	 * @ordered
	 */
  protected ValueSource valueSource;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BindedEDataTypeArgumentImpl()
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
		return ApogyCoreProgramsControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ValueSource getValueSource()
  {
		return valueSource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetValueSource(ValueSource newValueSource, NotificationChain msgs)
  {
		ValueSource oldValueSource = valueSource;
		valueSource = newValueSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE, oldValueSource, newValueSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValueSource(ValueSource newValueSource)
  {
		if (newValueSource != valueSource) {
			NotificationChain msgs = null;
			if (valueSource != null)
				msgs = ((InternalEObject)valueSource).eInverseRemove(this, ApogyCoreProgramsControllersPackage.VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT, ValueSource.class, msgs);
			if (newValueSource != null)
				msgs = ((InternalEObject)newValueSource).eInverseAdd(this, ApogyCoreProgramsControllersPackage.VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT, ValueSource.class, msgs);
			msgs = basicSetValueSource(newValueSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE, newValueSource, newValueSource));
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
			case ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE:
				if (valueSource != null)
					msgs = ((InternalEObject)valueSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE, null, msgs);
				return basicSetValueSource((ValueSource)otherEnd, msgs);
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
			case ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE:
				return basicSetValueSource(null, msgs);
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
			case ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE:
				return getValueSource();
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
			case ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE:
				setValueSource((ValueSource)newValue);
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
			case ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE:
				setValueSource((ValueSource)null);
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
			case ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE:
				return valueSource != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
	public Object getParameterValue() 
    {
	  if(getValueSource() != null) return getValueSource().getSourceValue();
	  else return null;
	} 
} //BindedEDataTypeArgumentImpl
