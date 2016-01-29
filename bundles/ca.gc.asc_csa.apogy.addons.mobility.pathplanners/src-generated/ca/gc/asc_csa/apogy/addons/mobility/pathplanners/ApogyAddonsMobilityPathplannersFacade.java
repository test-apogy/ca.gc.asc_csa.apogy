/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.topology.GroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Planners Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage#getApogyAddonsMobilityPathplannersFacade()
 * @model
 * @generated
 */
public interface ApogyAddonsMobilityPathplannersFacade extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" radiusUnique="false" parentUnique="false"
	 * @generated
	 */
	CircularExclusionZone createCircularExclusionZone(double radius, GroupNode parent);

} // ApogyAddonsMobilityPathplannersFacade
