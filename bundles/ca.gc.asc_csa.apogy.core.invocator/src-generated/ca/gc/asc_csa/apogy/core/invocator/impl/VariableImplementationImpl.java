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
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImplementationImpl#getVariableImplementationsList <em>Variable Implementations List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImplementationImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImplementationImpl extends AbstractTypeImplementationImpl implements VariableImplementation
{
  /**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
  protected Variable variable;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableImplementationImpl()
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
		return ApogyCoreInvocatorPackage.Literals.VARIABLE_IMPLEMENTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableImplementationsList getVariableImplementationsList()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST) return null;
		return (VariableImplementationsList)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableImplementationsList basicGetVariableImplementationsList()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST) return null;
		return (VariableImplementationsList)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariableImplementationsList(VariableImplementationsList newVariableImplementationsList, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newVariableImplementationsList, ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableImplementationsList(VariableImplementationsList newVariableImplementationsList)
  {
		if (newVariableImplementationsList != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST && newVariableImplementationsList != null)) {
			if (EcoreUtil.isAncestor(this, newVariableImplementationsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableImplementationsList != null)
				msgs = ((InternalEObject)newVariableImplementationsList).eInverseAdd(this, ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS, VariableImplementationsList.class, msgs);
			msgs = basicSetVariableImplementationsList(newVariableImplementationsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST, newVariableImplementationsList, newVariableImplementationsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable getVariable()
  {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable basicGetVariable()
  {
		return variable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariable(Variable newVariable)
  {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE, oldVariable, variable));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Type basicGetHandlingType()
  {
	  return getVariable() == null ? null : getVariable().getVariableType();
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
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableImplementationsList((VariableImplementationsList)otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
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
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS, VariableImplementationsList.class, msgs);
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
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				if (resolve) return getVariableImplementationsList();
				return basicGetVariableImplementationsList();
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
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
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				setVariableImplementationsList((VariableImplementationsList)newValue);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE:
				setVariable((Variable)newValue);
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
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				setVariableImplementationsList((VariableImplementationsList)null);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE:
				setVariable((Variable)null);
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
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				return basicGetVariableImplementationsList() != null;
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableImplementationImpl
