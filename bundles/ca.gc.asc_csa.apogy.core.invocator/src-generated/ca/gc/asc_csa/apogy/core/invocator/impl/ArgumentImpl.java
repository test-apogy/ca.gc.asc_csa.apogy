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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import com.google.common.base.Objects;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentImpl#getArgumentsList <em>Arguments List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentImpl#getOperationCall <em>Operation Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArgumentImpl extends MinimalEObjectImpl.Container implements Argument
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ArgumentImpl()
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
		return ApogyCoreInvocatorPackage.Literals.ARGUMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ArgumentsList getArgumentsList()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST) return null;
		return (ArgumentsList)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ArgumentsList basicGetArgumentsList()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST) return null;
		return (ArgumentsList)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetArgumentsList(ArgumentsList newArgumentsList, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newArgumentsList, ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setArgumentsList(ArgumentsList newArgumentsList)
  {
		if (newArgumentsList != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST && newArgumentsList != null)) {
			if (EcoreUtil.isAncestor(this, newArgumentsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newArgumentsList != null)
				msgs = ((InternalEObject)newArgumentsList).eInverseAdd(this, ApogyCoreInvocatorPackage.ARGUMENTS_LIST__ARGUMENTS, ArgumentsList.class, msgs);
			msgs = basicSetArgumentsList(newArgumentsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST, newArgumentsList, newArgumentsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCall getOperationCall()
  {
		ArgumentsList _argumentsList = this.getArgumentsList();
		boolean _equals = Objects.equal(_argumentsList, null);
		if (_equals) {
			return null;
		}
		else {
			ArgumentsList _argumentsList_1 = this.getArgumentsList();
			return _argumentsList_1.getOperationCall();
		}
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EParameter getEParameter()
  {
	  int index = getArgumentsList().getArguments().indexOf(this);
	  return getOperationCall().getEOperation().getEParameters().get(index);
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Object getParameterValue()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetArgumentsList((ArgumentsList)otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST:
				return basicSetArgumentsList(null, msgs);
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
			case ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.ARGUMENTS_LIST__ARGUMENTS, ArgumentsList.class, msgs);
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
			case ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST:
				if (resolve) return getArgumentsList();
				return basicGetArgumentsList();
			case ApogyCoreInvocatorPackage.ARGUMENT__OPERATION_CALL:
				return getOperationCall();
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
			case ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST:
				setArgumentsList((ArgumentsList)newValue);
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
			case ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST:
				setArgumentsList((ArgumentsList)null);
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
			case ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST:
				return basicGetArgumentsList() != null;
			case ApogyCoreInvocatorPackage.ARGUMENT__OPERATION_CALL:
				return getOperationCall() != null;
		}
		return super.eIsSet(featureID);
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
			case ApogyCoreInvocatorPackage.ARGUMENT___GET_EPARAMETER:
				return getEParameter();
			case ApogyCoreInvocatorPackage.ARGUMENT___GET_PARAMETER_VALUE:
				return getParameterValue();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ArgumentImpl
