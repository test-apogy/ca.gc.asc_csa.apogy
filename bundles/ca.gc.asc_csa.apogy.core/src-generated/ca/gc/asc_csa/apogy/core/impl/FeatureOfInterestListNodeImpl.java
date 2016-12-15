package ca.gc.asc_csa.apogy.core.impl;
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
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.impl.AggregateGroupNodeImpl;
import ca.gc.asc_csa.apogy.core.Activator;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestList;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestListNode;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Of Interest List Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestListNodeImpl#getFeatureOfInterestList <em>Feature Of Interest List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureOfInterestListNodeImpl extends AggregateGroupNodeImpl implements FeatureOfInterestListNode 
{
	private Map<FeatureOfInterest, FeatureOfInterestNode> foiToNodeMap = new HashMap<FeatureOfInterest, FeatureOfInterestNode>();
	private Adapter adapter;
	
	/**
	 * The cached value of the '{@link #getFeatureOfInterestList() <em>Feature Of Interest List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterestList()
	 * @generated
	 * @ordered
	 */
	protected FeatureOfInterestList featureOfInterestList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureOfInterestListNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCorePackage.Literals.FEATURE_OF_INTEREST_LIST_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestList getFeatureOfInterestList() {
		if (featureOfInterestList != null && featureOfInterestList.eIsProxy()) {
			InternalEObject oldFeatureOfInterestList = (InternalEObject)featureOfInterestList;
			featureOfInterestList = (FeatureOfInterestList)eResolveProxy(oldFeatureOfInterestList);
			if (featureOfInterestList != oldFeatureOfInterestList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCorePackage.FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST, oldFeatureOfInterestList, featureOfInterestList));
			}
		}
		return featureOfInterestList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestList basicGetFeatureOfInterestList() {
		return featureOfInterestList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFeatureOfInterestList(FeatureOfInterestList newFeatureOfInterestList) 
	{
		FeatureOfInterestList oldList = getFeatureOfInterestList();

		setFeatureOfInterestListGen(newFeatureOfInterestList);

		updateFeatureOfInterestList(oldList, newFeatureOfInterestList);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOfInterestListGen(FeatureOfInterestList newFeatureOfInterestList) {
		FeatureOfInterestList oldFeatureOfInterestList = featureOfInterestList;
		featureOfInterestList = newFeatureOfInterestList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST, oldFeatureOfInterestList, featureOfInterestList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCorePackage.FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST:
				if (resolve) return getFeatureOfInterestList();
				return basicGetFeatureOfInterestList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCorePackage.FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST:
				setFeatureOfInterestList((FeatureOfInterestList)newValue);
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
			case ApogyCorePackage.FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST:
				setFeatureOfInterestList((FeatureOfInterestList)null);
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
			case ApogyCorePackage.FEATURE_OF_INTEREST_LIST_NODE__FEATURE_OF_INTEREST_LIST:
				return featureOfInterestList != null;
		}
		return super.eIsSet(featureID);
	}

	protected void addFeatureOfInterest(FeatureOfInterest foi)
	{				
		// Created FeatureOfInterestNode.
		FeatureOfInterestNode featureOfInterestNode = ApogyCoreFactory.eINSTANCE.createFeatureOfInterestNode(); 
		featureOfInterestNode.setFeatureOfInterest(foi);
			
		// Adds node to the map.
		foiToNodeMap.put(foi, featureOfInterestNode);
		
		// Attaches the FeatureOfInterestNode to this node.
		getChildren().add(featureOfInterestNode);				
	}

	protected void removeFeatureOfInterest(FeatureOfInterest foi)
	{
		// Retrieves the ResultNode associated with the PositionedResult
		FeatureOfInterestNode featureOfInterestNode = foiToNodeMap.get(foi);

		if (featureOfInterestNode != null) 
		{						
			getChildren().remove(featureOfInterestNode);

			Logger.INSTANCE.log(Activator.ID, this,"Removed FeatureOfInterest named <"+ foi.getName() + ">.",EventSeverity.INFO);
		}
				
	}
	
	protected void updateFeatureOfInterest(FeatureOfInterest foi)
	{						
	}
	
	protected void clearTopology() 
	{
		getChildren().clear();
		foiToNodeMap.clear();
	}

	protected void updateFeatureOfInterestList(FeatureOfInterestList oldList, FeatureOfInterestList newList) 
	{
		// Clears topology
		clearTopology();

		if (oldList != null) 
		{
			oldList.eAdapters().remove(getAdapter());
		}

		if (newList != null) 
		{						
			newList.eAdapters().add(getAdapter());

			for (FeatureOfInterest foi : newList.getFeaturesOfInterest()) 
			{
				addFeatureOfInterest(foi);
			}
		}
	}

	protected Adapter getAdapter() 
	{
		if (adapter == null) 
		{
			adapter = new AdapterImpl() 
			{
				@SuppressWarnings("unchecked")
				@Override
				public void notifyChanged(Notification msg) 
				{
					if (msg.getNotifier() instanceof FeatureOfInterestList) 
					{
						if (msg.getFeatureID(FeatureOfInterestList.class) == ApogyCorePackage.FEATURE_OF_INTEREST_LIST__FEATURES_OF_INTEREST) 
						{
							switch (msg.getEventType()) 
							{
								case Notification.ADD: 
								{
									FeatureOfInterest foi = (FeatureOfInterest) msg.getNewValue();
									addFeatureOfInterest(foi);
									break;
								}
								case Notification.ADD_MANY: 
								{
									Collection<? extends FeatureOfInterest> resultsAdded = (Collection<? extends FeatureOfInterest>) msg.getNewValue();
									for (FeatureOfInterest foi : resultsAdded) 
									{
										addFeatureOfInterest(foi);
									}
									break;
								}
								case Notification.REMOVE: 
								{
									FeatureOfInterest foi = (FeatureOfInterest) msg	.getOldValue();
									removeFeatureOfInterest(foi);
									break;
								}
								case Notification.REMOVE_MANY: {
									Collection<? extends FeatureOfInterest> resultsRemoved = (Collection<? extends FeatureOfInterest>) msg
											.getOldValue();
									for (FeatureOfInterest foi : resultsRemoved) 
									{
										removeFeatureOfInterest(foi);
									}
									break;
								}
								default: {
								}
							}
						}
					}					
				}
			};
		}

		return adapter;
	}
} //FeatureOfInterestListNodeImpl
