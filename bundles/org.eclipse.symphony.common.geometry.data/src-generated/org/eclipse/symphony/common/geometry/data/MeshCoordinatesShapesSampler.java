/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Coordinates Shapes Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.MeshCoordinatesShapesSampler#getCoordinatesSamplingShapes <em>Coordinates Sampling Shapes</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.MeshCoordinatesShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.MeshCoordinatesShapesSampler#getPolygonSamplingMode <em>Polygon Sampling Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data.Symphony__CommonGeometryDataPackage#getMeshCoordinatesShapesSampler()
 * @model abstract="true"
 * @generated
 */
public interface MeshCoordinatesShapesSampler<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends Processor<Mesh<CoordinatesType, PolygonType>, Mesh<CoordinatesType, PolygonType>> {
	/**
	 * Returns the value of the '<em><b>Coordinates Sampling Shapes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape}&lt;CoordinatesType>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates Sampling Shapes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates Sampling Shapes</em>' reference list.
	 * @see org.eclipse.symphony.common.geometry.data.Symphony__CommonGeometryDataPackage#getMeshCoordinatesShapesSampler_CoordinatesSamplingShapes()
	 * @model
	 * @generated
	 */
	EList<CoordinatesSamplingShape<CoordinatesType>> getCoordinatesSamplingShapes();

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
	 * @see org.eclipse.symphony.common.geometry.data.Symphony__CommonGeometryDataPackage#getMeshCoordinatesShapesSampler_ShapeSamplingMode()
	 * @model default="UNION" unique="false" required="true"
	 * @generated
	 */
	ShapeSamplingMode getShapeSamplingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data.MeshCoordinatesShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Sampling Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data.ShapeSamplingMode
	 * @see #getShapeSamplingMode()
	 * @generated
	 */
	void setShapeSamplingMode(ShapeSamplingMode value);

	/**
	 * Returns the value of the '<em><b>Polygon Sampling Mode</b></em>' attribute.
	 * The default value is <code>"AT_LEAST_ONE_VERTEX"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.common.geometry.data.PolygonSamplingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Sampling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Sampling Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data.PolygonSamplingMode
	 * @see #setPolygonSamplingMode(PolygonSamplingMode)
	 * @see org.eclipse.symphony.common.geometry.data.Symphony__CommonGeometryDataPackage#getMeshCoordinatesShapesSampler_PolygonSamplingMode()
	 * @model default="AT_LEAST_ONE_VERTEX" unique="false" required="true"
	 * @generated
	 */
	PolygonSamplingMode getPolygonSamplingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.geometry.data.MeshCoordinatesShapesSampler#getPolygonSamplingMode <em>Polygon Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon Sampling Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data.PolygonSamplingMode
	 * @see #getPolygonSamplingMode()
	 * @generated
	 */
	void setPolygonSamplingMode(PolygonSamplingMode value);

} // MeshCoordinatesShapesSampler
