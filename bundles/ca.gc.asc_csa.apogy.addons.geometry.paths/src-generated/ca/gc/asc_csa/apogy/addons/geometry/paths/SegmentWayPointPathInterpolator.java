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
 * A representation of the model object '<em><b>Segment Way Point Path Interpolator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.SegmentWayPointPathInterpolator#getMaximumDistanceInterval <em>Maximum Distance Interval</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage#getSegmentWayPointPathInterpolator()
 * @model
 * @generated
 */
public interface SegmentWayPointPathInterpolator extends WayPointPathInterpolator {
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
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage#getSegmentWayPointPathInterpolator_MaximumDistanceInterval()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getMaximumDistanceInterval();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.SegmentWayPointPathInterpolator#getMaximumDistanceInterval <em>Maximum Distance Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Distance Interval</em>' attribute.
	 * @see #getMaximumDistanceInterval()
	 * @generated
	 */
	void setMaximumDistanceInterval(double value);

} // SegmentWayPointPathInterpolator
