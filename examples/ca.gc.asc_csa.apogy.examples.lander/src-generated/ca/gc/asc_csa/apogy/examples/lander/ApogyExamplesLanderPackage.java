package ca.gc.asc_csa.apogy.examples.lander;
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
 * @see ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesLander' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyExamplesLander' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.examples.lander/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.lander.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples'"
 * @generated
 */
public interface ApogyExamplesLanderPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "lander";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.examples.lander";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "lander";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyExamplesLanderPackage eINSTANCE = ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.lander.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.lander.impl.PositionImpl
	 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getPosition()
	 * @generated
	 */
  int POSITION = 0;

  /**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__X = 0;

  /**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__Y = 1;

  /**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__Z = 2;

  /**
	 * The feature id for the '<em><b>Attitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION__ATTITUDE = 3;

  /**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION_FEATURE_COUNT = 4;

  /**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSITION_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.lander.impl.LanderImpl <em>Lander</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.lander.impl.LanderImpl
	 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getLander()
	 * @generated
	 */
  int LANDER = 1;

  /**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER__POSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Thruster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER__THRUSTER = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Leg AExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER__LEG_AEXTENSION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Leg BExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER__LEG_BEXTENSION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Leg CExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER__LEG_CEXTENSION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Leg APosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER__LEG_APOSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 5;

		/**
	 * The feature id for the '<em><b>Leg BPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER__LEG_BPOSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 6;

		/**
	 * The feature id for the '<em><b>Leg CPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER__LEG_CPOSITION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 7;

		/**
	 * The feature id for the '<em><b>XAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER__XANGULAR_VELOCITY = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 8;

  /**
	 * The feature id for the '<em><b>YAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER__YANGULAR_VELOCITY = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 9;

  /**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER__MASS = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 10;

		/**
	 * The feature id for the '<em><b>Fuel Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER__FUEL_MASS = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 11;

		/**
	 * The feature id for the '<em><b>Gravitational Pull</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER__GRAVITATIONAL_PULL = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 12;

		/**
	 * The feature id for the '<em><b>Changing Legs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER__CHANGING_LEGS = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 13;

		/**
	 * The feature id for the '<em><b>Changing Attitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER__CHANGING_ATTITUDE = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 14;

		/**
	 * The feature id for the '<em><b>Changing Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER__CHANGING_LOCATION = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 15;

		/**
	 * The feature id for the '<em><b>Flying Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER__FLYING_ENABLED = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 16;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER__INITIALIZED = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 17;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER__DISPOSED = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 18;

		/**
	 * The number of structural features of the '<em>Lander</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_FEATURE_COUNT = ApogyCommonEMFPackage.DISPOSABLE_FEATURE_COUNT + 19;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER___DISPOSE = ApogyCommonEMFPackage.DISPOSABLE___DISPOSE;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER___INIT = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 0;

		/**
	 * The operation id for the '<em>Command Leg Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER___COMMAND_LEG_POSITION__LANDERLEGEXTENSION_LANDERLEGEXTENSION_LANDERLEGEXTENSION = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 1;

		/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER___MOVE_TO__DOUBLE_DOUBLE_DOUBLE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 2;

		/**
	 * The operation id for the '<em>Change Attitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER___CHANGE_ATTITUDE__DOUBLE_DOUBLE_DOUBLE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 3;

		/**
	 * The operation id for the '<em>Reset Attitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER___RESET_ATTITUDE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 4;

		/**
	 * The operation id for the '<em>Command Angular Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER___COMMAND_ANGULAR_VELOCITIES__DOUBLE_DOUBLE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 5;

		/**
	 * The operation id for the '<em>Command Thrust</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER___COMMAND_THRUST__DOUBLE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 6;

  /**
	 * The operation id for the '<em>Change Thrust By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER___CHANGE_THRUST_BY__DOUBLE = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 7;

		/**
	 * The operation id for the '<em>Start Flying</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER___START_FLYING__BOOLEAN = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 8;

		/**
	 * The operation id for the '<em>Stop Flying</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER___STOP_FLYING = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 9;

		/**
	 * The number of operations of the '<em>Lander</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LANDER_OPERATION_COUNT = ApogyCommonEMFPackage.DISPOSABLE_OPERATION_COUNT + 10;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.lander.impl.LanderStubImpl <em>Lander Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.lander.impl.LanderStubImpl
	 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getLanderStub()
	 * @generated
	 */
	int LANDER_STUB = 2;

		/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__POSITION = LANDER__POSITION;

		/**
	 * The feature id for the '<em><b>Thruster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__THRUSTER = LANDER__THRUSTER;

		/**
	 * The feature id for the '<em><b>Leg AExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__LEG_AEXTENSION = LANDER__LEG_AEXTENSION;

		/**
	 * The feature id for the '<em><b>Leg BExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__LEG_BEXTENSION = LANDER__LEG_BEXTENSION;

		/**
	 * The feature id for the '<em><b>Leg CExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__LEG_CEXTENSION = LANDER__LEG_CEXTENSION;

		/**
	 * The feature id for the '<em><b>Leg APosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__LEG_APOSITION = LANDER__LEG_APOSITION;

		/**
	 * The feature id for the '<em><b>Leg BPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__LEG_BPOSITION = LANDER__LEG_BPOSITION;

		/**
	 * The feature id for the '<em><b>Leg CPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__LEG_CPOSITION = LANDER__LEG_CPOSITION;

		/**
	 * The feature id for the '<em><b>XAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__XANGULAR_VELOCITY = LANDER__XANGULAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>YAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__YANGULAR_VELOCITY = LANDER__YANGULAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__MASS = LANDER__MASS;

		/**
	 * The feature id for the '<em><b>Fuel Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__FUEL_MASS = LANDER__FUEL_MASS;

		/**
	 * The feature id for the '<em><b>Gravitational Pull</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__GRAVITATIONAL_PULL = LANDER__GRAVITATIONAL_PULL;

		/**
	 * The feature id for the '<em><b>Changing Legs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__CHANGING_LEGS = LANDER__CHANGING_LEGS;

		/**
	 * The feature id for the '<em><b>Changing Attitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__CHANGING_ATTITUDE = LANDER__CHANGING_ATTITUDE;

		/**
	 * The feature id for the '<em><b>Changing Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__CHANGING_LOCATION = LANDER__CHANGING_LOCATION;

		/**
	 * The feature id for the '<em><b>Flying Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__FLYING_ENABLED = LANDER__FLYING_ENABLED;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__INITIALIZED = LANDER__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB__DISPOSED = LANDER__DISPOSED;

		/**
	 * The number of structural features of the '<em>Lander Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB_FEATURE_COUNT = LANDER_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB___DISPOSE = LANDER___DISPOSE;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB___INIT = LANDER___INIT;

		/**
	 * The operation id for the '<em>Command Leg Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB___COMMAND_LEG_POSITION__LANDERLEGEXTENSION_LANDERLEGEXTENSION_LANDERLEGEXTENSION = LANDER___COMMAND_LEG_POSITION__LANDERLEGEXTENSION_LANDERLEGEXTENSION_LANDERLEGEXTENSION;

		/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB___MOVE_TO__DOUBLE_DOUBLE_DOUBLE = LANDER___MOVE_TO__DOUBLE_DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Change Attitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB___CHANGE_ATTITUDE__DOUBLE_DOUBLE_DOUBLE = LANDER___CHANGE_ATTITUDE__DOUBLE_DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Reset Attitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB___RESET_ATTITUDE = LANDER___RESET_ATTITUDE;

		/**
	 * The operation id for the '<em>Command Angular Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB___COMMAND_ANGULAR_VELOCITIES__DOUBLE_DOUBLE = LANDER___COMMAND_ANGULAR_VELOCITIES__DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Command Thrust</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB___COMMAND_THRUST__DOUBLE = LANDER___COMMAND_THRUST__DOUBLE;

		/**
	 * The operation id for the '<em>Change Thrust By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB___CHANGE_THRUST_BY__DOUBLE = LANDER___CHANGE_THRUST_BY__DOUBLE;

		/**
	 * The operation id for the '<em>Start Flying</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB___START_FLYING__BOOLEAN = LANDER___START_FLYING__BOOLEAN;

		/**
	 * The operation id for the '<em>Stop Flying</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB___STOP_FLYING = LANDER___STOP_FLYING;

		/**
	 * The number of operations of the '<em>Lander Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_STUB_OPERATION_COUNT = LANDER_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.lander.impl.LanderSimulatedImpl <em>Lander Simulated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.lander.impl.LanderSimulatedImpl
	 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getLanderSimulated()
	 * @generated
	 */
	int LANDER_SIMULATED = 3;

		/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__POSITION = LANDER__POSITION;

		/**
	 * The feature id for the '<em><b>Thruster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__THRUSTER = LANDER__THRUSTER;

		/**
	 * The feature id for the '<em><b>Leg AExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__LEG_AEXTENSION = LANDER__LEG_AEXTENSION;

		/**
	 * The feature id for the '<em><b>Leg BExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__LEG_BEXTENSION = LANDER__LEG_BEXTENSION;

		/**
	 * The feature id for the '<em><b>Leg CExtension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__LEG_CEXTENSION = LANDER__LEG_CEXTENSION;

		/**
	 * The feature id for the '<em><b>Leg APosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__LEG_APOSITION = LANDER__LEG_APOSITION;

		/**
	 * The feature id for the '<em><b>Leg BPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__LEG_BPOSITION = LANDER__LEG_BPOSITION;

		/**
	 * The feature id for the '<em><b>Leg CPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__LEG_CPOSITION = LANDER__LEG_CPOSITION;

		/**
	 * The feature id for the '<em><b>XAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__XANGULAR_VELOCITY = LANDER__XANGULAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>YAngular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__YANGULAR_VELOCITY = LANDER__YANGULAR_VELOCITY;

		/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__MASS = LANDER__MASS;

		/**
	 * The feature id for the '<em><b>Fuel Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__FUEL_MASS = LANDER__FUEL_MASS;

		/**
	 * The feature id for the '<em><b>Gravitational Pull</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__GRAVITATIONAL_PULL = LANDER__GRAVITATIONAL_PULL;

		/**
	 * The feature id for the '<em><b>Changing Legs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__CHANGING_LEGS = LANDER__CHANGING_LEGS;

		/**
	 * The feature id for the '<em><b>Changing Attitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__CHANGING_ATTITUDE = LANDER__CHANGING_ATTITUDE;

		/**
	 * The feature id for the '<em><b>Changing Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__CHANGING_LOCATION = LANDER__CHANGING_LOCATION;

		/**
	 * The feature id for the '<em><b>Flying Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__FLYING_ENABLED = LANDER__FLYING_ENABLED;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__INITIALIZED = LANDER__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED__DISPOSED = LANDER__DISPOSED;

		/**
	 * The number of structural features of the '<em>Lander Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED_FEATURE_COUNT = LANDER_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED___DISPOSE = LANDER___DISPOSE;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED___INIT = LANDER___INIT;

		/**
	 * The operation id for the '<em>Command Leg Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED___COMMAND_LEG_POSITION__LANDERLEGEXTENSION_LANDERLEGEXTENSION_LANDERLEGEXTENSION = LANDER___COMMAND_LEG_POSITION__LANDERLEGEXTENSION_LANDERLEGEXTENSION_LANDERLEGEXTENSION;

		/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED___MOVE_TO__DOUBLE_DOUBLE_DOUBLE = LANDER___MOVE_TO__DOUBLE_DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Change Attitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED___CHANGE_ATTITUDE__DOUBLE_DOUBLE_DOUBLE = LANDER___CHANGE_ATTITUDE__DOUBLE_DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Reset Attitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED___RESET_ATTITUDE = LANDER___RESET_ATTITUDE;

		/**
	 * The operation id for the '<em>Command Angular Velocities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED___COMMAND_ANGULAR_VELOCITIES__DOUBLE_DOUBLE = LANDER___COMMAND_ANGULAR_VELOCITIES__DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Command Thrust</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED___COMMAND_THRUST__DOUBLE = LANDER___COMMAND_THRUST__DOUBLE;

		/**
	 * The operation id for the '<em>Change Thrust By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED___CHANGE_THRUST_BY__DOUBLE = LANDER___CHANGE_THRUST_BY__DOUBLE;

		/**
	 * The operation id for the '<em>Start Flying</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED___START_FLYING__BOOLEAN = LANDER___START_FLYING__BOOLEAN;

		/**
	 * The operation id for the '<em>Stop Flying</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED___STOP_FLYING = LANDER___STOP_FLYING;

		/**
	 * The number of operations of the '<em>Lander Simulated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDER_SIMULATED_OPERATION_COUNT = LANDER_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension <em>Lander Leg Extension</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension
	 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getLanderLegExtension()
	 * @generated
	 */
  int LANDER_LEG_EXTENSION = 4;


  /**
	 * The meta object id for the '<em>Matrix3d</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.vecmath.Matrix3d
	 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getMatrix3d()
	 * @generated
	 */
  int MATRIX3D = 5;


  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.lander.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Position
	 * @generated
	 */
  EClass getPosition();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
  EAttribute getPosition_X();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
  EAttribute getPosition_Y();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Position#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Position#getZ()
	 * @see #getPosition()
	 * @generated
	 */
  EAttribute getPosition_Z();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Position#getAttitude <em>Attitude</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attitude</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Position#getAttitude()
	 * @see #getPosition()
	 * @generated
	 */
  EAttribute getPosition_Attitude();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.lander.Lander <em>Lander</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lander</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander
	 * @generated
	 */
  EClass getLander();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getPosition()
	 * @see #getLander()
	 * @generated
	 */
  EReference getLander_Position();

  /**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getThruster <em>Thruster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thruster</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getThruster()
	 * @see #getLander()
	 * @generated
	 */
	EReference getLander_Thruster();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getLegAPosition <em>Leg APosition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leg APosition</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getLegAPosition()
	 * @see #getLander()
	 * @generated
	 */
  EAttribute getLander_LegAPosition();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getLegAExtension <em>Leg AExtension</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leg AExtension</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getLegAExtension()
	 * @see #getLander()
	 * @generated
	 */
  EAttribute getLander_LegAExtension();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getLegBPosition <em>Leg BPosition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leg BPosition</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getLegBPosition()
	 * @see #getLander()
	 * @generated
	 */
  EAttribute getLander_LegBPosition();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getLegBExtension <em>Leg BExtension</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leg BExtension</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getLegBExtension()
	 * @see #getLander()
	 * @generated
	 */
  EAttribute getLander_LegBExtension();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getLegCPosition <em>Leg CPosition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leg CPosition</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getLegCPosition()
	 * @see #getLander()
	 * @generated
	 */
  EAttribute getLander_LegCPosition();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getLegCExtension <em>Leg CExtension</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leg CExtension</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getLegCExtension()
	 * @see #getLander()
	 * @generated
	 */
  EAttribute getLander_LegCExtension();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getXAngularVelocity <em>XAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAngular Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getXAngularVelocity()
	 * @see #getLander()
	 * @generated
	 */
  EAttribute getLander_XAngularVelocity();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getYAngularVelocity <em>YAngular Velocity</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAngular Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getYAngularVelocity()
	 * @see #getLander()
	 * @generated
	 */
  EAttribute getLander_YAngularVelocity();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getMass()
	 * @see #getLander()
	 * @generated
	 */
	EAttribute getLander_Mass();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getFuelMass <em>Fuel Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Mass</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getFuelMass()
	 * @see #getLander()
	 * @generated
	 */
	EAttribute getLander_FuelMass();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#getGravitationalPull <em>Gravitational Pull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravitational Pull</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#getGravitationalPull()
	 * @see #getLander()
	 * @generated
	 */
	EAttribute getLander_GravitationalPull();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#isFlyingEnabled <em>Flying Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flying Enabled</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#isFlyingEnabled()
	 * @see #getLander()
	 * @generated
	 */
	EAttribute getLander_FlyingEnabled();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#isInitialized()
	 * @see #getLander()
	 * @generated
	 */
	EAttribute getLander_Initialized();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#isDisposed <em>Disposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposed</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#isDisposed()
	 * @see #getLander()
	 * @generated
	 */
	EAttribute getLander_Disposed();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#isChangingLegs <em>Changing Legs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changing Legs</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#isChangingLegs()
	 * @see #getLander()
	 * @generated
	 */
	EAttribute getLander_ChangingLegs();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#isChangingAttitude <em>Changing Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changing Attitude</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#isChangingAttitude()
	 * @see #getLander()
	 * @generated
	 */
	EAttribute getLander_ChangingAttitude();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#isChangingLocation <em>Changing Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changing Location</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#isChangingLocation()
	 * @see #getLander()
	 * @generated
	 */
	EAttribute getLander_ChangingLocation();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#init()
	 * @generated
	 */
	EOperation getLander__Init();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#commandLegPosition(ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension, ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension, ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension) <em>Command Leg Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Command Leg Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#commandLegPosition(ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension, ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension, ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension)
	 * @generated
	 */
	EOperation getLander__CommandLegPosition__LanderLegExtension_LanderLegExtension_LanderLegExtension();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#moveTo(double, double, double) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#moveTo(double, double, double)
	 * @generated
	 */
	EOperation getLander__MoveTo__double_double_double();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#changeAttitude(double, double, double) <em>Change Attitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attitude</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#changeAttitude(double, double, double)
	 * @generated
	 */
	EOperation getLander__ChangeAttitude__double_double_double();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#resetAttitude() <em>Reset Attitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Attitude</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#resetAttitude()
	 * @generated
	 */
	EOperation getLander__ResetAttitude();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#commandAngularVelocities(double, double) <em>Command Angular Velocities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Command Angular Velocities</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#commandAngularVelocities(double, double)
	 * @generated
	 */
	EOperation getLander__CommandAngularVelocities__double_double();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#commandThrust(double) <em>Command Thrust</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Command Thrust</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#commandThrust(double)
	 * @generated
	 */
  EOperation getLander__CommandThrust__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#changeThrustBy(double) <em>Change Thrust By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Thrust By</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#changeThrustBy(double)
	 * @generated
	 */
	EOperation getLander__ChangeThrustBy__double();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#startFlying(boolean) <em>Start Flying</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Flying</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#startFlying(boolean)
	 * @generated
	 */
	EOperation getLander__StartFlying__boolean();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.lander.Lander#stopFlying() <em>Stop Flying</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Flying</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.lander.Lander#stopFlying()
	 * @generated
	 */
	EOperation getLander__StopFlying();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.lander.LanderStub <em>Lander Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lander Stub</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.LanderStub
	 * @generated
	 */
	EClass getLanderStub();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.lander.LanderSimulated <em>Lander Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lander Simulated</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.LanderSimulated
	 * @generated
	 */
	EClass getLanderSimulated();

		/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension <em>Lander Leg Extension</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lander Leg Extension</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension
	 * @generated
	 */
  EEnum getLanderLegExtension();

  /**
	 * Returns the meta object for data type '{@link javax.vecmath.Matrix3d <em>Matrix3d</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Matrix3d</em>'.
	 * @see javax.vecmath.Matrix3d
	 * @model instanceClass="javax.vecmath.Matrix3d"
	 * @generated
	 */
  EDataType getMatrix3d();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyExamplesLanderFactory getApogyExamplesLanderFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.lander.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.lander.impl.PositionImpl
		 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getPosition()
		 * @generated
		 */
    EClass POSITION = eINSTANCE.getPosition();

    /**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute POSITION__X = eINSTANCE.getPosition_X();

    /**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

    /**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute POSITION__Z = eINSTANCE.getPosition_Z();

    /**
		 * The meta object literal for the '<em><b>Attitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute POSITION__ATTITUDE = eINSTANCE.getPosition_Attitude();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.lander.impl.LanderImpl <em>Lander</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.lander.impl.LanderImpl
		 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getLander()
		 * @generated
		 */
    EClass LANDER = eINSTANCE.getLander();

    /**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LANDER__POSITION = eINSTANCE.getLander_Position();

    /**
		 * The meta object literal for the '<em><b>Thruster</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDER__THRUSTER = eINSTANCE.getLander_Thruster();

				/**
		 * The meta object literal for the '<em><b>Leg APosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LANDER__LEG_APOSITION = eINSTANCE.getLander_LegAPosition();

    /**
		 * The meta object literal for the '<em><b>Leg AExtension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LANDER__LEG_AEXTENSION = eINSTANCE.getLander_LegAExtension();

    /**
		 * The meta object literal for the '<em><b>Leg BPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LANDER__LEG_BPOSITION = eINSTANCE.getLander_LegBPosition();

    /**
		 * The meta object literal for the '<em><b>Leg BExtension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LANDER__LEG_BEXTENSION = eINSTANCE.getLander_LegBExtension();

    /**
		 * The meta object literal for the '<em><b>Leg CPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LANDER__LEG_CPOSITION = eINSTANCE.getLander_LegCPosition();

    /**
		 * The meta object literal for the '<em><b>Leg CExtension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LANDER__LEG_CEXTENSION = eINSTANCE.getLander_LegCExtension();

    /**
		 * The meta object literal for the '<em><b>XAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LANDER__XANGULAR_VELOCITY = eINSTANCE.getLander_XAngularVelocity();

    /**
		 * The meta object literal for the '<em><b>YAngular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LANDER__YANGULAR_VELOCITY = eINSTANCE.getLander_YAngularVelocity();

    /**
		 * The meta object literal for the '<em><b>Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER__MASS = eINSTANCE.getLander_Mass();

				/**
		 * The meta object literal for the '<em><b>Fuel Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER__FUEL_MASS = eINSTANCE.getLander_FuelMass();

				/**
		 * The meta object literal for the '<em><b>Gravitational Pull</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER__GRAVITATIONAL_PULL = eINSTANCE.getLander_GravitationalPull();

				/**
		 * The meta object literal for the '<em><b>Flying Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER__FLYING_ENABLED = eINSTANCE.getLander_FlyingEnabled();

				/**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER__INITIALIZED = eINSTANCE.getLander_Initialized();

				/**
		 * The meta object literal for the '<em><b>Disposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER__DISPOSED = eINSTANCE.getLander_Disposed();

				/**
		 * The meta object literal for the '<em><b>Changing Legs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER__CHANGING_LEGS = eINSTANCE.getLander_ChangingLegs();

				/**
		 * The meta object literal for the '<em><b>Changing Attitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER__CHANGING_ATTITUDE = eINSTANCE.getLander_ChangingAttitude();

				/**
		 * The meta object literal for the '<em><b>Changing Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDER__CHANGING_LOCATION = eINSTANCE.getLander_ChangingLocation();

				/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LANDER___INIT = eINSTANCE.getLander__Init();

				/**
		 * The meta object literal for the '<em><b>Command Leg Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LANDER___COMMAND_LEG_POSITION__LANDERLEGEXTENSION_LANDERLEGEXTENSION_LANDERLEGEXTENSION = eINSTANCE.getLander__CommandLegPosition__LanderLegExtension_LanderLegExtension_LanderLegExtension();

				/**
		 * The meta object literal for the '<em><b>Move To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LANDER___MOVE_TO__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getLander__MoveTo__double_double_double();

				/**
		 * The meta object literal for the '<em><b>Change Attitude</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LANDER___CHANGE_ATTITUDE__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getLander__ChangeAttitude__double_double_double();

				/**
		 * The meta object literal for the '<em><b>Reset Attitude</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LANDER___RESET_ATTITUDE = eINSTANCE.getLander__ResetAttitude();

				/**
		 * The meta object literal for the '<em><b>Command Angular Velocities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LANDER___COMMAND_ANGULAR_VELOCITIES__DOUBLE_DOUBLE = eINSTANCE.getLander__CommandAngularVelocities__double_double();

				/**
		 * The meta object literal for the '<em><b>Command Thrust</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation LANDER___COMMAND_THRUST__DOUBLE = eINSTANCE.getLander__CommandThrust__double();

    /**
		 * The meta object literal for the '<em><b>Change Thrust By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LANDER___CHANGE_THRUST_BY__DOUBLE = eINSTANCE.getLander__ChangeThrustBy__double();

				/**
		 * The meta object literal for the '<em><b>Start Flying</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LANDER___START_FLYING__BOOLEAN = eINSTANCE.getLander__StartFlying__boolean();

				/**
		 * The meta object literal for the '<em><b>Stop Flying</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LANDER___STOP_FLYING = eINSTANCE.getLander__StopFlying();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.lander.impl.LanderStubImpl <em>Lander Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.lander.impl.LanderStubImpl
		 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getLanderStub()
		 * @generated
		 */
		EClass LANDER_STUB = eINSTANCE.getLanderStub();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.lander.impl.LanderSimulatedImpl <em>Lander Simulated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.lander.impl.LanderSimulatedImpl
		 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getLanderSimulated()
		 * @generated
		 */
		EClass LANDER_SIMULATED = eINSTANCE.getLanderSimulated();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension <em>Lander Leg Extension</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension
		 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getLanderLegExtension()
		 * @generated
		 */
    EEnum LANDER_LEG_EXTENSION = eINSTANCE.getLanderLegExtension();

    /**
		 * The meta object literal for the '<em>Matrix3d</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.vecmath.Matrix3d
		 * @see ca.gc.asc_csa.apogy.examples.lander.impl.ApogyExamplesLanderPackageImpl#getMatrix3d()
		 * @generated
		 */
    EDataType MATRIX3D = eINSTANCE.getMatrix3d();

  }

} //ApogyExamplesLanderPackage
