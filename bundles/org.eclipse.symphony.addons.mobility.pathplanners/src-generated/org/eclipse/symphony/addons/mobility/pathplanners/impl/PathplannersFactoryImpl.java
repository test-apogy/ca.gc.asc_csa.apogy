/**
 * Canadian Space Agency 2007.
 *
 * $Id: PathplannersFactoryImpl.java,v 1.4.4.3 2015/09/22 19:39:42 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone;
import org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner;
import org.eclipse.symphony.addons.mobility.pathplanners.PathPlannersFacade;
import org.eclipse.symphony.addons.mobility.pathplanners.PathplannersFactory;
import org.eclipse.symphony.addons.mobility.pathplanners.PathplannersPackage;
import org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathplannersFactoryImpl extends EFactoryImpl implements PathplannersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PathplannersFactory init() {
		try {
			PathplannersFactory thePathplannersFactory = (PathplannersFactory)EPackage.Registry.INSTANCE.getEFactory(PathplannersPackage.eNS_URI);
			if (thePathplannersFactory != null) {
				return thePathplannersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PathplannersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathplannersFactoryImpl() {
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
			case PathplannersPackage.WAY_POINT_PATH_PLANNER: return createWayPointPathPlanner();
			case PathplannersPackage.MESH_WAY_POINT_PATH_PLANNER: return createMeshWayPointPathPlanner();
			case PathplannersPackage.CIRCULAR_EXCLUSION_ZONE: return createCircularExclusionZone();
			case PathplannersPackage.PATH_PLANNERS_FACADE: return createPathPlannersFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointPathPlanner createWayPointPathPlanner() {
		WayPointPathPlannerImpl wayPointPathPlanner = new WayPointPathPlannerImpl();
		return wayPointPathPlanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends CartesianPolygon> MeshWayPointPathPlanner<T> createMeshWayPointPathPlanner() {
		MeshWayPointPathPlannerImpl<T> meshWayPointPathPlanner = new MeshWayPointPathPlannerImpl<T>();
		return meshWayPointPathPlanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircularExclusionZone createCircularExclusionZone() {
		CircularExclusionZoneImpl circularExclusionZone = new CircularExclusionZoneImpl();
		return circularExclusionZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPlannersFacade createPathPlannersFacade() {
		PathPlannersFacadeImpl pathPlannersFacade = new PathPlannersFacadeImpl();
		return pathPlannersFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathplannersPackage getPathplannersPackage() {
		return (PathplannersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PathplannersPackage getPackage() {
		return PathplannersPackage.eINSTANCE;
	}

} //PathplannersFactoryImpl
