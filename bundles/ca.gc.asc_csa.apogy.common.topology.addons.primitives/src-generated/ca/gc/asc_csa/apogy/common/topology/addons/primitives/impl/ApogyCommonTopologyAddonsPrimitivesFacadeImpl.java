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

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.AmbientLight;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.DirectionalLight;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.Plane;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.PointLight;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFacade;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesFactory;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpotLight;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonTopologyAddonsPrimitivesFacadeImpl extends MinimalEObjectImpl.Container implements
		ApogyCommonTopologyAddonsPrimitivesFacade {

	private static ApogyCommonTopologyAddonsPrimitivesFacadeImpl singleton = null;

	public static ApogyCommonTopologyAddonsPrimitivesFacadeImpl getInstance()
	{
		if (singleton == null)
		{
			singleton = new ApogyCommonTopologyAddonsPrimitivesFacadeImpl();
		}
		
		return singleton;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonTopologyAddonsPrimitivesFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsPrimitivesPackage.Literals.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public Vector createVector(Vector vector) {
		Vector result = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createVector();

		result.setXRotation(vector.getXRotation());
		result.setYRotation(vector.getYRotation());
		result.setZRotation(vector.getZRotation());
		result.setLength(vector.getLength());

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public Vector createVector(Point3d p0, Point3d p1) {
		Vector result = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createVector();

		double length = p0.distance(p1);
		result.setLength(length);

		if (length != 0) {
			Point3d diff = new Point3d();
			diff.sub(p1, p0);

			double yrot = Math.asin(diff.z / length);
			double zrot = Math.atan(diff.y / diff.x);

			result.setYRotation(yrot);
			result.setZRotation(zrot);
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public Vector createVector(double rotationX, double rotationY, double rotationZ, double length) {
		Vector result = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createVector();

		result.setLength(length);
		result.setXRotation(rotationX);
		result.setYRotation(rotationY);
		result.setZRotation(rotationZ);

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public Plane createPlane(Vector3d v0, Vector3d v1, double width, double height) {

		Tuple3d v0Tuple = ApogyCommonMathFacade.INSTANCE.createTuple3d(v0);
		Tuple3d v1Tuple = ApogyCommonMathFacade.INSTANCE.createTuple3d(v1);

		Plane plane = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createPlane();
		plane.setV0(v0Tuple);
		plane.setV1(v1Tuple);
		plane.setWidth(width);
		plane.setHeight(height);

		return plane;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public AmbientLight createAmbientLight(Tuple3d color) {
		AmbientLight light = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createAmbientLight();
		light.setColor(color);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public AmbientLight createAmbientLight(boolean lightOn, Tuple3d color) {
		AmbientLight light = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createAmbientLight();

		light.setEnabled(lightOn);
		light.setColor(color);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public DirectionalLight createDirectionalLight(boolean lightOn,
			Tuple3d color, Tuple3d direction) {
		DirectionalLight light = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE
				.createDirectionalLight();

		light.setEnabled(lightOn);
		light.setDirection(direction);
		light.setColor(color);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public PointLight createPointLight(Tuple3d color, Tuple3d position) {
		PointLight light = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createPointLight();
		light.setColor(color);
		light.setPosition(position);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public DirectionalLight createDirectionalLight(Tuple3d color,
			Tuple3d direction) {
		DirectionalLight light = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE
				.createDirectionalLight();
		light.setColor(color);
		light.setDirection(direction);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public PointLight createPointLight(Tuple3d position) {
		PointLight light = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createPointLight();
		light.setPosition(position);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public PointLight createPointLight(boolean lightOn, Tuple3d color, Tuple3d position, Tuple3d attenuation) {
		PointLight light = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createPointLight();

		light.setEnabled(lightOn);
		light.setColor(color);
		light.setPosition(position);
		light.setAttenuation(attenuation);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public PointLight createPointLight(Tuple3d color, Tuple3d position,	Tuple3d attenuation) {
		PointLight light = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createPointLight();

		light.setColor(color);
		light.setPosition(position);
		light.setAttenuation(attenuation);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public SpotLight createSpotLight(boolean lightOn, Tuple3d color,
									 Tuple3d position, Tuple3d attenuation, Tuple3d direction,
									 float spreadAngle, float concentration) {
		SpotLight light = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createSpotLight();

		light.setEnabled(lightOn);
		light.setColor(color);
		light.setPosition(position);
		light.setAttenuation(attenuation);
		light.setDirection(direction);
		light.setSpreadAngle(spreadAngle);
		light.setConcentration(concentration);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public SpotLight createSpotLight(Tuple3d color, Tuple3d position,
									 Tuple3d attenuation, Tuple3d direction, float spreadAngle,
									 float concentration) {
		SpotLight light = ApogyCommonTopologyAddonsPrimitivesFactory.eINSTANCE.createSpotLight();

		light.setColor(color);
		light.setPosition(position);
		light.setAttenuation(attenuation);
		light.setDirection(direction);
		light.setSpreadAngle(spreadAngle);
		light.setConcentration(concentration);

		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__VECTOR:
				return createVector((Vector)arguments.get(0));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__POINT3D_POINT3D:
				return createVector((Point3d)arguments.get(0), (Point3d)arguments.get(1));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_VECTOR__DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return createVector((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_PLANE__VECTOR3D_VECTOR3D_DOUBLE_DOUBLE:
				return createPlane((Vector3d)arguments.get(0), (Vector3d)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__TUPLE3D:
				return createAmbientLight((Tuple3d)arguments.get(0));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__BOOLEAN_TUPLE3D:
				return createAmbientLight((Boolean)arguments.get(0), (Tuple3d)arguments.get(1));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__TUPLE3D_TUPLE3D:
				return createDirectionalLight((Tuple3d)arguments.get(0), (Tuple3d)arguments.get(1));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D:
				return createDirectionalLight((Boolean)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D:
				return createPointLight((Tuple3d)arguments.get(0));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D:
				return createPointLight((Tuple3d)arguments.get(0), (Tuple3d)arguments.get(1));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D:
				return createPointLight((Tuple3d)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_POINT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D:
				return createPointLight((Boolean)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2), (Tuple3d)arguments.get(3));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT:
				return createSpotLight((Tuple3d)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2), (Tuple3d)arguments.get(3), (Float)arguments.get(4), (Float)arguments.get(5));
			case ApogyCommonTopologyAddonsPrimitivesPackage.APOGY_COMMON_TOPOLOGY_ADDONS_PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT:
				return createSpotLight((Boolean)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2), (Tuple3d)arguments.get(3), (Tuple3d)arguments.get(4), (Float)arguments.get(5), (Float)arguments.get(6));
		}
		return super.eInvoke(operationID, arguments);
	}

} // ApogyCommonTopologyAddonsPrimitivesFacadeImpl
