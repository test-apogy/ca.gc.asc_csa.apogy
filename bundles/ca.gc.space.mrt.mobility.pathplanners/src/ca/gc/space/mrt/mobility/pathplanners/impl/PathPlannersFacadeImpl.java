/**
 * Canadian Space Agency 2007.
 *
 * $Id: PathPlannersFacadeImpl.java,v 1.4.4.2 2015/05/21 15:50:52 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.symphony.common.topology.GroupNode;

import ca.gc.space.mrt.mobility.pathplanners.CircularExclusionZone;
import ca.gc.space.mrt.mobility.pathplanners.PathPlannersFacade;
import ca.gc.space.mrt.mobility.pathplanners.PathplannersFactory;
import ca.gc.space.mrt.mobility.pathplanners.PathplannersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Planners Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PathPlannersFacadeImpl extends EObjectImpl implements PathPlannersFacade {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathPlannersFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathplannersPackage.Literals.PATH_PLANNERS_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CircularExclusionZone createCircularExclusionZone(double radius, GroupNode parent)
	{
		CircularExclusionZone zone  = PathplannersFactory.eINSTANCE.createCircularExclusionZone();				
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
			case PathplannersPackage.PATH_PLANNERS_FACADE___CREATE_CIRCULAR_EXCLUSION_ZONE__DOUBLE_GROUPNODE:
				return createCircularExclusionZone((Double)arguments.get(0), (GroupNode)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
} //PathPlannersFacadeImpl
