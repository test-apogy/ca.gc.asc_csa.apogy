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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.impl.TransformNodeImpl;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Of Interest Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.FeatureOfInterestNodeImpl#getFeatureOfInterest <em>Feature Of Interest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureOfInterestNodeImpl extends TransformNodeImpl implements FeatureOfInterestNode 
{
	private Adapter adapter = null;
	
	/**
	 * The cached value of the '{@link #getFeatureOfInterest() <em>Feature Of Interest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterest()
	 * @generated
	 * @ordered
	 */
	protected FeatureOfInterest featureOfInterest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureOfInterestNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCorePackage.Literals.FEATURE_OF_INTEREST_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterest getFeatureOfInterest() {
		if (featureOfInterest != null && featureOfInterest.eIsProxy()) {
			InternalEObject oldFeatureOfInterest = (InternalEObject)featureOfInterest;
			featureOfInterest = (FeatureOfInterest)eResolveProxy(oldFeatureOfInterest);
			if (featureOfInterest != oldFeatureOfInterest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST, oldFeatureOfInterest, featureOfInterest));
			}
		}
		return featureOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterest basicGetFeatureOfInterest() {
		return featureOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFeatureOfInterest(FeatureOfInterest newFeatureOfInterest) 
	{
		FeatureOfInterest oldFeatureOfInterest = getFeatureOfInterest();
		
		if(oldFeatureOfInterest != null)
		{
			// Unregister from previous FeatureOfInterest
			oldFeatureOfInterest.eAdapters().remove(getAdapter());
			
			if(oldFeatureOfInterest.getPose() != null)
			{
				oldFeatureOfInterest.getPose().eAdapters().remove(getAdapter());
			}
		}
		
		setFeatureOfInterestGen(newFeatureOfInterest);
		
		if(newFeatureOfInterest != null)
		{
			// Register to new FeatureOfInterest
			newFeatureOfInterest.eAdapters().add(getAdapter());	
			
			if(newFeatureOfInterest.getPose() != null)
			{
				newFeatureOfInterest.getPose().eAdapters().add(getAdapter());
			}
		}				
		
		update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOfInterestGen(FeatureOfInterest newFeatureOfInterest) {
		FeatureOfInterest oldFeatureOfInterest = featureOfInterest;
		featureOfInterest = newFeatureOfInterest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST, oldFeatureOfInterest, featureOfInterest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST:
				if (resolve) return getFeatureOfInterest();
				return basicGetFeatureOfInterest();
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
			case ApogyCorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST:
				setFeatureOfInterest((FeatureOfInterest)newValue);
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
			case ApogyCorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST:
				setFeatureOfInterest((FeatureOfInterest)null);
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
			case ApogyCorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST:
				return featureOfInterest != null;
		}
		return super.eIsSet(featureID);
	}

	private void update()
	{
		FeatureOfInterest foi = getFeatureOfInterest();
		Matrix4x4 pose = ApogyCommonMathFacade.INSTANCE.createIdentityMatrix4x4();
		if(foi != null)
		{
			if(foi.getPose() != null)
			{								
				pose = EcoreUtil.copy(foi.getPose());
			}
		}
		
		setTransformation(pose.asMatrix4d());
	}
	
	private Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification notification) 
				{
					if(notification.getNotifier() instanceof FeatureOfInterest)
					{
						int featureId = notification.getFeatureID(FeatureOfInterest.class);	
						if(featureId == ApogyCorePackage.FEATURE_OF_INTEREST__POSE)
						{
							// Unregister from previous Pose
							if(notification.getOldValue() instanceof Matrix4x4)
							{
								Matrix4x4 oldValue = (Matrix4x4) notification.getOldValue();
								oldValue.eAdapters().remove(getAdapter());
							}
							
							update();
							
							// Register from new Pose
							if(notification.getNewValue() instanceof Matrix4x4)
							{
								Matrix4x4 newValue = (Matrix4x4) notification.getNewValue();
								newValue.eAdapters().add(getAdapter());
							}
						}
					}
					else if(notification.getNotifier() instanceof Matrix4x4)
					{
						update();
					}
				}
			};
		}
		
		return adapter;
	}
} //FeatureOfInterestNodeImpl
