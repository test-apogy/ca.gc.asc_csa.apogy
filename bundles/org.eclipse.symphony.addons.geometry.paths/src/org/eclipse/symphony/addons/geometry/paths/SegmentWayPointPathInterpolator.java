/**
 * Canadian Space Agency 2007.
 *
 * $Id: SegmentWayPointPathInterpolator.java,v 1.2.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package org.eclipse.symphony.addons.geometry.paths;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Way Point Path Interpolator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator#getMaximumDistanceInterval <em>Maximum Distance Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.geometry.paths.PathsPackage#getSegmentWayPointPathInterpolator()
 * @model
 * @generated
 */
public interface SegmentWayPointPathInterpolator extends WayPointPathInterpolator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Maximum Distance Interval</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Distance Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Distance Interval</em>' attribute.
	 * @see #setMaximumDistanceInterval(double)
	 * @see org.eclipse.symphony.addons.geometry.paths.PathsPackage#getSegmentWayPointPathInterpolator_MaximumDistanceInterval()
	 * @model default="1.0"
	 * @generated
	 */
	double getMaximumDistanceInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator#getMaximumDistanceInterval <em>Maximum Distance Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Distance Interval</em>' attribute.
	 * @see #getMaximumDistanceInterval()
	 * @generated
	 */
	void setMaximumDistanceInterval(double value);

} // SegmentWayPointPathInterpolator
