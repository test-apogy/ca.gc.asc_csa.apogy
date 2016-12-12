package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui;
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
 * A representation of the model object '<em><b>Earth Surface Location World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getEarthSurfaceLocation <em>Earth Surface Location</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getTargetRadius <em>Target Radius</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getEarthSurfaceLocationWorldWindLayer()
 * @model
 * @generated
 */
public interface EarthSurfaceLocationWorldWindLayer extends AbstractWorldWindLayer {
	/**
	 * Returns the value of the '<em><b>Earth Surface Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Earth Surface Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earth Surface Location</em>' reference.
	 * @see #setEarthSurfaceLocation(ca.gc.asc_csa.apogy.core.environment.earth.EarthSurfaceLocation)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getEarthSurfaceLocationWorldWindLayer_EarthSurfaceLocation()
	 * @model
	 * @generated
	 */
	ca.gc.asc_csa.apogy.core.environment.earth.EarthSurfaceLocation getEarthSurfaceLocation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getEarthSurfaceLocation <em>Earth Surface Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earth Surface Location</em>' reference.
	 * @see #getEarthSurfaceLocation()
	 * @generated
	 */
	void setEarthSurfaceLocation(ca.gc.asc_csa.apogy.core.environment.earth.EarthSurfaceLocation value);

	/**
	 * Returns the value of the '<em><b>Target Radius</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The radius of the target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Radius</em>' attribute.
	 * @see #setTargetRadius(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getEarthSurfaceLocationWorldWindLayer_TargetRadius()
	 * @model default="50" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VISUALS' apogy_units='km'"
	 * @generated
	 */
	double getTargetRadius();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getTargetRadius <em>Target Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Radius</em>' attribute.
	 * @see #getTargetRadius()
	 * @generated
	 */
	void setTargetRadius(double value);

} // EarthSurfaceLocationWorldWindLayer
