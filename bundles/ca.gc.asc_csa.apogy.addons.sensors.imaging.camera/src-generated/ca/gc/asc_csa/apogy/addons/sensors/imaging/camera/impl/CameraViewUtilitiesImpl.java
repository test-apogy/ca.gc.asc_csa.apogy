package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfigurationList;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewUtilities;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ToolsList;

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
		return ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_UTILITIES;
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
			return ApogyCommonEMFFacade.INSTANCE.getID(cameraViewConfiguration);
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
		
		InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
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
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_UTILITIES___GET_CAMERA_VIEW_CONFIGURATION_IDENTIFIER__CAMERAVIEWCONFIGURATION:
				return getCameraViewConfigurationIdentifier((CameraViewConfiguration)arguments.get(0));
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_UTILITIES___GET_ACTIVE_CAMERA_VIEW_CONFIGURATION__STRING:
				return getActiveCameraViewConfiguration((String)arguments.get(0));
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_UTILITIES___GET_ACTIVE_CAMERA_VIEW_CONFIGURATION_LIST:
				return getActiveCameraViewConfigurationList();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CameraViewUtilitiesImpl
