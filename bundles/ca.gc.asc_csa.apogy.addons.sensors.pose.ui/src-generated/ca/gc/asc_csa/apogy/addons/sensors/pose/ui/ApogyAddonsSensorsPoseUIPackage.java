/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage;

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
 * @see org.eclipse.symphony.addons.sensors.pose.ui.Symphony__AddonsSensorsPoseUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__AddonsSensorsPoseUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__AddonsSensorsPoseUI' complianceLevel='6.0' modelDirectory='/org.eclipse.symphony.addons.sensors.pose.ui/src-generated' editDirectory='/org.eclipse.symphony.addons.sensors.pose.ui.edit/src-generated' basePackage='org.eclipse.symphony.addons.sensors.pose'"
 * @generated
 */
public interface Symphony__AddonsSensorsPoseUIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.addons.sensors.pose.ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsSensorsPoseUIPackage eINSTANCE = org.eclipse.symphony.addons.sensors.pose.ui.impl.Symphony__AddonsSensorsPoseUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.ui.impl.PositionSensorPresentationImpl <em>Position Sensor Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.PositionSensorPresentationImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.Symphony__AddonsSensorsPoseUIPackageImpl#getPositionSensorPresentation()
	 * @generated
	 */
	int POSITION_SENSOR_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Frame Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION__FRAME_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Sensor Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Position Sensor Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_SENSOR_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.ui.impl.OrientationSensorPresentationImpl <em>Orientation Sensor Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.OrientationSensorPresentationImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.Symphony__AddonsSensorsPoseUIPackageImpl#getOrientationSensorPresentation()
	 * @generated
	 */
	int ORIENTATION_SENSOR_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Frame Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION__FRAME_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orientation Sensor Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Orientation Sensor Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_SENSOR_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.pose.ui.impl.PoseSensorPresentationImpl <em>Pose Sensor Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.PoseSensorPresentationImpl
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.Symphony__AddonsSensorsPoseUIPackageImpl#getPoseSensorPresentation()
	 * @generated
	 */
	int POSE_SENSOR_PRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Frame Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION__FRAME_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pose Sensor Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pose Sensor Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_SENSOR_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.ui.PositionSensorPresentation <em>Position Sensor Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Sensor Presentation</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.PositionSensorPresentation
	 * @generated
	 */
	EClass getPositionSensorPresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.ui.PositionSensorPresentation#isFrameVisible <em>Frame Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Visible</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.PositionSensorPresentation#isFrameVisible()
	 * @see #getPositionSensorPresentation()
	 * @generated
	 */
	EAttribute getPositionSensorPresentation_FrameVisible();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.ui.OrientationSensorPresentation <em>Orientation Sensor Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orientation Sensor Presentation</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.OrientationSensorPresentation
	 * @generated
	 */
	EClass getOrientationSensorPresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.ui.OrientationSensorPresentation#isFrameVisible <em>Frame Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Visible</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.OrientationSensorPresentation#isFrameVisible()
	 * @see #getOrientationSensorPresentation()
	 * @generated
	 */
	EAttribute getOrientationSensorPresentation_FrameVisible();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.pose.ui.PoseSensorPresentation <em>Pose Sensor Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose Sensor Presentation</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.PoseSensorPresentation
	 * @generated
	 */
	EClass getPoseSensorPresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.pose.ui.PoseSensorPresentation#isFrameVisible <em>Frame Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame Visible</em>'.
	 * @see org.eclipse.symphony.addons.sensors.pose.ui.PoseSensorPresentation#isFrameVisible()
	 * @see #getPoseSensorPresentation()
	 * @generated
	 */
	EAttribute getPoseSensorPresentation_FrameVisible();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__AddonsSensorsPoseUIFactory getSymphony__AddonsSensorsPoseUIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.ui.impl.PositionSensorPresentationImpl <em>Position Sensor Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.PositionSensorPresentationImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.Symphony__AddonsSensorsPoseUIPackageImpl#getPositionSensorPresentation()
		 * @generated
		 */
		EClass POSITION_SENSOR_PRESENTATION = eINSTANCE.getPositionSensorPresentation();

		/**
		 * The meta object literal for the '<em><b>Frame Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_SENSOR_PRESENTATION__FRAME_VISIBLE = eINSTANCE.getPositionSensorPresentation_FrameVisible();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.ui.impl.OrientationSensorPresentationImpl <em>Orientation Sensor Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.OrientationSensorPresentationImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.Symphony__AddonsSensorsPoseUIPackageImpl#getOrientationSensorPresentation()
		 * @generated
		 */
		EClass ORIENTATION_SENSOR_PRESENTATION = eINSTANCE.getOrientationSensorPresentation();

		/**
		 * The meta object literal for the '<em><b>Frame Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIENTATION_SENSOR_PRESENTATION__FRAME_VISIBLE = eINSTANCE.getOrientationSensorPresentation_FrameVisible();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.pose.ui.impl.PoseSensorPresentationImpl <em>Pose Sensor Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.PoseSensorPresentationImpl
		 * @see org.eclipse.symphony.addons.sensors.pose.ui.impl.Symphony__AddonsSensorsPoseUIPackageImpl#getPoseSensorPresentation()
		 * @generated
		 */
		EClass POSE_SENSOR_PRESENTATION = eINSTANCE.getPoseSensorPresentation();

		/**
		 * The meta object literal for the '<em><b>Frame Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSE_SENSOR_PRESENTATION__FRAME_VISIBLE = eINSTANCE.getPoseSensorPresentation_FrameVisible();

	}

} //Symphony__AddonsSensorsPoseUIPackage
