/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners;

import org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape;
import org.eclipse.symphony.common.geometry.data.PolygonSamplingShape;

import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circular Exclusion Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represent an exclusion zone defined as a circle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone#isInvertSamplingShape <em>Invert Sampling Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage#getCircularExclusionZone()
 * @model
 * @generated
 */
public interface CircularExclusionZone extends ExclusionZone, CoordinatesSamplingShape<CartesianPositionCoordinates>, PolygonSamplingShape<CartesianPositionCoordinates, CartesianTriangle> {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage#getCircularExclusionZone_Radius()
	 * @model unique="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Invert Sampling Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invert Sampling Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invert Sampling Shape</em>' attribute.
	 * @see #setInvertSamplingShape(boolean)
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage#getCircularExclusionZone_InvertSamplingShape()
	 * @model unique="false"
	 * @generated
	 */
	boolean isInvertSamplingShape();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone#isInvertSamplingShape <em>Invert Sampling Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invert Sampling Shape</em>' attribute.
	 * @see #isInvertSamplingShape()
	 * @generated
	 */
	void setInvertSamplingShape(boolean value);

} // CircularExclusionZone
