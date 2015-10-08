/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data;

import ca.gc.space.mrt.common.processors.Processor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Polygon Shapes Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data.MeshPolygonShapesSampler#getPolygonSamplingShapes <em>Polygon Sampling Shapes</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data.MeshPolygonShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data.DataPackage#getMeshPolygonShapesSampler()
 * @model abstract="true"
 * @generated
 */
public interface MeshPolygonShapesSampler<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends Processor<Mesh<CoordinatesType, PolygonType>, Mesh<CoordinatesType, PolygonType>> {
	/**
	 * Returns the value of the '<em><b>Polygon Sampling Shapes</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.space.mrt.geometry.data.PolygonSamplingShape}&lt;CoordinatesType, PolygonType>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Sampling Shapes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Sampling Shapes</em>' reference list.
	 * @see ca.gc.space.mrt.geometry.data.DataPackage#getMeshPolygonShapesSampler_PolygonSamplingShapes()
	 * @model
	 * @generated
	 */
	EList<PolygonSamplingShape<CoordinatesType, PolygonType>> getPolygonSamplingShapes();

	/**
	 * Returns the value of the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * The default value is <code>"UNION"</code>.
	 * The literals are from the enumeration {@link ca.gc.space.mrt.geometry.data.ShapeSamplingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Sampling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Sampling Mode</em>' attribute.
	 * @see ca.gc.space.mrt.geometry.data.ShapeSamplingMode
	 * @see #setShapeSamplingMode(ShapeSamplingMode)
	 * @see ca.gc.space.mrt.geometry.data.DataPackage#getMeshPolygonShapesSampler_ShapeSamplingMode()
	 * @model default="UNION" unique="false" required="true"
	 * @generated
	 */
	ShapeSamplingMode getShapeSamplingMode();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data.MeshPolygonShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Sampling Mode</em>' attribute.
	 * @see ca.gc.space.mrt.geometry.data.ShapeSamplingMode
	 * @see #getShapeSamplingMode()
	 * @generated
	 */
	void setShapeSamplingMode(ShapeSamplingMode value);

} // MeshPolygonShapesSampler
