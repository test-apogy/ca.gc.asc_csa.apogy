/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfigurationList;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewUtilities;
import ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ToolsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth View Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EarthViewUtilitiesImpl extends MinimalEObjectImpl.Container implements EarthViewUtilities 
{
	private static EarthViewUtilities instance = null;
	
	public static EarthViewUtilities getInstance() 
	{
		if (instance == null) 
		{
			instance = new EarthViewUtilitiesImpl();
		}
		return instance;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthViewUtilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthUIPackage.Literals.EARTH_VIEW_UTILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getCameraViewConfigurationIdentifier(EarthViewConfiguration earthViewConfiguration) 
	{
		if(earthViewConfiguration != null)
		{
			return ApogyCommonEMFFacade.INSTANCE.getID(earthViewConfiguration);
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
	public EarthViewConfiguration getActiveEarthViewConfiguration(String identifier) 
	{
		EarthViewConfiguration earthViewConfiguration = null;
		
		if(identifier != null)
		{			
			EarthViewConfigurationList earthViewConfigurationList = getActiveEarthViewConfigurationList();
			if(earthViewConfigurationList != null)
			{
				Iterator<EarthViewConfiguration> it = earthViewConfigurationList.getEarthViewConfigurations().iterator();
				while(earthViewConfiguration == null && it.hasNext())
				{
					EarthViewConfiguration next = it.next();				
					if(getCameraViewConfigurationIdentifier(next).compareTo(identifier) == 0)
					{
						earthViewConfiguration = next;
					}
				}
			}
		}		
		
		return earthViewConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EarthViewConfigurationList getActiveEarthViewConfigurationList() 
	{
		EarthViewConfigurationList earthViewConfigurationList = null;
		
		InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if(session != null)
		{
			ToolsList toolsList = session.getToolsList();
			if(toolsList != null)
			{
				Iterator<AbstractToolsListContainer> it = toolsList.getToolsListContainers().iterator();
				while(earthViewConfigurationList == null && it.hasNext())
				{
					AbstractToolsListContainer abstractToolsListContainer = it.next();
					if(abstractToolsListContainer instanceof EarthViewConfigurationList)
					{
						earthViewConfigurationList = (EarthViewConfigurationList) abstractToolsListContainer;
					}
				}
			}
		}
		
		return earthViewConfigurationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_UTILITIES___GET_CAMERA_VIEW_CONFIGURATION_IDENTIFIER__EARTHVIEWCONFIGURATION:
				return getCameraViewConfigurationIdentifier((EarthViewConfiguration)arguments.get(0));
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_UTILITIES___GET_ACTIVE_EARTH_VIEW_CONFIGURATION__STRING:
				return getActiveEarthViewConfiguration((String)arguments.get(0));
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_UTILITIES___GET_ACTIVE_EARTH_VIEW_CONFIGURATION_LIST:
				return getActiveEarthViewConfigurationList();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EarthViewUtilitiesImpl
