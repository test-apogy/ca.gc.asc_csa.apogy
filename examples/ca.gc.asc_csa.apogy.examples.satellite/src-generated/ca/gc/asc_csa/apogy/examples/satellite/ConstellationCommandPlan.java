/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Command Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class contains a list of {@link SatelliteCommandPlanItem}.
 * The {@link AbstractConstellation#plan} produces {@link SatelliteCommandPlan}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlan#getConstellationCommandPlanItems <em>Constellation Command Plan Items</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationCommandPlan()
 * @model
 * @generated
 */
public interface ConstellationCommandPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation Command Plan Items</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of {@link SatelliteCommandPlanItem}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Command Plan Items</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationCommandPlan_ConstellationCommandPlanItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstellationCommandPlanItem> getConstellationCommandPlanItems();

} // ConstellationCommandPlan
