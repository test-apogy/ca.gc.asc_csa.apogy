/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data.impl;

import java.util.List;

import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.geometry.data.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonGeometryDataFactoryImpl extends EFactoryImpl implements Symphony__CommonGeometryDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonGeometryDataFactory init() {
		try {
			Symphony__CommonGeometryDataFactory theSymphony__CommonGeometryDataFactory = (Symphony__CommonGeometryDataFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonGeometryDataPackage.eNS_URI);
			if (theSymphony__CommonGeometryDataFactory != null) {
				return theSymphony__CommonGeometryDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonGeometryDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonGeometryDataFactoryImpl() {
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
			case Symphony__CommonGeometryDataPackage.COORDINATES: return createCoordinates();
			case Symphony__CommonGeometryDataPackage.COORDINATES_SET: return createCoordinatesSet();
			case Symphony__CommonGeometryDataPackage.POLYGON: return createPolygon();
			case Symphony__CommonGeometryDataPackage.MESH: return createMesh();
			case Symphony__CommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER: return createCoordinatesSetShapesSampler();
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
			case Symphony__CommonGeometryDataPackage.SHAPE_SAMPLING_MODE:
				return createShapeSamplingModeFromString(eDataType, initialValue);
			case Symphony__CommonGeometryDataPackage.POLYGON_SAMPLING_MODE:
				return createPolygonSamplingModeFromString(eDataType, initialValue);
			case Symphony__CommonGeometryDataPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case Symphony__CommonGeometryDataPackage.VECTOR3D:
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
			case Symphony__CommonGeometryDataPackage.SHAPE_SAMPLING_MODE:
				return convertShapeSamplingModeToString(eDataType, instanceValue);
			case Symphony__CommonGeometryDataPackage.POLYGON_SAMPLING_MODE:
				return convertPolygonSamplingModeToString(eDataType, instanceValue);
			case Symphony__CommonGeometryDataPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case Symphony__CommonGeometryDataPackage.VECTOR3D:
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
	public Coordinates createCoordinates() {
		CoordinatesImpl coordinates = new CoordinatesImpl();
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Coordinates> CoordinatesSet<T> createCoordinatesSet() {
		CoordinatesSetImpl<T> coordinatesSet = new CoordinatesSetImpl<T>();
		return coordinatesSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Coordinates> Polygon<T> createPolygon() {
		PolygonImpl<T> polygon = new PolygonImpl<T>();
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Mesh<CoordinatesType, PolygonType> createMesh() {
		MeshImpl<CoordinatesType, PolygonType> mesh = new MeshImpl<CoordinatesType, PolygonType>();
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Coordinates> CoordinatesSetShapesSampler<T> createCoordinatesSetShapesSampler() {
		CoordinatesSetShapesSamplerImpl<T> coordinatesSetShapesSampler = new CoordinatesSetShapesSamplerImpl<T>();
		return coordinatesSetShapesSampler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeSamplingMode createShapeSamplingModeFromString(EDataType eDataType, String initialValue) {
		ShapeSamplingMode result = ShapeSamplingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeSamplingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonSamplingMode createPolygonSamplingModeFromString(EDataType eDataType, String initialValue) {
		PolygonSamplingMode result = PolygonSamplingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolygonSamplingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
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
	public Symphony__CommonGeometryDataPackage getSymphony__CommonGeometryDataPackage() {
		return (Symphony__CommonGeometryDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonGeometryDataPackage getPackage() {
		return Symphony__CommonGeometryDataPackage.eINSTANCE;
	}

} //Symphony__CommonGeometryDataFactoryImpl
