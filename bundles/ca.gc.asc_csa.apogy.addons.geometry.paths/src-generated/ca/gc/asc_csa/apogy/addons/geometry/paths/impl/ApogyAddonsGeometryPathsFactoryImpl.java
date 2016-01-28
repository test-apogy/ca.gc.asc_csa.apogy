/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.geometry.paths.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.addons.geometry.paths.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsGeometryPathsFactoryImpl extends EFactoryImpl implements ApogyAddonsGeometryPathsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsGeometryPathsFactory init() {
		try {
			ApogyAddonsGeometryPathsFactory theApogyAddonsGeometryPathsFactory = (ApogyAddonsGeometryPathsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsGeometryPathsPackage.eNS_URI);
			if (theApogyAddonsGeometryPathsFactory != null) {
				return theApogyAddonsGeometryPathsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsGeometryPathsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsGeometryPathsFactoryImpl() {
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
			case ApogyAddonsGeometryPathsPackage.WAY_POINT: return createWayPoint();
			case ApogyAddonsGeometryPathsPackage.PATH: return createPath();
			case ApogyAddonsGeometryPathsPackage.WAY_POINT_PATH: return createWayPointPath();
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR: return createCatmullRomWayPointPathInterpolator();
			case ApogyAddonsGeometryPathsPackage.SEGMENT_WAY_POINT_PATH_INTERPOLATOR: return createSegmentWayPointPathInterpolator();
			case ApogyAddonsGeometryPathsPackage.MINIMUM_DISTANCE_FILTER: return createMinimumDistanceFilter();
			case ApogyAddonsGeometryPathsPackage.UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR: return createUniformDistanceWayPointPathInterpolator();
			case ApogyAddonsGeometryPathsPackage.APOGY_ADDONS_GEOMETRY_PATHS_FACADE: return createApogyAddonsGeometryPathsFacade();
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
			case ApogyAddonsGeometryPathsPackage.SPLINE_END_CONTROL_POINT_GENERATION_MODE:
				return createSplineEndControlPointGenerationModeFromString(eDataType, initialValue);
			case ApogyAddonsGeometryPathsPackage.LIST:
				return createListFromString(eDataType, initialValue);
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
			case ApogyAddonsGeometryPathsPackage.SPLINE_END_CONTROL_POINT_GENERATION_MODE:
				return convertSplineEndControlPointGenerationModeToString(eDataType, instanceValue);
			case ApogyAddonsGeometryPathsPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointPath createWayPointPath() {
		WayPointPathImpl wayPointPath = new WayPointPathImpl();
		return wayPointPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatmullRomWayPointPathInterpolator createCatmullRomWayPointPathInterpolator() {
		CatmullRomWayPointPathInterpolatorImpl catmullRomWayPointPathInterpolator = new CatmullRomWayPointPathInterpolatorImpl();
		return catmullRomWayPointPathInterpolator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentWayPointPathInterpolator createSegmentWayPointPathInterpolator() {
		SegmentWayPointPathInterpolatorImpl segmentWayPointPathInterpolator = new SegmentWayPointPathInterpolatorImpl();
		return segmentWayPointPathInterpolator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimumDistanceFilter createMinimumDistanceFilter() {
		MinimumDistanceFilterImpl minimumDistanceFilter = new MinimumDistanceFilterImpl();
		return minimumDistanceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformDistanceWayPointPathInterpolator createUniformDistanceWayPointPathInterpolator() {
		UniformDistanceWayPointPathInterpolatorImpl uniformDistanceWayPointPathInterpolator = new UniformDistanceWayPointPathInterpolatorImpl();
		return uniformDistanceWayPointPathInterpolator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsGeometryPathsFacade createApogyAddonsGeometryPathsFacade() {
		ApogyAddonsGeometryPathsFacadeImpl apogy__AddonsGeometryPathsFacade = new ApogyAddonsGeometryPathsFacadeImpl();
		return apogy__AddonsGeometryPathsFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplineEndControlPointGenerationMode createSplineEndControlPointGenerationModeFromString(EDataType eDataType, String initialValue) {
		SplineEndControlPointGenerationMode result = SplineEndControlPointGenerationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSplineEndControlPointGenerationModeToString(EDataType eDataType, Object instanceValue) {
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
	public ApogyAddonsGeometryPathsPackage getApogyAddonsGeometryPathsPackage() {
		return (ApogyAddonsGeometryPathsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsGeometryPathsPackage getPackage() {
		return ApogyAddonsGeometryPathsPackage.eINSTANCE;
	}

} //ApogyAddonsGeometryPathsFactoryImpl
