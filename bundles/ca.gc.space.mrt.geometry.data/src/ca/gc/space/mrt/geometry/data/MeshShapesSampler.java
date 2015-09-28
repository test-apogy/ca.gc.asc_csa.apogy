/**
 * Canadian Space Agency 2008
 *
 * $Id: MeshShapesSampler.java,v 1.2.4.2 2015/05/21 15:50:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data;

import org.eclipse.emf.common.util.EList;

import ca.gc.space.mrt.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Shapes Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data.MeshShapesSampler#getSamplingShapes <em>Sampling Shapes</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data.MeshShapesSampler#getSamplingMode <em>Sampling Mode</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data.MeshShapesSampler#getPolygonSamplingMode <em>Polygon Sampling Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data.DataPackage#getMeshShapesSampler()
 * @model abstract="true"
 * @generated
 */
public interface MeshShapesSampler<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends Processor<Mesh<CoordinatesType, PolygonType>, Mesh<CoordinatesType, PolygonType>>
{
	/**
	 * Returns the value of the '<em><b>Sampling Shapes</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.space.mrt.geometry.data.CoordinatesSamplingShape}&lt;CoordinatesType>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampling Shapes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Shapes</em>' reference list.
	 * @see ca.gc.space.mrt.geometry.data.DataPackage#getMeshShapesSampler_SamplingShapes()
	 * @model
	 * @generated
	 */
	EList<CoordinatesSamplingShape<CoordinatesType>> getSamplingShapes();

	/**
	 * Returns the value of the '<em><b>Sampling Mode</b></em>' attribute.
	 * The default value is <code>"UNION"</code>.
	 * The literals are from the enumeration {@link ca.gc.space.mrt.geometry.data.ShapeSamplingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Mode</em>' attribute.
	 * @see ca.gc.space.mrt.geometry.data.ShapeSamplingMode
	 * @see #setSamplingMode(ShapeSamplingMode)
	 * @see ca.gc.space.mrt.geometry.data.DataPackage#getMeshShapesSampler_SamplingMode()
	 * @model default="UNION" required="true"
	 * @generated
	 */
	ShapeSamplingMode getSamplingMode();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data.MeshShapesSampler#getSamplingMode <em>Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Mode</em>' attribute.
	 * @see ca.gc.space.mrt.geometry.data.ShapeSamplingMode
	 * @see #getSamplingMode()
	 * @generated
	 */
	void setSamplingMode(ShapeSamplingMode value);

	/**
	 * Returns the value of the '<em><b>Polygon Sampling Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.space.mrt.geometry.data.PolygonSamplingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Sampling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Sampling Mode</em>' attribute.
	 * @see ca.gc.space.mrt.geometry.data.PolygonSamplingMode
	 * @see #setPolygonSamplingMode(PolygonSamplingMode)
	 * @see ca.gc.space.mrt.geometry.data.DataPackage#getMeshShapesSampler_PolygonSamplingMode()
	 * @model required="true"
	 * @generated
	 */
	PolygonSamplingMode getPolygonSamplingMode();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data.MeshShapesSampler#getPolygonSamplingMode <em>Polygon Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon Sampling Mode</em>' attribute.
	 * @see ca.gc.space.mrt.geometry.data.PolygonSamplingMode
	 * @see #getPolygonSamplingMode()
	 * @generated
	 */
	void setPolygonSamplingMode(PolygonSamplingMode value);

} // MeshShapesSampler
