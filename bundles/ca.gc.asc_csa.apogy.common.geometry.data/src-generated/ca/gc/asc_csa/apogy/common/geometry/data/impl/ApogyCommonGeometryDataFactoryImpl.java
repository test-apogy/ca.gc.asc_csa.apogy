/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data.impl;

import java.util.List;

import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.geometry.data.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryDataFactoryImpl extends EFactoryImpl implements ApogyCommonGeometryDataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonGeometryDataFactory init() {
		try {
			ApogyCommonGeometryDataFactory theApogyCommonGeometryDataFactory = (ApogyCommonGeometryDataFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonGeometryDataPackage.eNS_URI);
			if (theApogyCommonGeometryDataFactory != null) {
				return theApogyCommonGeometryDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonGeometryDataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryDataFactoryImpl() {
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
			case ApogyCommonGeometryDataPackage.COORDINATES: return createCoordinates();
			case ApogyCommonGeometryDataPackage.COORDINATES_SET: return createCoordinatesSet();
			case ApogyCommonGeometryDataPackage.POLYGON: return createPolygon();
			case ApogyCommonGeometryDataPackage.MESH: return createMesh();
			case ApogyCommonGeometryDataPackage.COORDINATES_SET_SHAPES_SAMPLER: return createCoordinatesSetShapesSampler();
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
			case ApogyCommonGeometryDataPackage.SHAPE_SAMPLING_MODE:
				return createShapeSamplingModeFromString(eDataType, initialValue);
			case ApogyCommonGeometryDataPackage.POLYGON_SAMPLING_MODE:
				return createPolygonSamplingModeFromString(eDataType, initialValue);
			case ApogyCommonGeometryDataPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyCommonGeometryDataPackage.VECTOR3D:
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
			case ApogyCommonGeometryDataPackage.SHAPE_SAMPLING_MODE:
				return convertShapeSamplingModeToString(eDataType, instanceValue);
			case ApogyCommonGeometryDataPackage.POLYGON_SAMPLING_MODE:
				return convertPolygonSamplingModeToString(eDataType, instanceValue);
			case ApogyCommonGeometryDataPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyCommonGeometryDataPackage.VECTOR3D:
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
	public ApogyCommonGeometryDataPackage getApogyCommonGeometryDataPackage() {
		return (ApogyCommonGeometryDataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonGeometryDataPackage getPackage() {
		return ApogyCommonGeometryDataPackage.eINSTANCE;
	}

} //ApogyCommonGeometryDataFactoryImpl
