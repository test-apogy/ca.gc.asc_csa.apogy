/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;

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
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsSensorsFOVUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='ApogyAddonsSensorsFOVUI' complianceLevel='6.0' modelDirectory='/ca.gc.asc_csa.apogy.addons.sensors.fov.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.sensors.fov.ui.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons.sensors.fov'"
 * @generated
 */
public interface ApogyAddonsSensorsFOVUIPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.addons.sensors.fov.ui";

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
	ApogyAddonsSensorsFOVUIPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ApogyAddonsSensorsFOVUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.FieldOfViewPresentationImpl <em>Field Of View Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.FieldOfViewPresentationImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ApogyAddonsSensorsFOVUIPackageImpl#getFieldOfViewPresentation()
	 * @generated
	 */
	int FIELD_OF_VIEW_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__TOPOLOGY_PRESENTATION_SET = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__NODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__VISIBLE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__SHADOW_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__USE_IN_BOUNDING_CALCULATION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__CENTROID = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__MIN = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__MAX = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__XRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__YRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__ZRANGE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__SCENE_OBJECT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Outline Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Show Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Projection Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Field Of View Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION_FEATURE_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Field Of View Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OF_VIEW_PRESENTATION_OPERATION_COUNT = ApogyCommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.CircularSectorFieldOfViewPresentationImpl <em>Circular Sector Field Of View Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.CircularSectorFieldOfViewPresentationImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ApogyAddonsSensorsFOVUIPackageImpl#getCircularSectorFieldOfViewPresentation()
	 * @generated
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__TOPOLOGY_PRESENTATION_SET = FIELD_OF_VIEW_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__NODE = FIELD_OF_VIEW_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__COLOR = FIELD_OF_VIEW_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__VISIBLE = FIELD_OF_VIEW_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__SHADOW_MODE = FIELD_OF_VIEW_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__USE_IN_BOUNDING_CALCULATION = FIELD_OF_VIEW_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__CENTROID = FIELD_OF_VIEW_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__MIN = FIELD_OF_VIEW_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__MAX = FIELD_OF_VIEW_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__XRANGE = FIELD_OF_VIEW_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__YRANGE = FIELD_OF_VIEW_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__ZRANGE = FIELD_OF_VIEW_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__SCENE_OBJECT = FIELD_OF_VIEW_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY = FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY;

	/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE = FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE;

	/**
	 * The feature id for the '<em><b>Show Outline Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY = FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY;

	/**
	 * The feature id for the '<em><b>Show Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION = FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION;

	/**
	 * The feature id for the '<em><b>Projection Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR = FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR;

	/**
	 * The number of structural features of the '<em>Circular Sector Field Of View Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION_FEATURE_COUNT = FIELD_OF_VIEW_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Circular Sector Field Of View Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION_OPERATION_COUNT = FIELD_OF_VIEW_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ConicalFieldOfViewPresentationImpl <em>Conical Field Of View Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ConicalFieldOfViewPresentationImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ApogyAddonsSensorsFOVUIPackageImpl#getConicalFieldOfViewPresentation()
	 * @generated
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__TOPOLOGY_PRESENTATION_SET = FIELD_OF_VIEW_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__NODE = FIELD_OF_VIEW_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__COLOR = FIELD_OF_VIEW_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__VISIBLE = FIELD_OF_VIEW_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__SHADOW_MODE = FIELD_OF_VIEW_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__USE_IN_BOUNDING_CALCULATION = FIELD_OF_VIEW_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__CENTROID = FIELD_OF_VIEW_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__MIN = FIELD_OF_VIEW_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__MAX = FIELD_OF_VIEW_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__XRANGE = FIELD_OF_VIEW_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__YRANGE = FIELD_OF_VIEW_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__ZRANGE = FIELD_OF_VIEW_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__SCENE_OBJECT = FIELD_OF_VIEW_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY = FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY;

	/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE = FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE;

	/**
	 * The feature id for the '<em><b>Show Outline Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY = FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY;

	/**
	 * The feature id for the '<em><b>Show Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION = FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION;

	/**
	 * The feature id for the '<em><b>Projection Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR = FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR;

	/**
	 * The number of structural features of the '<em>Conical Field Of View Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION_FEATURE_COUNT = FIELD_OF_VIEW_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conical Field Of View Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONICAL_FIELD_OF_VIEW_PRESENTATION_OPERATION_COUNT = FIELD_OF_VIEW_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.RectangularFrustrumFieldOfViewPresentationImpl <em>Rectangular Frustrum Field Of View Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.RectangularFrustrumFieldOfViewPresentationImpl
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ApogyAddonsSensorsFOVUIPackageImpl#getRectangularFrustrumFieldOfViewPresentation()
	 * @generated
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__TOPOLOGY_PRESENTATION_SET = FIELD_OF_VIEW_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__NODE = FIELD_OF_VIEW_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__COLOR = FIELD_OF_VIEW_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__VISIBLE = FIELD_OF_VIEW_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__SHADOW_MODE = FIELD_OF_VIEW_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__USE_IN_BOUNDING_CALCULATION = FIELD_OF_VIEW_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__CENTROID = FIELD_OF_VIEW_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__MIN = FIELD_OF_VIEW_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__MAX = FIELD_OF_VIEW_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__XRANGE = FIELD_OF_VIEW_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__YRANGE = FIELD_OF_VIEW_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__ZRANGE = FIELD_OF_VIEW_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__SCENE_OBJECT = FIELD_OF_VIEW_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY = FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY;

	/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE = FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE;

	/**
	 * The feature id for the '<em><b>Show Outline Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY = FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY;

	/**
	 * The feature id for the '<em><b>Show Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION = FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION;

	/**
	 * The feature id for the '<em><b>Projection Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR = FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR;

	/**
	 * The number of structural features of the '<em>Rectangular Frustrum Field Of View Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION_FEATURE_COUNT = FIELD_OF_VIEW_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rectangular Frustrum Field Of View Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION_OPERATION_COUNT = FIELD_OF_VIEW_PRESENTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation <em>Field Of View Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Of View Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation
	 * @generated
	 */
	EClass getFieldOfViewPresentation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getTransparency <em>Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparency</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getTransparency()
	 * @see #getFieldOfViewPresentation()
	 * @generated
	 */
	EAttribute getFieldOfViewPresentation_Transparency();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getPresentationMode <em>Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Mode</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getPresentationMode()
	 * @see #getFieldOfViewPresentation()
	 * @generated
	 */
	EAttribute getFieldOfViewPresentation_PresentationMode();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#isShowOutlineOnly <em>Show Outline Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Outline Only</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#isShowOutlineOnly()
	 * @see #getFieldOfViewPresentation()
	 * @generated
	 */
	EAttribute getFieldOfViewPresentation_ShowOutlineOnly();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#isShowProjection <em>Show Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Projection</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#isShowProjection()
	 * @see #getFieldOfViewPresentation()
	 * @generated
	 */
	EAttribute getFieldOfViewPresentation_ShowProjection();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getProjectionColor <em>Projection Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projection Color</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getProjectionColor()
	 * @see #getFieldOfViewPresentation()
	 * @generated
	 */
	EAttribute getFieldOfViewPresentation_ProjectionColor();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation <em>Circular Sector Field Of View Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circular Sector Field Of View Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation
	 * @generated
	 */
	EClass getCircularSectorFieldOfViewPresentation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ConicalFieldOfViewPresentation <em>Conical Field Of View Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conical Field Of View Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ConicalFieldOfViewPresentation
	 * @generated
	 */
	EClass getConicalFieldOfViewPresentation();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation <em>Rectangular Frustrum Field Of View Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangular Frustrum Field Of View Presentation</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation
	 * @generated
	 */
	EClass getRectangularFrustrumFieldOfViewPresentation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsSensorsFOVUIFactory getApogyAddonsSensorsFOVUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.FieldOfViewPresentationImpl <em>Field Of View Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.FieldOfViewPresentationImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ApogyAddonsSensorsFOVUIPackageImpl#getFieldOfViewPresentation()
		 * @generated
		 */
		EClass FIELD_OF_VIEW_PRESENTATION = eINSTANCE.getFieldOfViewPresentation();

		/**
		 * The meta object literal for the '<em><b>Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_OF_VIEW_PRESENTATION__TRANSPARENCY = eINSTANCE.getFieldOfViewPresentation_Transparency();

		/**
		 * The meta object literal for the '<em><b>Presentation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_OF_VIEW_PRESENTATION__PRESENTATION_MODE = eINSTANCE.getFieldOfViewPresentation_PresentationMode();

		/**
		 * The meta object literal for the '<em><b>Show Outline Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_OF_VIEW_PRESENTATION__SHOW_OUTLINE_ONLY = eINSTANCE.getFieldOfViewPresentation_ShowOutlineOnly();

		/**
		 * The meta object literal for the '<em><b>Show Projection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_OF_VIEW_PRESENTATION__SHOW_PROJECTION = eINSTANCE.getFieldOfViewPresentation_ShowProjection();

		/**
		 * The meta object literal for the '<em><b>Projection Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_OF_VIEW_PRESENTATION__PROJECTION_COLOR = eINSTANCE.getFieldOfViewPresentation_ProjectionColor();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.CircularSectorFieldOfViewPresentationImpl <em>Circular Sector Field Of View Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.CircularSectorFieldOfViewPresentationImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ApogyAddonsSensorsFOVUIPackageImpl#getCircularSectorFieldOfViewPresentation()
		 * @generated
		 */
		EClass CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION = eINSTANCE.getCircularSectorFieldOfViewPresentation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ConicalFieldOfViewPresentationImpl <em>Conical Field Of View Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ConicalFieldOfViewPresentationImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ApogyAddonsSensorsFOVUIPackageImpl#getConicalFieldOfViewPresentation()
		 * @generated
		 */
		EClass CONICAL_FIELD_OF_VIEW_PRESENTATION = eINSTANCE.getConicalFieldOfViewPresentation();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.RectangularFrustrumFieldOfViewPresentationImpl <em>Rectangular Frustrum Field Of View Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.RectangularFrustrumFieldOfViewPresentationImpl
		 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl.ApogyAddonsSensorsFOVUIPackageImpl#getRectangularFrustrumFieldOfViewPresentation()
		 * @generated
		 */
		EClass RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION = eINSTANCE.getRectangularFrustrumFieldOfViewPresentation();

	}

} //ApogyAddonsSensorsFOVUIPackage
