package ca.gc.asc_csa.apogy.common.emf;
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
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonEMF' childCreationExtenders='true' extensibleProviderFactory='true' modelName='ApogyCommonEMF' modelDirectory='/ca.gc.asc_csa.apogy.common.emf/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.emf.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common'"
 * @generated
 */
public interface ApogyCommonEMFPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "emf";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.common.emf";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "emf";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCommonEMFPackage eINSTANCE = ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getApogyCommonEMFFacade()
	 * @generated
	 */
	int APOGY_COMMON_EMF_FACADE = 0;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Get All Available EClasses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_ECLASSES = 0;

		/**
	 * The operation id for the '<em>Get All Sub EClasses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ALL_SUB_ECLASSES__ECLASS = 1;

		/**
	 * The operation id for the '<em>Filter EClasses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_ECLASSFILTER = 2;

		/**
	 * The operation id for the '<em>Filter EClasses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_LIST = 3;

		/**
	 * The operation id for the '<em>Get EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ECLASS__STRING = 4;

		/**
	 * The operation id for the '<em>Sort Alphabetically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___SORT_ALPHABETICALLY__LIST = 5;

		/**
	 * The operation id for the '<em>Get All Available EOperations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_EOPERATIONS__ECLASS = 6;

		/**
	 * The operation id for the '<em>Sort EOperations Alphabetically</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___SORT_EOPERATIONS_ALPHABETICALLY__LIST = 7;

		/**
	 * The operation id for the '<em>Get Documentation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_DOCUMENTATION__ETYPEDELEMENT = 8;

		/**
	 * The operation id for the '<em>Get Engineering Units As String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS_AS_STRING__ETYPEDELEMENT = 9;

		/**
	 * The operation id for the '<em>Get Engineering Units</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS__ETYPEDELEMENT = 10;

		/**
	 * The operation id for the '<em>Get Value Update Rate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_VALUE_UPDATE_RATE__ETYPEDELEMENT = 11;

		/**
	 * The operation id for the '<em>Get Warning OCL Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_WARNING_OCL_EXPRESSION__ETYPEDELEMENT = 12;

		/**
	 * The operation id for the '<em>Get Alarm OCL Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ALARM_OCL_EXPRESSION__ETYPEDELEMENT = 13;

		/**
	 * The operation id for the '<em>Get Out Of Range OCL Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_OCL_EXPRESSION__ETYPEDELEMENT = 14;

		/**
	 * The operation id for the '<em>Get Warning Min Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_WARNING_MIN_VALUE__ETYPEDELEMENT = 15;

		/**
	 * The operation id for the '<em>Get Warning Max Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_WARNING_MAX_VALUE__ETYPEDELEMENT = 16;

		/**
	 * The operation id for the '<em>Get Alarm Min Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ALARM_MIN_VALUE__ETYPEDELEMENT = 17;

		/**
	 * The operation id for the '<em>Get Alarm Max Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ALARM_MAX_VALUE__ETYPEDELEMENT = 18;

		/**
	 * The operation id for the '<em>Get Out Of Range Min Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MIN_VALUE__ETYPEDELEMENT = 19;

		/**
	 * The operation id for the '<em>Get Out Of Range Max Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MAX_VALUE__ETYPEDELEMENT = 20;

		/**
	 * The operation id for the '<em>Get Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_RANGE__ETYPEDELEMENT_OBJECT = 21;

		/**
	 * The operation id for the '<em>Get Full Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_FULL_DESCRIPTION__ETYPEDELEMENT = 22;

		/**
	 * The operation id for the '<em>Get Ancestries String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ANCESTRIES_STRING__ABSTRACTFEATURENODE = 23;

		/**
	 * The operation id for the '<em>Get Feature Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_FEATURE_ROOT__ABSTRACTFEATURENODE = 24;

		/**
	 * The operation id for the '<em>Get Ancestries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ANCESTRIES__ABSTRACTFEATURENODE = 25;

		/**
	 * The operation id for the '<em>Get Descendants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_DESCENDANTS__ABSTRACTFEATURENODE = 26;

		/**
	 * The operation id for the '<em>Get Child EStructural Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_CHILD_ESTRUCTURAL_FEATURES__ABSTRACTFEATURENODE = 27;

		/**
	 * The operation id for the '<em>Resolve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___RESOLVE__EOBJECT_ABSTRACTFEATURENODE = 28;

		/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___SET_VALUE__EOBJECT_ABSTRACTFEATURENODE_OBJECT = 29;

		/**
	 * The operation id for the '<em>Is Resolved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___IS_RESOLVED__EOBJECT_ABSTRACTFEATURENODE = 30;

		/**
	 * The operation id for the '<em>Get Leaf</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_LEAF__LISTROOTNODE = 31;

		/**
	 * The operation id for the '<em>Get File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_FILE__RESOURCE = 32;

		/**
	 * The operation id for the '<em>Get Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_CONTENT__URI = 33;

		/**
	 * The operation id for the '<em>Sort Timed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___SORT_TIMED__COLLECTION = 34;

		/**
	 * The operation id for the '<em>Get Time Span</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_TIME_SPAN__COLLECTION = 35;

		/**
	 * The operation id for the '<em>Get ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE___GET_ID__EOBJECT = 36;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_FACADE_OPERATION_COUNT = 37;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.EObjectReferenceImpl <em>EObject Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.EObjectReferenceImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getEObjectReference()
	 * @generated
	 */
	int EOBJECT_REFERENCE = 1;

		/**
	 * The feature id for the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REFERENCE__EOBJECT = 0;

		/**
	 * The number of structural features of the '<em>EObject Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REFERENCE_FEATURE_COUNT = 1;

		/**
	 * The number of operations of the '<em>EObject Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REFERENCE_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.Named <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.Named
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getNamed()
	 * @generated
	 */
  int NAMED = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED__NAME = 0;

  /**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.Described <em>Described</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.Described
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getDescribed()
	 * @generated
	 */
  int DESCRIBED = 3;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DESCRIBED__DESCRIPTION = 0;

  /**
	 * The number of structural features of the '<em>Described</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DESCRIBED_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Described</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DESCRIBED_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.Timed <em>Timed</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.Timed
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getTimed()
	 * @generated
	 */
  int TIMED = 4;

  /**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIMED__TIME = 0;

  /**
	 * The number of structural features of the '<em>Timed</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIMED_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Timed</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TIMED_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.StartableImpl <em>Startable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.StartableImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getStartable()
	 * @generated
	 */
	int STARTABLE = 6;

		/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTABLE__STARTED = 0;

		/**
	 * The number of structural features of the '<em>Startable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTABLE_FEATURE_COUNT = 1;

		/**
	 * The number of operations of the '<em>Startable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTABLE_OPERATION_COUNT = 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ServerImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 5;

		/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__STARTED = STARTABLE__STARTED;

		/**
	 * The feature id for the '<em><b>Server Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_JOB = STARTABLE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = STARTABLE_FEATURE_COUNT + 1;

		/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = STARTABLE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.DurationImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 7;

		/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VALUE = 0;

		/**
	 * The feature id for the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__DAYS = 1;

		/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__HOURS = 2;

		/**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__MINUTES = 3;

		/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__SECONDS = 4;

		/**
	 * The feature id for the '<em><b>Milliseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__MILLISECONDS = 5;

		/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = 6;

		/**
	 * The operation id for the '<em>Get Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___GET_DURATION__TIMED_TIMED = 0;

		/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = 1;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.TimeSourceImpl <em>Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.TimeSourceImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getTimeSource()
	 * @generated
	 */
	int TIME_SOURCE = 8;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE__NAME = NAMED__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE__DESCRIPTION = NAMED_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE__TIME = NAMED_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE__OFFSET = NAMED_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 3;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE___DISPOSE = NAMED_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SOURCE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.FixedTimeSourceImpl <em>Fixed Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.FixedTimeSourceImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getFixedTimeSource()
	 * @generated
	 */
	int FIXED_TIME_SOURCE = 9;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE__NAME = TIME_SOURCE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE__DESCRIPTION = TIME_SOURCE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE__TIME = TIME_SOURCE__TIME;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE__OFFSET = TIME_SOURCE__OFFSET;

		/**
	 * The number of structural features of the '<em>Fixed Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE_FEATURE_COUNT = TIME_SOURCE_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE___DISPOSE = TIME_SOURCE___DISPOSE;

		/**
	 * The number of operations of the '<em>Fixed Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_SOURCE_OPERATION_COUNT = TIME_SOURCE_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.CurrentTimeSourceImpl <em>Current Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.CurrentTimeSourceImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getCurrentTimeSource()
	 * @generated
	 */
	int CURRENT_TIME_SOURCE = 10;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__NAME = TIME_SOURCE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__DESCRIPTION = TIME_SOURCE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__TIME = TIME_SOURCE__TIME;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__OFFSET = TIME_SOURCE__OFFSET;

		/**
	 * The feature id for the '<em><b>Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__UPDATE_PERIOD = TIME_SOURCE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Paused</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE__PAUSED = TIME_SOURCE_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Current Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE_FEATURE_COUNT = TIME_SOURCE_FEATURE_COUNT + 2;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE___DISPOSE = TIME_SOURCE___DISPOSE;

		/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE___PAUSE = TIME_SOURCE_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE___RESUME = TIME_SOURCE_OPERATION_COUNT + 1;

		/**
	 * The number of operations of the '<em>Current Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_SOURCE_OPERATION_COUNT = TIME_SOURCE_OPERATION_COUNT + 2;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.BrowseableTimeSourceImpl <em>Browseable Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.BrowseableTimeSourceImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getBrowseableTimeSource()
	 * @generated
	 */
	int BROWSEABLE_TIME_SOURCE = 11;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__NAME = TIME_SOURCE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__DESCRIPTION = TIME_SOURCE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__TIME = TIME_SOURCE__TIME;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__OFFSET = TIME_SOURCE__OFFSET;

		/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__START_TIME = TIME_SOURCE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD = TIME_SOURCE_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Time Acceration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__TIME_ACCERATION = TIME_SOURCE_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Time Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE__TIME_DIRECTION = TIME_SOURCE_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>Browseable Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE_FEATURE_COUNT = TIME_SOURCE_FEATURE_COUNT + 4;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE___DISPOSE = TIME_SOURCE___DISPOSE;

		/**
	 * The operation id for the '<em>Play Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE___PLAY_FORWARD = TIME_SOURCE_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Play Reverse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE___PLAY_REVERSE = TIME_SOURCE_OPERATION_COUNT + 1;

		/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE___PAUSE = TIME_SOURCE_OPERATION_COUNT + 2;

		/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE___RESET = TIME_SOURCE_OPERATION_COUNT + 3;

		/**
	 * The number of operations of the '<em>Browseable Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROWSEABLE_TIME_SOURCE_OPERATION_COUNT = TIME_SOURCE_OPERATION_COUNT + 4;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.SelectionBasedTimeSourceImpl <em>Selection Based Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.SelectionBasedTimeSourceImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getSelectionBasedTimeSource()
	 * @generated
	 */
	int SELECTION_BASED_TIME_SOURCE = 12;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE__NAME = TIME_SOURCE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE__DESCRIPTION = TIME_SOURCE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE__TIME = TIME_SOURCE__TIME;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE__OFFSET = TIME_SOURCE__OFFSET;

		/**
	 * The number of structural features of the '<em>Selection Based Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE_FEATURE_COUNT = TIME_SOURCE_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE___DISPOSE = TIME_SOURCE___DISPOSE;

		/**
	 * The operation id for the '<em>Set Selection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE___SET_SELECTION__TIMED = TIME_SOURCE_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Selection Based Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_BASED_TIME_SOURCE_OPERATION_COUNT = TIME_SOURCE_OPERATION_COUNT + 1;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.CollectionTimedTimeSourceImpl <em>Collection Timed Time Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.CollectionTimedTimeSourceImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getCollectionTimedTimeSource()
	 * @generated
	 */
	int COLLECTION_TIMED_TIME_SOURCE = 13;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__NAME = BROWSEABLE_TIME_SOURCE__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__DESCRIPTION = BROWSEABLE_TIME_SOURCE__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__TIME = BROWSEABLE_TIME_SOURCE__TIME;

		/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__OFFSET = BROWSEABLE_TIME_SOURCE__OFFSET;

		/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__START_TIME = BROWSEABLE_TIME_SOURCE__START_TIME;

		/**
	 * The feature id for the '<em><b>Update Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__UPDATE_PERIOD = BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD;

		/**
	 * The feature id for the '<em><b>Time Acceration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__TIME_ACCERATION = BROWSEABLE_TIME_SOURCE__TIME_ACCERATION;

		/**
	 * The feature id for the '<em><b>Time Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__TIME_DIRECTION = BROWSEABLE_TIME_SOURCE__TIME_DIRECTION;

		/**
	 * The feature id for the '<em><b>Loop Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Timeds List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Current Timed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Earliest Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Latest Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 4;

		/**
	 * The number of structural features of the '<em>Collection Timed Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE_FEATURE_COUNT = BROWSEABLE_TIME_SOURCE_FEATURE_COUNT + 5;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___DISPOSE = BROWSEABLE_TIME_SOURCE___DISPOSE;

		/**
	 * The operation id for the '<em>Play Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___PLAY_FORWARD = BROWSEABLE_TIME_SOURCE___PLAY_FORWARD;

		/**
	 * The operation id for the '<em>Play Reverse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___PLAY_REVERSE = BROWSEABLE_TIME_SOURCE___PLAY_REVERSE;

		/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___PAUSE = BROWSEABLE_TIME_SOURCE___PAUSE;

		/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___RESET = BROWSEABLE_TIME_SOURCE___RESET;

		/**
	 * The operation id for the '<em>Jump To Next</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_NEXT = BROWSEABLE_TIME_SOURCE_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Jump To Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_PREVIOUS = BROWSEABLE_TIME_SOURCE_OPERATION_COUNT + 1;

		/**
	 * The number of operations of the '<em>Collection Timed Time Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TIMED_TIME_SOURCE_OPERATION_COUNT = BROWSEABLE_TIME_SOURCE_OPERATION_COUNT + 2;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.Disposable <em>Disposable</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.Disposable
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getDisposable()
	 * @generated
	 */
  int DISPOSABLE = 14;

  /**
	 * The number of structural features of the '<em>Disposable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPOSABLE_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPOSABLE___DISPOSE = 0;

  /**
	 * The number of operations of the '<em>Disposable</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPOSABLE_OPERATION_COUNT = 1;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureNodeImpl <em>Abstract Feature Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureNodeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getAbstractFeatureNode()
	 * @generated
	 */
  int ABSTRACT_FEATURE_NODE = 16;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.FeatureNodeAdapterImpl <em>Feature Node Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.FeatureNodeAdapterImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getFeatureNodeAdapter()
	 * @generated
	 */
  int FEATURE_NODE_ADAPTER = 15;

  /**
	 * The feature id for the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER__SOURCE_OBJECT = 0;

  /**
	 * The feature id for the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER__FEATURE_NODE = 1;

  /**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER__CURRENT_VALUE = 2;

  /**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER__RESOLVED = 3;

  /**
	 * The number of structural features of the '<em>Feature Node Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER_FEATURE_COUNT = 4;

  /**
	 * The number of operations of the '<em>Feature Node Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_NODE_ADAPTER_OPERATION_COUNT = 0;

  /**
	 * The number of structural features of the '<em>Abstract Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_NODE_FEATURE_COUNT = 0;

  /**
	 * The number of operations of the '<em>Abstract Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_NODE_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureListNodeImpl <em>Abstract Feature List Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureListNodeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getAbstractFeatureListNode()
	 * @generated
	 */
  int ABSTRACT_FEATURE_LIST_NODE = 17;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_LIST_NODE__PARENT = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_LIST_NODE__CHILD = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Abstract Feature List Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Abstract Feature List Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_LIST_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureTreeNodeImpl <em>Abstract Feature Tree Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureTreeNodeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getAbstractFeatureTreeNode()
	 * @generated
	 */
  int ABSTRACT_FEATURE_TREE_NODE = 18;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_TREE_NODE__PARENT = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_TREE_NODE__CHILDREN = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Abstract Feature Tree Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_NODE_FEATURE_COUNT + 2;

  /**
	 * The number of operations of the '<em>Abstract Feature Tree Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_TREE_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractRootNodeImpl <em>Abstract Root Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.AbstractRootNodeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getAbstractRootNode()
	 * @generated
	 */
  int ABSTRACT_ROOT_NODE = 19;

  /**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ROOT_NODE__SOURCE_CLASS = 0;

  /**
	 * The number of structural features of the '<em>Abstract Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ROOT_NODE_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Abstract Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ROOT_NODE_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.TreeRootNodeImpl <em>Tree Root Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.TreeRootNodeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getTreeRootNode()
	 * @generated
	 */
  int TREE_ROOT_NODE = 20;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_ROOT_NODE__PARENT = ABSTRACT_FEATURE_TREE_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_ROOT_NODE__CHILDREN = ABSTRACT_FEATURE_TREE_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_ROOT_NODE__SOURCE_CLASS = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Tree Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_ROOT_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Tree Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_ROOT_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_TREE_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.TreeFeatureNodeImpl <em>Tree Feature Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.TreeFeatureNodeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getTreeFeatureNode()
	 * @generated
	 */
  int TREE_FEATURE_NODE = 21;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE__PARENT = ABSTRACT_FEATURE_TREE_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE__CHILDREN = ABSTRACT_FEATURE_TREE_NODE__CHILDREN;

  /**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE__STRUCTURAL_FEATURE = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE__MULTI_VALUED = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE__INDEX = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Tree Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_TREE_NODE_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Tree Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TREE_FEATURE_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_TREE_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.ListRootNodeImpl <em>List Root Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ListRootNodeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getListRootNode()
	 * @generated
	 */
  int LIST_ROOT_NODE = 22;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ROOT_NODE__PARENT = ABSTRACT_FEATURE_LIST_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ROOT_NODE__CHILD = ABSTRACT_FEATURE_LIST_NODE__CHILD;

  /**
	 * The feature id for the '<em><b>Source Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ROOT_NODE__SOURCE_CLASS = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>List Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ROOT_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>List Root Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ROOT_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_LIST_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.ListFeatureNodeImpl <em>List Feature Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ListFeatureNodeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getListFeatureNode()
	 * @generated
	 */
  int LIST_FEATURE_NODE = 23;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE__PARENT = ABSTRACT_FEATURE_LIST_NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE__CHILD = ABSTRACT_FEATURE_LIST_NODE__CHILD;

  /**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE__STRUCTURAL_FEATURE = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE__MULTI_VALUED = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE__INDEX = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>List Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE_FEATURE_COUNT = ABSTRACT_FEATURE_LIST_NODE_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>List Feature Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_NODE_OPERATION_COUNT = ABSTRACT_FEATURE_LIST_NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureSpecifierImpl <em>Abstract Feature Specifier</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureSpecifierImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getAbstractFeatureSpecifier()
	 * @generated
	 */
  int ABSTRACT_FEATURE_SPECIFIER = 24;

  /**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE = 0;

  /**
	 * The feature id for the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED = 1;

  /**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_SPECIFIER__INDEX = 2;

  /**
	 * The number of structural features of the '<em>Abstract Feature Specifier</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_SPECIFIER_FEATURE_COUNT = 3;

  /**
	 * The number of operations of the '<em>Abstract Feature Specifier</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_SPECIFIER_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.TimeDirection <em>Time Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.TimeDirection
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getTimeDirection()
	 * @generated
	 */
	int TIME_DIRECTION = 25;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.Ranges <em>Ranges</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.Ranges
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getRanges()
	 * @generated
	 */
  int RANGES = 26;

  /**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getException()
	 * @generated
	 */
  int EXCEPTION = 27;

  /**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getList()
	 * @generated
	 */
  int LIST = 28;

  /**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getSortedSet()
	 * @generated
	 */
  int SORTED_SET = 29;

  /**
	 * The meta object id for the '<em>EClass Filter</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.EClassFilter
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getEClassFilter()
	 * @generated
	 */
  int ECLASS_FILTER = 30;

  /**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Number
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getNumber()
	 * @generated
	 */
  int NUMBER = 31;


  /**
	 * The meta object id for the '<em>IFile</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getIFile()
	 * @generated
	 */
  int IFILE = 32;

  /**
	 * The meta object id for the '<em>Resource</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getResource()
	 * @generated
	 */
  int RESOURCE = 33;


  /**
	 * The meta object id for the '<em>Unit</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.measure.unit.Unit
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getUnit()
	 * @generated
	 */
  int UNIT = 34;


  /**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 35;


		/**
	 * The meta object id for the '<em>EList</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getEList()
	 * @generated
	 */
	int ELIST = 36;

		/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getURI()
	 * @generated
	 */
	int URI = 37;


		/**
	 * The meta object id for the '<em>Job</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.jobs.Job
	 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 38;


		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade
	 * @generated
	 */
	EClass getApogyCommonEMFFacade();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAllAvailableEClasses() <em>Get All Available EClasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Available EClasses</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAllAvailableEClasses()
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetAllAvailableEClasses();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAllSubEClasses(org.eclipse.emf.ecore.EClass) <em>Get All Sub EClasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Sub EClasses</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAllSubEClasses(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetAllSubEClasses__EClass();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#filterEClasses(java.util.List, ca.gc.asc_csa.apogy.common.emf.EClassFilter) <em>Filter EClasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter EClasses</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#filterEClasses(java.util.List, ca.gc.asc_csa.apogy.common.emf.EClassFilter)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__FilterEClasses__List_EClassFilter();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#filterEClasses(java.util.List, java.util.List) <em>Filter EClasses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Filter EClasses</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#filterEClasses(java.util.List, java.util.List)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__FilterEClasses__List_List();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getEClass(java.lang.String) <em>Get EClass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EClass</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getEClass(java.lang.String)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetEClass__String();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#sortAlphabetically(java.util.List) <em>Sort Alphabetically</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort Alphabetically</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#sortAlphabetically(java.util.List)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__SortAlphabetically__List();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAllAvailableEOperations(org.eclipse.emf.ecore.EClass) <em>Get All Available EOperations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Available EOperations</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAllAvailableEOperations(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetAllAvailableEOperations__EClass();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#sortEOperationsAlphabetically(java.util.List) <em>Sort EOperations Alphabetically</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort EOperations Alphabetically</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#sortEOperationsAlphabetically(java.util.List)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__SortEOperationsAlphabetically__List();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getDocumentation(org.eclipse.emf.ecore.ETypedElement) <em>Get Documentation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Documentation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getDocumentation(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetDocumentation__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getEngineeringUnitsAsString(org.eclipse.emf.ecore.ETypedElement) <em>Get Engineering Units As String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Engineering Units As String</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getEngineeringUnitsAsString(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetEngineeringUnitsAsString__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getEngineeringUnits(org.eclipse.emf.ecore.ETypedElement) <em>Get Engineering Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Engineering Units</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getEngineeringUnits(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetEngineeringUnits__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getValueUpdateRate(org.eclipse.emf.ecore.ETypedElement) <em>Get Value Update Rate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value Update Rate</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getValueUpdateRate(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetValueUpdateRate__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getWarningOCLExpression(org.eclipse.emf.ecore.ETypedElement) <em>Get Warning OCL Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Warning OCL Expression</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getWarningOCLExpression(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetWarningOCLExpression__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAlarmOCLExpression(org.eclipse.emf.ecore.ETypedElement) <em>Get Alarm OCL Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm OCL Expression</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAlarmOCLExpression(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetAlarmOCLExpression__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getOutOfRangeOCLExpression(org.eclipse.emf.ecore.ETypedElement) <em>Get Out Of Range OCL Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Out Of Range OCL Expression</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getOutOfRangeOCLExpression(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetOutOfRangeOCLExpression__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getWarningMinValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Warning Min Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Warning Min Value</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getWarningMinValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetWarningMinValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getWarningMaxValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Warning Max Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Warning Max Value</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getWarningMaxValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetWarningMaxValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAlarmMinValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Alarm Min Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Min Value</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAlarmMinValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetAlarmMinValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAlarmMaxValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Alarm Max Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alarm Max Value</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAlarmMaxValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetAlarmMaxValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getOutOfRangeMinValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Out Of Range Min Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Out Of Range Min Value</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getOutOfRangeMinValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetOutOfRangeMinValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getOutOfRangeMaxValue(org.eclipse.emf.ecore.ETypedElement) <em>Get Out Of Range Max Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Out Of Range Max Value</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getOutOfRangeMaxValue(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetOutOfRangeMaxValue__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getRange(org.eclipse.emf.ecore.ETypedElement, java.lang.Object) <em>Get Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Range</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getRange(org.eclipse.emf.ecore.ETypedElement, java.lang.Object)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetRange__ETypedElement_Object();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getFullDescription(org.eclipse.emf.ecore.ETypedElement) <em>Get Full Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Full Description</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getFullDescription(org.eclipse.emf.ecore.ETypedElement)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetFullDescription__ETypedElement();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAncestriesString(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Get Ancestries String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ancestries String</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAncestriesString(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetAncestriesString__AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getFeatureRoot(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Get Feature Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Root</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getFeatureRoot(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetFeatureRoot__AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAncestries(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Get Ancestries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ancestries</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getAncestries(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetAncestries__AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getDescendants(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Get Descendants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Descendants</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getDescendants(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetDescendants__AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getChildEStructuralFeatures(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Get Child EStructural Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Child EStructural Features</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getChildEStructuralFeatures(ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetChildEStructuralFeatures__AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#resolve(org.eclipse.emf.ecore.EObject, ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Resolve</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#resolve(org.eclipse.emf.ecore.EObject, ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__Resolve__EObject_AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#setValue(org.eclipse.emf.ecore.EObject, ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode, java.lang.Object) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#setValue(org.eclipse.emf.ecore.EObject, ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode, java.lang.Object)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__SetValue__EObject_AbstractFeatureNode_Object();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#isResolved(org.eclipse.emf.ecore.EObject, ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode) <em>Is Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Resolved</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#isResolved(org.eclipse.emf.ecore.EObject, ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__IsResolved__EObject_AbstractFeatureNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getLeaf(ca.gc.asc_csa.apogy.common.emf.ListRootNode) <em>Get Leaf</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Leaf</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getLeaf(ca.gc.asc_csa.apogy.common.emf.ListRootNode)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetLeaf__ListRootNode();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getFile(org.eclipse.emf.ecore.resource.Resource) <em>Get File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get File</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getFile(org.eclipse.emf.ecore.resource.Resource)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetFile__Resource();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getContent(org.eclipse.emf.common.util.URI) <em>Get Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getContent(org.eclipse.emf.common.util.URI)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetContent__URI();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#sortTimed(java.util.Collection) <em>Sort Timed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sort Timed</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#sortTimed(java.util.Collection)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__SortTimed__Collection();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getTimeSpan(java.util.Collection) <em>Get Time Span</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Span</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getTimeSpan(java.util.Collection)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetTimeSpan__Collection();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getID(org.eclipse.emf.ecore.EObject) <em>Get ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get ID</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade#getID(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getApogyCommonEMFFacade__GetID__EObject();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.EObjectReference <em>EObject Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Reference</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.EObjectReference
	 * @generated
	 */
	EClass getEObjectReference();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.emf.EObjectReference#getEObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EObject</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.EObjectReference#getEObject()
	 * @see #getEObjectReference()
	 * @generated
	 */
	EReference getEObjectReference_EObject();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Named
	 * @generated
	 */
  EClass getNamed();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
  EAttribute getNamed_Name();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Described
	 * @generated
	 */
  EClass getDescribed();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.Described#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Described#getDescription()
	 * @see #getDescribed()
	 * @generated
	 */
  EAttribute getDescribed_Description();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Timed
	 * @generated
	 */
  EClass getTimed();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.Timed#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Timed#getTime()
	 * @see #getTimed()
	 * @generated
	 */
  EAttribute getTimed_Time();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Server
	 * @generated
	 */
	EClass getServer();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.Server#getServerJob <em>Server Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Job</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Server#getServerJob()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_ServerJob();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.Startable <em>Startable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Startable</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Startable
	 * @generated
	 */
	EClass getStartable();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.Startable#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Startable#isStarted()
	 * @see #getStartable()
	 * @generated
	 */
	EAttribute getStartable_Started();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Duration
	 * @generated
	 */
	EClass getDuration();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.Duration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Duration#getValue()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Value();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.Duration#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Duration#getDays()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Days();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.Duration#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Duration#getHours()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Hours();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.Duration#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Duration#getMinutes()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Minutes();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.Duration#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Duration#getSeconds()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Seconds();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.Duration#getMilliseconds <em>Milliseconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Milliseconds</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Duration#getMilliseconds()
	 * @see #getDuration()
	 * @generated
	 */
	EAttribute getDuration_Milliseconds();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.Duration#getDuration(ca.gc.asc_csa.apogy.common.emf.Timed, ca.gc.asc_csa.apogy.common.emf.Timed) <em>Get Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Duration</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.Duration#getDuration(ca.gc.asc_csa.apogy.common.emf.Timed, ca.gc.asc_csa.apogy.common.emf.Timed)
	 * @generated
	 */
	EOperation getDuration__GetDuration__Timed_Timed();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.TimeSource <em>Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Source</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.TimeSource
	 * @generated
	 */
	EClass getTimeSource();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.TimeSource#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.TimeSource#getOffset()
	 * @see #getTimeSource()
	 * @generated
	 */
	EAttribute getTimeSource_Offset();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.FixedTimeSource <em>Fixed Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Time Source</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.FixedTimeSource
	 * @generated
	 */
	EClass getFixedTimeSource();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource <em>Current Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Time Source</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource
	 * @generated
	 */
	EClass getCurrentTimeSource();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#getUpdatePeriod <em>Update Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Period</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#getUpdatePeriod()
	 * @see #getCurrentTimeSource()
	 * @generated
	 */
	EAttribute getCurrentTimeSource_UpdatePeriod();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#isPaused <em>Paused</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paused</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#isPaused()
	 * @see #getCurrentTimeSource()
	 * @generated
	 */
	EAttribute getCurrentTimeSource_Paused();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#pause() <em>Pause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#pause()
	 * @generated
	 */
	EOperation getCurrentTimeSource__Pause();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#resume() <em>Resume</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#resume()
	 * @generated
	 */
	EOperation getCurrentTimeSource__Resume();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource <em>Browseable Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browseable Time Source</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource
	 * @generated
	 */
	EClass getBrowseableTimeSource();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#getStartTime()
	 * @see #getBrowseableTimeSource()
	 * @generated
	 */
	EAttribute getBrowseableTimeSource_StartTime();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#getUpdatePeriod <em>Update Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Period</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#getUpdatePeriod()
	 * @see #getBrowseableTimeSource()
	 * @generated
	 */
	EAttribute getBrowseableTimeSource_UpdatePeriod();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#getTimeAcceration <em>Time Acceration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Acceration</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#getTimeAcceration()
	 * @see #getBrowseableTimeSource()
	 * @generated
	 */
	EAttribute getBrowseableTimeSource_TimeAcceration();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#getTimeDirection <em>Time Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Direction</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#getTimeDirection()
	 * @see #getBrowseableTimeSource()
	 * @generated
	 */
	EAttribute getBrowseableTimeSource_TimeDirection();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#playForward() <em>Play Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Play Forward</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#playForward()
	 * @generated
	 */
	EOperation getBrowseableTimeSource__PlayForward();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#playReverse() <em>Play Reverse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Play Reverse</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#playReverse()
	 * @generated
	 */
	EOperation getBrowseableTimeSource__PlayReverse();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#pause() <em>Pause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#pause()
	 * @generated
	 */
	EOperation getBrowseableTimeSource__Pause();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource#reset()
	 * @generated
	 */
	EOperation getBrowseableTimeSource__Reset();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.SelectionBasedTimeSource <em>Selection Based Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Based Time Source</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.SelectionBasedTimeSource
	 * @generated
	 */
	EClass getSelectionBasedTimeSource();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.SelectionBasedTimeSource#setSelection(ca.gc.asc_csa.apogy.common.emf.Timed) <em>Set Selection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Selection</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.SelectionBasedTimeSource#setSelection(ca.gc.asc_csa.apogy.common.emf.Timed)
	 * @generated
	 */
	EOperation getSelectionBasedTimeSource__SetSelection__Timed();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource <em>Collection Timed Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Timed Time Source</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource
	 * @generated
	 */
	EClass getCollectionTimedTimeSource();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#isLoopEnable <em>Loop Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Enable</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#isLoopEnable()
	 * @see #getCollectionTimedTimeSource()
	 * @generated
	 */
	EAttribute getCollectionTimedTimeSource_LoopEnable();

		/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getTimedsList <em>Timeds List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Timeds List</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getTimedsList()
	 * @see #getCollectionTimedTimeSource()
	 * @generated
	 */
	EReference getCollectionTimedTimeSource_TimedsList();

		/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getCurrentTimedElement <em>Current Timed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Timed Element</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getCurrentTimedElement()
	 * @see #getCollectionTimedTimeSource()
	 * @generated
	 */
	EReference getCollectionTimedTimeSource_CurrentTimedElement();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getEarliestDate <em>Earliest Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Date</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getEarliestDate()
	 * @see #getCollectionTimedTimeSource()
	 * @generated
	 */
	EAttribute getCollectionTimedTimeSource_EarliestDate();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getLatestDate <em>Latest Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Date</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#getLatestDate()
	 * @see #getCollectionTimedTimeSource()
	 * @generated
	 */
	EAttribute getCollectionTimedTimeSource_LatestDate();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#jumpToNext() <em>Jump To Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Jump To Next</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#jumpToNext()
	 * @generated
	 */
	EOperation getCollectionTimedTimeSource__JumpToNext();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#jumpToPrevious() <em>Jump To Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Jump To Previous</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource#jumpToPrevious()
	 * @generated
	 */
	EOperation getCollectionTimedTimeSource__JumpToPrevious();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.Disposable <em>Disposable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disposable</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Disposable
	 * @generated
	 */
  EClass getDisposable();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.Disposable#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.Disposable#dispose()
	 * @generated
	 */
  EOperation getDisposable__Dispose();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode <em>Abstract Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode
	 * @generated
	 */
  EClass getAbstractFeatureNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter <em>Feature Node Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Node Adapter</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter
	 * @generated
	 */
  EClass getFeatureNodeAdapter();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Object</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getSourceObject()
	 * @see #getFeatureNodeAdapter()
	 * @generated
	 */
  EReference getFeatureNodeAdapter_SourceObject();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getFeatureNode <em>Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getFeatureNode()
	 * @see #getFeatureNodeAdapter()
	 * @generated
	 */
  EReference getFeatureNodeAdapter_FeatureNode();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#getCurrentValue()
	 * @see #getFeatureNodeAdapter()
	 * @generated
	 */
  EAttribute getFeatureNodeAdapter_CurrentValue();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter#isResolved()
	 * @see #getFeatureNodeAdapter()
	 * @generated
	 */
  EAttribute getFeatureNodeAdapter_Resolved();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode <em>Abstract Feature List Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature List Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode
	 * @generated
	 */
  EClass getAbstractFeatureListNode();

  /**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getParent()
	 * @see #getAbstractFeatureListNode()
	 * @generated
	 */
  EReference getAbstractFeatureListNode_Parent();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getChild()
	 * @see #getAbstractFeatureListNode()
	 * @generated
	 */
  EReference getAbstractFeatureListNode_Child();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode <em>Abstract Feature Tree Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Tree Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode
	 * @generated
	 */
  EClass getAbstractFeatureTreeNode();

  /**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode#getParent()
	 * @see #getAbstractFeatureTreeNode()
	 * @generated
	 */
  EReference getAbstractFeatureTreeNode_Parent();

  /**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode#getChildren()
	 * @see #getAbstractFeatureTreeNode()
	 * @generated
	 */
  EReference getAbstractFeatureTreeNode_Children();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.AbstractRootNode <em>Abstract Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Root Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractRootNode
	 * @generated
	 */
  EClass getAbstractRootNode();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.emf.AbstractRootNode#getSourceClass <em>Source Class</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Class</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractRootNode#getSourceClass()
	 * @see #getAbstractRootNode()
	 * @generated
	 */
  EReference getAbstractRootNode_SourceClass();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.TreeRootNode <em>Tree Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Root Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.TreeRootNode
	 * @generated
	 */
  EClass getTreeRootNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.TreeFeatureNode <em>Tree Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Feature Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.TreeFeatureNode
	 * @generated
	 */
  EClass getTreeFeatureNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.ListRootNode <em>List Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Root Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.ListRootNode
	 * @generated
	 */
  EClass getListRootNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.ListFeatureNode <em>List Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Feature Node</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.ListFeatureNode
	 * @generated
	 */
  EClass getListFeatureNode();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier <em>Abstract Feature Specifier</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Specifier</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier
	 * @generated
	 */
  EClass getAbstractFeatureSpecifier();

  /**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier#getStructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Feature</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier#getStructuralFeature()
	 * @see #getAbstractFeatureSpecifier()
	 * @generated
	 */
  EReference getAbstractFeatureSpecifier_StructuralFeature();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier#isMultiValued <em>Multi Valued</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Valued</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier#isMultiValued()
	 * @see #getAbstractFeatureSpecifier()
	 * @generated
	 */
  EAttribute getAbstractFeatureSpecifier_MultiValued();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier#getIndex()
	 * @see #getAbstractFeatureSpecifier()
	 * @generated
	 */
  EAttribute getAbstractFeatureSpecifier_Index();

  /**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.common.emf.TimeDirection <em>Time Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Direction</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.TimeDirection
	 * @generated
	 */
	EEnum getTimeDirection();

		/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.common.emf.Ranges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ranges</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.Ranges
	 * @generated
	 */
  EEnum getRanges();

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
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.common.emf.EClassFilter <em>EClass Filter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EClass Filter</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.EClassFilter
	 * @model instanceClass="ca.gc.asc_csa.apogy.common.emf.EClassFilter"
	 * @generated
	 */
  EDataType getEClassFilter();

  /**
	 * Returns the meta object for data type '{@link java.lang.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @see java.lang.Number
	 * @model instanceClass="java.lang.Number"
	 * @generated
	 */
  EDataType getNumber();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFile <em>IFile</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFile</em>'.
	 * @see org.eclipse.core.resources.IFile
	 * @model instanceClass="org.eclipse.core.resources.IFile"
	 * @generated
	 */
  EDataType getIFile();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resource</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource"
	 * @generated
	 */
  EDataType getResource();

  /**
	 * Returns the meta object for data type '{@link javax.measure.unit.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unit</em>'.
	 * @see javax.measure.unit.Unit
	 * @model instanceClass="javax.measure.unit.Unit<?>"
	 * @generated
	 */
  EDataType getUnit();

  /**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>EList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EList</em>'.
	 * @see org.eclipse.emf.common.util.EList
	 * @model instanceClass="org.eclipse.emf.common.util.EList" typeParameters="EObject"
	 * @generated
	 */
	EDataType getEList();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURI();

		/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.jobs.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Job</em>'.
	 * @see org.eclipse.core.runtime.jobs.Job
	 * @model instanceClass="org.eclipse.core.runtime.jobs.Job"
	 * @generated
	 */
	EDataType getJob();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonEMFFactory getApogyCommonEMFFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getApogyCommonEMFFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_EMF_FACADE = eINSTANCE.getApogyCommonEMFFacade();

			/**
		 * The meta object literal for the '<em><b>Get All Available EClasses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_ECLASSES = eINSTANCE.getApogyCommonEMFFacade__GetAllAvailableEClasses();

			/**
		 * The meta object literal for the '<em><b>Get All Sub EClasses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ALL_SUB_ECLASSES__ECLASS = eINSTANCE.getApogyCommonEMFFacade__GetAllSubEClasses__EClass();

			/**
		 * The meta object literal for the '<em><b>Filter EClasses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_ECLASSFILTER = eINSTANCE.getApogyCommonEMFFacade__FilterEClasses__List_EClassFilter();

			/**
		 * The meta object literal for the '<em><b>Filter EClasses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_LIST = eINSTANCE.getApogyCommonEMFFacade__FilterEClasses__List_List();

			/**
		 * The meta object literal for the '<em><b>Get EClass</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ECLASS__STRING = eINSTANCE.getApogyCommonEMFFacade__GetEClass__String();

			/**
		 * The meta object literal for the '<em><b>Sort Alphabetically</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___SORT_ALPHABETICALLY__LIST = eINSTANCE.getApogyCommonEMFFacade__SortAlphabetically__List();

			/**
		 * The meta object literal for the '<em><b>Get All Available EOperations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_EOPERATIONS__ECLASS = eINSTANCE.getApogyCommonEMFFacade__GetAllAvailableEOperations__EClass();

			/**
		 * The meta object literal for the '<em><b>Sort EOperations Alphabetically</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___SORT_EOPERATIONS_ALPHABETICALLY__LIST = eINSTANCE.getApogyCommonEMFFacade__SortEOperationsAlphabetically__List();

			/**
		 * The meta object literal for the '<em><b>Get Documentation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_DOCUMENTATION__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetDocumentation__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Engineering Units As String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS_AS_STRING__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetEngineeringUnitsAsString__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Engineering Units</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetEngineeringUnits__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Value Update Rate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_VALUE_UPDATE_RATE__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetValueUpdateRate__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Warning OCL Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_WARNING_OCL_EXPRESSION__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetWarningOCLExpression__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Alarm OCL Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ALARM_OCL_EXPRESSION__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetAlarmOCLExpression__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Out Of Range OCL Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_OCL_EXPRESSION__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetOutOfRangeOCLExpression__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Warning Min Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_WARNING_MIN_VALUE__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetWarningMinValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Warning Max Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_WARNING_MAX_VALUE__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetWarningMaxValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Alarm Min Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ALARM_MIN_VALUE__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetAlarmMinValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Alarm Max Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ALARM_MAX_VALUE__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetAlarmMaxValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Out Of Range Min Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MIN_VALUE__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetOutOfRangeMinValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Out Of Range Max Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MAX_VALUE__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetOutOfRangeMaxValue__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_RANGE__ETYPEDELEMENT_OBJECT = eINSTANCE.getApogyCommonEMFFacade__GetRange__ETypedElement_Object();

			/**
		 * The meta object literal for the '<em><b>Get Full Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_FULL_DESCRIPTION__ETYPEDELEMENT = eINSTANCE.getApogyCommonEMFFacade__GetFullDescription__ETypedElement();

			/**
		 * The meta object literal for the '<em><b>Get Ancestries String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ANCESTRIES_STRING__ABSTRACTFEATURENODE = eINSTANCE.getApogyCommonEMFFacade__GetAncestriesString__AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Get Feature Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_FEATURE_ROOT__ABSTRACTFEATURENODE = eINSTANCE.getApogyCommonEMFFacade__GetFeatureRoot__AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Get Ancestries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ANCESTRIES__ABSTRACTFEATURENODE = eINSTANCE.getApogyCommonEMFFacade__GetAncestries__AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Get Descendants</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_DESCENDANTS__ABSTRACTFEATURENODE = eINSTANCE.getApogyCommonEMFFacade__GetDescendants__AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Get Child EStructural Features</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_CHILD_ESTRUCTURAL_FEATURES__ABSTRACTFEATURENODE = eINSTANCE.getApogyCommonEMFFacade__GetChildEStructuralFeatures__AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Resolve</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___RESOLVE__EOBJECT_ABSTRACTFEATURENODE = eINSTANCE.getApogyCommonEMFFacade__Resolve__EObject_AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___SET_VALUE__EOBJECT_ABSTRACTFEATURENODE_OBJECT = eINSTANCE.getApogyCommonEMFFacade__SetValue__EObject_AbstractFeatureNode_Object();

			/**
		 * The meta object literal for the '<em><b>Is Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___IS_RESOLVED__EOBJECT_ABSTRACTFEATURENODE = eINSTANCE.getApogyCommonEMFFacade__IsResolved__EObject_AbstractFeatureNode();

			/**
		 * The meta object literal for the '<em><b>Get Leaf</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_LEAF__LISTROOTNODE = eINSTANCE.getApogyCommonEMFFacade__GetLeaf__ListRootNode();

			/**
		 * The meta object literal for the '<em><b>Get File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_FILE__RESOURCE = eINSTANCE.getApogyCommonEMFFacade__GetFile__Resource();

			/**
		 * The meta object literal for the '<em><b>Get Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_CONTENT__URI = eINSTANCE.getApogyCommonEMFFacade__GetContent__URI();

			/**
		 * The meta object literal for the '<em><b>Sort Timed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___SORT_TIMED__COLLECTION = eINSTANCE.getApogyCommonEMFFacade__SortTimed__Collection();

			/**
		 * The meta object literal for the '<em><b>Get Time Span</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_TIME_SPAN__COLLECTION = eINSTANCE.getApogyCommonEMFFacade__GetTimeSpan__Collection();

			/**
		 * The meta object literal for the '<em><b>Get ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_FACADE___GET_ID__EOBJECT = eINSTANCE.getApogyCommonEMFFacade__GetID__EObject();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.EObjectReferenceImpl <em>EObject Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.EObjectReferenceImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getEObjectReference()
		 * @generated
		 */
		EClass EOBJECT_REFERENCE = eINSTANCE.getEObjectReference();

			/**
		 * The meta object literal for the '<em><b>EObject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_REFERENCE__EOBJECT = eINSTANCE.getEObjectReference_EObject();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.Named <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.Named
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getNamed()
		 * @generated
		 */
    EClass NAMED = eINSTANCE.getNamed();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.Described <em>Described</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.Described
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getDescribed()
		 * @generated
		 */
    EClass DESCRIBED = eINSTANCE.getDescribed();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DESCRIBED__DESCRIPTION = eINSTANCE.getDescribed_Description();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.Timed <em>Timed</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.Timed
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getTimed()
		 * @generated
		 */
    EClass TIMED = eINSTANCE.getTimed();

    /**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TIMED__TIME = eINSTANCE.getTimed_Time();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ServerImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

				/**
		 * The meta object literal for the '<em><b>Server Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_JOB = eINSTANCE.getServer_ServerJob();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.StartableImpl <em>Startable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.StartableImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getStartable()
		 * @generated
		 */
		EClass STARTABLE = eINSTANCE.getStartable();

				/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTABLE__STARTED = eINSTANCE.getStartable_Started();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.DurationImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

				/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__VALUE = eINSTANCE.getDuration_Value();

				/**
		 * The meta object literal for the '<em><b>Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__DAYS = eINSTANCE.getDuration_Days();

				/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__HOURS = eINSTANCE.getDuration_Hours();

				/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__MINUTES = eINSTANCE.getDuration_Minutes();

				/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__SECONDS = eINSTANCE.getDuration_Seconds();

				/**
		 * The meta object literal for the '<em><b>Milliseconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION__MILLISECONDS = eINSTANCE.getDuration_Milliseconds();

				/**
		 * The meta object literal for the '<em><b>Get Duration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DURATION___GET_DURATION__TIMED_TIMED = eINSTANCE.getDuration__GetDuration__Timed_Timed();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.TimeSourceImpl <em>Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.TimeSourceImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getTimeSource()
		 * @generated
		 */
		EClass TIME_SOURCE = eINSTANCE.getTimeSource();

				/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SOURCE__OFFSET = eINSTANCE.getTimeSource_Offset();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.FixedTimeSourceImpl <em>Fixed Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.FixedTimeSourceImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getFixedTimeSource()
		 * @generated
		 */
		EClass FIXED_TIME_SOURCE = eINSTANCE.getFixedTimeSource();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.CurrentTimeSourceImpl <em>Current Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.CurrentTimeSourceImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getCurrentTimeSource()
		 * @generated
		 */
		EClass CURRENT_TIME_SOURCE = eINSTANCE.getCurrentTimeSource();

				/**
		 * The meta object literal for the '<em><b>Update Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TIME_SOURCE__UPDATE_PERIOD = eINSTANCE.getCurrentTimeSource_UpdatePeriod();

				/**
		 * The meta object literal for the '<em><b>Paused</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_TIME_SOURCE__PAUSED = eINSTANCE.getCurrentTimeSource_Paused();

				/**
		 * The meta object literal for the '<em><b>Pause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CURRENT_TIME_SOURCE___PAUSE = eINSTANCE.getCurrentTimeSource__Pause();

				/**
		 * The meta object literal for the '<em><b>Resume</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CURRENT_TIME_SOURCE___RESUME = eINSTANCE.getCurrentTimeSource__Resume();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.BrowseableTimeSourceImpl <em>Browseable Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.BrowseableTimeSourceImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getBrowseableTimeSource()
		 * @generated
		 */
		EClass BROWSEABLE_TIME_SOURCE = eINSTANCE.getBrowseableTimeSource();

				/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSEABLE_TIME_SOURCE__START_TIME = eINSTANCE.getBrowseableTimeSource_StartTime();

				/**
		 * The meta object literal for the '<em><b>Update Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD = eINSTANCE.getBrowseableTimeSource_UpdatePeriod();

				/**
		 * The meta object literal for the '<em><b>Time Acceration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSEABLE_TIME_SOURCE__TIME_ACCERATION = eINSTANCE.getBrowseableTimeSource_TimeAcceration();

				/**
		 * The meta object literal for the '<em><b>Time Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROWSEABLE_TIME_SOURCE__TIME_DIRECTION = eINSTANCE.getBrowseableTimeSource_TimeDirection();

				/**
		 * The meta object literal for the '<em><b>Play Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BROWSEABLE_TIME_SOURCE___PLAY_FORWARD = eINSTANCE.getBrowseableTimeSource__PlayForward();

				/**
		 * The meta object literal for the '<em><b>Play Reverse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BROWSEABLE_TIME_SOURCE___PLAY_REVERSE = eINSTANCE.getBrowseableTimeSource__PlayReverse();

				/**
		 * The meta object literal for the '<em><b>Pause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BROWSEABLE_TIME_SOURCE___PAUSE = eINSTANCE.getBrowseableTimeSource__Pause();

				/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BROWSEABLE_TIME_SOURCE___RESET = eINSTANCE.getBrowseableTimeSource__Reset();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.SelectionBasedTimeSourceImpl <em>Selection Based Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.SelectionBasedTimeSourceImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getSelectionBasedTimeSource()
		 * @generated
		 */
		EClass SELECTION_BASED_TIME_SOURCE = eINSTANCE.getSelectionBasedTimeSource();

				/**
		 * The meta object literal for the '<em><b>Set Selection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SELECTION_BASED_TIME_SOURCE___SET_SELECTION__TIMED = eINSTANCE.getSelectionBasedTimeSource__SetSelection__Timed();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.CollectionTimedTimeSourceImpl <em>Collection Timed Time Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.CollectionTimedTimeSourceImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getCollectionTimedTimeSource()
		 * @generated
		 */
		EClass COLLECTION_TIMED_TIME_SOURCE = eINSTANCE.getCollectionTimedTimeSource();

				/**
		 * The meta object literal for the '<em><b>Loop Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE = eINSTANCE.getCollectionTimedTimeSource_LoopEnable();

				/**
		 * The meta object literal for the '<em><b>Timeds List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST = eINSTANCE.getCollectionTimedTimeSource_TimedsList();

				/**
		 * The meta object literal for the '<em><b>Current Timed Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT = eINSTANCE.getCollectionTimedTimeSource_CurrentTimedElement();

				/**
		 * The meta object literal for the '<em><b>Earliest Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE = eINSTANCE.getCollectionTimedTimeSource_EarliestDate();

				/**
		 * The meta object literal for the '<em><b>Latest Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE = eINSTANCE.getCollectionTimedTimeSource_LatestDate();

				/**
		 * The meta object literal for the '<em><b>Jump To Next</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_NEXT = eINSTANCE.getCollectionTimedTimeSource__JumpToNext();

				/**
		 * The meta object literal for the '<em><b>Jump To Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_PREVIOUS = eINSTANCE.getCollectionTimedTimeSource__JumpToPrevious();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.Disposable <em>Disposable</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.Disposable
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getDisposable()
		 * @generated
		 */
    EClass DISPOSABLE = eINSTANCE.getDisposable();

    /**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation DISPOSABLE___DISPOSE = eINSTANCE.getDisposable__Dispose();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureNodeImpl <em>Abstract Feature Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureNodeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getAbstractFeatureNode()
		 * @generated
		 */
    EClass ABSTRACT_FEATURE_NODE = eINSTANCE.getAbstractFeatureNode();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.FeatureNodeAdapterImpl <em>Feature Node Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.FeatureNodeAdapterImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getFeatureNodeAdapter()
		 * @generated
		 */
    EClass FEATURE_NODE_ADAPTER = eINSTANCE.getFeatureNodeAdapter();

    /**
		 * The meta object literal for the '<em><b>Source Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FEATURE_NODE_ADAPTER__SOURCE_OBJECT = eINSTANCE.getFeatureNodeAdapter_SourceObject();

    /**
		 * The meta object literal for the '<em><b>Feature Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FEATURE_NODE_ADAPTER__FEATURE_NODE = eINSTANCE.getFeatureNodeAdapter_FeatureNode();

    /**
		 * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FEATURE_NODE_ADAPTER__CURRENT_VALUE = eINSTANCE.getFeatureNodeAdapter_CurrentValue();

    /**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FEATURE_NODE_ADAPTER__RESOLVED = eINSTANCE.getFeatureNodeAdapter_Resolved();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureListNodeImpl <em>Abstract Feature List Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureListNodeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getAbstractFeatureListNode()
		 * @generated
		 */
    EClass ABSTRACT_FEATURE_LIST_NODE = eINSTANCE.getAbstractFeatureListNode();

    /**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_FEATURE_LIST_NODE__PARENT = eINSTANCE.getAbstractFeatureListNode_Parent();

    /**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_FEATURE_LIST_NODE__CHILD = eINSTANCE.getAbstractFeatureListNode_Child();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureTreeNodeImpl <em>Abstract Feature Tree Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureTreeNodeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getAbstractFeatureTreeNode()
		 * @generated
		 */
    EClass ABSTRACT_FEATURE_TREE_NODE = eINSTANCE.getAbstractFeatureTreeNode();

    /**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_FEATURE_TREE_NODE__PARENT = eINSTANCE.getAbstractFeatureTreeNode_Parent();

    /**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_FEATURE_TREE_NODE__CHILDREN = eINSTANCE.getAbstractFeatureTreeNode_Children();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractRootNodeImpl <em>Abstract Root Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.AbstractRootNodeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getAbstractRootNode()
		 * @generated
		 */
    EClass ABSTRACT_ROOT_NODE = eINSTANCE.getAbstractRootNode();

    /**
		 * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_ROOT_NODE__SOURCE_CLASS = eINSTANCE.getAbstractRootNode_SourceClass();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.TreeRootNodeImpl <em>Tree Root Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.TreeRootNodeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getTreeRootNode()
		 * @generated
		 */
    EClass TREE_ROOT_NODE = eINSTANCE.getTreeRootNode();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.TreeFeatureNodeImpl <em>Tree Feature Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.TreeFeatureNodeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getTreeFeatureNode()
		 * @generated
		 */
    EClass TREE_FEATURE_NODE = eINSTANCE.getTreeFeatureNode();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.ListRootNodeImpl <em>List Root Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ListRootNodeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getListRootNode()
		 * @generated
		 */
    EClass LIST_ROOT_NODE = eINSTANCE.getListRootNode();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.ListFeatureNodeImpl <em>List Feature Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ListFeatureNodeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getListFeatureNode()
		 * @generated
		 */
    EClass LIST_FEATURE_NODE = eINSTANCE.getListFeatureNode();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureSpecifierImpl <em>Abstract Feature Specifier</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureSpecifierImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getAbstractFeatureSpecifier()
		 * @generated
		 */
    EClass ABSTRACT_FEATURE_SPECIFIER = eINSTANCE.getAbstractFeatureSpecifier();

    /**
		 * The meta object literal for the '<em><b>Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE = eINSTANCE.getAbstractFeatureSpecifier_StructuralFeature();

    /**
		 * The meta object literal for the '<em><b>Multi Valued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED = eINSTANCE.getAbstractFeatureSpecifier_MultiValued();

    /**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_FEATURE_SPECIFIER__INDEX = eINSTANCE.getAbstractFeatureSpecifier_Index();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.TimeDirection <em>Time Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.TimeDirection
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getTimeDirection()
		 * @generated
		 */
		EEnum TIME_DIRECTION = eINSTANCE.getTimeDirection();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.Ranges <em>Ranges</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.Ranges
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getRanges()
		 * @generated
		 */
    EEnum RANGES = eINSTANCE.getRanges();

    /**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getException()
		 * @generated
		 */
    EDataType EXCEPTION = eINSTANCE.getException();

    /**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getList()
		 * @generated
		 */
    EDataType LIST = eINSTANCE.getList();

    /**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getSortedSet()
		 * @generated
		 */
    EDataType SORTED_SET = eINSTANCE.getSortedSet();

    /**
		 * The meta object literal for the '<em>EClass Filter</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.EClassFilter
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getEClassFilter()
		 * @generated
		 */
    EDataType ECLASS_FILTER = eINSTANCE.getEClassFilter();

    /**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Number
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getNumber()
		 * @generated
		 */
    EDataType NUMBER = eINSTANCE.getNumber();

    /**
		 * The meta object literal for the '<em>IFile</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFile
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getIFile()
		 * @generated
		 */
    EDataType IFILE = eINSTANCE.getIFile();

    /**
		 * The meta object literal for the '<em>Resource</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getResource()
		 * @generated
		 */
    EDataType RESOURCE = eINSTANCE.getResource();

    /**
		 * The meta object literal for the '<em>Unit</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.measure.unit.Unit
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getUnit()
		 * @generated
		 */
    EDataType UNIT = eINSTANCE.getUnit();

				/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

				/**
		 * The meta object literal for the '<em>EList</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getEList()
		 * @generated
		 */
		EDataType ELIST = eINSTANCE.getEList();

				/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

				/**
		 * The meta object literal for the '<em>Job</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.jobs.Job
		 * @see ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFPackageImpl#getJob()
		 * @generated
		 */
		EDataType JOB = eINSTANCE.getJob();

  }

} //ApogyCommonEMFPackage
