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
package ca.gc.asc_csa.apogy.core.environment.earth.surface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;

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
 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyEarthSurfaceEnvironment' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCoreEnvironment' complianceLevel='6.0' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.core.environment.earth.surface/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.environment.earth.surface.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core.environment.earth'"
 * @generated
 */
public interface ApogyEarthSurfaceEnvironmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "surface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core.environment.earth.surface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "surface";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyEarthSurfaceEnvironmentPackage eINSTANCE = ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSurfaceWorksiteImpl <em>Earth Surface Worksite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSurfaceWorksiteImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getEarthSurfaceWorksite()
	 * @generated
	 */
	int EARTH_SURFACE_WORKSITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__NAME = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__DESCRIPTION = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__TIME = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__TIME;

	/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__WORKSITES_LIST = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__WORKSITES_LIST;

	/**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__WORKSITE_NODE = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__WORKSITE_NODE;

	/**
	 * The feature id for the '<em><b>Sky</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__SKY = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__SKY;

	/**
	 * The feature id for the '<em><b>Maps List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__MAPS_LIST = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST;

	/**
	 * The feature id for the '<em><b>Celestial Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__CELESTIAL_BODY = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__CELESTIAL_BODY;

	/**
	 * The feature id for the '<em><b>Geographical Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XAxis Azimuth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Earth Sky</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__EARTH_SKY = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Earth Surface Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_FEATURE_COUNT = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Convert To Geographic Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE___CONVERT_TO_GEOGRAPHIC_COORDINATES__TUPLE3D = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Convert To XYZ Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE___CONVERT_TO_XYZ_POSITION__GEOGRAPHICCOORDINATES = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Earth Surface Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_OPERATION_COUNT = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSkyImpl <em>Earth Sky</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSkyImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getEarthSky()
	 * @generated
	 */
	int EARTH_SKY = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY__TIME = ApogyCoreEnvironmentPackage.SKY__TIME;

	/**
	 * The feature id for the '<em><b>Worksite</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY__WORKSITE = ApogyCoreEnvironmentPackage.SKY__WORKSITE;

	/**
	 * The feature id for the '<em><b>Sky Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY__SKY_NODE = ApogyCoreEnvironmentPackage.SKY__SKY_NODE;

	/**
	 * The feature id for the '<em><b>Sun</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY__SUN = ApogyCoreEnvironmentPackage.SKY__SUN;

	/**
	 * The feature id for the '<em><b>Star Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY__STAR_FIELD = ApogyCoreEnvironmentPackage.SKY__STAR_FIELD;

	/**
	 * The feature id for the '<em><b>Sun Horizontal Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY__SUN_HORIZONTAL_COORDINATES = ApogyCoreEnvironmentPackage.SKY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Moon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY__MOON = ApogyCoreEnvironmentPackage.SKY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Moon Horizontal Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY__MOON_HORIZONTAL_COORDINATES = ApogyCoreEnvironmentPackage.SKY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Earth Sky</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_FEATURE_COUNT = ApogyCoreEnvironmentPackage.SKY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Sun Angular Diameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY___GET_SUN_ANGULAR_DIAMETER = ApogyCoreEnvironmentPackage.SKY___GET_SUN_ANGULAR_DIAMETER;

	/**
	 * The operation id for the '<em>Get Moon Angular Diameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY___GET_MOON_ANGULAR_DIAMETER = ApogyCoreEnvironmentPackage.SKY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Earth Sky</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_OPERATION_COUNT = ApogyCoreEnvironmentPackage.SKY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSurfaceWorksiteNodeImpl <em>Earth Surface Worksite Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSurfaceWorksiteNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getEarthSurfaceWorksiteNode()
	 * @generated
	 */
	int EARTH_SURFACE_WORKSITE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_NODE__PARENT = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_NODE__DESCRIPTION = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_NODE__NODE_ID = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_NODE__CHILDREN = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_NODE__AGGREGATED_CHILDREN = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_NODE__WORKSITE = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_NODE__WORKSITE;

	/**
	 * The feature id for the '<em><b>Sky Transform Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_NODE__SKY_TRANSFORM_NODE = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Earth Surface Worksite Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_NODE_FEATURE_COUNT = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_NODE___ACCEPT__INODEVISITOR = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Earth Surface Worksite Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_NODE_OPERATION_COUNT = ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSkyNodeImpl <em>Earth Sky Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSkyNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getEarthSkyNode()
	 * @generated
	 */
	int EARTH_SKY_NODE = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_NODE__PARENT = ApogyCoreEnvironmentPackage.SKY_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_NODE__DESCRIPTION = ApogyCoreEnvironmentPackage.SKY_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_NODE__NODE_ID = ApogyCoreEnvironmentPackage.SKY_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_NODE__CHILDREN = ApogyCoreEnvironmentPackage.SKY_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_NODE__AGGREGATED_CHILDREN = ApogyCoreEnvironmentPackage.SKY_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Sky</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_NODE__SKY = ApogyCoreEnvironmentPackage.SKY_NODE__SKY;

	/**
	 * The number of structural features of the '<em>Earth Sky Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_NODE_FEATURE_COUNT = ApogyCoreEnvironmentPackage.SKY_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_NODE___ACCEPT__INODEVISITOR = ApogyCoreEnvironmentPackage.SKY_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Earth Sky Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_NODE_OPERATION_COUNT = ApogyCoreEnvironmentPackage.SKY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getApogyEarthSurfaceEnvironmentFacade()
	 * @generated
	 */
	int APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE = 4;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Earth Sky</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_EARTH_SKY__GEOGRAPHICCOORDINATES = 0;

	/**
	 * The operation id for the '<em>Create Earth Sky Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_EARTH_SKY_NODE__GEOGRAPHICCOORDINATES = 1;

	/**
	 * The operation id for the '<em>Create And Initialize Default CSA Worksite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_DEFAULT_CSA_WORKSITE = 2;

	/**
	 * The operation id for the '<em>Get Mars Yard Geographical Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___GET_MARS_YARD_GEOGRAPHICAL_COORDINATES = 3;

	/**
	 * The operation id for the '<em>Get Mars Yard Transform Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___GET_MARS_YARD_TRANSFORM_NODE = 4;

	/**
	 * The operation id for the '<em>Create Apogy Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_APOGY_SESSION = 5;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.AtmosphereUtilsImpl <em>Atmosphere Utils</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.AtmosphereUtilsImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getAtmosphereUtils()
	 * @generated
	 */
	int ATMOSPHERE_UTILS = 5;

	/**
	 * The number of structural features of the '<em>Atmosphere Utils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMOSPHERE_UTILS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Air Mass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMOSPHERE_UTILS___GET_AIR_MASS__DOUBLE = 0;

	/**
	 * The operation id for the '<em>Get Direct Sun Intensity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMOSPHERE_UTILS___GET_DIRECT_SUN_INTENSITY__DOUBLE_DOUBLE = 1;

	/**
	 * The operation id for the '<em>Get Diffuse Sun Intensity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMOSPHERE_UTILS___GET_DIFFUSE_SUN_INTENSITY__DOUBLE_DOUBLE = 2;

	/**
	 * The operation id for the '<em>Get Atmosphere Refraction Correction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMOSPHERE_UTILS___GET_ATMOSPHERE_REFRACTION_CORRECTION__DOUBLE = 3;

	/**
	 * The number of operations of the '<em>Atmosphere Utils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMOSPHERE_UTILS_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.AstronomyUtilsImpl <em>Astronomy Utils</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.AstronomyUtilsImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getAstronomyUtils()
	 * @generated
	 */
	int ASTRONOMY_UTILS = 6;

	/**
	 * The number of structural features of the '<em>Astronomy Utils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Sun Equatorial Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_SUN_EQUATORIAL_POSITION__DOUBLE = 0;

	/**
	 * The operation id for the '<em>Get Horizontal Sun Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_HORIZONTAL_SUN_POSITION__DATE_DOUBLE_DOUBLE = 1;

	/**
	 * The operation id for the '<em>Get Moon Equatorial Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_MOON_EQUATORIAL_POSITION__DOUBLE = 2;

	/**
	 * The operation id for the '<em>Get Moon Topocentric Equatorial Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_MOON_TOPOCENTRIC_EQUATORIAL_POSITION__DATE_DOUBLE_DOUBLE = 3;

	/**
	 * The operation id for the '<em>Get Horizontal Moon Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_HORIZONTAL_MOON_POSITION__DATE_DOUBLE_DOUBLE = 4;

	/**
	 * The operation id for the '<em>Get Time Since J2000</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_TIME_SINCE_J2000__DOUBLE = 5;

	/**
	 * The operation id for the '<em>Get Local Sideral Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_LOCAL_SIDERAL_TIME__DATE_DOUBLE = 6;

	/**
	 * The operation id for the '<em>Get UTC Decimal Hours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_UTC_DECIMAL_HOURS__DATE = 7;

	/**
	 * The operation id for the '<em>Convert To Horizontal Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_TO_HORIZONTAL_COORDINATES__EQUATORIALCOORDINATES_DOUBLE_DOUBLE_DATE = 8;

	/**
	 * The operation id for the '<em>Convert Time To Angle</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_TIME_TO_ANGLE__INT_INT_INT = 9;

	/**
	 * The operation id for the '<em>Clamp Angle To Zero2 PI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CLAMP_ANGLE_TO_ZERO2_PI__DOUBLE = 10;

	/**
	 * The operation id for the '<em>Convert To Equatorial Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_TO_EQUATORIAL_COORDINATES__ECLIPTICCOORDINATES = 11;

	/**
	 * The operation id for the '<em>Convert To Ecliptic Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_TO_ECLIPTIC_COORDINATES__EQUATORIALCOORDINATES = 12;

	/**
	 * The operation id for the '<em>Convert From Equatorial Rectangular To Ecliptic Rectangular</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_RECTANGULAR_TO_ECLIPTIC_RECTANGULAR__POINT3D = 13;

	/**
	 * The operation id for the '<em>Convert From Ecliptic Rectangular To Equatorial Rectangular</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_FROM_ECLIPTIC_RECTANGULAR_TO_EQUATORIAL_RECTANGULAR__POINT3D = 14;

	/**
	 * The operation id for the '<em>Convert From Ecliptic Rectangular To Ecliptic Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_FROM_ECLIPTIC_RECTANGULAR_TO_ECLIPTIC_COORDINATES__POINT3D = 15;

	/**
	 * The operation id for the '<em>Convert From Equatorial Rectangular To Equatorial Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_RECTANGULAR_TO_EQUATORIAL_COORDINATES__POINT3D = 16;

	/**
	 * The operation id for the '<em>Convert From Horizontal Coordinates To Horizontal Rectangular</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_FROM_HORIZONTAL_COORDINATES_TO_HORIZONTAL_RECTANGULAR__HORIZONTALCOORDINATES = 17;

	/**
	 * The operation id for the '<em>Convert From Equatorial Coordinates To Equatorial Rectangular</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_COORDINATES_TO_EQUATORIAL_RECTANGULAR__EQUATORIALCOORDINATES = 18;

	/**
	 * The operation id for the '<em>Convert AUto Meters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_AUTO_METERS__DOUBLE = 19;

	/**
	 * The operation id for the '<em>Get Maximum Sun Altitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_MAXIMUM_SUN_ALTITUDE__DOUBLE = 20;

	/**
	 * The operation id for the '<em>Convert To HHmmss String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___CONVERT_TO_HHMMSS_STRING__DOUBLE = 21;

	/**
	 * The operation id for the '<em>Get Sun Rise Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_SUN_RISE_TIME__DATE_DOUBLE_DOUBLE = 22;

	/**
	 * The operation id for the '<em>Get Sun Set Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_SUN_SET_TIME__DATE_DOUBLE_DOUBLE = 23;

	/**
	 * The operation id for the '<em>Get Sun Highest Elevation Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS___GET_SUN_HIGHEST_ELEVATION_TIME__DATE_DOUBLE_DOUBLE = 24;

	/**
	 * The number of operations of the '<em>Astronomy Utils</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRONOMY_UTILS_OPERATION_COUNT = 25;

	/**
	 * The meta object id for the '<em>Point3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3d
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getPoint3d()
	 * @generated
	 */
	int POINT3D = 7;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite <em>Earth Surface Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Surface Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite
	 * @generated
	 */
	EClass getEarthSurfaceWorksite();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite#getGeographicalCoordinates <em>Geographical Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geographical Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite#getGeographicalCoordinates()
	 * @see #getEarthSurfaceWorksite()
	 * @generated
	 */
	EReference getEarthSurfaceWorksite_GeographicalCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite#getXAxisAzimuth <em>XAxis Azimuth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis Azimuth</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite#getXAxisAzimuth()
	 * @see #getEarthSurfaceWorksite()
	 * @generated
	 */
	EAttribute getEarthSurfaceWorksite_XAxisAzimuth();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite#getEarthSky <em>Earth Sky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Earth Sky</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite#getEarthSky()
	 * @see #getEarthSurfaceWorksite()
	 * @generated
	 */
	EReference getEarthSurfaceWorksite_EarthSky();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Convert To Geographic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Geographic Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getEarthSurfaceWorksite__ConvertToGeographicCoordinates__Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite#convertToXYZPosition(ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates) <em>Convert To XYZ Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To XYZ Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite#convertToXYZPosition(ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates)
	 * @generated
	 */
	EOperation getEarthSurfaceWorksite__ConvertToXYZPosition__GeographicCoordinates();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky <em>Earth Sky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Sky</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky
	 * @generated
	 */
	EClass getEarthSky();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky#getSunHorizontalCoordinates <em>Sun Horizontal Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sun Horizontal Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky#getSunHorizontalCoordinates()
	 * @see #getEarthSky()
	 * @generated
	 */
	EReference getEarthSky_SunHorizontalCoordinates();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky#getMoon <em>Moon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moon</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky#getMoon()
	 * @see #getEarthSky()
	 * @generated
	 */
	EReference getEarthSky_Moon();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky#getMoonHorizontalCoordinates <em>Moon Horizontal Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moon Horizontal Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky#getMoonHorizontalCoordinates()
	 * @see #getEarthSky()
	 * @generated
	 */
	EReference getEarthSky_MoonHorizontalCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky#getMoonAngularDiameter() <em>Get Moon Angular Diameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moon Angular Diameter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky#getMoonAngularDiameter()
	 * @generated
	 */
	EOperation getEarthSky__GetMoonAngularDiameter();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksiteNode <em>Earth Surface Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Surface Worksite Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksiteNode
	 * @generated
	 */
	EClass getEarthSurfaceWorksiteNode();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksiteNode#getSkyTransformNode <em>Sky Transform Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sky Transform Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksiteNode#getSkyTransformNode()
	 * @see #getEarthSurfaceWorksiteNode()
	 * @generated
	 */
	EReference getEarthSurfaceWorksiteNode_SkyTransformNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSkyNode <em>Earth Sky Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Sky Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSkyNode
	 * @generated
	 */
	EClass getEarthSkyNode();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade
	 * @generated
	 */
	EClass getApogyEarthSurfaceEnvironmentFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#createEarthSky(ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates) <em>Create Earth Sky</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Earth Sky</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#createEarthSky(ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates)
	 * @generated
	 */
	EOperation getApogyEarthSurfaceEnvironmentFacade__CreateEarthSky__GeographicCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#createEarthSkyNode(ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates) <em>Create Earth Sky Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Earth Sky Node</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#createEarthSkyNode(ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates)
	 * @generated
	 */
	EOperation getApogyEarthSurfaceEnvironmentFacade__CreateEarthSkyNode__GeographicCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#createAndInitializeDefaultCSAWorksite() <em>Create And Initialize Default CSA Worksite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create And Initialize Default CSA Worksite</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#createAndInitializeDefaultCSAWorksite()
	 * @generated
	 */
	EOperation getApogyEarthSurfaceEnvironmentFacade__CreateAndInitializeDefaultCSAWorksite();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#getMarsYardGeographicalCoordinates() <em>Get Mars Yard Geographical Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mars Yard Geographical Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#getMarsYardGeographicalCoordinates()
	 * @generated
	 */
	EOperation getApogyEarthSurfaceEnvironmentFacade__GetMarsYardGeographicalCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#getMarsYardTransformNode() <em>Get Mars Yard Transform Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mars Yard Transform Node</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#getMarsYardTransformNode()
	 * @generated
	 */
	EOperation getApogyEarthSurfaceEnvironmentFacade__GetMarsYardTransformNode();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#createApogySession() <em>Create Apogy Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Apogy Session</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade#createApogySession()
	 * @generated
	 */
	EOperation getApogyEarthSurfaceEnvironmentFacade__CreateApogySession();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils <em>Atmosphere Utils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atmosphere Utils</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils
	 * @generated
	 */
	EClass getAtmosphereUtils();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils#getAirMass(double) <em>Get Air Mass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Air Mass</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils#getAirMass(double)
	 * @generated
	 */
	EOperation getAtmosphereUtils__GetAirMass__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils#getDirectSunIntensity(double, double) <em>Get Direct Sun Intensity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Direct Sun Intensity</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils#getDirectSunIntensity(double, double)
	 * @generated
	 */
	EOperation getAtmosphereUtils__GetDirectSunIntensity__double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils#getDiffuseSunIntensity(double, double) <em>Get Diffuse Sun Intensity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Diffuse Sun Intensity</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils#getDiffuseSunIntensity(double, double)
	 * @generated
	 */
	EOperation getAtmosphereUtils__GetDiffuseSunIntensity__double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils#getAtmosphereRefractionCorrection(double) <em>Get Atmosphere Refraction Correction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Atmosphere Refraction Correction</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils#getAtmosphereRefractionCorrection(double)
	 * @generated
	 */
	EOperation getAtmosphereUtils__GetAtmosphereRefractionCorrection__double();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils <em>Astronomy Utils</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Astronomy Utils</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils
	 * @generated
	 */
	EClass getAstronomyUtils();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getSunEquatorialPosition(double) <em>Get Sun Equatorial Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Equatorial Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getSunEquatorialPosition(double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetSunEquatorialPosition__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getHorizontalSunPosition(java.util.Date, double, double) <em>Get Horizontal Sun Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Horizontal Sun Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getHorizontalSunPosition(java.util.Date, double, double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetHorizontalSunPosition__Date_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getMoonEquatorialPosition(double) <em>Get Moon Equatorial Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moon Equatorial Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getMoonEquatorialPosition(double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetMoonEquatorialPosition__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getMoonTopocentricEquatorialPosition(java.util.Date, double, double) <em>Get Moon Topocentric Equatorial Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moon Topocentric Equatorial Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getMoonTopocentricEquatorialPosition(java.util.Date, double, double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getHorizontalMoonPosition(java.util.Date, double, double) <em>Get Horizontal Moon Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Horizontal Moon Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getHorizontalMoonPosition(java.util.Date, double, double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getTimeSinceJ2000(double) <em>Get Time Since J2000</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Since J2000</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getTimeSinceJ2000(double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetTimeSinceJ2000__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getLocalSideralTime(java.util.Date, double) <em>Get Local Sideral Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Local Sideral Time</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getLocalSideralTime(java.util.Date, double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetLocalSideralTime__Date_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getUTCDecimalHours(java.util.Date) <em>Get UTC Decimal Hours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get UTC Decimal Hours</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getUTCDecimalHours(java.util.Date)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetUTCDecimalHours__Date();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertToHorizontalCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates, double, double, java.util.Date) <em>Convert To Horizontal Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Horizontal Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertToHorizontalCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates, double, double, java.util.Date)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertTimeToAngle(int, int, int) <em>Convert Time To Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert Time To Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertTimeToAngle(int, int, int)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertTimeToAngle__int_int_int();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#clampAngleToZero2PI(double) <em>Clamp Angle To Zero2 PI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clamp Angle To Zero2 PI</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#clampAngleToZero2PI(double)
	 * @generated
	 */
	EOperation getAstronomyUtils__ClampAngleToZero2PI__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertToEquatorialCoordinates(ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates) <em>Convert To Equatorial Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Equatorial Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertToEquatorialCoordinates(ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertToEquatorialCoordinates__EclipticCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertToEclipticCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates) <em>Convert To Ecliptic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Ecliptic Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertToEclipticCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertToEclipticCoordinates__EquatorialCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromEquatorialRectangularToEclipticRectangular(javax.vecmath.Point3d) <em>Convert From Equatorial Rectangular To Ecliptic Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Equatorial Rectangular To Ecliptic Rectangular</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromEquatorialRectangularToEclipticRectangular(javax.vecmath.Point3d)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertFromEquatorialRectangularToEclipticRectangular__Point3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromEclipticRectangularToEquatorialRectangular(javax.vecmath.Point3d) <em>Convert From Ecliptic Rectangular To Equatorial Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Ecliptic Rectangular To Equatorial Rectangular</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromEclipticRectangularToEquatorialRectangular(javax.vecmath.Point3d)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertFromEclipticRectangularToEquatorialRectangular__Point3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromEclipticRectangularToEclipticCoordinates(javax.vecmath.Point3d) <em>Convert From Ecliptic Rectangular To Ecliptic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Ecliptic Rectangular To Ecliptic Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromEclipticRectangularToEclipticCoordinates(javax.vecmath.Point3d)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertFromEclipticRectangularToEclipticCoordinates__Point3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromEquatorialRectangularToEquatorialCoordinates(javax.vecmath.Point3d) <em>Convert From Equatorial Rectangular To Equatorial Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Equatorial Rectangular To Equatorial Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromEquatorialRectangularToEquatorialCoordinates(javax.vecmath.Point3d)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertFromEquatorialRectangularToEquatorialCoordinates__Point3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromHorizontalCoordinatesToHorizontalRectangular(ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates) <em>Convert From Horizontal Coordinates To Horizontal Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Horizontal Coordinates To Horizontal Rectangular</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromHorizontalCoordinatesToHorizontalRectangular(ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertFromHorizontalCoordinatesToHorizontalRectangular__HorizontalCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromEquatorialCoordinatesToEquatorialRectangular(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates) <em>Convert From Equatorial Coordinates To Equatorial Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Equatorial Coordinates To Equatorial Rectangular</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertFromEquatorialCoordinatesToEquatorialRectangular(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertFromEquatorialCoordinatesToEquatorialRectangular__EquatorialCoordinates();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertAUtoMeters(double) <em>Convert AUto Meters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert AUto Meters</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertAUtoMeters(double)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertAUtoMeters__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getMaximumSunAltitude(double) <em>Get Maximum Sun Altitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Maximum Sun Altitude</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getMaximumSunAltitude(double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetMaximumSunAltitude__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertToHHmmssString(double) <em>Convert To HHmmss String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To HHmmss String</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#convertToHHmmssString(double)
	 * @generated
	 */
	EOperation getAstronomyUtils__ConvertToHHmmssString__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getSunRiseTime(java.util.Date, double, double) <em>Get Sun Rise Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Rise Time</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getSunRiseTime(java.util.Date, double, double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetSunRiseTime__Date_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getSunSetTime(java.util.Date, double, double) <em>Get Sun Set Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Set Time</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getSunSetTime(java.util.Date, double, double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetSunSetTime__Date_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getSunHighestElevationTime(java.util.Date, double, double) <em>Get Sun Highest Elevation Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Highest Elevation Time</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils#getSunHighestElevationTime(java.util.Date, double, double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetSunHighestElevationTime__Date_double_double();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Point3d <em>Point3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point3d</em>'.
	 * @see javax.vecmath.Point3d
	 * @model instanceClass="javax.vecmath.Point3d"
	 * @generated
	 */
	EDataType getPoint3d();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyEarthSurfaceEnvironmentFactory getApogyEarthSurfaceEnvironmentFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSurfaceWorksiteImpl <em>Earth Surface Worksite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSurfaceWorksiteImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getEarthSurfaceWorksite()
		 * @generated
		 */
		EClass EARTH_SURFACE_WORKSITE = eINSTANCE.getEarthSurfaceWorksite();

		/**
		 * The meta object literal for the '<em><b>Geographical Coordinates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES = eINSTANCE.getEarthSurfaceWorksite_GeographicalCoordinates();

		/**
		 * The meta object literal for the '<em><b>XAxis Azimuth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH = eINSTANCE.getEarthSurfaceWorksite_XAxisAzimuth();

		/**
		 * The meta object literal for the '<em><b>Earth Sky</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_SURFACE_WORKSITE__EARTH_SKY = eINSTANCE.getEarthSurfaceWorksite_EarthSky();

		/**
		 * The meta object literal for the '<em><b>Convert To Geographic Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EARTH_SURFACE_WORKSITE___CONVERT_TO_GEOGRAPHIC_COORDINATES__TUPLE3D = eINSTANCE.getEarthSurfaceWorksite__ConvertToGeographicCoordinates__Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Convert To XYZ Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EARTH_SURFACE_WORKSITE___CONVERT_TO_XYZ_POSITION__GEOGRAPHICCOORDINATES = eINSTANCE.getEarthSurfaceWorksite__ConvertToXYZPosition__GeographicCoordinates();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSkyImpl <em>Earth Sky</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSkyImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getEarthSky()
		 * @generated
		 */
		EClass EARTH_SKY = eINSTANCE.getEarthSky();

		/**
		 * The meta object literal for the '<em><b>Sun Horizontal Coordinates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_SKY__SUN_HORIZONTAL_COORDINATES = eINSTANCE.getEarthSky_SunHorizontalCoordinates();

		/**
		 * The meta object literal for the '<em><b>Moon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_SKY__MOON = eINSTANCE.getEarthSky_Moon();

		/**
		 * The meta object literal for the '<em><b>Moon Horizontal Coordinates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_SKY__MOON_HORIZONTAL_COORDINATES = eINSTANCE.getEarthSky_MoonHorizontalCoordinates();

		/**
		 * The meta object literal for the '<em><b>Get Moon Angular Diameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EARTH_SKY___GET_MOON_ANGULAR_DIAMETER = eINSTANCE.getEarthSky__GetMoonAngularDiameter();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSurfaceWorksiteNodeImpl <em>Earth Surface Worksite Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSurfaceWorksiteNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getEarthSurfaceWorksiteNode()
		 * @generated
		 */
		EClass EARTH_SURFACE_WORKSITE_NODE = eINSTANCE.getEarthSurfaceWorksiteNode();

		/**
		 * The meta object literal for the '<em><b>Sky Transform Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_SURFACE_WORKSITE_NODE__SKY_TRANSFORM_NODE = eINSTANCE.getEarthSurfaceWorksiteNode_SkyTransformNode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSkyNodeImpl <em>Earth Sky Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSkyNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getEarthSkyNode()
		 * @generated
		 */
		EClass EARTH_SKY_NODE = eINSTANCE.getEarthSkyNode();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getApogyEarthSurfaceEnvironmentFacade()
		 * @generated
		 */
		EClass APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE = eINSTANCE.getApogyEarthSurfaceEnvironmentFacade();

		/**
		 * The meta object literal for the '<em><b>Create Earth Sky</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_EARTH_SKY__GEOGRAPHICCOORDINATES = eINSTANCE.getApogyEarthSurfaceEnvironmentFacade__CreateEarthSky__GeographicCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create Earth Sky Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_EARTH_SKY_NODE__GEOGRAPHICCOORDINATES = eINSTANCE.getApogyEarthSurfaceEnvironmentFacade__CreateEarthSkyNode__GeographicCoordinates();

		/**
		 * The meta object literal for the '<em><b>Create And Initialize Default CSA Worksite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_DEFAULT_CSA_WORKSITE = eINSTANCE.getApogyEarthSurfaceEnvironmentFacade__CreateAndInitializeDefaultCSAWorksite();

		/**
		 * The meta object literal for the '<em><b>Get Mars Yard Geographical Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___GET_MARS_YARD_GEOGRAPHICAL_COORDINATES = eINSTANCE.getApogyEarthSurfaceEnvironmentFacade__GetMarsYardGeographicalCoordinates();

		/**
		 * The meta object literal for the '<em><b>Get Mars Yard Transform Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___GET_MARS_YARD_TRANSFORM_NODE = eINSTANCE.getApogyEarthSurfaceEnvironmentFacade__GetMarsYardTransformNode();

		/**
		 * The meta object literal for the '<em><b>Create Apogy Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_APOGY_SESSION = eINSTANCE.getApogyEarthSurfaceEnvironmentFacade__CreateApogySession();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.AtmosphereUtilsImpl <em>Atmosphere Utils</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.AtmosphereUtilsImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getAtmosphereUtils()
		 * @generated
		 */
		EClass ATMOSPHERE_UTILS = eINSTANCE.getAtmosphereUtils();

		/**
		 * The meta object literal for the '<em><b>Get Air Mass</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATMOSPHERE_UTILS___GET_AIR_MASS__DOUBLE = eINSTANCE.getAtmosphereUtils__GetAirMass__double();

		/**
		 * The meta object literal for the '<em><b>Get Direct Sun Intensity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATMOSPHERE_UTILS___GET_DIRECT_SUN_INTENSITY__DOUBLE_DOUBLE = eINSTANCE.getAtmosphereUtils__GetDirectSunIntensity__double_double();

		/**
		 * The meta object literal for the '<em><b>Get Diffuse Sun Intensity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATMOSPHERE_UTILS___GET_DIFFUSE_SUN_INTENSITY__DOUBLE_DOUBLE = eINSTANCE.getAtmosphereUtils__GetDiffuseSunIntensity__double_double();

		/**
		 * The meta object literal for the '<em><b>Get Atmosphere Refraction Correction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATMOSPHERE_UTILS___GET_ATMOSPHERE_REFRACTION_CORRECTION__DOUBLE = eINSTANCE.getAtmosphereUtils__GetAtmosphereRefractionCorrection__double();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.AstronomyUtilsImpl <em>Astronomy Utils</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.AstronomyUtilsImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getAstronomyUtils()
		 * @generated
		 */
		EClass ASTRONOMY_UTILS = eINSTANCE.getAstronomyUtils();

		/**
		 * The meta object literal for the '<em><b>Get Sun Equatorial Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_SUN_EQUATORIAL_POSITION__DOUBLE = eINSTANCE.getAstronomyUtils__GetSunEquatorialPosition__double();

		/**
		 * The meta object literal for the '<em><b>Get Horizontal Sun Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_HORIZONTAL_SUN_POSITION__DATE_DOUBLE_DOUBLE = eINSTANCE.getAstronomyUtils__GetHorizontalSunPosition__Date_double_double();

		/**
		 * The meta object literal for the '<em><b>Get Moon Equatorial Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_MOON_EQUATORIAL_POSITION__DOUBLE = eINSTANCE.getAstronomyUtils__GetMoonEquatorialPosition__double();

		/**
		 * The meta object literal for the '<em><b>Get Moon Topocentric Equatorial Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_MOON_TOPOCENTRIC_EQUATORIAL_POSITION__DATE_DOUBLE_DOUBLE = eINSTANCE.getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double();

		/**
		 * The meta object literal for the '<em><b>Get Horizontal Moon Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_HORIZONTAL_MOON_POSITION__DATE_DOUBLE_DOUBLE = eINSTANCE.getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double();

		/**
		 * The meta object literal for the '<em><b>Get Time Since J2000</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_TIME_SINCE_J2000__DOUBLE = eINSTANCE.getAstronomyUtils__GetTimeSinceJ2000__double();

		/**
		 * The meta object literal for the '<em><b>Get Local Sideral Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_LOCAL_SIDERAL_TIME__DATE_DOUBLE = eINSTANCE.getAstronomyUtils__GetLocalSideralTime__Date_double();

		/**
		 * The meta object literal for the '<em><b>Get UTC Decimal Hours</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_UTC_DECIMAL_HOURS__DATE = eINSTANCE.getAstronomyUtils__GetUTCDecimalHours__Date();

		/**
		 * The meta object literal for the '<em><b>Convert To Horizontal Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_TO_HORIZONTAL_COORDINATES__EQUATORIALCOORDINATES_DOUBLE_DOUBLE_DATE = eINSTANCE.getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date();

		/**
		 * The meta object literal for the '<em><b>Convert Time To Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_TIME_TO_ANGLE__INT_INT_INT = eINSTANCE.getAstronomyUtils__ConvertTimeToAngle__int_int_int();

		/**
		 * The meta object literal for the '<em><b>Clamp Angle To Zero2 PI</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CLAMP_ANGLE_TO_ZERO2_PI__DOUBLE = eINSTANCE.getAstronomyUtils__ClampAngleToZero2PI__double();

		/**
		 * The meta object literal for the '<em><b>Convert To Equatorial Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_TO_EQUATORIAL_COORDINATES__ECLIPTICCOORDINATES = eINSTANCE.getAstronomyUtils__ConvertToEquatorialCoordinates__EclipticCoordinates();

		/**
		 * The meta object literal for the '<em><b>Convert To Ecliptic Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_TO_ECLIPTIC_COORDINATES__EQUATORIALCOORDINATES = eINSTANCE.getAstronomyUtils__ConvertToEclipticCoordinates__EquatorialCoordinates();

		/**
		 * The meta object literal for the '<em><b>Convert From Equatorial Rectangular To Ecliptic Rectangular</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_RECTANGULAR_TO_ECLIPTIC_RECTANGULAR__POINT3D = eINSTANCE.getAstronomyUtils__ConvertFromEquatorialRectangularToEclipticRectangular__Point3d();

		/**
		 * The meta object literal for the '<em><b>Convert From Ecliptic Rectangular To Equatorial Rectangular</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_FROM_ECLIPTIC_RECTANGULAR_TO_EQUATORIAL_RECTANGULAR__POINT3D = eINSTANCE.getAstronomyUtils__ConvertFromEclipticRectangularToEquatorialRectangular__Point3d();

		/**
		 * The meta object literal for the '<em><b>Convert From Ecliptic Rectangular To Ecliptic Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_FROM_ECLIPTIC_RECTANGULAR_TO_ECLIPTIC_COORDINATES__POINT3D = eINSTANCE.getAstronomyUtils__ConvertFromEclipticRectangularToEclipticCoordinates__Point3d();

		/**
		 * The meta object literal for the '<em><b>Convert From Equatorial Rectangular To Equatorial Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_RECTANGULAR_TO_EQUATORIAL_COORDINATES__POINT3D = eINSTANCE.getAstronomyUtils__ConvertFromEquatorialRectangularToEquatorialCoordinates__Point3d();

		/**
		 * The meta object literal for the '<em><b>Convert From Horizontal Coordinates To Horizontal Rectangular</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_FROM_HORIZONTAL_COORDINATES_TO_HORIZONTAL_RECTANGULAR__HORIZONTALCOORDINATES = eINSTANCE.getAstronomyUtils__ConvertFromHorizontalCoordinatesToHorizontalRectangular__HorizontalCoordinates();

		/**
		 * The meta object literal for the '<em><b>Convert From Equatorial Coordinates To Equatorial Rectangular</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_COORDINATES_TO_EQUATORIAL_RECTANGULAR__EQUATORIALCOORDINATES = eINSTANCE.getAstronomyUtils__ConvertFromEquatorialCoordinatesToEquatorialRectangular__EquatorialCoordinates();

		/**
		 * The meta object literal for the '<em><b>Convert AUto Meters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_AUTO_METERS__DOUBLE = eINSTANCE.getAstronomyUtils__ConvertAUtoMeters__double();

		/**
		 * The meta object literal for the '<em><b>Get Maximum Sun Altitude</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_MAXIMUM_SUN_ALTITUDE__DOUBLE = eINSTANCE.getAstronomyUtils__GetMaximumSunAltitude__double();

		/**
		 * The meta object literal for the '<em><b>Convert To HHmmss String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___CONVERT_TO_HHMMSS_STRING__DOUBLE = eINSTANCE.getAstronomyUtils__ConvertToHHmmssString__double();

		/**
		 * The meta object literal for the '<em><b>Get Sun Rise Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_SUN_RISE_TIME__DATE_DOUBLE_DOUBLE = eINSTANCE.getAstronomyUtils__GetSunRiseTime__Date_double_double();

		/**
		 * The meta object literal for the '<em><b>Get Sun Set Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_SUN_SET_TIME__DATE_DOUBLE_DOUBLE = eINSTANCE.getAstronomyUtils__GetSunSetTime__Date_double_double();

		/**
		 * The meta object literal for the '<em><b>Get Sun Highest Elevation Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASTRONOMY_UTILS___GET_SUN_HIGHEST_ELEVATION_TIME__DATE_DOUBLE_DOUBLE = eINSTANCE.getAstronomyUtils__GetSunHighestElevationTime__Date_double_double();

		/**
		 * The meta object literal for the '<em>Point3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3d
		 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentPackageImpl#getPoint3d()
		 * @generated
		 */
		EDataType POINT3D = eINSTANCE.getPoint3d();

	}

} //ApogyEarthSurfaceEnvironmentPackage
