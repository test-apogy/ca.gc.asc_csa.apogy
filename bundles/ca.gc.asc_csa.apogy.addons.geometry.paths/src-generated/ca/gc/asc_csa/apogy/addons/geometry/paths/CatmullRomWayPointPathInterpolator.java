package ca.gc.asc_csa.apogy.addons.geometry.paths;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */


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
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getTension <em>Tension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getMaximumWayPointsDistance <em>Maximum Way Points Distance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getEndControlPointGenerationMode <em>End Control Point Generation Mode</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage#getCatmullRomWayPointPathInterpolator()
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
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage#getCatmullRomWayPointPathInterpolator_Tension()
	 * @model default="0.5" unique="false"
	 * @generated
	 */
	double getTension();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getTension <em>Tension</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage#getCatmullRomWayPointPathInterpolator_MaximumWayPointsDistance()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getMaximumWayPointsDistance();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getMaximumWayPointsDistance <em>Maximum Way Points Distance</em>}' attribute.
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
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.addons.geometry.paths.SplineEndControlPointGenerationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Control Point Generation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Control Point Generation Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.SplineEndControlPointGenerationMode
	 * @see #setEndControlPointGenerationMode(SplineEndControlPointGenerationMode)
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage#getCatmullRomWayPointPathInterpolator_EndControlPointGenerationMode()
	 * @model default="AUTO_CTRL_POINTS_DUPLICATE_ENDNODES" unique="false"
	 * @generated
	 */
	SplineEndControlPointGenerationMode getEndControlPointGenerationMode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator#getEndControlPointGenerationMode <em>End Control Point Generation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Control Point Generation Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.SplineEndControlPointGenerationMode
	 * @see #getEndControlPointGenerationMode()
	 * @generated
	 */
	void setEndControlPointGenerationMode(SplineEndControlPointGenerationMode value);

} // CatmullRomWayPointPathInterpolator
