/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.symphony.common.topology.TopologyPackage;

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
 * @see org.eclipse.symphony.addons.mobility.MobilityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Mobility' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)' modelName='Mobility' modelDirectory='/org.eclipse.symphony.addons.mobility/src-generated' editDirectory='/org.eclipse.symphony.addons.mobility.edit/src-generated' basePackage='org.eclipse.symphony.addons'"
 * @generated
 */
public interface MobilityPackage extends EPackage {
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
	String eNS_URI = "org.eclipse.symphony.addons.mobility";

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
	MobilityPackage eINSTANCE = org.eclipse.symphony.addons.mobility.impl.MobilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.mobility.impl.MobilePlatformImpl <em>Mobile Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.mobility.impl.MobilePlatformImpl
	 * @see org.eclipse.symphony.addons.mobility.impl.MobilityPackageImpl#getMobilePlatform()
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
	int MOBILE_PLATFORM__PARENT = TopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__DESCRIPTION = TopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__NODE_ID = TopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__AGGREGATED_CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__MOVING = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mobile Platform Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mobile Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_FEATURE_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM___ACCEPT__INODEVISITOR = TopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Mobile Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATFORM_OPERATION_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.mobility.impl.SkidSteeredMobilePlatformImpl <em>Skid Steered Mobile Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.mobility.impl.SkidSteeredMobilePlatformImpl
	 * @see org.eclipse.symphony.addons.mobility.impl.MobilityPackageImpl#getSkidSteeredMobilePlatform()
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
	 * The meta object id for the '{@link org.eclipse.symphony.addons.mobility.MobilePlatformStatus <em>Mobile Platform Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.mobility.MobilePlatformStatus
	 * @see org.eclipse.symphony.addons.mobility.impl.MobilityPackageImpl#getMobilePlatformStatus()
	 * @generated
	 */
	int MOBILE_PLATFORM_STATUS = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.mobility.MobilePlatform <em>Mobile Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Platform</em>'.
	 * @see org.eclipse.symphony.addons.mobility.MobilePlatform
	 * @generated
	 */
	EClass getMobilePlatform();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.MobilePlatform#isMoving <em>Moving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moving</em>'.
	 * @see org.eclipse.symphony.addons.mobility.MobilePlatform#isMoving()
	 * @see #getMobilePlatform()
	 * @generated
	 */
	EAttribute getMobilePlatform_Moving();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.MobilePlatform#getMobilePlatformStatus <em>Mobile Platform Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobile Platform Status</em>'.
	 * @see org.eclipse.symphony.addons.mobility.MobilePlatform#getMobilePlatformStatus()
	 * @see #getMobilePlatform()
	 * @generated
	 */
	EAttribute getMobilePlatform_MobilePlatformStatus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform <em>Skid Steered Mobile Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skid Steered Mobile Platform</em>'.
	 * @see org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform
	 * @generated
	 */
	EClass getSkidSteeredMobilePlatform();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedRightWheelsVelocity <em>Commanded Right Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Right Wheels Velocity</em>'.
	 * @see org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedRightWheelsVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_CommandedRightWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualRightWheelsVelocity <em>Actual Right Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Right Wheels Velocity</em>'.
	 * @see org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualRightWheelsVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_ActualRightWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedLeftWheelsVelocity <em>Commanded Left Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Left Wheels Velocity</em>'.
	 * @see org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedLeftWheelsVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_CommandedLeftWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualLeftWheelsVelocity <em>Actual Left Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Left Wheels Velocity</em>'.
	 * @see org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualLeftWheelsVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_ActualLeftWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedAngularVelocity <em>Commanded Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Angular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedAngularVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_CommandedAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualAngularVelocity <em>Actual Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Angular Velocity</em>'.
	 * @see org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualAngularVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_ActualAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedTranslationVelocity <em>Commanded Translation Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Translation Velocity</em>'.
	 * @see org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getCommandedTranslationVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_CommandedTranslationVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualTranslationVelocity <em>Actual Translation Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Translation Velocity</em>'.
	 * @see org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getActualTranslationVelocity()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_ActualTranslationVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getEffectiveSteeringWidth <em>Effective Steering Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Steering Width</em>'.
	 * @see org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform#getEffectiveSteeringWidth()
	 * @see #getSkidSteeredMobilePlatform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlatform_EffectiveSteeringWidth();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.addons.mobility.MobilePlatformStatus <em>Mobile Platform Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mobile Platform Status</em>'.
	 * @see org.eclipse.symphony.addons.mobility.MobilePlatformStatus
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
	MobilityFactory getMobilityFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.mobility.impl.MobilePlatformImpl <em>Mobile Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.mobility.impl.MobilePlatformImpl
		 * @see org.eclipse.symphony.addons.mobility.impl.MobilityPackageImpl#getMobilePlatform()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.mobility.impl.SkidSteeredMobilePlatformImpl <em>Skid Steered Mobile Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.mobility.impl.SkidSteeredMobilePlatformImpl
		 * @see org.eclipse.symphony.addons.mobility.impl.MobilityPackageImpl#getSkidSteeredMobilePlatform()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.mobility.MobilePlatformStatus <em>Mobile Platform Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.mobility.MobilePlatformStatus
		 * @see org.eclipse.symphony.addons.mobility.impl.MobilityPackageImpl#getMobilePlatformStatus()
		 * @generated
		 */
		EEnum MOBILE_PLATFORM_STATUS = eINSTANCE.getMobilePlatformStatus();

	}

} //MobilityPackage
