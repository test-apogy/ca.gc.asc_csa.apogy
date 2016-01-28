/**
 * Canadian Space Agency 2007.
 *
 * $Id: ApogyAddonsMobilityPathplannersFactoryImpl.java,v 1.4.4.3 2015/09/22 19:39:42 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersFacade;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersFactory;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsMobilityPathplannersFactoryImpl extends EFactoryImpl implements ApogyAddonsMobilityPathplannersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsMobilityPathplannersFactory init() {
		try {
			ApogyAddonsMobilityPathplannersFactory theApogyAddonsMobilityPathplannersFactory = (ApogyAddonsMobilityPathplannersFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsMobilityPathplannersPackage.eNS_URI);
			if (theApogyAddonsMobilityPathplannersFactory != null) {
				return theApogyAddonsMobilityPathplannersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsMobilityPathplannersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsMobilityPathplannersFactoryImpl() {
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
			case ApogyAddonsMobilityPathplannersPackage.WAY_POINT_PATH_PLANNER: return createWayPointPathPlanner();
			case ApogyAddonsMobilityPathplannersPackage.MESH_WAY_POINT_PATH_PLANNER: return createMeshWayPointPathPlanner();
			case ApogyAddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE: return createCircularExclusionZone();
			case ApogyAddonsMobilityPathplannersPackage.APOGY_ADDONS_MOBILITY_PATHPLANNERS_FACADE: return createApogyAddonsMobilityPathplannersFacade();
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
	public ApogyAddonsMobilityPathplannersFacade createApogyAddonsMobilityPathplannersFacade() {
		ApogyAddonsMobilityPathplannersFacadeImpl apogy__AddonsMobilityPathplannersFacade = new ApogyAddonsMobilityPathplannersFacadeImpl();
		return apogy__AddonsMobilityPathplannersFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsMobilityPathplannersPackage getApogyAddonsMobilityPathplannersPackage() {
		return (ApogyAddonsMobilityPathplannersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsMobilityPathplannersPackage getPackage() {
		return ApogyAddonsMobilityPathplannersPackage.eINSTANCE;
	}

} //ApogyAddonsMobilityPathplannersFactoryImpl
