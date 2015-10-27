/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
 * @see org.eclipse.symphony.common.geometry.data3d.ui.Symphony__CommonGeometryData3DUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CommonGeometryData3DUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__CommonGeometryData3DUI' complianceLevel='6.0' modelDirectory='/org.eclipse.symphony.common.geometry.data3d.ui/src-generated' editDirectory='/org.eclipse.symphony.common.geometry.data3d.ui.edit/src-generated' basePackage='org.eclipse.symphony.common.geometry.data3d'"
 * @generated
 */
public interface Symphony__CommonGeometryData3DUIPackage extends EPackage {
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
	String eNS_URI = "org.eclipse.symphony.common.geometry.data3d.ui";

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
	Symphony__CommonGeometryData3DUIPackage eINSTANCE = org.eclipse.symphony.common.geometry.data3d.ui.impl.Symphony__CommonGeometryData3DUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.CartesianCoordinatesSetPresentationImpl <em>Cartesian Coordinates Set Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.impl.CartesianCoordinatesSetPresentationImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.impl.Symphony__CommonGeometryData3DUIPackageImpl#getCartesianCoordinatesSetPresentation()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Point Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION__NUMBER_OF_POINTS = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Set Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cartesian Coordinates Set Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl <em>Triangular Mesh Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.impl.Symphony__CommonGeometryData3DUIPackageImpl#getTriangularMeshPresentation()
	 * @generated
	 */
	int TRIANGULAR_MESH_PRESENTATION = 1;

	/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

	/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

	/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

	/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

	/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

	/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

	/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__MESH = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Point Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__POINT_SIZE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Of Polygons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Use Shading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__USE_SHADING = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Texture Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Triangular Mesh Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Triangular Mesh Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULAR_MESH_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation <em>Cartesian Coordinates Set Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Set Presentation</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation
	 * @generated
	 */
	EClass getCartesianCoordinatesSetPresentation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointCloud <em>Point Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point Cloud</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointCloud()
	 * @see #getCartesianCoordinatesSetPresentation()
	 * @generated
	 */
	EReference getCartesianCoordinatesSetPresentation_PointCloud();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointSize <em>Point Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Size</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointSize()
	 * @see #getCartesianCoordinatesSetPresentation()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetPresentation_PointSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getNumberOfPoints <em>Number Of Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Points</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getNumberOfPoints()
	 * @see #getCartesianCoordinatesSetPresentation()
	 * @generated
	 */
	EAttribute getCartesianCoordinatesSetPresentation_NumberOfPoints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation <em>Triangular Mesh Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangular Mesh Presentation</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation
	 * @generated
	 */
	EClass getTriangularMeshPresentation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mesh</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getMesh()
	 * @see #getTriangularMeshPresentation()
	 * @generated
	 */
	EReference getTriangularMeshPresentation_Mesh();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getPointSize <em>Point Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Size</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getPointSize()
	 * @see #getTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getTriangularMeshPresentation_PointSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getNumberOfPoints <em>Number Of Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Points</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getNumberOfPoints()
	 * @see #getTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getTriangularMeshPresentation_NumberOfPoints();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getNumberOfPolygons <em>Number Of Polygons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Polygons</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getNumberOfPolygons()
	 * @see #getTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getTriangularMeshPresentation_NumberOfPolygons();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getPresentationMode <em>Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Mode</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getPresentationMode()
	 * @see #getTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getTriangularMeshPresentation_PresentationMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getTransparency <em>Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparency</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getTransparency()
	 * @see #getTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getTriangularMeshPresentation_Transparency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#isUseShading <em>Use Shading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Shading</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#isUseShading()
	 * @see #getTriangularMeshPresentation()
	 * @generated
	 */
	EAttribute getTriangularMeshPresentation_UseShading();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getTextureImage <em>Texture Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Texture Image</em>'.
	 * @see org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation#getTextureImage()
	 * @see #getTriangularMeshPresentation()
	 * @generated
	 */
	EReference getTriangularMeshPresentation_TextureImage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__CommonGeometryData3DUIFactory getSymphony__CommonGeometryData3DUIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.CartesianCoordinatesSetPresentationImpl <em>Cartesian Coordinates Set Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.ui.impl.CartesianCoordinatesSetPresentationImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.ui.impl.Symphony__CommonGeometryData3DUIPackageImpl#getCartesianCoordinatesSetPresentation()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_SET_PRESENTATION = eINSTANCE.getCartesianCoordinatesSetPresentation();

		/**
		 * The meta object literal for the '<em><b>Point Cloud</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD = eINSTANCE.getCartesianCoordinatesSetPresentation_PointCloud();

		/**
		 * The meta object literal for the '<em><b>Point Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE = eINSTANCE.getCartesianCoordinatesSetPresentation_PointSize();

		/**
		 * The meta object literal for the '<em><b>Number Of Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_COORDINATES_SET_PRESENTATION__NUMBER_OF_POINTS = eINSTANCE.getCartesianCoordinatesSetPresentation_NumberOfPoints();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl <em>Triangular Mesh Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl
		 * @see org.eclipse.symphony.common.geometry.data3d.ui.impl.Symphony__CommonGeometryData3DUIPackageImpl#getTriangularMeshPresentation()
		 * @generated
		 */
		EClass TRIANGULAR_MESH_PRESENTATION = eINSTANCE.getTriangularMeshPresentation();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGULAR_MESH_PRESENTATION__MESH = eINSTANCE.getTriangularMeshPresentation_Mesh();

		/**
		 * The meta object literal for the '<em><b>Point Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGULAR_MESH_PRESENTATION__POINT_SIZE = eINSTANCE.getTriangularMeshPresentation_PointSize();

		/**
		 * The meta object literal for the '<em><b>Number Of Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS = eINSTANCE.getTriangularMeshPresentation_NumberOfPoints();

		/**
		 * The meta object literal for the '<em><b>Number Of Polygons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS = eINSTANCE.getTriangularMeshPresentation_NumberOfPolygons();

		/**
		 * The meta object literal for the '<em><b>Presentation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE = eINSTANCE.getTriangularMeshPresentation_PresentationMode();

		/**
		 * The meta object literal for the '<em><b>Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY = eINSTANCE.getTriangularMeshPresentation_Transparency();

		/**
		 * The meta object literal for the '<em><b>Use Shading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGULAR_MESH_PRESENTATION__USE_SHADING = eINSTANCE.getTriangularMeshPresentation_UseShading();

		/**
		 * The meta object literal for the '<em><b>Texture Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE = eINSTANCE.getTriangularMeshPresentation_TextureImage();

	}

} //Symphony__CommonGeometryData3DUIPackage
