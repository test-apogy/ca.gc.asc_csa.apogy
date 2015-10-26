/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.addons.geometry.paths.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsGeometryPathsFactoryImpl extends EFactoryImpl implements Symphony__AddonsGeometryPathsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsGeometryPathsFactory init() {
		try {
			Symphony__AddonsGeometryPathsFactory theSymphony__AddonsGeometryPathsFactory = (Symphony__AddonsGeometryPathsFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsGeometryPathsPackage.eNS_URI);
			if (theSymphony__AddonsGeometryPathsFactory != null) {
				return theSymphony__AddonsGeometryPathsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsGeometryPathsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsGeometryPathsFactoryImpl() {
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
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT: return createWayPoint();
			case Symphony__AddonsGeometryPathsPackage.PATH: return createPath();
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT_PATH: return createWayPointPath();
			case Symphony__AddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR: return createCatmullRomWayPointPathInterpolator();
			case Symphony__AddonsGeometryPathsPackage.SEGMENT_WAY_POINT_PATH_INTERPOLATOR: return createSegmentWayPointPathInterpolator();
			case Symphony__AddonsGeometryPathsPackage.MINIMUM_DISTANCE_FILTER: return createMinimumDistanceFilter();
			case Symphony__AddonsGeometryPathsPackage.UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR: return createUniformDistanceWayPointPathInterpolator();
			case Symphony__AddonsGeometryPathsPackage.PATHS_FACADE: return createPathsFacade();
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
			case Symphony__AddonsGeometryPathsPackage.SPLINE_END_CONTROL_POINT_GENERATION_MODE:
				return createSplineEndControlPointGenerationModeFromString(eDataType, initialValue);
			case Symphony__AddonsGeometryPathsPackage.LIST:
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
			case Symphony__AddonsGeometryPathsPackage.SPLINE_END_CONTROL_POINT_GENERATION_MODE:
				return convertSplineEndControlPointGenerationModeToString(eDataType, instanceValue);
			case Symphony__AddonsGeometryPathsPackage.LIST:
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
	public PathsFacade createPathsFacade() {
		PathsFacadeImpl pathsFacade = new PathsFacadeImpl();
		return pathsFacade;
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
	public Symphony__AddonsGeometryPathsPackage getSymphony__AddonsGeometryPathsPackage() {
		return (Symphony__AddonsGeometryPathsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsGeometryPathsPackage getPackage() {
		return Symphony__AddonsGeometryPathsPackage.eINSTANCE;
	}

} //Symphony__AddonsGeometryPathsFactoryImpl
