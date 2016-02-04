package ca.gc.asc_csa.apogy.common.topology.ui.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import ca.gc.asc_csa.apogy.common.topology.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.adapters.URLNodeSceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.preferences.PreferencesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URL Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.URLNodePresentationImpl#isAxisVisible <em>Axis Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.URLNodePresentationImpl#getAxisLength <em>Axis Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.URLNodePresentationImpl#getPresentationMode <em>Presentation Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URLNodePresentationImpl extends NodePresentationImpl implements URLNodePresentation {
	/**
	 * The default value of the '{@link #isAxisVisible() <em>Axis Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAxisVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AXIS_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAxisVisible() <em>Axis Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAxisVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean axisVisible = AXIS_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAxisLength() <em>Axis Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLength()
	 * @generated
	 * @ordered
	 */
	protected static final double AXIS_LENGTH_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getAxisLength() <em>Axis Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLength()
	 * @generated
	 * @ordered
	 */
	protected double axisLength = AXIS_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentationMode() <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationMode()
	 * @generated
	 * @ordered
	 */
	protected static final MeshPresentationMode PRESENTATION_MODE_EDEFAULT = MeshPresentationMode.SURFACE;

	/**
	 * The cached value of the '{@link #getPresentationMode() <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationMode()
	 * @generated
	 * @ordered
	 */
	protected MeshPresentationMode presentationMode = PRESENTATION_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLNodePresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyUIPackage.Literals.URL_NODE_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAxisVisible() {
		return axisVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisVisible(boolean newAxisVisible) {
		boolean oldAxisVisible = axisVisible;
		axisVisible = newAxisVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE, oldAxisVisible, axisVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAxisLength() {
		return axisLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisLength(double newAxisLength) {
		double oldAxisLength = axisLength;
		axisLength = newAxisLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGTH, oldAxisLength, axisLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshPresentationMode getPresentationMode() {
		return presentationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationMode(MeshPresentationMode newPresentationMode) {
		MeshPresentationMode oldPresentationMode = presentationMode;
		presentationMode = newPresentationMode == null ? PRESENTATION_MODE_EDEFAULT : newPresentationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE, oldPresentationMode, presentationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE:
				return isAxisVisible();
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGTH:
				return getAxisLength();
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE:
				return getPresentationMode();
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
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible((Boolean)newValue);
				return;
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGTH:
				setAxisLength((Double)newValue);
				return;
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode((MeshPresentationMode)newValue);
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
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible(AXIS_VISIBLE_EDEFAULT);
				return;
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGTH:
				setAxisLength(AXIS_LENGTH_EDEFAULT);
				return;
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode(PRESENTATION_MODE_EDEFAULT);
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
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE:
				return axisVisible != AXIS_VISIBLE_EDEFAULT;
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGTH:
				return axisLength != AXIS_LENGTH_EDEFAULT;
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE:
				return presentationMode != PRESENTATION_MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (axisVisible: ");
		result.append(axisVisible);
		result.append(", axisLength: ");
		result.append(axisLength);
		result.append(", presentationMode: ");
		result.append(presentationMode);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void initialSceneObject() 
	{
		if (getSceneObject() instanceof URLNodeSceneObject) 
		{
			URLNodeSceneObject object = (URLNodeSceneObject) getSceneObject();
			object.setAxisVisible(isAxisVisible());
			object.setAxisLength(getAxisLength());
			object.setPresentationMode(getPresentationMode());
		}
		super.initialSceneObject();
	}
	
	@Override
	protected void updateSceneObject(Notification notification) 
	{
		if (getSceneObject() instanceof URLNodeSceneObject) 
		{							
			URLNodeSceneObject object = (URLNodeSceneObject) getSceneObject();

			if (notification.getFeatureID(URLNodePresentation.class) == ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_VISIBLE) 
			{
				object.setAxisVisible(isAxisVisible());
			}
			else if(notification.getFeatureID(URLNodePresentation.class) == ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__AXIS_LENGTH)
			{
				object.setAxisLength(getAxisLength());
			}
			else if(notification.getFeatureID(URLNodePresentation.class) == ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION__PRESENTATION_MODE)
			{
				object.setPresentationMode(getPresentationMode());
			}
		}
		
		super.updateSceneObject(notification);
	}
	
	@Override
	protected void applyPreferences() {
	
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		// Change axis visibility.
		setAxisVisible(store.getBoolean(PreferencesConstants.DEFAULT_URL_NODE_AXIS_VISIBILITY_ID));
		
		// Change axis length.
		setAxisLength(store.getDouble(PreferencesConstants.DEFAULT_URL_NODE_AXIS_LENGTH_ID));
		
		super.applyPreferences();
	}

} //URLNodePresentationImpl
