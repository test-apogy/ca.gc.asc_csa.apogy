/**
 * Canadian Space Agency 2007.
 *
 * $Id: CircularExclusionZone.java,v 1.2.4.2 2015/05/21 15:50:52 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners;

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
 * Represent an exclusion zone defined as a circle. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.CircularExclusionZone#getRadius <em>Radius</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.CircularExclusionZone#isInvertSamplingShape <em>Invert Sampling Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.mobility.pathplanners.PathplannersPackage#getCircularExclusionZone()
 * @model
 * @generated
 */
public interface CircularExclusionZone extends ExclusionZone, CoordinatesSamplingShape<CartesianPositionCoordinates>, PolygonSamplingShape<CartesianPositionCoordinates, CartesianTriangle> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The radius of the exclusion zone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see ca.gc.space.mrt.mobility.pathplanners.PathplannersPackage#getCircularExclusionZone_Radius()
	 * @model required="true"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.CircularExclusionZone#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Invert Sampling Shape</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invert Sampling Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invert Sampling Shape</em>' attribute.
	 * @see #setInvertSamplingShape(boolean)
	 * @see ca.gc.space.mrt.mobility.pathplanners.PathplannersPackage#getCircularExclusionZone_InvertSamplingShape()
	 * @model default="false"
	 * @generated
	 */
	boolean isInvertSamplingShape();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.CircularExclusionZone#isInvertSamplingShape <em>Invert Sampling Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invert Sampling Shape</em>' attribute.
	 * @see #isInvertSamplingShape()
	 * @generated
	 */
	void setInvertSamplingShape(boolean value);

} // CircularExclusionZone
