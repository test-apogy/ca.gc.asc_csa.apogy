/**
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
 * 	Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.common.emf.impl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.FeaturePathAdapter;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Path Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.FeaturePathAdapterImpl#getEObjectAdaptersMap <em>EObject Adapters Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.FeaturePathAdapterImpl#getFeaturePath <em>Feature Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeaturePathAdapterImpl extends MinimalEObjectImpl.Container implements FeaturePathAdapter {
	/**
	 * The cached value of the '{@link #getEObjectAdaptersMap() <em>EObject Adapters Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObjectAdaptersMap()
	 * @generated
	 * @ordered
	 */
	protected HashMap<EObject, Adapter> eObjectAdaptersMap;

	/**
	 * The cached value of the '{@link #getFeaturePath() <em>Feature Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturePath()
	 * @generated
	 * @ordered
	 */
	protected List<? extends EStructuralFeature> featurePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturePathAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEMFPackage.Literals.FEATURE_PATH_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public HashMap<EObject, Adapter> getEObjectAdaptersMap() {
		if(eObjectAdaptersMap == null){
			eObjectAdaptersMap = new HashMap<>();
		}
		return getEObjectAdaptersMapGen();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public HashMap<EObject, Adapter> getEObjectAdaptersMapGen() {
		return eObjectAdaptersMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEObjectAdaptersMap(HashMap<EObject, Adapter> newEObjectAdaptersMap) {
		HashMap<EObject, Adapter> oldEObjectAdaptersMap = eObjectAdaptersMap;
		eObjectAdaptersMap = newEObjectAdaptersMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER__EOBJECT_ADAPTERS_MAP, oldEObjectAdaptersMap, eObjectAdaptersMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public List<? extends EStructuralFeature> getFeaturePath();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<? extends EStructuralFeature> getFeaturePathGen() {
		return featurePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturePath(List<? extends EStructuralFeature> newFeaturePath) {
		List<? extends EStructuralFeature> oldFeaturePath = featurePath;
		featurePath = newFeaturePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER__FEATURE_PATH, oldFeaturePath, featurePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void notifyAdapterOnFeatureChanged(Notification msg) {
		if (getFeaturePath().contains(msg.getFeature())) {
			List<EStructuralFeature> nextFeaturePath = new ArrayList<>();
			nextFeaturePath.addAll(featurePath);

			for (int i = 0; i < getFeaturePath().indexOf(msg.getFeature()); i++) {
				nextFeaturePath.remove(0);
			}

			if (msg.getOldValue() != null && msg.getOldValue() instanceof EObject && msg.getNewValue() != msg.getOldValue()) {
				System.out.println(((EObject)msg.getOldValue()).eAdapters().size());
				ApogyCommonEMFFacade.INSTANCE.removeAdaptersOnFeaturePath(this, (EObject) msg.getOldValue(),
						nextFeaturePath);
				System.out.println(((EObject)msg.getOldValue()).eAdapters().size());
			}
			if (msg.getNewValue() != null && msg.getNewValue() instanceof EObject
					&& !getEObjectAdaptersMap().containsKey(msg.getNewValue())) {
				nextFeaturePath.remove(0);
				ApogyCommonEMFFacade.INSTANCE.addAdaptersOnFeaturePath(this, (EObject) msg.getNewValue(),
						nextFeaturePath);
			}

			notifyChanged(msg);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public void notifyChanged(Notification msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER__EOBJECT_ADAPTERS_MAP:
				return getEObjectAdaptersMap();
			case ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER__FEATURE_PATH:
				return getFeaturePath();
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
			case ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER__EOBJECT_ADAPTERS_MAP:
				setEObjectAdaptersMap((HashMap<EObject, Adapter>)newValue);
				return;
			case ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER__FEATURE_PATH:
				setFeaturePath((List<? extends EStructuralFeature>)newValue);
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
			case ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER__EOBJECT_ADAPTERS_MAP:
				setEObjectAdaptersMap((HashMap<EObject, Adapter>)null);
				return;
			case ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER__FEATURE_PATH:
				setFeaturePath((List<? extends EStructuralFeature>)null);
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
			case ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER__EOBJECT_ADAPTERS_MAP:
				return eObjectAdaptersMap != null;
			case ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER__FEATURE_PATH:
				return featurePath != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER___NOTIFY_ADAPTER_ON_FEATURE_CHANGED__NOTIFICATION:
				notifyAdapterOnFeatureChanged((Notification)arguments.get(0));
				return null;
			case ApogyCommonEMFPackage.FEATURE_PATH_ADAPTER___NOTIFY_CHANGED__NOTIFICATION:
				notifyChanged((Notification)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (eObjectAdaptersMap: ");
		result.append(eObjectAdaptersMap);
		result.append(", featurePath: ");
		result.append(featurePath);
		result.append(')');
		return result.toString();
	}

} //FeaturePathAdapterImpl
