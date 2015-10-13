/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.primitives;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.addons.primitives.impl.PrimitivesFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage#getPrimitivesFacade()
 * @model
 * @generated
 */
public interface PrimitivesFacade extends EObject
{
	public static PrimitivesFacade INSTANCE = PrimitivesFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" vectorUnique="false"
	 * @generated
	 */
	Vector createVector(Vector vector);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" p0DataType="org.eclipse.symphony.common.topology.addons.primitives.Point3d" p0Unique="false" p1DataType="org.eclipse.symphony.common.topology.addons.primitives.Point3d" p1Unique="false"
	 * @generated
	 */
	Vector createVector(Point3d p0, Point3d p1);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rotationXUnique="false" rotationYUnique="false" rotationZUnique="false" lengthUnique="false"
	 * @generated
	 */
	Vector createVector(double rotationX, double rotationY, double rotationZ, double length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" v0DataType="org.eclipse.symphony.common.topology.addons.primitives.Vector3d" v0Unique="false" v1DataType="org.eclipse.symphony.common.topology.addons.primitives.Vector3d" v1Unique="false" widthUnique="false" heightUnique="false"
	 * @generated
	 */
	Plane createPlane(Vector3d v0, Vector3d v1, double width, double height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" colorUnique="false"
	 * @generated
	 */
	AmbientLight createAmbientLight(Tuple3d color);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" lightOnUnique="false" colorUnique="false"
	 * @generated
	 */
	AmbientLight createAmbientLight(boolean lightOn, Tuple3d color);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" colorUnique="false" directionUnique="false"
	 * @generated
	 */
	DirectionalLight createDirectionalLight(Tuple3d color, Tuple3d direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" lightOnUnique="false" colorUnique="false" directionUnique="false"
	 * @generated
	 */
	DirectionalLight createDirectionalLight(boolean lightOn, Tuple3d color, Tuple3d direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" positionUnique="false"
	 * @generated
	 */
	PointLight createPointLight(Tuple3d position);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" colorUnique="false" positionUnique="false"
	 * @generated
	 */
	PointLight createPointLight(Tuple3d color, Tuple3d position);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" colorUnique="false" positionUnique="false" attenuationUnique="false"
	 * @generated
	 */
	PointLight createPointLight(Tuple3d color, Tuple3d position, Tuple3d attenuation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" lightOnUnique="false" colorUnique="false" positionUnique="false" attenuationUnique="false"
	 * @generated
	 */
	PointLight createPointLight(boolean lightOn, Tuple3d color, Tuple3d position, Tuple3d attenuation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" colorUnique="false" positionUnique="false" attenuationUnique="false" directionUnique="false" spreadAngleUnique="false" concentrationUnique="false"
	 * @generated
	 */
	SpotLight createSpotLight(Tuple3d color, Tuple3d position, Tuple3d attenuation, Tuple3d direction, float spreadAngle, float concentration);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" lightOnUnique="false" colorUnique="false" positionUnique="false" attenuationUnique="false" directionUnique="false" speadAngleUnique="false" concentrationUnique="false"
	 * @generated
	 */
	SpotLight createSpotLight(boolean lightOn, Tuple3d color, Tuple3d position, Tuple3d attenuation, Tuple3d direction, float speadAngle, float concentration);

} // PrimitivesFacade
