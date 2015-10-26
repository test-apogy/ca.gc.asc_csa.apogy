/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data25d.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.topology.ui.TopologyUIPackage;

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
 * @see org.eclipse.symphony.common.geometry.data25d.ui.Symphony__CommonGeometryData25DUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CommonGeometryData25DUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__CommonGeometryData25DUI' complianceLevel='6.0' modelDirectory='/org.eclipse.symphony.common.geometry.data25d.ui/src-generated' editDirectory='/org.eclipse.symphony.common.geometry.data25d.ui.edit/src-generated' basePackage='org.eclipse.symphony.common.geometry.data25d'"
 * @generated
 */
public interface Symphony__CommonGeometryData25DUIPackage extends EPackage {
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
	String eNS_URI = "org.eclipse.symphony.common.geometry.data25d.ui";

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
	Symphony__CommonGeometryData25DUIPackage eINSTANCE = org.eclipse.symphony.common.geometry.data25d.ui.impl.Symphony__CommonGeometryData25DUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data25d.ui.impl.VolumetricCoordinatesSet25DPresentationImpl <em>Volumetric Coordinates Set25 DPresentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data25d.ui.impl.VolumetricCoordinatesSet25DPresentationImpl
	 * @see org.eclipse.symphony.common.geometry.data25d.ui.impl.Symphony__CommonGeometryData25DUIPackageImpl#getVolumetricCoordinatesSet25DPresentation()
	 * @generated
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__TOPOLOGY_PRESENTATION_SET = TopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__NODE = TopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__COLOR = TopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__VISIBLE = TopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__SHADOW_MODE = TopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__USE_IN_BOUNDING_CALCULATION = TopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__CENTROID = TopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__MIN = TopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__MAX = TopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__XRANGE = TopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__YRANGE = TopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__ZRANGE = TopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__SCENE_OBJECT = TopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Points Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__POINTS_CLOUD = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Volumetric Coordinates Set25 DPresentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION_FEATURE_COUNT = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Volumetric Coordinates Set25 DPresentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUMETRIC_COORDINATES_SET25_DPRESENTATION_OPERATION_COUNT = TopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation <em>Volumetric Coordinates Set25 DPresentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volumetric Coordinates Set25 DPresentation</em>'.
	 * @see org.eclipse.symphony.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation
	 * @generated
	 */
	EClass getVolumetricCoordinatesSet25DPresentation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation#getPointsCloud <em>Points Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Points Cloud</em>'.
	 * @see org.eclipse.symphony.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation#getPointsCloud()
	 * @see #getVolumetricCoordinatesSet25DPresentation()
	 * @generated
	 */
	EReference getVolumetricCoordinatesSet25DPresentation_PointsCloud();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__CommonGeometryData25DUIFactory getSymphony__CommonGeometryData25DUIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data25d.ui.impl.VolumetricCoordinatesSet25DPresentationImpl <em>Volumetric Coordinates Set25 DPresentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data25d.ui.impl.VolumetricCoordinatesSet25DPresentationImpl
		 * @see org.eclipse.symphony.common.geometry.data25d.ui.impl.Symphony__CommonGeometryData25DUIPackageImpl#getVolumetricCoordinatesSet25DPresentation()
		 * @generated
		 */
		EClass VOLUMETRIC_COORDINATES_SET25_DPRESENTATION = eINSTANCE.getVolumetricCoordinatesSet25DPresentation();

		/**
		 * The meta object literal for the '<em><b>Points Cloud</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__POINTS_CLOUD = eINSTANCE.getVolumetricCoordinatesSet25DPresentation_PointsCloud();

	}

} //Symphony__CommonGeometryData25DUIPackage
