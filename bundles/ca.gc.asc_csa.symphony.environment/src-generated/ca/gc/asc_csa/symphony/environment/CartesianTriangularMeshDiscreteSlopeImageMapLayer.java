/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh Discrete Slope Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialized CartesianTriangularMeshSlopeImageMapLayer that generate a slope with discrete slope intervals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer#getSlopeRanges <em>Slope Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshDiscreteSlopeImageMapLayer()
 * @model
 * @generated
 */
public interface CartesianTriangularMeshDiscreteSlopeImageMapLayer extends CartesianTriangularMeshSlopeImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Slope Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.environment.SlopeRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope Ranges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The range of slope for which to generate colors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slope Ranges</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<SlopeRange> getSlopeRanges();

} // CartesianTriangularMeshDiscreteSlopeImageMapLayer
