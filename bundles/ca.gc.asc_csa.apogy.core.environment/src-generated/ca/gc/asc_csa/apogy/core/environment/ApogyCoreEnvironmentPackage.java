package ca.gc.asc_csa.apogy.core.environment;
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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;

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
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreEnvironment' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCoreEnvironment' complianceLevel='6.0' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf/templates' modelDirectory='/ca.gc.asc_csa.apogy.core.environment/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.environment.edit/src-generated' testsDirectory='/ca.gc.asc_csa.apogy.core.environment.tests/src-generated' basePackage='ca.gc.asc_csa.apogy.core'"
 * @generated
 */
public interface ApogyCoreEnvironmentPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "environment";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.core.environment";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "environment";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCoreEnvironmentPackage eINSTANCE = ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl <em>Worksite</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getWorksite()
	 * @generated
	 */
  int WORKSITE = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITE__NAME = ApogyCorePackage.ABSTRACT_WORKSITE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITE__DESCRIPTION = ApogyCorePackage.ABSTRACT_WORKSITE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITE__TIME = ApogyCorePackage.ABSTRACT_WORKSITE__TIME;

		/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE__WORKSITES_LIST = ApogyCorePackage.ABSTRACT_WORKSITE__WORKSITES_LIST;

  /**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE__WORKSITE_NODE = ApogyCorePackage.ABSTRACT_WORKSITE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Orbits Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITE__ORBITS_MODELS = ApogyCorePackage.ABSTRACT_WORKSITE_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE__ENVIRONMENT = ApogyCorePackage.ABSTRACT_WORKSITE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Worksite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_FEATURE_COUNT = ApogyCorePackage.ABSTRACT_WORKSITE_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Worksite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_OPERATION_COUNT = ApogyCorePackage.ABSTRACT_WORKSITE_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SurfaceWorksiteImpl <em>Surface Worksite</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.SurfaceWorksiteImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSurfaceWorksite()
	 * @generated
	 */
  int SURFACE_WORKSITE = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__NAME = WORKSITE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__DESCRIPTION = WORKSITE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__TIME = WORKSITE__TIME;

		/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE__WORKSITES_LIST = WORKSITE__WORKSITES_LIST;

  /**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE__WORKSITE_NODE = WORKSITE__WORKSITE_NODE;

  /**
	 * The feature id for the '<em><b>Orbits Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE__ORBITS_MODELS = WORKSITE__ORBITS_MODELS;

		/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE__ENVIRONMENT = WORKSITE__ENVIRONMENT;

  /**
	 * The feature id for the '<em><b>Sky</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE__SKY = WORKSITE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Maps List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE__MAPS_LIST = WORKSITE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Surface Worksite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE_FEATURE_COUNT = WORKSITE_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Surface Worksite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE_OPERATION_COUNT = WORKSITE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceWorksiteImpl <em>Earth Surface Worksite</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceWorksiteImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarthSurfaceWorksite()
	 * @generated
	 */
  int EARTH_SURFACE_WORKSITE = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__NAME = SURFACE_WORKSITE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__DESCRIPTION = SURFACE_WORKSITE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__TIME = SURFACE_WORKSITE__TIME;

		/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE__WORKSITES_LIST = SURFACE_WORKSITE__WORKSITES_LIST;

  /**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE__WORKSITE_NODE = SURFACE_WORKSITE__WORKSITE_NODE;

  /**
	 * The feature id for the '<em><b>Orbits Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE__ORBITS_MODELS = SURFACE_WORKSITE__ORBITS_MODELS;

		/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE__ENVIRONMENT = SURFACE_WORKSITE__ENVIRONMENT;

  /**
	 * The feature id for the '<em><b>Sky</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE__SKY = SURFACE_WORKSITE__SKY;

  /**
	 * The feature id for the '<em><b>Maps List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE__MAPS_LIST = SURFACE_WORKSITE__MAPS_LIST;

  /**
	 * The feature id for the '<em><b>Geographical Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES = SURFACE_WORKSITE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>XAxis Azimuth</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH = SURFACE_WORKSITE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Earth Sky</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE__EARTH_SKY = SURFACE_WORKSITE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Earth Surface Worksite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_FEATURE_COUNT = SURFACE_WORKSITE_FEATURE_COUNT + 3;

  /**
	 * The operation id for the '<em>Convert To Geographic Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE___CONVERT_TO_GEOGRAPHIC_COORDINATES__TUPLE3D = SURFACE_WORKSITE_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Convert To XYZ Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE___CONVERT_TO_XYZ_POSITION__GEOGRAPHICCOORDINATES = SURFACE_WORKSITE_OPERATION_COUNT + 1;

		/**
	 * The number of operations of the '<em>Earth Surface Worksite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_OPERATION_COUNT = SURFACE_WORKSITE_OPERATION_COUNT + 2;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EnvironmentImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEnvironment()
	 * @generated
	 */
  int ENVIRONMENT = 3;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT__NAME = ApogyCommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SurfaceEnvironmentImpl <em>Surface Environment</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.SurfaceEnvironmentImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSurfaceEnvironment()
	 * @generated
	 */
  int SURFACE_ENVIRONMENT = 4;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_ENVIRONMENT__NAME = ENVIRONMENT__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_ENVIRONMENT__DESCRIPTION = ENVIRONMENT__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Atmosphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_ENVIRONMENT__ATMOSPHERE = ENVIRONMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Gravity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_ENVIRONMENT__GRAVITY = ENVIRONMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Surface Environment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_ENVIRONMENT_FEATURE_COUNT = ENVIRONMENT_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Surface Environment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_ENVIRONMENT_OPERATION_COUNT = ENVIRONMENT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceEnvironmentImpl <em>Earth Surface Environment</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceEnvironmentImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarthSurfaceEnvironment()
	 * @generated
	 */
  int EARTH_SURFACE_ENVIRONMENT = 5;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_ENVIRONMENT__NAME = SURFACE_ENVIRONMENT__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_ENVIRONMENT__DESCRIPTION = SURFACE_ENVIRONMENT__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Atmosphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_ENVIRONMENT__ATMOSPHERE = SURFACE_ENVIRONMENT__ATMOSPHERE;

  /**
	 * The feature id for the '<em><b>Gravity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_ENVIRONMENT__GRAVITY = SURFACE_ENVIRONMENT__GRAVITY;

  /**
	 * The number of structural features of the '<em>Earth Surface Environment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_ENVIRONMENT_FEATURE_COUNT = SURFACE_ENVIRONMENT_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Earth Surface Environment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_ENVIRONMENT_OPERATION_COUNT = SURFACE_ENVIRONMENT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AtmosphereImpl <em>Atmosphere</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.AtmosphereImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAtmosphere()
	 * @generated
	 */
  int ATMOSPHERE = 6;

  /**
	 * The feature id for the '<em><b>Wind Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATMOSPHERE__WIND_SPEED = 0;

  /**
	 * The feature id for the '<em><b>Wind Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATMOSPHERE__WIND_DIRECTION = 1;

  /**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATMOSPHERE__TEMPERATURE = 2;

  /**
	 * The feature id for the '<em><b>Surface Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATMOSPHERE__SURFACE_PRESSURE = 3;

  /**
	 * The feature id for the '<em><b>Surface Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATMOSPHERE__SURFACE_DENSITY = 4;

  /**
	 * The number of structural features of the '<em>Atmosphere</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATMOSPHERE_FEATURE_COUNT = 5;

  /**
	 * The number of operations of the '<em>Atmosphere</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATMOSPHERE_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AtmosphereUtilsImpl <em>Atmosphere Utils</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.AtmosphereUtilsImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAtmosphereUtils()
	 * @generated
	 */
  int ATMOSPHERE_UTILS = 7;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EquatorialCoordinatesImpl <em>Equatorial Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EquatorialCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEquatorialCoordinates()
	 * @generated
	 */
  int EQUATORIAL_COORDINATES = 8;

  /**
	 * The feature id for the '<em><b>Right Ascension</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EQUATORIAL_COORDINATES__RIGHT_ASCENSION = 0;

  /**
	 * The feature id for the '<em><b>Declination</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EQUATORIAL_COORDINATES__DECLINATION = 1;

  /**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EQUATORIAL_COORDINATES__RADIUS = 2;

  /**
	 * The number of structural features of the '<em>Equatorial Coordinates</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EQUATORIAL_COORDINATES_FEATURE_COUNT = 3;

  /**
	 * The number of operations of the '<em>Equatorial Coordinates</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EQUATORIAL_COORDINATES_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.GeographicCoordinatesImpl <em>Geographic Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.GeographicCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getGeographicCoordinates()
	 * @generated
	 */
  int GEOGRAPHIC_COORDINATES = 9;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.HorizontalCoordinatesImpl <em>Horizontal Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.HorizontalCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getHorizontalCoordinates()
	 * @generated
	 */
  int HORIZONTAL_COORDINATES = 10;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EclipticCoordinatesImpl <em>Ecliptic Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EclipticCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEclipticCoordinates()
	 * @generated
	 */
  int ECLIPTIC_COORDINATES = 11;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl <em>Sky</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSky()
	 * @generated
	 */
  int SKY = 12;

  /**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY__TIME = ApogyCommonEMFPackage.TIMED__TIME;

  /**
	 * The feature id for the '<em><b>Surface Worksite</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY__SURFACE_WORKSITE = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Sky Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY__SKY_NODE = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Sun</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY__SUN = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Sun Horizontal Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY__SUN_HORIZONTAL_COORDINATES = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Star Field</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY__STAR_FIELD = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Sky</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY_FEATURE_COUNT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 5;

  /**
	 * The operation id for the '<em>Get Sun Angular Diameter</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY___GET_SUN_ANGULAR_DIAMETER = ApogyCommonEMFPackage.TIMED_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Sky</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY_OPERATION_COUNT = ApogyCommonEMFPackage.TIMED_OPERATION_COUNT + 1;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSkyImpl <em>Earth Sky</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthSkyImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarthSky()
	 * @generated
	 */
  int EARTH_SKY = 13;

  /**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY__TIME = SKY__TIME;

  /**
	 * The feature id for the '<em><b>Surface Worksite</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY__SURFACE_WORKSITE = SKY__SURFACE_WORKSITE;

  /**
	 * The feature id for the '<em><b>Sky Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY__SKY_NODE = SKY__SKY_NODE;

  /**
	 * The feature id for the '<em><b>Sun</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY__SUN = SKY__SUN;

  /**
	 * The feature id for the '<em><b>Sun Horizontal Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY__SUN_HORIZONTAL_COORDINATES = SKY__SUN_HORIZONTAL_COORDINATES;

  /**
	 * The feature id for the '<em><b>Star Field</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY__STAR_FIELD = SKY__STAR_FIELD;

  /**
	 * The feature id for the '<em><b>Moon</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY__MOON = SKY_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Moon Horizontal Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY__MOON_HORIZONTAL_COORDINATES = SKY_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Earth Sky</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_FEATURE_COUNT = SKY_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Get Sun Angular Diameter</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY___GET_SUN_ANGULAR_DIAMETER = SKY___GET_SUN_ANGULAR_DIAMETER;

  /**
	 * The operation id for the '<em>Get Moon Angular Diameter</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY___GET_MOON_ANGULAR_DIAMETER = SKY_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Earth Sky</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_OPERATION_COUNT = SKY_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SunImpl <em>Sun</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.SunImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSun()
	 * @generated
	 */
  int SUN = 14;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN__PARENT = ApogyCommonTopologyPackage.GROUP_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN__DESCRIPTION = ApogyCommonTopologyPackage.GROUP_NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN__NODE_ID = ApogyCommonTopologyPackage.GROUP_NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN__CHILDREN = ApogyCommonTopologyPackage.GROUP_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN__RADIUS = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Sun</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_FEATURE_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.GROUP_NODE___ACCEPT__INODEVISITOR;

  /**
	 * The operation id for the '<em>Get Irradiance</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN___GET_IRRADIANCE__DOUBLE = ApogyCommonTopologyPackage.GROUP_NODE_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Sun</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_OPERATION_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_OPERATION_COUNT + 1;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthImpl <em>Earth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarth()
	 * @generated
	 */
	int EARTH = 15;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__PARENT = ApogyCommonTopologyPackage.GROUP_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__DESCRIPTION = ApogyCommonTopologyPackage.GROUP_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__NODE_ID = ApogyCommonTopologyPackage.GROUP_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__CHILDREN = ApogyCommonTopologyPackage.GROUP_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__RADIUS = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Earth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_FEATURE_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.GROUP_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Earth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_OPERATION_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MoonImpl <em>Moon</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.MoonImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMoon()
	 * @generated
	 */
  int MOON = 16;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON__PARENT = ApogyCommonTopologyPackage.GROUP_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON__DESCRIPTION = ApogyCommonTopologyPackage.GROUP_NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON__NODE_ID = ApogyCommonTopologyPackage.GROUP_NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON__CHILDREN = ApogyCommonTopologyPackage.GROUP_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON__RADIUS = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Moon</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_FEATURE_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.GROUP_NODE___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Moon</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_OPERATION_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EnvironmentUtilitiesImpl <em>Environment Utilities</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EnvironmentUtilitiesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEnvironmentUtilities()
	 * @generated
	 */
  int ENVIRONMENT_UTILITIES = 17;

  /**
	 * The number of structural features of the '<em>Environment Utilities</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UTILITIES_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Convert To Julian Date</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UTILITIES___CONVERT_TO_JULIAN_DATE__DATE = 0;

  /**
	 * The operation id for the '<em>Parse Right Ascension</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UTILITIES___PARSE_RIGHT_ASCENSION__STRING = 1;

  /**
	 * The operation id for the '<em>Parse Deg Min Sec</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UTILITIES___PARSE_DEG_MIN_SEC__STRING = 2;

  /**
	 * The operation id for the '<em>Sort By Magnitude</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UTILITIES___SORT_BY_MAGNITUDE__LIST = 3;

  /**
	 * The number of operations of the '<em>Environment Utilities</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UTILITIES_OPERATION_COUNT = 4;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getApogyCoreEnvironmentFacade()
	 * @generated
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE = 18;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Create And Initialize Stars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_STARS = 0;

		/**
	 * The operation id for the '<em>Create And Initialize Default CSA Worksite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_DEFAULT_CSA_WORKSITE = 1;

		/**
	 * The operation id for the '<em>Initialize Sky Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___INITIALIZE_SKY_NODE__SKY_SKYNODE = 2;

		/**
	 * The operation id for the '<em>Initialize Earth Sky Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___INITIALIZE_EARTH_SKY_NODE__EARTHSKY_EARTHSKYNODE = 3;

		/**
	 * The operation id for the '<em>Get Mars Yard Geographical Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_MARS_YARD_GEOGRAPHICAL_COORDINATES = 4;

		/**
	 * The operation id for the '<em>Create Star</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___CREATE_STAR__FLOAT_DOUBLE_DOUBLE = 5;

		/**
	 * The operation id for the '<em>Get Mars Yard Transform Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_MARS_YARD_TRANSFORM_NODE = 6;

		/**
	 * The operation id for the '<em>Create And Initialize Earth Surface Environment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_EARTH_SURFACE_ENVIRONMENT = 7;

		/**
	 * The operation id for the '<em>Create And Initialize Earth Atmosphere</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_EARTH_ATMOSPHERE = 8;

		/**
	 * The operation id for the '<em>Get Sun Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__APOGYSYSTEM_STRING_ENVIRONMENT = 9;

		/**
	 * The operation id for the '<em>Get Sun Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__NODE_ENVIRONMENT = 10;

		/**
	 * The operation id for the '<em>Get Moon Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_MOON_VECTOR__APOGYSYSTEM_STRING_ENVIRONMENT = 11;

		/**
	 * The operation id for the '<em>Get Moon Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_MOON_VECTOR__NODE_ENVIRONMENT = 12;

		/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__NODE_APOGYSYSTEM_CONNECTIONPOINT_ENVIRONMENT = 13;

		/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_APOGYSYSTEM_CONNECTIONPOINT_ENVIRONMENT = 14;

		/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_APOGYSYSTEM_STRING_ENVIRONMENT = 15;

		/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_STRING_STRING_ENVIRONMENT = 16;

		/**
	 * The operation id for the '<em>Create EImage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___CREATE_EIMAGE__LIST = 17;

		/**
	 * The operation id for the '<em>Get Absolute Rectangular Region Corners</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_ABSOLUTE_RECTANGULAR_REGION_CORNERS__RECTANGULARREGION = 18;

		/**
	 * The operation id for the '<em>Get Best Resolution Rectangular Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_RECTANGULAR_REGION_IMAGE__LIST = 19;

		/**
	 * The operation id for the '<em>Get Rectangular Region Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__RECTANGULARREGIONPROVIDER_TUPLE3D_TUPLE3D = 20;

		/**
	 * The operation id for the '<em>Get Rectangular Region Image Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__RECTANGULARREGIONIMAGE_TUPLE3D_TUPLE3D = 21;

		/**
	 * The operation id for the '<em>Get Rectangular Region Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__LIST_TUPLE3D_TUPLE3D = 22;

		/**
	 * The operation id for the '<em>Get Rectangular Region Image Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__LIST_TUPLE3D_TUPLE3D = 23;

		/**
	 * The operation id for the '<em>Fits Inside</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___FITS_INSIDE__RECTANGULARREGION_RECTANGULARREGION = 24;

		/**
	 * The operation id for the '<em>Intersects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___INTERSECTS__RECTANGULARREGION_RECTANGULARREGION_MATRIX4X4 = 25;

		/**
	 * The operation id for the '<em>Get Image Map Layer Presentation Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__IMAGEMAPLAYERPRESENTATION_TUPLE3D_TUPLE3D = 26;

		/**
	 * The operation id for the '<em>Get Image Map Layer Presentation Extent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__LIST_TUPLE3D_TUPLE3D = 27;

		/**
	 * The operation id for the '<em>Get Image Map Layer Presentation Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__LIST = 28;

		/**
	 * The operation id for the '<em>Get Best Resolution Map Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_MAP_LAYER__LIST = 29;

		/**
	 * The operation id for the '<em>Get Visible Image Map Layer Presentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_VISIBLE_IMAGE_MAP_LAYER_PRESENTATION__LIST = 30;

		/**
	 * The operation id for the '<em>Get Rectangular Volume Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_VOLUME_REGION__CARTESIANTRIANGULARMESH = 31;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE_OPERATION_COUNT = 32;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.StarImpl <em>Star</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.StarImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getStar()
	 * @generated
	 */
  int STAR = 19;

  /**
	 * The feature id for the '<em><b>Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR__MAGNITUDE = 0;

  /**
	 * The feature id for the '<em><b>Equatorial Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR__EQUATORIAL_COORDINATES = 1;

  /**
	 * The number of structural features of the '<em>Star</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FEATURE_COUNT = 2;

  /**
	 * The number of operations of the '<em>Star</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_OPERATION_COUNT = 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.StarFieldImpl <em>Star Field</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.StarFieldImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getStarField()
	 * @generated
	 */
  int STAR_FIELD = 20;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD__PARENT = ApogyCommonTopologyPackage.NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD__DESCRIPTION = ApogyCommonTopologyPackage.NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD__NODE_ID = ApogyCommonTopologyPackage.NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Stars</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD__STARS = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Star Field File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD__STAR_FIELD_FILE_NAME = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Star Field</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_FEATURE_COUNT = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.NODE___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Star Field</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_OPERATION_COUNT = ApogyCommonTopologyPackage.NODE_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AstronomyUtilsImpl <em>Astronomy Utils</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.AstronomyUtilsImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAstronomyUtils()
	 * @generated
	 */
  int ASTRONOMY_UTILS = 21;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.MapImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMap()
	 * @generated
	 */
  int MAP = 22;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP__NAME = ApogyCommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP__TRANSFORMATION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP__LAYERS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Map Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP__MAP_NODE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

  /**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MapsListImpl <em>Maps List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.MapsListImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMapsList()
	 * @generated
	 */
  int MAPS_LIST = 23;

  /**
	 * The feature id for the '<em><b>Maps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST__MAPS = 0;

  /**
	 * The feature id for the '<em><b>Maps List Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST__MAPS_LIST_NODE = 1;

  /**
	 * The number of structural features of the '<em>Maps List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST_FEATURE_COUNT = 2;

  /**
	 * The number of operations of the '<em>Maps List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerImpl <em>Abstract Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractMapLayer()
	 * @generated
	 */
  int ABSTRACT_MAP_LAYER = 24;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER__NAME = ApogyCommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER__MAP = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Abstract Map Layer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Abstract Map Layer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MapLayerPresentationImpl <em>Map Layer Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.MapLayerPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMapLayerPresentation()
	 * @generated
	 */
	int MAP_LAYER_PRESENTATION = 25;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION__NAME = ApogyCommonEMFPackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION__VISIBLE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION__MAP_LAYER = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

		/**
	 * The number of operations of the '<em>Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_LAYER_PRESENTATION_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.URLMapLayerImpl <em>URL Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.URLMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getURLMapLayer()
	 * @generated
	 */
  int URL_MAP_LAYER = 26;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_MAP_LAYER__NAME = ABSTRACT_MAP_LAYER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_MAP_LAYER__DESCRIPTION = ABSTRACT_MAP_LAYER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_MAP_LAYER__MAP = ABSTRACT_MAP_LAYER__MAP;

  /**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

  /**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_MAP_LAYER__URL = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>URL Map Layer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_MAP_LAYER_FEATURE_COUNT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>URL Map Layer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_MAP_LAYER_OPERATION_COUNT = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.RegionImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRegion()
	 * @generated
	 */
  int REGION = 27;

  /**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGION__TRANSFORMATION = 0;

  /**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGION_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REGION_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.RectangularRegionImpl <em>Rectangular Region</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.RectangularRegionImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRectangularRegion()
	 * @generated
	 */
  int RECTANGULAR_REGION = 28;

  /**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION__TRANSFORMATION = REGION__TRANSFORMATION;

  /**
	 * The feature id for the '<em><b>XMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION__XMIN = REGION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>XMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION__XMAX = REGION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>YMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION__YMIN = REGION_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>YMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION__YMAX = REGION_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION__XDIMENSION = REGION_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION__YDIMENSION = REGION_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Lower Left Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION__LOWER_LEFT_CORNER = REGION_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Upper Left Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION__UPPER_LEFT_CORNER = REGION_FEATURE_COUNT + 7;

  /**
	 * The feature id for the '<em><b>Lower Right Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION__LOWER_RIGHT_CORNER = REGION_FEATURE_COUNT + 8;

  /**
	 * The feature id for the '<em><b>Upper Right Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION__UPPER_RIGHT_CORNER = REGION_FEATURE_COUNT + 9;

  /**
	 * The number of structural features of the '<em>Rectangular Region</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION_FEATURE_COUNT = REGION_FEATURE_COUNT + 10;

  /**
	 * The number of operations of the '<em>Rectangular Region</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION_OPERATION_COUNT = REGION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.RectangularVolumeRegionImpl <em>Rectangular Volume Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.RectangularVolumeRegionImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRectangularVolumeRegion()
	 * @generated
	 */
	int RECTANGULAR_VOLUME_REGION = 29;

		/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__TRANSFORMATION = RECTANGULAR_REGION__TRANSFORMATION;

		/**
	 * The feature id for the '<em><b>XMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__XMIN = RECTANGULAR_REGION__XMIN;

		/**
	 * The feature id for the '<em><b>XMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__XMAX = RECTANGULAR_REGION__XMAX;

		/**
	 * The feature id for the '<em><b>YMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__YMIN = RECTANGULAR_REGION__YMIN;

		/**
	 * The feature id for the '<em><b>YMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__YMAX = RECTANGULAR_REGION__YMAX;

		/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__XDIMENSION = RECTANGULAR_REGION__XDIMENSION;

		/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__YDIMENSION = RECTANGULAR_REGION__YDIMENSION;

		/**
	 * The feature id for the '<em><b>Lower Left Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__LOWER_LEFT_CORNER = RECTANGULAR_REGION__LOWER_LEFT_CORNER;

		/**
	 * The feature id for the '<em><b>Upper Left Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__UPPER_LEFT_CORNER = RECTANGULAR_REGION__UPPER_LEFT_CORNER;

		/**
	 * The feature id for the '<em><b>Lower Right Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__LOWER_RIGHT_CORNER = RECTANGULAR_REGION__LOWER_RIGHT_CORNER;

		/**
	 * The feature id for the '<em><b>Upper Right Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__UPPER_RIGHT_CORNER = RECTANGULAR_REGION__UPPER_RIGHT_CORNER;

		/**
	 * The feature id for the '<em><b>ZMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__ZMIN = RECTANGULAR_REGION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>ZMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__ZMAX = RECTANGULAR_REGION_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>ZDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION__ZDIMENSION = RECTANGULAR_REGION_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Rectangular Volume Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION_FEATURE_COUNT = RECTANGULAR_REGION_FEATURE_COUNT + 3;

		/**
	 * The number of operations of the '<em>Rectangular Volume Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_VOLUME_REGION_OPERATION_COUNT = RECTANGULAR_REGION_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider <em>Rectangular Region Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRectangularRegionProvider()
	 * @generated
	 */
	int RECTANGULAR_REGION_PROVIDER = 30;

		/**
	 * The number of structural features of the '<em>Rectangular Region Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_PROVIDER_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_PROVIDER___GET_REGION = 0;

		/**
	 * The number of operations of the '<em>Rectangular Region Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_REGION_PROVIDER_OPERATION_COUNT = 1;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage <em>Rectangular Region Image</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRectangularRegionImage()
	 * @generated
	 */
  int RECTANGULAR_REGION_IMAGE = 31;

  /**
	 * The number of structural features of the '<em>Rectangular Region Image</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION_IMAGE_FEATURE_COUNT = RECTANGULAR_REGION_PROVIDER_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION_IMAGE___GET_REGION = RECTANGULAR_REGION_PROVIDER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION_IMAGE___GET_REGION_IMAGE = RECTANGULAR_REGION_PROVIDER_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION_IMAGE___GET_RESOLUTION = RECTANGULAR_REGION_PROVIDER_OPERATION_COUNT + 1;

  /**
	 * The number of operations of the '<em>Rectangular Region Image</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECTANGULAR_REGION_IMAGE_OPERATION_COUNT = RECTANGULAR_REGION_PROVIDER_OPERATION_COUNT + 2;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.ImageMapLayerImpl <em>Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getImageMapLayer()
	 * @generated
	 */
  int IMAGE_MAP_LAYER = 32;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER__NAME = ABSTRACT_MAP_LAYER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER__DESCRIPTION = ABSTRACT_MAP_LAYER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER__MAP = ABSTRACT_MAP_LAYER__MAP;

  /**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

  /**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER__WIDTH = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER__HEIGHT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER__OPAQUE = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER__IMAGE = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER__LEGEND = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER__RESOLUTION = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER_FEATURE_COUNT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 6;

  /**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER___GET_REGION = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER___GET_REGION_IMAGE = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 1;

  /**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER___GET_RESOLUTION = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 2;

  /**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 3;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 4;

		/**
	 * The number of operations of the '<em>Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_MAP_LAYER_OPERATION_COUNT = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 5;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.ImageMapLayerPresentationImpl <em>Image Map Layer Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ImageMapLayerPresentationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getImageMapLayerPresentation()
	 * @generated
	 */
	int IMAGE_MAP_LAYER_PRESENTATION = 33;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION__NAME = MAP_LAYER_PRESENTATION__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION__DESCRIPTION = MAP_LAYER_PRESENTATION__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION__VISIBLE = MAP_LAYER_PRESENTATION__VISIBLE;

		/**
	 * The feature id for the '<em><b>Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION__MAP_LAYER = MAP_LAYER_PRESENTATION__MAP_LAYER;

		/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION__ALPHA = MAP_LAYER_PRESENTATION_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Image Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION_FEATURE_COUNT = MAP_LAYER_PRESENTATION_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION___GET_REGION = MAP_LAYER_PRESENTATION_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION___GET_REGION_IMAGE = MAP_LAYER_PRESENTATION_OPERATION_COUNT + 1;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION___GET_RESOLUTION = MAP_LAYER_PRESENTATION_OPERATION_COUNT + 2;

		/**
	 * The operation id for the '<em>Get Image Map Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION___GET_IMAGE_MAP_LAYER = MAP_LAYER_PRESENTATION_OPERATION_COUNT + 3;

		/**
	 * The number of operations of the '<em>Image Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MAP_LAYER_PRESENTATION_OPERATION_COUNT = MAP_LAYER_PRESENTATION_OPERATION_COUNT + 4;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.URLImageMapLayerImpl <em>URL Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.URLImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getURLImageMapLayer()
	 * @generated
	 */
  int URL_IMAGE_MAP_LAYER = 34;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__NAME = IMAGE_MAP_LAYER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__DESCRIPTION = IMAGE_MAP_LAYER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__MAP = IMAGE_MAP_LAYER__MAP;

  /**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

  /**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__WIDTH = IMAGE_MAP_LAYER__WIDTH;

  /**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__HEIGHT = IMAGE_MAP_LAYER__HEIGHT;

  /**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__OPAQUE = IMAGE_MAP_LAYER__OPAQUE;

  /**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__IMAGE = IMAGE_MAP_LAYER__IMAGE;

  /**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__LEGEND = IMAGE_MAP_LAYER__LEGEND;

  /**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__RESOLUTION = IMAGE_MAP_LAYER__RESOLUTION;

  /**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__URL = IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Legend URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER__LEGEND_URL = IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>URL Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER_FEATURE_COUNT = IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER___GET_REGION = IMAGE_MAP_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER___GET_REGION_IMAGE = IMAGE_MAP_LAYER___GET_REGION_IMAGE;

  /**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER___GET_RESOLUTION = IMAGE_MAP_LAYER___GET_RESOLUTION;

  /**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The number of operations of the '<em>URL Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int URL_IMAGE_MAP_LAYER_OPERATION_COUNT = IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.TopologyTreeMapLayerImpl <em>Topology Tree Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.TopologyTreeMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getTopologyTreeMapLayer()
	 * @generated
	 */
	int TOPOLOGY_TREE_MAP_LAYER = 35;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER__NAME = ABSTRACT_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER__DESCRIPTION = ABSTRACT_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER__MAP = ABSTRACT_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Topology Tree Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Topology Tree Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_FEATURE_COUNT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The number of operations of the '<em>Topology Tree Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_OPERATION_COUNT = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.TopologyTreeMapLayerNodeImpl <em>Topology Tree Map Layer Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.TopologyTreeMapLayerNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getTopologyTreeMapLayerNode()
	 * @generated
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE = 36;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshMapLayerImpl <em>Cartesian Triangular Mesh Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = 37;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshDerivedImageMapLayerImpl <em>Cartesian Triangular Mesh Derived Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshDerivedImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshDerivedImageMapLayer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER = 38;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshSlopeImageMapLayerImpl <em>Cartesian Triangular Mesh Slope Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshSlopeImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshSlopeImageMapLayer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER = 39;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl <em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshDiscreteSlopeImageMapLayer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER = 40;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshHeightImageMapLayerImpl <em>Cartesian Triangular Mesh Height Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshHeightImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshHeightImageMapLayer()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER = 41;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.LineOfSightImageMapLayerImpl <em>Line Of Sight Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.LineOfSightImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getLineOfSightImageMapLayer()
	 * @generated
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER = 43;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SlopeRangeImpl <em>Slope Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.SlopeRangeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSlopeRange()
	 * @generated
	 */
	int SLOPE_RANGE = 42;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.BasicCartesianTriangularMeshMapLayerImpl <em>Basic Cartesian Triangular Mesh Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.BasicCartesianTriangularMeshMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getBasicCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = 50;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshURLMapLayerImpl <em>Cartesian Triangular Mesh URL Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshURLMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshURLMapLayer()
	 * @generated
	 */
  int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER = 51;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.FeaturesOfInterestMapLayerImpl <em>Features Of Interest Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.FeaturesOfInterestMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getFeaturesOfInterestMapLayer()
	 * @generated
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER = 52;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteNodeImpl <em>Worksite Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.WorksiteNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getWorksiteNode()
	 * @generated
	 */
  int WORKSITE_NODE = 53;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SurfaceWorksiteNodeImpl <em>Surface Worksite Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.SurfaceWorksiteNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSurfaceWorksiteNode()
	 * @generated
	 */
  int SURFACE_WORKSITE_NODE = 54;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceWorksiteNodeImpl <em>Earth Surface Worksite Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceWorksiteNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarthSurfaceWorksiteNode()
	 * @generated
	 */
  int EARTH_SURFACE_WORKSITE_NODE = 55;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MapsListNodeImpl <em>Maps List Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.MapsListNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMapsListNode()
	 * @generated
	 */
  int MAPS_LIST_NODE = 56;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MapNodeImpl <em>Map Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.MapNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMapNode()
	 * @generated
	 */
  int MAP_NODE = 57;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerNodeImpl <em>Abstract Map Layer Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractMapLayerNode()
	 * @generated
	 */
  int ABSTRACT_MAP_LAYER_NODE = 58;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

		/**
	 * The feature id for the '<em><b>Topology Tree Map Layer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Transient Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Topology Tree Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 2;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Topology Tree Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_TREE_MAP_LAYER_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__NAME = ABSTRACT_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__DESCRIPTION = ABSTRACT_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP = ABSTRACT_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Mesh Is Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Map Layer Presentations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Texture Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 4;

		/**
	 * The operation id for the '<em>Get Current Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Force Update Texture Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 1;

		/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_OPERATION_COUNT = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__NAME = IMAGE_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__DESCRIPTION = IMAGE_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__MAP = IMAGE_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__WIDTH = IMAGE_MAP_LAYER__WIDTH;

		/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__HEIGHT = IMAGE_MAP_LAYER__HEIGHT;

		/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__OPAQUE = IMAGE_MAP_LAYER__OPAQUE;

		/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__IMAGE = IMAGE_MAP_LAYER__IMAGE;

		/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__LEGEND = IMAGE_MAP_LAYER__LEGEND;

		/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__RESOLUTION = IMAGE_MAP_LAYER__RESOLUTION;

		/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Derived Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT = IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION = IMAGE_MAP_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION_IMAGE = IMAGE_MAP_LAYER___GET_REGION_IMAGE;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_RESOLUTION = IMAGE_MAP_LAYER___GET_RESOLUTION;

		/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Derived Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_OPERATION_COUNT = IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__WIDTH = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__WIDTH;

		/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__HEIGHT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__HEIGHT;

		/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__OPAQUE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__OPAQUE;

		/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__IMAGE;

		/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__LEGEND = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__LEGEND;

		/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__RESOLUTION;

		/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

		/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER;

		/**
	 * The feature id for the '<em><b>Auto Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Minimum Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Maximum Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Slope Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 3;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_RESOLUTION;

		/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Slope Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__WIDTH = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__WIDTH;

		/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__HEIGHT = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__HEIGHT;

		/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__OPAQUE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__OPAQUE;

		/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__IMAGE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__IMAGE;

		/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__LEGEND = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__LEGEND;

		/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__RESOLUTION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__RESOLUTION;

		/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

		/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER;

		/**
	 * The feature id for the '<em><b>Auto Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE;

		/**
	 * The feature id for the '<em><b>Minimum Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE;

		/**
	 * The feature id for the '<em><b>Maximum Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE;

		/**
	 * The feature id for the '<em><b>Slope Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER___GET_REGION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER___GET_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_RESOLUTION;

		/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__WIDTH = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__WIDTH;

		/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__HEIGHT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__HEIGHT;

		/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__OPAQUE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__OPAQUE;

		/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__IMAGE;

		/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__LEGEND = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__LEGEND;

		/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__RESOLUTION;

		/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

		/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER;

		/**
	 * The feature id for the '<em><b>Auto Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Minimum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Maximum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Height Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 3;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER___GET_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER___GET_REGION_IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER___GET_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_RESOLUTION;

		/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Height Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE__NAME = ApogyCommonEMFPackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Slope Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE__SLOPE_LOWER_BOUND = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Slope Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE__SLOPE_UPPER_BOUND = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE__COLOR = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>Slope Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

		/**
	 * The number of operations of the '<em>Slope Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOPE_RANGE_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__WIDTH = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__WIDTH;

		/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__HEIGHT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__HEIGHT;

		/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__OPAQUE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__OPAQUE;

		/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__IMAGE;

		/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__LEGEND = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__LEGEND;

		/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__RESOLUTION;

		/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

		/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER;

		/**
	 * The feature id for the '<em><b>Line Of Sight Available Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Line Of Sight Not Available Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Observer Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Target Height Above Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Use Height Perpendicular To Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 4;

		/**
	 * The number of structural features of the '<em>Line Of Sight Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_FEATURE_COUNT + 5;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_REGION_IMAGE = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_RESOLUTION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_RESOLUTION;

		/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The number of operations of the '<em>Line Of Sight Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OF_SIGHT_IMAGE_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractShapeImageLayerImpl <em>Abstract Shape Image Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractShapeImageLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractShapeImageLayer()
	 * @generated
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER = 44;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__NAME = IMAGE_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__DESCRIPTION = IMAGE_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__MAP = IMAGE_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE = IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__WIDTH = IMAGE_MAP_LAYER__WIDTH;

		/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__HEIGHT = IMAGE_MAP_LAYER__HEIGHT;

		/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__OPAQUE = IMAGE_MAP_LAYER__OPAQUE;

		/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__IMAGE = IMAGE_MAP_LAYER__IMAGE;

		/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__LEGEND = IMAGE_MAP_LAYER__LEGEND;

		/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__RESOLUTION = IMAGE_MAP_LAYER__RESOLUTION;

		/**
	 * The feature id for the '<em><b>Shaped Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED = IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__COLOR = IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION = IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Abstract Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT = IMAGE_MAP_LAYER_FEATURE_COUNT + 3;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION = IMAGE_MAP_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE = IMAGE_MAP_LAYER___GET_REGION_IMAGE;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER___GET_RESOLUTION = IMAGE_MAP_LAYER___GET_RESOLUTION;

		/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION = IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The number of operations of the '<em>Abstract Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHAPE_IMAGE_LAYER_OPERATION_COUNT = IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EllipseShapeImageLayerImpl <em>Ellipse Shape Image Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EllipseShapeImageLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEllipseShapeImageLayer()
	 * @generated
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER = 45;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__NAME = ABSTRACT_SHAPE_IMAGE_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__DESCRIPTION = ABSTRACT_SHAPE_IMAGE_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__MAP = ABSTRACT_SHAPE_IMAGE_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__WIDTH = ABSTRACT_SHAPE_IMAGE_LAYER__WIDTH;

		/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__HEIGHT = ABSTRACT_SHAPE_IMAGE_LAYER__HEIGHT;

		/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__OPAQUE = ABSTRACT_SHAPE_IMAGE_LAYER__OPAQUE;

		/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER__IMAGE;

		/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__LEGEND = ABSTRACT_SHAPE_IMAGE_LAYER__LEGEND;

		/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__RESOLUTION;

		/**
	 * The feature id for the '<em><b>Shaped Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__SHAPED_FILLED = ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED;

		/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__COLOR = ABSTRACT_SHAPE_IMAGE_LAYER__COLOR;

		/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION;

		/**
	 * The feature id for the '<em><b>Ellipse Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_WIDTH = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Ellipse Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_HEIGHT = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Show Center Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Ellipse Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER_FEATURE_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 3;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER___GET_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER___GET_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_RESOLUTION;

		/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = ABSTRACT_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The number of operations of the '<em>Ellipse Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_SHAPE_IMAGE_LAYER_OPERATION_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.RectangleShapeImageLayerImpl <em>Rectangle Shape Image Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.RectangleShapeImageLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRectangleShapeImageLayer()
	 * @generated
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER = 46;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__NAME = ABSTRACT_SHAPE_IMAGE_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__DESCRIPTION = ABSTRACT_SHAPE_IMAGE_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__MAP = ABSTRACT_SHAPE_IMAGE_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__WIDTH = ABSTRACT_SHAPE_IMAGE_LAYER__WIDTH;

		/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__HEIGHT = ABSTRACT_SHAPE_IMAGE_LAYER__HEIGHT;

		/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__OPAQUE = ABSTRACT_SHAPE_IMAGE_LAYER__OPAQUE;

		/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER__IMAGE;

		/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__LEGEND = ABSTRACT_SHAPE_IMAGE_LAYER__LEGEND;

		/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__RESOLUTION;

		/**
	 * The feature id for the '<em><b>Shaped Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__SHAPED_FILLED = ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED;

		/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__COLOR = ABSTRACT_SHAPE_IMAGE_LAYER__COLOR;

		/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION;

		/**
	 * The feature id for the '<em><b>Rectangle Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Rectangle Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Show Center Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Rectangle Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER_FEATURE_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 3;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER___GET_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER___GET_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_RESOLUTION;

		/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = ABSTRACT_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The number of operations of the '<em>Rectangle Shape Image Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_SHAPE_IMAGE_LAYER_OPERATION_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.PolygonShapeImageMapLayerImpl <em>Polygon Shape Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.PolygonShapeImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getPolygonShapeImageMapLayer()
	 * @generated
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER = 47;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__NAME = ABSTRACT_SHAPE_IMAGE_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__DESCRIPTION = ABSTRACT_SHAPE_IMAGE_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__MAP = ABSTRACT_SHAPE_IMAGE_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_SHAPE_IMAGE_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__WIDTH = ABSTRACT_SHAPE_IMAGE_LAYER__WIDTH;

		/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__HEIGHT = ABSTRACT_SHAPE_IMAGE_LAYER__HEIGHT;

		/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__OPAQUE = ABSTRACT_SHAPE_IMAGE_LAYER__OPAQUE;

		/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER__IMAGE;

		/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__LEGEND = ABSTRACT_SHAPE_IMAGE_LAYER__LEGEND;

		/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__RESOLUTION;

		/**
	 * The feature id for the '<em><b>Shaped Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__SHAPED_FILLED = ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED;

		/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__COLOR = ABSTRACT_SHAPE_IMAGE_LAYER__COLOR;

		/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION;

		/**
	 * The number of structural features of the '<em>Polygon Shape Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER_FEATURE_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE = ABSTRACT_SHAPE_IMAGE_LAYER___GET_REGION_IMAGE;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_RESOLUTION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_RESOLUTION;

		/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = ABSTRACT_SHAPE_IMAGE_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = ABSTRACT_SHAPE_IMAGE_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The operation id for the '<em>Get Vertices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES = ABSTRACT_SHAPE_IMAGE_LAYER_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Polygon Shape Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_SHAPE_IMAGE_MAP_LAYER_OPERATION_COUNT = ABSTRACT_SHAPE_IMAGE_LAYER_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianCoordinatesPolygonShapeImageMapLayerImpl <em>Cartesian Coordinates Polygon Shape Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianCoordinatesPolygonShapeImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianCoordinatesPolygonShapeImageMapLayer()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER = 48;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__NAME = POLYGON_SHAPE_IMAGE_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__DESCRIPTION = POLYGON_SHAPE_IMAGE_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__MAP = POLYGON_SHAPE_IMAGE_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = POLYGON_SHAPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__WIDTH = POLYGON_SHAPE_IMAGE_MAP_LAYER__WIDTH;

		/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__HEIGHT = POLYGON_SHAPE_IMAGE_MAP_LAYER__HEIGHT;

		/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__OPAQUE = POLYGON_SHAPE_IMAGE_MAP_LAYER__OPAQUE;

		/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__IMAGE = POLYGON_SHAPE_IMAGE_MAP_LAYER__IMAGE;

		/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__LEGEND = POLYGON_SHAPE_IMAGE_MAP_LAYER__LEGEND;

		/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__RESOLUTION = POLYGON_SHAPE_IMAGE_MAP_LAYER__RESOLUTION;

		/**
	 * The feature id for the '<em><b>Shaped Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__SHAPED_FILLED = POLYGON_SHAPE_IMAGE_MAP_LAYER__SHAPED_FILLED;

		/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__COLOR = POLYGON_SHAPE_IMAGE_MAP_LAYER__COLOR;

		/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = POLYGON_SHAPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

		/**
	 * The feature id for the '<em><b>Polygon Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES = POLYGON_SHAPE_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Cartesian Coordinates Polygon Shape Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER_FEATURE_COUNT = POLYGON_SHAPE_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_RESOLUTION = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_RESOLUTION;

		/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = POLYGON_SHAPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The operation id for the '<em>Get Vertices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES;

		/**
	 * The number of operations of the '<em>Cartesian Coordinates Polygon Shape Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER_OPERATION_COUNT = POLYGON_SHAPE_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.GeographicCoordinatesPolygonShapeImageMapLayerImpl <em>Geographic Coordinates Polygon Shape Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.GeographicCoordinatesPolygonShapeImageMapLayerImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getGeographicCoordinatesPolygonShapeImageMapLayer()
	 * @generated
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER = 49;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__NAME = POLYGON_SHAPE_IMAGE_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__DESCRIPTION = POLYGON_SHAPE_IMAGE_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__MAP = POLYGON_SHAPE_IMAGE_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = POLYGON_SHAPE_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__WIDTH = POLYGON_SHAPE_IMAGE_MAP_LAYER__WIDTH;

		/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__HEIGHT = POLYGON_SHAPE_IMAGE_MAP_LAYER__HEIGHT;

		/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__OPAQUE = POLYGON_SHAPE_IMAGE_MAP_LAYER__OPAQUE;

		/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__IMAGE = POLYGON_SHAPE_IMAGE_MAP_LAYER__IMAGE;

		/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__LEGEND = POLYGON_SHAPE_IMAGE_MAP_LAYER__LEGEND;

		/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__RESOLUTION = POLYGON_SHAPE_IMAGE_MAP_LAYER__RESOLUTION;

		/**
	 * The feature id for the '<em><b>Shaped Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__SHAPED_FILLED = POLYGON_SHAPE_IMAGE_MAP_LAYER__SHAPED_FILLED;

		/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__COLOR = POLYGON_SHAPE_IMAGE_MAP_LAYER__COLOR;

		/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = POLYGON_SHAPE_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

		/**
	 * The feature id for the '<em><b>Polygon Vertices Geographic Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES_GEOGRAPHIC_COORDINATES = POLYGON_SHAPE_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Geographic Coordinates Polygon Shape Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER_FEATURE_COUNT = POLYGON_SHAPE_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION;

		/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

		/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_RESOLUTION = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_RESOLUTION;

		/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = POLYGON_SHAPE_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

		/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

		/**
	 * The operation id for the '<em>Get Vertices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES = POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES;

		/**
	 * The number of operations of the '<em>Geographic Coordinates Polygon Shape Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER_OPERATION_COUNT = POLYGON_SHAPE_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Mesh Is Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY;

		/**
	 * The feature id for the '<em><b>Map Layer Presentations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS;

		/**
	 * The feature id for the '<em><b>Texture Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE;

		/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Basic Cartesian Triangular Mesh Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Get Current Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH;

		/**
	 * The operation id for the '<em>Force Update Texture Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE;

		/**
	 * The number of operations of the '<em>Basic Cartesian Triangular Mesh Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__NAME = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__DESCRIPTION = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MAP = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Mesh Is Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH_IS_DIRTY = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY;

		/**
	 * The feature id for the '<em><b>Map Layer Presentations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MAP_LAYER_PRESENTATIONS = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS;

		/**
	 * The feature id for the '<em><b>Texture Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__TEXTURE_IMAGE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE;

		/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__URL = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh URL Map Layer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER_FEATURE_COUNT = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_FEATURE_COUNT + 2;

		/**
	 * The operation id for the '<em>Get Current Mesh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER___GET_CURRENT_MESH = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH;

		/**
	 * The operation id for the '<em>Force Update Texture Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE;

		/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh URL Map Layer</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER_OPERATION_COUNT = CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER__NAME = ABSTRACT_MAP_LAYER__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER__DESCRIPTION = ABSTRACT_MAP_LAYER__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER__MAP = ABSTRACT_MAP_LAYER__MAP;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

		/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER__FEATURES = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Features Of Interest Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_FEATURE_COUNT = ABSTRACT_MAP_LAYER_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER___GET_REGION = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Features Of Interest Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_OPERATION_COUNT = ABSTRACT_MAP_LAYER_OPERATION_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_NODE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_NODE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_NODE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_NODE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITE_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

		/**
	 * The feature id for the '<em><b>Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_NODE__WORKSITE = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Worksite Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Worksite Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE_NODE__PARENT = WORKSITE_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE_NODE__DESCRIPTION = WORKSITE_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE_NODE__NODE_ID = WORKSITE_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE_NODE__CHILDREN = WORKSITE_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_WORKSITE_NODE__AGGREGATED_CHILDREN = WORKSITE_NODE__AGGREGATED_CHILDREN;

		/**
	 * The feature id for the '<em><b>Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE_NODE__WORKSITE = WORKSITE_NODE__WORKSITE;

		/**
	 * The number of structural features of the '<em>Surface Worksite Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE_NODE_FEATURE_COUNT = WORKSITE_NODE_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE_NODE___ACCEPT__INODEVISITOR = WORKSITE_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Surface Worksite Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SURFACE_WORKSITE_NODE_OPERATION_COUNT = WORKSITE_NODE_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_NODE__PARENT = SURFACE_WORKSITE_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_NODE__DESCRIPTION = SURFACE_WORKSITE_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_NODE__NODE_ID = SURFACE_WORKSITE_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_NODE__CHILDREN = SURFACE_WORKSITE_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_NODE__AGGREGATED_CHILDREN = SURFACE_WORKSITE_NODE__AGGREGATED_CHILDREN;

		/**
	 * The feature id for the '<em><b>Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_NODE__WORKSITE = SURFACE_WORKSITE_NODE__WORKSITE;

		/**
	 * The feature id for the '<em><b>Sky Transform Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_NODE__SKY_TRANSFORM_NODE = SURFACE_WORKSITE_NODE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Earth Surface Worksite Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_NODE_FEATURE_COUNT = SURFACE_WORKSITE_NODE_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_NODE___ACCEPT__INODEVISITOR = SURFACE_WORKSITE_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Earth Surface Worksite Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_NODE_OPERATION_COUNT = SURFACE_WORKSITE_NODE_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST_NODE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST_NODE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST_NODE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST_NODE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPS_LIST_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

		/**
	 * The feature id for the '<em><b>Maps List</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST_NODE__MAPS_LIST = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Maps List Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Maps List Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAPS_LIST_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE__PARENT = ApogyCommonTopologyPackage.TRANSFORM_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE__DESCRIPTION = ApogyCommonTopologyPackage.TRANSFORM_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE__NODE_ID = ApogyCommonTopologyPackage.TRANSFORM_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE__CHILDREN = ApogyCommonTopologyPackage.TRANSFORM_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.TRANSFORM_NODE__AGGREGATED_CHILDREN;

		/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE__POSITION = ApogyCommonTopologyPackage.TRANSFORM_NODE__POSITION;

		/**
	 * The feature id for the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE__ROTATION_MATRIX = ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX;

		/**
	 * The feature id for the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE__MAP = ApogyCommonTopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Map Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.TRANSFORM_NODE_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.TRANSFORM_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE___AS_MATRIX4D = ApogyCommonTopologyPackage.TRANSFORM_NODE___AS_MATRIX4D;

		/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE___SET_TRANSFORMATION__MATRIX4D = ApogyCommonTopologyPackage.TRANSFORM_NODE___SET_TRANSFORMATION__MATRIX4D;

		/**
	 * The number of operations of the '<em>Map Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.TRANSFORM_NODE_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER_NODE__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER_NODE__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER_NODE__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER_NODE__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER_NODE__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Abstract Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Abstract Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_MAP_LAYER_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyNodeImpl <em>Sky Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.SkyNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSkyNode()
	 * @generated
	 */
  int SKY_NODE = 59;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY_NODE__PARENT = ApogyCommonTopologyPackage.GROUP_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY_NODE__DESCRIPTION = ApogyCommonTopologyPackage.GROUP_NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY_NODE__NODE_ID = ApogyCommonTopologyPackage.GROUP_NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY_NODE__CHILDREN = ApogyCommonTopologyPackage.GROUP_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Sky</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY_NODE__SKY = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Sky Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY_NODE_FEATURE_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY_NODE___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.GROUP_NODE___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Sky Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY_NODE_OPERATION_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSkyNodeImpl <em>Earth Sky Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthSkyNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarthSkyNode()
	 * @generated
	 */
  int EARTH_SKY_NODE = 60;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_NODE__PARENT = SKY_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_NODE__DESCRIPTION = SKY_NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_NODE__NODE_ID = SKY_NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_NODE__CHILDREN = SKY_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Sky</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_NODE__SKY = SKY_NODE__SKY;

  /**
	 * The number of structural features of the '<em>Earth Sky Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_NODE_FEATURE_COUNT = SKY_NODE_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_NODE___ACCEPT__INODEVISITOR = SKY_NODE___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Earth Sky Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_NODE_OPERATION_COUNT = SKY_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshMapLayerNodeImpl <em>Cartesian Triangular Mesh Map Layer Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshMapLayerNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshMapLayerNode()
	 * @generated
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = 61;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__PARENT = ABSTRACT_MAP_LAYER_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__DESCRIPTION = ABSTRACT_MAP_LAYER_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__NODE_ID = ABSTRACT_MAP_LAYER_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__CHILDREN = ABSTRACT_MAP_LAYER_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__AGGREGATED_CHILDREN = ABSTRACT_MAP_LAYER_NODE__AGGREGATED_CHILDREN;

		/**
	 * The feature id for the '<em><b>Abstract Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER = ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER;

		/**
	 * The number of structural features of the '<em>Cartesian Triangular Mesh Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE_FEATURE_COUNT = ABSTRACT_MAP_LAYER_NODE_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE___ACCEPT__INODEVISITOR = ABSTRACT_MAP_LAYER_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The operation id for the '<em>Get Cartesian Triangular Mesh Map Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE___GET_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = ABSTRACT_MAP_LAYER_NODE_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Cartesian Triangular Mesh Map Layer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE_OPERATION_COUNT = ABSTRACT_MAP_LAYER_NODE_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getList()
	 * @generated
	 */
  int LIST = 62;

  /**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSortedSet()
	 * @generated
	 */
  int SORTED_SET = 63;

  /**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getDate()
	 * @generated
	 */
  int DATE = 64;

  /**
	 * The meta object id for the '<em>Point3d</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3d
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getPoint3d()
	 * @generated
	 */
  int POINT3D = 65;


  /**
	 * The meta object id for the '<em>Color3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Color3f
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getColor3f()
	 * @generated
	 */
	int COLOR3F = 66;


		/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 67;


		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.Worksite <em>Worksite</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Worksite
	 * @generated
	 */
  EClass getWorksite();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getWorksiteNode <em>Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worksite Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Worksite#getWorksiteNode()
	 * @see #getWorksite()
	 * @generated
	 */
  EReference getWorksite_WorksiteNode();

  /**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getOrbitsModels <em>Orbits Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orbits Models</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Worksite#getOrbitsModels()
	 * @see #getWorksite()
	 * @generated
	 */
	EReference getWorksite_OrbitsModels();

		/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Worksite#getEnvironment()
	 * @see #getWorksite()
	 * @generated
	 */
  EReference getWorksite_Environment();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite <em>Surface Worksite</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite
	 * @generated
	 */
  EClass getSurfaceWorksite();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite#getSky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sky</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite#getSky()
	 * @see #getSurfaceWorksite()
	 * @generated
	 */
  EReference getSurfaceWorksite_Sky();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite#getMapsList <em>Maps List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maps List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite#getMapsList()
	 * @see #getSurfaceWorksite()
	 * @generated
	 */
  EReference getSurfaceWorksite_MapsList();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite <em>Earth Surface Worksite</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Surface Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite
	 * @generated
	 */
  EClass getEarthSurfaceWorksite();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#getGeographicalCoordinates <em>Geographical Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geographical Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#getGeographicalCoordinates()
	 * @see #getEarthSurfaceWorksite()
	 * @generated
	 */
  EReference getEarthSurfaceWorksite_GeographicalCoordinates();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#getXAxisAzimuth <em>XAxis Azimuth</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis Azimuth</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#getXAxisAzimuth()
	 * @see #getEarthSurfaceWorksite()
	 * @generated
	 */
  EAttribute getEarthSurfaceWorksite_XAxisAzimuth();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#getEarthSky <em>Earth Sky</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Earth Sky</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#getEarthSky()
	 * @see #getEarthSurfaceWorksite()
	 * @generated
	 */
  EReference getEarthSurfaceWorksite_EarthSky();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Convert To Geographic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Geographic Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getEarthSurfaceWorksite__ConvertToGeographicCoordinates__Tuple3d();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#convertToXYZPosition(ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates) <em>Convert To XYZ Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To XYZ Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#convertToXYZPosition(ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates)
	 * @generated
	 */
	EOperation getEarthSurfaceWorksite__ConvertToXYZPosition__GeographicCoordinates();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Environment
	 * @generated
	 */
  EClass getEnvironment();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment <em>Surface Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment
	 * @generated
	 */
  EClass getSurfaceEnvironment();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment#getAtmosphere <em>Atmosphere</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Atmosphere</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment#getAtmosphere()
	 * @see #getSurfaceEnvironment()
	 * @generated
	 */
  EReference getSurfaceEnvironment_Atmosphere();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gravity</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment#getGravity()
	 * @see #getSurfaceEnvironment()
	 * @generated
	 */
  EReference getSurfaceEnvironment_Gravity();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceEnvironment <em>Earth Surface Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Surface Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceEnvironment
	 * @generated
	 */
  EClass getEarthSurfaceEnvironment();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere <em>Atmosphere</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atmosphere</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Atmosphere
	 * @generated
	 */
  EClass getAtmosphere();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getWindSpeed <em>Wind Speed</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Speed</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Atmosphere#getWindSpeed()
	 * @see #getAtmosphere()
	 * @generated
	 */
  EAttribute getAtmosphere_WindSpeed();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getWindDirection <em>Wind Direction</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wind Direction</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Atmosphere#getWindDirection()
	 * @see #getAtmosphere()
	 * @generated
	 */
  EAttribute getAtmosphere_WindDirection();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Atmosphere#getTemperature()
	 * @see #getAtmosphere()
	 * @generated
	 */
  EAttribute getAtmosphere_Temperature();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getSurfacePressure <em>Surface Pressure</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface Pressure</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Atmosphere#getSurfacePressure()
	 * @see #getAtmosphere()
	 * @generated
	 */
  EAttribute getAtmosphere_SurfacePressure();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere#getSurfaceDensity <em>Surface Density</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface Density</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Atmosphere#getSurfaceDensity()
	 * @see #getAtmosphere()
	 * @generated
	 */
  EAttribute getAtmosphere_SurfaceDensity();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils <em>Atmosphere Utils</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atmosphere Utils</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils
	 * @generated
	 */
  EClass getAtmosphereUtils();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getAirMass(double) <em>Get Air Mass</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Air Mass</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getAirMass(double)
	 * @generated
	 */
  EOperation getAtmosphereUtils__GetAirMass__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getDirectSunIntensity(double, double) <em>Get Direct Sun Intensity</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Direct Sun Intensity</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getDirectSunIntensity(double, double)
	 * @generated
	 */
  EOperation getAtmosphereUtils__GetDirectSunIntensity__double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getDiffuseSunIntensity(double, double) <em>Get Diffuse Sun Intensity</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Diffuse Sun Intensity</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getDiffuseSunIntensity(double, double)
	 * @generated
	 */
  EOperation getAtmosphereUtils__GetDiffuseSunIntensity__double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getAtmosphereRefractionCorrection(double) <em>Get Atmosphere Refraction Correction</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Atmosphere Refraction Correction</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getAtmosphereRefractionCorrection(double)
	 * @generated
	 */
  EOperation getAtmosphereUtils__GetAtmosphereRefractionCorrection__double();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates <em>Equatorial Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equatorial Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates
	 * @generated
	 */
  EClass getEquatorialCoordinates();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getRightAscension <em>Right Ascension</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Ascension</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getRightAscension()
	 * @see #getEquatorialCoordinates()
	 * @generated
	 */
  EAttribute getEquatorialCoordinates_RightAscension();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getDeclination <em>Declination</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declination</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getDeclination()
	 * @see #getEquatorialCoordinates()
	 * @generated
	 */
  EAttribute getEquatorialCoordinates_Declination();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates#getRadius()
	 * @see #getEquatorialCoordinates()
	 * @generated
	 */
  EAttribute getEquatorialCoordinates_Radius();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates <em>Geographic Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geographic Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates
	 * @generated
	 */
  EClass getGeographicCoordinates();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates#getLongitude()
	 * @see #getGeographicCoordinates()
	 * @generated
	 */
  EAttribute getGeographicCoordinates_Longitude();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates#getLatitude()
	 * @see #getGeographicCoordinates()
	 * @generated
	 */
  EAttribute getGeographicCoordinates_Latitude();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates#getElevation()
	 * @see #getGeographicCoordinates()
	 * @generated
	 */
  EAttribute getGeographicCoordinates_Elevation();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates <em>Horizontal Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates
	 * @generated
	 */
  EClass getHorizontalCoordinates();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates#getAltitude()
	 * @see #getHorizontalCoordinates()
	 * @generated
	 */
  EAttribute getHorizontalCoordinates_Altitude();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates#getAzimuth <em>Azimuth</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates#getAzimuth()
	 * @see #getHorizontalCoordinates()
	 * @generated
	 */
  EAttribute getHorizontalCoordinates_Azimuth();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates#getRadius()
	 * @see #getHorizontalCoordinates()
	 * @generated
	 */
  EAttribute getHorizontalCoordinates_Radius();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates <em>Ecliptic Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecliptic Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates
	 * @generated
	 */
  EClass getEclipticCoordinates();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates#getLongitude()
	 * @see #getEclipticCoordinates()
	 * @generated
	 */
  EAttribute getEclipticCoordinates_Longitude();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates#getLatitude()
	 * @see #getEclipticCoordinates()
	 * @generated
	 */
  EAttribute getEclipticCoordinates_Latitude();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates#getRadius()
	 * @see #getEclipticCoordinates()
	 * @generated
	 */
  EAttribute getEclipticCoordinates_Radius();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.Sky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sky</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky
	 * @generated
	 */
  EClass getSky();

  /**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSurfaceWorksite <em>Surface Worksite</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Surface Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getSurfaceWorksite()
	 * @see #getSky()
	 * @generated
	 */
  EReference getSky_SurfaceWorksite();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSkyNode <em>Sky Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sky Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getSkyNode()
	 * @see #getSky()
	 * @generated
	 */
  EReference getSky_SkyNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSun <em>Sun</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sun</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getSun()
	 * @see #getSky()
	 * @generated
	 */
  EReference getSky_Sun();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSunHorizontalCoordinates <em>Sun Horizontal Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sun Horizontal Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getSunHorizontalCoordinates()
	 * @see #getSky()
	 * @generated
	 */
  EReference getSky_SunHorizontalCoordinates();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getStarField <em>Star Field</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Star Field</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getStarField()
	 * @see #getSky()
	 * @generated
	 */
  EReference getSky_StarField();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSunAngularDiameter() <em>Get Sun Angular Diameter</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Angular Diameter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getSunAngularDiameter()
	 * @generated
	 */
  EOperation getSky__GetSunAngularDiameter();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.EarthSky <em>Earth Sky</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Sky</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSky
	 * @generated
	 */
  EClass getEarthSky();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.EarthSky#getMoon <em>Moon</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moon</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSky#getMoon()
	 * @see #getEarthSky()
	 * @generated
	 */
  EReference getEarthSky_Moon();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.EarthSky#getMoonHorizontalCoordinates <em>Moon Horizontal Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moon Horizontal Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSky#getMoonHorizontalCoordinates()
	 * @see #getEarthSky()
	 * @generated
	 */
  EReference getEarthSky_MoonHorizontalCoordinates();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.EarthSky#getMoonAngularDiameter() <em>Get Moon Angular Diameter</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moon Angular Diameter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSky#getMoonAngularDiameter()
	 * @generated
	 */
  EOperation getEarthSky__GetMoonAngularDiameter();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.Sun <em>Sun</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sun</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sun
	 * @generated
	 */
  EClass getSun();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.Sun#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sun#getRadius()
	 * @see #getSun()
	 * @generated
	 */
  EAttribute getSun_Radius();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.Sun#getIrradiance(double) <em>Get Irradiance</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Irradiance</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sun#getIrradiance(double)
	 * @generated
	 */
  EOperation getSun__GetIrradiance__double();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.Earth <em>Earth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Earth
	 * @generated
	 */
	EClass getEarth();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.Earth#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Earth#getRadius()
	 * @see #getEarth()
	 * @generated
	 */
	EAttribute getEarth_Radius();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.Moon <em>Moon</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moon</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Moon
	 * @generated
	 */
  EClass getMoon();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.Moon#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Moon#getRadius()
	 * @see #getMoon()
	 * @generated
	 */
  EAttribute getMoon_Radius();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities <em>Environment Utilities</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Utilities</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities
	 * @generated
	 */
  EClass getEnvironmentUtilities();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities#convertToJulianDate(java.util.Date) <em>Convert To Julian Date</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Julian Date</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities#convertToJulianDate(java.util.Date)
	 * @generated
	 */
  EOperation getEnvironmentUtilities__ConvertToJulianDate__Date();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities#parseRightAscension(java.lang.String) <em>Parse Right Ascension</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse Right Ascension</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities#parseRightAscension(java.lang.String)
	 * @generated
	 */
  EOperation getEnvironmentUtilities__ParseRightAscension__String();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities#parseDegMinSec(java.lang.String) <em>Parse Deg Min Sec</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse Deg Min Sec</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities#parseDegMinSec(java.lang.String)
	 * @generated
	 */
  EOperation getEnvironmentUtilities__ParseDegMinSec__String();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities#sortByMagnitude(java.util.List) <em>Sort By Magnitude</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort By Magnitude</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities#sortByMagnitude(java.util.List)
	 * @generated
	 */
  EOperation getEnvironmentUtilities__SortByMagnitude__List();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade
	 * @generated
	 */
	EClass getApogyCoreEnvironmentFacade();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeStars() <em>Create And Initialize Stars</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create And Initialize Stars</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeStars()
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__CreateAndInitializeStars();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeDefaultCSAWorksite() <em>Create And Initialize Default CSA Worksite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create And Initialize Default CSA Worksite</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeDefaultCSAWorksite()
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__CreateAndInitializeDefaultCSAWorksite();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#initializeSkyNode(ca.gc.asc_csa.apogy.core.environment.Sky, ca.gc.asc_csa.apogy.core.environment.SkyNode) <em>Initialize Sky Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Sky Node</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#initializeSkyNode(ca.gc.asc_csa.apogy.core.environment.Sky, ca.gc.asc_csa.apogy.core.environment.SkyNode)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__InitializeSkyNode__Sky_SkyNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#initializeEarthSkyNode(ca.gc.asc_csa.apogy.core.environment.EarthSky, ca.gc.asc_csa.apogy.core.environment.EarthSkyNode) <em>Initialize Earth Sky Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Earth Sky Node</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#initializeEarthSkyNode(ca.gc.asc_csa.apogy.core.environment.EarthSky, ca.gc.asc_csa.apogy.core.environment.EarthSkyNode)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__InitializeEarthSkyNode__EarthSky_EarthSkyNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMarsYardGeographicalCoordinates() <em>Get Mars Yard Geographical Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mars Yard Geographical Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMarsYardGeographicalCoordinates()
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetMarsYardGeographicalCoordinates();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createStar(float, double, double) <em>Create Star</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Star</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createStar(float, double, double)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__CreateStar__float_double_double();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMarsYardTransformNode() <em>Get Mars Yard Transform Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mars Yard Transform Node</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMarsYardTransformNode()
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetMarsYardTransformNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeEarthSurfaceEnvironment() <em>Create And Initialize Earth Surface Environment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create And Initialize Earth Surface Environment</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeEarthSurfaceEnvironment()
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__CreateAndInitializeEarthSurfaceEnvironment();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeEarthAtmosphere() <em>Create And Initialize Earth Atmosphere</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create And Initialize Earth Atmosphere</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeEarthAtmosphere()
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__CreateAndInitializeEarthAtmosphere();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getSunVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Sun Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getSunVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetSunVector__ApogySystem_String_Environment();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getSunVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Sun Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getSunVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetSunVector__Node_Environment();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMoonVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Moon Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moon Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMoonVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetMoonVector__ApogySystem_String_Environment();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMoonVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Moon Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moon Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMoonVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetMoonVector__Node_Environment();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.core.ConnectionPoint, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.core.ConnectionPoint, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetVector__Node_ApogySystem_ConnectionPoint_Environment();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.core.ConnectionPoint, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.core.ConnectionPoint, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_ApogySystem_ConnectionPoint_Environment();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_ApogySystem_String_Environment();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, java.lang.String, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Vector</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, java.lang.String, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_String_String_Environment();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createEImage(java.util.List) <em>Create EImage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create EImage</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createEImage(java.util.List)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__CreateEImage__List();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getAbsoluteRectangularRegionCorners(ca.gc.asc_csa.apogy.core.environment.RectangularRegion) <em>Get Absolute Rectangular Region Corners</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Absolute Rectangular Region Corners</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getAbsoluteRectangularRegionCorners(ca.gc.asc_csa.apogy.core.environment.RectangularRegion)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetAbsoluteRectangularRegionCorners__RectangularRegion();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getBestResolutionRectangularRegionImage(java.util.List) <em>Get Best Resolution Rectangular Region Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Best Resolution Rectangular Region Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getBestResolutionRectangularRegionImage(java.util.List)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetBestResolutionRectangularRegionImage__List();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionExtent(ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rectangular Region Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionExtent(ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionImageExtent(ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rectangular Region Image Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionImageExtent(ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rectangular Region Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetRectangularRegionExtent__List_Tuple3d_Tuple3d();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionImageExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rectangular Region Image Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionImageExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetRectangularRegionImageExtent__List_Tuple3d_Tuple3d();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#fitsInside(ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.RectangularRegion) <em>Fits Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fits Inside</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#fitsInside(ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.RectangularRegion)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__FitsInside__RectangularRegion_RectangularRegion();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#intersects(ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.common.math.Matrix4x4) <em>Intersects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Intersects</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#intersects(ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.common.math.Matrix4x4)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__Intersects__RectangularRegion_RectangularRegion_Matrix4x4();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationExtent(ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer Presentation Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationExtent(ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetImageMapLayerPresentationExtent__ImageMapLayerPresentation_Tuple3d_Tuple3d();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer Presentation Extent</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetImageMapLayerPresentationExtent__List_Tuple3d_Tuple3d();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationImage(java.util.List) <em>Get Image Map Layer Presentation Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer Presentation Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationImage(java.util.List)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetImageMapLayerPresentationImage__List();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getBestResolutionMapLayer(java.util.List) <em>Get Best Resolution Map Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Best Resolution Map Layer</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getBestResolutionMapLayer(java.util.List)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetBestResolutionMapLayer__List();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVisibleImageMapLayerPresentation(java.util.List) <em>Get Visible Image Map Layer Presentation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Visible Image Map Layer Presentation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVisibleImageMapLayerPresentation(java.util.List)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetVisibleImageMapLayerPresentation__List();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularVolumeRegion(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Get Rectangular Volume Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rectangular Volume Region</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularVolumeRegion(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__GetRectangularVolumeRegion__CartesianTriangularMesh();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.Star <em>Star</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Star</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Star
	 * @generated
	 */
  EClass getStar();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.Star#getMagnitude <em>Magnitude</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Magnitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Star#getMagnitude()
	 * @see #getStar()
	 * @generated
	 */
  EAttribute getStar_Magnitude();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.Star#getEquatorialCoordinates <em>Equatorial Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Equatorial Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Star#getEquatorialCoordinates()
	 * @see #getStar()
	 * @generated
	 */
  EReference getStar_EquatorialCoordinates();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.StarField <em>Star Field</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Star Field</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.StarField
	 * @generated
	 */
  EClass getStarField();

  /**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.core.environment.StarField#getStars <em>Stars</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stars</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.StarField#getStars()
	 * @see #getStarField()
	 * @generated
	 */
  EReference getStarField_Stars();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.StarField#getStarFieldFileName <em>Star Field File Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Star Field File Name</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.StarField#getStarFieldFileName()
	 * @see #getStarField()
	 * @generated
	 */
  EAttribute getStarField_StarFieldFileName();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils <em>Astronomy Utils</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Astronomy Utils</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils
	 * @generated
	 */
  EClass getAstronomyUtils();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunEquatorialPosition(double) <em>Get Sun Equatorial Position</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Equatorial Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunEquatorialPosition(double)
	 * @generated
	 */
  EOperation getAstronomyUtils__GetSunEquatorialPosition__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getHorizontalSunPosition(java.util.Date, double, double) <em>Get Horizontal Sun Position</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Horizontal Sun Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getHorizontalSunPosition(java.util.Date, double, double)
	 * @generated
	 */
  EOperation getAstronomyUtils__GetHorizontalSunPosition__Date_double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMoonEquatorialPosition(double) <em>Get Moon Equatorial Position</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moon Equatorial Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMoonEquatorialPosition(double)
	 * @generated
	 */
  EOperation getAstronomyUtils__GetMoonEquatorialPosition__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMoonTopocentricEquatorialPosition(java.util.Date, double, double) <em>Get Moon Topocentric Equatorial Position</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Moon Topocentric Equatorial Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMoonTopocentricEquatorialPosition(java.util.Date, double, double)
	 * @generated
	 */
  EOperation getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getHorizontalMoonPosition(java.util.Date, double, double) <em>Get Horizontal Moon Position</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Horizontal Moon Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getHorizontalMoonPosition(java.util.Date, double, double)
	 * @generated
	 */
  EOperation getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getTimeSinceJ2000(double) <em>Get Time Since J2000</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Since J2000</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getTimeSinceJ2000(double)
	 * @generated
	 */
  EOperation getAstronomyUtils__GetTimeSinceJ2000__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getLocalSideralTime(java.util.Date, double) <em>Get Local Sideral Time</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Local Sideral Time</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getLocalSideralTime(java.util.Date, double)
	 * @generated
	 */
  EOperation getAstronomyUtils__GetLocalSideralTime__Date_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getUTCDecimalHours(java.util.Date) <em>Get UTC Decimal Hours</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get UTC Decimal Hours</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getUTCDecimalHours(java.util.Date)
	 * @generated
	 */
  EOperation getAstronomyUtils__GetUTCDecimalHours__Date();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToHorizontalCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates, double, double, java.util.Date) <em>Convert To Horizontal Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Horizontal Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToHorizontalCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates, double, double, java.util.Date)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertTimeToAngle(int, int, int) <em>Convert Time To Angle</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert Time To Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertTimeToAngle(int, int, int)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertTimeToAngle__int_int_int();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#clampAngleToZero2PI(double) <em>Clamp Angle To Zero2 PI</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clamp Angle To Zero2 PI</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#clampAngleToZero2PI(double)
	 * @generated
	 */
  EOperation getAstronomyUtils__ClampAngleToZero2PI__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToEquatorialCoordinates(ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates) <em>Convert To Equatorial Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Equatorial Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToEquatorialCoordinates(ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertToEquatorialCoordinates__EclipticCoordinates();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToEclipticCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates) <em>Convert To Ecliptic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To Ecliptic Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToEclipticCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertToEclipticCoordinates__EquatorialCoordinates();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialRectangularToEclipticRectangular(javax.vecmath.Point3d) <em>Convert From Equatorial Rectangular To Ecliptic Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Equatorial Rectangular To Ecliptic Rectangular</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialRectangularToEclipticRectangular(javax.vecmath.Point3d)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertFromEquatorialRectangularToEclipticRectangular__Point3d();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEclipticRectangularToEquatorialRectangular(javax.vecmath.Point3d) <em>Convert From Ecliptic Rectangular To Equatorial Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Ecliptic Rectangular To Equatorial Rectangular</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEclipticRectangularToEquatorialRectangular(javax.vecmath.Point3d)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertFromEclipticRectangularToEquatorialRectangular__Point3d();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEclipticRectangularToEclipticCoordinates(javax.vecmath.Point3d) <em>Convert From Ecliptic Rectangular To Ecliptic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Ecliptic Rectangular To Ecliptic Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEclipticRectangularToEclipticCoordinates(javax.vecmath.Point3d)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertFromEclipticRectangularToEclipticCoordinates__Point3d();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialRectangularToEquatorialCoordinates(javax.vecmath.Point3d) <em>Convert From Equatorial Rectangular To Equatorial Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Equatorial Rectangular To Equatorial Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialRectangularToEquatorialCoordinates(javax.vecmath.Point3d)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertFromEquatorialRectangularToEquatorialCoordinates__Point3d();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromHorizontalCoordinatesToHorizontalRectangular(ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates) <em>Convert From Horizontal Coordinates To Horizontal Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Horizontal Coordinates To Horizontal Rectangular</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromHorizontalCoordinatesToHorizontalRectangular(ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertFromHorizontalCoordinatesToHorizontalRectangular__HorizontalCoordinates();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialCoordinatesToEquatorialRectangular(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates) <em>Convert From Equatorial Coordinates To Equatorial Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert From Equatorial Coordinates To Equatorial Rectangular</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialCoordinatesToEquatorialRectangular(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertFromEquatorialCoordinatesToEquatorialRectangular__EquatorialCoordinates();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertAUtoMeters(double) <em>Convert AUto Meters</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert AUto Meters</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertAUtoMeters(double)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertAUtoMeters__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMaximumSunAltitude(double) <em>Get Maximum Sun Altitude</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Maximum Sun Altitude</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMaximumSunAltitude(double)
	 * @generated
	 */
  EOperation getAstronomyUtils__GetMaximumSunAltitude__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToHHmmssString(double) <em>Convert To HHmmss String</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To HHmmss String</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToHHmmssString(double)
	 * @generated
	 */
  EOperation getAstronomyUtils__ConvertToHHmmssString__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunRiseTime(java.util.Date, double, double) <em>Get Sun Rise Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Rise Time</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunRiseTime(java.util.Date, double, double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetSunRiseTime__Date_double_double();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunSetTime(java.util.Date, double, double) <em>Get Sun Set Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Set Time</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunSetTime(java.util.Date, double, double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetSunSetTime__Date_double_double();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunHighestElevationTime(java.util.Date, double, double) <em>Get Sun Highest Elevation Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Highest Elevation Time</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunHighestElevationTime(java.util.Date, double, double)
	 * @generated
	 */
	EOperation getAstronomyUtils__GetSunHighestElevationTime__Date_double_double();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Map
	 * @generated
	 */
  EClass getMap();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.Map#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Map#getTransformation()
	 * @see #getMap()
	 * @generated
	 */
  EReference getMap_Transformation();

  /**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.Map#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Map#getLayers()
	 * @see #getMap()
	 * @generated
	 */
  EReference getMap_Layers();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.Map#getMapNode <em>Map Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Map#getMapNode()
	 * @see #getMap()
	 * @generated
	 */
  EReference getMap_MapNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.MapsList <em>Maps List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maps List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapsList
	 * @generated
	 */
  EClass getMapsList();

  /**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.MapsList#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maps</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapsList#getMaps()
	 * @see #getMapsList()
	 * @generated
	 */
  EReference getMapsList_Maps();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.MapsList#getMapsListNode <em>Maps List Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps List Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapsList#getMapsListNode()
	 * @see #getMapsList()
	 * @generated
	 */
  EReference getMapsList_MapsListNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer <em>Abstract Map Layer</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer
	 * @generated
	 */
  EClass getAbstractMapLayer();

  /**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Map</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer#getMap()
	 * @see #getAbstractMapLayer()
	 * @generated
	 */
  EReference getAbstractMapLayer_Map();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer#getAbstractMapLayerNode <em>Abstract Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Map Layer Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer#getAbstractMapLayerNode()
	 * @see #getAbstractMapLayer()
	 * @generated
	 */
  EReference getAbstractMapLayer_AbstractMapLayerNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation <em>Map Layer Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Layer Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation
	 * @generated
	 */
	EClass getMapLayerPresentation();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation#isVisible()
	 * @see #getMapLayerPresentation()
	 * @generated
	 */
	EAttribute getMapLayerPresentation_Visible();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation#getMapLayer <em>Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation#getMapLayer()
	 * @see #getMapLayerPresentation()
	 * @generated
	 */
	EReference getMapLayerPresentation_MapLayer();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.URLMapLayer <em>URL Map Layer</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.URLMapLayer
	 * @generated
	 */
  EClass getURLMapLayer();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.URLMapLayer#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.URLMapLayer#getUrl()
	 * @see #getURLMapLayer()
	 * @generated
	 */
  EAttribute getURLMapLayer_Url();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Region
	 * @generated
	 */
  EClass getRegion();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.Region#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Region#getTransformation()
	 * @see #getRegion()
	 * @generated
	 */
  EReference getRegion_Transformation();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion <em>Rectangular Region</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Region</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion
	 * @generated
	 */
  EClass getRectangularRegion();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getXMin <em>XMin</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMin</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getXMin()
	 * @see #getRectangularRegion()
	 * @generated
	 */
  EAttribute getRectangularRegion_XMin();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getXMax <em>XMax</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XMax</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getXMax()
	 * @see #getRectangularRegion()
	 * @generated
	 */
  EAttribute getRectangularRegion_XMax();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getYMin <em>YMin</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMin</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getYMin()
	 * @see #getRectangularRegion()
	 * @generated
	 */
  EAttribute getRectangularRegion_YMin();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getYMax <em>YMax</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YMax</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getYMax()
	 * @see #getRectangularRegion()
	 * @generated
	 */
  EAttribute getRectangularRegion_YMax();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getXDimension()
	 * @see #getRectangularRegion()
	 * @generated
	 */
  EAttribute getRectangularRegion_XDimension();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getYDimension()
	 * @see #getRectangularRegion()
	 * @generated
	 */
  EAttribute getRectangularRegion_YDimension();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getLowerLeftCorner <em>Lower Left Corner</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lower Left Corner</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getLowerLeftCorner()
	 * @see #getRectangularRegion()
	 * @generated
	 */
  EReference getRectangularRegion_LowerLeftCorner();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getUpperLeftCorner <em>Upper Left Corner</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Upper Left Corner</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getUpperLeftCorner()
	 * @see #getRectangularRegion()
	 * @generated
	 */
  EReference getRectangularRegion_UpperLeftCorner();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getLowerRightCorner <em>Lower Right Corner</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lower Right Corner</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getLowerRightCorner()
	 * @see #getRectangularRegion()
	 * @generated
	 */
  EReference getRectangularRegion_LowerRightCorner();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getUpperRightCorner <em>Upper Right Corner</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Upper Right Corner</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion#getUpperRightCorner()
	 * @see #getRectangularRegion()
	 * @generated
	 */
  EReference getRectangularRegion_UpperRightCorner();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion <em>Rectangular Volume Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Volume Region</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion
	 * @generated
	 */
	EClass getRectangularVolumeRegion();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion#getZMin <em>ZMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZMin</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion#getZMin()
	 * @see #getRectangularVolumeRegion()
	 * @generated
	 */
	EAttribute getRectangularVolumeRegion_ZMin();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion#getZMax <em>ZMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZMax</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion#getZMax()
	 * @see #getRectangularVolumeRegion()
	 * @generated
	 */
	EAttribute getRectangularVolumeRegion_ZMax();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion#getZDimension <em>ZDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZDimension</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion#getZDimension()
	 * @see #getRectangularVolumeRegion()
	 * @generated
	 */
	EAttribute getRectangularVolumeRegion_ZDimension();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider <em>Rectangular Region Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Region Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider
	 * @generated
	 */
	EClass getRectangularRegionProvider();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider#getRegion() <em>Get Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Region</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider#getRegion()
	 * @generated
	 */
	EOperation getRectangularRegionProvider__GetRegion();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage <em>Rectangular Region Image</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Region Image</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage
	 * @generated
	 */
  EClass getRectangularRegionImage();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage#getRegionImage() <em>Get Region Image</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Region Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage#getRegionImage()
	 * @generated
	 */
  EOperation getRectangularRegionImage__GetRegionImage();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage#getResolution() <em>Get Resolution</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resolution</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage#getResolution()
	 * @generated
	 */
  EOperation getRectangularRegionImage__GetResolution();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer <em>Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer
	 * @generated
	 */
  EClass getImageMapLayer();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getWidth()
	 * @see #getImageMapLayer()
	 * @generated
	 */
  EAttribute getImageMapLayer_Width();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getHeight()
	 * @see #getImageMapLayer()
	 * @generated
	 */
  EAttribute getImageMapLayer_Height();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#isOpaque <em>Opaque</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opaque</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#isOpaque()
	 * @see #getImageMapLayer()
	 * @generated
	 */
  EAttribute getImageMapLayer_Opaque();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getImage()
	 * @see #getImageMapLayer()
	 * @generated
	 */
  EReference getImageMapLayer_Image();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getLegend <em>Legend</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legend</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getLegend()
	 * @see #getImageMapLayer()
	 * @generated
	 */
  EReference getImageMapLayer_Legend();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getResolution()
	 * @see #getImageMapLayer()
	 * @generated
	 */
  EAttribute getImageMapLayer_Resolution();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#updateImage(org.eclipse.core.runtime.IProgressMonitor) <em>Update Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#updateImage(org.eclipse.core.runtime.IProgressMonitor)
	 * @generated
	 */
	EOperation getImageMapLayer__UpdateImage__IProgressMonitor();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getImageMapLayerRegion() <em>Get Image Map Layer Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer Region</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getImageMapLayerRegion()
	 * @generated
	 */
	EOperation getImageMapLayer__GetImageMapLayerRegion();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation <em>Image Map Layer Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Map Layer Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation
	 * @generated
	 */
	EClass getImageMapLayerPresentation();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation#getAlpha()
	 * @see #getImageMapLayerPresentation()
	 * @generated
	 */
	EAttribute getImageMapLayerPresentation_Alpha();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation#getImageMapLayer() <em>Get Image Map Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation#getImageMapLayer()
	 * @generated
	 */
	EOperation getImageMapLayerPresentation__GetImageMapLayer();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.URLImageMapLayer <em>URL Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.URLImageMapLayer
	 * @generated
	 */
  EClass getURLImageMapLayer();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.URLImageMapLayer#getLegendURL <em>Legend URL</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legend URL</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.URLImageMapLayer#getLegendURL()
	 * @see #getURLImageMapLayer()
	 * @generated
	 */
  EAttribute getURLImageMapLayer_LegendURL();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer <em>Topology Tree Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Tree Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer
	 * @generated
	 */
	EClass getTopologyTreeMapLayer();

		/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer#getTopologyTreeRoot <em>Topology Tree Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology Tree Root</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer#getTopologyTreeRoot()
	 * @see #getTopologyTreeMapLayer()
	 * @generated
	 */
	EReference getTopologyTreeMapLayer_TopologyTreeRoot();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode <em>Topology Tree Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Tree Map Layer Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode
	 * @generated
	 */
	EClass getTopologyTreeMapLayerNode();

		/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode#getTopologyTreeMapLayer <em>Topology Tree Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Topology Tree Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode#getTopologyTreeMapLayer()
	 * @see #getTopologyTreeMapLayerNode()
	 * @generated
	 */
	EReference getTopologyTreeMapLayerNode_TopologyTreeMapLayer();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode#getTransientParent <em>Transient Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transient Parent</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode#getTransientParent()
	 * @see #getTopologyTreeMapLayerNode()
	 * @generated
	 */
	EReference getTopologyTreeMapLayerNode_TransientParent();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer <em>Cartesian Triangular Mesh Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer
	 * @generated
	 */
	EClass getCartesianTriangularMeshMapLayer();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#isMeshIsDirty <em>Mesh Is Dirty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mesh Is Dirty</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#isMeshIsDirty()
	 * @see #getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshMapLayer_MeshIsDirty();

		/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#getMapLayerPresentations <em>Map Layer Presentations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Layer Presentations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#getMapLayerPresentations()
	 * @see #getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EReference getCartesianTriangularMeshMapLayer_MapLayerPresentations();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#getTextureImage <em>Texture Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Texture Image</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#getTextureImage()
	 * @see #getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EReference getCartesianTriangularMeshMapLayer_TextureImage();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#getCartesianTriangularMeshMapLayerNode <em>Cartesian Triangular Mesh Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cartesian Triangular Mesh Map Layer Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#getCartesianTriangularMeshMapLayerNode()
	 * @see #getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EReference getCartesianTriangularMeshMapLayer_CartesianTriangularMeshMapLayerNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#getCurrentMesh() <em>Get Current Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Mesh</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#getCurrentMesh()
	 * @generated
	 */
	EOperation getCartesianTriangularMeshMapLayer__GetCurrentMesh();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#forceUpdateTextureImage() <em>Force Update Texture Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Force Update Texture Image</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#forceUpdateTextureImage()
	 * @generated
	 */
	EOperation getCartesianTriangularMeshMapLayer__ForceUpdateTextureImage();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDerivedImageMapLayer <em>Cartesian Triangular Mesh Derived Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Derived Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDerivedImageMapLayer
	 * @generated
	 */
	EClass getCartesianTriangularMeshDerivedImageMapLayer();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDerivedImageMapLayer#getRequiredResolution <em>Required Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Resolution</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDerivedImageMapLayer#getRequiredResolution()
	 * @see #getCartesianTriangularMeshDerivedImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDerivedImageMapLayer#getCartesianTriangularMeshMapLayer <em>Cartesian Triangular Mesh Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cartesian Triangular Mesh Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDerivedImageMapLayer#getCartesianTriangularMeshMapLayer()
	 * @see #getCartesianTriangularMeshDerivedImageMapLayer()
	 * @generated
	 */
	EReference getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer <em>Cartesian Triangular Mesh Slope Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Slope Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer
	 * @generated
	 */
	EClass getCartesianTriangularMeshSlopeImageMapLayer();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer#isAutoScale <em>Auto Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Scale</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer#isAutoScale()
	 * @see #getCartesianTriangularMeshSlopeImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshSlopeImageMapLayer_AutoScale();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer#getMinimumSlope <em>Minimum Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Slope</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer#getMinimumSlope()
	 * @see #getCartesianTriangularMeshSlopeImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer#getMaximumSlope <em>Maximum Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Slope</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer#getMaximumSlope()
	 * @see #getCartesianTriangularMeshSlopeImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer <em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer
	 * @generated
	 */
	EClass getCartesianTriangularMeshDiscreteSlopeImageMapLayer();

		/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer#getSlopeRanges <em>Slope Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slope Ranges</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer#getSlopeRanges()
	 * @see #getCartesianTriangularMeshDiscreteSlopeImageMapLayer()
	 * @generated
	 */
	EReference getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer <em>Cartesian Triangular Mesh Height Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Height Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer
	 * @generated
	 */
	EClass getCartesianTriangularMeshHeightImageMapLayer();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#isAutoScale <em>Auto Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Scale</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#isAutoScale()
	 * @see #getCartesianTriangularMeshHeightImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshHeightImageMapLayer_AutoScale();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#getMinimumHeight <em>Minimum Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#getMinimumHeight()
	 * @see #getCartesianTriangularMeshHeightImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#getMaximumHeight <em>Maximum Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#getMaximumHeight()
	 * @see #getCartesianTriangularMeshHeightImageMapLayer()
	 * @generated
	 */
	EAttribute getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer <em>Line Of Sight Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Of Sight Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer
	 * @generated
	 */
	EClass getLineOfSightImageMapLayer();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getLineOfSightAvailableColor <em>Line Of Sight Available Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Of Sight Available Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getLineOfSightAvailableColor()
	 * @see #getLineOfSightImageMapLayer()
	 * @generated
	 */
	EAttribute getLineOfSightImageMapLayer_LineOfSightAvailableColor();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getLineOfSightNotAvailableColor <em>Line Of Sight Not Available Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Of Sight Not Available Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getLineOfSightNotAvailableColor()
	 * @see #getLineOfSightImageMapLayer()
	 * @generated
	 */
	EAttribute getLineOfSightImageMapLayer_LineOfSightNotAvailableColor();

		/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getObserverPose <em>Observer Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observer Pose</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getObserverPose()
	 * @see #getLineOfSightImageMapLayer()
	 * @generated
	 */
	EReference getLineOfSightImageMapLayer_ObserverPose();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getTargetHeightAboveGround <em>Target Height Above Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Height Above Ground</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getTargetHeightAboveGround()
	 * @see #getLineOfSightImageMapLayer()
	 * @generated
	 */
	EAttribute getLineOfSightImageMapLayer_TargetHeightAboveGround();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#isUseHeightPerpendicularToGround <em>Use Height Perpendicular To Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Height Perpendicular To Ground</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#isUseHeightPerpendicularToGround()
	 * @see #getLineOfSightImageMapLayer()
	 * @generated
	 */
	EAttribute getLineOfSightImageMapLayer_UseHeightPerpendicularToGround();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer <em>Abstract Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Shape Image Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer
	 * @generated
	 */
	EClass getAbstractShapeImageLayer();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer#isShapedFilled <em>Shaped Filled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaped Filled</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer#isShapedFilled()
	 * @see #getAbstractShapeImageLayer()
	 * @generated
	 */
	EAttribute getAbstractShapeImageLayer_ShapedFilled();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer#getColor()
	 * @see #getAbstractShapeImageLayer()
	 * @generated
	 */
	EAttribute getAbstractShapeImageLayer_Color();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer#getRequiredResolution <em>Required Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Resolution</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer#getRequiredResolution()
	 * @see #getAbstractShapeImageLayer()
	 * @generated
	 */
	EAttribute getAbstractShapeImageLayer_RequiredResolution();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer <em>Ellipse Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse Shape Image Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer
	 * @generated
	 */
	EClass getEllipseShapeImageLayer();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#getEllipseWidth <em>Ellipse Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ellipse Width</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#getEllipseWidth()
	 * @see #getEllipseShapeImageLayer()
	 * @generated
	 */
	EAttribute getEllipseShapeImageLayer_EllipseWidth();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#getEllipseHeight <em>Ellipse Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ellipse Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#getEllipseHeight()
	 * @see #getEllipseShapeImageLayer()
	 * @generated
	 */
	EAttribute getEllipseShapeImageLayer_EllipseHeight();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#isShowCenterLines <em>Show Center Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Center Lines</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer#isShowCenterLines()
	 * @see #getEllipseShapeImageLayer()
	 * @generated
	 */
	EAttribute getEllipseShapeImageLayer_ShowCenterLines();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer <em>Rectangle Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle Shape Image Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer
	 * @generated
	 */
	EClass getRectangleShapeImageLayer();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer#getRectangleWidth <em>Rectangle Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rectangle Width</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer#getRectangleWidth()
	 * @see #getRectangleShapeImageLayer()
	 * @generated
	 */
	EAttribute getRectangleShapeImageLayer_RectangleWidth();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer#getRectangleHeight <em>Rectangle Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rectangle Height</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer#getRectangleHeight()
	 * @see #getRectangleShapeImageLayer()
	 * @generated
	 */
	EAttribute getRectangleShapeImageLayer_RectangleHeight();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer#isShowCenterLines <em>Show Center Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Center Lines</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer#isShowCenterLines()
	 * @see #getRectangleShapeImageLayer()
	 * @generated
	 */
	EAttribute getRectangleShapeImageLayer_ShowCenterLines();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer <em>Polygon Shape Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Shape Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer
	 * @generated
	 */
	EClass getPolygonShapeImageMapLayer();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer#getVertices() <em>Get Vertices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Vertices</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer#getVertices()
	 * @generated
	 */
	EOperation getPolygonShapeImageMapLayer__GetVertices();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianCoordinatesPolygonShapeImageMapLayer <em>Cartesian Coordinates Polygon Shape Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Polygon Shape Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianCoordinatesPolygonShapeImageMapLayer
	 * @generated
	 */
	EClass getCartesianCoordinatesPolygonShapeImageMapLayer();

		/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.CartesianCoordinatesPolygonShapeImageMapLayer#getPolygonVertices <em>Polygon Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon Vertices</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianCoordinatesPolygonShapeImageMapLayer#getPolygonVertices()
	 * @see #getCartesianCoordinatesPolygonShapeImageMapLayer()
	 * @generated
	 */
	EReference getCartesianCoordinatesPolygonShapeImageMapLayer_PolygonVertices();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer <em>Geographic Coordinates Polygon Shape Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geographic Coordinates Polygon Shape Image Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer
	 * @generated
	 */
	EClass getGeographicCoordinatesPolygonShapeImageMapLayer();

		/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer#getPolygonVerticesGeographicCoordinates <em>Polygon Vertices Geographic Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon Vertices Geographic Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer#getPolygonVerticesGeographicCoordinates()
	 * @see #getGeographicCoordinatesPolygonShapeImageMapLayer()
	 * @generated
	 */
	EReference getGeographicCoordinatesPolygonShapeImageMapLayer_PolygonVerticesGeographicCoordinates();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.SlopeRange <em>Slope Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slope Range</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SlopeRange
	 * @generated
	 */
	EClass getSlopeRange();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.SlopeRange#getSlopeLowerBound <em>Slope Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope Lower Bound</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SlopeRange#getSlopeLowerBound()
	 * @see #getSlopeRange()
	 * @generated
	 */
	EAttribute getSlopeRange_SlopeLowerBound();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.SlopeRange#getSlopeUpperBound <em>Slope Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slope Upper Bound</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SlopeRange#getSlopeUpperBound()
	 * @see #getSlopeRange()
	 * @generated
	 */
	EAttribute getSlopeRange_SlopeUpperBound();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.SlopeRange#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SlopeRange#getColor()
	 * @see #getSlopeRange()
	 * @generated
	 */
	EAttribute getSlopeRange_Color();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.BasicCartesianTriangularMeshMapLayer <em>Basic Cartesian Triangular Mesh Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Cartesian Triangular Mesh Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.BasicCartesianTriangularMeshMapLayer
	 * @generated
	 */
	EClass getBasicCartesianTriangularMeshMapLayer();

		/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.BasicCartesianTriangularMeshMapLayer#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.BasicCartesianTriangularMeshMapLayer#getMesh()
	 * @see #getBasicCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EReference getBasicCartesianTriangularMeshMapLayer_Mesh();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshURLMapLayer <em>Cartesian Triangular Mesh URL Map Layer</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh URL Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshURLMapLayer
	 * @generated
	 */
  EClass getCartesianTriangularMeshURLMapLayer();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshURLMapLayer#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mesh</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshURLMapLayer#getMesh()
	 * @see #getCartesianTriangularMeshURLMapLayer()
	 * @generated
	 */
  EReference getCartesianTriangularMeshURLMapLayer_Mesh();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.FeaturesOfInterestMapLayer <em>Features Of Interest Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Of Interest Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.FeaturesOfInterestMapLayer
	 * @generated
	 */
	EClass getFeaturesOfInterestMapLayer();

		/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.FeaturesOfInterestMapLayer#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.FeaturesOfInterestMapLayer#getFeatures()
	 * @see #getFeaturesOfInterestMapLayer()
	 * @generated
	 */
	EReference getFeaturesOfInterestMapLayer_Features();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.WorksiteNode <em>Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worksite Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.WorksiteNode
	 * @generated
	 */
  EClass getWorksiteNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.WorksiteNode#getWorksite <em>Worksite</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.WorksiteNode#getWorksite()
	 * @see #getWorksiteNode()
	 * @generated
	 */
  EReference getWorksiteNode_Worksite();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceWorksiteNode <em>Surface Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Worksite Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceWorksiteNode
	 * @generated
	 */
  EClass getSurfaceWorksiteNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode <em>Earth Surface Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Surface Worksite Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode
	 * @generated
	 */
  EClass getEarthSurfaceWorksiteNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode#getSkyTransformNode <em>Sky Transform Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sky Transform Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode#getSkyTransformNode()
	 * @see #getEarthSurfaceWorksiteNode()
	 * @generated
	 */
  EReference getEarthSurfaceWorksiteNode_SkyTransformNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.MapsListNode <em>Maps List Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maps List Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapsListNode
	 * @generated
	 */
  EClass getMapsListNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.MapsListNode#getMapsList <em>Maps List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maps List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapsListNode#getMapsList()
	 * @see #getMapsListNode()
	 * @generated
	 */
  EReference getMapsListNode_MapsList();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.MapNode <em>Map Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapNode
	 * @generated
	 */
  EClass getMapNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.MapNode#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapNode#getMap()
	 * @see #getMapNode()
	 * @generated
	 */
  EReference getMapNode_Map();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode <em>Abstract Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Map Layer Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode
	 * @generated
	 */
  EClass getAbstractMapLayerNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode#getAbstractMapLayer <em>Abstract Map Layer</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Map Layer</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode#getAbstractMapLayer()
	 * @see #getAbstractMapLayerNode()
	 * @generated
	 */
  EReference getAbstractMapLayerNode_AbstractMapLayer();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.SkyNode <em>Sky Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sky Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SkyNode
	 * @generated
	 */
  EClass getSkyNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.SkyNode#getSky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sky</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SkyNode#getSky()
	 * @see #getSkyNode()
	 * @generated
	 */
  EReference getSkyNode_Sky();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.EarthSkyNode <em>Earth Sky Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Sky Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSkyNode
	 * @generated
	 */
  EClass getEarthSkyNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayerNode <em>Cartesian Triangular Mesh Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Triangular Mesh Map Layer Node</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayerNode
	 * @generated
	 */
	EClass getCartesianTriangularMeshMapLayerNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayerNode#getCartesianTriangularMeshMapLayer() <em>Get Cartesian Triangular Mesh Map Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cartesian Triangular Mesh Map Layer</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayerNode#getCartesianTriangularMeshMapLayer()
	 * @generated
	 */
	EOperation getCartesianTriangularMeshMapLayerNode__GetCartesianTriangularMeshMapLayer();

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
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
  EDataType getDate();

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
	 * Returns the meta object for data type '{@link javax.vecmath.Color3f <em>Color3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color3f</em>'.
	 * @see javax.vecmath.Color3f
	 * @model instanceClass="javax.vecmath.Color3f"
	 * @generated
	 */
	EDataType getColor3f();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor"
	 * @generated
	 */
	EDataType getIProgressMonitor();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreEnvironmentFactory getApogyCoreEnvironmentFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl <em>Worksite</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getWorksite()
		 * @generated
		 */
    EClass WORKSITE = eINSTANCE.getWorksite();
    /**
		 * The meta object literal for the '<em><b>Worksite Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WORKSITE__WORKSITE_NODE = eINSTANCE.getWorksite_WorksiteNode();
    /**
		 * The meta object literal for the '<em><b>Orbits Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSITE__ORBITS_MODELS = eINSTANCE.getWorksite_OrbitsModels();
				/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WORKSITE__ENVIRONMENT = eINSTANCE.getWorksite_Environment();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SurfaceWorksiteImpl <em>Surface Worksite</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.SurfaceWorksiteImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSurfaceWorksite()
		 * @generated
		 */
    EClass SURFACE_WORKSITE = eINSTANCE.getSurfaceWorksite();
    /**
		 * The meta object literal for the '<em><b>Sky</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SURFACE_WORKSITE__SKY = eINSTANCE.getSurfaceWorksite_Sky();
    /**
		 * The meta object literal for the '<em><b>Maps List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SURFACE_WORKSITE__MAPS_LIST = eINSTANCE.getSurfaceWorksite_MapsList();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceWorksiteImpl <em>Earth Surface Worksite</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceWorksiteImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarthSurfaceWorksite()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.EnvironmentImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEnvironment()
		 * @generated
		 */
    EClass ENVIRONMENT = eINSTANCE.getEnvironment();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SurfaceEnvironmentImpl <em>Surface Environment</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.SurfaceEnvironmentImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSurfaceEnvironment()
		 * @generated
		 */
    EClass SURFACE_ENVIRONMENT = eINSTANCE.getSurfaceEnvironment();
    /**
		 * The meta object literal for the '<em><b>Atmosphere</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SURFACE_ENVIRONMENT__ATMOSPHERE = eINSTANCE.getSurfaceEnvironment_Atmosphere();
    /**
		 * The meta object literal for the '<em><b>Gravity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SURFACE_ENVIRONMENT__GRAVITY = eINSTANCE.getSurfaceEnvironment_Gravity();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceEnvironmentImpl <em>Earth Surface Environment</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceEnvironmentImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarthSurfaceEnvironment()
		 * @generated
		 */
    EClass EARTH_SURFACE_ENVIRONMENT = eINSTANCE.getEarthSurfaceEnvironment();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AtmosphereImpl <em>Atmosphere</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.AtmosphereImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAtmosphere()
		 * @generated
		 */
    EClass ATMOSPHERE = eINSTANCE.getAtmosphere();
    /**
		 * The meta object literal for the '<em><b>Wind Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATMOSPHERE__WIND_SPEED = eINSTANCE.getAtmosphere_WindSpeed();
    /**
		 * The meta object literal for the '<em><b>Wind Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATMOSPHERE__WIND_DIRECTION = eINSTANCE.getAtmosphere_WindDirection();
    /**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATMOSPHERE__TEMPERATURE = eINSTANCE.getAtmosphere_Temperature();
    /**
		 * The meta object literal for the '<em><b>Surface Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATMOSPHERE__SURFACE_PRESSURE = eINSTANCE.getAtmosphere_SurfacePressure();
    /**
		 * The meta object literal for the '<em><b>Surface Density</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATMOSPHERE__SURFACE_DENSITY = eINSTANCE.getAtmosphere_SurfaceDensity();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AtmosphereUtilsImpl <em>Atmosphere Utils</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.AtmosphereUtilsImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAtmosphereUtils()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EquatorialCoordinatesImpl <em>Equatorial Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.EquatorialCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEquatorialCoordinates()
		 * @generated
		 */
    EClass EQUATORIAL_COORDINATES = eINSTANCE.getEquatorialCoordinates();
    /**
		 * The meta object literal for the '<em><b>Right Ascension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EQUATORIAL_COORDINATES__RIGHT_ASCENSION = eINSTANCE.getEquatorialCoordinates_RightAscension();
    /**
		 * The meta object literal for the '<em><b>Declination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EQUATORIAL_COORDINATES__DECLINATION = eINSTANCE.getEquatorialCoordinates_Declination();
    /**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EQUATORIAL_COORDINATES__RADIUS = eINSTANCE.getEquatorialCoordinates_Radius();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.GeographicCoordinatesImpl <em>Geographic Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.GeographicCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getGeographicCoordinates()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.HorizontalCoordinatesImpl <em>Horizontal Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.HorizontalCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getHorizontalCoordinates()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EclipticCoordinatesImpl <em>Ecliptic Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.EclipticCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEclipticCoordinates()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl <em>Sky</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSky()
		 * @generated
		 */
    EClass SKY = eINSTANCE.getSky();
    /**
		 * The meta object literal for the '<em><b>Surface Worksite</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SKY__SURFACE_WORKSITE = eINSTANCE.getSky_SurfaceWorksite();
    /**
		 * The meta object literal for the '<em><b>Sky Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SKY__SKY_NODE = eINSTANCE.getSky_SkyNode();
    /**
		 * The meta object literal for the '<em><b>Sun</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SKY__SUN = eINSTANCE.getSky_Sun();
    /**
		 * The meta object literal for the '<em><b>Sun Horizontal Coordinates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SKY__SUN_HORIZONTAL_COORDINATES = eINSTANCE.getSky_SunHorizontalCoordinates();
    /**
		 * The meta object literal for the '<em><b>Star Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SKY__STAR_FIELD = eINSTANCE.getSky_StarField();
    /**
		 * The meta object literal for the '<em><b>Get Sun Angular Diameter</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation SKY___GET_SUN_ANGULAR_DIAMETER = eINSTANCE.getSky__GetSunAngularDiameter();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSkyImpl <em>Earth Sky</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthSkyImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarthSky()
		 * @generated
		 */
    EClass EARTH_SKY = eINSTANCE.getEarthSky();
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SunImpl <em>Sun</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.SunImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSun()
		 * @generated
		 */
    EClass SUN = eINSTANCE.getSun();
    /**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute SUN__RADIUS = eINSTANCE.getSun_Radius();
    /**
		 * The meta object literal for the '<em><b>Get Irradiance</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation SUN___GET_IRRADIANCE__DOUBLE = eINSTANCE.getSun__GetIrradiance__double();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthImpl <em>Earth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarth()
		 * @generated
		 */
		EClass EARTH = eINSTANCE.getEarth();
				/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH__RADIUS = eINSTANCE.getEarth_Radius();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MoonImpl <em>Moon</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.MoonImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMoon()
		 * @generated
		 */
    EClass MOON = eINSTANCE.getMoon();
    /**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MOON__RADIUS = eINSTANCE.getMoon_Radius();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EnvironmentUtilitiesImpl <em>Environment Utilities</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.EnvironmentUtilitiesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEnvironmentUtilities()
		 * @generated
		 */
    EClass ENVIRONMENT_UTILITIES = eINSTANCE.getEnvironmentUtilities();
    /**
		 * The meta object literal for the '<em><b>Convert To Julian Date</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ENVIRONMENT_UTILITIES___CONVERT_TO_JULIAN_DATE__DATE = eINSTANCE.getEnvironmentUtilities__ConvertToJulianDate__Date();
    /**
		 * The meta object literal for the '<em><b>Parse Right Ascension</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ENVIRONMENT_UTILITIES___PARSE_RIGHT_ASCENSION__STRING = eINSTANCE.getEnvironmentUtilities__ParseRightAscension__String();
    /**
		 * The meta object literal for the '<em><b>Parse Deg Min Sec</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ENVIRONMENT_UTILITIES___PARSE_DEG_MIN_SEC__STRING = eINSTANCE.getEnvironmentUtilities__ParseDegMinSec__String();
    /**
		 * The meta object literal for the '<em><b>Sort By Magnitude</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ENVIRONMENT_UTILITIES___SORT_BY_MAGNITUDE__LIST = eINSTANCE.getEnvironmentUtilities__SortByMagnitude__List();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getApogyCoreEnvironmentFacade()
		 * @generated
		 */
		EClass APOGY_CORE_ENVIRONMENT_FACADE = eINSTANCE.getApogyCoreEnvironmentFacade();
				/**
		 * The meta object literal for the '<em><b>Create And Initialize Stars</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_STARS = eINSTANCE.getApogyCoreEnvironmentFacade__CreateAndInitializeStars();
				/**
		 * The meta object literal for the '<em><b>Create And Initialize Default CSA Worksite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_DEFAULT_CSA_WORKSITE = eINSTANCE.getApogyCoreEnvironmentFacade__CreateAndInitializeDefaultCSAWorksite();
				/**
		 * The meta object literal for the '<em><b>Initialize Sky Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___INITIALIZE_SKY_NODE__SKY_SKYNODE = eINSTANCE.getApogyCoreEnvironmentFacade__InitializeSkyNode__Sky_SkyNode();
				/**
		 * The meta object literal for the '<em><b>Initialize Earth Sky Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___INITIALIZE_EARTH_SKY_NODE__EARTHSKY_EARTHSKYNODE = eINSTANCE.getApogyCoreEnvironmentFacade__InitializeEarthSkyNode__EarthSky_EarthSkyNode();
				/**
		 * The meta object literal for the '<em><b>Get Mars Yard Geographical Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_MARS_YARD_GEOGRAPHICAL_COORDINATES = eINSTANCE.getApogyCoreEnvironmentFacade__GetMarsYardGeographicalCoordinates();
				/**
		 * The meta object literal for the '<em><b>Create Star</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___CREATE_STAR__FLOAT_DOUBLE_DOUBLE = eINSTANCE.getApogyCoreEnvironmentFacade__CreateStar__float_double_double();
				/**
		 * The meta object literal for the '<em><b>Get Mars Yard Transform Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_MARS_YARD_TRANSFORM_NODE = eINSTANCE.getApogyCoreEnvironmentFacade__GetMarsYardTransformNode();
				/**
		 * The meta object literal for the '<em><b>Create And Initialize Earth Surface Environment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_EARTH_SURFACE_ENVIRONMENT = eINSTANCE.getApogyCoreEnvironmentFacade__CreateAndInitializeEarthSurfaceEnvironment();
				/**
		 * The meta object literal for the '<em><b>Create And Initialize Earth Atmosphere</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_EARTH_ATMOSPHERE = eINSTANCE.getApogyCoreEnvironmentFacade__CreateAndInitializeEarthAtmosphere();
				/**
		 * The meta object literal for the '<em><b>Get Sun Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__APOGYSYSTEM_STRING_ENVIRONMENT = eINSTANCE.getApogyCoreEnvironmentFacade__GetSunVector__ApogySystem_String_Environment();
				/**
		 * The meta object literal for the '<em><b>Get Sun Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__NODE_ENVIRONMENT = eINSTANCE.getApogyCoreEnvironmentFacade__GetSunVector__Node_Environment();
				/**
		 * The meta object literal for the '<em><b>Get Moon Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_MOON_VECTOR__APOGYSYSTEM_STRING_ENVIRONMENT = eINSTANCE.getApogyCoreEnvironmentFacade__GetMoonVector__ApogySystem_String_Environment();
				/**
		 * The meta object literal for the '<em><b>Get Moon Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_MOON_VECTOR__NODE_ENVIRONMENT = eINSTANCE.getApogyCoreEnvironmentFacade__GetMoonVector__Node_Environment();
				/**
		 * The meta object literal for the '<em><b>Get Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__NODE_APOGYSYSTEM_CONNECTIONPOINT_ENVIRONMENT = eINSTANCE.getApogyCoreEnvironmentFacade__GetVector__Node_ApogySystem_ConnectionPoint_Environment();
				/**
		 * The meta object literal for the '<em><b>Get Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_APOGYSYSTEM_CONNECTIONPOINT_ENVIRONMENT = eINSTANCE.getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_ApogySystem_ConnectionPoint_Environment();
				/**
		 * The meta object literal for the '<em><b>Get Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_APOGYSYSTEM_STRING_ENVIRONMENT = eINSTANCE.getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_ApogySystem_String_Environment();
				/**
		 * The meta object literal for the '<em><b>Get Vector</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_STRING_STRING_ENVIRONMENT = eINSTANCE.getApogyCoreEnvironmentFacade__GetVector__ApogySystem_String_String_String_Environment();
				/**
		 * The meta object literal for the '<em><b>Create EImage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___CREATE_EIMAGE__LIST = eINSTANCE.getApogyCoreEnvironmentFacade__CreateEImage__List();
				/**
		 * The meta object literal for the '<em><b>Get Absolute Rectangular Region Corners</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_ABSOLUTE_RECTANGULAR_REGION_CORNERS__RECTANGULARREGION = eINSTANCE.getApogyCoreEnvironmentFacade__GetAbsoluteRectangularRegionCorners__RectangularRegion();
				/**
		 * The meta object literal for the '<em><b>Get Best Resolution Rectangular Region Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_RECTANGULAR_REGION_IMAGE__LIST = eINSTANCE.getApogyCoreEnvironmentFacade__GetBestResolutionRectangularRegionImage__List();
				/**
		 * The meta object literal for the '<em><b>Get Rectangular Region Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__RECTANGULARREGIONPROVIDER_TUPLE3D_TUPLE3D = eINSTANCE.getApogyCoreEnvironmentFacade__GetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d();
				/**
		 * The meta object literal for the '<em><b>Get Rectangular Region Image Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__RECTANGULARREGIONIMAGE_TUPLE3D_TUPLE3D = eINSTANCE.getApogyCoreEnvironmentFacade__GetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d();
				/**
		 * The meta object literal for the '<em><b>Get Rectangular Region Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__LIST_TUPLE3D_TUPLE3D = eINSTANCE.getApogyCoreEnvironmentFacade__GetRectangularRegionExtent__List_Tuple3d_Tuple3d();
				/**
		 * The meta object literal for the '<em><b>Get Rectangular Region Image Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__LIST_TUPLE3D_TUPLE3D = eINSTANCE.getApogyCoreEnvironmentFacade__GetRectangularRegionImageExtent__List_Tuple3d_Tuple3d();
				/**
		 * The meta object literal for the '<em><b>Fits Inside</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___FITS_INSIDE__RECTANGULARREGION_RECTANGULARREGION = eINSTANCE.getApogyCoreEnvironmentFacade__FitsInside__RectangularRegion_RectangularRegion();
				/**
		 * The meta object literal for the '<em><b>Intersects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___INTERSECTS__RECTANGULARREGION_RECTANGULARREGION_MATRIX4X4 = eINSTANCE.getApogyCoreEnvironmentFacade__Intersects__RectangularRegion_RectangularRegion_Matrix4x4();
				/**
		 * The meta object literal for the '<em><b>Get Image Map Layer Presentation Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__IMAGEMAPLAYERPRESENTATION_TUPLE3D_TUPLE3D = eINSTANCE.getApogyCoreEnvironmentFacade__GetImageMapLayerPresentationExtent__ImageMapLayerPresentation_Tuple3d_Tuple3d();
				/**
		 * The meta object literal for the '<em><b>Get Image Map Layer Presentation Extent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__LIST_TUPLE3D_TUPLE3D = eINSTANCE.getApogyCoreEnvironmentFacade__GetImageMapLayerPresentationExtent__List_Tuple3d_Tuple3d();
				/**
		 * The meta object literal for the '<em><b>Get Image Map Layer Presentation Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__LIST = eINSTANCE.getApogyCoreEnvironmentFacade__GetImageMapLayerPresentationImage__List();
				/**
		 * The meta object literal for the '<em><b>Get Best Resolution Map Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_MAP_LAYER__LIST = eINSTANCE.getApogyCoreEnvironmentFacade__GetBestResolutionMapLayer__List();
				/**
		 * The meta object literal for the '<em><b>Get Visible Image Map Layer Presentation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_VISIBLE_IMAGE_MAP_LAYER_PRESENTATION__LIST = eINSTANCE.getApogyCoreEnvironmentFacade__GetVisibleImageMapLayerPresentation__List();
				/**
		 * The meta object literal for the '<em><b>Get Rectangular Volume Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___GET_RECTANGULAR_VOLUME_REGION__CARTESIANTRIANGULARMESH = eINSTANCE.getApogyCoreEnvironmentFacade__GetRectangularVolumeRegion__CartesianTriangularMesh();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.StarImpl <em>Star</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.StarImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getStar()
		 * @generated
		 */
    EClass STAR = eINSTANCE.getStar();
    /**
		 * The meta object literal for the '<em><b>Magnitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STAR__MAGNITUDE = eINSTANCE.getStar_Magnitude();
    /**
		 * The meta object literal for the '<em><b>Equatorial Coordinates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference STAR__EQUATORIAL_COORDINATES = eINSTANCE.getStar_EquatorialCoordinates();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.StarFieldImpl <em>Star Field</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.StarFieldImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getStarField()
		 * @generated
		 */
    EClass STAR_FIELD = eINSTANCE.getStarField();
    /**
		 * The meta object literal for the '<em><b>Stars</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference STAR_FIELD__STARS = eINSTANCE.getStarField_Stars();
    /**
		 * The meta object literal for the '<em><b>Star Field File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STAR_FIELD__STAR_FIELD_FILE_NAME = eINSTANCE.getStarField_StarFieldFileName();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AstronomyUtilsImpl <em>Astronomy Utils</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.AstronomyUtilsImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAstronomyUtils()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.MapImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMap()
		 * @generated
		 */
    EClass MAP = eINSTANCE.getMap();
    /**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAP__TRANSFORMATION = eINSTANCE.getMap_Transformation();
    /**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAP__LAYERS = eINSTANCE.getMap_Layers();
    /**
		 * The meta object literal for the '<em><b>Map Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAP__MAP_NODE = eINSTANCE.getMap_MapNode();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MapsListImpl <em>Maps List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.MapsListImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMapsList()
		 * @generated
		 */
    EClass MAPS_LIST = eINSTANCE.getMapsList();
    /**
		 * The meta object literal for the '<em><b>Maps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAPS_LIST__MAPS = eINSTANCE.getMapsList_Maps();
    /**
		 * The meta object literal for the '<em><b>Maps List Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAPS_LIST__MAPS_LIST_NODE = eINSTANCE.getMapsList_MapsListNode();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerImpl <em>Abstract Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractMapLayer()
		 * @generated
		 */
    EClass ABSTRACT_MAP_LAYER = eINSTANCE.getAbstractMapLayer();
    /**
		 * The meta object literal for the '<em><b>Map</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_MAP_LAYER__MAP = eINSTANCE.getAbstractMapLayer_Map();
    /**
		 * The meta object literal for the '<em><b>Abstract Map Layer Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = eINSTANCE.getAbstractMapLayer_AbstractMapLayerNode();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MapLayerPresentationImpl <em>Map Layer Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.MapLayerPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMapLayerPresentation()
		 * @generated
		 */
		EClass MAP_LAYER_PRESENTATION = eINSTANCE.getMapLayerPresentation();
				/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_LAYER_PRESENTATION__VISIBLE = eINSTANCE.getMapLayerPresentation_Visible();
				/**
		 * The meta object literal for the '<em><b>Map Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_LAYER_PRESENTATION__MAP_LAYER = eINSTANCE.getMapLayerPresentation_MapLayer();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.URLMapLayerImpl <em>URL Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.URLMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getURLMapLayer()
		 * @generated
		 */
    EClass URL_MAP_LAYER = eINSTANCE.getURLMapLayer();
    /**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute URL_MAP_LAYER__URL = eINSTANCE.getURLMapLayer_Url();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.RegionImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRegion()
		 * @generated
		 */
    EClass REGION = eINSTANCE.getRegion();
    /**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REGION__TRANSFORMATION = eINSTANCE.getRegion_Transformation();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.RectangularRegionImpl <em>Rectangular Region</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.RectangularRegionImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRectangularRegion()
		 * @generated
		 */
    EClass RECTANGULAR_REGION = eINSTANCE.getRectangularRegion();
    /**
		 * The meta object literal for the '<em><b>XMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RECTANGULAR_REGION__XMIN = eINSTANCE.getRectangularRegion_XMin();
    /**
		 * The meta object literal for the '<em><b>XMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RECTANGULAR_REGION__XMAX = eINSTANCE.getRectangularRegion_XMax();
    /**
		 * The meta object literal for the '<em><b>YMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RECTANGULAR_REGION__YMIN = eINSTANCE.getRectangularRegion_YMin();
    /**
		 * The meta object literal for the '<em><b>YMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RECTANGULAR_REGION__YMAX = eINSTANCE.getRectangularRegion_YMax();
    /**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RECTANGULAR_REGION__XDIMENSION = eINSTANCE.getRectangularRegion_XDimension();
    /**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RECTANGULAR_REGION__YDIMENSION = eINSTANCE.getRectangularRegion_YDimension();
    /**
		 * The meta object literal for the '<em><b>Lower Left Corner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECTANGULAR_REGION__LOWER_LEFT_CORNER = eINSTANCE.getRectangularRegion_LowerLeftCorner();
    /**
		 * The meta object literal for the '<em><b>Upper Left Corner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECTANGULAR_REGION__UPPER_LEFT_CORNER = eINSTANCE.getRectangularRegion_UpperLeftCorner();
    /**
		 * The meta object literal for the '<em><b>Lower Right Corner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECTANGULAR_REGION__LOWER_RIGHT_CORNER = eINSTANCE.getRectangularRegion_LowerRightCorner();
    /**
		 * The meta object literal for the '<em><b>Upper Right Corner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECTANGULAR_REGION__UPPER_RIGHT_CORNER = eINSTANCE.getRectangularRegion_UpperRightCorner();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.RectangularVolumeRegionImpl <em>Rectangular Volume Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.RectangularVolumeRegionImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRectangularVolumeRegion()
		 * @generated
		 */
		EClass RECTANGULAR_VOLUME_REGION = eINSTANCE.getRectangularVolumeRegion();
				/**
		 * The meta object literal for the '<em><b>ZMin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_VOLUME_REGION__ZMIN = eINSTANCE.getRectangularVolumeRegion_ZMin();
				/**
		 * The meta object literal for the '<em><b>ZMax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_VOLUME_REGION__ZMAX = eINSTANCE.getRectangularVolumeRegion_ZMax();
				/**
		 * The meta object literal for the '<em><b>ZDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGULAR_VOLUME_REGION__ZDIMENSION = eINSTANCE.getRectangularVolumeRegion_ZDimension();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider <em>Rectangular Region Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRectangularRegionProvider()
		 * @generated
		 */
		EClass RECTANGULAR_REGION_PROVIDER = eINSTANCE.getRectangularRegionProvider();
				/**
		 * The meta object literal for the '<em><b>Get Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECTANGULAR_REGION_PROVIDER___GET_REGION = eINSTANCE.getRectangularRegionProvider__GetRegion();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage <em>Rectangular Region Image</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRectangularRegionImage()
		 * @generated
		 */
    EClass RECTANGULAR_REGION_IMAGE = eINSTANCE.getRectangularRegionImage();
    /**
		 * The meta object literal for the '<em><b>Get Region Image</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation RECTANGULAR_REGION_IMAGE___GET_REGION_IMAGE = eINSTANCE.getRectangularRegionImage__GetRegionImage();
    /**
		 * The meta object literal for the '<em><b>Get Resolution</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation RECTANGULAR_REGION_IMAGE___GET_RESOLUTION = eINSTANCE.getRectangularRegionImage__GetResolution();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.ImageMapLayerImpl <em>Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getImageMapLayer()
		 * @generated
		 */
    EClass IMAGE_MAP_LAYER = eINSTANCE.getImageMapLayer();
    /**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IMAGE_MAP_LAYER__WIDTH = eINSTANCE.getImageMapLayer_Width();
    /**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IMAGE_MAP_LAYER__HEIGHT = eINSTANCE.getImageMapLayer_Height();
    /**
		 * The meta object literal for the '<em><b>Opaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IMAGE_MAP_LAYER__OPAQUE = eINSTANCE.getImageMapLayer_Opaque();
    /**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IMAGE_MAP_LAYER__IMAGE = eINSTANCE.getImageMapLayer_Image();
    /**
		 * The meta object literal for the '<em><b>Legend</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference IMAGE_MAP_LAYER__LEGEND = eINSTANCE.getImageMapLayer_Legend();
    /**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IMAGE_MAP_LAYER__RESOLUTION = eINSTANCE.getImageMapLayer_Resolution();
    /**
		 * The meta object literal for the '<em><b>Update Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = eINSTANCE.getImageMapLayer__UpdateImage__IProgressMonitor();
				/**
		 * The meta object literal for the '<em><b>Get Image Map Layer Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = eINSTANCE.getImageMapLayer__GetImageMapLayerRegion();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.ImageMapLayerPresentationImpl <em>Image Map Layer Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ImageMapLayerPresentationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getImageMapLayerPresentation()
		 * @generated
		 */
		EClass IMAGE_MAP_LAYER_PRESENTATION = eINSTANCE.getImageMapLayerPresentation();
				/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MAP_LAYER_PRESENTATION__ALPHA = eINSTANCE.getImageMapLayerPresentation_Alpha();
				/**
		 * The meta object literal for the '<em><b>Get Image Map Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_MAP_LAYER_PRESENTATION___GET_IMAGE_MAP_LAYER = eINSTANCE.getImageMapLayerPresentation__GetImageMapLayer();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.URLImageMapLayerImpl <em>URL Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.URLImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getURLImageMapLayer()
		 * @generated
		 */
    EClass URL_IMAGE_MAP_LAYER = eINSTANCE.getURLImageMapLayer();
    /**
		 * The meta object literal for the '<em><b>Legend URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute URL_IMAGE_MAP_LAYER__LEGEND_URL = eINSTANCE.getURLImageMapLayer_LegendURL();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.TopologyTreeMapLayerImpl <em>Topology Tree Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.TopologyTreeMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getTopologyTreeMapLayer()
		 * @generated
		 */
		EClass TOPOLOGY_TREE_MAP_LAYER = eINSTANCE.getTopologyTreeMapLayer();
				/**
		 * The meta object literal for the '<em><b>Topology Tree Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT = eINSTANCE.getTopologyTreeMapLayer_TopologyTreeRoot();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.TopologyTreeMapLayerNodeImpl <em>Topology Tree Map Layer Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.TopologyTreeMapLayerNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getTopologyTreeMapLayerNode()
		 * @generated
		 */
		EClass TOPOLOGY_TREE_MAP_LAYER_NODE = eINSTANCE.getTopologyTreeMapLayerNode();
				/**
		 * The meta object literal for the '<em><b>Topology Tree Map Layer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER = eINSTANCE.getTopologyTreeMapLayerNode_TopologyTreeMapLayer();
				/**
		 * The meta object literal for the '<em><b>Transient Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT = eINSTANCE.getTopologyTreeMapLayerNode_TransientParent();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshMapLayerImpl <em>Cartesian Triangular Mesh Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshMapLayer();
				/**
		 * The meta object literal for the '<em><b>Mesh Is Dirty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY = eINSTANCE.getCartesianTriangularMeshMapLayer_MeshIsDirty();
				/**
		 * The meta object literal for the '<em><b>Map Layer Presentations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS = eINSTANCE.getCartesianTriangularMeshMapLayer_MapLayerPresentations();
				/**
		 * The meta object literal for the '<em><b>Texture Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE = eINSTANCE.getCartesianTriangularMeshMapLayer_TextureImage();
				/**
		 * The meta object literal for the '<em><b>Cartesian Triangular Mesh Map Layer Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = eINSTANCE.getCartesianTriangularMeshMapLayer_CartesianTriangularMeshMapLayerNode();
				/**
		 * The meta object literal for the '<em><b>Get Current Mesh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH = eINSTANCE.getCartesianTriangularMeshMapLayer__GetCurrentMesh();
				/**
		 * The meta object literal for the '<em><b>Force Update Texture Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE = eINSTANCE.getCartesianTriangularMeshMapLayer__ForceUpdateTextureImage();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshDerivedImageMapLayerImpl <em>Cartesian Triangular Mesh Derived Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshDerivedImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshDerivedImageMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshDerivedImageMapLayer();
				/**
		 * The meta object literal for the '<em><b>Required Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = eINSTANCE.getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution();
				/**
		 * The meta object literal for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshSlopeImageMapLayerImpl <em>Cartesian Triangular Mesh Slope Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshSlopeImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshSlopeImageMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshSlopeImageMapLayer();
				/**
		 * The meta object literal for the '<em><b>Auto Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE = eINSTANCE.getCartesianTriangularMeshSlopeImageMapLayer_AutoScale();
				/**
		 * The meta object literal for the '<em><b>Minimum Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE = eINSTANCE.getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope();
				/**
		 * The meta object literal for the '<em><b>Maximum Slope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE = eINSTANCE.getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl <em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshDiscreteSlopeImageMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshDiscreteSlopeImageMapLayer();
				/**
		 * The meta object literal for the '<em><b>Slope Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES = eINSTANCE.getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshHeightImageMapLayerImpl <em>Cartesian Triangular Mesh Height Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshHeightImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshHeightImageMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshHeightImageMapLayer();
				/**
		 * The meta object literal for the '<em><b>Auto Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE = eINSTANCE.getCartesianTriangularMeshHeightImageMapLayer_AutoScale();
				/**
		 * The meta object literal for the '<em><b>Minimum Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT = eINSTANCE.getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight();
				/**
		 * The meta object literal for the '<em><b>Maximum Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT = eINSTANCE.getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.LineOfSightImageMapLayerImpl <em>Line Of Sight Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.LineOfSightImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getLineOfSightImageMapLayer()
		 * @generated
		 */
		EClass LINE_OF_SIGHT_IMAGE_MAP_LAYER = eINSTANCE.getLineOfSightImageMapLayer();
				/**
		 * The meta object literal for the '<em><b>Line Of Sight Available Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR = eINSTANCE.getLineOfSightImageMapLayer_LineOfSightAvailableColor();
				/**
		 * The meta object literal for the '<em><b>Line Of Sight Not Available Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR = eINSTANCE.getLineOfSightImageMapLayer_LineOfSightNotAvailableColor();
				/**
		 * The meta object literal for the '<em><b>Observer Pose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE = eINSTANCE.getLineOfSightImageMapLayer_ObserverPose();
				/**
		 * The meta object literal for the '<em><b>Target Height Above Ground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND = eINSTANCE.getLineOfSightImageMapLayer_TargetHeightAboveGround();
				/**
		 * The meta object literal for the '<em><b>Use Height Perpendicular To Ground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND = eINSTANCE.getLineOfSightImageMapLayer_UseHeightPerpendicularToGround();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractShapeImageLayerImpl <em>Abstract Shape Image Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractShapeImageLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractShapeImageLayer()
		 * @generated
		 */
		EClass ABSTRACT_SHAPE_IMAGE_LAYER = eINSTANCE.getAbstractShapeImageLayer();
				/**
		 * The meta object literal for the '<em><b>Shaped Filled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED = eINSTANCE.getAbstractShapeImageLayer_ShapedFilled();
				/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHAPE_IMAGE_LAYER__COLOR = eINSTANCE.getAbstractShapeImageLayer_Color();
				/**
		 * The meta object literal for the '<em><b>Required Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION = eINSTANCE.getAbstractShapeImageLayer_RequiredResolution();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EllipseShapeImageLayerImpl <em>Ellipse Shape Image Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.EllipseShapeImageLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEllipseShapeImageLayer()
		 * @generated
		 */
		EClass ELLIPSE_SHAPE_IMAGE_LAYER = eINSTANCE.getEllipseShapeImageLayer();
				/**
		 * The meta object literal for the '<em><b>Ellipse Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_WIDTH = eINSTANCE.getEllipseShapeImageLayer_EllipseWidth();
				/**
		 * The meta object literal for the '<em><b>Ellipse Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_HEIGHT = eINSTANCE.getEllipseShapeImageLayer_EllipseHeight();
				/**
		 * The meta object literal for the '<em><b>Show Center Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES = eINSTANCE.getEllipseShapeImageLayer_ShowCenterLines();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.RectangleShapeImageLayerImpl <em>Rectangle Shape Image Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.RectangleShapeImageLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getRectangleShapeImageLayer()
		 * @generated
		 */
		EClass RECTANGLE_SHAPE_IMAGE_LAYER = eINSTANCE.getRectangleShapeImageLayer();
				/**
		 * The meta object literal for the '<em><b>Rectangle Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH = eINSTANCE.getRectangleShapeImageLayer_RectangleWidth();
				/**
		 * The meta object literal for the '<em><b>Rectangle Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT = eINSTANCE.getRectangleShapeImageLayer_RectangleHeight();
				/**
		 * The meta object literal for the '<em><b>Show Center Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES = eINSTANCE.getRectangleShapeImageLayer_ShowCenterLines();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.PolygonShapeImageMapLayerImpl <em>Polygon Shape Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.PolygonShapeImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getPolygonShapeImageMapLayer()
		 * @generated
		 */
		EClass POLYGON_SHAPE_IMAGE_MAP_LAYER = eINSTANCE.getPolygonShapeImageMapLayer();
				/**
		 * The meta object literal for the '<em><b>Get Vertices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES = eINSTANCE.getPolygonShapeImageMapLayer__GetVertices();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianCoordinatesPolygonShapeImageMapLayerImpl <em>Cartesian Coordinates Polygon Shape Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianCoordinatesPolygonShapeImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianCoordinatesPolygonShapeImageMapLayer()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER = eINSTANCE.getCartesianCoordinatesPolygonShapeImageMapLayer();
				/**
		 * The meta object literal for the '<em><b>Polygon Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES = eINSTANCE.getCartesianCoordinatesPolygonShapeImageMapLayer_PolygonVertices();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.GeographicCoordinatesPolygonShapeImageMapLayerImpl <em>Geographic Coordinates Polygon Shape Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.GeographicCoordinatesPolygonShapeImageMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getGeographicCoordinatesPolygonShapeImageMapLayer()
		 * @generated
		 */
		EClass GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER = eINSTANCE.getGeographicCoordinatesPolygonShapeImageMapLayer();
				/**
		 * The meta object literal for the '<em><b>Polygon Vertices Geographic Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES_GEOGRAPHIC_COORDINATES = eINSTANCE.getGeographicCoordinatesPolygonShapeImageMapLayer_PolygonVerticesGeographicCoordinates();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SlopeRangeImpl <em>Slope Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.SlopeRangeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSlopeRange()
		 * @generated
		 */
		EClass SLOPE_RANGE = eINSTANCE.getSlopeRange();
				/**
		 * The meta object literal for the '<em><b>Slope Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOPE_RANGE__SLOPE_LOWER_BOUND = eINSTANCE.getSlopeRange_SlopeLowerBound();
				/**
		 * The meta object literal for the '<em><b>Slope Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOPE_RANGE__SLOPE_UPPER_BOUND = eINSTANCE.getSlopeRange_SlopeUpperBound();
				/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOPE_RANGE__COLOR = eINSTANCE.getSlopeRange_Color();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.BasicCartesianTriangularMeshMapLayerImpl <em>Basic Cartesian Triangular Mesh Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.BasicCartesianTriangularMeshMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getBasicCartesianTriangularMeshMapLayer()
		 * @generated
		 */
		EClass BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = eINSTANCE.getBasicCartesianTriangularMeshMapLayer();
				/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH = eINSTANCE.getBasicCartesianTriangularMeshMapLayer_Mesh();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshURLMapLayerImpl <em>Cartesian Triangular Mesh URL Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshURLMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshURLMapLayer()
		 * @generated
		 */
    EClass CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshURLMapLayer();
    /**
		 * The meta object literal for the '<em><b>Mesh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH = eINSTANCE.getCartesianTriangularMeshURLMapLayer_Mesh();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.FeaturesOfInterestMapLayerImpl <em>Features Of Interest Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.FeaturesOfInterestMapLayerImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getFeaturesOfInterestMapLayer()
		 * @generated
		 */
		EClass FEATURES_OF_INTEREST_MAP_LAYER = eINSTANCE.getFeaturesOfInterestMapLayer();
				/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES_OF_INTEREST_MAP_LAYER__FEATURES = eINSTANCE.getFeaturesOfInterestMapLayer_Features();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteNodeImpl <em>Worksite Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.WorksiteNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getWorksiteNode()
		 * @generated
		 */
    EClass WORKSITE_NODE = eINSTANCE.getWorksiteNode();
    /**
		 * The meta object literal for the '<em><b>Worksite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference WORKSITE_NODE__WORKSITE = eINSTANCE.getWorksiteNode_Worksite();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SurfaceWorksiteNodeImpl <em>Surface Worksite Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.SurfaceWorksiteNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSurfaceWorksiteNode()
		 * @generated
		 */
    EClass SURFACE_WORKSITE_NODE = eINSTANCE.getSurfaceWorksiteNode();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceWorksiteNodeImpl <em>Earth Surface Worksite Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceWorksiteNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarthSurfaceWorksiteNode()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MapsListNodeImpl <em>Maps List Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.MapsListNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMapsListNode()
		 * @generated
		 */
    EClass MAPS_LIST_NODE = eINSTANCE.getMapsListNode();
    /**
		 * The meta object literal for the '<em><b>Maps List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAPS_LIST_NODE__MAPS_LIST = eINSTANCE.getMapsListNode_MapsList();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MapNodeImpl <em>Map Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.MapNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMapNode()
		 * @generated
		 */
    EClass MAP_NODE = eINSTANCE.getMapNode();
    /**
		 * The meta object literal for the '<em><b>Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAP_NODE__MAP = eINSTANCE.getMapNode_Map();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerNodeImpl <em>Abstract Map Layer Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractMapLayerNode()
		 * @generated
		 */
    EClass ABSTRACT_MAP_LAYER_NODE = eINSTANCE.getAbstractMapLayerNode();
    /**
		 * The meta object literal for the '<em><b>Abstract Map Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER = eINSTANCE.getAbstractMapLayerNode_AbstractMapLayer();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyNodeImpl <em>Sky Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.SkyNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSkyNode()
		 * @generated
		 */
    EClass SKY_NODE = eINSTANCE.getSkyNode();
    /**
		 * The meta object literal for the '<em><b>Sky</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference SKY_NODE__SKY = eINSTANCE.getSkyNode_Sky();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSkyNodeImpl <em>Earth Sky Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthSkyNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarthSkyNode()
		 * @generated
		 */
    EClass EARTH_SKY_NODE = eINSTANCE.getEarthSkyNode();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshMapLayerNodeImpl <em>Cartesian Triangular Mesh Map Layer Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.CartesianTriangularMeshMapLayerNodeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCartesianTriangularMeshMapLayerNode()
		 * @generated
		 */
		EClass CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE = eINSTANCE.getCartesianTriangularMeshMapLayerNode();
				/**
		 * The meta object literal for the '<em><b>Get Cartesian Triangular Mesh Map Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE___GET_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = eINSTANCE.getCartesianTriangularMeshMapLayerNode__GetCartesianTriangularMeshMapLayer();
				/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getList()
		 * @generated
		 */
    EDataType LIST = eINSTANCE.getList();
    /**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSortedSet()
		 * @generated
		 */
    EDataType SORTED_SET = eINSTANCE.getSortedSet();
    /**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getDate()
		 * @generated
		 */
    EDataType DATE = eINSTANCE.getDate();
    /**
		 * The meta object literal for the '<em>Point3d</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3d
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getPoint3d()
		 * @generated
		 */
    EDataType POINT3D = eINSTANCE.getPoint3d();
				/**
		 * The meta object literal for the '<em>Color3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Color3f
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getColor3f()
		 * @generated
		 */
		EDataType COLOR3F = eINSTANCE.getColor3f();
				/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

  }

} //ApogyCoreEnvironmentPackage
