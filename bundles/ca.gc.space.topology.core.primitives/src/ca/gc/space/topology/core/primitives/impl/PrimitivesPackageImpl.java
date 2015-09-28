/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitivesPackageImpl.java,v 1.10.2.4 2015/05/04 20:29:23 pallard Exp $
 */
package ca.gc.space.topology.core.primitives.impl;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.space.math.MathPackage;
import ca.gc.space.topology.TopologyPackage;
import ca.gc.space.topology.core.primitives.AmbientLight;
import ca.gc.space.topology.core.primitives.DirectionalLight;
import ca.gc.space.topology.core.primitives.Label;
import ca.gc.space.topology.core.primitives.Light;
import ca.gc.space.topology.core.primitives.PickVector;
import ca.gc.space.topology.core.primitives.Plane;
import ca.gc.space.topology.core.primitives.PointLight;
import ca.gc.space.topology.core.primitives.PrimitivesFacade;
import ca.gc.space.topology.core.primitives.PrimitivesFactory;
import ca.gc.space.topology.core.primitives.PrimitivesPackage;
import ca.gc.space.topology.core.primitives.SpherePrimitive;
import ca.gc.space.topology.core.primitives.SpotLight;
import ca.gc.space.topology.core.primitives.Vector;
import ca.gc.space.topology.core.primitives.WayPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitivesPackageImpl extends EPackageImpl implements PrimitivesPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pickVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitivesFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wayPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spherePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ambientLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directionalLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spotLightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType point3dEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vector3dEDataType = null;

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
	 * @see ca.gc.space.topology.core.primitives.PrimitivesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrimitivesPackageImpl()
	{
		super(eNS_URI, PrimitivesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PrimitivesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrimitivesPackage init()
	{
		if (isInited) return (PrimitivesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitivesPackage.eNS_URI);

		// Obtain or create and register package
		PrimitivesPackageImpl thePrimitivesPackage = (PrimitivesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PrimitivesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PrimitivesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TopologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePrimitivesPackage.createPackageContents();

		// Initialize created meta-data
		thePrimitivesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrimitivesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrimitivesPackage.eNS_URI, thePrimitivesPackage);
		return thePrimitivesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector()
	{
		return vectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_XRotation()
	{
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_YRotation()
	{
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_ZRotation()
	{
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_Length()
	{
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_EndPoint()
	{
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPickVector() {
		return pickVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPickVector_IntersectionDistance() {
		return (EAttribute)pickVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPickVector_IntersectedNode() {
		return (EReference)pickVectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPickVector_NodeTypesInIntersection() {
		return (EReference)pickVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPickVector_RelativeIntersectionPosition() {
		return (EAttribute)pickVectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPickVector_AbsoluteIntersectionPosition() {
		return (EAttribute)pickVectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPickVector_NodeTypesToExcludeFromIntersection() {
		return (EReference)pickVectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPickVector__IsNodeIncludedInIntersection__Node() {
		return pickVectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitivesFacade()
	{
		return primitivesFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreateVector__Vector() {
		return primitivesFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreateVector__Point3d_Point3d() {
		return primitivesFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreateVector__double_double_double_double() {
		return primitivesFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreatePlane__Vector3d_Vector3d_double_double() {
		return primitivesFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreateAmbientLight__Tuple3d() {
		return primitivesFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreateAmbientLight__boolean_Tuple3d() {
		return primitivesFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreateDirectionalLight__boolean_Tuple3d_Tuple3d() {
		return primitivesFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreateDirectionalLight__Tuple3d_Tuple3d() {
		return primitivesFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d() {
		return primitivesFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreatePointLight__Tuple3d() {
		return primitivesFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreatePointLight__boolean_Tuple3d_Tuple3d_Tuple3d() {
		return primitivesFacadeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d_Tuple3d() {
		return primitivesFacadeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreateSpotLight__boolean_Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float() {
		return primitivesFacadeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPrimitivesFacade__CreateSpotLight__Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float() {
		return primitivesFacadeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlane() {
		return planeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlane_V0() {
		return (EReference)planeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlane_V1() {
		return (EReference)planeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlane_Width() {
		return (EAttribute)planeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlane_Height() {
		return (EAttribute)planeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWayPoint() {
		return wayPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpherePrimitive()
	{
		return spherePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpherePrimitive_Radius()
	{
		return (EAttribute)spherePrimitiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLight() {
		return lightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLight_Enabled() {
		return (EAttribute)lightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLight_Color() {
		return (EReference)lightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmbientLight() {
		return ambientLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectionalLight() {
		return directionalLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectionalLight_Direction() {
		return (EReference)directionalLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointLight() {
		return pointLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointLight_Position() {
		return (EReference)pointLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointLight_Attenuation() {
		return (EReference)pointLightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpotLight() {
		return spotLightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpotLight_Concentration() {
		return (EAttribute)spotLightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpotLight_SpreadAngle() {
		return (EAttribute)spotLightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpotLight_Direction() {
		return (EReference)spotLightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint3d() {
		return point3dEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVector3d() {
		return vector3dEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitivesFactory getPrimitivesFactory()
	{
		return (PrimitivesFactory)getEFactoryInstance();
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
		vectorEClass = createEClass(VECTOR);
		createEAttribute(vectorEClass, VECTOR__XROTATION);
		createEAttribute(vectorEClass, VECTOR__YROTATION);
		createEAttribute(vectorEClass, VECTOR__ZROTATION);
		createEAttribute(vectorEClass, VECTOR__LENGTH);
		createEAttribute(vectorEClass, VECTOR__END_POINT);

		pickVectorEClass = createEClass(PICK_VECTOR);
		createEReference(pickVectorEClass, PICK_VECTOR__NODE_TYPES_IN_INTERSECTION);
		createEAttribute(pickVectorEClass, PICK_VECTOR__INTERSECTION_DISTANCE);
		createEReference(pickVectorEClass, PICK_VECTOR__INTERSECTED_NODE);
		createEAttribute(pickVectorEClass, PICK_VECTOR__RELATIVE_INTERSECTION_POSITION);
		createEAttribute(pickVectorEClass, PICK_VECTOR__ABSOLUTE_INTERSECTION_POSITION);
		createEReference(pickVectorEClass, PICK_VECTOR__NODE_TYPES_TO_EXCLUDE_FROM_INTERSECTION);
		createEOperation(pickVectorEClass, PICK_VECTOR___IS_NODE_INCLUDED_IN_INTERSECTION__NODE);

		primitivesFacadeEClass = createEClass(PRIMITIVES_FACADE);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_VECTOR__VECTOR);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_VECTOR__POINT3D_POINT3D);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_VECTOR__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_PLANE__VECTOR3D_VECTOR3D_DOUBLE_DOUBLE);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__TUPLE3D);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__BOOLEAN_TUPLE3D);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__TUPLE3D_TUPLE3D);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_POINT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT);
		createEOperation(primitivesFacadeEClass, PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT);

		planeEClass = createEClass(PLANE);
		createEReference(planeEClass, PLANE__V0);
		createEReference(planeEClass, PLANE__V1);
		createEAttribute(planeEClass, PLANE__WIDTH);
		createEAttribute(planeEClass, PLANE__HEIGHT);

		wayPointEClass = createEClass(WAY_POINT);

		labelEClass = createEClass(LABEL);

		spherePrimitiveEClass = createEClass(SPHERE_PRIMITIVE);
		createEAttribute(spherePrimitiveEClass, SPHERE_PRIMITIVE__RADIUS);

		lightEClass = createEClass(LIGHT);
		createEAttribute(lightEClass, LIGHT__ENABLED);
		createEReference(lightEClass, LIGHT__COLOR);

		ambientLightEClass = createEClass(AMBIENT_LIGHT);

		directionalLightEClass = createEClass(DIRECTIONAL_LIGHT);
		createEReference(directionalLightEClass, DIRECTIONAL_LIGHT__DIRECTION);

		pointLightEClass = createEClass(POINT_LIGHT);
		createEReference(pointLightEClass, POINT_LIGHT__POSITION);
		createEReference(pointLightEClass, POINT_LIGHT__ATTENUATION);

		spotLightEClass = createEClass(SPOT_LIGHT);
		createEAttribute(spotLightEClass, SPOT_LIGHT__CONCENTRATION);
		createEAttribute(spotLightEClass, SPOT_LIGHT__SPREAD_ANGLE);
		createEReference(spotLightEClass, SPOT_LIGHT__DIRECTION);

		// Create data types
		point3dEDataType = createEDataType(POINT3D);
		vector3dEDataType = createEDataType(VECTOR3D);
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
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		MathPackage theMathPackage = (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vectorEClass.getESuperTypes().add(theTopologyPackage.getNode());
		pickVectorEClass.getESuperTypes().add(this.getVector());
		planeEClass.getESuperTypes().add(theTopologyPackage.getNode());
		wayPointEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		labelEClass.getESuperTypes().add(theTopologyPackage.getNode());
		spherePrimitiveEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		lightEClass.getESuperTypes().add(theTopologyPackage.getLeaf());
		ambientLightEClass.getESuperTypes().add(this.getLight());
		directionalLightEClass.getESuperTypes().add(this.getLight());
		pointLightEClass.getESuperTypes().add(this.getLight());
		spotLightEClass.getESuperTypes().add(this.getPointLight());

		// Initialize classes, features, and operations; add parameters
		initEClass(vectorEClass, Vector.class, "Vector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVector_XRotation(), ecorePackage.getEDouble(), "xRotation", "0.0", 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_YRotation(), ecorePackage.getEDouble(), "yRotation", "0.0", 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_ZRotation(), ecorePackage.getEDouble(), "zRotation", "0.0", 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_Length(), ecorePackage.getEDouble(), "length", null, 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_EndPoint(), this.getPoint3d(), "endPoint", null, 0, 1, Vector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pickVectorEClass, PickVector.class, "PickVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPickVector_NodeTypesInIntersection(), ecorePackage.getEClass(), null, "nodeTypesInIntersection", null, 0, -1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPickVector_IntersectionDistance(), ecorePackage.getEDouble(), "intersectionDistance", "-1", 0, 1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPickVector_IntersectedNode(), theTopologyPackage.getNode(), null, "intersectedNode", null, 0, 1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPickVector_RelativeIntersectionPosition(), this.getPoint3d(), "relativeIntersectionPosition", null, 0, 1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPickVector_AbsoluteIntersectionPosition(), this.getPoint3d(), "absoluteIntersectionPosition", null, 0, 1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPickVector_NodeTypesToExcludeFromIntersection(), ecorePackage.getEClass(), null, "nodeTypesToExcludeFromIntersection", null, 0, -1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPickVector__IsNodeIncludedInIntersection__Node(), ecorePackage.getEBoolean(), "isNodeIncludedInIntersection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTopologyPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(primitivesFacadeEClass, PrimitivesFacade.class, "PrimitivesFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPrimitivesFacade__CreateVector__Vector(), this.getVector(), "createVector", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVector(), "vector", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreateVector__Point3d_Point3d(), this.getVector(), "createVector", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "p0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "p1", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreateVector__double_double_double_double(), this.getVector(), "createVector", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "rotationX", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "rotationY", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "rotationZ", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "length", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreatePlane__Vector3d_Vector3d_double_double(), this.getPlane(), "createPlane", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVector3d(), "v0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVector3d(), "v1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreateAmbientLight__Tuple3d(), this.getAmbientLight(), "createAmbientLight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "color", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreateAmbientLight__boolean_Tuple3d(), this.getAmbientLight(), "createAmbientLight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "lightOn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "color", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreateDirectionalLight__boolean_Tuple3d_Tuple3d(), this.getDirectionalLight(), "createDirectionalLight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "lightOn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "color", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "direction", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreateDirectionalLight__Tuple3d_Tuple3d(), this.getDirectionalLight(), "createDirectionalLight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "color", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "direction", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d(), this.getPointLight(), "createPointLight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "color", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreatePointLight__Tuple3d(), this.getPointLight(), "createPointLight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreatePointLight__boolean_Tuple3d_Tuple3d_Tuple3d(), this.getPointLight(), "createPointLight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "lightOn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "color", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "attenuation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d_Tuple3d(), this.getPointLight(), "createPointLight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "color", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "attenuation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreateSpotLight__boolean_Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float(), this.getSpotLight(), "createSpotLight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "lightOn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "color", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "attenuation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "direction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "spreadAngle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "concentration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrimitivesFacade__CreateSpotLight__Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float(), this.getSpotLight(), "createSpotLight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "color", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "position", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "attenuation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "direction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "spreadAngle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "concentration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(planeEClass, Plane.class, "Plane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlane_V0(), theMathPackage.getTuple3d(), null, "v0", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlane_V1(), theMathPackage.getTuple3d(), null, "v1", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlane_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlane_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wayPointEClass, WayPoint.class, "WayPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spherePrimitiveEClass, SpherePrimitive.class, "SpherePrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpherePrimitive_Radius(), ecorePackage.getEDouble(), "radius", null, 0, 1, SpherePrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lightEClass, Light.class, "Light", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLight_Enabled(), ecorePackage.getEBoolean(), "enabled", "true", 0, 1, Light.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLight_Color(), theMathPackage.getTuple3d(), null, "color", null, 0, 1, Light.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ambientLightEClass, AmbientLight.class, "AmbientLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directionalLightEClass, DirectionalLight.class, "DirectionalLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectionalLight_Direction(), theMathPackage.getTuple3d(), null, "direction", null, 0, 1, DirectionalLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointLightEClass, PointLight.class, "PointLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointLight_Position(), theMathPackage.getTuple3d(), null, "position", null, 0, 1, PointLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointLight_Attenuation(), theMathPackage.getTuple3d(), null, "attenuation", null, 0, 1, PointLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spotLightEClass, SpotLight.class, "SpotLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpotLight_Concentration(), ecorePackage.getEFloat(), "concentration", null, 0, 1, SpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpotLight_SpreadAngle(), ecorePackage.getEFloat(), "spreadAngle", null, 0, 1, SpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpotLight_Direction(), theMathPackage.getTuple3d(), null, "direction", null, 0, 1, SpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(point3dEDataType, Point3d.class, "Point3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vector3dEDataType, Vector3d.class, "Vector3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PrimitivesPackageImpl
