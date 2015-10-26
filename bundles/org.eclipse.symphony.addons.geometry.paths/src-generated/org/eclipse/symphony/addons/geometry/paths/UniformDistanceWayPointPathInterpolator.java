/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniform Distance Way Point Path Interpolator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.UniformDistanceWayPointPathInterpolator#getDistanceInterval <em>Distance Interval</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.geometry.paths.PathsPackage#getUniformDistanceWayPointPathInterpolator()
 * @model
 * @generated
 */
public interface UniformDistanceWayPointPathInterpolator extends WayPointPathFilter {
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
	 * @see org.eclipse.symphony.addons.geometry.paths.PathsPackage#getUniformDistanceWayPointPathInterpolator_DistanceInterval()
	 * @model unique="false"
	 * @generated
	 */
	double getDistanceInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.geometry.paths.UniformDistanceWayPointPathInterpolator#getDistanceInterval <em>Distance Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Interval</em>' attribute.
	 * @see #getDistanceInterval()
	 * @generated
	 */
	void setDistanceInterval(double value);

} // UniformDistanceWayPointPathInterpolator
