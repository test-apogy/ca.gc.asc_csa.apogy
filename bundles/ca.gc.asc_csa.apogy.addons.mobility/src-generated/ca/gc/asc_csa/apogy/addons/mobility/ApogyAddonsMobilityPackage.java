package ca.gc.asc_csa.apogy.addons.mobility;
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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

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
 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsMobility' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' childCreationExtenders='true' extensibleProviderFactory='true' modelName='ApogyAddonsMobility' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates' modelDirectory='/ca.gc.asc_csa.apogy.addons.mobility/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.mobility.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons'"
 * @generated
 */
public interface ApogyAddonsMobilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mobility";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.addons.mobility";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mobility";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsMobilityPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.mobility.impl.ApogyAddonsMobilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.impl.MobilePlatformImpl <em>Mobile Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.impl.MobilePlatformImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.impl.ApogyAddonsMobilityPackageImpl#getMobilePlatform()
	 * @generated
	 */
	int MOBILE_PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__PARENT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__DESCRIPTION = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__NODE_ID = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__AGGREGATED_CHILDREN = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__MOVING = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mobile Platform Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mobile Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_FEATURE_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Mobile Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_OPERATION_COUNT = ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl <em>Skid Steered Mobile Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl
	 * @see ca.gc.asc_csa.apogy.addons.mobility.impl.ApogyAddonsMobilityPackageImpl#getSkidSteeredMobilePlatform()
	 * @generated
	 */
	int SKID_STEERED_MOBILE_PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__PARENT = MOBILE_PLATFORM__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__DESCRIPTION = MOBILE_PLATFORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__NODE_ID = MOBILE_PLATFORM__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__CHILDREN = MOBILE_PLATFORM__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__AGGREGATED_CHILDREN = MOBILE_PLATFORM__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__MOVING = MOBILE_PLATFORM__MOVING;

	/**
	 * The feature id for the '<em><b>Mobile Platform Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS = MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS;

	/**
	 * The feature id for the '<em><b>Commanded Right Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__COMMANDED_RIGHT_WHEELS_VELOCITY = MOBILE_PLATFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Right Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__ACTUAL_RIGHT_WHEELS_VELOCITY = MOBILE_PLATFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Commanded Left Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__COMMANDED_LEFT_WHEELS_VELOCITY = MOBILE_PLATFORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actual Left Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__ACTUAL_LEFT_WHEELS_VELOCITY = MOBILE_PLATFORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Commanded Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__COMMANDED_ANGULAR_VELOCITY = MOBILE_PLATFORM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__ACTUAL_ANGULAR_VELOCITY = MOBILE_PLATFORM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Commanded Translation Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__COMMANDED_TRANSLATION_VELOCITY = MOBILE_PLATFORM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Actual Translation Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__ACTUAL_TRANSLATION_VELOCITY = MOBILE_PLATFORM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Effective Steering Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM__EFFECTIVE_STEERING_WIDTH = MOBILE_PLATFORM_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Skid Steered Mobile Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM_FEATURE_COUNT = MOBILE_PLATFORM_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM___ACCEPT__INODEVISITOR = MOBILE_PLATFORM___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Skid Steered Mobile Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATFORM_OPERATION_COUNT = MOBILE_PLATFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.mobility.MobilePlatformStatus <em>Mobile Platform Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.mobility.MobilePlatformStatus
	 * @see ca.gc.asc_csa.apogy.addons.mobility.impl.ApogyAddonsMobilityPackageImpl#getMobilePlatformStatus()
	 * @generated
	 */
	int MOBILE_PLATFORM_STATUS = 2;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.MobilePlatform <em>Mobile Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Platform</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.MobilePlatform
	 * @generated
	 */
	EClass getMobilePlatform();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.MobilePlatform#isMoving <em>Moving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moving</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.MobilePlatform#isMoving()
	 * @see #getMobilePlatform()
	 * @generated
	 */
	EAttribute getMobilePlatform_Moving();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.MobilePlatform#getMobilePlatformStatus <em>Mobile Platform Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobile Platform Status</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.MobilePlatform#getMobilePlatformStatus()
	 * @see #getMobilePlatform()
	 * @generated
	 */
	EAttribute getMobilePlatform_MobilePlatformStatus();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform <em>Skid Steered Mobile Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skid Steered Mobile Platform</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform
	 * @generated
	 */
	EClass getSkidSteeredMobilePlatform();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedRightWheelsVelocity <em>Commanded Right Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Right Wheels Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedRightWheelsVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_CommandedRightWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualRightWheelsVelocity <em>Actual Right Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Right Wheels Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualRightWheelsVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_ActualRightWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedLeftWheelsVelocity <em>Commanded Left Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Left Wheels Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedLeftWheelsVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_CommandedLeftWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualLeftWheelsVelocity <em>Actual Left Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Left Wheels Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualLeftWheelsVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_ActualLeftWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedAngularVelocity <em>Commanded Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Angular Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedAngularVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_CommandedAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualAngularVelocity <em>Actual Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Angular Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualAngularVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_ActualAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedTranslationVelocity <em>Commanded Translation Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Translation Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getCommandedTranslationVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_CommandedTranslationVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualTranslationVelocity <em>Actual Translation Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Translation Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getActualTranslationVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_ActualTranslationVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getEffectiveSteeringWidth <em>Effective Steering Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Steering Width</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform#getEffectiveSteeringWidth()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_EffectiveSteeringWidth();

	/**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.addons.mobility.MobilePlatformStatus <em>Mobile Platform Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mobile Platform Status</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.MobilePlatformStatus
	 * @generated
	 */
	EEnum getMobilePlatformStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsMobilityFactory getApogyAddonsMobilityFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.impl.MobilePlatformImpl <em>Mobile Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.impl.MobilePlatformImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.impl.ApogyAddonsMobilityPackageImpl#getMobilePlatform()
		 * @generated
		 */
		EClass MOBILE_PLATFORM = eINSTANCE.getMobilePlatform();

		/**
		 * The meta object literal for the '<em><b>Moving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATFORM__MOVING = eINSTANCE.getMobilePlatform_Moving();

		/**
		 * The meta object literal for the '<em><b>Mobile Platform Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS = eINSTANCE.getMobilePlatform_MobilePlatformStatus();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl <em>Skid Steered Mobile Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.impl.SkidSteeredMobilePlatformImpl
		 * @see ca.gc.asc_csa.apogy.addons.mobility.impl.ApogyAddonsMobilityPackageImpl#getSkidSteeredMobilePlatform()
		 * @generated
		 */
		EClass SKID_STEERED_MOBILE_PLATFORM = eINSTANCE.getSkidSteeredMobilePlatform();

		/**
		 * The meta object literal for the '<em><b>Commanded Right Wheels Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATFORM__COMMANDED_RIGHT_WHEELS_VELOCITY = eINSTANCE.getSkidSteeredMobilePlatform_CommandedRightWheelsVelocity();

		/**
		 * The meta object literal for the '<em><b>Actual Right Wheels Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATFORM__ACTUAL_RIGHT_WHEELS_VELOCITY = eINSTANCE.getSkidSteeredMobilePlatform_ActualRightWheelsVelocity();

		/**
		 * The meta object literal for the '<em><b>Commanded Left Wheels Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATFORM__COMMANDED_LEFT_WHEELS_VELOCITY = eINSTANCE.getSkidSteeredMobilePlatform_CommandedLeftWheelsVelocity();

		/**
		 * The meta object literal for the '<em><b>Actual Left Wheels Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATFORM__ACTUAL_LEFT_WHEELS_VELOCITY = eINSTANCE.getSkidSteeredMobilePlatform_ActualLeftWheelsVelocity();

		/**
		 * The meta object literal for the '<em><b>Commanded Angular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATFORM__COMMANDED_ANGULAR_VELOCITY = eINSTANCE.getSkidSteeredMobilePlatform_CommandedAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>Actual Angular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATFORM__ACTUAL_ANGULAR_VELOCITY = eINSTANCE.getSkidSteeredMobilePlatform_ActualAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>Commanded Translation Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATFORM__COMMANDED_TRANSLATION_VELOCITY = eINSTANCE.getSkidSteeredMobilePlatform_CommandedTranslationVelocity();

		/**
		 * The meta object literal for the '<em><b>Actual Translation Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATFORM__ACTUAL_TRANSLATION_VELOCITY = eINSTANCE.getSkidSteeredMobilePlatform_ActualTranslationVelocity();

		/**
		 * The meta object literal for the '<em><b>Effective Steering Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATFORM__EFFECTIVE_STEERING_WIDTH = eINSTANCE.getSkidSteeredMobilePlatform_EffectiveSteeringWidth();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.mobility.MobilePlatformStatus <em>Mobile Platform Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.mobility.MobilePlatformStatus
		 * @see ca.gc.asc_csa.apogy.addons.mobility.impl.ApogyAddonsMobilityPackageImpl#getMobilePlatformStatus()
		 * @generated
		 */
		EEnum MOBILE_PLATFORM_STATUS = eINSTANCE.getMobilePlatformStatus();

	}

} //ApogyAddonsMobilityPackage
