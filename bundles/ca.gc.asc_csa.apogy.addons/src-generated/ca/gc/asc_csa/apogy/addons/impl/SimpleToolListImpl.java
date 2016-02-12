package ca.gc.asc_csa.apogy.addons.impl;
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

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.addons.SimpleTool;
import ca.gc.asc_csa.apogy.addons.SimpleToolList;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.addons.Activator;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.core.invocator.impl.AbstractToolsListContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Tool List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.SimpleToolListImpl#getSimpleTools <em>Simple Tools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleToolListImpl extends AbstractToolsListContainerImpl implements SimpleToolList 
{
	private Adapter adapter = null;
	
	/**
	 * The cached value of the '{@link #getSimpleTools() <em>Simple Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleTools()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleTool> simpleTools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected SimpleToolListImpl() 
	{
		super();
		
		this.eAdapters().add(getAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsPackage.Literals.SIMPLE_TOOL_LIST;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleTool> getSimpleTools() {
		if (simpleTools == null) {
			simpleTools = new EObjectContainmentWithInverseEList<SimpleTool>(SimpleTool.class, this, ApogyAddonsPackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS, ApogyAddonsPackage.SIMPLE_TOOL__TOOL_LIST);
		}
		return simpleTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsPackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSimpleTools()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsPackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				return ((InternalEList<?>)getSimpleTools()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsPackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				return getSimpleTools();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyAddonsPackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				getSimpleTools().clear();
				getSimpleTools().addAll((Collection<? extends SimpleTool>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyAddonsPackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				getSimpleTools().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyAddonsPackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
				return simpleTools != null && !simpleTools.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	private Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof SimpleToolList)
					{												
						int featureId = msg.getFeatureID(SimpleToolList.class);
																								
						switch(featureId)
						{						
							case ApogyAddonsPackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS:
							{
								switch(msg.getEventType())
								{
									case Notification.ADD:
									{
										if(msg.getNewValue() instanceof SimpleTool)
										{
											SimpleTool simpleTool = (SimpleTool) msg.getNewValue();
											System.err.println("-------> Added " + simpleTool);
											
											try
											{
												simpleTool.initialise();
											}
											catch(Exception e)
											{
												e.printStackTrace();
												Logger.INSTANCE.log(Activator.ID, this, "Exception occured during SimpleTool initialise() !", EventSeverity.ERROR);
											}
										}
									}
									break;
									
									case Notification.ADD_MANY:
									{
										if(msg.getNewValue() instanceof List)
										{
											@SuppressWarnings("unchecked")
											List<SimpleTool> tools = (List<SimpleTool>) msg.getNewValue();
											for(SimpleTool simpleTool : tools)
											{
												try
												{
													simpleTool.initialise();
												}
												catch(Exception e)
												{
													e.printStackTrace();
													Logger.INSTANCE.log(Activator.ID, this, "Exception occured during SimpleTool initialise() !", EventSeverity.ERROR);
												}												
											}
										}
									}
								
									case Notification.REMOVE:
									{
										if(msg.getOldValue() instanceof SimpleTool)
										{
											SimpleTool simpleTool = (SimpleTool) msg.getOldValue();
											
											try
											{
												simpleTool.dispose();
											}
											catch(Exception e)
											{
												e.printStackTrace();
												Logger.INSTANCE.log(Activator.ID, this, "Exception occured during SimpleTool dispose() !", EventSeverity.ERROR);
											}											
										}
									}
									break;
									
									case Notification.REMOVE_MANY:
									{
										if(msg.getOldValue() instanceof List)
										{
											@SuppressWarnings("unchecked")
											List<SimpleTool> tools = (List<SimpleTool>) msg.getOldValue();
											for(SimpleTool simpleTool : tools)
											{
												try
												{
													simpleTool.dispose();
												}
												catch(Exception e)
												{
													e.printStackTrace();
													Logger.INSTANCE.log(Activator.ID, this, "Exception occured during SimpleTool dispose() !", EventSeverity.ERROR);
												}												
											}
										}
									}									
								}
								
							}
							break;
						}
					}
				}
			};
		}
		
		return adapter;
	}

} //SimpleToolListImpl
