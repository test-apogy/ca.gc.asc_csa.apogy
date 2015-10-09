/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitivesFacade.java,v 1.8.2.2 2015/02/03 20:01:31 rlarcheveque Exp $
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
	 * @model
	 * @generated
	 */
	Vector createVector(Vector vector);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model p0DataType="org.eclipse.symphony.common.topology.addons.primitives.Point3d" p1DataType="org.eclipse.symphony.common.topology.addons.primitives.Point3d"
	 * @generated
	 */
	Vector createVector(Point3d p0, Point3d p1);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Vector createVector(double rotationX, double rotationY, double rotationZ, double length);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model v0DataType="org.eclipse.symphony.common.topology.addons.primitives.Vector3d" v1DataType="org.eclipse.symphony.common.topology.addons.primitives.Vector3d"
	 * @generated
	 */
	Plane createPlane(Vector3d v0, Vector3d v1, double width, double height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AmbientLight createAmbientLight(Tuple3d color);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AmbientLight createAmbientLight(boolean lightOn, Tuple3d color);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DirectionalLight createDirectionalLight(boolean lightOn, Tuple3d color, Tuple3d direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PointLight createPointLight(Tuple3d color, Tuple3d position);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DirectionalLight createDirectionalLight(Tuple3d color, Tuple3d direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PointLight createPointLight(Tuple3d position);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PointLight createPointLight(boolean lightOn, Tuple3d color, Tuple3d position, Tuple3d attenuation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PointLight createPointLight(Tuple3d color, Tuple3d position, Tuple3d attenuation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param spreadAngle The spread angle, in radians.
	 * @param concentration The concentration, between [0,128], default is 0.0.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	SpotLight createSpotLight(boolean lightOn, Tuple3d color, Tuple3d position, Tuple3d attenuation, Tuple3d direction, float spreadAngle, float concentration);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param spreadAngle The spread angle, in radians.
	 * @param concentration The concentration, between [0,128], default is 0.0.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	SpotLight createSpotLight(Tuple3d color, Tuple3d position, Tuple3d attenuation, Tuple3d direction, float spreadAngle, float concentration);

} // PrimitivesFacade
