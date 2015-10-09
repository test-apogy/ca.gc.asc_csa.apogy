/**
 * Canadian Space Agency 2007.
 *
 * $Id: PathsFactoryImpl.java,v 1.5.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package org.eclipse.symphony.addons.geometry.paths.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator;
import org.eclipse.symphony.addons.geometry.paths.MinimumDistanceFilter;
import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.geometry.paths.PathsFacade;
import org.eclipse.symphony.addons.geometry.paths.PathsFactory;
import org.eclipse.symphony.addons.geometry.paths.PathsPackage;
import org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator;
import org.eclipse.symphony.addons.geometry.paths.SplineEndControlPointGenerationMode;
import org.eclipse.symphony.addons.geometry.paths.UniformDistanceWayPointPathInterpolator;
import org.eclipse.symphony.addons.geometry.paths.WayPoint;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.addons.geometry.paths.WayPointPathInterpolator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathsFactoryImpl extends EFactoryImpl implements PathsFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PathsFactory init() {
		try {
			PathsFactory thePathsFactory = (PathsFactory)EPackage.Registry.INSTANCE.getEFactory(PathsPackage.eNS_URI);
			if (thePathsFactory != null) {
				return thePathsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PathsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathsFactoryImpl() {
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
			case PathsPackage.PATH: return createPath();
			case PathsPackage.WAY_POINT_PATH: return createWayPointPath();
			case PathsPackage.WAY_POINT_PATH_INTERPOLATOR: return createWayPointPathInterpolator();
			case PathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR: return createCatmullRomWayPointPathInterpolator();
			case PathsPackage.MINIMUM_DISTANCE_FILTER: return createMinimumDistanceFilter();
			case PathsPackage.PATHS_FACADE: return createPathsFacade();
			case PathsPackage.SEGMENT_WAY_POINT_PATH_INTERPOLATOR: return createSegmentWayPointPathInterpolator();
			case PathsPackage.UNIFORM_DISTANCE_WAY_POINT_PATH_INTERPOLATOR: return createUniformDistanceWayPointPathInterpolator();
			case PathsPackage.WAY_POINT: return createWayPoint();
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
			case PathsPackage.SPLINE_END_CONTROL_POINT_GENERATION_MODE:
				return createSplineEndControlPointGenerationModeFromString(eDataType, initialValue);
			case PathsPackage.LIST:
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
			case PathsPackage.SPLINE_END_CONTROL_POINT_GENERATION_MODE:
				return convertSplineEndControlPointGenerationModeToString(eDataType, instanceValue);
			case PathsPackage.LIST:
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
	public WayPointPathInterpolator createWayPointPathInterpolator() {
		WayPointPathInterpolatorImpl wayPointPathInterpolator = new WayPointPathInterpolatorImpl();
		return wayPointPathInterpolator;
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
	public MinimumDistanceFilter createMinimumDistanceFilter() {
		MinimumDistanceFilterImpl minimumDistanceFilter = new MinimumDistanceFilterImpl();
		return minimumDistanceFilter;
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
	public SegmentWayPointPathInterpolator createSegmentWayPointPathInterpolator()
	{
		SegmentWayPointPathInterpolatorImpl segmentWayPointPathInterpolator = new SegmentWayPointPathInterpolatorImpl();
		return segmentWayPointPathInterpolator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformDistanceWayPointPathInterpolator createUniformDistanceWayPointPathInterpolator()
	{
		UniformDistanceWayPointPathInterpolatorImpl uniformDistanceWayPointPathInterpolator = new UniformDistanceWayPointPathInterpolatorImpl();
		return uniformDistanceWayPointPathInterpolator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPoint createWayPoint()
	{
		WayPointImpl wayPoint = new WayPointImpl();
		return wayPoint;
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
	public PathsPackage getPathsPackage() {
		return (PathsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PathsPackage getPackage() {
		return PathsPackage.eINSTANCE;
	}

} //PathsFactoryImpl
