/**
 * Canadian Space Agency 2007.
 *
 * $Id: Symphony__AddonsMobilityPathplannersFactoryImpl.java,v 1.4.4.3 2015/09/22 19:39:42 rlarcheveque Exp $
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
import org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersFactory;
import org.eclipse.symphony.addons.mobility.pathplanners.Symphony__AddonsMobilityPathplannersPackage;
import org.eclipse.symphony.addons.mobility.pathplanners.WayPointPathPlanner;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsMobilityPathplannersFactoryImpl extends EFactoryImpl implements Symphony__AddonsMobilityPathplannersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsMobilityPathplannersFactory init() {
		try {
			Symphony__AddonsMobilityPathplannersFactory theSymphony__AddonsMobilityPathplannersFactory = (Symphony__AddonsMobilityPathplannersFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsMobilityPathplannersPackage.eNS_URI);
			if (theSymphony__AddonsMobilityPathplannersFactory != null) {
				return theSymphony__AddonsMobilityPathplannersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsMobilityPathplannersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsMobilityPathplannersFactoryImpl() {
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
			case Symphony__AddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER: return createWayPointPathPlanner();
			case Symphony__AddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER: return createMeshWayPointPathPlanner();
			case Symphony__AddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE: return createCircularExclusionZone();
			case Symphony__AddonsMobilityPathplannersPackage.PATH_PLANNERS_FACADE: return createPathPlannersFacade();
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
	public Symphony__AddonsMobilityPathplannersPackage getSymphony__AddonsMobilityPathplannersPackage() {
		return (Symphony__AddonsMobilityPathplannersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsMobilityPathplannersPackage getPackage() {
		return Symphony__AddonsMobilityPathplannersPackage.eINSTANCE;
	}

} //Symphony__AddonsMobilityPathplannersFactoryImpl
