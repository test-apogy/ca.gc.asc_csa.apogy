package ca.gc.asc_csa.apogy.common.io.jinput.impl;
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

import net.java.games.input.Component;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponent;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponents;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EComponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentImpl#getDeadZone <em>Dead Zone</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentImpl#isRelative <em>Relative</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentImpl#isAnalog <em>Analog</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentImpl#getPojoComponent <em>Pojo Component</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentImpl#getPollData <em>Poll Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentImpl#getEComponents <em>EComponents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EComponentImpl extends MinimalEObjectImpl.Container implements EComponent {
	/**
	 * The default value of the '{@link #getDeadZone() <em>Dead Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadZone()
	 * @generated
	 * @ordered
	 */
	protected static final float DEAD_ZONE_EDEFAULT = 0.0F;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELATIVE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAnalog() <em>Analog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnalog()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANALOG_EDEFAULT = false;

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
	 * The default value of the '{@link #getPojoComponent() <em>Pojo Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPojoComponent()
	 * @generated
	 * @ordered
	 */
	protected static final Component POJO_COMPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPojoComponent() <em>Pojo Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPojoComponent()
	 * @generated
	 * @ordered
	 */
	protected Component pojoComponent = POJO_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollData() <em>Poll Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollData()
	 * @generated
	 * @ordered
	 */
	protected static final float POLL_DATA_EDEFAULT = 0.0F;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonIOJInputPackage.Literals.ECOMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public float getDeadZone() {
		return (float) (pojoComponent == null ? 0.0: pojoComponent.getDeadZone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getIdentifier() {
		return (pojoComponent == null ? "": pojoComponent.getIdentifier().getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public boolean isRelative() {
		return pojoComponent == null ? false: pojoComponent.isRelative();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public boolean isAnalog() {
		return pojoComponent == null ? false: pojoComponent.isAnalog();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getName() {
		return pojoComponent == null ? "": pojoComponent.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getPojoComponent() {
		return pojoComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPojoComponent(Component newPojoComponent) {
		Component oldPojoComponent = pojoComponent;
		pojoComponent = newPojoComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonIOJInputPackage.ECOMPONENT__POJO_COMPONENT, oldPojoComponent, pojoComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public float getPollData() {
		return pojoComponent.getPollData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EComponents getEComponents() {
		if (eContainerFeatureID() != ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS) return null;
		return (EComponents)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EComponents basicGetEComponents() {
		if (eContainerFeatureID() != ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS) return null;
		return (EComponents)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEComponents(EComponents newEComponents, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEComponents, ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEComponents(EComponents newEComponents) {
		if (newEComponents != eInternalContainer() || (eContainerFeatureID() != ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS && newEComponents != null)) {
			if (EcoreUtil.isAncestor(this, newEComponents))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEComponents != null)
				msgs = ((InternalEObject)newEComponents).eInverseAdd(this, ApogyCommonIOJInputPackage.ECOMPONENTS__COMPONENTS, EComponents.class, msgs);
			msgs = basicSetEComponents(newEComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS, newEComponents, newEComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEComponents((EComponents)otherEnd, msgs);
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
			case ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS:
				return basicSetEComponents(null, msgs);
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
			case ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS:
				return eInternalContainer().eInverseRemove(this, ApogyCommonIOJInputPackage.ECOMPONENTS__COMPONENTS, EComponents.class, msgs);
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
			case ApogyCommonIOJInputPackage.ECOMPONENT__DEAD_ZONE:
				return getDeadZone();
			case ApogyCommonIOJInputPackage.ECOMPONENT__IDENTIFIER:
				return getIdentifier();
			case ApogyCommonIOJInputPackage.ECOMPONENT__RELATIVE:
				return isRelative();
			case ApogyCommonIOJInputPackage.ECOMPONENT__ANALOG:
				return isAnalog();
			case ApogyCommonIOJInputPackage.ECOMPONENT__NAME:
				return getName();
			case ApogyCommonIOJInputPackage.ECOMPONENT__POJO_COMPONENT:
				return getPojoComponent();
			case ApogyCommonIOJInputPackage.ECOMPONENT__POLL_DATA:
				return getPollData();
			case ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS:
				if (resolve) return getEComponents();
				return basicGetEComponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonIOJInputPackage.ECOMPONENT__POJO_COMPONENT:
				setPojoComponent((Component)newValue);
				return;
			case ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS:
				setEComponents((EComponents)newValue);
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
			case ApogyCommonIOJInputPackage.ECOMPONENT__POJO_COMPONENT:
				setPojoComponent(POJO_COMPONENT_EDEFAULT);
				return;
			case ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS:
				setEComponents((EComponents)null);
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
			case ApogyCommonIOJInputPackage.ECOMPONENT__DEAD_ZONE:
				return getDeadZone() != DEAD_ZONE_EDEFAULT;
			case ApogyCommonIOJInputPackage.ECOMPONENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? getIdentifier() != null : !IDENTIFIER_EDEFAULT.equals(getIdentifier());
			case ApogyCommonIOJInputPackage.ECOMPONENT__RELATIVE:
				return isRelative() != RELATIVE_EDEFAULT;
			case ApogyCommonIOJInputPackage.ECOMPONENT__ANALOG:
				return isAnalog() != ANALOG_EDEFAULT;
			case ApogyCommonIOJInputPackage.ECOMPONENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ApogyCommonIOJInputPackage.ECOMPONENT__POJO_COMPONENT:
				return POJO_COMPONENT_EDEFAULT == null ? pojoComponent != null : !POJO_COMPONENT_EDEFAULT.equals(pojoComponent);
			case ApogyCommonIOJInputPackage.ECOMPONENT__POLL_DATA:
				return getPollData() != POLL_DATA_EDEFAULT;
			case ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS:
				return basicGetEComponents() != null;
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
		result.append(" (pojoComponent: ");
		result.append(pojoComponent);
		result.append(')');
		return result.toString();
	}

} //EComponentImpl
