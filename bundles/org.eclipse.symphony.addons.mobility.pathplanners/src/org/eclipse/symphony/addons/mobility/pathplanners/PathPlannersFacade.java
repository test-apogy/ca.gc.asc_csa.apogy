/**
 * Canadian Space Agency 2007.
 *
 * $Id: PathPlannersFacade.java,v 1.2.4.2 2015/05/21 15:50:52 pallard Exp $
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
 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage#getPathPlannersFacade()
 * @model
 * @generated
 */
public interface PathPlannersFacade extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" radiusUnique="false" parentUnique="false"
	 * @generated
	 */
	CircularExclusionZone createCircularExclusionZone(double radius, GroupNode parent);

} // PathPlannersFacade
