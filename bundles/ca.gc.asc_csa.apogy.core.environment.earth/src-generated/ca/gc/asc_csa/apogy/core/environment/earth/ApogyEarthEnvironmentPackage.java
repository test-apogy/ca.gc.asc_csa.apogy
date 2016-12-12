/**
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
package ca.gc.asc_csa.apogy.core.environment.earth;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
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
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyEarthEnvironment' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCoreEnvironment' complianceLevel='6.0' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.core.environment.earth/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.environment.earth.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core.environment'"
 * @generated
 */
public interface ApogyEarthEnvironmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "earth";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core.environment.earth";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "earth";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyEarthEnvironmentPackage eINSTANCE = ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.impl.GeographicCoordinatesImpl <em>Geographic Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.GeographicCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentPackageImpl#getGeographicCoordinates()
	 * @generated
	 */
	int GEOGRAPHIC_COORDINATES = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES__LONGITUDE = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES__ELEVATION = 2;

	/**
	 * The number of structural features of the '<em>Geographic Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Geographic Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.impl.EarthSurfaceLocationImpl <em>Earth Surface Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.EarthSurfaceLocationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentPackageImpl#getEarthSurfaceLocation()
	 * @generated
	 */
	int EARTH_SURFACE_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION__LONGITUDE = GEOGRAPHIC_COORDINATES__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION__LATITUDE = GEOGRAPHIC_COORDINATES__LATITUDE;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION__ELEVATION = GEOGRAPHIC_COORDINATES__ELEVATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION__NAME = GEOGRAPHIC_COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION__DESCRIPTION = GEOGRAPHIC_COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Earth Surface Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_FEATURE_COUNT = GEOGRAPHIC_COORDINATES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Earth Surface Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_OPERATION_COUNT = GEOGRAPHIC_COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.impl.HorizontalCoordinatesImpl <em>Horizontal Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.HorizontalCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentPackageImpl#getHorizontalCoordinates()
	 * @generated
	 */
	int HORIZONTAL_COORDINATES = 2;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_COORDINATES__ALTITUDE = 0;

	/**
	 * The feature id for the '<em><b>Azimuth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_COORDINATES__AZIMUTH = 1;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_COORDINATES__RADIUS = 2;

	/**
	 * The number of structural features of the '<em>Horizontal Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_COORDINATES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Horizontal Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_COORDINATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.impl.EclipticCoordinatesImpl <em>Ecliptic Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.EclipticCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentPackageImpl#getEclipticCoordinates()
	 * @generated
	 */
	int ECLIPTIC_COORDINATES = 3;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPTIC_COORDINATES__LONGITUDE = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPTIC_COORDINATES__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPTIC_COORDINATES__RADIUS = 2;

	/**
	 * The number of structural features of the '<em>Ecliptic Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPTIC_COORDINATES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ecliptic Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLIPTIC_COORDINATES_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthFacadeImpl <em>Apogy Earth Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentPackageImpl#getApogyEarthFacade()
	 * @generated
	 */
	int APOGY_EARTH_FACADE = 4;

	/**
	 * The number of structural features of the '<em>Apogy Earth Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Moon Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_FACADE___GET_MOON_VECTOR__APOGYSYSTEM_STRING_ENVIRONMENT = 0;

	/**
	 * The operation id for the '<em>Get Moon Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_FACADE___GET_MOON_VECTOR__NODE_ENVIRONMENT = 1;

	/**
	 * The operation id for the '<em>Create Geographic Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_FACADE___CREATE_GEOGRAPHIC_COORDINATES__DOUBLE_DOUBLE_DOUBLE = 2;

	/**
	 * The operation id for the '<em>Create Earth Surface Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_FACADE___CREATE_EARTH_SURFACE_LOCATION__STRING_STRING_DOUBLE_DOUBLE_DOUBLE = 3;

	/**
	 * The number of operations of the '<em>Apogy Earth Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_FACADE_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates <em>Geographic Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geographic Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates
	 * @generated
	 */
	EClass getGeographicCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates#getLongitude()
	 * @see #getGeographicCoordinates()
	 * @generated
	 */
	EAttribute getGeographicCoordinates_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates#getLatitude()
	 * @see #getGeographicCoordinates()
	 * @generated
	 */
	EAttribute getGeographicCoordinates_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates#getElevation()
	 * @see #getGeographicCoordinates()
	 * @generated
	 */
	EAttribute getGeographicCoordinates_Elevation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.EarthSurfaceLocation <em>Earth Surface Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Surface Location</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.EarthSurfaceLocation
	 * @generated
	 */
	EClass getEarthSurfaceLocation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates <em>Horizontal Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates
	 * @generated
	 */
	EClass getHorizontalCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getAltitude()
	 * @see #getHorizontalCoordinates()
	 * @generated
	 */
	EAttribute getHorizontalCoordinates_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getAzimuth <em>Azimuth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getAzimuth()
	 * @see #getHorizontalCoordinates()
	 * @generated
	 */
	EAttribute getHorizontalCoordinates_Azimuth();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getRadius()
	 * @see #getHorizontalCoordinates()
	 * @generated
	 */
	EAttribute getHorizontalCoordinates_Radius();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates <em>Ecliptic Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecliptic Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates
	 * @generated
	 */
	EClass getEclipticCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getLongitude()
	 * @see #getEclipticCoordinates()
	 * @generated
	 */
	EAttribute getEclipticCoordinates_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getLatitude()
	 * @see #getEclipticCoordinates()
	 * @generated
	 */
	EAttribute getEclipticCoordinates_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getRadius()
	 * @see #getEclipticCoordinates()
	 * @generated
	 */
	EAttribute getEclipticCoordinates_Radius();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade <em>Apogy Earth Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy Earth Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade
	 * @generated
	 */
	EClass getApogyEarthFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade#getMoonVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Moon Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moon Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade#getMoonVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyEarthFacade__GetMoonVector__ApogySystem_String_Environment();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade#getMoonVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Moon Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moon Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade#getMoonVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyEarthFacade__GetMoonVector__Node_Environment();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade#createGeographicCoordinates(double, double, double) <em>Create Geographic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Geographic Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade#createGeographicCoordinates(double, double, double)
	 * @generated
	 */
	EOperation getApogyEarthFacade__CreateGeographicCoordinates__double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade#createEarthSurfaceLocation(java.lang.String, java.lang.String, double, double, double) <em>Create Earth Surface Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Earth Surface Location</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade#createEarthSurfaceLocation(java.lang.String, java.lang.String, double, double, double)
	 * @generated
	 */
	EOperation getApogyEarthFacade__CreateEarthSurfaceLocation__String_String_double_double_double();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyEarthEnvironmentFactory getApogyEarthEnvironmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.impl.GeographicCoordinatesImpl <em>Geographic Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.GeographicCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentPackageImpl#getGeographicCoordinates()
		 * @generated
		 */
		EClass GEOGRAPHIC_COORDINATES = eINSTANCE.getGeographicCoordinates();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHIC_COORDINATES__LONGITUDE = eINSTANCE.getGeographicCoordinates_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHIC_COORDINATES__LATITUDE = eINSTANCE.getGeographicCoordinates_Latitude();

		/**
		 * The meta object literal for the '<em><b>Elevation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOGRAPHIC_COORDINATES__ELEVATION = eINSTANCE.getGeographicCoordinates_Elevation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.impl.EarthSurfaceLocationImpl <em>Earth Surface Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.EarthSurfaceLocationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentPackageImpl#getEarthSurfaceLocation()
		 * @generated
		 */
		EClass EARTH_SURFACE_LOCATION = eINSTANCE.getEarthSurfaceLocation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.impl.HorizontalCoordinatesImpl <em>Horizontal Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.HorizontalCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentPackageImpl#getHorizontalCoordinates()
		 * @generated
		 */
		EClass HORIZONTAL_COORDINATES = eINSTANCE.getHorizontalCoordinates();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_COORDINATES__ALTITUDE = eINSTANCE.getHorizontalCoordinates_Altitude();

		/**
		 * The meta object literal for the '<em><b>Azimuth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_COORDINATES__AZIMUTH = eINSTANCE.getHorizontalCoordinates_Azimuth();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_COORDINATES__RADIUS = eINSTANCE.getHorizontalCoordinates_Radius();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.impl.EclipticCoordinatesImpl <em>Ecliptic Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.EclipticCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentPackageImpl#getEclipticCoordinates()
		 * @generated
		 */
		EClass ECLIPTIC_COORDINATES = eINSTANCE.getEclipticCoordinates();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPTIC_COORDINATES__LONGITUDE = eINSTANCE.getEclipticCoordinates_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPTIC_COORDINATES__LATITUDE = eINSTANCE.getEclipticCoordinates_Latitude();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLIPTIC_COORDINATES__RADIUS = eINSTANCE.getEclipticCoordinates_Radius();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthFacadeImpl <em>Apogy Earth Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthEnvironmentPackageImpl#getApogyEarthFacade()
		 * @generated
		 */
		EClass APOGY_EARTH_FACADE = eINSTANCE.getApogyEarthFacade();

		/**
		 * The meta object literal for the '<em><b>Get Moon Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EARTH_FACADE___GET_MOON_VECTOR__APOGYSYSTEM_STRING_ENVIRONMENT = eINSTANCE.getApogyEarthFacade__GetMoonVector__ApogySystem_String_Environment();

		/**
		 * The meta object literal for the '<em><b>Get Moon Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EARTH_FACADE___GET_MOON_VECTOR__NODE_ENVIRONMENT = eINSTANCE.getApogyEarthFacade__GetMoonVector__Node_Environment();

		/**
		 * The meta object literal for the '<em><b>Create Geographic Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EARTH_FACADE___CREATE_GEOGRAPHIC_COORDINATES__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getApogyEarthFacade__CreateGeographicCoordinates__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Earth Surface Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EARTH_FACADE___CREATE_EARTH_SURFACE_LOCATION__STRING_STRING_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getApogyEarthFacade__CreateEarthSurfaceLocation__String_String_double_double_double();

	}

} //ApogyEarthEnvironmentPackage
