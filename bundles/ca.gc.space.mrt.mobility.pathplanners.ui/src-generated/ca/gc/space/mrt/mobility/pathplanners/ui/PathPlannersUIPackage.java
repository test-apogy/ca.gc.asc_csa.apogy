/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.mobility.pathplanners.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import ca.gc.space.topology.ui.TopologyUIPackage;

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
 * @see ca.gc.space.mrt.mobility.pathplanners.ui.PathPlannersUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='PathPlannersUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='PathPlannersUI' complianceLevel='6.0' modelDirectory='/ca.gc.space.mrt.mobility.pathplanners.ui/src-generated' editDirectory='/ca.gc.space.mrt.mobility.pathplanners.ui.edit/src-generated' basePackage='ca.gc.space.mrt.mobility.pathplanners'"
 * @generated
 */
public interface PathPlannersUIPackage extends EPackage {
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
	String eNS_URI = "ca.gc.space.mrt.mobility.pathplanners.ui";

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
	PathPlannersUIPackage eINSTANCE = ca.gc.space.mrt.mobility.pathplanners.ui.impl.PathPlannersUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.mobility.pathplanners.ui.impl.CircularExclusionZonePresentationImpl <em>Circular Exclusion Zone Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.mobility.pathplanners.ui.impl.CircularExclusionZonePresentationImpl
	 * @see ca.gc.space.mrt.mobility.pathplanners.ui.impl.PathPlannersUIPackageImpl#getCircularExclusionZonePresentation()
	 * @generated
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = TopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__NODE = TopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__COLOR = TopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__VISIBLE = TopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__SHADOW_MODE = TopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = TopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__CENTROID = TopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__MIN = TopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__MAX = TopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__XRANGE = TopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__YRANGE = TopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__ZRANGE = TopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__SCENE_OBJECT = TopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__TRANSPARENCY = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__PRESENTATION_MODE = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION__HEIGHT = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Circular Exclusion Zone Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION_FEATURE_COUNT = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Circular Exclusion Zone Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_EXCLUSION_ZONE_PRESENTATION_OPERATION_COUNT = TopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation <em>Circular Exclusion Zone Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circular Exclusion Zone Presentation</em>'.
	 * @see ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation
	 * @generated
	 */
	EClass getCircularExclusionZonePresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getTransparency <em>Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparency</em>'.
	 * @see ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getTransparency()
	 * @see #getCircularExclusionZonePresentation()
	 * @generated
	 */
	EAttribute getCircularExclusionZonePresentation_Transparency();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getPresentationMode <em>Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Mode</em>'.
	 * @see ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getPresentationMode()
	 * @see #getCircularExclusionZonePresentation()
	 * @generated
	 */
	EAttribute getCircularExclusionZonePresentation_PresentationMode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation#getHeight()
	 * @see #getCircularExclusionZonePresentation()
	 * @generated
	 */
	EAttribute getCircularExclusionZonePresentation_Height();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PathPlannersUIFactory getPathPlannersUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.space.mrt.mobility.pathplanners.ui.impl.CircularExclusionZonePresentationImpl <em>Circular Exclusion Zone Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.mobility.pathplanners.ui.impl.CircularExclusionZonePresentationImpl
		 * @see ca.gc.space.mrt.mobility.pathplanners.ui.impl.PathPlannersUIPackageImpl#getCircularExclusionZonePresentation()
		 * @generated
		 */
		EClass CIRCULAR_EXCLUSION_ZONE_PRESENTATION = eINSTANCE.getCircularExclusionZonePresentation();

		/**
		 * The meta object literal for the '<em><b>Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCULAR_EXCLUSION_ZONE_PRESENTATION__TRANSPARENCY = eINSTANCE.getCircularExclusionZonePresentation_Transparency();

		/**
		 * The meta object literal for the '<em><b>Presentation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCULAR_EXCLUSION_ZONE_PRESENTATION__PRESENTATION_MODE = eINSTANCE.getCircularExclusionZonePresentation_PresentationMode();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCULAR_EXCLUSION_ZONE_PRESENTATION__HEIGHT = eINSTANCE.getCircularExclusionZonePresentation_Height();

	}

} //PathPlannersUIPackage
