/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Pass Position History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassPositionHistory#getPositions <em>Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getVisibilityPassPositionHistory()
 * @model
 * @generated
 */
public interface VisibilityPassPositionHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getVisibilityPassPositionHistory_Positions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VisibilityPassPosition> getPositions();

} // VisibilityPassPositionHistory
