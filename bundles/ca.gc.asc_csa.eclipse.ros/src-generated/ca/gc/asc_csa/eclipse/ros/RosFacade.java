/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.eclipse.ros.impl.RosFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage#getRosFacade()
 * @model
 * @generated
 */
public interface RosFacade extends EObject 
{
	public static final RosFacade INSTANCE = RosFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a prefix for a Node name (typically used for client node) that contains the user and machine name.
	 * @return The node name prefix.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getNodeNamePrefix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the ROS Master URI value.
	 * @return The ROS_MASTER_URI environment variable value.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getROSMasterURI();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the ROS Host Name value.
	 * @return The ROS_HOSTNAME environment variable value.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getROSHostname();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the ROS IP value.
	 * @return The ROS_IP environment variable value.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getROSIp();

} // RosFacade
