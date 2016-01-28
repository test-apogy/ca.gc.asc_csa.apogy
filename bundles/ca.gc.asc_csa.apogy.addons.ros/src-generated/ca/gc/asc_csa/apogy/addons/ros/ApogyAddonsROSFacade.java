/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.ros.impl.Symphony__AddonsROSFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.ros.Symphony__AddonsROSPackage#getSymphony__AddonsROSFacade()
 * @model
 * @generated
 */
public interface Symphony__AddonsROSFacade extends EObject {
	
	public static final Symphony__AddonsROSFacade INSTANCE = Symphony__AddonsROSFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a prefix for a Node name (typically used for client node)
	 * that contains the user and machine name.
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

} // Symphony__AddonsROSFacade
