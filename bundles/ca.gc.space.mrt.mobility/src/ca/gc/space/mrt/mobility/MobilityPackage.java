/**
 * Canadian Space Agency 2007.
 *
 * $Id: MobilityPackage.java,v 1.4.4.2 2015/05/21 15:51:26 pallard Exp $
 */
package ca.gc.space.mrt.mobility;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.mobility.MobilityFactory
 * @model kind="package"
 * @generated
 */
public interface MobilityPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	String eNS_URI = "http:///ca/gc/space/mrt/mobility/model/mobility.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.mrt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobilityPackage eINSTANCE = ca.gc.space.mrt.mobility.impl.MobilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.mobility.impl.MobilePlateformImpl <em>Mobile Plateform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.mobility.impl.MobilePlateformImpl
	 * @see ca.gc.space.mrt.mobility.impl.MobilityPackageImpl#getMobilePlateform()
	 * @generated
	 */
	int MOBILE_PLATEFORM = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATEFORM__PARENT = TopologyPackage.AGGREGATE_GROUP_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATEFORM__DESCRIPTION = TopologyPackage.AGGREGATE_GROUP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATEFORM__NODE_ID = TopologyPackage.AGGREGATE_GROUP_NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATEFORM__CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATEFORM__AGGREGATED_CHILDREN = TopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATEFORM__MOVING = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mobile Plateform Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATEFORM__MOBILE_PLATEFORM_STATUS = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mobile Plateform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATEFORM_FEATURE_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATEFORM___ACCEPT__INODEVISITOR = TopologyPackage.AGGREGATE_GROUP_NODE___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Mobile Plateform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PLATEFORM_OPERATION_COUNT = TopologyPackage.AGGREGATE_GROUP_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.mobility.impl.SkidSteeredMobilePlateformImpl <em>Skid Steered Mobile Plateform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.mobility.impl.SkidSteeredMobilePlateformImpl
	 * @see ca.gc.space.mrt.mobility.impl.MobilityPackageImpl#getSkidSteeredMobilePlateform()
	 * @generated
	 */
	int SKID_STEERED_MOBILE_PLATEFORM = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__PARENT = MOBILE_PLATEFORM__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__DESCRIPTION = MOBILE_PLATEFORM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__NODE_ID = MOBILE_PLATEFORM__NODE_ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__CHILDREN = MOBILE_PLATEFORM__CHILDREN;

	/**
	 * The feature id for the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__AGGREGATED_CHILDREN = MOBILE_PLATEFORM__AGGREGATED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__MOVING = MOBILE_PLATEFORM__MOVING;

	/**
	 * The feature id for the '<em><b>Mobile Plateform Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__MOBILE_PLATEFORM_STATUS = MOBILE_PLATEFORM__MOBILE_PLATEFORM_STATUS;

	/**
	 * The feature id for the '<em><b>Commanded Right Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_RIGHT_WHEELS_VELOCITY = MOBILE_PLATEFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Right Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_RIGHT_WHEELS_VELOCITY = MOBILE_PLATEFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Commanded Left Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_LEFT_WHEELS_VELOCITY = MOBILE_PLATEFORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actual Left Wheels Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_LEFT_WHEELS_VELOCITY = MOBILE_PLATEFORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Commanded Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_ANGULAR_VELOCITY = MOBILE_PLATEFORM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual Angular Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_ANGULAR_VELOCITY = MOBILE_PLATEFORM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Commanded Translation Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_TRANSLATION_VELOCITY = MOBILE_PLATEFORM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Actual Translation Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_TRANSLATION_VELOCITY = MOBILE_PLATEFORM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Effective Steering Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM__EFFECTIVE_STEERING_WIDTH = MOBILE_PLATEFORM_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Skid Steered Mobile Plateform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM_FEATURE_COUNT = MOBILE_PLATEFORM_FEATURE_COUNT + 9;


	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM___ACCEPT__INODEVISITOR = MOBILE_PLATEFORM___ACCEPT__INODEVISITOR;

	/**
	 * The number of operations of the '<em>Skid Steered Mobile Plateform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKID_STEERED_MOBILE_PLATEFORM_OPERATION_COUNT = MOBILE_PLATEFORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.mobility.MobilePlateformStatus <em>Mobile Plateform Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.mobility.MobilePlateformStatus
	 * @see ca.gc.space.mrt.mobility.impl.MobilityPackageImpl#getMobilePlateformStatus()
	 * @generated
	 */
	int MOBILE_PLATEFORM_STATUS = 2;


	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.mobility.MobilePlateform <em>Mobile Plateform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Plateform</em>'.
	 * @see ca.gc.space.mrt.mobility.MobilePlateform
	 * @generated
	 */
	EClass getMobilePlateform();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.MobilePlateform#isMoving <em>Moving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moving</em>'.
	 * @see ca.gc.space.mrt.mobility.MobilePlateform#isMoving()
	 * @see #getMobilePlateform()
	 * @generated
	 */
	EAttribute getMobilePlateform_Moving();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.MobilePlateform#getMobilePlateformStatus <em>Mobile Plateform Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobile Plateform Status</em>'.
	 * @see ca.gc.space.mrt.mobility.MobilePlateform#getMobilePlateformStatus()
	 * @see #getMobilePlateform()
	 * @generated
	 */
	EAttribute getMobilePlateform_MobilePlateformStatus();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform <em>Skid Steered Mobile Plateform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skid Steered Mobile Plateform</em>'.
	 * @see ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform
	 * @generated
	 */
	EClass getSkidSteeredMobilePlateform();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getCommandedRightWheelsVelocity <em>Commanded Right Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Right Wheels Velocity</em>'.
	 * @see ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getCommandedRightWheelsVelocity()
	 * @see #getSkidSteeredMobilePlateform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlateform_CommandedRightWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getActualRightWheelsVelocity <em>Actual Right Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Right Wheels Velocity</em>'.
	 * @see ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getActualRightWheelsVelocity()
	 * @see #getSkidSteeredMobilePlateform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlateform_ActualRightWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getCommandedLeftWheelsVelocity <em>Commanded Left Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Left Wheels Velocity</em>'.
	 * @see ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getCommandedLeftWheelsVelocity()
	 * @see #getSkidSteeredMobilePlateform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlateform_CommandedLeftWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getActualLeftWheelsVelocity <em>Actual Left Wheels Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Left Wheels Velocity</em>'.
	 * @see ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getActualLeftWheelsVelocity()
	 * @see #getSkidSteeredMobilePlateform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlateform_ActualLeftWheelsVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getCommandedAngularVelocity <em>Commanded Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Angular Velocity</em>'.
	 * @see ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getCommandedAngularVelocity()
	 * @see #getSkidSteeredMobilePlateform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlateform_CommandedAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getActualAngularVelocity <em>Actual Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Angular Velocity</em>'.
	 * @see ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getActualAngularVelocity()
	 * @see #getSkidSteeredMobilePlateform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlateform_ActualAngularVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getCommandedTranslationVelocity <em>Commanded Translation Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Translation Velocity</em>'.
	 * @see ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getCommandedTranslationVelocity()
	 * @see #getSkidSteeredMobilePlateform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlateform_CommandedTranslationVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getActualTranslationVelocity <em>Actual Translation Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Translation Velocity</em>'.
	 * @see ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getActualTranslationVelocity()
	 * @see #getSkidSteeredMobilePlateform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlateform_ActualTranslationVelocity();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getEffectiveSteeringWidth <em>Effective Steering Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Steering Width</em>'.
	 * @see ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform#getEffectiveSteeringWidth()
	 * @see #getSkidSteeredMobilePlateform()
	 * @generated
	 */
	EAttribute getSkidSteeredMobilePlateform_EffectiveSteeringWidth();

	/**
	 * Returns the meta object for enum '{@link ca.gc.space.mrt.mobility.MobilePlateformStatus <em>Mobile Plateform Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mobile Plateform Status</em>'.
	 * @see ca.gc.space.mrt.mobility.MobilePlateformStatus
	 * @generated
	 */
	EEnum getMobilePlateformStatus();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.mobility.impl.MobilePlateformImpl <em>Mobile Plateform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.mobility.impl.MobilePlateformImpl
		 * @see ca.gc.space.mrt.mobility.impl.MobilityPackageImpl#getMobilePlateform()
		 * @generated
		 */
		EClass MOBILE_PLATEFORM = eINSTANCE.getMobilePlateform();

		/**
		 * The meta object literal for the '<em><b>Moving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATEFORM__MOVING = eINSTANCE.getMobilePlateform_Moving();

		/**
		 * The meta object literal for the '<em><b>Mobile Plateform Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_PLATEFORM__MOBILE_PLATEFORM_STATUS = eINSTANCE.getMobilePlateform_MobilePlateformStatus();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.mobility.impl.SkidSteeredMobilePlateformImpl <em>Skid Steered Mobile Plateform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.mobility.impl.SkidSteeredMobilePlateformImpl
		 * @see ca.gc.space.mrt.mobility.impl.MobilityPackageImpl#getSkidSteeredMobilePlateform()
		 * @generated
		 */
		EClass SKID_STEERED_MOBILE_PLATEFORM = eINSTANCE.getSkidSteeredMobilePlateform();

		/**
		 * The meta object literal for the '<em><b>Commanded Right Wheels Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_RIGHT_WHEELS_VELOCITY = eINSTANCE.getSkidSteeredMobilePlateform_CommandedRightWheelsVelocity();

		/**
		 * The meta object literal for the '<em><b>Actual Right Wheels Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_RIGHT_WHEELS_VELOCITY = eINSTANCE.getSkidSteeredMobilePlateform_ActualRightWheelsVelocity();

		/**
		 * The meta object literal for the '<em><b>Commanded Left Wheels Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_LEFT_WHEELS_VELOCITY = eINSTANCE.getSkidSteeredMobilePlateform_CommandedLeftWheelsVelocity();

		/**
		 * The meta object literal for the '<em><b>Actual Left Wheels Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_LEFT_WHEELS_VELOCITY = eINSTANCE.getSkidSteeredMobilePlateform_ActualLeftWheelsVelocity();

		/**
		 * The meta object literal for the '<em><b>Commanded Angular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_ANGULAR_VELOCITY = eINSTANCE.getSkidSteeredMobilePlateform_CommandedAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>Actual Angular Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_ANGULAR_VELOCITY = eINSTANCE.getSkidSteeredMobilePlateform_ActualAngularVelocity();

		/**
		 * The meta object literal for the '<em><b>Commanded Translation Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATEFORM__COMMANDED_TRANSLATION_VELOCITY = eINSTANCE.getSkidSteeredMobilePlateform_CommandedTranslationVelocity();

		/**
		 * The meta object literal for the '<em><b>Actual Translation Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATEFORM__ACTUAL_TRANSLATION_VELOCITY = eINSTANCE.getSkidSteeredMobilePlateform_ActualTranslationVelocity();

		/**
		 * The meta object literal for the '<em><b>Effective Steering Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKID_STEERED_MOBILE_PLATEFORM__EFFECTIVE_STEERING_WIDTH = eINSTANCE.getSkidSteeredMobilePlateform_EffectiveSteeringWidth();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.mobility.MobilePlateformStatus <em>Mobile Plateform Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.mobility.MobilePlateformStatus
		 * @see ca.gc.space.mrt.mobility.impl.MobilityPackageImpl#getMobilePlateformStatus()
		 * @generated
		 */
		EEnum MOBILE_PLATEFORM_STATUS = eINSTANCE.getMobilePlateformStatus();

	}

} //MobilityPackage
