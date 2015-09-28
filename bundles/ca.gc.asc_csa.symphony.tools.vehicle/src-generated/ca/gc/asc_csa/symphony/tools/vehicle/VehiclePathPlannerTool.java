/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.vehicle;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Path Planner Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.vehicle.VehiclePathPlannerTool#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage#getVehiclePathPlannerTool()
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
	 * @see ca.gc.asc_csa.symphony.tools.vehicle.SymphonyToolsVehiclePackage#getVehiclePathPlannerTool_Variable()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TRAJECTORY_3D_TOOL'"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.vehicle.VehiclePathPlannerTool#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // VehiclePathPlannerTool
