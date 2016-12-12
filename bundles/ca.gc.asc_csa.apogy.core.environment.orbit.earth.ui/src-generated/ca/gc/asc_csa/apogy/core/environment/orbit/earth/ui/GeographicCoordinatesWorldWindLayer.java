/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui;

import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geographic Coordinates World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer#getGeographicCoordinatesList <em>Geographic Coordinates List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer#isLockSelection <em>Lock Selection</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer#isDisplayLocation <em>Display Location</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer#getDisplayedRadius <em>Displayed Radius</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGeographicCoordinatesWorldWindLayer()
 * @model
 * @generated
 */
public interface GeographicCoordinatesWorldWindLayer extends AbstractWorldWindLayer {
	/**
	 * Returns the value of the '<em><b>Geographic Coordinates List</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geographic Coordinates List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographic Coordinates List</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGeographicCoordinatesWorldWindLayer_GeographicCoordinatesList()
	 * @model transient="true" changeable="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	EList<GeographicCoordinates> getGeographicCoordinatesList();

	/**
	 * Returns the value of the '<em><b>Lock Selection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Specifies whether or not the layer will respond to new selection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lock Selection</em>' attribute.
	 * @see #setLockSelection(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGeographicCoordinatesWorldWindLayer_LockSelection()
	 * @model default="false" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	boolean isLockSelection();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer#isLockSelection <em>Lock Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Selection</em>' attribute.
	 * @see #isLockSelection()
	 * @generated
	 */
	void setLockSelection(boolean value);

	/**
	 * Returns the value of the '<em><b>Display Location</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Specified wether or not to add the lat/lon/alt as aprt of the displayed text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Location</em>' attribute.
	 * @see #setDisplayLocation(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGeographicCoordinatesWorldWindLayer_DisplayLocation()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='VISUALS'"
	 * @generated
	 */
	boolean isDisplayLocation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer#isDisplayLocation <em>Display Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Location</em>' attribute.
	 * @see #isDisplayLocation()
	 * @generated
	 */
	void setDisplayLocation(boolean value);

	/**
	 * Returns the value of the '<em><b>Displayed Radius</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayed Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Specifies the radius of the circle display at the target location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Displayed Radius</em>' attribute.
	 * @see #setDisplayedRadius(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGeographicCoordinatesWorldWindLayer_DisplayedRadius()
	 * @model default="50" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VISUALS' apogy_units='km'"
	 * @generated
	 */
	double getDisplayedRadius();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer#getDisplayedRadius <em>Displayed Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displayed Radius</em>' attribute.
	 * @see #getDisplayedRadius()
	 * @generated
	 */
	void setDisplayedRadius(double value);

} // GeographicCoordinatesWorldWindLayer
