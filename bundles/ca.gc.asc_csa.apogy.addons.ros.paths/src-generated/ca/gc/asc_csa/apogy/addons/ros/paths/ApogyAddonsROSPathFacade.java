/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.paths;

import org.eclipse.emf.ecore.EObject;
import org.ros.message.MessageFactory;

import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathFacadeImpl;
import nav_msgs.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apogy Addons ROS Path Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathsPackage#getApogyAddonsROSPathFacade()
 * @model
 * @generated
 */
public interface ApogyAddonsROSPathFacade extends EObject 
{
	public static final ApogyAddonsROSPathFacade INSTANCE = ApogyAddonsROSPathFacadeImpl.getInstance();

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Converts a nav_msgs.Path to a WayPointPath.
	 * @param rosPath The Path.
	 * @return The WayPointPath containning the position defined in the nav_msgs.Path.
	 * <!-- end-model-doc -->
	 * @model unique="false" rosPathDataType="ca.gc.asc_csa.apogy.addons.ros.paths.ROSPath" rosPathUnique="false"
	 * @generated
	 */
	WayPointPath convertToWayPointPath(Path rosPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Converts a WayPointPath to a nav_msgs.Path. The orientation at each position is set to the
	 * the direction of the next point of the WayPointPath. The direction of the last point is set
	 * to the direct of the second to last point.
	 * @param wayPointPath The WayPointPath to convert.
	 * @param messageFactory The MessageFactory used to create the nav_msgs.Path.
	 * @return the nav_msgs.Path created.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.addons.ros.paths.ROSPath" unique="false" wayPointPathUnique="false" messageFactoryDataType="ca.gc.asc_csa.apogy.addons.ros.paths.MessageFactory" messageFactoryUnique="false"
	 * @generated
	 */
	Path convertToROSPath(WayPointPath wayPointPath, MessageFactory messageFactory);

} // ApogyAddonsROSPathFacade
