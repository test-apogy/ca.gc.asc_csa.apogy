/**
 * Canadian Space Agency 2007.
 *
 * $Id: UniformDistanceWayPointPathInterpolator.java,v 1.2.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package ca.gc.space.mrt.geometry.paths;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniform Distance Way Point Path Interpolator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.paths.UniformDistanceWayPointPathInterpolator#getDistanceInterval <em>Distance Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.paths.PathsPackage#getUniformDistanceWayPointPathInterpolator()
 * @model
 * @generated
 */
public interface UniformDistanceWayPointPathInterpolator extends WayPointPathFilter
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Distance Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Interval</em>' attribute.
	 * @see #setDistanceInterval(double)
	 * @see ca.gc.space.mrt.geometry.paths.PathsPackage#getUniformDistanceWayPointPathInterpolator_DistanceInterval()
	 * @model
	 * @generated
	 */
	double getDistanceInterval();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.paths.UniformDistanceWayPointPathInterpolator#getDistanceInterval <em>Distance Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Interval</em>' attribute.
	 * @see #getDistanceInterval()
	 * @generated
	 */
	void setDistanceInterval(double value);

} // UniformDistanceWayPointPathInterpolator
