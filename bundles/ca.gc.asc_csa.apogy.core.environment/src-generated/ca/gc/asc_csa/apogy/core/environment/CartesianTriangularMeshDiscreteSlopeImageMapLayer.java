/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer#getSlopeRanges <em>Slope Ranges</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getCartesianTriangularMeshDiscreteSlopeImageMapLayer()
 * @model
 * @generated
 */
public interface CartesianTriangularMeshDiscreteSlopeImageMapLayer extends CartesianTriangularMeshSlopeImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Slope Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.SlopeRange}.
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
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<SlopeRange> getSlopeRanges();

} // CartesianTriangularMeshDiscreteSlopeImageMapLayer
