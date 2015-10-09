/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitivesFacadeImpl.java,v 1.10.2.2 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.primitives.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.addons.primitives.AmbientLight;
import org.eclipse.symphony.common.topology.addons.primitives.DirectionalLight;
import org.eclipse.symphony.common.topology.addons.primitives.Plane;
import org.eclipse.symphony.common.topology.addons.primitives.PointLight;
import org.eclipse.symphony.common.topology.addons.primitives.PrimitivesFacade;
import org.eclipse.symphony.common.topology.addons.primitives.PrimitivesFactory;
import org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage;
import org.eclipse.symphony.common.topology.addons.primitives.SpotLight;
import org.eclipse.symphony.common.topology.addons.primitives.Vector;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrimitivesFacadeImpl extends EObjectImpl implements
		PrimitivesFacade {

	private static PrimitivesFacadeImpl singleton = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitivesFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimitivesPackage.Literals.PRIMITIVES_FACADE;
	}

	public static PrimitivesFacadeImpl getInstance() {
		if (singleton == null) {
			singleton = new PrimitivesFacadeImpl();
		}
		return singleton;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Vector createVector(Vector vector) {
		Vector result = PrimitivesFactory.eINSTANCE.createVector();

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
	public Vector createVector(Point3d p0, Point3d p1) {
		Vector result = PrimitivesFactory.eINSTANCE.createVector();

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
	public Vector createVector(double rotationX, double rotationY,
			double rotationZ, double length) {
		Vector result = PrimitivesFactory.eINSTANCE.createVector();

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
	public Plane createPlane(Vector3d v0, Vector3d v1, double width,
			double height) {

		Tuple3d v0Tuple = MathFacade.INSTANCE.createTuple3d(v0);
		Tuple3d v1Tuple = MathFacade.INSTANCE.createTuple3d(v1);

		Plane plane = PrimitivesFactory.eINSTANCE.createPlane();
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
	public AmbientLight createAmbientLight(Tuple3d color) {
		AmbientLight light = PrimitivesFactory.eINSTANCE.createAmbientLight();
		light.setColor(color);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AmbientLight createAmbientLight(boolean lightOn, Tuple3d color) {
		AmbientLight light = PrimitivesFactory.eINSTANCE.createAmbientLight();

		light.setEnabled(lightOn);
		light.setColor(color);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public DirectionalLight createDirectionalLight(boolean lightOn,
			Tuple3d color, Tuple3d direction) {
		DirectionalLight light = PrimitivesFactory.eINSTANCE
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
	public PointLight createPointLight(Tuple3d color, Tuple3d position) {
		PointLight light = PrimitivesFactory.eINSTANCE.createPointLight();
		light.setColor(color);
		light.setPosition(position);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public DirectionalLight createDirectionalLight(Tuple3d color,
			Tuple3d direction) {
		DirectionalLight light = PrimitivesFactory.eINSTANCE
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
	public PointLight createPointLight(Tuple3d position) {
		PointLight light = PrimitivesFactory.eINSTANCE.createPointLight();
		light.setPosition(position);

		return light;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public PointLight createPointLight(boolean lightOn, Tuple3d color,
			Tuple3d position, Tuple3d attenuation) {
		PointLight light = PrimitivesFactory.eINSTANCE.createPointLight();

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
	public PointLight createPointLight(Tuple3d color, Tuple3d position,
			Tuple3d attenuation) {
		PointLight light = PrimitivesFactory.eINSTANCE.createPointLight();

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
	public SpotLight createSpotLight(boolean lightOn, Tuple3d color,
			Tuple3d position, Tuple3d attenuation, Tuple3d direction,
			float spreadAngle, float concentration) {
		SpotLight light = PrimitivesFactory.eINSTANCE.createSpotLight();

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
	public SpotLight createSpotLight(Tuple3d color, Tuple3d position,
			Tuple3d attenuation, Tuple3d direction, float spreadAngle,
			float concentration) {
		SpotLight light = PrimitivesFactory.eINSTANCE.createSpotLight();

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
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_VECTOR__VECTOR:
				return createVector((Vector)arguments.get(0));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_VECTOR__POINT3D_POINT3D:
				return createVector((Point3d)arguments.get(0), (Point3d)arguments.get(1));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_VECTOR__DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return createVector((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_PLANE__VECTOR3D_VECTOR3D_DOUBLE_DOUBLE:
				return createPlane((Vector3d)arguments.get(0), (Vector3d)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__TUPLE3D:
				return createAmbientLight((Tuple3d)arguments.get(0));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_AMBIENT_LIGHT__BOOLEAN_TUPLE3D:
				return createAmbientLight((Boolean)arguments.get(0), (Tuple3d)arguments.get(1));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D:
				return createDirectionalLight((Boolean)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_DIRECTIONAL_LIGHT__TUPLE3D_TUPLE3D:
				return createDirectionalLight((Tuple3d)arguments.get(0), (Tuple3d)arguments.get(1));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D:
				return createPointLight((Tuple3d)arguments.get(0), (Tuple3d)arguments.get(1));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D:
				return createPointLight((Tuple3d)arguments.get(0));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_POINT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D:
				return createPointLight((Boolean)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2), (Tuple3d)arguments.get(3));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_POINT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D:
				return createPointLight((Tuple3d)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__BOOLEAN_TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT:
				return createSpotLight((Boolean)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2), (Tuple3d)arguments.get(3), (Tuple3d)arguments.get(4), (Float)arguments.get(5), (Float)arguments.get(6));
			case PrimitivesPackage.PRIMITIVES_FACADE___CREATE_SPOT_LIGHT__TUPLE3D_TUPLE3D_TUPLE3D_TUPLE3D_FLOAT_FLOAT:
				return createSpotLight((Tuple3d)arguments.get(0), (Tuple3d)arguments.get(1), (Tuple3d)arguments.get(2), (Tuple3d)arguments.get(3), (Float)arguments.get(4), (Float)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} // PrimitivesFacadeImpl
