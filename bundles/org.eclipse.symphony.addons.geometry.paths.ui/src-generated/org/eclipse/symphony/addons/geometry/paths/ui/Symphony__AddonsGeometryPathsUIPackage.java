/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.symphony.addons.geometry.paths.ui.Symphony__AddonsGeometryPathsUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__AddonsGeometryPathsUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__AddonsGeometryPathsUI' complianceLevel='6.0' modelDirectory='/org.eclipse.symphony.addons.geometry.paths.ui/src-generated' editDirectory='/org.eclipse.symphony.addons.geometry.paths.ui.edit/src-generated' basePackage='org.eclipse.symphony.addons.geometry.paths'"
 * @generated
 */
public interface Symphony__AddonsGeometryPathsUIPackage extends EPackage {
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
	String eNS_URI = "org.eclipse.symphony.addons.geometry.paths.ui";

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
	Symphony__AddonsGeometryPathsUIPackage eINSTANCE = org.eclipse.symphony.addons.geometry.paths.ui.impl.Symphony__AddonsGeometryPathsUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.ui.impl.WayPointPathPresentationImpl <em>Way Point Path Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.impl.WayPointPathPresentationImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.impl.Symphony__AddonsGeometryPathsUIPackageImpl#getWayPointPathPresentation()
	 * @generated
	 */
	int WAY_POINT_PATH_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Point Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__POINT_SIZE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__PRESENTATION_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Points Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION__END_POINTS_RADIUS = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Way Point Path Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Way Point Path Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PATH_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.ui.impl.WayPointPresentationImpl <em>Way Point Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.impl.WayPointPresentationImpl
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.impl.Symphony__AddonsGeometryPathsUIPackageImpl#getWayPointPresentation()
	 * @generated
	 */
	int WAY_POINT_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The number of structural features of the '<em>Way Point Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Way Point Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAY_POINT_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.geometry.paths.ui.PathPresentationMode <em>Path Presentation Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.PathPresentationMode
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.impl.Symphony__AddonsGeometryPathsUIPackageImpl#getPathPresentationMode()
	 * @generated
	 */
	int PATH_PRESENTATION_MODE = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation <em>Way Point Path Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way Point Path Presentation</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation
	 * @generated
	 */
	EClass getWayPointPathPresentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getPointSize <em>Point Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Size</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getPointSize()
	 * @see #getWayPointPathPresentation()
	 * @generated
	 */
	EAttribute getWayPointPathPresentation_PointSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getPresentationMode <em>Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Mode</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getPresentationMode()
	 * @see #getWayPointPathPresentation()
	 * @generated
	 */
	EAttribute getWayPointPathPresentation_PresentationMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getEndPointsRadius <em>End Points Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Points Radius</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation#getEndPointsRadius()
	 * @see #getWayPointPathPresentation()
	 * @generated
	 */
	EAttribute getWayPointPathPresentation_EndPointsRadius();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.geometry.paths.ui.WayPointPresentation <em>Way Point Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Way Point Presentation</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.WayPointPresentation
	 * @generated
	 */
	EClass getWayPointPresentation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.addons.geometry.paths.ui.PathPresentationMode <em>Path Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Path Presentation Mode</em>'.
	 * @see org.eclipse.symphony.addons.geometry.paths.ui.PathPresentationMode
	 * @generated
	 */
	EEnum getPathPresentationMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__AddonsGeometryPathsUIFactory getSymphony__AddonsGeometryPathsUIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.ui.impl.WayPointPathPresentationImpl <em>Way Point Path Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.ui.impl.WayPointPathPresentationImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.ui.impl.Symphony__AddonsGeometryPathsUIPackageImpl#getWayPointPathPresentation()
		 * @generated
		 */
		EClass WAY_POINT_PATH_PRESENTATION = eINSTANCE.getWayPointPathPresentation();

		/**
		 * The meta object literal for the '<em><b>Point Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAY_POINT_PATH_PRESENTATION__POINT_SIZE = eINSTANCE.getWayPointPathPresentation_PointSize();

		/**
		 * The meta object literal for the '<em><b>Presentation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAY_POINT_PATH_PRESENTATION__PRESENTATION_MODE = eINSTANCE.getWayPointPathPresentation_PresentationMode();

		/**
		 * The meta object literal for the '<em><b>End Points Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAY_POINT_PATH_PRESENTATION__END_POINTS_RADIUS = eINSTANCE.getWayPointPathPresentation_EndPointsRadius();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.ui.impl.WayPointPresentationImpl <em>Way Point Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.ui.impl.WayPointPresentationImpl
		 * @see org.eclipse.symphony.addons.geometry.paths.ui.impl.Symphony__AddonsGeometryPathsUIPackageImpl#getWayPointPresentation()
		 * @generated
		 */
		EClass WAY_POINT_PRESENTATION = eINSTANCE.getWayPointPresentation();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.geometry.paths.ui.PathPresentationMode <em>Path Presentation Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.geometry.paths.ui.PathPresentationMode
		 * @see org.eclipse.symphony.addons.geometry.paths.ui.impl.Symphony__AddonsGeometryPathsUIPackageImpl#getPathPresentationMode()
		 * @generated
		 */
		EEnum PATH_PRESENTATION_MODE = eINSTANCE.getPathPresentationMode();

	}

} //Symphony__AddonsGeometryPathsUIPackage
