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
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

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
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreEnvironment' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCoreEnvironment' complianceLevel='6.0' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.core.environment/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.environment.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core'"
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.ApogyEnvironmentImpl <em>Apogy Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyEnvironmentImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getApogyEnvironment()
	 * @generated
	 */
	int APOGY_ENVIRONMENT = 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__NAME = ApogyCoreInvocatorPackage.ENVIRONMENT__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__DESCRIPTION = ApogyCoreInvocatorPackage.ENVIRONMENT__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__INVOCATOR_SESSION = ApogyCoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION;

		/**
	 * The feature id for the '<em><b>Local Types List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__LOCAL_TYPES_LIST = ApogyCoreInvocatorPackage.ENVIRONMENT__LOCAL_TYPES_LIST;

		/**
	 * The feature id for the '<em><b>Variables List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__VARIABLES_LIST = ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST;

		/**
	 * The feature id for the '<em><b>Contexts List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__CONTEXTS_LIST = ApogyCoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST;

		/**
	 * The feature id for the '<em><b>Active Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__ACTIVE_CONTEXT = ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__TIME = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Worksites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__WORKSITES_LIST = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Active Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__ACTIVE_WORKSITE = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Time Sources List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__TIME_SOURCES_LIST = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Active Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__ACTIVE_TIME_SOURCE = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Environment Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT__ENVIRONMENT_ITEMS = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 5;

		/**
	 * The number of structural features of the '<em>Apogy Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT_FEATURE_COUNT = ApogyCoreInvocatorPackage.ENVIRONMENT_FEATURE_COUNT + 6;

		/**
	 * The number of operations of the '<em>Apogy Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_ENVIRONMENT_OPERATION_COUNT = ApogyCoreInvocatorPackage.ENVIRONMENT_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractApogyEnvironmentItemImpl <em>Abstract Apogy Environment Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractApogyEnvironmentItemImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractApogyEnvironmentItem()
	 * @generated
	 */
	int ABSTRACT_APOGY_ENVIRONMENT_ITEM = 1;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APOGY_ENVIRONMENT_ITEM__NAME = ApogyCommonEMFPackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APOGY_ENVIRONMENT_ITEM__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Abstract Apogy Environment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APOGY_ENVIRONMENT_ITEM_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

		/**
	 * The number of operations of the '<em>Abstract Apogy Environment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APOGY_ENVIRONMENT_ITEM_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.TimeSourcesListImpl <em>Time Sources List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.TimeSourcesListImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getTimeSourcesList()
	 * @generated
	 */
	int TIME_SOURCES_LIST = 2;

		/**
	 * The feature id for the '<em><b>Environment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST__ENVIRONMENT = 0;

		/**
	 * The feature id for the '<em><b>Time Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST__TIME_SOURCES = 1;

		/**
	 * The number of structural features of the '<em>Time Sources List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST_FEATURE_COUNT = 2;

		/**
	 * The number of operations of the '<em>Time Sources List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCES_LIST_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractWorksiteImpl <em>Abstract Worksite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractWorksiteImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractWorksite()
	 * @generated
	 */
	int ABSTRACT_WORKSITE = 5;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__NAME = ApogyCommonEMFPackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__TIME = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE__WORKSITES_LIST = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Abstract Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

		/**
	 * The number of operations of the '<em>Abstract Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORKSITE_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl <em>Worksite</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getWorksite()
	 * @generated
	 */
  int WORKSITE = 3;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITE__NAME = ABSTRACT_WORKSITE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITE__DESCRIPTION = ABSTRACT_WORKSITE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITE__TIME = ABSTRACT_WORKSITE__TIME;

		/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE__WORKSITES_LIST = ABSTRACT_WORKSITE__WORKSITES_LIST;

  /**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE__WORKSITE_NODE = ABSTRACT_WORKSITE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Sky</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITE__SKY = ABSTRACT_WORKSITE_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Worksite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_FEATURE_COUNT = ABSTRACT_WORKSITE_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Worksite</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int WORKSITE_OPERATION_COUNT = ABSTRACT_WORKSITE_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksitesListImpl <em>Worksites List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.WorksitesListImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getWorksitesList()
	 * @generated
	 */
	int WORKSITES_LIST = 4;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Worksites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST__WORKSITES = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Worksites List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

		/**
	 * The number of operations of the '<em>Worksites List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSITES_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractSurfaceLocationImpl <em>Abstract Surface Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractSurfaceLocationImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractSurfaceLocation()
	 * @generated
	 */
	int ABSTRACT_SURFACE_LOCATION = 6;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_LOCATION__NAME = ApogyCommonEMFPackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_LOCATION__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Abstract Surface Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_LOCATION_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The number of operations of the '<em>Abstract Surface Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SURFACE_LOCATION_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SurfaceLocationsListImpl <em>Surface Locations List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.SurfaceLocationsListImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSurfaceLocationsList()
	 * @generated
	 */
	int SURFACE_LOCATIONS_LIST = 7;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_LOCATIONS_LIST__NAME = ApogyCommonEMFPackage.NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_LOCATIONS_LIST__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Surface Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_LOCATIONS_LIST__SURFACE_LOCATIONS = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Surface Locations List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_LOCATIONS_LIST_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

		/**
	 * The number of operations of the '<em>Surface Locations List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURFACE_LOCATIONS_LIST_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EquatorialCoordinatesImpl <em>Equatorial Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EquatorialCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEquatorialCoordinates()
	 * @generated
	 */
  int EQUATORIAL_COORDINATES = 17;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl <em>Sky</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSky()
	 * @generated
	 */
  int SKY = 8;

  /**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY__TIME = ApogyCommonEMFPackage.TIMED__TIME;

  /**
	 * The feature id for the '<em><b>Worksite</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKY__WORKSITE = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Star Field</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY__STAR_FIELD = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Sky</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SKY_FEATURE_COUNT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 4;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CelestialBodyImpl <em>Celestial Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.CelestialBodyImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCelestialBody()
	 * @generated
	 */
	int CELESTIAL_BODY = 9;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELESTIAL_BODY__PARENT = ApogyCommonTopologyPackage.GROUP_NODE__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELESTIAL_BODY__DESCRIPTION = ApogyCommonTopologyPackage.GROUP_NODE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELESTIAL_BODY__NODE_ID = ApogyCommonTopologyPackage.GROUP_NODE__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELESTIAL_BODY__CHILDREN = ApogyCommonTopologyPackage.GROUP_NODE__CHILDREN;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELESTIAL_BODY__NAME = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Mean Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELESTIAL_BODY__MEAN_RADIUS = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Celestial Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELESTIAL_BODY_FEATURE_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_FEATURE_COUNT + 2;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELESTIAL_BODY___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.GROUP_NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Celestial Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELESTIAL_BODY_OPERATION_COUNT = ApogyCommonTopologyPackage.GROUP_NODE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SunImpl <em>Sun</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.SunImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSun()
	 * @generated
	 */
  int SUN = 10;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN__PARENT = CELESTIAL_BODY__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN__DESCRIPTION = CELESTIAL_BODY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN__NODE_ID = CELESTIAL_BODY__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN__CHILDREN = CELESTIAL_BODY__CHILDREN;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN__NAME = CELESTIAL_BODY__NAME;

		/**
	 * The feature id for the '<em><b>Mean Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN__MEAN_RADIUS = CELESTIAL_BODY__MEAN_RADIUS;

		/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN__RADIUS = CELESTIAL_BODY_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Sun</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_FEATURE_COUNT = CELESTIAL_BODY_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN___ACCEPT__INODEVISITOR = CELESTIAL_BODY___ACCEPT__INODEVISITOR;

  /**
	 * The operation id for the '<em>Get Irradiance</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN___GET_IRRADIANCE__DOUBLE = CELESTIAL_BODY_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Sun</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_OPERATION_COUNT = CELESTIAL_BODY_OPERATION_COUNT + 1;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthImpl <em>Earth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EarthImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEarth()
	 * @generated
	 */
	int EARTH = 11;

		/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__PARENT = CELESTIAL_BODY__PARENT;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__DESCRIPTION = CELESTIAL_BODY__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__NODE_ID = CELESTIAL_BODY__NODE_ID;

		/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__CHILDREN = CELESTIAL_BODY__CHILDREN;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__NAME = CELESTIAL_BODY__NAME;

		/**
	 * The feature id for the '<em><b>Mean Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__MEAN_RADIUS = CELESTIAL_BODY__MEAN_RADIUS;

		/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH__RADIUS = CELESTIAL_BODY_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Earth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_FEATURE_COUNT = CELESTIAL_BODY_FEATURE_COUNT + 1;

		/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH___ACCEPT__INODEVISITOR = CELESTIAL_BODY___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Earth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_OPERATION_COUNT = CELESTIAL_BODY_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.MoonImpl <em>Moon</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.MoonImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getMoon()
	 * @generated
	 */
  int MOON = 12;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON__PARENT = CELESTIAL_BODY__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON__DESCRIPTION = CELESTIAL_BODY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON__NODE_ID = CELESTIAL_BODY__NODE_ID;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON__CHILDREN = CELESTIAL_BODY__CHILDREN;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON__NAME = CELESTIAL_BODY__NAME;

		/**
	 * The feature id for the '<em><b>Mean Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON__MEAN_RADIUS = CELESTIAL_BODY__MEAN_RADIUS;

		/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON__RADIUS = CELESTIAL_BODY_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Moon</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_FEATURE_COUNT = CELESTIAL_BODY_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON___ACCEPT__INODEVISITOR = CELESTIAL_BODY___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Moon</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_OPERATION_COUNT = CELESTIAL_BODY_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.EnvironmentUtilitiesImpl <em>Environment Utilities</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.EnvironmentUtilitiesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getEnvironmentUtilities()
	 * @generated
	 */
  int ENVIRONMENT_UTILITIES = 13;

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
	int APOGY_CORE_ENVIRONMENT_FACADE = 14;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Create Star</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___CREATE_STAR__FLOAT_DOUBLE_DOUBLE = 0;

		/**
	 * The operation id for the '<em>Create And Initialize Stars</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_STARS = 1;

		/**
	 * The operation id for the '<em>Sort By Magnitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___SORT_BY_MAGNITUDE__LIST = 2;

		/**
	 * The operation id for the '<em>Initialize Sky Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___INITIALIZE_SKY_NODE__SKY_SKYNODE = 3;

		/**
	 * The operation id for the '<em>Get Sun Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__APOGYSYSTEM_STRING_ENVIRONMENT = 4;

		/**
	 * The operation id for the '<em>Get Sun Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_SUN_VECTOR__NODE_ENVIRONMENT = 5;

		/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__NODE_APOGYSYSTEM_CONNECTIONPOINT_ENVIRONMENT = 6;

		/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_APOGYSYSTEM_CONNECTIONPOINT_ENVIRONMENT = 7;

		/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_APOGYSYSTEM_STRING_ENVIRONMENT = 8;

		/**
	 * The operation id for the '<em>Get Vector</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE___GET_VECTOR__APOGYSYSTEM_STRING_STRING_STRING_ENVIRONMENT = 9;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_FACADE_OPERATION_COUNT = 10;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.StarImpl <em>Star</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.StarImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getStar()
	 * @generated
	 */
  int STAR = 15;

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
  int STAR_FIELD = 16;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteNodeImpl <em>Worksite Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.WorksiteNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getWorksiteNode()
	 * @generated
	 */
  int WORKSITE_NODE = 18;

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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyNodeImpl <em>Sky Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.SkyNodeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSkyNode()
	 * @generated
	 */
  int SKY_NODE = 19;

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
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getList()
	 * @generated
	 */
  int LIST = 20;

  /**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSortedSet()
	 * @generated
	 */
  int SORTED_SET = 21;

  /**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getDate()
	 * @generated
	 */
  int DATE = 22;

  /**
	 * The meta object id for the '<em>Point3d</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3d
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getPoint3d()
	 * @generated
	 */
  int POINT3D = 23;


  /**
	 * The meta object id for the '<em>Color3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Color3f
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getColor3f()
	 * @generated
	 */
	int COLOR3F = 24;


		/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 25;


		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment <em>Apogy Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apogy Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment
	 * @generated
	 */
	EClass getApogyEnvironment();

		/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getWorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Worksites List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getWorksitesList()
	 * @see #getApogyEnvironment()
	 * @generated
	 */
	EReference getApogyEnvironment_WorksitesList();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getActiveWorksite <em>Active Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getActiveWorksite()
	 * @see #getApogyEnvironment()
	 * @generated
	 */
	EReference getApogyEnvironment_ActiveWorksite();

		/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getTimeSourcesList <em>Time Sources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Sources List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getTimeSourcesList()
	 * @see #getApogyEnvironment()
	 * @generated
	 */
	EReference getApogyEnvironment_TimeSourcesList();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getActiveTimeSource <em>Active Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Time Source</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getActiveTimeSource()
	 * @see #getApogyEnvironment()
	 * @generated
	 */
	EReference getApogyEnvironment_ActiveTimeSource();

		/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getEnvironmentItems <em>Environment Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Items</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getEnvironmentItems()
	 * @see #getApogyEnvironment()
	 * @generated
	 */
	EReference getApogyEnvironment_EnvironmentItems();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.AbstractApogyEnvironmentItem <em>Abstract Apogy Environment Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Apogy Environment Item</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractApogyEnvironmentItem
	 * @generated
	 */
	EClass getAbstractApogyEnvironmentItem();

		/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.AbstractApogyEnvironmentItem#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractApogyEnvironmentItem#getEnvironment()
	 * @see #getAbstractApogyEnvironmentItem()
	 * @generated
	 */
	EReference getAbstractApogyEnvironmentItem_Environment();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.TimeSourcesList <em>Time Sources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Sources List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.TimeSourcesList
	 * @generated
	 */
	EClass getTimeSourcesList();

		/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.TimeSourcesList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Environment</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.TimeSourcesList#getEnvironment()
	 * @see #getTimeSourcesList()
	 * @generated
	 */
	EReference getTimeSourcesList_Environment();

		/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.TimeSourcesList#getTimeSources <em>Time Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Sources</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.TimeSourcesList#getTimeSources()
	 * @see #getTimeSourcesList()
	 * @generated
	 */
	EReference getTimeSourcesList_TimeSources();

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
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getSky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sky</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Worksite#getSky()
	 * @see #getWorksite()
	 * @generated
	 */
	EReference getWorksite_Sky();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.WorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worksites List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.WorksitesList
	 * @generated
	 */
	EClass getWorksitesList();

		/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.WorksitesList#getWorksites <em>Worksites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Worksites</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.WorksitesList#getWorksites()
	 * @see #getWorksitesList()
	 * @generated
	 */
	EReference getWorksitesList_Worksites();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.AbstractWorksite <em>Abstract Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractWorksite
	 * @generated
	 */
	EClass getAbstractWorksite();

		/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.AbstractWorksite#getWorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Worksites List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractWorksite#getWorksitesList()
	 * @see #getAbstractWorksite()
	 * @generated
	 */
	EReference getAbstractWorksite_WorksitesList();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.AbstractSurfaceLocation <em>Abstract Surface Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Surface Location</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractSurfaceLocation
	 * @generated
	 */
	EClass getAbstractSurfaceLocation();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceLocationsList <em>Surface Locations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surface Locations List</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceLocationsList
	 * @generated
	 */
	EClass getSurfaceLocationsList();

		/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceLocationsList#getSurfaceLocations <em>Surface Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Surface Locations</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceLocationsList#getSurfaceLocations()
	 * @see #getSurfaceLocationsList()
	 * @generated
	 */
	EReference getSurfaceLocationsList_SurfaceLocations();

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
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.Sky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sky</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky
	 * @generated
	 */
  EClass getSky();

  /**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getWorksite <em>Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getWorksite()
	 * @see #getSky()
	 * @generated
	 */
	EReference getSky_Worksite();

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
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.CelestialBody <em>Celestial Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Celestial Body</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CelestialBody
	 * @generated
	 */
	EClass getCelestialBody();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.CelestialBody#getMeanRadius <em>Mean Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean Radius</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.CelestialBody#getMeanRadius()
	 * @see #getCelestialBody()
	 * @generated
	 */
	EAttribute getCelestialBody_MeanRadius();

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
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#sortByMagnitude(java.util.List) <em>Sort By Magnitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort By Magnitude</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#sortByMagnitude(java.util.List)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__SortByMagnitude__List();

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
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createStar(float, double, double) <em>Create Star</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Star</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createStar(float, double, double)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentFacade__CreateStar__float_double_double();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.ApogyEnvironmentImpl <em>Apogy Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyEnvironmentImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getApogyEnvironment()
		 * @generated
		 */
		EClass APOGY_ENVIRONMENT = eINSTANCE.getApogyEnvironment();
			/**
		 * The meta object literal for the '<em><b>Worksites List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_ENVIRONMENT__WORKSITES_LIST = eINSTANCE.getApogyEnvironment_WorksitesList();
			/**
		 * The meta object literal for the '<em><b>Active Worksite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_ENVIRONMENT__ACTIVE_WORKSITE = eINSTANCE.getApogyEnvironment_ActiveWorksite();
			/**
		 * The meta object literal for the '<em><b>Time Sources List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_ENVIRONMENT__TIME_SOURCES_LIST = eINSTANCE.getApogyEnvironment_TimeSourcesList();
			/**
		 * The meta object literal for the '<em><b>Active Time Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_ENVIRONMENT__ACTIVE_TIME_SOURCE = eINSTANCE.getApogyEnvironment_ActiveTimeSource();
			/**
		 * The meta object literal for the '<em><b>Environment Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_ENVIRONMENT__ENVIRONMENT_ITEMS = eINSTANCE.getApogyEnvironment_EnvironmentItems();
			/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractApogyEnvironmentItemImpl <em>Abstract Apogy Environment Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractApogyEnvironmentItemImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractApogyEnvironmentItem()
		 * @generated
		 */
		EClass ABSTRACT_APOGY_ENVIRONMENT_ITEM = eINSTANCE.getAbstractApogyEnvironmentItem();
			/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT = eINSTANCE.getAbstractApogyEnvironmentItem_Environment();
			/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.TimeSourcesListImpl <em>Time Sources List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.TimeSourcesListImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getTimeSourcesList()
		 * @generated
		 */
		EClass TIME_SOURCES_LIST = eINSTANCE.getTimeSourcesList();
			/**
		 * The meta object literal for the '<em><b>Environment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SOURCES_LIST__ENVIRONMENT = eINSTANCE.getTimeSourcesList_Environment();
			/**
		 * The meta object literal for the '<em><b>Time Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SOURCES_LIST__TIME_SOURCES = eINSTANCE.getTimeSourcesList_TimeSources();
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
		 * The meta object literal for the '<em><b>Sky</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSITE__SKY = eINSTANCE.getWorksite_Sky();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksitesListImpl <em>Worksites List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.WorksitesListImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getWorksitesList()
		 * @generated
		 */
		EClass WORKSITES_LIST = eINSTANCE.getWorksitesList();
				/**
		 * The meta object literal for the '<em><b>Worksites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSITES_LIST__WORKSITES = eINSTANCE.getWorksitesList_Worksites();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractWorksiteImpl <em>Abstract Worksite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractWorksiteImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractWorksite()
		 * @generated
		 */
		EClass ABSTRACT_WORKSITE = eINSTANCE.getAbstractWorksite();
				/**
		 * The meta object literal for the '<em><b>Worksites List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_WORKSITE__WORKSITES_LIST = eINSTANCE.getAbstractWorksite_WorksitesList();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractSurfaceLocationImpl <em>Abstract Surface Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.AbstractSurfaceLocationImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getAbstractSurfaceLocation()
		 * @generated
		 */
		EClass ABSTRACT_SURFACE_LOCATION = eINSTANCE.getAbstractSurfaceLocation();
				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SurfaceLocationsListImpl <em>Surface Locations List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.SurfaceLocationsListImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSurfaceLocationsList()
		 * @generated
		 */
		EClass SURFACE_LOCATIONS_LIST = eINSTANCE.getSurfaceLocationsList();
				/**
		 * The meta object literal for the '<em><b>Surface Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURFACE_LOCATIONS_LIST__SURFACE_LOCATIONS = eINSTANCE.getSurfaceLocationsList_SurfaceLocations();
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl <em>Sky</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getSky()
		 * @generated
		 */
    EClass SKY = eINSTANCE.getSky();
    /**
		 * The meta object literal for the '<em><b>Worksite</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKY__WORKSITE = eINSTANCE.getSky_Worksite();
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.impl.CelestialBodyImpl <em>Celestial Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.CelestialBodyImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentPackageImpl#getCelestialBody()
		 * @generated
		 */
		EClass CELESTIAL_BODY = eINSTANCE.getCelestialBody();
				/**
		 * The meta object literal for the '<em><b>Mean Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELESTIAL_BODY__MEAN_RADIUS = eINSTANCE.getCelestialBody_MeanRadius();
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
		 * The meta object literal for the '<em><b>Sort By Magnitude</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___SORT_BY_MAGNITUDE__LIST = eINSTANCE.getApogyCoreEnvironmentFacade__SortByMagnitude__List();
				/**
		 * The meta object literal for the '<em><b>Initialize Sky Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___INITIALIZE_SKY_NODE__SKY_SKYNODE = eINSTANCE.getApogyCoreEnvironmentFacade__InitializeSkyNode__Sky_SkyNode();
				/**
		 * The meta object literal for the '<em><b>Create Star</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_FACADE___CREATE_STAR__FLOAT_DOUBLE_DOUBLE = eINSTANCE.getApogyCoreEnvironmentFacade__CreateStar__float_double_double();
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
