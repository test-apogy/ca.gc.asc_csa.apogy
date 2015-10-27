/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
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
public class Symphony__CommonTopologyAddonsPrimitivesFactoryImpl extends EFactoryImpl implements Symphony__CommonTopologyAddonsPrimitivesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonTopologyAddonsPrimitivesFactory init() {
		try {
			Symphony__CommonTopologyAddonsPrimitivesFactory theSymphony__CommonTopologyAddonsPrimitivesFactory = (Symphony__CommonTopologyAddonsPrimitivesFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonTopologyAddonsPrimitivesPackage.eNS_URI);
			if (theSymphony__CommonTopologyAddonsPrimitivesFactory != null) {
				return theSymphony__CommonTopologyAddonsPrimitivesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonTopologyAddonsPrimitivesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonTopologyAddonsPrimitivesFactoryImpl() {
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
			case Symphony__CommonTopologyAddonsPrimitivesPackage.VECTOR: return createVector();
			case Symphony__CommonTopologyAddonsPrimitivesPackage.PICK_VECTOR: return createPickVector();
			case Symphony__CommonTopologyAddonsPrimitivesPackage.PLANE: return createPlane();
			case Symphony__CommonTopologyAddonsPrimitivesPackage.WAY_POINT: return createWayPoint();
			case Symphony__CommonTopologyAddonsPrimitivesPackage.LABEL: return createLabel();
			case Symphony__CommonTopologyAddonsPrimitivesPackage.SPHERE_PRIMITIVE: return createSpherePrimitive();
			case Symphony__CommonTopologyAddonsPrimitivesPackage.AMBIENT_LIGHT: return createAmbientLight();
			case Symphony__CommonTopologyAddonsPrimitivesPackage.DIRECTIONAL_LIGHT: return createDirectionalLight();
			case Symphony__CommonTopologyAddonsPrimitivesPackage.POINT_LIGHT: return createPointLight();
			case Symphony__CommonTopologyAddonsPrimitivesPackage.SPOT_LIGHT: return createSpotLight();
			case Symphony__CommonTopologyAddonsPrimitivesPackage.PRIMITIVES_FACADE: return createPrimitivesFacade();
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
			case Symphony__CommonTopologyAddonsPrimitivesPackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case Symphony__CommonTopologyAddonsPrimitivesPackage.VECTOR3D:
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
			case Symphony__CommonTopologyAddonsPrimitivesPackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case Symphony__CommonTopologyAddonsPrimitivesPackage.VECTOR3D:
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
	public PrimitivesFacade createPrimitivesFacade() {
		PrimitivesFacadeImpl primitivesFacade = new PrimitivesFacadeImpl();
		return primitivesFacade;
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
	public Symphony__CommonTopologyAddonsPrimitivesPackage getSymphony__CommonTopologyAddonsPrimitivesPackage() {
		return (Symphony__CommonTopologyAddonsPrimitivesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonTopologyAddonsPrimitivesPackage getPackage() {
		return Symphony__CommonTopologyAddonsPrimitivesPackage.eINSTANCE;
	}

} //Symphony__CommonTopologyAddonsPrimitivesFactoryImpl
