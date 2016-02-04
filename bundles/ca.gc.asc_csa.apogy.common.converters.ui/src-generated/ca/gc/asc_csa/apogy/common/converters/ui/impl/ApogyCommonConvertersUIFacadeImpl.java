package ca.gc.asc_csa.apogy.common.converters.ui.impl;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonConvertersUIFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonConvertersUIFacade {
	
	private static ApogyCommonConvertersUIFacade instance = null;
	
	public static ApogyCommonConvertersUIFacade getInstance()
	{
		if (instance == null)
		{
			instance = new ApogyCommonConvertersUIFacadeImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonConvertersUIFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonConvertersUIPackage.Literals.APOGY_COMMON_CONVERTERS_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public List<Object> convert(ISelection selection, Class<?> targetType)
	{
		synchronized (ApogyCommonConvertersFacade.INSTANCE)
		{
			List<Object> results = new ArrayList<Object>();
					 
			if (selection != null && targetType != null)
			{
				// First, tries to convert the selection directly.
				Object result = null;
				
				try
				{
					result = ApogyCommonConvertersFacade.INSTANCE.convert((Object) selection, targetType);
				}
				catch (Exception e)
				{
					
				}
					
				if (result != null)
				{
					results.add(result);
				}
				else
				{
					if (selection instanceof IStructuredSelection)
					{
						IStructuredSelection structuredSelection = (IStructuredSelection) selection;

						// If the selection is not empty.
						if (!structuredSelection.isEmpty())
						{
							Iterator<?> it = structuredSelection.toList().iterator();
								
							while (it.hasNext())
							{
								Object element = it.next();

								try
								{
									// If the selection content is already of the required type, just return it.
									if (targetType.isAssignableFrom(element.getClass()))
									{
										results.add(element);
									}
									else
									{
										// Tries to convert the element.
										Object output = ApogyCommonConvertersFacade.INSTANCE.convert(element, targetType);

										/* If no direct conversion from ISelection exist, tries to convert
										 * the first element of the selection if applicable.*/
										if (output != null)
										{
											results.add(output);
										}
									}
								}
								catch (Throwable t)
								{
									// Do nothing
								}
							}
						}
					}
				}
			}
				
			return results;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonConvertersUIPackage.APOGY_COMMON_CONVERTERS_UI_FACADE___CONVERT__ISELECTION_CLASS:
				return convert((ISelection)arguments.get(0), (Class<?>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyCommonConvertersUIFacadeImpl
