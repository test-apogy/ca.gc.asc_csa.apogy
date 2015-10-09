/**
 * Canadian Space Agency 2007.
 *
 * $Id: PathsFacadeImpl.java,v 1.3.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package ca.gc.space.mrt.geometry.paths.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;

import ca.gc.space.mrt.geometry.paths.PathsFacade;
import ca.gc.space.mrt.geometry.paths.PathsFactory;
import ca.gc.space.mrt.geometry.paths.PathsPackage;
import ca.gc.space.mrt.geometry.paths.WayPointPath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PathsFacadeImpl extends EObjectImpl implements PathsFacade {
	
	private static Data3dFacade data3dFacade = Data3dFactory.eINSTANCE.createData3dFacade();
	
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
	protected PathsFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathsPackage.Literals.PATHS_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public WayPointPath createWayPointPath(WayPointPath wayPointPath) {
		
		WayPointPath path = createWayPointPath(wayPointPath.getPoints());	
		
		// Copies the description.		
		path.setDescription(wayPointPath.getDescription());		
		
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public WayPointPath createWayPointPath(List<CartesianPositionCoordinates> points)
	{
		WayPointPath path = PathsFactory.eINSTANCE.createWayPointPath();
				
		// Copies all of the points.
		Iterator <CartesianPositionCoordinates> it = points.iterator();
		while(it.hasNext())
		{
			CartesianPositionCoordinates wayPointCopy = data3dFacade.createCartesianPositionCoordinates(it.next());
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
			case PathsPackage.PATHS_FACADE___CREATE_WAY_POINT_PATH__WAYPOINTPATH:
				return createWayPointPath((WayPointPath)arguments.get(0));
			case PathsPackage.PATHS_FACADE___CREATE_WAY_POINT_PATH__LIST:
				return createWayPointPath((List<CartesianPositionCoordinates>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
} //PathsFacadeImpl
