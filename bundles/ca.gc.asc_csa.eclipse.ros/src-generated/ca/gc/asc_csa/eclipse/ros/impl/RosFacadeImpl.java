/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.eclipse.ros.RosFacade;
import ca.gc.asc_csa.eclipse.ros.RosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RosFacadeImpl extends MinimalEObjectImpl.Container implements RosFacade 
{
	public static final String ROS_MASTER_URI_ENV_VAR = "ROS_MASTER_URI"; 
	public static final String ROS_HOSTNAME_ENV_VAR = "ROS_HOSTNAME"; 
	public static final String ROS_IP_ENV_VAR = "ROS_IP"; 
	
	
	private static RosFacade instance;
	
	public static RosFacade getInstance() {
		if (instance == null) 
		{
			instance = new RosFacadeImpl();
		}

		return instance;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosPackage.Literals.ROS_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getNodeNamePrefix() 
	{
		String nodeNamePrefix = "";
		
		try
		{		
			String userName = System.getProperty("user.name");		
			String machineName = java.net.InetAddress.getLocalHost().getHostName();
			
			boolean userNameValid = (userName !=null && userName.length() > 0);
			boolean machineNameValid = 	(machineName !=null && machineName.length() > 0);
			
			if(userNameValid) 
			{
				nodeNamePrefix += userName;
				if(machineNameValid)
				{
					nodeNamePrefix += "_" + machineName;
				}
			}
			else if(machineNameValid)
			{
				nodeNamePrefix += machineName;
			}
						
			// Ensures the first character is an alpha character ([a-z|A-Z]), tilde (~) or forward slash (/).
			if(nodeNamePrefix.length() > 0)
			{
				boolean firstCharacterIsValid = false;
				String newPrefix = nodeNamePrefix;
				
				while(!firstCharacterIsValid && newPrefix.length() > 0)
				{
					String firstChar = newPrefix.substring(0, 1);
					String replaced = firstChar.replaceAll("[^A-Za-z/~]", "");
					
					// Checks the first character.
					if(replaced.length() <= 0)
					{
						if(newPrefix.length() > 2)
						{
							newPrefix = newPrefix.substring(1);
						}
						else
						{
							newPrefix = "";
						}
					}
					else
					{
						firstCharacterIsValid = true;
					}
				}
				
				nodeNamePrefix = newPrefix;
				
				// Ensures the prefix contains only valid characters.
				nodeNamePrefix = nodeNamePrefix.trim();							
				nodeNamePrefix = nodeNamePrefix.replaceAll("[^A-Za-z0-9/_]", "");
				nodeNamePrefix = nodeNamePrefix.replaceAll(" ", "_");
			}
		}
		catch(Throwable t)
		{			
			return "";
		}
		
		return nodeNamePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getROSMasterURI() 
	{
		return System.getenv(ROS_MASTER_URI_ENV_VAR);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getROSHostname() {
		return System.getenv(ROS_HOSTNAME_ENV_VAR);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getROSIp() 
	{
		return System.getenv(ROS_IP_ENV_VAR);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RosPackage.ROS_FACADE___GET_NODE_NAME_PREFIX:
				return getNodeNamePrefix();
			case RosPackage.ROS_FACADE___GET_ROS_MASTER_URI:
				return getROSMasterURI();
			case RosPackage.ROS_FACADE___GET_ROS_HOSTNAME:
				return getROSHostname();
			case RosPackage.ROS_FACADE___GET_ROS_IP:
				return getROSIp();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RosFacadeImpl
