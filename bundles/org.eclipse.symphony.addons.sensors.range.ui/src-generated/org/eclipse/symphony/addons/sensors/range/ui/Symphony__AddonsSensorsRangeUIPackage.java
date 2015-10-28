/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range.ui;

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
 * @see org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__AddonsSensorsRangeUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__AddonsSensorsRangeUI' complianceLevel='6.0' modelDirectory='/org.eclipse.symphony.addons.sensors.range.ui/src-generated' editDirectory='/org.eclipse.symphony.addons.sensors.range.ui.edit/src-generated' basePackage='org.eclipse.symphony.addons.sensors.range'"
 * @generated
 */
public interface Symphony__AddonsSensorsRangeUIPackage extends EPackage {
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
	String eNS_URI = "org.eclipse.symphony.addons.sensors.range.ui";

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
	Symphony__AddonsSensorsRangeUIPackage eINSTANCE = org.eclipse.symphony.addons.sensors.range.ui.impl.Symphony__AddonsSensorsRangeUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.ui.impl.RasterScanDataPresentationImpl <em>Raster Scan Data Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.ui.impl.RasterScanDataPresentationImpl
	 * @see org.eclipse.symphony.addons.sensors.range.ui.impl.Symphony__AddonsSensorsRangeUIPackageImpl#getRasterScanDataPresentation()
	 * @generated
	 */
	int RASTER_SCAN_DATA_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Fov Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__FOV_PRESENTATION_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fov Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__FOV_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION__DATA_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Raster Scan Data Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Raster Scan Data Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASTER_SCAN_DATA_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.range.ui.impl.SimpleSonarPresentationImpl <em>Simple Sonar Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.range.ui.impl.SimpleSonarPresentationImpl
	 * @see org.eclipse.symphony.addons.sensors.range.ui.impl.Symphony__AddonsSensorsRangeUIPackageImpl#getSimpleSonarPresentation()
	 * @generated
	 */
	int SIMPLE_SONAR_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Detected Range Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION__DETECTED_RANGE_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Sonar Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Sonar Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SONAR_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation <em>Raster Scan Data Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raster Scan Data Presentation</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation
	 * @generated
	 */
	EClass getRasterScanDataPresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#getFovPresentationMode <em>Fov Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fov Presentation Mode</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#getFovPresentationMode()
	 * @see #getRasterScanDataPresentation()
	 * @generated
	 */
	EAttribute getRasterScanDataPresentation_FovPresentationMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#isFovVisible <em>Fov Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fov Visible</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#isFovVisible()
	 * @see #getRasterScanDataPresentation()
	 * @generated
	 */
	EAttribute getRasterScanDataPresentation_FovVisible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#isDataVisible <em>Data Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Visible</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#isDataVisible()
	 * @see #getRasterScanDataPresentation()
	 * @generated
	 */
	EAttribute getRasterScanDataPresentation_DataVisible();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.range.ui.SimpleSonarPresentation <em>Simple Sonar Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Sonar Presentation</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.ui.SimpleSonarPresentation
	 * @generated
	 */
	EClass getSimpleSonarPresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.range.ui.SimpleSonarPresentation#isDetectedRangeVisible <em>Detected Range Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detected Range Visible</em>'.
	 * @see org.eclipse.symphony.addons.sensors.range.ui.SimpleSonarPresentation#isDetectedRangeVisible()
	 * @see #getSimpleSonarPresentation()
	 * @generated
	 */
	EAttribute getSimpleSonarPresentation_DetectedRangeVisible();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__AddonsSensorsRangeUIFactory getSymphony__AddonsSensorsRangeUIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.ui.impl.RasterScanDataPresentationImpl <em>Raster Scan Data Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.ui.impl.RasterScanDataPresentationImpl
		 * @see org.eclipse.symphony.addons.sensors.range.ui.impl.Symphony__AddonsSensorsRangeUIPackageImpl#getRasterScanDataPresentation()
		 * @generated
		 */
		EClass RASTER_SCAN_DATA_PRESENTATION = eINSTANCE.getRasterScanDataPresentation();

		/**
		 * The meta object literal for the '<em><b>Fov Presentation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RASTER_SCAN_DATA_PRESENTATION__FOV_PRESENTATION_MODE = eINSTANCE.getRasterScanDataPresentation_FovPresentationMode();

		/**
		 * The meta object literal for the '<em><b>Fov Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RASTER_SCAN_DATA_PRESENTATION__FOV_VISIBLE = eINSTANCE.getRasterScanDataPresentation_FovVisible();

		/**
		 * The meta object literal for the '<em><b>Data Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RASTER_SCAN_DATA_PRESENTATION__DATA_VISIBLE = eINSTANCE.getRasterScanDataPresentation_DataVisible();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.range.ui.impl.SimpleSonarPresentationImpl <em>Simple Sonar Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.range.ui.impl.SimpleSonarPresentationImpl
		 * @see org.eclipse.symphony.addons.sensors.range.ui.impl.Symphony__AddonsSensorsRangeUIPackageImpl#getSimpleSonarPresentation()
		 * @generated
		 */
		EClass SIMPLE_SONAR_PRESENTATION = eINSTANCE.getSimpleSonarPresentation();

		/**
		 * The meta object literal for the '<em><b>Detected Range Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_SONAR_PRESENTATION__DETECTED_RANGE_VISIBLE = eINSTANCE.getSimpleSonarPresentation_DetectedRangeVisible();

	}

} //Symphony__AddonsSensorsRangeUIPackage