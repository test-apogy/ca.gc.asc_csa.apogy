/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitivesFactoryImpl.java,v 1.11.2.3 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.primitives.impl;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.topology.addons.primitives.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimitivesFactoryImpl extends EFactoryImpl implements PrimitivesFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitivesFactory init()
	{
		try {
			PrimitivesFactory thePrimitivesFactory = (PrimitivesFactory)EPackage.Registry.INSTANCE.getEFactory(PrimitivesPackage.eNS_URI);
			if (thePrimitivesFactory != null) {
				return thePrimitivesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PrimitivesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitivesFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID()) {
			case PrimitivesPackage.VECTOR: return createVector();
			case PrimitivesPackage.PICK_VECTOR: return createPickVector();
			case PrimitivesPackage.PRIMITIVES_FACADE: return createPrimitivesFacade();
			case PrimitivesPackage.PLANE: return createPlane();
			case PrimitivesPackage.WAY_POINT: return createWayPoint();
			case PrimitivesPackage.LABEL: return createLabel();
			case PrimitivesPackage.SPHERE_PRIMITIVE: return createSpherePrimitive();
			case PrimitivesPackage.AMBIENT_LIGHT: return createAmbientLight();
			case PrimitivesPackage.DIRECTIONAL_LIGHT: return createDirectionalLight();
			case PrimitivesPackage.POINT_LIGHT: return createPointLight();
			case PrimitivesPackage.SPOT_LIGHT: return createSpotLight();
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
			case PrimitivesPackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case PrimitivesPackage.VECTOR3D:
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
			case PrimitivesPackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case PrimitivesPackage.VECTOR3D:
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
	public Vector createVector()
	{
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
	public PrimitivesFacade createPrimitivesFacade()
	{
		PrimitivesFacadeImpl primitivesFacade = new PrimitivesFacadeImpl();
		return primitivesFacade;
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
	public SpherePrimitive createSpherePrimitive()
	{
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
	public PrimitivesPackage getPrimitivesPackage()
	{
		return (PrimitivesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PrimitivesPackage getPackage()
	{
		return PrimitivesPackage.eINSTANCE;
	}

} //PrimitivesFactoryImpl
