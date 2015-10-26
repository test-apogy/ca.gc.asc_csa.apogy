/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Dynamics Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a generic Dynamics Engine.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsPackage#getAbstractDynamicsEngine()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDynamicsEngine extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that starts the simulation.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void startSimulation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that stops the simulation.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stopSimulation();

} // AbstractDynamicsEngine
