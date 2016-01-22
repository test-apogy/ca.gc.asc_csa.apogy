/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

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
 *   <li>{@link org.eclipse.symphony.examples.satellite.ConstellationCommandPlan#getConstellationCommandPlanItems <em>Constellation Command Plan Items</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getConstellationCommandPlan()
 * @model
 * @generated
 */
public interface ConstellationCommandPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation Command Plan Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.examples.satellite.ConstellationCommandPlanItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of {@link SatelliteCommandPlanItem}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Command Plan Items</em>' containment reference list.
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getConstellationCommandPlan_ConstellationCommandPlanItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstellationCommandPlanItem> getConstellationCommandPlanItems();

} // ConstellationCommandPlan
