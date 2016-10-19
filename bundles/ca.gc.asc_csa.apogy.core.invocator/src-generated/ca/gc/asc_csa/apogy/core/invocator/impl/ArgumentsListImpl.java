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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.EClassArgument;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arguments List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentsListImpl#getOperationCall <em>Operation Call</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ArgumentsListImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentsListImpl extends MinimalEObjectImpl.Container implements ArgumentsList
{
  /**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
  protected EList<Argument> arguments;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ArgumentsListImpl()
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
		return ApogyCoreInvocatorPackage.Literals.ARGUMENTS_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCall getOperationCall()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL) return null;
		return (OperationCall)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCall basicGetOperationCall()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL) return null;
		return (OperationCall)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOperationCall(OperationCall newOperationCall, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newOperationCall, ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOperationCall(OperationCall newOperationCall)
  {
		if (newOperationCall != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL && newOperationCall != null)) {
			if (EcoreUtil.isAncestor(this, newOperationCall))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperationCall != null)
				msgs = ((InternalEObject)newOperationCall).eInverseAdd(this, ApogyCoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST, OperationCall.class, msgs);
			msgs = basicSetOperationCall(newOperationCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL, newOperationCall, newOperationCall));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Argument> getArguments()
  {
		if (arguments == null) {
			arguments = new EObjectContainmentWithInverseEList<Argument>(Argument.class, this, ApogyCoreInvocatorPackage.ARGUMENTS_LIST__ARGUMENTS, ApogyCoreInvocatorPackage.ARGUMENT__ARGUMENTS_LIST);
		}
		return arguments;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public List<?> getArgumentValues()
  {
      List<Object> list = new ArrayList<Object>();
	  
	  for (Argument argument: getArguments())
	  {
		  if(argument instanceof EClassArgument)
		  {
			  list.add(((EClassArgument)argument).getValue());
		  }
		  else
		  {
			  list.add(argument.getParameterValue());
		  }		  		
	  }	  
	  return list;
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
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperationCall((OperationCall)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__ARGUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArguments()).basicAdd(otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL:
				return basicSetOperationCall(null, msgs);
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST, OperationCall.class, msgs);
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
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL:
				if (resolve) return getOperationCall();
				return basicGetOperationCall();
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__ARGUMENTS:
				return getArguments();
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
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL:
				setOperationCall((OperationCall)newValue);
				return;
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
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
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL:
				setOperationCall((OperationCall)null);
				return;
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__ARGUMENTS:
				getArguments().clear();
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
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL:
				return basicGetOperationCall() != null;
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
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
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST___GET_ARGUMENT_VALUES:
				return getArgumentValues();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ArgumentsListImpl
