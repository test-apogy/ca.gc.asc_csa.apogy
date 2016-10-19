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
import ca.gc.asc_csa.apogy.common.emf.ListRootNode;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableFeatureReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableFeatureReferenceImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableFeatureReferenceImpl#getTypeMemberReferenceListElement <em>Type Member Reference List Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableFeatureReferenceImpl#getFeatureRoot <em>Feature Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableFeatureReferenceImpl extends MinimalEObjectImpl.Container implements VariableFeatureReference
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
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
  protected Variable variable;

  /**
	 * The cached value of the '{@link #getTypeMemberReferenceListElement() <em>Type Member Reference List Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 * @ordered
	 */
  protected TypeMemberReferenceListElement typeMemberReferenceListElement;

  /**
	 * The cached value of the '{@link #getFeatureRoot() <em>Feature Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFeatureRoot()
	 * @generated
	 * @ordered
	 */
  protected ListRootNode featureRoot;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableFeatureReferenceImpl()
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
		return ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE, oldVariable, variable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE, oldVariable, variable));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceListElement getTypeMemberReferenceListElement()
  {
		return typeMemberReferenceListElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTypeMemberReferenceListElement(TypeMemberReferenceListElement newTypeMemberReferenceListElement, NotificationChain msgs)
  {
		TypeMemberReferenceListElement oldTypeMemberReferenceListElement = typeMemberReferenceListElement;
		typeMemberReferenceListElement = newTypeMemberReferenceListElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT, oldTypeMemberReferenceListElement, newTypeMemberReferenceListElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTypeMemberReferenceListElement(TypeMemberReferenceListElement newTypeMemberReferenceListElement)
  {
		if (newTypeMemberReferenceListElement != typeMemberReferenceListElement) {
			NotificationChain msgs = null;
			if (typeMemberReferenceListElement != null)
				msgs = ((InternalEObject)typeMemberReferenceListElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT, null, msgs);
			if (newTypeMemberReferenceListElement != null)
				msgs = ((InternalEObject)newTypeMemberReferenceListElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT, null, msgs);
			msgs = basicSetTypeMemberReferenceListElement(newTypeMemberReferenceListElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT, newTypeMemberReferenceListElement, newTypeMemberReferenceListElement));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ListRootNode getFeatureRoot()
  {
		return featureRoot;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureRoot(ListRootNode newFeatureRoot, NotificationChain msgs) {
		ListRootNode oldFeatureRoot = featureRoot;
		featureRoot = newFeatureRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT, oldFeatureRoot, newFeatureRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureRoot(ListRootNode newFeatureRoot) {
		if (newFeatureRoot != featureRoot) {
			NotificationChain msgs = null;
			if (featureRoot != null)
				msgs = ((InternalEObject)featureRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT, null, msgs);
			if (newFeatureRoot != null)
				msgs = ((InternalEObject)newFeatureRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT, null, msgs);
			msgs = basicSetFeatureRoot(newFeatureRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT, newFeatureRoot, newFeatureRoot));
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
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT:
				return basicSetTypeMemberReferenceListElement(null, msgs);
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT:
				return basicSetFeatureRoot(null, msgs);
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
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__NAME:
				return getName();
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT:
				return getTypeMemberReferenceListElement();
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT:
				return getFeatureRoot();
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
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT:
				setTypeMemberReferenceListElement((TypeMemberReferenceListElement)newValue);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT:
				setFeatureRoot((ListRootNode)newValue);
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
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE:
				setVariable((Variable)null);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT:
				setTypeMemberReferenceListElement((TypeMemberReferenceListElement)null);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT:
				setFeatureRoot((ListRootNode)null);
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
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE:
				return variable != null;
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT:
				return typeMemberReferenceListElement != null;
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT:
				return featureRoot != null;
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //VariableFeatureReferenceImpl
