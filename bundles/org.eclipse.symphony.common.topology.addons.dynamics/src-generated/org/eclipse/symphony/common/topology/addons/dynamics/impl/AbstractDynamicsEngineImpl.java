/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractDynamicsEngineImpl.java,v 1.8.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.topology.addons.dynamics.AbstractDynamicsEngine;
import org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Dynamics Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractDynamicsEngineImpl extends MinimalEObjectImpl.Container implements AbstractDynamicsEngine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDynamicsEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonTopologyDynamicsPackage.Literals.ABSTRACT_DYNAMICS_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void startSimulation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stopSimulation() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CommonTopologyDynamicsPackage.ABSTRACT_DYNAMICS_ENGINE___START_SIMULATION:
				startSimulation();
				return null;
			case Symphony__CommonTopologyDynamicsPackage.ABSTRACT_DYNAMICS_ENGINE___STOP_SIMULATION:
				stopSimulation();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractDynamicsEngineImpl
