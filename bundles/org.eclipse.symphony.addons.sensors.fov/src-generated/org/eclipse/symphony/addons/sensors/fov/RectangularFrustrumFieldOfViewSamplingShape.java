/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov;

import org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape;
import org.eclipse.symphony.common.geometry.data.PolygonSamplingShape;

import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;

import org.eclipse.symphony.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangular Frustrum Field Of View Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getTransform <em>Transform</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getRectangularFrustrumFieldOfView <em>Rectangular Frustrum Field Of View</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getRectangularFrustrumFieldOfViewSamplingShape()
 * @model
 * @generated
 */
public interface RectangularFrustrumFieldOfViewSamplingShape<PolygonType extends CartesianPolygon> extends CoordinatesSamplingShape<CartesianPositionCoordinates>, PolygonSamplingShape<CartesianPositionCoordinates, PolygonType> {
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
	 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getRectangularFrustrumFieldOfViewSamplingShape_Transform()
	 * @model
	 * @generated
	 */
	Matrix4x4 getTransform();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getTransform <em>Transform</em>}' reference.
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
	 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getRectangularFrustrumFieldOfViewSamplingShape_RectangularFrustrumFieldOfView()
	 * @model
	 * @generated
	 */
	RectangularFrustrumFieldOfView getRectangularFrustrumFieldOfView();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getRectangularFrustrumFieldOfView <em>Rectangular Frustrum Field Of View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectangular Frustrum Field Of View</em>' reference.
	 * @see #getRectangularFrustrumFieldOfView()
	 * @generated
	 */
	void setRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView value);

} // RectangularFrustrumFieldOfViewSamplingShape