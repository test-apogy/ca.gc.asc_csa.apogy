/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.symphony.common.topology.GroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Planners Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersPackage#getSymphony__AddonsMobilityPathplannersFacade()
 * @model
 * @generated
 */
public interface Symphony__AddonsMobilityPathplannersFacade extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" radiusUnique="false" parentUnique="false"
	 * @generated
	 */
	CircularExclusionZone createCircularExclusionZone(double radius, GroupNode parent);

} // Symphony__AddonsMobilityPathplannersFacade
