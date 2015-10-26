/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;

import org.eclipse.symphony.core.invocator.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Path Planner Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.VehiclePathPlannerTool#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getVehiclePathPlannerTool()
 * @model
 * @generated
 */
public interface VehiclePathPlannerTool extends PathPlannerTool {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The Symphony System for which to plan a path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage#getVehiclePathPlannerTool_Variable()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TRAJECTORY_3D_TOOL'"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.vehicle.VehiclePathPlannerTool#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // VehiclePathPlannerTool
