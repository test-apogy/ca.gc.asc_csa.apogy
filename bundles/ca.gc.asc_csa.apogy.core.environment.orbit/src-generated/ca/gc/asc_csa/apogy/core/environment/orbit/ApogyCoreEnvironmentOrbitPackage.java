/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

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
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreEnvironmentOrbit' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='ApogyCoreEnvironmentOrbit' complianceLevel='8.0' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.core.environment.orbit/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.environment.orbit.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core.environment'"
 * @generated
 */
public interface ApogyCoreEnvironmentOrbitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orbit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core.environment.orbit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "orbit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreEnvironmentOrbitPackage eINSTANCE = ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitWorksiteImpl <em>Orbit Worksite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitWorksiteImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getOrbitWorksite()
	 * @generated
	 */
	int ORBIT_WORKSITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__NAME = ApogyCoreEnvironmentPackage.WORKSITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__DESCRIPTION = ApogyCoreEnvironmentPackage.WORKSITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__TIME = ApogyCoreEnvironmentPackage.WORKSITE__TIME;

	/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__WORKSITES_LIST = ApogyCoreEnvironmentPackage.WORKSITE__WORKSITES_LIST;

	/**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__WORKSITE_NODE = ApogyCoreEnvironmentPackage.WORKSITE__WORKSITE_NODE;

	/**
	 * The feature id for the '<em><b>Orbits Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__ORBITS_MODELS = ApogyCoreEnvironmentPackage.WORKSITE__ORBITS_MODELS;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__ENVIRONMENT = ApogyCoreEnvironmentPackage.WORKSITE__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Active Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL = ApogyCoreEnvironmentPackage.WORKSITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orbit Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE_FEATURE_COUNT = ApogyCoreEnvironmentPackage.WORKSITE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Orbit Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE_OPERATION_COUNT = ApogyCoreEnvironmentPackage.WORKSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractFrameImpl <em>Abstract Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractFrameImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getAbstractFrame()
	 * @generated
	 */
	int ABSTRACT_FRAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAME__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAME__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAME_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAME_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.PVACoordinatesImpl <em>PVA Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.PVACoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getPVACoordinates()
	 * @generated
	 */
	int PVA_COORDINATES = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVA_COORDINATES__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVA_COORDINATES__VELOCITY = 1;

	/**
	 * The feature id for the '<em><b>Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVA_COORDINATES__ACCELERATION = 2;

	/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVA_COORDINATES__ANGULAR_VELOCITY = 3;

	/**
	 * The number of structural features of the '<em>PVA Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVA_COORDINATES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>PVA Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PVA_COORDINATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.TimedStampedPVACoordinatesImpl <em>Timed Stamped PVA Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.TimedStampedPVACoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getTimedStampedPVACoordinates()
	 * @generated
	 */
	int TIMED_STAMPED_PVA_COORDINATES = 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_PVA_COORDINATES__POSITION = PVA_COORDINATES__POSITION;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_PVA_COORDINATES__VELOCITY = PVA_COORDINATES__VELOCITY;

	/**
	 * The feature id for the '<em><b>Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_PVA_COORDINATES__ACCELERATION = PVA_COORDINATES__ACCELERATION;

	/**
	 * The feature id for the '<em><b>Angular Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_PVA_COORDINATES__ANGULAR_VELOCITY = PVA_COORDINATES__ANGULAR_VELOCITY;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_PVA_COORDINATES__TIME = PVA_COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Stamped PVA Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_PVA_COORDINATES_FEATURE_COUNT = PVA_COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Stamped PVA Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_PVA_COORDINATES_OPERATION_COUNT = PVA_COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider <em>PV Coordinates Provider Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getPVCoordinatesProviderProvider()
	 * @generated
	 */
	int PV_COORDINATES_PROVIDER_PROVIDER = 4;

	/**
	 * The number of structural features of the '<em>PV Coordinates Provider Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PV_COORDINATES_PROVIDER_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get PV Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PV_COORDINATES_PROVIDER_PROVIDER___GET_PV_COORDINATES__DATE_ABSTRACTFRAME = 0;

	/**
	 * The number of operations of the '<em>PV Coordinates Provider Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PV_COORDINATES_PROVIDER_PROVIDER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.AngularCoordinatesImpl <em>Angular Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.AngularCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getAngularCoordinates()
	 * @generated
	 */
	int ANGULAR_COORDINATES = 5;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_COORDINATES__ROTATION = 0;

	/**
	 * The feature id for the '<em><b>Angular Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_COORDINATES__ANGULAR_RATE = 1;

	/**
	 * The feature id for the '<em><b>Angular Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_COORDINATES__ANGULAR_ACCELERATION = 2;

	/**
	 * The number of structural features of the '<em>Angular Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_COORDINATES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Angular Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGULAR_COORDINATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.TimedStampedAngularCoordinatesImpl <em>Timed Stamped Angular Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.TimedStampedAngularCoordinatesImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getTimedStampedAngularCoordinates()
	 * @generated
	 */
	int TIMED_STAMPED_ANGULAR_COORDINATES = 6;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_ANGULAR_COORDINATES__ROTATION = ANGULAR_COORDINATES__ROTATION;

	/**
	 * The feature id for the '<em><b>Angular Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_ANGULAR_COORDINATES__ANGULAR_RATE = ANGULAR_COORDINATES__ANGULAR_RATE;

	/**
	 * The feature id for the '<em><b>Angular Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_ANGULAR_COORDINATES__ANGULAR_ACCELERATION = ANGULAR_COORDINATES__ANGULAR_ACCELERATION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_ANGULAR_COORDINATES__TIME = ANGULAR_COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Stamped Angular Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_ANGULAR_COORDINATES_FEATURE_COUNT = ANGULAR_COORDINATES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Stamped Angular Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_STAMPED_ANGULAR_COORDINATES_OPERATION_COUNT = ANGULAR_COORDINATES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.SpacecraftAttitudeImpl <em>Spacecraft Attitude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.SpacecraftAttitudeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getSpacecraftAttitude()
	 * @generated
	 */
	int SPACECRAFT_ATTITUDE = 7;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_ATTITUDE__TIME = ApogyCommonEMFPackage.TIMED__TIME;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_ATTITUDE__ORIENTATION = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_ATTITUDE__REFERENCE_FRAME = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spacecraft Attitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_ATTITUDE_FEATURE_COUNT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Spacecraft Attitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_ATTITUDE_OPERATION_COUNT = ApogyCommonEMFPackage.TIMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider <em>Attitude Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getAttitudeProvider()
	 * @generated
	 */
	int ATTITUDE_PROVIDER = 8;

	/**
	 * The number of structural features of the '<em>Attitude Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Attitude</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE_PROVIDER___GET_ATTITUDE__PVCOORDINATESPROVIDERPROVIDER_DATE_ABSTRACTFRAME = 0;

	/**
	 * The number of operations of the '<em>Attitude Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTITUDE_PROVIDER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.SpacecraftStateImpl <em>Spacecraft State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.SpacecraftStateImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getSpacecraftState()
	 * @generated
	 */
	int SPACECRAFT_STATE = 9;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_STATE__TIME = ApogyCommonEMFPackage.TIMED__TIME;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_STATE__COORDINATES = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_STATE__ATTITUDE = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orbit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_STATE__ORBIT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spacecraft State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_STATE_FEATURE_COUNT = ApogyCommonEMFPackage.TIMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Spacecraft State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_STATE_OPERATION_COUNT = ApogyCommonEMFPackage.TIMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitImpl <em>Orbit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getOrbit()
	 * @generated
	 */
	int ORBIT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT__TIME = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT__REFERENCE_FRAME = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Orbit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Orbit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractOrbitPropagatorImpl <em>Abstract Orbit Propagator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractOrbitPropagatorImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getAbstractOrbitPropagator()
	 * @generated
	 */
	int ABSTRACT_ORBIT_PROPAGATOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attitude Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Orbit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__INITIAL_ORBIT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__VALID_FROM_DATE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Valid To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__VALID_TO_DATE = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Propagate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR___PROPAGATE__DATE = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Spacecraft States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Date In Valid Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitModelImpl <em>Orbit Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitModelImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getOrbitModel()
	 * @generated
	 */
	int ORBIT_MODEL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL__NAME = ApogyCorePackage.ABSTRACT_ORBIT_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL__DESCRIPTION = ApogyCorePackage.ABSTRACT_ORBIT_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Orbit Models List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL__ORBIT_MODELS_LIST = ApogyCorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST;

	/**
	 * The feature id for the '<em><b>Initial Orbit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL__INITIAL_ORBIT = ApogyCorePackage.ABSTRACT_ORBIT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Propagator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL__PROPAGATOR = ApogyCorePackage.ABSTRACT_ORBIT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Orbit Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_FEATURE_COUNT = ApogyCorePackage.ABSTRACT_ORBIT_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Orbit Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_OPERATION_COUNT = ApogyCorePackage.ABSTRACT_ORBIT_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getApogyCoreEnvironmentOrbitFacade()
	 * @generated
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_FACADE = 13;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Orbit Model Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_FACADE___CREATE_ORBIT_MODEL_COPY__ORBITMODEL = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_ENVIRONMENT_ORBIT_FACADE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getList()
	 * @generated
	 */
	int LIST = 14;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 15;

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitWorksite <em>Orbit Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbit Worksite</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.OrbitWorksite
	 * @generated
	 */
	EClass getOrbitWorksite();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitWorksite#getActiveOrbitModel <em>Active Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Orbit Model</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.OrbitWorksite#getActiveOrbitModel()
	 * @see #getOrbitWorksite()
	 * @generated
	 */
	EReference getOrbitWorksite_ActiveOrbitModel();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame <em>Abstract Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Frame</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame
	 * @generated
	 */
	EClass getAbstractFrame();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates <em>PVA Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PVA Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates
	 * @generated
	 */
	EClass getPVACoordinates();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates#getPosition()
	 * @see #getPVACoordinates()
	 * @generated
	 */
	EReference getPVACoordinates_Position();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates#getVelocity()
	 * @see #getPVACoordinates()
	 * @generated
	 */
	EReference getPVACoordinates_Velocity();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates#getAcceleration <em>Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acceleration</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates#getAcceleration()
	 * @see #getPVACoordinates()
	 * @generated
	 */
	EReference getPVACoordinates_Acceleration();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates#getAngularVelocity <em>Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Velocity</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates#getAngularVelocity()
	 * @see #getPVACoordinates()
	 * @generated
	 */
	EReference getPVACoordinates_AngularVelocity();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedPVACoordinates <em>Timed Stamped PVA Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Stamped PVA Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedPVACoordinates
	 * @generated
	 */
	EClass getTimedStampedPVACoordinates();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider <em>PV Coordinates Provider Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PV Coordinates Provider Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider
	 * @generated
	 */
	EClass getPVCoordinatesProviderProvider();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider#getPVCoordinates(java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame) <em>Get PV Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PV Coordinates</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider#getPVCoordinates(java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame)
	 * @generated
	 */
	EOperation getPVCoordinatesProviderProvider__GetPVCoordinates__Date_AbstractFrame();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates <em>Angular Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angular Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates
	 * @generated
	 */
	EClass getAngularCoordinates();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates#getRotation()
	 * @see #getAngularCoordinates()
	 * @generated
	 */
	EReference getAngularCoordinates_Rotation();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates#getAngularRate <em>Angular Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Rate</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates#getAngularRate()
	 * @see #getAngularCoordinates()
	 * @generated
	 */
	EReference getAngularCoordinates_AngularRate();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates#getAngularAcceleration <em>Angular Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Acceleration</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates#getAngularAcceleration()
	 * @see #getAngularCoordinates()
	 * @generated
	 */
	EReference getAngularCoordinates_AngularAcceleration();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedAngularCoordinates <em>Timed Stamped Angular Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Stamped Angular Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedAngularCoordinates
	 * @generated
	 */
	EClass getTimedStampedAngularCoordinates();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude <em>Spacecraft Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecraft Attitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude
	 * @generated
	 */
	EClass getSpacecraftAttitude();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude#getOrientation()
	 * @see #getSpacecraftAttitude()
	 * @generated
	 */
	EReference getSpacecraftAttitude_Orientation();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude#getReferenceFrame <em>Reference Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Frame</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude#getReferenceFrame()
	 * @see #getSpacecraftAttitude()
	 * @generated
	 */
	EReference getSpacecraftAttitude_ReferenceFrame();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider <em>Attitude Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attitude Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider
	 * @generated
	 */
	EClass getAttitudeProvider();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider#getAttitude(ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider, java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame) <em>Get Attitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attitude</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider#getAttitude(ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider, java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame)
	 * @generated
	 */
	EOperation getAttitudeProvider__GetAttitude__PVCoordinatesProviderProvider_Date_AbstractFrame();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState <em>Spacecraft State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecraft State</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState
	 * @generated
	 */
	EClass getSpacecraftState();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinates</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState#getCoordinates()
	 * @see #getSpacecraftState()
	 * @generated
	 */
	EReference getSpacecraftState_Coordinates();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState#getAttitude <em>Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attitude</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState#getAttitude()
	 * @see #getSpacecraftState()
	 * @generated
	 */
	EReference getSpacecraftState_Attitude();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState#getOrbit <em>Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orbit</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState#getOrbit()
	 * @see #getSpacecraftState()
	 * @generated
	 */
	EReference getSpacecraftState_Orbit();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.Orbit <em>Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbit</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.Orbit
	 * @generated
	 */
	EClass getOrbit();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.Orbit#getReferenceFrame <em>Reference Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Frame</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.Orbit#getReferenceFrame()
	 * @see #getOrbit()
	 * @generated
	 */
	EReference getOrbit_ReferenceFrame();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator <em>Abstract Orbit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Orbit Propagator</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator
	 * @generated
	 */
	EClass getAbstractOrbitPropagator();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getReferenceFrame <em>Reference Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Frame</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getReferenceFrame()
	 * @see #getAbstractOrbitPropagator()
	 * @generated
	 */
	EReference getAbstractOrbitPropagator_ReferenceFrame();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getAttitudeProvider <em>Attitude Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attitude Provider</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getAttitudeProvider()
	 * @see #getAbstractOrbitPropagator()
	 * @generated
	 */
	EReference getAbstractOrbitPropagator_AttitudeProvider();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getInitialOrbit <em>Initial Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Orbit</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getInitialOrbit()
	 * @see #getAbstractOrbitPropagator()
	 * @generated
	 */
	EReference getAbstractOrbitPropagator_InitialOrbit();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getValidFromDate <em>Valid From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From Date</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getValidFromDate()
	 * @see #getAbstractOrbitPropagator()
	 * @generated
	 */
	EAttribute getAbstractOrbitPropagator_ValidFromDate();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getValidToDate <em>Valid To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To Date</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getValidToDate()
	 * @see #getAbstractOrbitPropagator()
	 * @generated
	 */
	EAttribute getAbstractOrbitPropagator_ValidToDate();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#propagate(java.util.Date) <em>Propagate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propagate</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#propagate(java.util.Date)
	 * @generated
	 */
	EOperation getAbstractOrbitPropagator__Propagate__Date();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getSpacecraftStates(java.util.Date, java.util.Date, double) <em>Get Spacecraft States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Spacecraft States</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#getSpacecraftStates(java.util.Date, java.util.Date, double)
	 * @generated
	 */
	EOperation getAbstractOrbitPropagator__GetSpacecraftStates__Date_Date_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#isDateInValidRange(java.util.Date) <em>Is Date In Valid Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Date In Valid Range</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator#isDateInValidRange(java.util.Date)
	 * @generated
	 */
	EOperation getAbstractOrbitPropagator__IsDateInValidRange__Date();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel <em>Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbit Model</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel
	 * @generated
	 */
	EClass getOrbitModel();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel#getInitialOrbit <em>Initial Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Orbit</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel#getInitialOrbit()
	 * @see #getOrbitModel()
	 * @generated
	 */
	EReference getOrbitModel_InitialOrbit();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel#getPropagator <em>Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Propagator</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel#getPropagator()
	 * @see #getOrbitModel()
	 * @generated
	 */
	EReference getOrbitModel_Propagator();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade
	 * @generated
	 */
	EClass getApogyCoreEnvironmentOrbitFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade#createOrbitModelCopy(ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel) <em>Create Orbit Model Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Orbit Model Copy</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade#createOrbitModelCopy(ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel)
	 * @generated
	 */
	EOperation getApogyCoreEnvironmentOrbitFacade__CreateOrbitModelCopy__OrbitModel();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreEnvironmentOrbitFactory getApogyCoreEnvironmentOrbitFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitWorksiteImpl <em>Orbit Worksite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitWorksiteImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getOrbitWorksite()
		 * @generated
		 */
		EClass ORBIT_WORKSITE = eINSTANCE.getOrbitWorksite();

		/**
		 * The meta object literal for the '<em><b>Active Orbit Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL = eINSTANCE.getOrbitWorksite_ActiveOrbitModel();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractFrameImpl <em>Abstract Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractFrameImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getAbstractFrame()
		 * @generated
		 */
		EClass ABSTRACT_FRAME = eINSTANCE.getAbstractFrame();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.PVACoordinatesImpl <em>PVA Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.PVACoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getPVACoordinates()
		 * @generated
		 */
		EClass PVA_COORDINATES = eINSTANCE.getPVACoordinates();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVA_COORDINATES__POSITION = eINSTANCE.getPVACoordinates_Position();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVA_COORDINATES__VELOCITY = eINSTANCE.getPVACoordinates_Velocity();

		/**
		 * The meta object literal for the '<em><b>Acceleration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVA_COORDINATES__ACCELERATION = eINSTANCE.getPVACoordinates_Acceleration();

		/**
		 * The meta object literal for the '<em><b>Angular Velocity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PVA_COORDINATES__ANGULAR_VELOCITY = eINSTANCE.getPVACoordinates_AngularVelocity();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.TimedStampedPVACoordinatesImpl <em>Timed Stamped PVA Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.TimedStampedPVACoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getTimedStampedPVACoordinates()
		 * @generated
		 */
		EClass TIMED_STAMPED_PVA_COORDINATES = eINSTANCE.getTimedStampedPVACoordinates();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider <em>PV Coordinates Provider Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getPVCoordinatesProviderProvider()
		 * @generated
		 */
		EClass PV_COORDINATES_PROVIDER_PROVIDER = eINSTANCE.getPVCoordinatesProviderProvider();

		/**
		 * The meta object literal for the '<em><b>Get PV Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PV_COORDINATES_PROVIDER_PROVIDER___GET_PV_COORDINATES__DATE_ABSTRACTFRAME = eINSTANCE.getPVCoordinatesProviderProvider__GetPVCoordinates__Date_AbstractFrame();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.AngularCoordinatesImpl <em>Angular Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.AngularCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getAngularCoordinates()
		 * @generated
		 */
		EClass ANGULAR_COORDINATES = eINSTANCE.getAngularCoordinates();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGULAR_COORDINATES__ROTATION = eINSTANCE.getAngularCoordinates_Rotation();

		/**
		 * The meta object literal for the '<em><b>Angular Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGULAR_COORDINATES__ANGULAR_RATE = eINSTANCE.getAngularCoordinates_AngularRate();

		/**
		 * The meta object literal for the '<em><b>Angular Acceleration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGULAR_COORDINATES__ANGULAR_ACCELERATION = eINSTANCE.getAngularCoordinates_AngularAcceleration();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.TimedStampedAngularCoordinatesImpl <em>Timed Stamped Angular Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.TimedStampedAngularCoordinatesImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getTimedStampedAngularCoordinates()
		 * @generated
		 */
		EClass TIMED_STAMPED_ANGULAR_COORDINATES = eINSTANCE.getTimedStampedAngularCoordinates();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.SpacecraftAttitudeImpl <em>Spacecraft Attitude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.SpacecraftAttitudeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getSpacecraftAttitude()
		 * @generated
		 */
		EClass SPACECRAFT_ATTITUDE = eINSTANCE.getSpacecraftAttitude();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_ATTITUDE__ORIENTATION = eINSTANCE.getSpacecraftAttitude_Orientation();

		/**
		 * The meta object literal for the '<em><b>Reference Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_ATTITUDE__REFERENCE_FRAME = eINSTANCE.getSpacecraftAttitude_ReferenceFrame();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider <em>Attitude Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getAttitudeProvider()
		 * @generated
		 */
		EClass ATTITUDE_PROVIDER = eINSTANCE.getAttitudeProvider();

		/**
		 * The meta object literal for the '<em><b>Get Attitude</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTITUDE_PROVIDER___GET_ATTITUDE__PVCOORDINATESPROVIDERPROVIDER_DATE_ABSTRACTFRAME = eINSTANCE.getAttitudeProvider__GetAttitude__PVCoordinatesProviderProvider_Date_AbstractFrame();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.SpacecraftStateImpl <em>Spacecraft State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.SpacecraftStateImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getSpacecraftState()
		 * @generated
		 */
		EClass SPACECRAFT_STATE = eINSTANCE.getSpacecraftState();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_STATE__COORDINATES = eINSTANCE.getSpacecraftState_Coordinates();

		/**
		 * The meta object literal for the '<em><b>Attitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_STATE__ATTITUDE = eINSTANCE.getSpacecraftState_Attitude();

		/**
		 * The meta object literal for the '<em><b>Orbit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACECRAFT_STATE__ORBIT = eINSTANCE.getSpacecraftState_Orbit();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitImpl <em>Orbit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getOrbit()
		 * @generated
		 */
		EClass ORBIT = eINSTANCE.getOrbit();

		/**
		 * The meta object literal for the '<em><b>Reference Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORBIT__REFERENCE_FRAME = eINSTANCE.getOrbit_ReferenceFrame();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractOrbitPropagatorImpl <em>Abstract Orbit Propagator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.AbstractOrbitPropagatorImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getAbstractOrbitPropagator()
		 * @generated
		 */
		EClass ABSTRACT_ORBIT_PROPAGATOR = eINSTANCE.getAbstractOrbitPropagator();

		/**
		 * The meta object literal for the '<em><b>Reference Frame</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME = eINSTANCE.getAbstractOrbitPropagator_ReferenceFrame();

		/**
		 * The meta object literal for the '<em><b>Attitude Provider</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER = eINSTANCE.getAbstractOrbitPropagator_AttitudeProvider();

		/**
		 * The meta object literal for the '<em><b>Initial Orbit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ORBIT_PROPAGATOR__INITIAL_ORBIT = eINSTANCE.getAbstractOrbitPropagator_InitialOrbit();

		/**
		 * The meta object literal for the '<em><b>Valid From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ORBIT_PROPAGATOR__VALID_FROM_DATE = eINSTANCE.getAbstractOrbitPropagator_ValidFromDate();

		/**
		 * The meta object literal for the '<em><b>Valid To Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ORBIT_PROPAGATOR__VALID_TO_DATE = eINSTANCE.getAbstractOrbitPropagator_ValidToDate();

		/**
		 * The meta object literal for the '<em><b>Propagate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ORBIT_PROPAGATOR___PROPAGATE__DATE = eINSTANCE.getAbstractOrbitPropagator__Propagate__Date();

		/**
		 * The meta object literal for the '<em><b>Get Spacecraft States</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE = eINSTANCE.getAbstractOrbitPropagator__GetSpacecraftStates__Date_Date_double();

		/**
		 * The meta object literal for the '<em><b>Is Date In Valid Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE = eINSTANCE.getAbstractOrbitPropagator__IsDateInValidRange__Date();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitModelImpl <em>Orbit Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitModelImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getOrbitModel()
		 * @generated
		 */
		EClass ORBIT_MODEL = eINSTANCE.getOrbitModel();

		/**
		 * The meta object literal for the '<em><b>Initial Orbit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORBIT_MODEL__INITIAL_ORBIT = eINSTANCE.getOrbitModel_InitialOrbit();

		/**
		 * The meta object literal for the '<em><b>Propagator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORBIT_MODEL__PROPAGATOR = eINSTANCE.getOrbitModel_Propagator();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getApogyCoreEnvironmentOrbitFacade()
		 * @generated
		 */
		EClass APOGY_CORE_ENVIRONMENT_ORBIT_FACADE = eINSTANCE.getApogyCoreEnvironmentOrbitFacade();

		/**
		 * The meta object literal for the '<em><b>Create Orbit Model Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_ENVIRONMENT_ORBIT_FACADE___CREATE_ORBIT_MODEL_COPY__ORBITMODEL = eINSTANCE.getApogyCoreEnvironmentOrbitFacade__CreateOrbitModelCopy__OrbitModel();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //ApogyCoreEnvironmentOrbitPackage