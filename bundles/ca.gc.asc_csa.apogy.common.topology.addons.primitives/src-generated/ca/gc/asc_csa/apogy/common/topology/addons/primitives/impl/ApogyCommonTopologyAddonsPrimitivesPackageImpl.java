package ca.gc.asc_csa.apogy.common.topology.addons.primitives.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;

import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

import ca.gc.asc_csa.apogy.common.topology.addons.primitives.AmbientLight;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.DirectionalLight;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.Label;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.Light;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.PointLight;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFactory;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpherePrimitive;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpotLight;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.WayPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonTopologyAddonsPrimitivesPackageImpl extends EPackageImpl implements ApogyCommonTopologyAddonsPrimitivesPackage {
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
	private EClass apogyCommonTopologyAddonsPrimitivesFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonTopologyAddonsPrimitivesPackageImpl() {
		super(eNS_URI, ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonTopologyAddonsPrimitivesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonTopologyAddonsPrimitivesPackage init() {
		if (isInited) return (ApogyCommonTopologyAddonsPrimitivesPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyAddonsPrimitivesPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonTopologyAddonsPrimitivesPackageImpl theApogyCommonTopologyAddonsPrimitivesPackage = (ApogyCommonTopologyAddonsPrimitivesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonTopologyAddonsPrimitivesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonTopologyAddonsPrimitivesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonTopologyAddonsPrimitivesPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonTopologyAddonsPrimitivesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonTopologyAddonsPrimitivesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonTopologyAddonsPrimitivesPackage.eNS_URI, theApogyCommonTopologyAddonsPrimitivesPackage);
		return theApogyCommonTopologyAddonsPrimitivesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector() {
		return vectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_XRotation() {
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_YRotation() {
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_ZRotation() {
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_Length() {
		return (EAttribute)vectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector_EndPoint() {
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
		return (EAttribute)pickVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPickVector_IntersectedNode() {
		return (EReference)pickVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPickVector_RelativeIntersectionPosition() {
		return (EAttribute)pickVectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPickVector_AbsoluteIntersectionPosition() {
		return (EAttribute)pickVectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPickVector_NodeTypesInIntersection() {
		return (EReference)pickVectorEClass.getEStructuralFeatures().get(4);
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
	public EClass getSpherePrimitive() {
		return spherePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpherePrimitive_Radius() {
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
	public EClass getApogyCommonTopologyAddonsPrimitivesFacade() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__Vector() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__Point3d_Point3d() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__double_double_double_double() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreatePlane__Vector3d_Vector3d_double_double() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateAmbientLight__Tuple3d() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateAmbientLight__boolean_Tuple3d() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateDirectionalLight__Tuple3d_Tuple3d() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateDirectionalLight__boolean_Tuple3d_Tuple3d() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d_Tuple3d() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__boolean_Tuple3d_Tuple3d_Tuple3d() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateSpotLight__Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonTopologyAddonsPrimitivesFacade__CreateSpotLight__boolean_Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float() {
		return apogyCommonTopologyAddonsPrimitivesFacadeEClass.getEOperations().get(13);
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
	public ApogyCommonTopologyAddonsPrimitivesFactory getApogyCommonTopologyAddonsPrimitivesFactory() {
		return (ApogyCommonTopologyAddonsPrimitivesFactory)getEFactoryInstance();
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
	public void createPackageContents() {
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
		createEAttribute(pickVectorEClass, PICK_VECTOR__INTERSECTION_DISTANCE);
		createEReference(pickVectorEClass, PICK_VECTOR__INTERSECTED_NODE);
		createEAttribute(pickVectorEClass, PICK_VECTOR__RELATIVE_INTERSECTION_POSITION);
		createEAttribute(pickVectorEClass, PICK_VECTOR__ABSOLUTE_INTERSECTION_POSITION);
		createEReference(pickVectorEClass, PICK_VECTOR__NODE_TYPES_IN_INTERSECTION);
		createEReference(pickVectorEClass, PICK_VECTOR__NODE_TYPES_TO_EXCLUDE_FROM_INTERSECTION);
		createEOperation(pickVectorEClass, PICK_VECTOR___IS_NODE_INCLUDED_IN_INTERSECTION__NODE);

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

		apogyCommonTopologyAddonsPrimitivesFacadeEClass = createEClass(APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__VECTOR);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__POINT3D_POINT3D);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_PLANE__VECTOR3D_VECTOR3D_DOUBLE_DOUBLE);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__TUPLE3D);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__BOOLEAN_TUPLE3D);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__TUPLE3D_TUPLE3D);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT);
		createEOperation(apogyCommonTopologyAddonsPrimitivesFacadeEClass, APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT);

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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vectorEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getNode());
		pickVectorEClass.getESuperTypes().add(this.getVector());
		planeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getNode());
		wayPointEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());
		labelEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getNode());
		spherePrimitiveEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());
		lightEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getLeaf());
		ambientLightEClass.getESuperTypes().add(this.getLight());
		directionalLightEClass.getESuperTypes().add(this.getLight());
		pointLightEClass.getESuperTypes().add(this.getLight());
		spotLightEClass.getESuperTypes().add(this.getPointLight());

		// Initialize classes, features, and operations; add parameters
		initEClass(vectorEClass, Vector.class, "Vector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVector_XRotation(), theEcorePackage.getEDouble(), "xRotation", "0.0", 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_YRotation(), theEcorePackage.getEDouble(), "yRotation", "0.0", 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_ZRotation(), theEcorePackage.getEDouble(), "zRotation", "0.0", 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_Length(), theEcorePackage.getEDouble(), "length", "1.0", 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector_EndPoint(), this.getPoint3d(), "endPoint", null, 0, 1, Vector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pickVectorEClass, PickVector.class, "PickVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPickVector_IntersectionDistance(), theEcorePackage.getEDouble(), "intersectionDistance", "-1.0", 0, 1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPickVector_IntersectedNode(), theApogyCommonTopologyPackage.getNode(), null, "intersectedNode", null, 0, 1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPickVector_RelativeIntersectionPosition(), this.getPoint3d(), "relativeIntersectionPosition", null, 0, 1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPickVector_AbsoluteIntersectionPosition(), this.getPoint3d(), "absoluteIntersectionPosition", null, 0, 1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPickVector_NodeTypesInIntersection(), theEcorePackage.getEClass(), null, "nodeTypesInIntersection", null, 0, -1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPickVector_NodeTypesToExcludeFromIntersection(), theEcorePackage.getEClass(), null, "nodeTypesToExcludeFromIntersection", null, 0, -1, PickVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPickVector__IsNodeIncludedInIntersection__Node(), theEcorePackage.getEBoolean(), "isNodeIncludedInIntersection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonTopologyPackage.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(planeEClass, Plane.class, "Plane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlane_V0(), theApogyCommonMathPackage.getTuple3d(), null, "v0", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlane_V1(), theApogyCommonMathPackage.getTuple3d(), null, "v1", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlane_Width(), theEcorePackage.getEDouble(), "width", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlane_Height(), theEcorePackage.getEDouble(), "height", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wayPointEClass, WayPoint.class, "WayPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spherePrimitiveEClass, SpherePrimitive.class, "SpherePrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpherePrimitive_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, SpherePrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lightEClass, Light.class, "Light", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLight_Enabled(), theEcorePackage.getEBoolean(), "enabled", "true", 0, 1, Light.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLight_Color(), theApogyCommonMathPackage.getTuple3d(), null, "color", null, 0, 1, Light.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ambientLightEClass, AmbientLight.class, "AmbientLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directionalLightEClass, DirectionalLight.class, "DirectionalLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectionalLight_Direction(), theApogyCommonMathPackage.getTuple3d(), null, "direction", null, 0, 1, DirectionalLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointLightEClass, PointLight.class, "PointLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointLight_Position(), theApogyCommonMathPackage.getTuple3d(), null, "position", null, 0, 1, PointLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointLight_Attenuation(), theApogyCommonMathPackage.getTuple3d(), null, "attenuation", null, 0, 1, PointLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spotLightEClass, SpotLight.class, "SpotLight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpotLight_Concentration(), theEcorePackage.getEFloat(), "concentration", null, 0, 1, SpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpotLight_SpreadAngle(), theEcorePackage.getEFloat(), "spreadAngle", null, 0, 1, SpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpotLight_Direction(), theApogyCommonMathPackage.getTuple3d(), null, "direction", null, 0, 1, SpotLight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apogyCommonTopologyAddonsPrimitivesFacadeEClass, ApogyCommonTopologyAddonsPrimitivesFacade.class, "ApogyCommonTopologyAddonsPrimitivesFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__Vector(), this.getVector(), "createVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVector(), "vector", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__Point3d_Point3d(), this.getVector(), "createVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "p0", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "p1", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreateVector__double_double_double_double(), this.getVector(), "createVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rotationX", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rotationY", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rotationZ", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "length", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreatePlane__Vector3d_Vector3d_double_double(), this.getPlane(), "createPlane", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVector3d(), "v0", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVector3d(), "v1", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "width", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "height", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreateAmbientLight__Tuple3d(), this.getAmbientLight(), "createAmbientLight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "color", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreateAmbientLight__boolean_Tuple3d(), this.getAmbientLight(), "createAmbientLight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "lightOn", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "color", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreateDirectionalLight__Tuple3d_Tuple3d(), this.getDirectionalLight(), "createDirectionalLight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "color", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "direction", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreateDirectionalLight__boolean_Tuple3d_Tuple3d(), this.getDirectionalLight(), "createDirectionalLight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "lightOn", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "color", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "direction", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d(), this.getPointLight(), "createPointLight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "position", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d(), this.getPointLight(), "createPointLight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "color", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "position", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__Tuple3d_Tuple3d_Tuple3d(), this.getPointLight(), "createPointLight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "color", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "position", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "attenuation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreatePointLight__boolean_Tuple3d_Tuple3d_Tuple3d(), this.getPointLight(), "createPointLight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "lightOn", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "color", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "position", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "attenuation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreateSpotLight__Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float(), this.getSpotLight(), "createSpotLight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "color", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "position", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "attenuation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "direction", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "spreadAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "concentration", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonTopologyAddonsPrimitivesFacade__CreateSpotLight__boolean_Tuple3d_Tuple3d_Tuple3d_Tuple3d_float_float(), this.getSpotLight(), "createSpotLight", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "lightOn", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "color", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "position", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "attenuation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "direction", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "speadAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "concentration", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(point3dEDataType, Point3d.class, "Point3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vector3dEDataType, Vector3d.class, "Vector3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyCommonTopologyAddonsPrimitives",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCommonTopologyAddonsPrimitives",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.common.topology.addons.primitives/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.common.topology.addons.primitives.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.common.topology.addons"
		   });	
		addAnnotation
		  (getVector_XRotation(), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getVector_YRotation(), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getVector_ZRotation(), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getVector_Length(), 
		   source, 
		   new String[] {
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getPickVector_IntersectionDistance(), 
		   source, 
		   new String[] {
			 "documentation", "The current shortest intersection distance between\nthe ray and a node of one of the included type.",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (pointLightEClass, 
		   source, 
		   new String[] {
			 "documentation", "The PointLight object specifies an attenuated light source at a fixed point in space that radiates light equally in all directions away from the light source. PointLight has the same attributes as a Light node, with the addition of location and attenuation parameters.\n * A point light contributes to diffuse and specular reflections, which in turn depend on the orientation and position of a surface. A point light does not contribute to ambient reflections.\n * A PointLight is attenuated by multiplying the contribution of the light by an attenuation factor. The attenuation factor causes the the PointLight\'s brightness to decrease as distance from the light source increases. A PointLight\'s attenuation factor contains three values:\n<ul>\n<li>Constant attenuation</li>\n<li>Linear attenuation</li>\n<li>Quadratic attenuation</li>\n</ul>\nA PointLight is attenuated by the reciprocal of the sum of:\n<ul>\n<li>The constant attenuation factor</li>\n<li>The Linear attenuation factor times the distance between the light and the vertex being illuminated</li>\n<li>The quadratic attenuation factor times the square of the distance between the light and the vertex </li>\n</ul>\nBy default, the constant attenuation value is 1 and the other two values are 0, resulting in no attenuation."
		   });	
		addAnnotation
		  (spotLightEClass, 
		   source, 
		   new String[] {
			 "documentation", "The SpotLight object specifies an attenuated light source at a fixed point in space that radiates light in a specified direction from the light source. A SpotLight has the same attributes as a PointLight node, with the addition of the following:\n<ul>\n<li>Direction - The axis of the cone of light. The default direction is (0.0, 0.0, -1.0). The spot light direction is significant only when the spread angle is not PI radians (which it is by default).</li>\n<li>Spread angle - The angle in radians between the direction axis and a ray along the edge of the cone. Note that the angle of the cone at the apex is then twice this value. The range of values is [0.0,PI/2] radians, with a special value of PI radians. Values lower than 0 are clamped to 0 and values over PI/2 are clamped to PI. The default spread angle is PI radians.</li>\n<li>Concentration - Specifies how quickly the light intensity attenuates as a function of the angle of radiation as measured from the direction of radiation. The light\'s intensity is highest at the center of the cone and is attenuated toward the edges of the cone by the cosine of the angle between the direction of the light and the direction from the light to the object being lit, raised to the power of the spot concentration exponent. The higher the concentration value, the more focused the light source. The range of values is [0.0,128.0]. The default concentration is 0.0, which provides uniform light distribution.</li>\n</ul>\nA spot light contributes to diffuse and specular reflections, which depend on the orientation and position of an object\'s surface. A spot light does not contribute to ambient reflections."
		   });
	}

} //ApogyCommonTopologyAddonsPrimitivesPackageImpl
