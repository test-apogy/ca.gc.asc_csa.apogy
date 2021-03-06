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
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Abstract Type Implementation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractTypeImplementationImpl#getTypeMemberImplementations <em>Type Member Implementations</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractTypeImplementationImpl#getImplementationClass <em>Implementation Class</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractTypeImplementationImpl#getAbstractInitializationData <em>Abstract Initialization Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractTypeImplementationImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractTypeImplementationImpl#getAdapterInstance <em>Adapter Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.AbstractTypeImplementationImpl#getHandlingType <em>Handling Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTypeImplementationImpl extends
		MinimalEObjectImpl.Container implements AbstractTypeImplementation {
	/**
	 * The cached value of the '{@link #getTypeMemberImplementations()
	 * <em>Type Member Implementations</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypeMemberImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMemberImplementation> typeMemberImplementations;

	/**
	 * The cached value of the '{@link #getImplementationClass() <em>Implementation Class</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getImplementationClass()
	 * @generated
	 * @ordered
	 */
	protected EClass implementationClass;

	/**
	 * The cached value of the '{@link #getAbstractInitializationData()
	 * <em>Abstract Initialization Data</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAbstractInitializationData()
	 * @generated
	 * @ordered
	 */
	protected AbstractInitializationData abstractInitializationData;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EObject instance;

	/**
	 * The cached value of the '{@link #getAdapterInstance() <em>Adapter Instance</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAdapterInstance()
	 * @generated
	 * @ordered
	 */
	protected TypeApiAdapter adapterInstance;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMemberImplementation> getTypeMemberImplementations() {
		if (typeMemberImplementations == null) {
			typeMemberImplementations = new EObjectContainmentEList<TypeMemberImplementation>(TypeMemberImplementation.class, this, ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS);
		}
		return typeMemberImplementations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationClass() {
		if (implementationClass != null && implementationClass.eIsProxy()) {
			InternalEObject oldImplementationClass = (InternalEObject)implementationClass;
			implementationClass = (EClass)eResolveProxy(oldImplementationClass);
			if (implementationClass != oldImplementationClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS, oldImplementationClass, implementationClass));
			}
		}
		return implementationClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetImplementationClass() {
		return implementationClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationClass(EClass newImplementationClass) {
		EClass oldImplementationClass = implementationClass;
		implementationClass = newImplementationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS, oldImplementationClass, implementationClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInitializationData getAbstractInitializationData() {
		return abstractInitializationData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractInitializationData(
			AbstractInitializationData newAbstractInitializationData,
			NotificationChain msgs) {
		AbstractInitializationData oldAbstractInitializationData = abstractInitializationData;
		abstractInitializationData = newAbstractInitializationData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA, oldAbstractInitializationData, newAbstractInitializationData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractInitializationData(
			AbstractInitializationData newAbstractInitializationData) {
		if (newAbstractInitializationData != abstractInitializationData) {
			NotificationChain msgs = null;
			if (abstractInitializationData != null)
				msgs = ((InternalEObject)abstractInitializationData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA, null, msgs);
			if (newAbstractInitializationData != null)
				msgs = ((InternalEObject)newAbstractInitializationData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA, null, msgs);
			msgs = basicSetAbstractInitializationData(newAbstractInitializationData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA, newAbstractInitializationData, newAbstractInitializationData));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(EObject newInstance) {
		EObject oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeApiAdapter getAdapterInstance() {
		if (adapterInstance != null && adapterInstance.eIsProxy()) {
			InternalEObject oldAdapterInstance = (InternalEObject)adapterInstance;
			adapterInstance = (TypeApiAdapter)eResolveProxy(oldAdapterInstance);
			if (adapterInstance != oldAdapterInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ADAPTER_INSTANCE, oldAdapterInstance, adapterInstance));
			}
		}
		return adapterInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeApiAdapter basicGetAdapterInstance() {
		return adapterInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapterInstance(TypeApiAdapter newAdapterInstance) {
		TypeApiAdapter oldAdapterInstance = adapterInstance;
		adapterInstance = newAdapterInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ADAPTER_INSTANCE, oldAdapterInstance, adapterInstance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Type getHandlingType() {
		Type handlingType = basicGetHandlingType();
		return handlingType != null && handlingType.eIsProxy() ? (Type) eResolveProxy((InternalEObject) handlingType)
				: handlingType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	abstract public Type basicGetHandlingType();

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public TypeMemberImplementation getTypeMemberImplementation(String name)
  {
	  TypeMemberImplementation result = null;

		Iterator<TypeMemberImplementation> iterator = getTypeMemberImplementations()
				.iterator();
		while (iterator.hasNext() && result == null) {
			TypeMemberImplementation current = iterator.next();

			if (current.getTypeMember().getName().equals(name)) {
				result = current;
			}
		}

		return result;  }

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public TypeMemberImplementation getTypeMemberImplementation(
			TypeMember typeMember) {
		TypeMemberImplementation result = null;
		Iterator<TypeMemberImplementation> typeMemberImplementations = getTypeMemberImplementations()
				.iterator();
		while (typeMemberImplementations.hasNext() && result == null) {
			TypeMemberImplementation current = typeMemberImplementations.next();
			if (current.getTypeMember() == typeMember) {
				result = current;
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS:
				return ((InternalEList<?>)getTypeMemberImplementations()).basicRemove(otherEnd, msgs);
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA:
				return basicSetAbstractInitializationData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS:
				return getTypeMemberImplementations();
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS:
				if (resolve) return getImplementationClass();
				return basicGetImplementationClass();
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA:
				return getAbstractInitializationData();
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ADAPTER_INSTANCE:
				if (resolve) return getAdapterInstance();
				return basicGetAdapterInstance();
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__HANDLING_TYPE:
				if (resolve) return getHandlingType();
				return basicGetHandlingType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS:
				getTypeMemberImplementations().clear();
				getTypeMemberImplementations().addAll((Collection<? extends TypeMemberImplementation>)newValue);
				return;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS:
				setImplementationClass((EClass)newValue);
				return;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA:
				setAbstractInitializationData((AbstractInitializationData)newValue);
				return;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__INSTANCE:
				setInstance((EObject)newValue);
				return;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ADAPTER_INSTANCE:
				setAdapterInstance((TypeApiAdapter)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS:
				getTypeMemberImplementations().clear();
				return;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS:
				setImplementationClass((EClass)null);
				return;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA:
				setAbstractInitializationData((AbstractInitializationData)null);
				return;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__INSTANCE:
				setInstance((EObject)null);
				return;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ADAPTER_INSTANCE:
				setAdapterInstance((TypeApiAdapter)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS:
				return typeMemberImplementations != null && !typeMemberImplementations.isEmpty();
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS:
				return implementationClass != null;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA:
				return abstractInitializationData != null;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__INSTANCE:
				return instance != null;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__ADAPTER_INSTANCE:
				return adapterInstance != null;
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION__HANDLING_TYPE:
				return basicGetHandlingType() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__STRING:
				return getTypeMemberImplementation((String)arguments.get(0));
			case ApogyCoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__TYPEMEMBER:
				return getTypeMemberImplementation((TypeMember)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // AbstractTypeImplementationImpl
