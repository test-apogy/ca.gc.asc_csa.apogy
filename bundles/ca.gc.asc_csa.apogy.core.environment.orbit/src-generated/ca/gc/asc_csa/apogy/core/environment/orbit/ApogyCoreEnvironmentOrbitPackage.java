/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;

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
 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CoreEnvironmentOrbit' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__CoreEnvironmentOrbit' complianceLevel='8.0' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.core.environment.orbit/src-generated' editDirectory='/org.eclipse.symphony.core.environment.orbit.edit/src-generated' basePackage='org.eclipse.symphony.core.environment'"
 * @generated
 */
public interface Symphony__CoreEnvironmentOrbitPackage extends EPackage {
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
	String eNS_URI = "org.eclipse.symphony.core.environment.orbit";

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
	Symphony__CoreEnvironmentOrbitPackage eINSTANCE = org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.OrbitWorksiteImpl <em>Orbit Worksite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.OrbitWorksiteImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getOrbitWorksite()
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
	int ORBIT_WORKSITE__NAME = Symphony__CoreEnvironmentPackage.WORKSITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__DESCRIPTION = Symphony__CoreEnvironmentPackage.WORKSITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__TIME = Symphony__CoreEnvironmentPackage.WORKSITE__TIME;

	/**
	 * The feature id for the '<em><b>Worksites List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__WORKSITES_LIST = Symphony__CoreEnvironmentPackage.WORKSITE__WORKSITES_LIST;

	/**
	 * The feature id for the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__WORKSITE_NODE = Symphony__CoreEnvironmentPackage.WORKSITE__WORKSITE_NODE;

	/**
	 * The feature id for the '<em><b>Orbits Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__ORBITS_MODELS = Symphony__CoreEnvironmentPackage.WORKSITE__ORBITS_MODELS;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__ENVIRONMENT = Symphony__CoreEnvironmentPackage.WORKSITE__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Active Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL = Symphony__CoreEnvironmentPackage.WORKSITE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orbit Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE_FEATURE_COUNT = Symphony__CoreEnvironmentPackage.WORKSITE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Orbit Worksite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_WORKSITE_OPERATION_COUNT = Symphony__CoreEnvironmentPackage.WORKSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.AbstractFrameImpl <em>Abstract Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.AbstractFrameImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getAbstractFrame()
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
	int ABSTRACT_FRAME__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAME__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAME_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FRAME_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.PVACoordinatesImpl <em>PVA Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.PVACoordinatesImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getPVACoordinates()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.TimedStampedPVACoordinatesImpl <em>Timed Stamped PVA Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.TimedStampedPVACoordinatesImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getTimedStampedPVACoordinates()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.PVCoordinatesProviderProvider <em>PV Coordinates Provider Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.PVCoordinatesProviderProvider
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getPVCoordinatesProviderProvider()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.AngularCoordinatesImpl <em>Angular Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.AngularCoordinatesImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getAngularCoordinates()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.TimedStampedAngularCoordinatesImpl <em>Timed Stamped Angular Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.TimedStampedAngularCoordinatesImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getTimedStampedAngularCoordinates()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.SpacecraftAttitudeImpl <em>Spacecraft Attitude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.SpacecraftAttitudeImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getSpacecraftAttitude()
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
	int SPACECRAFT_ATTITUDE__TIME = Symphony__CommonEMFPackage.TIMED__TIME;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_ATTITUDE__ORIENTATION = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_ATTITUDE__REFERENCE_FRAME = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spacecraft Attitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_ATTITUDE_FEATURE_COUNT = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Spacecraft Attitude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_ATTITUDE_OPERATION_COUNT = Symphony__CommonEMFPackage.TIMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.AttitudeProvider <em>Attitude Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.AttitudeProvider
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getAttitudeProvider()
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
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.SpacecraftStateImpl <em>Spacecraft State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.SpacecraftStateImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getSpacecraftState()
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
	int SPACECRAFT_STATE__TIME = Symphony__CommonEMFPackage.TIMED__TIME;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_STATE__COORDINATES = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_STATE__ATTITUDE = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orbit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_STATE__ORBIT = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spacecraft State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_STATE_FEATURE_COUNT = Symphony__CommonEMFPackage.TIMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Spacecraft State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACECRAFT_STATE_OPERATION_COUNT = Symphony__CommonEMFPackage.TIMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.OrbitImpl <em>Orbit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.OrbitImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getOrbit()
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
	int ORBIT__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT__TIME = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT__REFERENCE_FRAME = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Orbit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Orbit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.AbstractOrbitPropagatorImpl <em>Abstract Orbit Propagator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.AbstractOrbitPropagatorImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getAbstractOrbitPropagator()
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
	int ABSTRACT_ORBIT_PROPAGATOR__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__REFERENCE_FRAME = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attitude Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__ATTITUDE_PROVIDER = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Orbit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__INITIAL_ORBIT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__VALID_FROM_DATE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Valid To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR__VALID_TO_DATE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Propagate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR___PROPAGATE__DATE = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Spacecraft States</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Date In Valid Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Orbit Propagator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ORBIT_PROPAGATOR_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.OrbitModelImpl <em>Orbit Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.OrbitModelImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getOrbitModel()
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
	int ORBIT_MODEL__NAME = Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL__DESCRIPTION = Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Orbit Models List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL__ORBIT_MODELS_LIST = Symphony__CorePackage.ABSTRACT_ORBIT_MODEL__ORBIT_MODELS_LIST;

	/**
	 * The feature id for the '<em><b>Initial Orbit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL__INITIAL_ORBIT = Symphony__CorePackage.ABSTRACT_ORBIT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Propagator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL__PROPAGATOR = Symphony__CorePackage.ABSTRACT_ORBIT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Orbit Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_FEATURE_COUNT = Symphony__CorePackage.ABSTRACT_ORBIT_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Orbit Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORBIT_MODEL_OPERATION_COUNT = Symphony__CorePackage.ABSTRACT_ORBIT_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitFacadeImpl
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getSymphony__CoreEnvironmentOrbitFacade()
	 * @generated
	 */
	int SYMPHONY_CORE_ENVIRONMENT_ORBIT_FACADE = 13;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_ENVIRONMENT_ORBIT_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Orbit Model Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_ENVIRONMENT_ORBIT_FACADE___CREATE_ORBIT_MODEL_COPY__ORBITMODEL = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_ENVIRONMENT_ORBIT_FACADE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getList()
	 * @generated
	 */
	int LIST = 14;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 15;

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.OrbitWorksite <em>Orbit Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbit Worksite</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.OrbitWorksite
	 * @generated
	 */
	EClass getOrbitWorksite();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.environment.orbit.OrbitWorksite#getActiveOrbitModel <em>Active Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active Orbit Model</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.OrbitWorksite#getActiveOrbitModel()
	 * @see #getOrbitWorksite()
	 * @generated
	 */
	EReference getOrbitWorksite_ActiveOrbitModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.AbstractFrame <em>Abstract Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Frame</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractFrame
	 * @generated
	 */
	EClass getAbstractFrame();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates <em>PVA Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PVA Coordinates</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.PVACoordinates
	 * @generated
	 */
	EClass getPVACoordinates();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.PVACoordinates#getPosition()
	 * @see #getPVACoordinates()
	 * @generated
	 */
	EReference getPVACoordinates_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Velocity</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.PVACoordinates#getVelocity()
	 * @see #getPVACoordinates()
	 * @generated
	 */
	EReference getPVACoordinates_Velocity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getAcceleration <em>Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acceleration</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.PVACoordinates#getAcceleration()
	 * @see #getPVACoordinates()
	 * @generated
	 */
	EReference getPVACoordinates_Acceleration();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.PVACoordinates#getAngularVelocity <em>Angular Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Velocity</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.PVACoordinates#getAngularVelocity()
	 * @see #getPVACoordinates()
	 * @generated
	 */
	EReference getPVACoordinates_AngularVelocity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.TimedStampedPVACoordinates <em>Timed Stamped PVA Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Stamped PVA Coordinates</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.TimedStampedPVACoordinates
	 * @generated
	 */
	EClass getTimedStampedPVACoordinates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.PVCoordinatesProviderProvider <em>PV Coordinates Provider Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PV Coordinates Provider Provider</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.PVCoordinatesProviderProvider
	 * @generated
	 */
	EClass getPVCoordinatesProviderProvider();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.orbit.PVCoordinatesProviderProvider#getPVCoordinates(java.util.Date, org.eclipse.symphony.core.environment.orbit.AbstractFrame) <em>Get PV Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get PV Coordinates</em>' operation.
	 * @see org.eclipse.symphony.core.environment.orbit.PVCoordinatesProviderProvider#getPVCoordinates(java.util.Date, org.eclipse.symphony.core.environment.orbit.AbstractFrame)
	 * @generated
	 */
	EOperation getPVCoordinatesProviderProvider__GetPVCoordinates__Date_AbstractFrame();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates <em>Angular Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angular Coordinates</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AngularCoordinates
	 * @generated
	 */
	EClass getAngularCoordinates();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getRotation()
	 * @see #getAngularCoordinates()
	 * @generated
	 */
	EReference getAngularCoordinates_Rotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getAngularRate <em>Angular Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Rate</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getAngularRate()
	 * @see #getAngularCoordinates()
	 * @generated
	 */
	EReference getAngularCoordinates_AngularRate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getAngularAcceleration <em>Angular Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angular Acceleration</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AngularCoordinates#getAngularAcceleration()
	 * @see #getAngularCoordinates()
	 * @generated
	 */
	EReference getAngularCoordinates_AngularAcceleration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.TimedStampedAngularCoordinates <em>Timed Stamped Angular Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Stamped Angular Coordinates</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.TimedStampedAngularCoordinates
	 * @generated
	 */
	EClass getTimedStampedAngularCoordinates();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude <em>Spacecraft Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecraft Attitude</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude
	 * @generated
	 */
	EClass getSpacecraftAttitude();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude#getOrientation()
	 * @see #getSpacecraftAttitude()
	 * @generated
	 */
	EReference getSpacecraftAttitude_Orientation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude#getReferenceFrame <em>Reference Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Frame</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude#getReferenceFrame()
	 * @see #getSpacecraftAttitude()
	 * @generated
	 */
	EReference getSpacecraftAttitude_ReferenceFrame();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.AttitudeProvider <em>Attitude Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attitude Provider</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AttitudeProvider
	 * @generated
	 */
	EClass getAttitudeProvider();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.orbit.AttitudeProvider#getAttitude(org.eclipse.symphony.core.environment.orbit.PVCoordinatesProviderProvider, java.util.Date, org.eclipse.symphony.core.environment.orbit.AbstractFrame) <em>Get Attitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attitude</em>' operation.
	 * @see org.eclipse.symphony.core.environment.orbit.AttitudeProvider#getAttitude(org.eclipse.symphony.core.environment.orbit.PVCoordinatesProviderProvider, java.util.Date, org.eclipse.symphony.core.environment.orbit.AbstractFrame)
	 * @generated
	 */
	EOperation getAttitudeProvider__GetAttitude__PVCoordinatesProviderProvider_Date_AbstractFrame();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftState <em>Spacecraft State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spacecraft State</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.SpacecraftState
	 * @generated
	 */
	EClass getSpacecraftState();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftState#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinates</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.SpacecraftState#getCoordinates()
	 * @see #getSpacecraftState()
	 * @generated
	 */
	EReference getSpacecraftState_Coordinates();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftState#getAttitude <em>Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attitude</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.SpacecraftState#getAttitude()
	 * @see #getSpacecraftState()
	 * @generated
	 */
	EReference getSpacecraftState_Attitude();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.SpacecraftState#getOrbit <em>Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orbit</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.SpacecraftState#getOrbit()
	 * @see #getSpacecraftState()
	 * @generated
	 */
	EReference getSpacecraftState_Orbit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.Orbit <em>Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbit</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.Orbit
	 * @generated
	 */
	EClass getOrbit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.Orbit#getReferenceFrame <em>Reference Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Frame</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.Orbit#getReferenceFrame()
	 * @see #getOrbit()
	 * @generated
	 */
	EReference getOrbit_ReferenceFrame();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator <em>Abstract Orbit Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Orbit Propagator</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator
	 * @generated
	 */
	EClass getAbstractOrbitPropagator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getReferenceFrame <em>Reference Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Frame</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getReferenceFrame()
	 * @see #getAbstractOrbitPropagator()
	 * @generated
	 */
	EReference getAbstractOrbitPropagator_ReferenceFrame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getAttitudeProvider <em>Attitude Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attitude Provider</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getAttitudeProvider()
	 * @see #getAbstractOrbitPropagator()
	 * @generated
	 */
	EReference getAbstractOrbitPropagator_AttitudeProvider();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getInitialOrbit <em>Initial Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Orbit</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getInitialOrbit()
	 * @see #getAbstractOrbitPropagator()
	 * @generated
	 */
	EReference getAbstractOrbitPropagator_InitialOrbit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getValidFromDate <em>Valid From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From Date</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getValidFromDate()
	 * @see #getAbstractOrbitPropagator()
	 * @generated
	 */
	EAttribute getAbstractOrbitPropagator_ValidFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getValidToDate <em>Valid To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To Date</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getValidToDate()
	 * @see #getAbstractOrbitPropagator()
	 * @generated
	 */
	EAttribute getAbstractOrbitPropagator_ValidToDate();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#propagate(java.util.Date) <em>Propagate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propagate</em>' operation.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#propagate(java.util.Date)
	 * @generated
	 */
	EOperation getAbstractOrbitPropagator__Propagate__Date();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getSpacecraftStates(java.util.Date, java.util.Date, double) <em>Get Spacecraft States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Spacecraft States</em>' operation.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#getSpacecraftStates(java.util.Date, java.util.Date, double)
	 * @generated
	 */
	EOperation getAbstractOrbitPropagator__GetSpacecraftStates__Date_Date_double();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#isDateInValidRange(java.util.Date) <em>Is Date In Valid Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Date In Valid Range</em>' operation.
	 * @see org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator#isDateInValidRange(java.util.Date)
	 * @generated
	 */
	EOperation getAbstractOrbitPropagator__IsDateInValidRange__Date();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.OrbitModel <em>Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orbit Model</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.OrbitModel
	 * @generated
	 */
	EClass getOrbitModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.OrbitModel#getInitialOrbit <em>Initial Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Orbit</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.OrbitModel#getInitialOrbit()
	 * @see #getOrbitModel()
	 * @generated
	 */
	EReference getOrbitModel_InitialOrbit();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.orbit.OrbitModel#getPropagator <em>Propagator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Propagator</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.OrbitModel#getPropagator()
	 * @see #getOrbitModel()
	 * @generated
	 */
	EReference getOrbitModel_Propagator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitFacade
	 * @generated
	 */
	EClass getSymphony__CoreEnvironmentOrbitFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitFacade#createOrbitModelCopy(org.eclipse.symphony.core.environment.orbit.OrbitModel) <em>Create Orbit Model Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Orbit Model Copy</em>' operation.
	 * @see org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitFacade#createOrbitModelCopy(org.eclipse.symphony.core.environment.orbit.OrbitModel)
	 * @generated
	 */
	EOperation getSymphony__CoreEnvironmentOrbitFacade__CreateOrbitModelCopy__OrbitModel();

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
	Symphony__CoreEnvironmentOrbitFactory getSymphony__CoreEnvironmentOrbitFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.OrbitWorksiteImpl <em>Orbit Worksite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.OrbitWorksiteImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getOrbitWorksite()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.AbstractFrameImpl <em>Abstract Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.AbstractFrameImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getAbstractFrame()
		 * @generated
		 */
		EClass ABSTRACT_FRAME = eINSTANCE.getAbstractFrame();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.PVACoordinatesImpl <em>PVA Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.PVACoordinatesImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getPVACoordinates()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.TimedStampedPVACoordinatesImpl <em>Timed Stamped PVA Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.TimedStampedPVACoordinatesImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getTimedStampedPVACoordinates()
		 * @generated
		 */
		EClass TIMED_STAMPED_PVA_COORDINATES = eINSTANCE.getTimedStampedPVACoordinates();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.PVCoordinatesProviderProvider <em>PV Coordinates Provider Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.PVCoordinatesProviderProvider
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getPVCoordinatesProviderProvider()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.AngularCoordinatesImpl <em>Angular Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.AngularCoordinatesImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getAngularCoordinates()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.TimedStampedAngularCoordinatesImpl <em>Timed Stamped Angular Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.TimedStampedAngularCoordinatesImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getTimedStampedAngularCoordinates()
		 * @generated
		 */
		EClass TIMED_STAMPED_ANGULAR_COORDINATES = eINSTANCE.getTimedStampedAngularCoordinates();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.SpacecraftAttitudeImpl <em>Spacecraft Attitude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.SpacecraftAttitudeImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getSpacecraftAttitude()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.AttitudeProvider <em>Attitude Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.AttitudeProvider
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getAttitudeProvider()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.SpacecraftStateImpl <em>Spacecraft State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.SpacecraftStateImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getSpacecraftState()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.OrbitImpl <em>Orbit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.OrbitImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getOrbit()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.AbstractOrbitPropagatorImpl <em>Abstract Orbit Propagator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.AbstractOrbitPropagatorImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getAbstractOrbitPropagator()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.OrbitModelImpl <em>Orbit Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.OrbitModelImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getOrbitModel()
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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitFacadeImpl
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getSymphony__CoreEnvironmentOrbitFacade()
		 * @generated
		 */
		EClass SYMPHONY_CORE_ENVIRONMENT_ORBIT_FACADE = eINSTANCE.getSymphony__CoreEnvironmentOrbitFacade();

		/**
		 * The meta object literal for the '<em><b>Create Orbit Model Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_ENVIRONMENT_ORBIT_FACADE___CREATE_ORBIT_MODEL_COPY__ORBITMODEL = eINSTANCE.getSymphony__CoreEnvironmentOrbitFacade__CreateOrbitModelCopy__OrbitModel();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.symphony.core.environment.orbit.impl.Symphony__CoreEnvironmentOrbitPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //Symphony__CoreEnvironmentOrbitPackage
