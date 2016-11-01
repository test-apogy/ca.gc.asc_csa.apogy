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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.impl.TriggeredBasedProgramImpl;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Controllers Configuration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ControllersConfigurationImpl#getOperationCalls <em>Operation Calls</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ControllersConfigurationImpl#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllersConfigurationImpl extends TriggeredBasedProgramImpl implements ControllersConfiguration {
	/**
	 * The cached value of the '{@link #getOperationCalls()
	 * <em>Operation Calls</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOperationCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationCall> operationCalls;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllersConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreProgramsControllersPackage.Literals.CONTROLLERS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationCall> getOperationCalls() {
		if (operationCalls == null) {
			operationCalls = new EObjectContainmentWithInverseEList<OperationCall>(OperationCall.class, this, ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS, ApogyCoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER);
		}
		return operationCalls;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * @deprecated use {@link ApogyCoreProgramsControllersFacade.INSTANCE.activateControllersConfiguration(controllersConfiguration)}
	 *  <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setActive(boolean newActive) {
		// De-Activates other ControllersConfiguration is applicable.
		if (newActive && eContainer() instanceof ProgramsList) {
			ProgramsList programsList = (ProgramsList) eContainer();

			// FIXME Move the following code under a Facade.
			for (ProgramsGroup programsGroup : programsList.getProgramsGroups()) {

				for (Program program : programsGroup.getPrograms()) {
					if (program instanceof ControllersConfiguration) {
						ControllersConfiguration cc = (ControllersConfiguration) program;
						if (cc != this) {
							cc.setActive(false);
						}
					}
				}
			}
		}

		// Updates all OperationCallControllerBinding in the list.
		for (OperationCall op : getOperationCalls()) {
			if (op instanceof OperationCallControllerBinding) {
				OperationCallControllerBinding ocb = (OperationCallControllerBinding) op;
				ocb.setActive(newActive);
			}
		}

		setActiveGen(newActive);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveGen(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationCalls()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				return ((InternalEList<?>)getOperationCalls()).basicRemove(otherEnd, msgs);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				return getOperationCalls();
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__ACTIVE:
				return isActive();
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
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				getOperationCalls().clear();
				getOperationCalls().addAll((Collection<? extends OperationCall>)newValue);
				return;
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__ACTIVE:
				setActive((Boolean)newValue);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				getOperationCalls().clear();
				return;
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				return operationCalls != null && !operationCalls.isEmpty();
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__ACTIVE:
				return active != ACTIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OperationCallContainer.class) {
			switch (derivedFeatureID) {
				case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS: return ApogyCoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OperationCallContainer.class) {
			switch (baseFeatureID) {
				case ApogyCoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS: return ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} // ControllersConfigurationImpl
