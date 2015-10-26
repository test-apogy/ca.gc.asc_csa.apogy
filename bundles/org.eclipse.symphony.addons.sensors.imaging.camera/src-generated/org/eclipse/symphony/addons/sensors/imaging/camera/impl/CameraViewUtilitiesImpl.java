/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfigurationList;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewUtilities;
import org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.ToolsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera View Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CameraViewUtilitiesImpl extends MinimalEObjectImpl.Container implements CameraViewUtilities 
{
	private static CameraViewUtilities instance = null;
	
	public static CameraViewUtilities getInstance() 
	{
		if (instance == null) 
		{
			instance = new CameraViewUtilitiesImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraViewUtilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_UTILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getCameraViewConfigurationIdentifier(CameraViewConfiguration cameraViewConfiguration) 
	{
		if(cameraViewConfiguration != null)
		{
			return EMFEcoreFacade.INSTANCE.getID(cameraViewConfiguration);
		}
		else
		{
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CameraViewConfiguration getActiveCameraViewConfiguration(String identifier) 
	{
		CameraViewConfiguration cameraViewConfiguration = null;
		
		if(identifier != null)
		{			
			CameraViewConfigurationList cameraViewConfigurationList = getActiveCameraViewConfigurationList();
			if(cameraViewConfigurationList != null)
			{
				Iterator<CameraViewConfiguration> it = cameraViewConfigurationList.getCameraViewConfigurations().iterator();
				while(cameraViewConfiguration == null && it.hasNext())
				{
					CameraViewConfiguration next = it.next();				
					if(getCameraViewConfigurationIdentifier(next).compareTo(identifier) == 0)
					{
						cameraViewConfiguration = next;
					}
				}
			}
		}		
		
		return cameraViewConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CameraViewConfigurationList getActiveCameraViewConfigurationList() 
	{
		CameraViewConfigurationList cameraViewConfigurationList = null;
		
		InvocatorSession session = EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if(session != null)
		{
			ToolsList toolsList = session.getToolsList();
			if(toolsList != null)
			{
				Iterator<AbstractToolsListContainer> it = toolsList.getToolsListContainers().iterator();
				while(cameraViewConfigurationList == null && it.hasNext())
				{
					AbstractToolsListContainer abstractToolsListContainer = it.next();
					if(abstractToolsListContainer instanceof CameraViewConfigurationList)
					{
						cameraViewConfigurationList = (CameraViewConfigurationList) abstractToolsListContainer;
					}
				}
			}
		}
		
		return cameraViewConfigurationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_VIEW_UTILITIES___GET_CAMERA_VIEW_CONFIGURATION_IDENTIFIER__CAMERAVIEWCONFIGURATION:
				return getCameraViewConfigurationIdentifier((CameraViewConfiguration)arguments.get(0));
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_VIEW_UTILITIES___GET_ACTIVE_CAMERA_VIEW_CONFIGURATION__STRING:
				return getActiveCameraViewConfiguration((String)arguments.get(0));
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_VIEW_UTILITIES___GET_ACTIVE_CAMERA_VIEW_CONFIGURATION_LIST:
				return getActiveCameraViewConfigurationList();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CameraViewUtilitiesImpl
