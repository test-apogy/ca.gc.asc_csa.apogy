/**
 * Canadian Space Agency 2007.
 *
 * $Id: ApogyAddonsMobilityPathplannersFacadeImpl.java,v 1.4.4.2 2015/05/21 15:50:52 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersFacade;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersFactory;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Planners Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyAddonsMobilityPathplannersFacadeImpl extends MinimalEObjectImpl.Container implements ApogyAddonsMobilityPathplannersFacade {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyAddonsMobilityPathplannersFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityPathplannersPackage.Literals.APOGY_ADDONS_MOBILITY_PATHPLANNERS_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CircularExclusionZone createCircularExclusionZone(double radius, GroupNode parent)
	{
		CircularExclusionZone zone  = ApogyAddonsMobilityPathplannersFactory.eINSTANCE.createCircularExclusionZone();				
		zone.setRadius(radius);	
		parent.getChildren().add(zone);
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsMobilityPathplannersPackage.APOGY_ADDONS_MOBILITY_PATHPLANNERS_FACADE___CREATE_CIRCULAR_EXCLUSION_ZONE__DOUBLE_GROUPNODE:
				return createCircularExclusionZone((Double)arguments.get(0), (GroupNode)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
} //ApogyAddonsMobilityPathplannersFacadeImpl
