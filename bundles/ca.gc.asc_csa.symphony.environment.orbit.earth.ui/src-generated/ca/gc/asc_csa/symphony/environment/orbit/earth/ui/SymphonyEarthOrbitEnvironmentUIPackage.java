/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.core.SymphonyCorePackage;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;

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
 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyEarthOrbitEnvironmentUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='SymphonyEarthOrbitEnvironmentUI' complianceLevel='8.0' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.symphony.environment.orbit.earth.ui/src-generated' editDirectory='/ca.gc.asc_csa.symphony.environment.orbit.earth.ui.edit/src-generated' basePackage='ca.gc.asc_csa.symphony.environment.orbit.earth'"
 * @generated
 */
public interface SymphonyEarthOrbitEnvironmentUIPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.symphony.environment.orbit.earth.ui";

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
	SymphonyEarthOrbitEnvironmentUIPackage eINSTANCE = ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthViewConfigurationListImpl <em>Earth View Configuration List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthViewConfigurationListImpl
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getEarthViewConfigurationList()
	 * @generated
	 */
	int EARTH_VIEW_CONFIGURATION_LIST = 0;

	/**
	 * The feature id for the '<em><b>Tools List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_VIEW_CONFIGURATION_LIST__TOOLS_LIST = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST;

	/**
	 * The feature id for the '<em><b>Earth View Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Earth View Configuration List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_VIEW_CONFIGURATION_LIST_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Earth View Configuration List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_VIEW_CONFIGURATION_LIST_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthViewConfigurationImpl <em>Earth View Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthViewConfigurationImpl
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getEarthViewConfiguration()
	 * @generated
	 */
	int EARTH_VIEW_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_VIEW_CONFIGURATION__NAME = EMFEcorePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_VIEW_CONFIGURATION__DESCRIPTION = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_VIEW_CONFIGURATION__LAYERS = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Earth View Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_VIEW_CONFIGURATION_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Earth View Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_VIEW_CONFIGURATION_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.AbstractWorldWindLayerImpl <em>Abstract World Wind Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.AbstractWorldWindLayerImpl
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getAbstractWorldWindLayer()
	 * @generated
	 */
	int ABSTRACT_WORLD_WIND_LAYER = 2;

	/**
	 * The feature id for the '<em><b>Updating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORLD_WIND_LAYER__UPDATING = SymphonyCorePackage.UPDATABLE__UPDATING;

	/**
	 * The feature id for the '<em><b>Auto Update Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORLD_WIND_LAYER__AUTO_UPDATE_ENABLED = SymphonyCorePackage.UPDATABLE__AUTO_UPDATE_ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORLD_WIND_LAYER__VISIBLE = SymphonyCorePackage.UPDATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Renderable Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER = SymphonyCorePackage.UPDATABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT = SymphonyCorePackage.UPDATABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORLD_WIND_LAYER___GET_DEFAULT_AUTO_UPDATE_ENABLED = SymphonyCorePackage.UPDATABLE___GET_DEFAULT_AUTO_UPDATE_ENABLED;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORLD_WIND_LAYER___UPDATE = SymphonyCorePackage.UPDATABLE___UPDATE;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORLD_WIND_LAYER___DISPOSE = SymphonyCorePackage.UPDATABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WORLD_WIND_LAYER_OPERATION_COUNT = SymphonyCorePackage.UPDATABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftLocationWorldWindLayerImpl <em>Spacecraft Location World Wind Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftLocationWorldWindLayerImpl
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getSpacecraftLocationWorldWindLayer()
	 * @generated
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER = 3;

	/**
	 * The feature id for the '<em><b>Updating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER__UPDATING = ABSTRACT_WORLD_WIND_LAYER__UPDATING;

	/**
	 * The feature id for the '<em><b>Auto Update Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER__AUTO_UPDATE_ENABLED = ABSTRACT_WORLD_WIND_LAYER__AUTO_UPDATE_ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER__VISIBLE = ABSTRACT_WORLD_WIND_LAYER__VISIBLE;

	/**
	 * The feature id for the '<em><b>Renderable Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER__RENDERABLE_LAYER = ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER__NAME = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER__ORBIT_MODEL = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER__TIME_SOURCE = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Show Ground Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_GROUND_PROJECTION = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Show Lat Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_LAT_LON = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Spacecraft Location World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER_FEATURE_COUNT = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER___GET_DEFAULT_AUTO_UPDATE_ENABLED = ABSTRACT_WORLD_WIND_LAYER___GET_DEFAULT_AUTO_UPDATE_ENABLED;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER___UPDATE = ABSTRACT_WORLD_WIND_LAYER___UPDATE;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER___DISPOSE = ABSTRACT_WORLD_WIND_LAYER___DISPOSE;

	/**
	 * The number of operations of the '<em>Spacecraft Location World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_LOCATION_WORLD_WIND_LAYER_OPERATION_COUNT = ABSTRACT_WORLD_WIND_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.OrbitModelWorldWindLayerImpl <em>Orbit Model World Wind Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.OrbitModelWorldWindLayerImpl
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getOrbitModelWorldWindLayer()
	 * @generated
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER = 4;

	/**
	 * The feature id for the '<em><b>Updating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER__UPDATING = ABSTRACT_WORLD_WIND_LAYER__UPDATING;

	/**
	 * The feature id for the '<em><b>Auto Update Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER__AUTO_UPDATE_ENABLED = ABSTRACT_WORLD_WIND_LAYER__AUTO_UPDATE_ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER__VISIBLE = ABSTRACT_WORLD_WIND_LAYER__VISIBLE;

	/**
	 * The feature id for the '<em><b>Renderable Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER__RENDERABLE_LAYER = ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER;

	/**
	 * The feature id for the '<em><b>Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER__ORBIT_MODEL = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER__TIME_SOURCE = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER__TIME_INTERVAL = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Forward Propagation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Backward Propagation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Show Ground Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_GROUND_TRACE = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Show Orbit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_ORBIT = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Orbit Model World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER_FEATURE_COUNT = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER___GET_DEFAULT_AUTO_UPDATE_ENABLED = ABSTRACT_WORLD_WIND_LAYER___GET_DEFAULT_AUTO_UPDATE_ENABLED;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER___UPDATE = ABSTRACT_WORLD_WIND_LAYER___UPDATE;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER___DISPOSE = ABSTRACT_WORLD_WIND_LAYER___DISPOSE;

	/**
	 * The number of operations of the '<em>Orbit Model World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_WORLD_WIND_LAYER_OPERATION_COUNT = ABSTRACT_WORLD_WIND_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl <em>Spacecraft Swath World Wind Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getSpacecraftSwathWorldWindLayer()
	 * @generated
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER = 5;

	/**
	 * The feature id for the '<em><b>Updating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__UPDATING = ABSTRACT_WORLD_WIND_LAYER__UPDATING;

	/**
	 * The feature id for the '<em><b>Auto Update Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__AUTO_UPDATE_ENABLED = ABSTRACT_WORLD_WIND_LAYER__AUTO_UPDATE_ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__VISIBLE = ABSTRACT_WORLD_WIND_LAYER__VISIBLE;

	/**
	 * The feature id for the '<em><b>Renderable Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__RENDERABLE_LAYER = ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER;

	/**
	 * The feature id for the '<em><b>Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__ORBIT_MODEL = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_SOURCE = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Forward Propagation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Backward Propagation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_INTERVAL = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Left Swath Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__LEFT_SWATH_ANGLE = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Right Swath Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__RIGHT_SWATH_ANGLE = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Show Ground Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__SHOW_GROUND_TRACE = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Forward Spacecraft Swath Corridor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Backward Spacecraft Swath Corridor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Spacecraft Swath World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER_FEATURE_COUNT = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER___GET_DEFAULT_AUTO_UPDATE_ENABLED = ABSTRACT_WORLD_WIND_LAYER___GET_DEFAULT_AUTO_UPDATE_ENABLED;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER___UPDATE = ABSTRACT_WORLD_WIND_LAYER___UPDATE;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER___DISPOSE = ABSTRACT_WORLD_WIND_LAYER___DISPOSE;

	/**
	 * The number of operations of the '<em>Spacecraft Swath World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_SWATH_WORLD_WIND_LAYER_OPERATION_COUNT = ABSTRACT_WORLD_WIND_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthSurfaceLocationWorldWindLayerImpl <em>Earth Surface Location World Wind Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthSurfaceLocationWorldWindLayerImpl
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getEarthSurfaceLocationWorldWindLayer()
	 * @generated
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER = 6;

	/**
	 * The feature id for the '<em><b>Updating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__UPDATING = ABSTRACT_WORLD_WIND_LAYER__UPDATING;

	/**
	 * The feature id for the '<em><b>Auto Update Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__AUTO_UPDATE_ENABLED = ABSTRACT_WORLD_WIND_LAYER__AUTO_UPDATE_ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__VISIBLE = ABSTRACT_WORLD_WIND_LAYER__VISIBLE;

	/**
	 * The feature id for the '<em><b>Renderable Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__RENDERABLE_LAYER = ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER;

	/**
	 * The feature id for the '<em><b>Earth Surface Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__TARGET_RADIUS = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Earth Surface Location World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER_FEATURE_COUNT = ABSTRACT_WORLD_WIND_LAYER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER___GET_DEFAULT_AUTO_UPDATE_ENABLED = ABSTRACT_WORLD_WIND_LAYER___GET_DEFAULT_AUTO_UPDATE_ENABLED;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER___UPDATE = ABSTRACT_WORLD_WIND_LAYER___UPDATE;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER___DISPOSE = ABSTRACT_WORLD_WIND_LAYER___DISPOSE;

	/**
	 * The number of operations of the '<em>Earth Surface Location World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER_OPERATION_COUNT = ABSTRACT_WORLD_WIND_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.GroundStationWorldWindLayerImpl <em>Ground Station World Wind Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.GroundStationWorldWindLayerImpl
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getGroundStationWorldWindLayer()
	 * @generated
	 */
	int GROUND_STATION_WORLD_WIND_LAYER = 7;

	/**
	 * The feature id for the '<em><b>Updating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER__UPDATING = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__UPDATING;

	/**
	 * The feature id for the '<em><b>Auto Update Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER__AUTO_UPDATE_ENABLED = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__AUTO_UPDATE_ENABLED;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER__VISIBLE = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__VISIBLE;

	/**
	 * The feature id for the '<em><b>Renderable Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER__RENDERABLE_LAYER = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__RENDERABLE_LAYER;

	/**
	 * The feature id for the '<em><b>Earth Surface Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION;

	/**
	 * The feature id for the '<em><b>Target Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER__TARGET_RADIUS = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__TARGET_RADIUS;

	/**
	 * The feature id for the '<em><b>Ground Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER__GROUND_STATION = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER__REFERENCE_ALTITUDE = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ground Station World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER_FEATURE_COUNT = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Default Auto Update Enabled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER___GET_DEFAULT_AUTO_UPDATE_ENABLED = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER___GET_DEFAULT_AUTO_UPDATE_ENABLED;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER___UPDATE = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER___UPDATE;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER___DISPOSE = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER___DISPOSE;

	/**
	 * The number of operations of the '<em>Ground Station World Wind Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_STATION_WORLD_WIND_LAYER_OPERATION_COUNT = EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationListImpl <em>Spacecraft Visibility Pass View Configuration List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationListImpl
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getSpacecraftVisibilityPassViewConfigurationList()
	 * @generated
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST = 8;

	/**
	 * The feature id for the '<em><b>Tools List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__TOOLS_LIST = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spacecraft Visibility Pass View Configuration List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Spacecraft Visibility Pass View Configuration List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationImpl <em>Spacecraft Visibility Pass View Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationImpl
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getSpacecraftVisibilityPassViewConfiguration()
	 * @generated
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__NAME = EMFEcorePackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__DESCRIPTION = EMFEcorePackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configurations List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST = EMFEcorePackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET = EMFEcorePackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spacecraft Visibility Pass View Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_FEATURE_COUNT = EMFEcorePackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Spacecraft Visibility Pass View Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_OPERATION_COUNT = EMFEcorePackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Renderable Layer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.nasa.worldwind.layers.RenderableLayer
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getRenderableLayer()
	 * @generated
	 */
	int RENDERABLE_LAYER = 10;


	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 11;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthViewConfigurationList <em>Earth View Configuration List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth View Configuration List</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthViewConfigurationList
	 * @generated
	 */
	EClass getEarthViewConfigurationList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthViewConfigurationList#getEarthViewConfigurations <em>Earth View Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Earth View Configurations</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthViewConfigurationList#getEarthViewConfigurations()
	 * @see #getEarthViewConfigurationList()
	 * @generated
	 */
	EReference getEarthViewConfigurationList_EarthViewConfigurations();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthViewConfiguration <em>Earth View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth View Configuration</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthViewConfiguration
	 * @generated
	 */
	EClass getEarthViewConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthViewConfiguration#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthViewConfiguration#getLayers()
	 * @see #getEarthViewConfiguration()
	 * @generated
	 */
	EReference getEarthViewConfiguration_Layers();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.AbstractWorldWindLayer <em>Abstract World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract World Wind Layer</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.AbstractWorldWindLayer
	 * @generated
	 */
	EClass getAbstractWorldWindLayer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.AbstractWorldWindLayer#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.AbstractWorldWindLayer#isVisible()
	 * @see #getAbstractWorldWindLayer()
	 * @generated
	 */
	EAttribute getAbstractWorldWindLayer_Visible();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.AbstractWorldWindLayer#getRenderableLayer <em>Renderable Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Renderable Layer</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.AbstractWorldWindLayer#getRenderableLayer()
	 * @see #getAbstractWorldWindLayer()
	 * @generated
	 */
	EAttribute getAbstractWorldWindLayer_RenderableLayer();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.AbstractWorldWindLayer#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.AbstractWorldWindLayer#dispose()
	 * @generated
	 */
	EOperation getAbstractWorldWindLayer__Dispose();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer <em>Spacecraft Location World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecraft Location World Wind Layer</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer
	 * @generated
	 */
	EClass getSpacecraftLocationWorldWindLayer();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#getOrbitModel <em>Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orbit Model</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#getOrbitModel()
	 * @see #getSpacecraftLocationWorldWindLayer()
	 * @generated
	 */
	EReference getSpacecraftLocationWorldWindLayer_OrbitModel();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#getTimeSource <em>Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Source</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#getTimeSource()
	 * @see #getSpacecraftLocationWorldWindLayer()
	 * @generated
	 */
	EReference getSpacecraftLocationWorldWindLayer_TimeSource();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#isShowGroundProjection <em>Show Ground Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Ground Projection</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#isShowGroundProjection()
	 * @see #getSpacecraftLocationWorldWindLayer()
	 * @generated
	 */
	EAttribute getSpacecraftLocationWorldWindLayer_ShowGroundProjection();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#isShowLatLon <em>Show Lat Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Lat Lon</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer#isShowLatLon()
	 * @see #getSpacecraftLocationWorldWindLayer()
	 * @generated
	 */
	EAttribute getSpacecraftLocationWorldWindLayer_ShowLatLon();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer <em>Orbit Model World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbit Model World Wind Layer</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer
	 * @generated
	 */
	EClass getOrbitModelWorldWindLayer();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getOrbitModel <em>Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orbit Model</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getOrbitModel()
	 * @see #getOrbitModelWorldWindLayer()
	 * @generated
	 */
	EReference getOrbitModelWorldWindLayer_OrbitModel();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getTimeSource <em>Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Source</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getTimeSource()
	 * @see #getOrbitModelWorldWindLayer()
	 * @generated
	 */
	EReference getOrbitModelWorldWindLayer_TimeSource();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getTimeInterval()
	 * @see #getOrbitModelWorldWindLayer()
	 * @generated
	 */
	EAttribute getOrbitModelWorldWindLayer_TimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getForwardPropagationDuration <em>Forward Propagation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forward Propagation Duration</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getForwardPropagationDuration()
	 * @see #getOrbitModelWorldWindLayer()
	 * @generated
	 */
	EAttribute getOrbitModelWorldWindLayer_ForwardPropagationDuration();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getBackwardPropagationDuration <em>Backward Propagation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backward Propagation Duration</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getBackwardPropagationDuration()
	 * @see #getOrbitModelWorldWindLayer()
	 * @generated
	 */
	EAttribute getOrbitModelWorldWindLayer_BackwardPropagationDuration();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#isShowGroundTrace <em>Show Ground Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Ground Trace</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#isShowGroundTrace()
	 * @see #getOrbitModelWorldWindLayer()
	 * @generated
	 */
	EAttribute getOrbitModelWorldWindLayer_ShowGroundTrace();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#isShowOrbit <em>Show Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Orbit</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.OrbitModelWorldWindLayer#isShowOrbit()
	 * @see #getOrbitModelWorldWindLayer()
	 * @generated
	 */
	EAttribute getOrbitModelWorldWindLayer_ShowOrbit();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer <em>Spacecraft Swath World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecraft Swath World Wind Layer</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer
	 * @generated
	 */
	EClass getSpacecraftSwathWorldWindLayer();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getOrbitModel <em>Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orbit Model</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getOrbitModel()
	 * @see #getSpacecraftSwathWorldWindLayer()
	 * @generated
	 */
	EReference getSpacecraftSwathWorldWindLayer_OrbitModel();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getTimeSource <em>Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Source</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getTimeSource()
	 * @see #getSpacecraftSwathWorldWindLayer()
	 * @generated
	 */
	EReference getSpacecraftSwathWorldWindLayer_TimeSource();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getForwardPropagationDuration <em>Forward Propagation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forward Propagation Duration</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getForwardPropagationDuration()
	 * @see #getSpacecraftSwathWorldWindLayer()
	 * @generated
	 */
	EAttribute getSpacecraftSwathWorldWindLayer_ForwardPropagationDuration();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getBackwardPropagationDuration <em>Backward Propagation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backward Propagation Duration</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getBackwardPropagationDuration()
	 * @see #getSpacecraftSwathWorldWindLayer()
	 * @generated
	 */
	EAttribute getSpacecraftSwathWorldWindLayer_BackwardPropagationDuration();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Interval</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getTimeInterval()
	 * @see #getSpacecraftSwathWorldWindLayer()
	 * @generated
	 */
	EAttribute getSpacecraftSwathWorldWindLayer_TimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getLeftSwathAngle <em>Left Swath Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Swath Angle</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getLeftSwathAngle()
	 * @see #getSpacecraftSwathWorldWindLayer()
	 * @generated
	 */
	EAttribute getSpacecraftSwathWorldWindLayer_LeftSwathAngle();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getRightSwathAngle <em>Right Swath Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Swath Angle</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getRightSwathAngle()
	 * @see #getSpacecraftSwathWorldWindLayer()
	 * @generated
	 */
	EAttribute getSpacecraftSwathWorldWindLayer_RightSwathAngle();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#isShowGroundTrace <em>Show Ground Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Ground Trace</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#isShowGroundTrace()
	 * @see #getSpacecraftSwathWorldWindLayer()
	 * @generated
	 */
	EAttribute getSpacecraftSwathWorldWindLayer_ShowGroundTrace();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getForwardSpacecraftSwathCorridor <em>Forward Spacecraft Swath Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forward Spacecraft Swath Corridor</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getForwardSpacecraftSwathCorridor()
	 * @see #getSpacecraftSwathWorldWindLayer()
	 * @generated
	 */
	EReference getSpacecraftSwathWorldWindLayer_ForwardSpacecraftSwathCorridor();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getBackwardSpacecraftSwathCorridor <em>Backward Spacecraft Swath Corridor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Backward Spacecraft Swath Corridor</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getBackwardSpacecraftSwathCorridor()
	 * @see #getSpacecraftSwathWorldWindLayer()
	 * @generated
	 */
	EReference getSpacecraftSwathWorldWindLayer_BackwardSpacecraftSwathCorridor();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer <em>Earth Surface Location World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Surface Location World Wind Layer</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer
	 * @generated
	 */
	EClass getEarthSurfaceLocationWorldWindLayer();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getEarthSurfaceLocation <em>Earth Surface Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Earth Surface Location</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getEarthSurfaceLocation()
	 * @see #getEarthSurfaceLocationWorldWindLayer()
	 * @generated
	 */
	EReference getEarthSurfaceLocationWorldWindLayer_EarthSurfaceLocation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getTargetRadius <em>Target Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Radius</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer#getTargetRadius()
	 * @see #getEarthSurfaceLocationWorldWindLayer()
	 * @generated
	 */
	EAttribute getEarthSurfaceLocationWorldWindLayer_TargetRadius();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.GroundStationWorldWindLayer <em>Ground Station World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Station World Wind Layer</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.GroundStationWorldWindLayer
	 * @generated
	 */
	EClass getGroundStationWorldWindLayer();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.GroundStationWorldWindLayer#getGroundStation <em>Ground Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ground Station</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.GroundStationWorldWindLayer#getGroundStation()
	 * @see #getGroundStationWorldWindLayer()
	 * @generated
	 */
	EReference getGroundStationWorldWindLayer_GroundStation();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.GroundStationWorldWindLayer#getReferenceAltitude <em>Reference Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Altitude</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.GroundStationWorldWindLayer#getReferenceAltitude()
	 * @see #getGroundStationWorldWindLayer()
	 * @generated
	 */
	EAttribute getGroundStationWorldWindLayer_ReferenceAltitude();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList <em>Spacecraft Visibility Pass View Configuration List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecraft Visibility Pass View Configuration List</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList
	 * @generated
	 */
	EClass getSpacecraftVisibilityPassViewConfigurationList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList#getConfigurations()
	 * @see #getSpacecraftVisibilityPassViewConfigurationList()
	 * @generated
	 */
	EReference getSpacecraftVisibilityPassViewConfigurationList_Configurations();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration <em>Spacecraft Visibility Pass View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecraft Visibility Pass View Configuration</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration
	 * @generated
	 */
	EClass getSpacecraftVisibilityPassViewConfiguration();

	/**
	 * Returns the meta object for the container reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Configurations List</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getConfigurationsList()
	 * @see #getSpacecraftVisibilityPassViewConfiguration()
	 * @generated
	 */
	EReference getSpacecraftVisibilityPassViewConfiguration_ConfigurationsList();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getVisibilitySet <em>Visibility Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility Set</em>'.
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getVisibilitySet()
	 * @see #getSpacecraftVisibilityPassViewConfiguration()
	 * @generated
	 */
	EReference getSpacecraftVisibilityPassViewConfiguration_VisibilitySet();

	/**
	 * Returns the meta object for data type '{@link gov.nasa.worldwind.layers.RenderableLayer <em>Renderable Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Renderable Layer</em>'.
	 * @see gov.nasa.worldwind.layers.RenderableLayer
	 * @model instanceClass="gov.nasa.worldwind.layers.RenderableLayer"
	 * @generated
	 */
	EDataType getRenderableLayer();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SymphonyEarthOrbitEnvironmentUIFactory getSymphonyEarthOrbitEnvironmentUIFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthViewConfigurationListImpl <em>Earth View Configuration List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthViewConfigurationListImpl
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getEarthViewConfigurationList()
		 * @generated
		 */
		EClass EARTH_VIEW_CONFIGURATION_LIST = eINSTANCE.getEarthViewConfigurationList();

		/**
		 * The meta object literal for the '<em><b>Earth View Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS = eINSTANCE.getEarthViewConfigurationList_EarthViewConfigurations();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthViewConfigurationImpl <em>Earth View Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthViewConfigurationImpl
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getEarthViewConfiguration()
		 * @generated
		 */
		EClass EARTH_VIEW_CONFIGURATION = eINSTANCE.getEarthViewConfiguration();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_VIEW_CONFIGURATION__LAYERS = eINSTANCE.getEarthViewConfiguration_Layers();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.AbstractWorldWindLayerImpl <em>Abstract World Wind Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.AbstractWorldWindLayerImpl
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getAbstractWorldWindLayer()
		 * @generated
		 */
		EClass ABSTRACT_WORLD_WIND_LAYER = eINSTANCE.getAbstractWorldWindLayer();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_WORLD_WIND_LAYER__VISIBLE = eINSTANCE.getAbstractWorldWindLayer_Visible();

		/**
		 * The meta object literal for the '<em><b>Renderable Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER = eINSTANCE.getAbstractWorldWindLayer_RenderableLayer();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_WORLD_WIND_LAYER___DISPOSE = eINSTANCE.getAbstractWorldWindLayer__Dispose();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftLocationWorldWindLayerImpl <em>Spacecraft Location World Wind Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftLocationWorldWindLayerImpl
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getSpacecraftLocationWorldWindLayer()
		 * @generated
		 */
		EClass SPACECRAFT_LOCATION_WORLD_WIND_LAYER = eINSTANCE.getSpacecraftLocationWorldWindLayer();

		/**
		 * The meta object literal for the '<em><b>Orbit Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_LOCATION_WORLD_WIND_LAYER__ORBIT_MODEL = eINSTANCE.getSpacecraftLocationWorldWindLayer_OrbitModel();

		/**
		 * The meta object literal for the '<em><b>Time Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_LOCATION_WORLD_WIND_LAYER__TIME_SOURCE = eINSTANCE.getSpacecraftLocationWorldWindLayer_TimeSource();

		/**
		 * The meta object literal for the '<em><b>Show Ground Projection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_GROUND_PROJECTION = eINSTANCE.getSpacecraftLocationWorldWindLayer_ShowGroundProjection();

		/**
		 * The meta object literal for the '<em><b>Show Lat Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_LAT_LON = eINSTANCE.getSpacecraftLocationWorldWindLayer_ShowLatLon();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.OrbitModelWorldWindLayerImpl <em>Orbit Model World Wind Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.OrbitModelWorldWindLayerImpl
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getOrbitModelWorldWindLayer()
		 * @generated
		 */
		EClass ORBIT_MODEL_WORLD_WIND_LAYER = eINSTANCE.getOrbitModelWorldWindLayer();

		/**
		 * The meta object literal for the '<em><b>Orbit Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORBIT_MODEL_WORLD_WIND_LAYER__ORBIT_MODEL = eINSTANCE.getOrbitModelWorldWindLayer_OrbitModel();

		/**
		 * The meta object literal for the '<em><b>Time Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORBIT_MODEL_WORLD_WIND_LAYER__TIME_SOURCE = eINSTANCE.getOrbitModelWorldWindLayer_TimeSource();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORBIT_MODEL_WORLD_WIND_LAYER__TIME_INTERVAL = eINSTANCE.getOrbitModelWorldWindLayer_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>Forward Propagation Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORBIT_MODEL_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION = eINSTANCE.getOrbitModelWorldWindLayer_ForwardPropagationDuration();

		/**
		 * The meta object literal for the '<em><b>Backward Propagation Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORBIT_MODEL_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION = eINSTANCE.getOrbitModelWorldWindLayer_BackwardPropagationDuration();

		/**
		 * The meta object literal for the '<em><b>Show Ground Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_GROUND_TRACE = eINSTANCE.getOrbitModelWorldWindLayer_ShowGroundTrace();

		/**
		 * The meta object literal for the '<em><b>Show Orbit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_ORBIT = eINSTANCE.getOrbitModelWorldWindLayer_ShowOrbit();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl <em>Spacecraft Swath World Wind Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftSwathWorldWindLayerImpl
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getSpacecraftSwathWorldWindLayer()
		 * @generated
		 */
		EClass SPACECRAFT_SWATH_WORLD_WIND_LAYER = eINSTANCE.getSpacecraftSwathWorldWindLayer();

		/**
		 * The meta object literal for the '<em><b>Orbit Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_SWATH_WORLD_WIND_LAYER__ORBIT_MODEL = eINSTANCE.getSpacecraftSwathWorldWindLayer_OrbitModel();

		/**
		 * The meta object literal for the '<em><b>Time Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_SOURCE = eINSTANCE.getSpacecraftSwathWorldWindLayer_TimeSource();

		/**
		 * The meta object literal for the '<em><b>Forward Propagation Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION = eINSTANCE.getSpacecraftSwathWorldWindLayer_ForwardPropagationDuration();

		/**
		 * The meta object literal for the '<em><b>Backward Propagation Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION = eINSTANCE.getSpacecraftSwathWorldWindLayer_BackwardPropagationDuration();

		/**
		 * The meta object literal for the '<em><b>Time Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_INTERVAL = eINSTANCE.getSpacecraftSwathWorldWindLayer_TimeInterval();

		/**
		 * The meta object literal for the '<em><b>Left Swath Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_SWATH_WORLD_WIND_LAYER__LEFT_SWATH_ANGLE = eINSTANCE.getSpacecraftSwathWorldWindLayer_LeftSwathAngle();

		/**
		 * The meta object literal for the '<em><b>Right Swath Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_SWATH_WORLD_WIND_LAYER__RIGHT_SWATH_ANGLE = eINSTANCE.getSpacecraftSwathWorldWindLayer_RightSwathAngle();

		/**
		 * The meta object literal for the '<em><b>Show Ground Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACECRAFT_SWATH_WORLD_WIND_LAYER__SHOW_GROUND_TRACE = eINSTANCE.getSpacecraftSwathWorldWindLayer_ShowGroundTrace();

		/**
		 * The meta object literal for the '<em><b>Forward Spacecraft Swath Corridor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR = eINSTANCE.getSpacecraftSwathWorldWindLayer_ForwardSpacecraftSwathCorridor();

		/**
		 * The meta object literal for the '<em><b>Backward Spacecraft Swath Corridor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR = eINSTANCE.getSpacecraftSwathWorldWindLayer_BackwardSpacecraftSwathCorridor();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthSurfaceLocationWorldWindLayerImpl <em>Earth Surface Location World Wind Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.EarthSurfaceLocationWorldWindLayerImpl
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getEarthSurfaceLocationWorldWindLayer()
		 * @generated
		 */
		EClass EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER = eINSTANCE.getEarthSurfaceLocationWorldWindLayer();

		/**
		 * The meta object literal for the '<em><b>Earth Surface Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION = eINSTANCE.getEarthSurfaceLocationWorldWindLayer_EarthSurfaceLocation();

		/**
		 * The meta object literal for the '<em><b>Target Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__TARGET_RADIUS = eINSTANCE.getEarthSurfaceLocationWorldWindLayer_TargetRadius();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.GroundStationWorldWindLayerImpl <em>Ground Station World Wind Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.GroundStationWorldWindLayerImpl
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getGroundStationWorldWindLayer()
		 * @generated
		 */
		EClass GROUND_STATION_WORLD_WIND_LAYER = eINSTANCE.getGroundStationWorldWindLayer();

		/**
		 * The meta object literal for the '<em><b>Ground Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_STATION_WORLD_WIND_LAYER__GROUND_STATION = eINSTANCE.getGroundStationWorldWindLayer_GroundStation();

		/**
		 * The meta object literal for the '<em><b>Reference Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUND_STATION_WORLD_WIND_LAYER__REFERENCE_ALTITUDE = eINSTANCE.getGroundStationWorldWindLayer_ReferenceAltitude();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationListImpl <em>Spacecraft Visibility Pass View Configuration List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationListImpl
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getSpacecraftVisibilityPassViewConfigurationList()
		 * @generated
		 */
		EClass SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST = eINSTANCE.getSpacecraftVisibilityPassViewConfigurationList();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS = eINSTANCE.getSpacecraftVisibilityPassViewConfigurationList_Configurations();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationImpl <em>Spacecraft Visibility Pass View Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SpacecraftVisibilityPassViewConfigurationImpl
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getSpacecraftVisibilityPassViewConfiguration()
		 * @generated
		 */
		EClass SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION = eINSTANCE.getSpacecraftVisibilityPassViewConfiguration();

		/**
		 * The meta object literal for the '<em><b>Configurations List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST = eINSTANCE.getSpacecraftVisibilityPassViewConfiguration_ConfigurationsList();

		/**
		 * The meta object literal for the '<em><b>Visibility Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET = eINSTANCE.getSpacecraftVisibilityPassViewConfiguration_VisibilitySet();

		/**
		 * The meta object literal for the '<em>Renderable Layer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.nasa.worldwind.layers.RenderableLayer
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getRenderableLayer()
		 * @generated
		 */
		EDataType RENDERABLE_LAYER = eINSTANCE.getRenderableLayer();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.impl.SymphonyEarthOrbitEnvironmentUIPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

	}

} //SymphonyEarthOrbitEnvironmentUIPackage
