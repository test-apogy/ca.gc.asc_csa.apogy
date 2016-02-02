package ca.gc.asc_csa.apogy.core.environment.orbit.earth;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;

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
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreEnvironmentOrbitEarth' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='ApogyCoreEnvironmentOrbitEarth' complianceLevel='8.0' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.core.environment.orbit.earth/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.environment.orbit.earth.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core.environment.orbit'"
 * @generated
 */
public interface ApogyCoreEnvironmentOrbitEarthPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.core.environment.orbit.earth";

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
	ApogyCoreEnvironmentOrbitEarthPackage eINSTANCE = ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedSpacecraftStateImpl <em>Ore Kit Backed Spacecraft State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedSpacecraftStateImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitBackedSpacecraftState()
	 * @generated
	 */
	int ORE_KIT_BACKED_SPACECRAFT_STATE = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_SPACECRAFT_STATE__TIME = ApogyCoreEnvironmentOrbitPackage.SPACECRAFT_STATE__TIME;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_SPACECRAFT_STATE__COORDINATES = ApogyCoreEnvironmentOrbitPackage.SPACECRAFT_STATE__COORDINATES;

	/**
	 * The feature id for the '<em><b>Attitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_SPACECRAFT_STATE__ATTITUDE = ApogyCoreEnvironmentOrbitPackage.SPACECRAFT_STATE__ATTITUDE;

	/**
	 * The feature id for the '<em><b>Orbit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_SPACECRAFT_STATE__ORBIT = ApogyCoreEnvironmentOrbitPackage.SPACECRAFT_STATE__ORBIT;

	/**
	 * The feature id for the '<em><b>Ore Kit Spacecraft State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_SPACECRAFT_STATE__ORE_KIT_SPACECRAFT_STATE = ApogyCoreEnvironmentOrbitPackage.SPACECRAFT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ore Kit Backed Spacecraft State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_SPACECRAFT_STATE_FEATURE_COUNT = ApogyCoreEnvironmentOrbitPackage.SPACECRAFT_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ore Kit Backed Spacecraft State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_SPACECRAFT_STATE_OPERATION_COUNT = ApogyCoreEnvironmentOrbitPackage.SPACECRAFT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedFrameImpl <em>Ore Kit Backed Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedFrameImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitBackedFrame()
	 * @generated
	 */
	int ORE_KIT_BACKED_FRAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_FRAME__NAME = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_FRAME__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_FRAME__DESCRIPTION = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_FRAME__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Ore Kit Backed Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_FRAME_FEATURE_COUNT = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_FRAME_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Ore Kit Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_FRAME___GET_ORE_KIT_FRAME = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_FRAME_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ore Kit Backed Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_FRAME_OPERATION_COUNT = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_FRAME_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedAttitudeProviderImpl <em>Ore Kit Backed Attitude Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedAttitudeProviderImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitBackedAttitudeProvider()
	 * @generated
	 */
	int ORE_KIT_BACKED_ATTITUDE_PROVIDER = 2;

	/**
	 * The number of structural features of the '<em>Ore Kit Backed Attitude Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_ATTITUDE_PROVIDER_FEATURE_COUNT = ApogyCoreEnvironmentOrbitPackage.ATTITUDE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Attitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_ATTITUDE_PROVIDER___GET_ATTITUDE__PVCOORDINATESPROVIDERPROVIDER_DATE_ABSTRACTFRAME = ApogyCoreEnvironmentOrbitPackage.ATTITUDE_PROVIDER___GET_ATTITUDE__PVCOORDINATESPROVIDERPROVIDER_DATE_ABSTRACTFRAME;

	/**
	 * The operation id for the '<em>Get Ore Kit Attitude Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_ATTITUDE_PROVIDER___GET_ORE_KIT_ATTITUDE_PROVIDER = ApogyCoreEnvironmentOrbitPackage.ATTITUDE_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ore Kit Backed Attitude Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORE_KIT_BACKED_ATTITUDE_PROVIDER_OPERATION_COUNT = ApogyCoreEnvironmentOrbitPackage.ATTITUDE_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.NadirPointingAttitudeProviderImpl <em>Nadir Pointing Attitude Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.NadirPointingAttitudeProviderImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getNadirPointingAttitudeProvider()
	 * @generated
	 */
	int NADIR_POINTING_ATTITUDE_PROVIDER = 3;

	/**
	 * The number of structural features of the '<em>Nadir Pointing Attitude Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NADIR_POINTING_ATTITUDE_PROVIDER_FEATURE_COUNT = ORE_KIT_BACKED_ATTITUDE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Attitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NADIR_POINTING_ATTITUDE_PROVIDER___GET_ATTITUDE__PVCOORDINATESPROVIDERPROVIDER_DATE_ABSTRACTFRAME = ORE_KIT_BACKED_ATTITUDE_PROVIDER___GET_ATTITUDE__PVCOORDINATESPROVIDERPROVIDER_DATE_ABSTRACTFRAME;

	/**
	 * The operation id for the '<em>Get Ore Kit Attitude Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NADIR_POINTING_ATTITUDE_PROVIDER___GET_ORE_KIT_ATTITUDE_PROVIDER = ORE_KIT_BACKED_ATTITUDE_PROVIDER___GET_ORE_KIT_ATTITUDE_PROVIDER;

	/**
	 * The number of operations of the '<em>Nadir Pointing Attitude Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NADIR_POINTING_ATTITUDE_PROVIDER_OPERATION_COUNT = ORE_KIT_BACKED_ATTITUDE_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitWorksiteImpl <em>Earth Orbit Worksite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitWorksiteImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthOrbitWorksite()
	 * @generated
	 */
	int EARTH_ORBIT_WORKSITE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE__NAME = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE__DESCRIPTION = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE__TIME = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__TIME;

	/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE__WORKSITES_LIST = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__WORKSITES_LIST;

	/**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE__WORKSITE_NODE = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__WORKSITE_NODE;

	/**
	 * The feature id for the '<em><b>Orbits Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE__ORBITS_MODELS = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ORBITS_MODELS;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE__ENVIRONMENT = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Active Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL;

	/**
	 * The feature id for the '<em><b>Sky</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE__SKY = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Earth Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Earth Orbit Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE_FEATURE_COUNT = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Earth Orbit Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_WORKSITE_OPERATION_COUNT = ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitSkyImpl <em>Earth Orbit Sky</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitSkyImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthOrbitSky()
	 * @generated
	 */
	int EARTH_ORBIT_SKY = 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY__TIME = ApogyCoreEnvironmentPackage.SKY__TIME;

	/**
	 * The feature id for the '<em><b>Surface Worksite</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY__SURFACE_WORKSITE = ApogyCoreEnvironmentPackage.SKY__SURFACE_WORKSITE;

	/**
	 * The feature id for the '<em><b>Sky Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY__SKY_NODE = ApogyCoreEnvironmentPackage.SKY__SKY_NODE;

	/**
	 * The feature id for the '<em><b>Sun</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY__SUN = ApogyCoreEnvironmentPackage.SKY__SUN;

	/**
	 * The feature id for the '<em><b>Sun Horizontal Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY__SUN_HORIZONTAL_COORDINATES = ApogyCoreEnvironmentPackage.SKY__SUN_HORIZONTAL_COORDINATES;

	/**
	 * The feature id for the '<em><b>Star Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY__STAR_FIELD = ApogyCoreEnvironmentPackage.SKY__STAR_FIELD;

	/**
	 * The feature id for the '<em><b>Earth Orbit Worksite</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE = ApogyCoreEnvironmentPackage.SKY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Moon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY__MOON = ApogyCoreEnvironmentPackage.SKY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Earth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY__EARTH = ApogyCoreEnvironmentPackage.SKY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Earth Orbit Sky</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY_FEATURE_COUNT = ApogyCoreEnvironmentPackage.SKY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Sun Angular Diameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY___GET_SUN_ANGULAR_DIAMETER = ApogyCoreEnvironmentPackage.SKY___GET_SUN_ANGULAR_DIAMETER;

	/**
	 * The operation id for the '<em>Get Moon Angular Diameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY___GET_MOON_ANGULAR_DIAMETER = ApogyCoreEnvironmentPackage.SKY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Earth Angular Diameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY___GET_EARTH_ANGULAR_DIAMETER = ApogyCoreEnvironmentPackage.SKY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Earth Orbit Sky</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_SKY_OPERATION_COUNT = ApogyCoreEnvironmentPackage.SKY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitImpl <em>Earth Orbit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthOrbit()
	 * @generated
	 */
	int EARTH_ORBIT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT__NAME = ApogyCoreEnvironmentOrbitPackage.ORBIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT__DESCRIPTION = ApogyCoreEnvironmentOrbitPackage.ORBIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT__TIME = ApogyCoreEnvironmentOrbitPackage.ORBIT__TIME;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT__REFERENCE_FRAME = ApogyCoreEnvironmentOrbitPackage.ORBIT__REFERENCE_FRAME;

	/**
	 * The number of structural features of the '<em>Earth Orbit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_FEATURE_COUNT = ApogyCoreEnvironmentOrbitPackage.ORBIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Ore Kit Orbit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT___GET_ORE_KIT_ORBIT = ApogyCoreEnvironmentOrbitPackage.ORBIT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Earth Orbit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_OPERATION_COUNT = ApogyCoreEnvironmentOrbitPackage.ORBIT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.KeplerianEarthOrbitImpl <em>Keplerian Earth Orbit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.KeplerianEarthOrbitImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getKeplerianEarthOrbit()
	 * @generated
	 */
	int KEPLERIAN_EARTH_ORBIT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT__NAME = EARTH_ORBIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT__DESCRIPTION = EARTH_ORBIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT__TIME = EARTH_ORBIT__TIME;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT__REFERENCE_FRAME = EARTH_ORBIT__REFERENCE_FRAME;

	/**
	 * The feature id for the '<em><b>Semi Major Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT__SEMI_MAJOR_AXIS = EARTH_ORBIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eccentricity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT__ECCENTRICITY = EARTH_ORBIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inclination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT__INCLINATION = EARTH_ORBIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Perigee Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT__PERIGEE_ARGUMENT = EARTH_ORBIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Right Ascention Of Ascending Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT__RIGHT_ASCENTION_OF_ASCENDING_NODE = EARTH_ORBIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mean Anomaly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT__MEAN_ANOMALY = EARTH_ORBIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>True Anomaly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT__TRUE_ANOMALY = EARTH_ORBIT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Keplerian Earth Orbit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_FEATURE_COUNT = EARTH_ORBIT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Ore Kit Orbit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT___GET_ORE_KIT_ORBIT = EARTH_ORBIT___GET_ORE_KIT_ORBIT;

	/**
	 * The operation id for the '<em>Get Ore Kit Keplerian Orbit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT___GET_ORE_KIT_KEPLERIAN_ORBIT = EARTH_ORBIT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Keplerian Earth Orbit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_OPERATION_COUNT = EARTH_ORBIT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CartesianEarthOrbitImpl <em>Cartesian Earth Orbit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CartesianEarthOrbitImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getCartesianEarthOrbit()
	 * @generated
	 */
	int CARTESIAN_EARTH_ORBIT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_EARTH_ORBIT__NAME = EARTH_ORBIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_EARTH_ORBIT__DESCRIPTION = EARTH_ORBIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_EARTH_ORBIT__TIME = EARTH_ORBIT__TIME;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_EARTH_ORBIT__REFERENCE_FRAME = EARTH_ORBIT__REFERENCE_FRAME;

	/**
	 * The feature id for the '<em><b>Pva Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_EARTH_ORBIT__PVA_COORDINATES = EARTH_ORBIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cartesian Earth Orbit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_EARTH_ORBIT_FEATURE_COUNT = EARTH_ORBIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Ore Kit Orbit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_EARTH_ORBIT___GET_ORE_KIT_ORBIT = EARTH_ORBIT___GET_ORE_KIT_ORBIT;

	/**
	 * The operation id for the '<em>Get Ore Kit Cartesian Orbit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_EARTH_ORBIT___GET_ORE_KIT_CARTESIAN_ORBIT = EARTH_ORBIT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cartesian Earth Orbit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_EARTH_ORBIT_OPERATION_COUNT = EARTH_ORBIT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ElevationMaskImpl <em>Elevation Mask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ElevationMaskImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getElevationMask()
	 * @generated
	 */
	int ELEVATION_MASK = 9;

	/**
	 * The number of structural features of the '<em>Elevation Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATION_MASK_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Elevation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATION_MASK___GET_ELEVATION__DOUBLE = 0;

	/**
	 * The operation id for the '<em>Get Ore Kit Elevation Mask</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATION_MASK___GET_ORE_KIT_ELEVATION_MASK = 1;

	/**
	 * The number of operations of the '<em>Elevation Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATION_MASK_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ConstantElevationMaskImpl <em>Constant Elevation Mask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ConstantElevationMaskImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getConstantElevationMask()
	 * @generated
	 */
	int CONSTANT_ELEVATION_MASK = 10;

	/**
	 * The feature id for the '<em><b>Constant Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ELEVATION_MASK__CONSTANT_ELEVATION = ELEVATION_MASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Elevation Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ELEVATION_MASK_FEATURE_COUNT = ELEVATION_MASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Elevation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ELEVATION_MASK___GET_ELEVATION__DOUBLE = ELEVATION_MASK___GET_ELEVATION__DOUBLE;

	/**
	 * The operation id for the '<em>Get Ore Kit Elevation Mask</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ELEVATION_MASK___GET_ORE_KIT_ELEVATION_MASK = ELEVATION_MASK___GET_ORE_KIT_ELEVATION_MASK;

	/**
	 * The number of operations of the '<em>Constant Elevation Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_ELEVATION_MASK_OPERATION_COUNT = ELEVATION_MASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitPropagatorImpl <em>Earth Orbit Propagator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitPropagatorImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthOrbitPropagator()
	 * @generated
	 */
	int EARTH_ORBIT_PROPAGATOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR__NAME = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR__DESCRIPTION = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR__REFERENCE_FRAME = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME;

	/**
	 * The feature id for the '<em><b>Attitude Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Initial Orbit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__INITIAL_ORBIT;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_FROM_DATE;

	/**
	 * The feature id for the '<em><b>Valid To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR__VALID_TO_DATE;

	/**
	 * The number of structural features of the '<em>Earth Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR_FEATURE_COUNT = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Propagate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR___PROPAGATE__DATE = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR___PROPAGATE__DATE;

	/**
	 * The operation id for the '<em>Get Spacecraft States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE;

	/**
	 * The operation id for the '<em>Is Date In Valid Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE;

	/**
	 * The operation id for the '<em>Get Ore Kit Propagator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Target Passes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Ground Station Passes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Earth Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_ORBIT_PROPAGATOR_OPERATION_COUNT = ApogyCoreEnvironmentOrbitPackage.ABSTRACT_ORBIT_PROPAGATOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.KeplerianEarthOrbitPropagatorImpl <em>Keplerian Earth Orbit Propagator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.KeplerianEarthOrbitPropagatorImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getKeplerianEarthOrbitPropagator()
	 * @generated
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR__NAME = EARTH_ORBIT_PROPAGATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR__DESCRIPTION = EARTH_ORBIT_PROPAGATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR__REFERENCE_FRAME = EARTH_ORBIT_PROPAGATOR__REFERENCE_FRAME;

	/**
	 * The feature id for the '<em><b>Attitude Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER = EARTH_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Initial Orbit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT = EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE = EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE;

	/**
	 * The feature id for the '<em><b>Valid To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE = EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE;

	/**
	 * The number of structural features of the '<em>Keplerian Earth Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR_FEATURE_COUNT = EARTH_ORBIT_PROPAGATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Propagate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR___PROPAGATE__DATE = EARTH_ORBIT_PROPAGATOR___PROPAGATE__DATE;

	/**
	 * The operation id for the '<em>Get Spacecraft States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE = EARTH_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE;

	/**
	 * The operation id for the '<em>Is Date In Valid Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE = EARTH_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE;

	/**
	 * The operation id for the '<em>Get Ore Kit Propagator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR = EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR;

	/**
	 * The operation id for the '<em>Get Target Passes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK = EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK;

	/**
	 * The operation id for the '<em>Get Ground Station Passes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE = EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE;

	/**
	 * The operation id for the '<em>Get Ore Kit Keplerian Propagator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_KEPLERIAN_PROPAGATOR = EARTH_ORBIT_PROPAGATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Keplerian Earth Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEPLERIAN_EARTH_ORBIT_PROPAGATOR_OPERATION_COUNT = EARTH_ORBIT_PROPAGATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEEarthOrbitPropagatorImpl <em>TLE Earth Orbit Propagator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEEarthOrbitPropagatorImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getTLEEarthOrbitPropagator()
	 * @generated
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR__NAME = EARTH_ORBIT_PROPAGATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR__DESCRIPTION = EARTH_ORBIT_PROPAGATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR__REFERENCE_FRAME = EARTH_ORBIT_PROPAGATOR__REFERENCE_FRAME;

	/**
	 * The feature id for the '<em><b>Attitude Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER = EARTH_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Initial Orbit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT = EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE = EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE;

	/**
	 * The feature id for the '<em><b>Valid To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE = EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE;

	/**
	 * The feature id for the '<em><b>Tle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR__TLE = EARTH_ORBIT_PROPAGATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TLE Earth Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR_FEATURE_COUNT = EARTH_ORBIT_PROPAGATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Propagate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR___PROPAGATE__DATE = EARTH_ORBIT_PROPAGATOR___PROPAGATE__DATE;

	/**
	 * The operation id for the '<em>Get Spacecraft States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE = EARTH_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE;

	/**
	 * The operation id for the '<em>Is Date In Valid Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE = EARTH_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE;

	/**
	 * The operation id for the '<em>Get Ore Kit Propagator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR = EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR;

	/**
	 * The operation id for the '<em>Get Target Passes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK = EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK;

	/**
	 * The operation id for the '<em>Get Ground Station Passes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE = EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE;

	/**
	 * The operation id for the '<em>Get Ore Kit TLE Propagator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_TLE_PROPAGATOR = EARTH_ORBIT_PROPAGATOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>TLE Earth Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_EARTH_ORBIT_PROPAGATOR_OPERATION_COUNT = EARTH_ORBIT_PROPAGATOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.URLBasedTLEEarthOrbitPropagatorImpl <em>URL Based TLE Earth Orbit Propagator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.URLBasedTLEEarthOrbitPropagatorImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getURLBasedTLEEarthOrbitPropagator()
	 * @generated
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__NAME = TLE_EARTH_ORBIT_PROPAGATOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__DESCRIPTION = TLE_EARTH_ORBIT_PROPAGATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__REFERENCE_FRAME = TLE_EARTH_ORBIT_PROPAGATOR__REFERENCE_FRAME;

	/**
	 * The feature id for the '<em><b>Attitude Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER = TLE_EARTH_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Initial Orbit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT = TLE_EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE = TLE_EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE;

	/**
	 * The feature id for the '<em><b>Valid To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE = TLE_EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE;

	/**
	 * The feature id for the '<em><b>Tle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE = TLE_EARTH_ORBIT_PROPAGATOR__TLE;

	/**
	 * The feature id for the '<em><b>Tle URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE_URL = TLE_EARTH_ORBIT_PROPAGATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL Based TLE Earth Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR_FEATURE_COUNT = TLE_EARTH_ORBIT_PROPAGATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Propagate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR___PROPAGATE__DATE = TLE_EARTH_ORBIT_PROPAGATOR___PROPAGATE__DATE;

	/**
	 * The operation id for the '<em>Get Spacecraft States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE = TLE_EARTH_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE;

	/**
	 * The operation id for the '<em>Is Date In Valid Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE = TLE_EARTH_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE;

	/**
	 * The operation id for the '<em>Get Ore Kit Propagator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR = TLE_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR;

	/**
	 * The operation id for the '<em>Get Target Passes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK = TLE_EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK;

	/**
	 * The operation id for the '<em>Get Ground Station Passes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE = TLE_EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE;

	/**
	 * The operation id for the '<em>Get Ore Kit TLE Propagator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_TLE_PROPAGATOR = TLE_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_TLE_PROPAGATOR;

	/**
	 * The number of operations of the '<em>URL Based TLE Earth Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR_OPERATION_COUNT = TLE_EARTH_ORBIT_PROPAGATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEImpl <em>TLE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getTLE()
	 * @generated
	 */
	int TLE = 15;

	/**
	 * The feature id for the '<em><b>Line1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__LINE1 = 0;

	/**
	 * The feature id for the '<em><b>Line2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__LINE2 = 1;

	/**
	 * The feature id for the '<em><b>BStar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__BSTAR = 2;

	/**
	 * The feature id for the '<em><b>Epoch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__EPOCH = 3;

	/**
	 * The feature id for the '<em><b>Eccentricity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__ECCENTRICITY = 4;

	/**
	 * The feature id for the '<em><b>Element Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__ELEMENT_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Ephemeris Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__EPHEMERIS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Inclination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__INCLINATION = 7;

	/**
	 * The feature id for the '<em><b>Mean Anomaly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__MEAN_ANOMALY = 8;

	/**
	 * The feature id for the '<em><b>Mean Motion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__MEAN_MOTION = 9;

	/**
	 * The feature id for the '<em><b>Revolution Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__REVOLUTION_PER_DAY = 10;

	/**
	 * The feature id for the '<em><b>Mean Motion First Derivative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__MEAN_MOTION_FIRST_DERIVATIVE = 11;

	/**
	 * The feature id for the '<em><b>Mean Motion Second Derivative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__MEAN_MOTION_SECOND_DERIVATIVE = 12;

	/**
	 * The feature id for the '<em><b>Argument Of Perigee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__ARGUMENT_OF_PERIGEE = 13;

	/**
	 * The feature id for the '<em><b>Right Ascention Of Ascending Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE = 14;

	/**
	 * The feature id for the '<em><b>Revolution Number At Epoch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__REVOLUTION_NUMBER_AT_EPOCH = 15;

	/**
	 * The feature id for the '<em><b>Satellite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE__SATELLITE_NUMBER = 16;

	/**
	 * The number of structural features of the '<em>TLE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_FEATURE_COUNT = 17;

	/**
	 * The operation id for the '<em>Get Ore Kit TLE</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE___GET_ORE_KIT_TLE = 0;

	/**
	 * The number of operations of the '<em>TLE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl <em>Earth Surface Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthSurfaceLocation()
	 * @generated
	 */
	int EARTH_SURFACE_LOCATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geographical Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Earth Surface Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Earth Surface Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationListImpl <em>Earth Surface Location List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationListImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthSurfaceLocationList()
	 * @generated
	 */
	int EARTH_SURFACE_LOCATION_LIST = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Earth Surface Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_LIST__EARTH_SURFACE_LOCATIONS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Earth Surface Location List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Earth Surface Location List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationReferencesListImpl <em>Ground Station References List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationReferencesListImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getGroundStationReferencesList()
	 * @generated
	 */
	int GROUND_STATION_REFERENCES_LIST = 18;

	/**
	 * The feature id for the '<em><b>Ground Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_REFERENCES_LIST__GROUND_STATIONS = 0;

	/**
	 * The number of structural features of the '<em>Ground Station References List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_REFERENCES_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ground Station References List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_REFERENCES_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationImpl <em>Ground Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getGroundStation()
	 * @generated
	 */
	int GROUND_STATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION__NAME = EARTH_SURFACE_LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION__DESCRIPTION = EARTH_SURFACE_LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Geographical Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION__GEOGRAPHICAL_COORDINATES = EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES;

	/**
	 * The feature id for the '<em><b>Field Of View Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION__FIELD_OF_VIEW_ORIENTATION = EARTH_SURFACE_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elevation Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION__ELEVATION_MASK = EARTH_SURFACE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ground Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_FEATURE_COUNT = EARTH_SURFACE_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ground Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_OPERATION_COUNT = EARTH_SURFACE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationListImpl <em>Ground Station List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationListImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getGroundStationList()
	 * @generated
	 */
	int GROUND_STATION_LIST = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ground Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_LIST__GROUND_STATIONS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ground Station List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ground Station List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassImpl <em>Visibility Pass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getVisibilityPass()
	 * @generated
	 */
	int VISIBILITY_PASS = 21;

	/**
	 * The feature id for the '<em><b>Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS__ORBIT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Surface Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS__SURFACE_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS__END_TIME = 3;

	/**
	 * The feature id for the '<em><b>Position History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS__POSITION_HISTORY = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS__DURATION = 5;

	/**
	 * The number of structural features of the '<em>Visibility Pass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Visibility Pass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionHistoryImpl <em>Visibility Pass Spacecraft Position History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionHistoryImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getVisibilityPassSpacecraftPositionHistory()
	 * @generated
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY = 22;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Visibility Pass</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS = 1;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS = 2;

	/**
	 * The number of structural features of the '<em>Visibility Pass Spacecraft Position History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Highest Elevation Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_HIGHEST_ELEVATION_POSITION = 0;

	/**
	 * The operation id for the '<em>Get Smallest Spacecraft Cross Track Angle Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_SMALLEST_SPACECRAFT_CROSS_TRACK_ANGLE_POSITION = 1;

	/**
	 * The operation id for the '<em>Update History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___UPDATE_HISTORY = 2;

	/**
	 * The number of operations of the '<em>Visibility Pass Spacecraft Position History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl <em>Visibility Pass Spacecraft Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getVisibilityPassSpacecraftPosition()
	 * @generated
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION = 23;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION__TIME = ApogyCommonEMFPackage.TIMED__TIME;

	/**
	 * The feature id for the '<em><b>Azimuth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Range Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Spacecraft Cross Track Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Visibility Pass Spacecraft Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION_FEATURE_COUNT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Visibility Pass Spacecraft Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBILITY_PASS_SPACECRAFT_POSITION_OPERATION_COUNT = ApogyCommonEMFPackage.TIMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl <em>Spacecrafts Visibility Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getSpacecraftsVisibilitySet()
	 * @generated
	 */
	int SPACECRAFTS_VISIBILITY_SET = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Updating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET__UPDATING = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto Update Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET__AUTO_UPDATE_ENABLED = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET__START_TIME = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET__END_TIME = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Orbit Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET__ORBIT_MODELS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ground Stations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET__GROUND_STATIONS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Passes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET__PASSES = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ground Station To Visibility Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET__GROUND_STATION_TO_VISIBILITY_MAP = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Spacecrafts Visibility Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET___GET_DEFAULT_AUTO_UPDATE_ENABLED = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET___UPDATE = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Spacecrafts Visibility Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFTS_VISIBILITY_SET_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CorridorPointImpl <em>Corridor Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CorridorPointImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getCorridorPoint()
	 * @generated
	 */
	int CORRIDOR_POINT = 25;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR_POINT__TIME = ApogyCommonEMFPackage.TIMED__TIME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR_POINT__LEFT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR_POINT__CENTER = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR_POINT__RIGHT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Corridor Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR_POINT_FEATURE_COUNT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Corridor Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR_POINT_OPERATION_COUNT = ApogyCommonEMFPackage.TIMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CorridorImpl <em>Corridor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CorridorImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getCorridor()
	 * @generated
	 */
	int CORRIDOR = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR__POINTS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Corridor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Corridor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRIDOR_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl <em>Spacecraft Swath Corridor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getSpacecraftSwathCorridor()
	 * @generated
	 */
	int SPACECRAFT_SWATH_CORRIDOR = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Updating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR__UPDATING = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto Update Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR__AUTO_UPDATE_ENABLED = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR__START_TIME = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR__END_TIME = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR__TIME_INTERVAL = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR__ORBIT_MODEL = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Left Swath Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR__LEFT_SWATH_ANGLE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Right Swath Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR__RIGHT_SWATH_ANGLE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Corridor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR__CORRIDOR = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Spacecraft Swath Corridor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR___GET_DEFAULT_AUTO_UPDATE_ENABLED = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR___UPDATE = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Spacecraft Swath Corridor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_CORRIDOR_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getApogyCoreEnvironmentOrbitEarthFacade()
	 * @generated
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE = 28;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Mu</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_MU = 0;

	/**
	 * The operation id for the '<em>Create Absolute Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ABSOLUTE_DATE__DATE = 1;

	/**
	 * The operation id for the '<em>Create Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_DATE__ABSOLUTEDATE = 2;

	/**
	 * The operation id for the '<em>Create Earth Surface Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_EARTH_SURFACE_LOCATION__STRING_STRING_DOUBLE_DOUBLE_DOUBLE = 3;

	/**
	 * The operation id for the '<em>Create Ore Kit Backed Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ORE_KIT_BACKED_FRAME__FRAME = 4;

	/**
	 * The operation id for the '<em>Get Spacecraft Earth Sub Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_SPACECRAFT_EARTH_SUB_POINT__OREKITBACKEDSPACECRAFTSTATE = 5;

	/**
	 * The operation id for the '<em>Get Spacecraft Elevation Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_SPACECRAFT_ELEVATION_ANGLE__SPACECRAFTSTATE_EARTHSURFACELOCATION = 6;

	/**
	 * The operation id for the '<em>Get Spacecraft Azimuth Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_SPACECRAFT_AZIMUTH_ANGLE__SPACECRAFTSTATE_EARTHSURFACELOCATION = 7;

	/**
	 * The operation id for the '<em>Get Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_RANGE__SPACECRAFTSTATE_EARTHSURFACELOCATION = 8;

	/**
	 * The operation id for the '<em>Create Spacecraft State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_SPACECRAFT_STATE__ORBIT_SPACECRAFTSTATE = 9;

	/**
	 * The operation id for the '<em>Create Ore Kit Backed Spacecraft State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ORE_KIT_BACKED_SPACECRAFT_STATE__ORBIT_SPACECRAFTSTATE = 10;

	/**
	 * The operation id for the '<em>Create Timed Stamped PVA Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_TIMED_STAMPED_PVA_COORDINATES__TIMESTAMPEDPVCOORDINATES = 11;

	/**
	 * The operation id for the '<em>Create Timed Stamped Angular Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_TIMED_STAMPED_ANGULAR_COORDINATES__TIMESTAMPEDANGULARCOORDINATES = 12;

	/**
	 * The operation id for the '<em>Create Matrix3x3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_MATRIX3X3__ROTATION = 13;

	/**
	 * The operation id for the '<em>Create Rotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ROTATION__MATRIX3X3 = 14;

	/**
	 * The operation id for the '<em>Create Keplerian Orbit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_KEPLERIAN_ORBIT__EARTHORBITPROPAGATOR = 15;

	/**
	 * The operation id for the '<em>Create Cartesian Earth Orbit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_CARTESIAN_EARTH_ORBIT__EARTHORBITPROPAGATOR = 16;

	/**
	 * The operation id for the '<em>Create Keplerian Orbit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_KEPLERIAN_ORBIT__KEPLERIANORBIT = 17;

	/**
	 * The operation id for the '<em>Create Cartesian Earth Orbit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_CARTESIAN_EARTH_ORBIT__CARTESIANORBIT = 18;

	/**
	 * The operation id for the '<em>Convert To Geographic Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CONVERT_TO_GEOGRAPHIC_COORDINATES__OREKITBACKEDSPACECRAFTSTATE = 19;

	/**
	 * The operation id for the '<em>Get Visibility Pass Sorted By Start Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SORTED_BY_START_DATE__LIST = 20;

	/**
	 * The operation id for the '<em>Get Visibility Pass Sorted By Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SORTED_BY_DURATION__LIST = 21;

	/**
	 * The operation id for the '<em>Get Visibility Pass Spacecraft Position Sorted By Elevation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SPACECRAFT_POSITION_SORTED_BY_ELEVATION__LIST = 22;

	/**
	 * The operation id for the '<em>Get Visibility Pass Spacecraft Position Sorted By Spacecraft Cross Track Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SPACECRAFT_POSITION_SORTED_BY_SPACECRAFT_CROSS_TRACK_ANGLE__LIST = 23;

	/**
	 * The operation id for the '<em>Load TLE</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___LOAD_TLE__STRING = 24;

	/**
	 * The operation id for the '<em>Create TLE Earth Orbit Propagator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_TLE_EARTH_ORBIT_PROPAGATOR__TLE = 25;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE_OPERATION_COUNT = 26;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType <em>Ephemeris Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEphemerisType()
	 * @generated
	 */
	int EPHEMERIS_TYPE = 29;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getList()
	 * @generated
	 */
	int LIST = 30;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 31;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 32;

	/**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getSortedSet()
	 * @generated
	 */
	int SORTED_SET = 33;

	/**
	 * The meta object id for the '<em>Rotation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.commons.math3.geometry.euclidean.threed.Rotation
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getRotation()
	 * @generated
	 */
	int ROTATION = 34;

	/**
	 * The meta object id for the '<em>Ore Kit Frame</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.frames.Frame
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitFrame()
	 * @generated
	 */
	int ORE_KIT_FRAME = 35;

	/**
	 * The meta object id for the '<em>Ore Kit Time Stamped Angular Coordinates</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.utils.TimeStampedAngularCoordinates
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitTimeStampedAngularCoordinates()
	 * @generated
	 */
	int ORE_KIT_TIME_STAMPED_ANGULAR_COORDINATES = 36;

	/**
	 * The meta object id for the '<em>Ore Kit Time Stamped PV Coordinates</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.utils.TimeStampedPVCoordinates
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitTimeStampedPVCoordinates()
	 * @generated
	 */
	int ORE_KIT_TIME_STAMPED_PV_COORDINATES = 37;

	/**
	 * The meta object id for the '<em>Ore Kit Spacecraft State</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.propagation.SpacecraftState
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitSpacecraftState()
	 * @generated
	 */
	int ORE_KIT_SPACECRAFT_STATE = 38;

	/**
	 * The meta object id for the '<em>Absolute Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.time.AbsoluteDate
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getAbsoluteDate()
	 * @generated
	 */
	int ABSOLUTE_DATE = 39;

	/**
	 * The meta object id for the '<em>Ore Kit Orbit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.orbits.Orbit
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitOrbit()
	 * @generated
	 */
	int ORE_KIT_ORBIT = 40;

	/**
	 * The meta object id for the '<em>Ore Kit Keplerian Orbit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.orbits.KeplerianOrbit
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitKeplerianOrbit()
	 * @generated
	 */
	int ORE_KIT_KEPLERIAN_ORBIT = 41;

	/**
	 * The meta object id for the '<em>Ore Kit Cartesian Orbit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.orbits.CartesianOrbit
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitCartesianOrbit()
	 * @generated
	 */
	int ORE_KIT_CARTESIAN_ORBIT = 42;

	/**
	 * The meta object id for the '<em>Ore Kit Elevation Mask</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.utils.ElevationMask
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitElevationMask()
	 * @generated
	 */
	int ORE_KIT_ELEVATION_MASK = 43;

	/**
	 * The meta object id for the '<em>Ore Kit Attitude Provider</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.attitudes.AttitudeProvider
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitAttitudeProvider()
	 * @generated
	 */
	int ORE_KIT_ATTITUDE_PROVIDER = 44;

	/**
	 * The meta object id for the '<em>Ore Kit Propagator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.propagation.Propagator
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitPropagator()
	 * @generated
	 */
	int ORE_KIT_PROPAGATOR = 45;

	/**
	 * The meta object id for the '<em>Ore Kit DSST Propagator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.propagation.semianalytical.dsst.DSSTPropagator
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitDSSTPropagator()
	 * @generated
	 */
	int ORE_KIT_DSST_PROPAGATOR = 46;

	/**
	 * The meta object id for the '<em>Ore Kit Eckstein Hechler Propagator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.propagation.analytical.EcksteinHechlerPropagator
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitEcksteinHechlerPropagator()
	 * @generated
	 */
	int ORE_KIT_ECKSTEIN_HECHLER_PROPAGATOR = 47;

	/**
	 * The meta object id for the '<em>Ore Kit Ephemeris Progator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.propagation.analytical.Ephemeris
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitEphemerisProgator()
	 * @generated
	 */
	int ORE_KIT_EPHEMERIS_PROGATOR = 48;

	/**
	 * The meta object id for the '<em>Ore Kit Keplerian Propagator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.propagation.analytical.KeplerianPropagator
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitKeplerianPropagator()
	 * @generated
	 */
	int ORE_KIT_KEPLERIAN_PROPAGATOR = 49;

	/**
	 * The meta object id for the '<em>Ore Kit Numerical Propagator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.propagation.numerical.NumericalPropagator
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitNumericalPropagator()
	 * @generated
	 */
	int ORE_KIT_NUMERICAL_PROPAGATOR = 50;

	/**
	 * The meta object id for the '<em>Ore Kit TLE Propagator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.propagation.analytical.tle.TLEPropagator
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitTLEPropagator()
	 * @generated
	 */
	int ORE_KIT_TLE_PROPAGATOR = 51;


	/**
	 * The meta object id for the '<em>Ore Kit TLE</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.orekit.propagation.analytical.tle.TLE
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitTLE()
	 * @generated
	 */
	int ORE_KIT_TLE = 52;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState <em>Ore Kit Backed Spacecraft State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ore Kit Backed Spacecraft State</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState
	 * @generated
	 */
	EClass getOreKitBackedSpacecraftState();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState#getOreKitSpacecraftState <em>Ore Kit Spacecraft State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ore Kit Spacecraft State</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState#getOreKitSpacecraftState()
	 * @see #getOreKitBackedSpacecraftState()
	 * @generated
	 */
	EAttribute getOreKitBackedSpacecraftState_OreKitSpacecraftState();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedFrame <em>Ore Kit Backed Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ore Kit Backed Frame</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedFrame
	 * @generated
	 */
	EClass getOreKitBackedFrame();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedFrame#getOreKitFrame() <em>Get Ore Kit Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ore Kit Frame</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedFrame#getOreKitFrame()
	 * @generated
	 */
	EOperation getOreKitBackedFrame__GetOreKitFrame();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedAttitudeProvider <em>Ore Kit Backed Attitude Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ore Kit Backed Attitude Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedAttitudeProvider
	 * @generated
	 */
	EClass getOreKitBackedAttitudeProvider();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedAttitudeProvider#getOreKitAttitudeProvider() <em>Get Ore Kit Attitude Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ore Kit Attitude Provider</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedAttitudeProvider#getOreKitAttitudeProvider()
	 * @generated
	 */
	EOperation getOreKitBackedAttitudeProvider__GetOreKitAttitudeProvider();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.NadirPointingAttitudeProvider <em>Nadir Pointing Attitude Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nadir Pointing Attitude Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.NadirPointingAttitudeProvider
	 * @generated
	 */
	EClass getNadirPointingAttitudeProvider();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite <em>Earth Orbit Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Orbit Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite
	 * @generated
	 */
	EClass getEarthOrbitWorksite();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getSky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sky</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getSky()
	 * @see #getEarthOrbitWorksite()
	 * @generated
	 */
	EReference getEarthOrbitWorksite_Sky();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getEarthLocations <em>Earth Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Earth Locations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getEarthLocations()
	 * @see #getEarthOrbitWorksite()
	 * @generated
	 */
	EReference getEarthOrbitWorksite_EarthLocations();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky <em>Earth Orbit Sky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Orbit Sky</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky
	 * @generated
	 */
	EClass getEarthOrbitSky();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getEarthOrbitWorksite <em>Earth Orbit Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Earth Orbit Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getEarthOrbitWorksite()
	 * @see #getEarthOrbitSky()
	 * @generated
	 */
	EReference getEarthOrbitSky_EarthOrbitWorksite();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getMoon <em>Moon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moon</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getMoon()
	 * @see #getEarthOrbitSky()
	 * @generated
	 */
	EReference getEarthOrbitSky_Moon();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getEarth <em>Earth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Earth</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getEarth()
	 * @see #getEarthOrbitSky()
	 * @generated
	 */
	EReference getEarthOrbitSky_Earth();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getMoonAngularDiameter() <em>Get Moon Angular Diameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moon Angular Diameter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getMoonAngularDiameter()
	 * @generated
	 */
	EOperation getEarthOrbitSky__GetMoonAngularDiameter();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getEarthAngularDiameter() <em>Get Earth Angular Diameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Earth Angular Diameter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getEarthAngularDiameter()
	 * @generated
	 */
	EOperation getEarthOrbitSky__GetEarthAngularDiameter();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit <em>Earth Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Orbit</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit
	 * @generated
	 */
	EClass getEarthOrbit();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit#getOreKitOrbit() <em>Get Ore Kit Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ore Kit Orbit</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit#getOreKitOrbit()
	 * @generated
	 */
	EOperation getEarthOrbit__GetOreKitOrbit();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit <em>Keplerian Earth Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keplerian Earth Orbit</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit
	 * @generated
	 */
	EClass getKeplerianEarthOrbit();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getSemiMajorAxis <em>Semi Major Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semi Major Axis</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getSemiMajorAxis()
	 * @see #getKeplerianEarthOrbit()
	 * @generated
	 */
	EAttribute getKeplerianEarthOrbit_SemiMajorAxis();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getEccentricity <em>Eccentricity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eccentricity</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getEccentricity()
	 * @see #getKeplerianEarthOrbit()
	 * @generated
	 */
	EAttribute getKeplerianEarthOrbit_Eccentricity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getInclination <em>Inclination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclination</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getInclination()
	 * @see #getKeplerianEarthOrbit()
	 * @generated
	 */
	EAttribute getKeplerianEarthOrbit_Inclination();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getPerigeeArgument <em>Perigee Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perigee Argument</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getPerigeeArgument()
	 * @see #getKeplerianEarthOrbit()
	 * @generated
	 */
	EAttribute getKeplerianEarthOrbit_PerigeeArgument();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getRightAscentionOfAscendingNode <em>Right Ascention Of Ascending Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Ascention Of Ascending Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getRightAscentionOfAscendingNode()
	 * @see #getKeplerianEarthOrbit()
	 * @generated
	 */
	EAttribute getKeplerianEarthOrbit_RightAscentionOfAscendingNode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getMeanAnomaly <em>Mean Anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Anomaly</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getMeanAnomaly()
	 * @see #getKeplerianEarthOrbit()
	 * @generated
	 */
	EAttribute getKeplerianEarthOrbit_MeanAnomaly();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getTrueAnomaly <em>True Anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>True Anomaly</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getTrueAnomaly()
	 * @see #getKeplerianEarthOrbit()
	 * @generated
	 */
	EAttribute getKeplerianEarthOrbit_TrueAnomaly();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getOreKitKeplerianOrbit() <em>Get Ore Kit Keplerian Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ore Kit Keplerian Orbit</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getOreKitKeplerianOrbit()
	 * @generated
	 */
	EOperation getKeplerianEarthOrbit__GetOreKitKeplerianOrbit();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit <em>Cartesian Earth Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Earth Orbit</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit
	 * @generated
	 */
	EClass getCartesianEarthOrbit();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit#getPvaCoordinates <em>Pva Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pva Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit#getPvaCoordinates()
	 * @see #getCartesianEarthOrbit()
	 * @generated
	 */
	EReference getCartesianEarthOrbit_PvaCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit#getOreKitCartesianOrbit() <em>Get Ore Kit Cartesian Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ore Kit Cartesian Orbit</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit#getOreKitCartesianOrbit()
	 * @generated
	 */
	EOperation getCartesianEarthOrbit__GetOreKitCartesianOrbit();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask <em>Elevation Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevation Mask</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask
	 * @generated
	 */
	EClass getElevationMask();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask#getElevation(double) <em>Get Elevation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Elevation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask#getElevation(double)
	 * @generated
	 */
	EOperation getElevationMask__GetElevation__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask#getOreKitElevationMask() <em>Get Ore Kit Elevation Mask</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ore Kit Elevation Mask</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask#getOreKitElevationMask()
	 * @generated
	 */
	EOperation getElevationMask__GetOreKitElevationMask();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask <em>Constant Elevation Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Elevation Mask</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask
	 * @generated
	 */
	EClass getConstantElevationMask();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask#getConstantElevation <em>Constant Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant Elevation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask#getConstantElevation()
	 * @see #getConstantElevationMask()
	 * @generated
	 */
	EAttribute getConstantElevationMask_ConstantElevation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator <em>Earth Orbit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Orbit Propagator</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator
	 * @generated
	 */
	EClass getEarthOrbitPropagator();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getOreKitPropagator() <em>Get Ore Kit Propagator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ore Kit Propagator</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getOreKitPropagator()
	 * @generated
	 */
	EOperation getEarthOrbitPropagator__GetOreKitPropagator();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getTargetPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation, java.util.Date, java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask) <em>Get Target Passes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Target Passes</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getTargetPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation, java.util.Date, java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask)
	 * @generated
	 */
	EOperation getEarthOrbitPropagator__GetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getGroundStationPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation, java.util.Date, java.util.Date) <em>Get Ground Station Passes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ground Station Passes</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getGroundStationPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getEarthOrbitPropagator__GetGroundStationPasses__GroundStation_Date_Date();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbitPropagator <em>Keplerian Earth Orbit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keplerian Earth Orbit Propagator</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbitPropagator
	 * @generated
	 */
	EClass getKeplerianEarthOrbitPropagator();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbitPropagator#getOreKitKeplerianPropagator() <em>Get Ore Kit Keplerian Propagator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ore Kit Keplerian Propagator</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbitPropagator#getOreKitKeplerianPropagator()
	 * @generated
	 */
	EOperation getKeplerianEarthOrbitPropagator__GetOreKitKeplerianPropagator();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator <em>TLE Earth Orbit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLE Earth Orbit Propagator</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator
	 * @generated
	 */
	EClass getTLEEarthOrbitPropagator();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getTle <em>Tle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tle</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getTle()
	 * @see #getTLEEarthOrbitPropagator()
	 * @generated
	 */
	EReference getTLEEarthOrbitPropagator_Tle();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getOreKitTLEPropagator() <em>Get Ore Kit TLE Propagator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ore Kit TLE Propagator</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator#getOreKitTLEPropagator()
	 * @generated
	 */
	EOperation getTLEEarthOrbitPropagator__GetOreKitTLEPropagator();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator <em>URL Based TLE Earth Orbit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Based TLE Earth Orbit Propagator</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator
	 * @generated
	 */
	EClass getURLBasedTLEEarthOrbitPropagator();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator#getTleURL <em>Tle URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tle URL</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator#getTleURL()
	 * @see #getURLBasedTLEEarthOrbitPropagator()
	 * @generated
	 */
	EAttribute getURLBasedTLEEarthOrbitPropagator_TleURL();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE <em>TLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLE</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE
	 * @generated
	 */
	EClass getTLE();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getLine1 <em>Line1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line1</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getLine1()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_Line1();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getLine2 <em>Line2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line2</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getLine2()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_Line2();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEphemerisType <em>Ephemeris Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ephemeris Type</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEphemerisType()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_EphemerisType();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getInclination <em>Inclination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclination</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getInclination()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_Inclination();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanAnomaly <em>Mean Anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Anomaly</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanAnomaly()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_MeanAnomaly();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotion <em>Mean Motion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Motion</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotion()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_MeanMotion();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRevolutionPerDay <em>Revolution Per Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revolution Per Day</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRevolutionPerDay()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_RevolutionPerDay();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotionFirstDerivative <em>Mean Motion First Derivative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Motion First Derivative</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotionFirstDerivative()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_MeanMotionFirstDerivative();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotionSecondDerivative <em>Mean Motion Second Derivative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Motion Second Derivative</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotionSecondDerivative()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_MeanMotionSecondDerivative();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getArgumentOfPerigee <em>Argument Of Perigee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Of Perigee</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getArgumentOfPerigee()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_ArgumentOfPerigee();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRightAscentionOfAscendingNode <em>Right Ascention Of Ascending Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Ascention Of Ascending Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRightAscentionOfAscendingNode()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_RightAscentionOfAscendingNode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRevolutionNumberAtEpoch <em>Revolution Number At Epoch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revolution Number At Epoch</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRevolutionNumberAtEpoch()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_RevolutionNumberAtEpoch();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getSatelliteNumber <em>Satellite Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satellite Number</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getSatelliteNumber()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_SatelliteNumber();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getBStar <em>BStar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BStar</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getBStar()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_BStar();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEpoch <em>Epoch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epoch</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEpoch()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_Epoch();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEccentricity <em>Eccentricity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eccentricity</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEccentricity()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_Eccentricity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getElementNumber <em>Element Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Number</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getElementNumber()
	 * @see #getTLE()
	 * @generated
	 */
	EAttribute getTLE_ElementNumber();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getOreKitTLE() <em>Get Ore Kit TLE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ore Kit TLE</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getOreKitTLE()
	 * @generated
	 */
	EOperation getTLE__GetOreKitTLE();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation <em>Earth Surface Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Surface Location</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation
	 * @generated
	 */
	EClass getEarthSurfaceLocation();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation#getGeographicalCoordinates <em>Geographical Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geographical Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation#getGeographicalCoordinates()
	 * @see #getEarthSurfaceLocation()
	 * @generated
	 */
	EReference getEarthSurfaceLocation_GeographicalCoordinates();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocationList <em>Earth Surface Location List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Surface Location List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocationList
	 * @generated
	 */
	EClass getEarthSurfaceLocationList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocationList#getEarthSurfaceLocations <em>Earth Surface Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Earth Surface Locations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocationList#getEarthSurfaceLocations()
	 * @see #getEarthSurfaceLocationList()
	 * @generated
	 */
	EReference getEarthSurfaceLocationList_EarthSurfaceLocations();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationReferencesList <em>Ground Station References List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Station References List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationReferencesList
	 * @generated
	 */
	EClass getGroundStationReferencesList();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationReferencesList#getGroundStations <em>Ground Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ground Stations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationReferencesList#getGroundStations()
	 * @see #getGroundStationReferencesList()
	 * @generated
	 */
	EReference getGroundStationReferencesList_GroundStations();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation <em>Ground Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Station</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation
	 * @generated
	 */
	EClass getGroundStation();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation#getFieldOfViewOrientation <em>Field Of View Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field Of View Orientation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation#getFieldOfViewOrientation()
	 * @see #getGroundStation()
	 * @generated
	 */
	EReference getGroundStation_FieldOfViewOrientation();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation#getElevationMask <em>Elevation Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elevation Mask</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation#getElevationMask()
	 * @see #getGroundStation()
	 * @generated
	 */
	EReference getGroundStation_ElevationMask();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationList <em>Ground Station List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Station List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationList
	 * @generated
	 */
	EClass getGroundStationList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationList#getGroundStations <em>Ground Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ground Stations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationList#getGroundStations()
	 * @see #getGroundStationList()
	 * @generated
	 */
	EReference getGroundStationList_GroundStations();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass <em>Visibility Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Pass</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass
	 * @generated
	 */
	EClass getVisibilityPass();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getOrbitModel <em>Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orbit Model</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getOrbitModel()
	 * @see #getVisibilityPass()
	 * @generated
	 */
	EReference getVisibilityPass_OrbitModel();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getSurfaceLocation <em>Surface Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Surface Location</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getSurfaceLocation()
	 * @see #getVisibilityPass()
	 * @generated
	 */
	EReference getVisibilityPass_SurfaceLocation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getStartTime()
	 * @see #getVisibilityPass()
	 * @generated
	 */
	EAttribute getVisibilityPass_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getEndTime()
	 * @see #getVisibilityPass()
	 * @generated
	 */
	EAttribute getVisibilityPass_EndTime();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getPositionHistory <em>Position History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position History</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getPositionHistory()
	 * @see #getVisibilityPass()
	 * @generated
	 */
	EReference getVisibilityPass_PositionHistory();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass#getDuration()
	 * @see #getVisibilityPass()
	 * @generated
	 */
	EAttribute getVisibilityPass_Duration();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory <em>Visibility Pass Spacecraft Position History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Pass Spacecraft Position History</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory
	 * @generated
	 */
	EClass getVisibilityPassSpacecraftPositionHistory();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getTimeInterval()
	 * @see #getVisibilityPassSpacecraftPositionHistory()
	 * @generated
	 */
	EAttribute getVisibilityPassSpacecraftPositionHistory_TimeInterval();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getVisibilityPass <em>Visibility Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Visibility Pass</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getVisibilityPass()
	 * @see #getVisibilityPassSpacecraftPositionHistory()
	 * @generated
	 */
	EReference getVisibilityPassSpacecraftPositionHistory_VisibilityPass();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getPositions()
	 * @see #getVisibilityPassSpacecraftPositionHistory()
	 * @generated
	 */
	EReference getVisibilityPassSpacecraftPositionHistory_Positions();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getHighestElevationPosition() <em>Get Highest Elevation Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Highest Elevation Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getHighestElevationPosition()
	 * @generated
	 */
	EOperation getVisibilityPassSpacecraftPositionHistory__GetHighestElevationPosition();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getSmallestSpacecraftCrossTrackAnglePosition() <em>Get Smallest Spacecraft Cross Track Angle Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Smallest Spacecraft Cross Track Angle Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#getSmallestSpacecraftCrossTrackAnglePosition()
	 * @generated
	 */
	EOperation getVisibilityPassSpacecraftPositionHistory__GetSmallestSpacecraftCrossTrackAnglePosition();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#updateHistory() <em>Update History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update History</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory#updateHistory()
	 * @generated
	 */
	EOperation getVisibilityPassSpacecraftPositionHistory__UpdateHistory();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition <em>Visibility Pass Spacecraft Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Pass Spacecraft Position</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition
	 * @generated
	 */
	EClass getVisibilityPassSpacecraftPosition();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getAzimuth <em>Azimuth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getAzimuth()
	 * @see #getVisibilityPassSpacecraftPosition()
	 * @generated
	 */
	EAttribute getVisibilityPassSpacecraftPosition_Azimuth();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getElevation()
	 * @see #getVisibilityPassSpacecraftPosition()
	 * @generated
	 */
	EAttribute getVisibilityPassSpacecraftPosition_Elevation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getRange()
	 * @see #getVisibilityPassSpacecraftPosition()
	 * @generated
	 */
	EAttribute getVisibilityPassSpacecraftPosition_Range();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getRangeRate <em>Range Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Rate</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getRangeRate()
	 * @see #getVisibilityPassSpacecraftPosition()
	 * @generated
	 */
	EAttribute getVisibilityPassSpacecraftPosition_RangeRate();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getSpacecraftCrossTrackAngle <em>Spacecraft Cross Track Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacecraft Cross Track Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getSpacecraftCrossTrackAngle()
	 * @see #getVisibilityPassSpacecraftPosition()
	 * @generated
	 */
	EAttribute getVisibilityPassSpacecraftPosition_SpacecraftCrossTrackAngle();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet <em>Spacecrafts Visibility Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecrafts Visibility Set</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet
	 * @generated
	 */
	EClass getSpacecraftsVisibilitySet();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getStartTime()
	 * @see #getSpacecraftsVisibilitySet()
	 * @generated
	 */
	EAttribute getSpacecraftsVisibilitySet_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getEndTime()
	 * @see #getSpacecraftsVisibilitySet()
	 * @generated
	 */
	EAttribute getSpacecraftsVisibilitySet_EndTime();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getOrbitModels <em>Orbit Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orbit Models</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getOrbitModels()
	 * @see #getSpacecraftsVisibilitySet()
	 * @generated
	 */
	EReference getSpacecraftsVisibilitySet_OrbitModels();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getGroundStations <em>Ground Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ground Stations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getGroundStations()
	 * @see #getSpacecraftsVisibilitySet()
	 * @generated
	 */
	EReference getSpacecraftsVisibilitySet_GroundStations();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getPasses <em>Passes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passes</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getPasses()
	 * @see #getSpacecraftsVisibilitySet()
	 * @generated
	 */
	EReference getSpacecraftsVisibilitySet_Passes();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getGroundStationToVisibilityMap <em>Ground Station To Visibility Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Station To Visibility Map</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet#getGroundStationToVisibilityMap()
	 * @see #getSpacecraftsVisibilitySet()
	 * @generated
	 */
	EAttribute getSpacecraftsVisibilitySet_GroundStationToVisibilityMap();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint <em>Corridor Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corridor Point</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint
	 * @generated
	 */
	EClass getCorridorPoint();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint#getLeft()
	 * @see #getCorridorPoint()
	 * @generated
	 */
	EReference getCorridorPoint_Left();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint#getCenter()
	 * @see #getCorridorPoint()
	 * @generated
	 */
	EReference getCorridorPoint_Center();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint#getRight()
	 * @see #getCorridorPoint()
	 * @generated
	 */
	EReference getCorridorPoint_Right();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.Corridor <em>Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corridor</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.Corridor
	 * @generated
	 */
	EClass getCorridor();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.Corridor#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.Corridor#getPoints()
	 * @see #getCorridor()
	 * @generated
	 */
	EReference getCorridor_Points();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor <em>Spacecraft Swath Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecraft Swath Corridor</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor
	 * @generated
	 */
	EClass getSpacecraftSwathCorridor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getStartTime()
	 * @see #getSpacecraftSwathCorridor()
	 * @generated
	 */
	EAttribute getSpacecraftSwathCorridor_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getEndTime()
	 * @see #getSpacecraftSwathCorridor()
	 * @generated
	 */
	EAttribute getSpacecraftSwathCorridor_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getTimeInterval()
	 * @see #getSpacecraftSwathCorridor()
	 * @generated
	 */
	EAttribute getSpacecraftSwathCorridor_TimeInterval();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getOrbitModel <em>Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orbit Model</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getOrbitModel()
	 * @see #getSpacecraftSwathCorridor()
	 * @generated
	 */
	EReference getSpacecraftSwathCorridor_OrbitModel();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getLeftSwathAngle <em>Left Swath Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Swath Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getLeftSwathAngle()
	 * @see #getSpacecraftSwathCorridor()
	 * @generated
	 */
	EAttribute getSpacecraftSwathCorridor_LeftSwathAngle();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getRightSwathAngle <em>Right Swath Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Swath Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getRightSwathAngle()
	 * @see #getSpacecraftSwathCorridor()
	 * @generated
	 */
	EAttribute getSpacecraftSwathCorridor_RightSwathAngle();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getCorridor <em>Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Corridor</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getCorridor()
	 * @see #getSpacecraftSwathCorridor()
	 * @generated
	 */
	EReference getSpacecraftSwathCorridor_Corridor();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade
	 * @generated
	 */
	EClass getApogyCoreEnvironmentOrbitEarthFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getMu() <em>Get Mu</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mu</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getMu()
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetMu();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createAbsoluteDate(java.util.Date) <em>Create Absolute Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Absolute Date</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createAbsoluteDate(java.util.Date)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateAbsoluteDate__Date();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createDate(org.orekit.time.AbsoluteDate) <em>Create Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Date</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createDate(org.orekit.time.AbsoluteDate)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateDate__AbsoluteDate();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createEarthSurfaceLocation(java.lang.String, java.lang.String, double, double, double) <em>Create Earth Surface Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Earth Surface Location</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createEarthSurfaceLocation(java.lang.String, java.lang.String, double, double, double)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateEarthSurfaceLocation__String_String_double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createOreKitBackedFrame(org.orekit.frames.Frame) <em>Create Ore Kit Backed Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Ore Kit Backed Frame</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createOreKitBackedFrame(org.orekit.frames.Frame)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateOreKitBackedFrame__Frame();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftEarthSubPoint(ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState) <em>Get Spacecraft Earth Sub Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Spacecraft Earth Sub Point</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftEarthSubPoint(ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftEarthSubPoint__OreKitBackedSpacecraftState();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftElevationAngle(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation) <em>Get Spacecraft Elevation Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Spacecraft Elevation Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftElevationAngle(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftElevationAngle__SpacecraftState_EarthSurfaceLocation();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftAzimuthAngle(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation) <em>Get Spacecraft Azimuth Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Spacecraft Azimuth Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftAzimuthAngle(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftAzimuthAngle__SpacecraftState_EarthSurfaceLocation();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getRange(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation) <em>Get Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Range</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getRange(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetRange__SpacecraftState_EarthSurfaceLocation();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createSpacecraftState(ca.gc.asc_csa.apogy.core.environment.orbit.Orbit, org.orekit.propagation.SpacecraftState) <em>Create Spacecraft State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Spacecraft State</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createSpacecraftState(ca.gc.asc_csa.apogy.core.environment.orbit.Orbit, org.orekit.propagation.SpacecraftState)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateSpacecraftState__Orbit_SpacecraftState();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createOreKitBackedSpacecraftState(ca.gc.asc_csa.apogy.core.environment.orbit.Orbit, org.orekit.propagation.SpacecraftState) <em>Create Ore Kit Backed Spacecraft State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Ore Kit Backed Spacecraft State</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createOreKitBackedSpacecraftState(ca.gc.asc_csa.apogy.core.environment.orbit.Orbit, org.orekit.propagation.SpacecraftState)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateOreKitBackedSpacecraftState__Orbit_SpacecraftState();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTimedStampedPVACoordinates(org.orekit.utils.TimeStampedPVCoordinates) <em>Create Timed Stamped PVA Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Timed Stamped PVA Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTimedStampedPVACoordinates(org.orekit.utils.TimeStampedPVCoordinates)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateTimedStampedPVACoordinates__TimeStampedPVCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTimedStampedAngularCoordinates(org.orekit.utils.TimeStampedAngularCoordinates) <em>Create Timed Stamped Angular Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Timed Stamped Angular Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTimedStampedAngularCoordinates(org.orekit.utils.TimeStampedAngularCoordinates)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateTimedStampedAngularCoordinates__TimeStampedAngularCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createMatrix3x3(org.apache.commons.math3.geometry.euclidean.threed.Rotation) <em>Create Matrix3x3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Matrix3x3</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createMatrix3x3(org.apache.commons.math3.geometry.euclidean.threed.Rotation)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateMatrix3x3__Rotation();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createRotation(ca.gc.asc_csa.apogy.common.math.Matrix3x3) <em>Create Rotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Rotation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createRotation(ca.gc.asc_csa.apogy.common.math.Matrix3x3)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateRotation__Matrix3x3();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createKeplerianOrbit(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator) <em>Create Keplerian Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Keplerian Orbit</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createKeplerianOrbit(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateKeplerianOrbit__EarthOrbitPropagator();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createCartesianEarthOrbit(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator) <em>Create Cartesian Earth Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Earth Orbit</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createCartesianEarthOrbit(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateCartesianEarthOrbit__EarthOrbitPropagator();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createKeplerianOrbit(org.orekit.orbits.KeplerianOrbit) <em>Create Keplerian Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Keplerian Orbit</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createKeplerianOrbit(org.orekit.orbits.KeplerianOrbit)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateKeplerianOrbit__KeplerianOrbit();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createCartesianEarthOrbit(org.orekit.orbits.CartesianOrbit) <em>Create Cartesian Earth Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Cartesian Earth Orbit</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createCartesianEarthOrbit(org.orekit.orbits.CartesianOrbit)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateCartesianEarthOrbit__CartesianOrbit();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState) <em>Convert To Geographic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Geographic Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__ConvertToGeographicCoordinates__OreKitBackedSpacecraftState();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSortedByStartDate(java.util.List) <em>Get Visibility Pass Sorted By Start Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Visibility Pass Sorted By Start Date</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSortedByStartDate(java.util.List)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSortedByStartDate__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSortedByDuration(java.util.List) <em>Get Visibility Pass Sorted By Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Visibility Pass Sorted By Duration</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSortedByDuration(java.util.List)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSortedByDuration__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSpacecraftPositionSortedByElevation(java.util.List) <em>Get Visibility Pass Spacecraft Position Sorted By Elevation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Visibility Pass Spacecraft Position Sorted By Elevation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSpacecraftPositionSortedByElevation(java.util.List)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSpacecraftPositionSortedByElevation__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle(java.util.List) <em>Get Visibility Pass Spacecraft Position Sorted By Spacecraft Cross Track Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Visibility Pass Spacecraft Position Sorted By Spacecraft Cross Track Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle(java.util.List)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#loadTLE(java.lang.String) <em>Load TLE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load TLE</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#loadTLE(java.lang.String)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__LoadTLE__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTLEEarthOrbitPropagator(ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE) <em>Create TLE Earth Orbit Propagator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create TLE Earth Orbit Propagator</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTLEEarthOrbitPropagator(ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitEarthFacade__CreateTLEEarthOrbitPropagator__TLE();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType <em>Ephemeris Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ephemeris Type</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType
	 * @generated
	 */
	EEnum getEphemerisType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link java.util.SortedSet <em>Sorted Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sorted Set</em>'.
	 * @see java.util.SortedSet
	 * @model instanceClass="java.util.SortedSet" typeParameters="T"
	 * @generated
	 */
	EDataType getSortedSet();

	/**
	 * Returns the meta object for data type '{@link org.apache.commons.math3.geometry.euclidean.threed.Rotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rotation</em>'.
	 * @see org.apache.commons.math3.geometry.euclidean.threed.Rotation
	 * @model instanceClass="org.apache.commons.math3.geometry.euclidean.threed.Rotation"
	 * @generated
	 */
	EDataType getRotation();

	/**
	 * Returns the meta object for data type '{@link org.orekit.frames.Frame <em>Ore Kit Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Frame</em>'.
	 * @see org.orekit.frames.Frame
	 * @model instanceClass="org.orekit.frames.Frame"
	 * @generated
	 */
	EDataType getOreKitFrame();

	/**
	 * Returns the meta object for data type '{@link org.orekit.utils.TimeStampedAngularCoordinates <em>Ore Kit Time Stamped Angular Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Time Stamped Angular Coordinates</em>'.
	 * @see org.orekit.utils.TimeStampedAngularCoordinates
	 * @model instanceClass="org.orekit.utils.TimeStampedAngularCoordinates"
	 * @generated
	 */
	EDataType getOreKitTimeStampedAngularCoordinates();

	/**
	 * Returns the meta object for data type '{@link org.orekit.utils.TimeStampedPVCoordinates <em>Ore Kit Time Stamped PV Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Time Stamped PV Coordinates</em>'.
	 * @see org.orekit.utils.TimeStampedPVCoordinates
	 * @model instanceClass="org.orekit.utils.TimeStampedPVCoordinates"
	 * @generated
	 */
	EDataType getOreKitTimeStampedPVCoordinates();

	/**
	 * Returns the meta object for data type '{@link org.orekit.propagation.SpacecraftState <em>Ore Kit Spacecraft State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Spacecraft State</em>'.
	 * @see org.orekit.propagation.SpacecraftState
	 * @model instanceClass="org.orekit.propagation.SpacecraftState"
	 * @generated
	 */
	EDataType getOreKitSpacecraftState();

	/**
	 * Returns the meta object for data type '{@link org.orekit.time.AbsoluteDate <em>Absolute Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Absolute Date</em>'.
	 * @see org.orekit.time.AbsoluteDate
	 * @model instanceClass="org.orekit.time.AbsoluteDate"
	 * @generated
	 */
	EDataType getAbsoluteDate();

	/**
	 * Returns the meta object for data type '{@link org.orekit.orbits.Orbit <em>Ore Kit Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Orbit</em>'.
	 * @see org.orekit.orbits.Orbit
	 * @model instanceClass="org.orekit.orbits.Orbit"
	 * @generated
	 */
	EDataType getOreKitOrbit();

	/**
	 * Returns the meta object for data type '{@link org.orekit.orbits.KeplerianOrbit <em>Ore Kit Keplerian Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Keplerian Orbit</em>'.
	 * @see org.orekit.orbits.KeplerianOrbit
	 * @model instanceClass="org.orekit.orbits.KeplerianOrbit"
	 * @generated
	 */
	EDataType getOreKitKeplerianOrbit();

	/**
	 * Returns the meta object for data type '{@link org.orekit.orbits.CartesianOrbit <em>Ore Kit Cartesian Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Cartesian Orbit</em>'.
	 * @see org.orekit.orbits.CartesianOrbit
	 * @model instanceClass="org.orekit.orbits.CartesianOrbit"
	 * @generated
	 */
	EDataType getOreKitCartesianOrbit();

	/**
	 * Returns the meta object for data type '{@link org.orekit.utils.ElevationMask <em>Ore Kit Elevation Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Elevation Mask</em>'.
	 * @see org.orekit.utils.ElevationMask
	 * @model instanceClass="org.orekit.utils.ElevationMask"
	 * @generated
	 */
	EDataType getOreKitElevationMask();

	/**
	 * Returns the meta object for data type '{@link org.orekit.attitudes.AttitudeProvider <em>Ore Kit Attitude Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Attitude Provider</em>'.
	 * @see org.orekit.attitudes.AttitudeProvider
	 * @model instanceClass="org.orekit.attitudes.AttitudeProvider"
	 * @generated
	 */
	EDataType getOreKitAttitudeProvider();

	/**
	 * Returns the meta object for data type '{@link org.orekit.propagation.Propagator <em>Ore Kit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Propagator</em>'.
	 * @see org.orekit.propagation.Propagator
	 * @model instanceClass="org.orekit.propagation.Propagator"
	 * @generated
	 */
	EDataType getOreKitPropagator();

	/**
	 * Returns the meta object for data type '{@link org.orekit.propagation.semianalytical.dsst.DSSTPropagator <em>Ore Kit DSST Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit DSST Propagator</em>'.
	 * @see org.orekit.propagation.semianalytical.dsst.DSSTPropagator
	 * @model instanceClass="org.orekit.propagation.semianalytical.dsst.DSSTPropagator"
	 * @generated
	 */
	EDataType getOreKitDSSTPropagator();

	/**
	 * Returns the meta object for data type '{@link org.orekit.propagation.analytical.EcksteinHechlerPropagator <em>Ore Kit Eckstein Hechler Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Eckstein Hechler Propagator</em>'.
	 * @see org.orekit.propagation.analytical.EcksteinHechlerPropagator
	 * @model instanceClass="org.orekit.propagation.analytical.EcksteinHechlerPropagator"
	 * @generated
	 */
	EDataType getOreKitEcksteinHechlerPropagator();

	/**
	 * Returns the meta object for data type '{@link org.orekit.propagation.analytical.Ephemeris <em>Ore Kit Ephemeris Progator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Ephemeris Progator</em>'.
	 * @see org.orekit.propagation.analytical.Ephemeris
	 * @model instanceClass="org.orekit.propagation.analytical.Ephemeris"
	 * @generated
	 */
	EDataType getOreKitEphemerisProgator();

	/**
	 * Returns the meta object for data type '{@link org.orekit.propagation.analytical.KeplerianPropagator <em>Ore Kit Keplerian Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Keplerian Propagator</em>'.
	 * @see org.orekit.propagation.analytical.KeplerianPropagator
	 * @model instanceClass="org.orekit.propagation.analytical.KeplerianPropagator"
	 * @generated
	 */
	EDataType getOreKitKeplerianPropagator();

	/**
	 * Returns the meta object for data type '{@link org.orekit.propagation.numerical.NumericalPropagator <em>Ore Kit Numerical Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit Numerical Propagator</em>'.
	 * @see org.orekit.propagation.numerical.NumericalPropagator
	 * @model instanceClass="org.orekit.propagation.numerical.NumericalPropagator"
	 * @generated
	 */
	EDataType getOreKitNumericalPropagator();

	/**
	 * Returns the meta object for data type '{@link org.orekit.propagation.analytical.tle.TLEPropagator <em>Ore Kit TLE Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit TLE Propagator</em>'.
	 * @see org.orekit.propagation.analytical.tle.TLEPropagator
	 * @model instanceClass="org.orekit.propagation.analytical.tle.TLEPropagator"
	 * @generated
	 */
	EDataType getOreKitTLEPropagator();

	/**
	 * Returns the meta object for data type '{@link org.orekit.propagation.analytical.tle.TLE <em>Ore Kit TLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ore Kit TLE</em>'.
	 * @see org.orekit.propagation.analytical.tle.TLE
	 * @model instanceClass="org.orekit.propagation.analytical.tle.TLE"
	 * @generated
	 */
	EDataType getOreKitTLE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreEnvironmentOrbitEarthFactory getApogyCoreEnvironmentOrbitEarthFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedSpacecraftStateImpl <em>Ore Kit Backed Spacecraft State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedSpacecraftStateImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitBackedSpacecraftState()
		 * @generated
		 */
		EClass ORE_KIT_BACKED_SPACECRAFT_STATE = eINSTANCE.getOreKitBackedSpacecraftState();

		/**
		 * The meta object literal for the '<em><b>Ore Kit Spacecraft State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORE_KIT_BACKED_SPACECRAFT_STATE__ORE_KIT_SPACECRAFT_STATE = eINSTANCE.getOreKitBackedSpacecraftState_OreKitSpacecraftState();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedFrameImpl <em>Ore Kit Backed Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedFrameImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitBackedFrame()
		 * @generated
		 */
		EClass ORE_KIT_BACKED_FRAME = eINSTANCE.getOreKitBackedFrame();

		/**
		 * The meta object literal for the '<em><b>Get Ore Kit Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORE_KIT_BACKED_FRAME___GET_ORE_KIT_FRAME = eINSTANCE.getOreKitBackedFrame__GetOreKitFrame();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedAttitudeProviderImpl <em>Ore Kit Backed Attitude Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.OreKitBackedAttitudeProviderImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitBackedAttitudeProvider()
		 * @generated
		 */
		EClass ORE_KIT_BACKED_ATTITUDE_PROVIDER = eINSTANCE.getOreKitBackedAttitudeProvider();

		/**
		 * The meta object literal for the '<em><b>Get Ore Kit Attitude Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORE_KIT_BACKED_ATTITUDE_PROVIDER___GET_ORE_KIT_ATTITUDE_PROVIDER = eINSTANCE.getOreKitBackedAttitudeProvider__GetOreKitAttitudeProvider();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.NadirPointingAttitudeProviderImpl <em>Nadir Pointing Attitude Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.NadirPointingAttitudeProviderImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getNadirPointingAttitudeProvider()
		 * @generated
		 */
		EClass NADIR_POINTING_ATTITUDE_PROVIDER = eINSTANCE.getNadirPointingAttitudeProvider();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitWorksiteImpl <em>Earth Orbit Worksite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitWorksiteImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthOrbitWorksite()
		 * @generated
		 */
		EClass EARTH_ORBIT_WORKSITE = eINSTANCE.getEarthOrbitWorksite();

		/**
		 * The meta object literal for the '<em><b>Sky</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_ORBIT_WORKSITE__SKY = eINSTANCE.getEarthOrbitWorksite_Sky();

		/**
		 * The meta object literal for the '<em><b>Earth Locations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS = eINSTANCE.getEarthOrbitWorksite_EarthLocations();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitSkyImpl <em>Earth Orbit Sky</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitSkyImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthOrbitSky()
		 * @generated
		 */
		EClass EARTH_ORBIT_SKY = eINSTANCE.getEarthOrbitSky();

		/**
		 * The meta object literal for the '<em><b>Earth Orbit Worksite</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE = eINSTANCE.getEarthOrbitSky_EarthOrbitWorksite();

		/**
		 * The meta object literal for the '<em><b>Moon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_ORBIT_SKY__MOON = eINSTANCE.getEarthOrbitSky_Moon();

		/**
		 * The meta object literal for the '<em><b>Earth</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_ORBIT_SKY__EARTH = eINSTANCE.getEarthOrbitSky_Earth();

		/**
		 * The meta object literal for the '<em><b>Get Moon Angular Diameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EARTH_ORBIT_SKY___GET_MOON_ANGULAR_DIAMETER = eINSTANCE.getEarthOrbitSky__GetMoonAngularDiameter();

		/**
		 * The meta object literal for the '<em><b>Get Earth Angular Diameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EARTH_ORBIT_SKY___GET_EARTH_ANGULAR_DIAMETER = eINSTANCE.getEarthOrbitSky__GetEarthAngularDiameter();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitImpl <em>Earth Orbit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthOrbit()
		 * @generated
		 */
		EClass EARTH_ORBIT = eINSTANCE.getEarthOrbit();

		/**
		 * The meta object literal for the '<em><b>Get Ore Kit Orbit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EARTH_ORBIT___GET_ORE_KIT_ORBIT = eINSTANCE.getEarthOrbit__GetOreKitOrbit();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.KeplerianEarthOrbitImpl <em>Keplerian Earth Orbit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.KeplerianEarthOrbitImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getKeplerianEarthOrbit()
		 * @generated
		 */
		EClass KEPLERIAN_EARTH_ORBIT = eINSTANCE.getKeplerianEarthOrbit();

		/**
		 * The meta object literal for the '<em><b>Semi Major Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEPLERIAN_EARTH_ORBIT__SEMI_MAJOR_AXIS = eINSTANCE.getKeplerianEarthOrbit_SemiMajorAxis();

		/**
		 * The meta object literal for the '<em><b>Eccentricity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEPLERIAN_EARTH_ORBIT__ECCENTRICITY = eINSTANCE.getKeplerianEarthOrbit_Eccentricity();

		/**
		 * The meta object literal for the '<em><b>Inclination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEPLERIAN_EARTH_ORBIT__INCLINATION = eINSTANCE.getKeplerianEarthOrbit_Inclination();

		/**
		 * The meta object literal for the '<em><b>Perigee Argument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEPLERIAN_EARTH_ORBIT__PERIGEE_ARGUMENT = eINSTANCE.getKeplerianEarthOrbit_PerigeeArgument();

		/**
		 * The meta object literal for the '<em><b>Right Ascention Of Ascending Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEPLERIAN_EARTH_ORBIT__RIGHT_ASCENTION_OF_ASCENDING_NODE = eINSTANCE.getKeplerianEarthOrbit_RightAscentionOfAscendingNode();

		/**
		 * The meta object literal for the '<em><b>Mean Anomaly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEPLERIAN_EARTH_ORBIT__MEAN_ANOMALY = eINSTANCE.getKeplerianEarthOrbit_MeanAnomaly();

		/**
		 * The meta object literal for the '<em><b>True Anomaly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEPLERIAN_EARTH_ORBIT__TRUE_ANOMALY = eINSTANCE.getKeplerianEarthOrbit_TrueAnomaly();

		/**
		 * The meta object literal for the '<em><b>Get Ore Kit Keplerian Orbit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEPLERIAN_EARTH_ORBIT___GET_ORE_KIT_KEPLERIAN_ORBIT = eINSTANCE.getKeplerianEarthOrbit__GetOreKitKeplerianOrbit();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CartesianEarthOrbitImpl <em>Cartesian Earth Orbit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CartesianEarthOrbitImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getCartesianEarthOrbit()
		 * @generated
		 */
		EClass CARTESIAN_EARTH_ORBIT = eINSTANCE.getCartesianEarthOrbit();

		/**
		 * The meta object literal for the '<em><b>Pva Coordinates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_EARTH_ORBIT__PVA_COORDINATES = eINSTANCE.getCartesianEarthOrbit_PvaCoordinates();

		/**
		 * The meta object literal for the '<em><b>Get Ore Kit Cartesian Orbit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTESIAN_EARTH_ORBIT___GET_ORE_KIT_CARTESIAN_ORBIT = eINSTANCE.getCartesianEarthOrbit__GetOreKitCartesianOrbit();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ElevationMaskImpl <em>Elevation Mask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ElevationMaskImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getElevationMask()
		 * @generated
		 */
		EClass ELEVATION_MASK = eINSTANCE.getElevationMask();

		/**
		 * The meta object literal for the '<em><b>Get Elevation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEVATION_MASK___GET_ELEVATION__DOUBLE = eINSTANCE.getElevationMask__GetElevation__double();

		/**
		 * The meta object literal for the '<em><b>Get Ore Kit Elevation Mask</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEVATION_MASK___GET_ORE_KIT_ELEVATION_MASK = eINSTANCE.getElevationMask__GetOreKitElevationMask();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ConstantElevationMaskImpl <em>Constant Elevation Mask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ConstantElevationMaskImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getConstantElevationMask()
		 * @generated
		 */
		EClass CONSTANT_ELEVATION_MASK = eINSTANCE.getConstantElevationMask();

		/**
		 * The meta object literal for the '<em><b>Constant Elevation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_ELEVATION_MASK__CONSTANT_ELEVATION = eINSTANCE.getConstantElevationMask_ConstantElevation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitPropagatorImpl <em>Earth Orbit Propagator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitPropagatorImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthOrbitPropagator()
		 * @generated
		 */
		EClass EARTH_ORBIT_PROPAGATOR = eINSTANCE.getEarthOrbitPropagator();

		/**
		 * The meta object literal for the '<em><b>Get Ore Kit Propagator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR = eINSTANCE.getEarthOrbitPropagator__GetOreKitPropagator();

		/**
		 * The meta object literal for the '<em><b>Get Target Passes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK = eINSTANCE.getEarthOrbitPropagator__GetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask();

		/**
		 * The meta object literal for the '<em><b>Get Ground Station Passes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE = eINSTANCE.getEarthOrbitPropagator__GetGroundStationPasses__GroundStation_Date_Date();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.KeplerianEarthOrbitPropagatorImpl <em>Keplerian Earth Orbit Propagator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.KeplerianEarthOrbitPropagatorImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getKeplerianEarthOrbitPropagator()
		 * @generated
		 */
		EClass KEPLERIAN_EARTH_ORBIT_PROPAGATOR = eINSTANCE.getKeplerianEarthOrbitPropagator();

		/**
		 * The meta object literal for the '<em><b>Get Ore Kit Keplerian Propagator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEPLERIAN_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_KEPLERIAN_PROPAGATOR = eINSTANCE.getKeplerianEarthOrbitPropagator__GetOreKitKeplerianPropagator();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEEarthOrbitPropagatorImpl <em>TLE Earth Orbit Propagator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEEarthOrbitPropagatorImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getTLEEarthOrbitPropagator()
		 * @generated
		 */
		EClass TLE_EARTH_ORBIT_PROPAGATOR = eINSTANCE.getTLEEarthOrbitPropagator();

		/**
		 * The meta object literal for the '<em><b>Tle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TLE_EARTH_ORBIT_PROPAGATOR__TLE = eINSTANCE.getTLEEarthOrbitPropagator_Tle();

		/**
		 * The meta object literal for the '<em><b>Get Ore Kit TLE Propagator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TLE_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_TLE_PROPAGATOR = eINSTANCE.getTLEEarthOrbitPropagator__GetOreKitTLEPropagator();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.URLBasedTLEEarthOrbitPropagatorImpl <em>URL Based TLE Earth Orbit Propagator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.URLBasedTLEEarthOrbitPropagatorImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getURLBasedTLEEarthOrbitPropagator()
		 * @generated
		 */
		EClass URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR = eINSTANCE.getURLBasedTLEEarthOrbitPropagator();

		/**
		 * The meta object literal for the '<em><b>Tle URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE_URL = eINSTANCE.getURLBasedTLEEarthOrbitPropagator_TleURL();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEImpl <em>TLE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getTLE()
		 * @generated
		 */
		EClass TLE = eINSTANCE.getTLE();

		/**
		 * The meta object literal for the '<em><b>Line1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__LINE1 = eINSTANCE.getTLE_Line1();

		/**
		 * The meta object literal for the '<em><b>Line2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__LINE2 = eINSTANCE.getTLE_Line2();

		/**
		 * The meta object literal for the '<em><b>Ephemeris Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__EPHEMERIS_TYPE = eINSTANCE.getTLE_EphemerisType();

		/**
		 * The meta object literal for the '<em><b>Inclination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__INCLINATION = eINSTANCE.getTLE_Inclination();

		/**
		 * The meta object literal for the '<em><b>Mean Anomaly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__MEAN_ANOMALY = eINSTANCE.getTLE_MeanAnomaly();

		/**
		 * The meta object literal for the '<em><b>Mean Motion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__MEAN_MOTION = eINSTANCE.getTLE_MeanMotion();

		/**
		 * The meta object literal for the '<em><b>Revolution Per Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__REVOLUTION_PER_DAY = eINSTANCE.getTLE_RevolutionPerDay();

		/**
		 * The meta object literal for the '<em><b>Mean Motion First Derivative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__MEAN_MOTION_FIRST_DERIVATIVE = eINSTANCE.getTLE_MeanMotionFirstDerivative();

		/**
		 * The meta object literal for the '<em><b>Mean Motion Second Derivative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__MEAN_MOTION_SECOND_DERIVATIVE = eINSTANCE.getTLE_MeanMotionSecondDerivative();

		/**
		 * The meta object literal for the '<em><b>Argument Of Perigee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__ARGUMENT_OF_PERIGEE = eINSTANCE.getTLE_ArgumentOfPerigee();

		/**
		 * The meta object literal for the '<em><b>Right Ascention Of Ascending Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__RIGHT_ASCENTION_OF_ASCENDING_NODE = eINSTANCE.getTLE_RightAscentionOfAscendingNode();

		/**
		 * The meta object literal for the '<em><b>Revolution Number At Epoch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__REVOLUTION_NUMBER_AT_EPOCH = eINSTANCE.getTLE_RevolutionNumberAtEpoch();

		/**
		 * The meta object literal for the '<em><b>Satellite Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__SATELLITE_NUMBER = eINSTANCE.getTLE_SatelliteNumber();

		/**
		 * The meta object literal for the '<em><b>BStar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__BSTAR = eINSTANCE.getTLE_BStar();

		/**
		 * The meta object literal for the '<em><b>Epoch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__EPOCH = eINSTANCE.getTLE_Epoch();

		/**
		 * The meta object literal for the '<em><b>Eccentricity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__ECCENTRICITY = eINSTANCE.getTLE_Eccentricity();

		/**
		 * The meta object literal for the '<em><b>Element Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLE__ELEMENT_NUMBER = eINSTANCE.getTLE_ElementNumber();

		/**
		 * The meta object literal for the '<em><b>Get Ore Kit TLE</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TLE___GET_ORE_KIT_TLE = eINSTANCE.getTLE__GetOreKitTLE();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl <em>Earth Surface Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthSurfaceLocation()
		 * @generated
		 */
		EClass EARTH_SURFACE_LOCATION = eINSTANCE.getEarthSurfaceLocation();

		/**
		 * The meta object literal for the '<em><b>Geographical Coordinates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_SURFACE_LOCATION__GEOGRAPHICAL_COORDINATES = eINSTANCE.getEarthSurfaceLocation_GeographicalCoordinates();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationListImpl <em>Earth Surface Location List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationListImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEarthSurfaceLocationList()
		 * @generated
		 */
		EClass EARTH_SURFACE_LOCATION_LIST = eINSTANCE.getEarthSurfaceLocationList();

		/**
		 * The meta object literal for the '<em><b>Earth Surface Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_SURFACE_LOCATION_LIST__EARTH_SURFACE_LOCATIONS = eINSTANCE.getEarthSurfaceLocationList_EarthSurfaceLocations();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationReferencesListImpl <em>Ground Station References List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationReferencesListImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getGroundStationReferencesList()
		 * @generated
		 */
		EClass GROUND_STATION_REFERENCES_LIST = eINSTANCE.getGroundStationReferencesList();

		/**
		 * The meta object literal for the '<em><b>Ground Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_STATION_REFERENCES_LIST__GROUND_STATIONS = eINSTANCE.getGroundStationReferencesList_GroundStations();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationImpl <em>Ground Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getGroundStation()
		 * @generated
		 */
		EClass GROUND_STATION = eINSTANCE.getGroundStation();

		/**
		 * The meta object literal for the '<em><b>Field Of View Orientation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_STATION__FIELD_OF_VIEW_ORIENTATION = eINSTANCE.getGroundStation_FieldOfViewOrientation();

		/**
		 * The meta object literal for the '<em><b>Elevation Mask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_STATION__ELEVATION_MASK = eINSTANCE.getGroundStation_ElevationMask();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationListImpl <em>Ground Station List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.GroundStationListImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getGroundStationList()
		 * @generated
		 */
		EClass GROUND_STATION_LIST = eINSTANCE.getGroundStationList();

		/**
		 * The meta object literal for the '<em><b>Ground Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_STATION_LIST__GROUND_STATIONS = eINSTANCE.getGroundStationList_GroundStations();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassImpl <em>Visibility Pass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getVisibilityPass()
		 * @generated
		 */
		EClass VISIBILITY_PASS = eINSTANCE.getVisibilityPass();

		/**
		 * The meta object literal for the '<em><b>Orbit Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_PASS__ORBIT_MODEL = eINSTANCE.getVisibilityPass_OrbitModel();

		/**
		 * The meta object literal for the '<em><b>Surface Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_PASS__SURFACE_LOCATION = eINSTANCE.getVisibilityPass_SurfaceLocation();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_PASS__START_TIME = eINSTANCE.getVisibilityPass_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_PASS__END_TIME = eINSTANCE.getVisibilityPass_EndTime();

		/**
		 * The meta object literal for the '<em><b>Position History</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_PASS__POSITION_HISTORY = eINSTANCE.getVisibilityPass_PositionHistory();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_PASS__DURATION = eINSTANCE.getVisibilityPass_Duration();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionHistoryImpl <em>Visibility Pass Spacecraft Position History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionHistoryImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getVisibilityPassSpacecraftPositionHistory()
		 * @generated
		 */
		EClass VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY = eINSTANCE.getVisibilityPassSpacecraftPositionHistory();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__TIME_INTERVAL = eINSTANCE.getVisibilityPassSpacecraftPositionHistory_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>Visibility Pass</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS = eINSTANCE.getVisibilityPassSpacecraftPositionHistory_VisibilityPass();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__POSITIONS = eINSTANCE.getVisibilityPassSpacecraftPositionHistory_Positions();

		/**
		 * The meta object literal for the '<em><b>Get Highest Elevation Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_HIGHEST_ELEVATION_POSITION = eINSTANCE.getVisibilityPassSpacecraftPositionHistory__GetHighestElevationPosition();

		/**
		 * The meta object literal for the '<em><b>Get Smallest Spacecraft Cross Track Angle Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___GET_SMALLEST_SPACECRAFT_CROSS_TRACK_ANGLE_POSITION = eINSTANCE.getVisibilityPassSpacecraftPositionHistory__GetSmallestSpacecraftCrossTrackAnglePosition();

		/**
		 * The meta object literal for the '<em><b>Update History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY___UPDATE_HISTORY = eINSTANCE.getVisibilityPassSpacecraftPositionHistory__UpdateHistory();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl <em>Visibility Pass Spacecraft Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getVisibilityPassSpacecraftPosition()
		 * @generated
		 */
		EClass VISIBILITY_PASS_SPACECRAFT_POSITION = eINSTANCE.getVisibilityPassSpacecraftPosition();

		/**
		 * The meta object literal for the '<em><b>Azimuth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH = eINSTANCE.getVisibilityPassSpacecraftPosition_Azimuth();

		/**
		 * The meta object literal for the '<em><b>Elevation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION = eINSTANCE.getVisibilityPassSpacecraftPosition_Elevation();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE = eINSTANCE.getVisibilityPassSpacecraftPosition_Range();

		/**
		 * The meta object literal for the '<em><b>Range Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE = eINSTANCE.getVisibilityPassSpacecraftPosition_RangeRate();

		/**
		 * The meta object literal for the '<em><b>Spacecraft Cross Track Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE = eINSTANCE.getVisibilityPassSpacecraftPosition_SpacecraftCrossTrackAngle();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl <em>Spacecrafts Visibility Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.SpacecraftsVisibilitySetImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getSpacecraftsVisibilitySet()
		 * @generated
		 */
		EClass SPACECRAFTS_VISIBILITY_SET = eINSTANCE.getSpacecraftsVisibilitySet();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFTS_VISIBILITY_SET__START_TIME = eINSTANCE.getSpacecraftsVisibilitySet_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFTS_VISIBILITY_SET__END_TIME = eINSTANCE.getSpacecraftsVisibilitySet_EndTime();

		/**
		 * The meta object literal for the '<em><b>Orbit Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFTS_VISIBILITY_SET__ORBIT_MODELS = eINSTANCE.getSpacecraftsVisibilitySet_OrbitModels();

		/**
		 * The meta object literal for the '<em><b>Ground Stations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFTS_VISIBILITY_SET__GROUND_STATIONS = eINSTANCE.getSpacecraftsVisibilitySet_GroundStations();

		/**
		 * The meta object literal for the '<em><b>Passes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFTS_VISIBILITY_SET__PASSES = eINSTANCE.getSpacecraftsVisibilitySet_Passes();

		/**
		 * The meta object literal for the '<em><b>Ground Station To Visibility Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFTS_VISIBILITY_SET__GROUND_STATION_TO_VISIBILITY_MAP = eINSTANCE.getSpacecraftsVisibilitySet_GroundStationToVisibilityMap();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CorridorPointImpl <em>Corridor Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CorridorPointImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getCorridorPoint()
		 * @generated
		 */
		EClass CORRIDOR_POINT = eINSTANCE.getCorridorPoint();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRIDOR_POINT__LEFT = eINSTANCE.getCorridorPoint_Left();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRIDOR_POINT__CENTER = eINSTANCE.getCorridorPoint_Center();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRIDOR_POINT__RIGHT = eINSTANCE.getCorridorPoint_Right();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CorridorImpl <em>Corridor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CorridorImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getCorridor()
		 * @generated
		 */
		EClass CORRIDOR = eINSTANCE.getCorridor();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRIDOR__POINTS = eINSTANCE.getCorridor_Points();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl <em>Spacecraft Swath Corridor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.SpacecraftSwathCorridorImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getSpacecraftSwathCorridor()
		 * @generated
		 */
		EClass SPACECRAFT_SWATH_CORRIDOR = eINSTANCE.getSpacecraftSwathCorridor();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_SWATH_CORRIDOR__START_TIME = eINSTANCE.getSpacecraftSwathCorridor_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_SWATH_CORRIDOR__END_TIME = eINSTANCE.getSpacecraftSwathCorridor_EndTime();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_SWATH_CORRIDOR__TIME_INTERVAL = eINSTANCE.getSpacecraftSwathCorridor_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>Orbit Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_SWATH_CORRIDOR__ORBIT_MODEL = eINSTANCE.getSpacecraftSwathCorridor_OrbitModel();

		/**
		 * The meta object literal for the '<em><b>Left Swath Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_SWATH_CORRIDOR__LEFT_SWATH_ANGLE = eINSTANCE.getSpacecraftSwathCorridor_LeftSwathAngle();

		/**
		 * The meta object literal for the '<em><b>Right Swath Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_SWATH_CORRIDOR__RIGHT_SWATH_ANGLE = eINSTANCE.getSpacecraftSwathCorridor_RightSwathAngle();

		/**
		 * The meta object literal for the '<em><b>Corridor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_SWATH_CORRIDOR__CORRIDOR = eINSTANCE.getSpacecraftSwathCorridor_Corridor();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getApogyCoreEnvironmentOrbitEarthFacade()
		 * @generated
		 */
		EClass APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade();

		/**
		 * The meta object literal for the '<em><b>Get Mu</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_MU = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__GetMu();

		/**
		 * The meta object literal for the '<em><b>Create Absolute Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ABSOLUTE_DATE__DATE = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateAbsoluteDate__Date();

		/**
		 * The meta object literal for the '<em><b>Create Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_DATE__ABSOLUTEDATE = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateDate__AbsoluteDate();

		/**
		 * The meta object literal for the '<em><b>Create Earth Surface Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_EARTH_SURFACE_LOCATION__STRING_STRING_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateEarthSurfaceLocation__String_String_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Ore Kit Backed Frame</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ORE_KIT_BACKED_FRAME__FRAME = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateOreKitBackedFrame__Frame();

		/**
		 * The meta object literal for the '<em><b>Get Spacecraft Earth Sub Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_SPACECRAFT_EARTH_SUB_POINT__OREKITBACKEDSPACECRAFTSTATE = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftEarthSubPoint__OreKitBackedSpacecraftState();

		/**
		 * The meta object literal for the '<em><b>Get Spacecraft Elevation Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_SPACECRAFT_ELEVATION_ANGLE__SPACECRAFTSTATE_EARTHSURFACELOCATION = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftElevationAngle__SpacecraftState_EarthSurfaceLocation();

		/**
		 * The meta object literal for the '<em><b>Get Spacecraft Azimuth Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_SPACECRAFT_AZIMUTH_ANGLE__SPACECRAFTSTATE_EARTHSURFACELOCATION = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__GetSpacecraftAzimuthAngle__SpacecraftState_EarthSurfaceLocation();

		/**
		 * The meta object literal for the '<em><b>Get Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_RANGE__SPACECRAFTSTATE_EARTHSURFACELOCATION = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__GetRange__SpacecraftState_EarthSurfaceLocation();

		/**
		 * The meta object literal for the '<em><b>Create Spacecraft State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_SPACECRAFT_STATE__ORBIT_SPACECRAFTSTATE = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateSpacecraftState__Orbit_SpacecraftState();

		/**
		 * The meta object literal for the '<em><b>Create Ore Kit Backed Spacecraft State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ORE_KIT_BACKED_SPACECRAFT_STATE__ORBIT_SPACECRAFTSTATE = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateOreKitBackedSpacecraftState__Orbit_SpacecraftState();

		/**
		 * The meta object literal for the '<em><b>Create Timed Stamped PVA Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_TIMED_STAMPED_PVA_COORDINATES__TIMESTAMPEDPVCOORDINATES = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateTimedStampedPVACoordinates__TimeStampedPVCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Timed Stamped Angular Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_TIMED_STAMPED_ANGULAR_COORDINATES__TIMESTAMPEDANGULARCOORDINATES = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateTimedStampedAngularCoordinates__TimeStampedAngularCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Matrix3x3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_MATRIX3X3__ROTATION = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateMatrix3x3__Rotation();

		/**
		 * The meta object literal for the '<em><b>Create Rotation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_ROTATION__MATRIX3X3 = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateRotation__Matrix3x3();

		/**
		 * The meta object literal for the '<em><b>Create Keplerian Orbit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_KEPLERIAN_ORBIT__EARTHORBITPROPAGATOR = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateKeplerianOrbit__EarthOrbitPropagator();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Earth Orbit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_CARTESIAN_EARTH_ORBIT__EARTHORBITPROPAGATOR = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateCartesianEarthOrbit__EarthOrbitPropagator();

		/**
		 * The meta object literal for the '<em><b>Create Keplerian Orbit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_KEPLERIAN_ORBIT__KEPLERIANORBIT = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateKeplerianOrbit__KeplerianOrbit();

		/**
		 * The meta object literal for the '<em><b>Create Cartesian Earth Orbit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_CARTESIAN_EARTH_ORBIT__CARTESIANORBIT = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateCartesianEarthOrbit__CartesianOrbit();

		/**
		 * The meta object literal for the '<em><b>Convert To Geographic Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CONVERT_TO_GEOGRAPHIC_COORDINATES__OREKITBACKEDSPACECRAFTSTATE = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__ConvertToGeographicCoordinates__OreKitBackedSpacecraftState();

		/**
		 * The meta object literal for the '<em><b>Get Visibility Pass Sorted By Start Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SORTED_BY_START_DATE__LIST = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSortedByStartDate__List();

		/**
		 * The meta object literal for the '<em><b>Get Visibility Pass Sorted By Duration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SORTED_BY_DURATION__LIST = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSortedByDuration__List();

		/**
		 * The meta object literal for the '<em><b>Get Visibility Pass Spacecraft Position Sorted By Elevation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SPACECRAFT_POSITION_SORTED_BY_ELEVATION__LIST = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSpacecraftPositionSortedByElevation__List();

		/**
		 * The meta object literal for the '<em><b>Get Visibility Pass Spacecraft Position Sorted By Spacecraft Cross Track Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___GET_VISIBILITY_PASS_SPACECRAFT_POSITION_SORTED_BY_SPACECRAFT_CROSS_TRACK_ANGLE__LIST = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__GetVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle__List();

		/**
		 * The meta object literal for the '<em><b>Load TLE</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___LOAD_TLE__STRING = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__LoadTLE__String();

		/**
		 * The meta object literal for the '<em><b>Create TLE Earth Orbit Propagator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_EARTH_FACADE___CREATE_TLE_EARTH_ORBIT_PROPAGATOR__TLE = eINSTANCE.getApogyCoreEnvironmentOrbitEarthFacade__CreateTLEEarthOrbitPropagator__TLE();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType <em>Ephemeris Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getEphemerisType()
		 * @generated
		 */
		EEnum EPHEMERIS_TYPE = eINSTANCE.getEphemerisType();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getSortedSet()
		 * @generated
		 */
		EDataType SORTED_SET = eINSTANCE.getSortedSet();

		/**
		 * The meta object literal for the '<em>Rotation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.commons.math3.geometry.euclidean.threed.Rotation
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getRotation()
		 * @generated
		 */
		EDataType ROTATION = eINSTANCE.getRotation();

		/**
		 * The meta object literal for the '<em>Ore Kit Frame</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.frames.Frame
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitFrame()
		 * @generated
		 */
		EDataType ORE_KIT_FRAME = eINSTANCE.getOreKitFrame();

		/**
		 * The meta object literal for the '<em>Ore Kit Time Stamped Angular Coordinates</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.utils.TimeStampedAngularCoordinates
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitTimeStampedAngularCoordinates()
		 * @generated
		 */
		EDataType ORE_KIT_TIME_STAMPED_ANGULAR_COORDINATES = eINSTANCE.getOreKitTimeStampedAngularCoordinates();

		/**
		 * The meta object literal for the '<em>Ore Kit Time Stamped PV Coordinates</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.utils.TimeStampedPVCoordinates
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitTimeStampedPVCoordinates()
		 * @generated
		 */
		EDataType ORE_KIT_TIME_STAMPED_PV_COORDINATES = eINSTANCE.getOreKitTimeStampedPVCoordinates();

		/**
		 * The meta object literal for the '<em>Ore Kit Spacecraft State</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.propagation.SpacecraftState
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitSpacecraftState()
		 * @generated
		 */
		EDataType ORE_KIT_SPACECRAFT_STATE = eINSTANCE.getOreKitSpacecraftState();

		/**
		 * The meta object literal for the '<em>Absolute Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.time.AbsoluteDate
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getAbsoluteDate()
		 * @generated
		 */
		EDataType ABSOLUTE_DATE = eINSTANCE.getAbsoluteDate();

		/**
		 * The meta object literal for the '<em>Ore Kit Orbit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.orbits.Orbit
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitOrbit()
		 * @generated
		 */
		EDataType ORE_KIT_ORBIT = eINSTANCE.getOreKitOrbit();

		/**
		 * The meta object literal for the '<em>Ore Kit Keplerian Orbit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.orbits.KeplerianOrbit
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitKeplerianOrbit()
		 * @generated
		 */
		EDataType ORE_KIT_KEPLERIAN_ORBIT = eINSTANCE.getOreKitKeplerianOrbit();

		/**
		 * The meta object literal for the '<em>Ore Kit Cartesian Orbit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.orbits.CartesianOrbit
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitCartesianOrbit()
		 * @generated
		 */
		EDataType ORE_KIT_CARTESIAN_ORBIT = eINSTANCE.getOreKitCartesianOrbit();

		/**
		 * The meta object literal for the '<em>Ore Kit Elevation Mask</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.utils.ElevationMask
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitElevationMask()
		 * @generated
		 */
		EDataType ORE_KIT_ELEVATION_MASK = eINSTANCE.getOreKitElevationMask();

		/**
		 * The meta object literal for the '<em>Ore Kit Attitude Provider</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.attitudes.AttitudeProvider
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitAttitudeProvider()
		 * @generated
		 */
		EDataType ORE_KIT_ATTITUDE_PROVIDER = eINSTANCE.getOreKitAttitudeProvider();

		/**
		 * The meta object literal for the '<em>Ore Kit Propagator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.propagation.Propagator
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitPropagator()
		 * @generated
		 */
		EDataType ORE_KIT_PROPAGATOR = eINSTANCE.getOreKitPropagator();

		/**
		 * The meta object literal for the '<em>Ore Kit DSST Propagator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.propagation.semianalytical.dsst.DSSTPropagator
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitDSSTPropagator()
		 * @generated
		 */
		EDataType ORE_KIT_DSST_PROPAGATOR = eINSTANCE.getOreKitDSSTPropagator();

		/**
		 * The meta object literal for the '<em>Ore Kit Eckstein Hechler Propagator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.propagation.analytical.EcksteinHechlerPropagator
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitEcksteinHechlerPropagator()
		 * @generated
		 */
		EDataType ORE_KIT_ECKSTEIN_HECHLER_PROPAGATOR = eINSTANCE.getOreKitEcksteinHechlerPropagator();

		/**
		 * The meta object literal for the '<em>Ore Kit Ephemeris Progator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.propagation.analytical.Ephemeris
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitEphemerisProgator()
		 * @generated
		 */
		EDataType ORE_KIT_EPHEMERIS_PROGATOR = eINSTANCE.getOreKitEphemerisProgator();

		/**
		 * The meta object literal for the '<em>Ore Kit Keplerian Propagator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.propagation.analytical.KeplerianPropagator
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitKeplerianPropagator()
		 * @generated
		 */
		EDataType ORE_KIT_KEPLERIAN_PROPAGATOR = eINSTANCE.getOreKitKeplerianPropagator();

		/**
		 * The meta object literal for the '<em>Ore Kit Numerical Propagator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.propagation.numerical.NumericalPropagator
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitNumericalPropagator()
		 * @generated
		 */
		EDataType ORE_KIT_NUMERICAL_PROPAGATOR = eINSTANCE.getOreKitNumericalPropagator();

		/**
		 * The meta object literal for the '<em>Ore Kit TLE Propagator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.propagation.analytical.tle.TLEPropagator
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitTLEPropagator()
		 * @generated
		 */
		EDataType ORE_KIT_TLE_PROPAGATOR = eINSTANCE.getOreKitTLEPropagator();

		/**
		 * The meta object literal for the '<em>Ore Kit TLE</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.orekit.propagation.analytical.tle.TLE
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthPackageImpl#getOreKitTLE()
		 * @generated
		 */
		EDataType ORE_KIT_TLE = eINSTANCE.getOreKitTLE();

	}

} //ApogyCoreEnvironmentOrbitEarthPackage
