/**
 * Canadian Space Agency 2007.
 *
 * $Id: Symphony__AddonsGeometryPathsFacadeImpl.java,v 1.3.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package org.eclipse.symphony.addons.geometry.paths.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFacade;
import org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFactory;
import org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Symphony__AddonsGeometryPathsFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__AddonsGeometryPathsFacade {
	
	private static Symphony__AddonsGeometryPathsFacade instance = null;
	
	public static Symphony__AddonsGeometryPathsFacade getInstance()
	{
		if (instance == null)
		{
			instance = new Symphony__AddonsGeometryPathsFacadeImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__AddonsGeometryPathsFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsGeometryPathsPackage.Literals.SYMPHONY_ADDONS_GEOMETRY_PATHS_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public WayPointPath createWayPointPath(WayPointPath wayPointPath) {
		
		WayPointPath path = createWayPointPath(wayPointPath.getPoints());	
		
		// Copies the description.		
		path.setDescription(wayPointPath.getDescription());		
		
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public WayPointPath createWayPointPath(List<CartesianPositionCoordinates> points)
	{
		WayPointPath path = Symphony__AddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
				
		// Copies all of the points.
		Iterator <CartesianPositionCoordinates> it = points.iterator();
		while(it.hasNext())
		{
			CartesianPositionCoordinates wayPointCopy = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(it.next());
			path.getPoints().add(wayPointCopy);
		}				
					
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsGeometryPathsPackage.SYMPHONY_ADDONS_GEOMETRY_PATHS_FACADE___CREATE_WAY_POINT_PATH__WAYPOINTPATH:
				return createWayPointPath((WayPointPath)arguments.get(0));
			case Symphony__AddonsGeometryPathsPackage.SYMPHONY_ADDONS_GEOMETRY_PATHS_FACADE___CREATE_WAY_POINT_PATH__LIST:
				return createWayPointPath((List<CartesianPositionCoordinates>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
} //Symphony__AddonsGeometryPathsFacadeImpl
