/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Polygon Shapes Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.MeshPolygonShapesSampler#getPolygonSamplingShapes <em>Polygon Sampling Shapes</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.MeshPolygonShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data.DataPackage#getMeshPolygonShapesSampler()
 * @model abstract="true"
 * @generated
 */
public interface MeshPolygonShapesSampler<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends Processor<Mesh<CoordinatesType, PolygonType>, Mesh<CoordinatesType, PolygonType>> {
	/**
	 * Returns the value of the '<em><b>Polygon Sampling Shapes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.geometry.data.PolygonSamplingShape}&lt;CoordinatesType, PolygonType>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Sampling Shapes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Sampling Shapes</em>' reference list.
	 * @see org.eclipse.symphony.common.geometry.data.DataPackage#getMeshPolygonShapesSampler_PolygonSamplingShapes()
	 * @model
	 * @generated
	 */
	EList<PolygonSamplingShape<CoordinatesType, PolygonType>> getPolygonSamplingShapes();

	/**
	 * Returns the value of the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * The default value is <code>"UNION"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.common.geometry.data.ShapeSamplingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Sampling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Sampling Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data.ShapeSamplingMode
	 * @see #setShapeSamplingMode(ShapeSamplingMode)
	 * @see org.eclipse.symphony.common.geometry.data.DataPackage#getMeshPolygonShapesSampler_ShapeSamplingMode()
	 * @model default="UNION" unique="false" required="true"
	 * @generated
	 */
	ShapeSamplingMode getShapeSamplingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data.MeshPolygonShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Sampling Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data.ShapeSamplingMode
	 * @see #getShapeSamplingMode()
	 * @generated
	 */
	void setShapeSamplingMode(ShapeSamplingMode value);

} // MeshPolygonShapesSampler
