/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Command Plans List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that contains list of {@link ConstellationCommandPlan}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationCommandPlansList()
 * @model
 * @generated
 */
public interface ConstellationCommandPlansList extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationCommandPlansList <em>Constellation Command Plans List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the container of this {@link ConstellationCommandPlansList}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation State</em>' container reference.
	 * @see #setConstellationState(ConstellationState)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationCommandPlansList_ConstellationState()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationCommandPlansList
	 * @model opposite="constellationCommandPlansList" transient="false"
	 * @generated
	 */
	ConstellationState getConstellationState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList#getConstellationState <em>Constellation State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation State</em>' container reference.
	 * @see #getConstellationState()
	 * @generated
	 */
	void setConstellationState(ConstellationState value);

	/**
	 * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan#getCommandPlansList <em>Command Plans List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plans</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationCommandPlansList_Plans()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan#getCommandPlansList
	 * @model opposite="commandPlansList" containment="true"
	 * @generated
	 */
	EList<AbstractConstellationCommandPlan> getPlans();

} // ConstellationCommandPlansList
