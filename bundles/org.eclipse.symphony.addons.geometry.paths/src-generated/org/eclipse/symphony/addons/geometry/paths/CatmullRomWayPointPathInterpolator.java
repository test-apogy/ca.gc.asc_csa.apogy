/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catmull Rom Way Point Path Interpolator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Fits a spline on the specified path using Catmull-Rom and generates an
 * interpolated path using the specified maximum point to point distance.
 * The original waypoints are included in the resulting interpolated path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getTension <em>Tension</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getMaximumWayPointsDistance <em>Maximum Way Points Distance</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getEndControlPointGenerationMode <em>End Control Point Generation Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage#getCatmullRomWayPointPathInterpolator()
 * @model
 * @generated
 */
public interface CatmullRomWayPointPathInterpolator extends WayPointPathInterpolator {
	/**
	 * Returns the value of the '<em><b>Tension</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension</em>' attribute.
	 * @see #setTension(double)
	 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage#getCatmullRomWayPointPathInterpolator_Tension()
	 * @model default="0.5" unique="false"
	 * @generated
	 */
	double getTension();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getTension <em>Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension</em>' attribute.
	 * @see #getTension()
	 * @generated
	 */
	void setTension(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Way Points Distance</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Way Points Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Way Points Distance</em>' attribute.
	 * @see #setMaximumWayPointsDistance(double)
	 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage#getCatmullRomWayPointPathInterpolator_MaximumWayPointsDistance()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getMaximumWayPointsDistance();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getMaximumWayPointsDistance <em>Maximum Way Points Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Way Points Distance</em>' attribute.
	 * @see #getMaximumWayPointsDistance()
	 * @generated
	 */
	void setMaximumWayPointsDistance(double value);

	/**
	 * Returns the value of the '<em><b>End Control Point Generation Mode</b></em>' attribute.
	 * The default value is <code>"AUTO_CTRL_POINTS_DUPLICATE_ENDNODES"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.geometry.paths.SplineEndControlPointGenerationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Control Point Generation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Control Point Generation Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.geometry.paths.SplineEndControlPointGenerationMode
	 * @see #setEndControlPointGenerationMode(SplineEndControlPointGenerationMode)
	 * @see org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage#getCatmullRomWayPointPathInterpolator_EndControlPointGenerationMode()
	 * @model default="AUTO_CTRL_POINTS_DUPLICATE_ENDNODES" unique="false"
	 * @generated
	 */
	SplineEndControlPointGenerationMode getEndControlPointGenerationMode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getEndControlPointGenerationMode <em>End Control Point Generation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Control Point Generation Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.geometry.paths.SplineEndControlPointGenerationMode
	 * @see #getEndControlPointGenerationMode()
	 * @generated
	 */
	void setEndControlPointGenerationMode(SplineEndControlPointGenerationMode value);

} // CatmullRomWayPointPathInterpolator
