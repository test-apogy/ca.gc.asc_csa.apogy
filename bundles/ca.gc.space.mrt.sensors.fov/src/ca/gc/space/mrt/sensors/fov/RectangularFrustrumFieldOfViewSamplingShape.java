/**
 * Canadian Space Agency 2007.
 */
package ca.gc.space.mrt.sensors.fov;

import ca.gc.space.math.Matrix4x4;
import ca.gc.space.mrt.geometry.data.CoordinatesSamplingShape;
import ca.gc.space.mrt.geometry.data.PolygonSamplingShape;
import ca.gc.space.mrt.geometry.data3d.CartesianPolygon;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangular Frustrum Field Of View Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getTransform <em>Transform</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getRectangularFrustrumFieldOfView <em>Rectangular Frustrum Field Of View</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getRectangularFrustrumFieldOfViewSamplingShape()
 * @model
 * @generated
 */
public interface RectangularFrustrumFieldOfViewSamplingShape<PolygonType extends CartesianPolygon> extends CoordinatesSamplingShape<CartesianPositionCoordinates>, PolygonSamplingShape<CartesianPositionCoordinates, PolygonType> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' reference.
	 * @see #setTransform(Matrix4x4)
	 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getRectangularFrustrumFieldOfViewSamplingShape_Transform()
	 * @model
	 * @generated
	 */
	Matrix4x4 getTransform();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getTransform <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Matrix4x4 value);

	/**
	 * Returns the value of the '<em><b>Rectangular Frustrum Field Of View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectangular Frustrum Field Of View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangular Frustrum Field Of View</em>' reference.
	 * @see #setRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView)
	 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getRectangularFrustrumFieldOfViewSamplingShape_RectangularFrustrumFieldOfView()
	 * @model
	 * @generated
	 */
	RectangularFrustrumFieldOfView getRectangularFrustrumFieldOfView();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getRectangularFrustrumFieldOfView <em>Rectangular Frustrum Field Of View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectangular Frustrum Field Of View</em>' reference.
	 * @see #getRectangularFrustrumFieldOfView()
	 * @generated
	 */
	void setRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView value);

} // RectangularFrustrumFieldOfViewSamplingShape
