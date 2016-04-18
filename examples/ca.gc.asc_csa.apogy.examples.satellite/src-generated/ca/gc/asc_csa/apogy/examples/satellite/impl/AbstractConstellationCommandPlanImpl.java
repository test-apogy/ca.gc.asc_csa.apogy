/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;
import com.google.common.base.Objects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Constellation Command Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationCommandPlanImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationCommandPlanImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationCommandPlanImpl#getCommandPlansList <em>Command Plans List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationCommandPlanImpl#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationCommandPlanImpl#getConstellationCommands <em>Constellation Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractConstellationCommandPlanImpl extends MinimalEObjectImpl.Container implements AbstractConstellationCommandPlan {
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
	 * The cached value of the '{@link #getConstellationCommands() <em>Constellation Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSatelliteCommand> constellationCommands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractConstellationCommandPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.ABSTRACT_CONSTELLATION_COMMAND_PLAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationCommandPlansList getCommandPlansList() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST) return null;
		return (ConstellationCommandPlansList)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationCommandPlansList basicGetCommandPlansList() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST) return null;
		return (ConstellationCommandPlansList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandPlansList(ConstellationCommandPlansList newCommandPlansList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCommandPlansList, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandPlansList(ConstellationCommandPlansList newCommandPlansList) {
		if (newCommandPlansList != eInternalContainer() || (eContainerFeatureID() != ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST && newCommandPlansList != null)) {
			if (EcoreUtil.isAncestor(this, newCommandPlansList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCommandPlansList != null)
				msgs = ((InternalEObject)newCommandPlansList).eInverseAdd(this, ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__PLANS, ConstellationCommandPlansList.class, msgs);
			msgs = basicSetCommandPlansList(newCommandPlansList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST, newCommandPlansList, newCommandPlansList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationState getConstellationState() {
		ConstellationCommandPlansList _commandPlansList = this.getCommandPlansList();
		boolean _equals = Objects.equal(_commandPlansList, null);
		if (_equals) {
			return null;
		}
		else {
			ConstellationCommandPlansList _commandPlansList_1 = this.getCommandPlansList();
			return _commandPlansList_1.getConstellationState();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSatelliteCommand> getConstellationCommands() {
		if (constellationCommands == null) {
			constellationCommands = new EObjectContainmentEList<AbstractSatelliteCommand>(AbstractSatelliteCommand.class, this, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMANDS);
		}
		return constellationCommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCommandPlansList((ConstellationCommandPlansList)otherEnd, msgs);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST:
				return basicSetCommandPlansList(null, msgs);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMANDS:
				return ((InternalEList<?>)getConstellationCommands()).basicRemove(otherEnd, msgs);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST:
				return eInternalContainer().eInverseRemove(this, ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLANS_LIST__PLANS, ConstellationCommandPlansList.class, msgs);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__NAME:
				return getName();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__DESCRIPTION:
				return getDescription();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST:
				if (resolve) return getCommandPlansList();
				return basicGetCommandPlansList();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_STATE:
				return getConstellationState();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMANDS:
				return getConstellationCommands();
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__NAME:
				setName((String)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST:
				setCommandPlansList((ConstellationCommandPlansList)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMANDS:
				getConstellationCommands().clear();
				getConstellationCommands().addAll((Collection<? extends AbstractSatelliteCommand>)newValue);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST:
				setCommandPlansList((ConstellationCommandPlansList)null);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMANDS:
				getConstellationCommands().clear();
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__COMMAND_PLANS_LIST:
				return basicGetCommandPlansList() != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_STATE:
				return getConstellationState() != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMANDS:
				return constellationCommands != null && !constellationCommands.isEmpty();
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
				case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
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
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_COMMAND_PLAN__DESCRIPTION;
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

} //AbstractConstellationCommandPlanImpl
