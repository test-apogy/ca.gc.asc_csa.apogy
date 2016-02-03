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

import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecraft Location World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#getTimeSource <em>Time Source</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#isShowGroundProjection <em>Show Ground Projection</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#isShowLatLon <em>Show Lat Lon</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getSpacecraftLocationWorldWindLayer()
 * @model
 * @generated
 */
public interface SpacecraftLocationWorldWindLayer extends AbstractWorldWindLayer, Named {
	/**
	 * Returns the value of the '<em><b>Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbit Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The orbit model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orbit Model</em>' reference.
	 * @see #setOrbitModel(OrbitModel)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getSpacecraftLocationWorldWindLayer_OrbitModel()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='ORBIT_MODEL'"
	 * @generated
	 */
	OrbitModel getOrbitModel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#getOrbitModel <em>Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbit Model</em>' reference.
	 * @see #getOrbitModel()
	 * @generated
	 */
	void setOrbitModel(OrbitModel value);

	/**
	 * Returns the value of the '<em><b>Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time source to used to get the time
	 * used to compute the S/C position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Source</em>' reference.
	 * @see #setTimeSource(Timed)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getSpacecraftLocationWorldWindLayer_TimeSource()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TIME'"
	 * @generated
	 */
	Timed getTimeSource();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#getTimeSource <em>Time Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Source</em>' reference.
	 * @see #getTimeSource()
	 * @generated
	 */
	void setTimeSource(Timed value);

	/**
	 * Returns the value of the '<em><b>Show Ground Projection</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to display the position
	 * projected on the ground.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show Ground Projection</em>' attribute.
	 * @see #setShowGroundProjection(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getSpacecraftLocationWorldWindLayer_ShowGroundProjection()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable'"
	 * @generated
	 */
	boolean isShowGroundProjection();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#isShowGroundProjection <em>Show Ground Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Ground Projection</em>' attribute.
	 * @see #isShowGroundProjection()
	 * @generated
	 */
	void setShowGroundProjection(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Lat Lon</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to the longitude and
	 * latitude of the spacecraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show Lat Lon</em>' attribute.
	 * @see #setShowLatLon(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getSpacecraftLocationWorldWindLayer_ShowLatLon()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable'"
	 * @generated
	 */
	boolean isShowLatLon();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#isShowLatLon <em>Show Lat Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Lat Lon</em>' attribute.
	 * @see #isShowLatLon()
	 * @generated
	 */
	void setShowLatLon(boolean value);

} // SpacecraftLocationWorldWindLayer
