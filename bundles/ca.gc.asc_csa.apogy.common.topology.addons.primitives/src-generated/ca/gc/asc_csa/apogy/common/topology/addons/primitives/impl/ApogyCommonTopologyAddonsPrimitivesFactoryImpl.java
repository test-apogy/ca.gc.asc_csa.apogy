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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.common.topology.addons.primitives.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonTopologyAddonsPrimitivesFactoryImpl extends EFactoryImpl implements ApogyCommonTopologyAddonsPrimitivesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonTopologyAddonsPrimitivesFactory init() {
		try {
			ApogyCommonTopologyAddonsPrimitivesFactory theApogyCommonTopologyAddonsPrimitivesFactory = (ApogyCommonTopologyAddonsPrimitivesFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonTopologyAddonsPrimitivesPackage.eNS_URI);
			if (theApogyCommonTopologyAddonsPrimitivesFactory != null) {
				return theApogyCommonTopologyAddonsPrimitivesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonTopologyAddonsPrimitivesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyAddonsPrimitivesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR: return createVector();
			case ApogyCommonTopologyAddonsPrimitivesPackage.PICK_VECTOR: return createPickVector();
			case ApogyCommonTopologyAddonsPrimitivesPackage.PLANE: return createPlane();
			case ApogyCommonTopologyAddonsPrimitivesPackage.WAY_POINT: return createWayPoint();
			case ApogyCommonTopologyAddonsPrimitivesPackage.LABEL: return createLabel();
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPHERE_PRIMITIVE: return createSpherePrimitive();
			case ApogyCommonTopologyAddonsPrimitivesPackage.AMBIENT_LIGHT: return createAmbientLight();
			case ApogyCommonTopologyAddonsPrimitivesPackage.DIRECTIONAL_LIGHT: return createDirectionalLight();
			case ApogyCommonTopologyAddonsPrimitivesPackage.POINT_LIGHT: return createPointLight();
			case ApogyCommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT: return createSpotLight();
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE: return createApogyCommonTopologyAddonsPrimitivesFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR3D:
				return createVector3dFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR3D:
				return convertVector3dToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector createVector() {
		VectorImpl vector = new VectorImpl();
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PickVector createPickVector() {
		PickVectorImpl pickVector = new PickVectorImpl();
		return pickVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plane createPlane() {
		PlaneImpl plane = new PlaneImpl();
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPoint createWayPoint() {
		WayPointImpl wayPoint = new WayPointImpl();
		return wayPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpherePrimitive createSpherePrimitive() {
		SpherePrimitiveImpl spherePrimitive = new SpherePrimitiveImpl();
		return spherePrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmbientLight createAmbientLight() {
		AmbientLightImpl ambientLight = new AmbientLightImpl();
		return ambientLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionalLight createDirectionalLight() {
		DirectionalLightImpl directionalLight = new DirectionalLightImpl();
		return directionalLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointLight createPointLight() {
		PointLightImpl pointLight = new PointLightImpl();
		return pointLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpotLight createSpotLight() {
		SpotLightImpl spotLight = new SpotLightImpl();
		return spotLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyAddonsPrimitivesFacade createApogyCommonTopologyAddonsPrimitivesFacade() {
		ApogyCommonTopologyAddonsPrimitivesFacadeImpl apogyCommonTopologyAddonsPrimitivesFacade = new ApogyCommonTopologyAddonsPrimitivesFacadeImpl();
		return apogyCommonTopologyAddonsPrimitivesFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3d createPoint3dFromString(EDataType eDataType, String initialValue) {
		return (Point3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoint3dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d createVector3dFromString(EDataType eDataType, String initialValue) {
		return (Vector3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVector3dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyAddonsPrimitivesPackage getApogyCommonTopologyAddonsPrimitivesPackage() {
		return (ApogyCommonTopologyAddonsPrimitivesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonTopologyAddonsPrimitivesPackage getPackage() {
		return ApogyCommonTopologyAddonsPrimitivesPackage.eINSTANCE;
	}

} //ApogyCommonTopologyAddonsPrimitivesFactoryImpl
