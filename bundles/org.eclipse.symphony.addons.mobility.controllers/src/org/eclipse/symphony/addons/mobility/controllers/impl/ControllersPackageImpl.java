/**
 * <copyright>
 * </copyright>
 *
 * $Id: ControllersPackageImpl.java,v 1.5.4.2 2015/05/21 15:50:44 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.controllers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.geometry.paths.PathsPackage;
import org.eclipse.symphony.addons.mobility.MobilityPackage;
import org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController;
import org.eclipse.symphony.addons.mobility.controllers.ControllersFactory;
import org.eclipse.symphony.addons.mobility.controllers.ControllersPackage;
import org.eclipse.symphony.addons.mobility.controllers.PathFollower;
import org.eclipse.symphony.addons.mobility.controllers.PathFollowerState;
import org.eclipse.symphony.addons.mobility.controllers.PathRecorder;
import org.eclipse.symphony.addons.mobility.controllers.PathRecorderSamplingMode;
import org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower;
import org.eclipse.symphony.addons.mobility.controllers.SkidSteeredWayPointPathFollower;
import org.eclipse.symphony.addons.mobility.controllers.WaypointPathRecorder;
import org.eclipse.symphony.addons.sensors.pose.PosePackage;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllersPackageImpl extends EPackageImpl implements ControllersPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathFollowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skidSteeredPlatformPathFollowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathRecorderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waypointPathRecorderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skidSteeredWayPointPathFollowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astolfiGuidanceControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pathFollowerStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pathRecorderSamplingModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControllersPackageImpl()
	{
		super(eNS_URI, ControllersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ControllersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControllersPackage init()
	{
		if (isInited) return (ControllersPackage)EPackage.Registry.INSTANCE.getEPackage(ControllersPackage.eNS_URI);

		// Obtain or create and register package
		ControllersPackageImpl theControllersPackage = (ControllersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ControllersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ControllersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MobilityPackage.eINSTANCE.eClass();
		PathsPackage.eINSTANCE.eClass();
		PosePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theControllersPackage.createPackageContents();

		// Initialize created meta-data
		theControllersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControllersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControllersPackage.eNS_URI, theControllersPackage);
		return theControllersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathFollower()
	{
		return pathFollowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathFollower_Path()
	{
		return (EReference)pathFollowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathFollower_Platform()
	{
		return (EReference)pathFollowerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathFollower_PoseSensor()
	{
		return (EReference)pathFollowerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathFollower_DestinationReached()
	{
		return (EAttribute)pathFollowerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathFollower_PathFollowerState()
	{
		return (EAttribute)pathFollowerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPathFollower__Start() {
		return pathFollowerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPathFollower__Pause() {
		return pathFollowerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPathFollower__Resume() {
		return pathFollowerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPathFollower__Stop() {
		return pathFollowerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPathFollower__IsTransitionValid__PathFollowerState() {
		return pathFollowerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkidSteeredPlatformPathFollower()
	{
		return skidSteeredPlatformPathFollowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredPlatformPathFollower_MaximumAngularVelocity()
	{
		return (EAttribute)skidSteeredPlatformPathFollowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkidSteeredPlatformPathFollower_MaximumLinearVelocity()
	{
		return (EAttribute)skidSteeredPlatformPathFollowerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathRecorder()
	{
		return pathRecorderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathRecorder_RecordedPath()
	{
		return (EReference)pathRecorderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathRecorder_PositionSensor()
	{
		return (EReference)pathRecorderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathRecorder_MinimumDistanceDelta()
	{
		return (EAttribute)pathRecorderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathRecorder_MinimumTimeDelta()
	{
		return (EAttribute)pathRecorderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathRecorder_SamplingMode()
	{
		return (EAttribute)pathRecorderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaypointPathRecorder()
	{
		return waypointPathRecorderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkidSteeredWayPointPathFollower() {
		return skidSteeredWayPointPathFollowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAstolfiGuidanceController() {
		return astolfiGuidanceControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAstolfiGuidanceController_CurrentWayPoint() {
		return (EReference)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAstolfiGuidanceController_PreviousWayPoint() {
		return (EReference)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAstolfiGuidanceController_CurrentPoseInGuidanceReferenceFrame() {
		return (EReference)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_Rho() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_Phi() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_Alpha() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_Yaw() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_Nu() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_Omega() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_Krho() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_Kphi() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_Kalpha() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_DestinationDistanceThreshold() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_WayPointDistanceThreshold() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_KHill() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_HillThreshold() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_PhiThresholdForReducedVelocity() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_AlphaThresholdForReducedVelocity() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAstolfiGuidanceController_SmoothPathEnabled() {
		return (EAttribute)astolfiGuidanceControllerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPathFollowerState()
	{
		return pathFollowerStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPathRecorderSamplingMode()
	{
		return pathRecorderSamplingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllersFactory getControllersFactory()
	{
		return (ControllersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pathFollowerEClass = createEClass(PATH_FOLLOWER);
		createEReference(pathFollowerEClass, PATH_FOLLOWER__PATH);
		createEReference(pathFollowerEClass, PATH_FOLLOWER__PLATFORM);
		createEReference(pathFollowerEClass, PATH_FOLLOWER__POSE_SENSOR);
		createEAttribute(pathFollowerEClass, PATH_FOLLOWER__DESTINATION_REACHED);
		createEAttribute(pathFollowerEClass, PATH_FOLLOWER__PATH_FOLLOWER_STATE);
		createEOperation(pathFollowerEClass, PATH_FOLLOWER___START);
		createEOperation(pathFollowerEClass, PATH_FOLLOWER___PAUSE);
		createEOperation(pathFollowerEClass, PATH_FOLLOWER___RESUME);
		createEOperation(pathFollowerEClass, PATH_FOLLOWER___STOP);
		createEOperation(pathFollowerEClass, PATH_FOLLOWER___IS_TRANSITION_VALID__PATHFOLLOWERSTATE);

		skidSteeredPlatformPathFollowerEClass = createEClass(SKID_STEERED_PLATFORM_PATH_FOLLOWER);
		createEAttribute(skidSteeredPlatformPathFollowerEClass, SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY);
		createEAttribute(skidSteeredPlatformPathFollowerEClass, SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY);

		pathRecorderEClass = createEClass(PATH_RECORDER);
		createEReference(pathRecorderEClass, PATH_RECORDER__POSITION_SENSOR);
		createEAttribute(pathRecorderEClass, PATH_RECORDER__MINIMUM_DISTANCE_DELTA);
		createEAttribute(pathRecorderEClass, PATH_RECORDER__MINIMUM_TIME_DELTA);
		createEAttribute(pathRecorderEClass, PATH_RECORDER__SAMPLING_MODE);
		createEReference(pathRecorderEClass, PATH_RECORDER__RECORDED_PATH);

		waypointPathRecorderEClass = createEClass(WAYPOINT_PATH_RECORDER);

		skidSteeredWayPointPathFollowerEClass = createEClass(SKID_STEERED_WAY_POINT_PATH_FOLLOWER);

		astolfiGuidanceControllerEClass = createEClass(ASTOLFI_GUIDANCE_CONTROLLER);
		createEReference(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_WAY_POINT);
		createEReference(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__PREVIOUS_WAY_POINT);
		createEReference(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_POSE_IN_GUIDANCE_REFERENCE_FRAME);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__RHO);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__PHI);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__ALPHA);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__YAW);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__NU);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__OMEGA);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__KRHO);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__KPHI);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__KALPHA);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__DESTINATION_DISTANCE_THRESHOLD);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__WAY_POINT_DISTANCE_THRESHOLD);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__KHILL);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__HILL_THRESHOLD);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__PHI_THRESHOLD_FOR_REDUCED_VELOCITY);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY);
		createEAttribute(astolfiGuidanceControllerEClass, ASTOLFI_GUIDANCE_CONTROLLER__SMOOTH_PATH_ENABLED);

		// Create enums
		pathFollowerStateEEnum = createEEnum(PATH_FOLLOWER_STATE);
		pathRecorderSamplingModeEEnum = createEEnum(PATH_RECORDER_SAMPLING_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MobilityPackage theMobilityPackage = (MobilityPackage)EPackage.Registry.INSTANCE.getEPackage(MobilityPackage.eNS_URI);
		PathsPackage thePathsPackage = (PathsPackage)EPackage.Registry.INSTANCE.getEPackage(PathsPackage.eNS_URI);
		PosePackage thePosePackage = (PosePackage)EPackage.Registry.INSTANCE.getEPackage(PosePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);

		// Create type parameters
		ETypeParameter pathFollowerEClass_PlatformType = addETypeParameter(pathFollowerEClass, "PlatformType");
		ETypeParameter pathFollowerEClass_PathType = addETypeParameter(pathFollowerEClass, "PathType");
		ETypeParameter skidSteeredPlatformPathFollowerEClass_PlateformType = addETypeParameter(skidSteeredPlatformPathFollowerEClass, "PlateformType");
		ETypeParameter skidSteeredPlatformPathFollowerEClass_PathType = addETypeParameter(skidSteeredPlatformPathFollowerEClass, "PathType");
		ETypeParameter pathRecorderEClass_PathType = addETypeParameter(pathRecorderEClass, "PathType");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theMobilityPackage.getMobilePlateform());
		pathFollowerEClass_PlatformType.getEBounds().add(g1);
		g1 = createEGenericType(thePathsPackage.getPath());
		pathFollowerEClass_PathType.getEBounds().add(g1);
		g1 = createEGenericType(theMobilityPackage.getSkidSteeredMobilePlateform());
		skidSteeredPlatformPathFollowerEClass_PlateformType.getEBounds().add(g1);
		g1 = createEGenericType(thePathsPackage.getPath());
		skidSteeredPlatformPathFollowerEClass_PathType.getEBounds().add(g1);
		g1 = createEGenericType(thePathsPackage.getPath());
		pathRecorderEClass_PathType.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getPathFollower());
		EGenericType g2 = createEGenericType(skidSteeredPlatformPathFollowerEClass_PlateformType);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(skidSteeredPlatformPathFollowerEClass_PathType);
		g1.getETypeArguments().add(g2);
		skidSteeredPlatformPathFollowerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPathRecorder());
		g2 = createEGenericType(thePathsPackage.getWayPointPath());
		g1.getETypeArguments().add(g2);
		waypointPathRecorderEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSkidSteeredPlatformPathFollower());
		g2 = createEGenericType(theMobilityPackage.getSkidSteeredMobilePlateform());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePathsPackage.getWayPointPath());
		g1.getETypeArguments().add(g2);
		skidSteeredWayPointPathFollowerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSkidSteeredPlatformPathFollower());
		g2 = createEGenericType(theMobilityPackage.getSkidSteeredMobilePlateform());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(thePathsPackage.getWayPointPath());
		g1.getETypeArguments().add(g2);
		astolfiGuidanceControllerEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(pathFollowerEClass, PathFollower.class, "PathFollower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(pathFollowerEClass_PathType);
		initEReference(getPathFollower_Path(), g1, null, "path", null, 0, 1, PathFollower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(pathFollowerEClass_PlatformType);
		initEReference(getPathFollower_Platform(), g1, null, "platform", null, 0, 1, PathFollower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathFollower_PoseSensor(), thePosePackage.getPoseSensor(), null, "poseSensor", null, 0, 1, PathFollower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathFollower_DestinationReached(), theEcorePackage.getEBoolean(), "destinationReached", null, 0, 1, PathFollower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathFollower_PathFollowerState(), this.getPathFollowerState(), "pathFollowerState", "IDLE", 0, 1, PathFollower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPathFollower__Start(), theEcorePackage.getEBoolean(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPathFollower__Pause(), theEcorePackage.getEBoolean(), "pause", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPathFollower__Resume(), theEcorePackage.getEBoolean(), "resume", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPathFollower__Stop(), theEcorePackage.getEBoolean(), "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getPathFollower__IsTransitionValid__PathFollowerState(), theEcorePackage.getEBoolean(), "isTransitionValid", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPathFollowerState(), "state", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(skidSteeredPlatformPathFollowerEClass, SkidSteeredPlatformPathFollower.class, "SkidSteeredPlatformPathFollower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkidSteeredPlatformPathFollower_MaximumAngularVelocity(), theEcorePackage.getEDouble(), "maximumAngularVelocity", null, 0, 1, SkidSteeredPlatformPathFollower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkidSteeredPlatformPathFollower_MaximumLinearVelocity(), theEcorePackage.getEDouble(), "maximumLinearVelocity", null, 0, 1, SkidSteeredPlatformPathFollower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathRecorderEClass, PathRecorder.class, "PathRecorder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathRecorder_PositionSensor(), thePosePackage.getPoseSensor(), null, "positionSensor", null, 0, 1, PathRecorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathRecorder_MinimumDistanceDelta(), theEcorePackage.getEDouble(), "minimumDistanceDelta", "0.1", 0, 1, PathRecorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathRecorder_MinimumTimeDelta(), theEcorePackage.getEDouble(), "minimumTimeDelta", "1.0", 0, 1, PathRecorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathRecorder_SamplingMode(), this.getPathRecorderSamplingMode(), "samplingMode", "ON_DISTANCE_DELTA", 0, 1, PathRecorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(pathRecorderEClass_PathType);
		initEReference(getPathRecorder_RecordedPath(), g1, null, "recordedPath", null, 0, 1, PathRecorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waypointPathRecorderEClass, WaypointPathRecorder.class, "WaypointPathRecorder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(skidSteeredWayPointPathFollowerEClass, SkidSteeredWayPointPathFollower.class, "SkidSteeredWayPointPathFollower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(astolfiGuidanceControllerEClass, AstolfiGuidanceController.class, "AstolfiGuidanceController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAstolfiGuidanceController_CurrentWayPoint(), theData3dPackage.getCartesianPositionCoordinates(), null, "currentWayPoint", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAstolfiGuidanceController_PreviousWayPoint(), theData3dPackage.getCartesianPositionCoordinates(), null, "previousWayPoint", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAstolfiGuidanceController_CurrentPoseInGuidanceReferenceFrame(), theData3dPackage.getPose(), null, "currentPoseInGuidanceReferenceFrame", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_Rho(), theEcorePackage.getEDouble(), "rho", null, 0, 1, AstolfiGuidanceController.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_Phi(), theEcorePackage.getEDouble(), "phi", null, 0, 1, AstolfiGuidanceController.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_Alpha(), theEcorePackage.getEDouble(), "alpha", null, 0, 1, AstolfiGuidanceController.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_Yaw(), theEcorePackage.getEDouble(), "yaw", null, 0, 1, AstolfiGuidanceController.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_Nu(), theEcorePackage.getEDouble(), "nu", null, 0, 1, AstolfiGuidanceController.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_Omega(), theEcorePackage.getEDouble(), "omega", null, 0, 1, AstolfiGuidanceController.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_Krho(), theEcorePackage.getEDouble(), "krho", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_Kphi(), theEcorePackage.getEDouble(), "kphi", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_Kalpha(), theEcorePackage.getEDouble(), "kalpha", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_DestinationDistanceThreshold(), theEcorePackage.getEDouble(), "destinationDistanceThreshold", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_WayPointDistanceThreshold(), theEcorePackage.getEDouble(), "wayPointDistanceThreshold", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_KHill(), theEcorePackage.getEDouble(), "kHill", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_HillThreshold(), theEcorePackage.getEDouble(), "hillThreshold", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_PhiThresholdForReducedVelocity(), theEcorePackage.getEDouble(), "phiThresholdForReducedVelocity", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_AlphaThresholdForReducedVelocity(), theEcorePackage.getEDouble(), "alphaThresholdForReducedVelocity", null, 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstolfiGuidanceController_SmoothPathEnabled(), theEcorePackage.getEBoolean(), "smoothPathEnabled", "true", 0, 1, AstolfiGuidanceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pathFollowerStateEEnum, PathFollowerState.class, "PathFollowerState");
		addEEnumLiteral(pathFollowerStateEEnum, PathFollowerState.IDLE);
		addEEnumLiteral(pathFollowerStateEEnum, PathFollowerState.RUNNING);
		addEEnumLiteral(pathFollowerStateEEnum, PathFollowerState.PAUSED);
		addEEnumLiteral(pathFollowerStateEEnum, PathFollowerState.FAILED);

		initEEnum(pathRecorderSamplingModeEEnum, PathRecorderSamplingMode.class, "PathRecorderSamplingMode");
		addEEnumLiteral(pathRecorderSamplingModeEEnum, PathRecorderSamplingMode.ON_DISTANCE_DELTA);
		addEEnumLiteral(pathRecorderSamplingModeEEnum, PathRecorderSamplingMode.ON_TIME_DELTA);
		addEEnumLiteral(pathRecorderSamplingModeEEnum, PathRecorderSamplingMode.ON_TIME_OR_DISTANCE_DELTA);

		// Create resource
		createResource(eNS_URI);
	}

} //ControllersPackageImpl
