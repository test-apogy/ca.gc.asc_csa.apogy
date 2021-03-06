package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.impl;
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

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.CircularExclusionZonePresentation;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.ApogyAddonsMobilityPathplannersUIPackage;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.scene_objects.CircularExclusionZoneSceneObject;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circular Exclusion Zone Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.impl.CircularExclusionZonePresentationImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.impl.CircularExclusionZonePresentationImpl#getPresentationMode <em>Presentation Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.impl.CircularExclusionZonePresentationImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */

public class CircularExclusionZonePresentationImpl extends NodePresentationImpl implements CircularExclusionZonePresentation
{
	/**
	 * The default value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSPARENCY_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected float transparency = TRANSPARENCY_EDEFAULT;
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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 10.0;
	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircularExclusionZonePresentationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyAddonsMobilityPathplannersUIPackage.Literals.CIRCULAR_EXCLUSION_ZONE_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTransparency()
	{
		return transparency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparency(float newTransparency)
	{
		float oldTransparency = transparency;
		transparency = newTransparency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__TRANSPARENCY, oldTransparency, transparency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshPresentationMode getPresentationMode()
	{
		return presentationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationMode(MeshPresentationMode newPresentationMode)
	{
		MeshPresentationMode oldPresentationMode = presentationMode;
		presentationMode = newPresentationMode == null ? PRESENTATION_MODE_EDEFAULT : newPresentationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__PRESENTATION_MODE, oldPresentationMode, presentationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight()
	{
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight)
	{
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__TRANSPARENCY:
				return getTransparency();
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__PRESENTATION_MODE:
				return getPresentationMode();
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__HEIGHT:
				return getHeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__TRANSPARENCY:
				setTransparency((Float)newValue);
				return;
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode((MeshPresentationMode)newValue);
				return;
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__HEIGHT:
				setHeight((Double)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__TRANSPARENCY:
				setTransparency(TRANSPARENCY_EDEFAULT);
				return;
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode(PRESENTATION_MODE_EDEFAULT);
				return;
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__TRANSPARENCY:
				return transparency != TRANSPARENCY_EDEFAULT;
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__PRESENTATION_MODE:
				return presentationMode != PRESENTATION_MODE_EDEFAULT;
			case ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__HEIGHT:
				return height != HEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (transparency: ");
		result.append(transparency);
		result.append(", presentationMode: ");
		result.append(presentationMode);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}
	
	@Override
	protected void updateSceneObject(Notification notification)
	{
		if (sceneObject != null) 
		{			
			CircularExclusionZoneSceneObject j3dObject = (CircularExclusionZoneSceneObject) sceneObject;				
			
			if (notification.getFeatureID(CircularExclusionZonePresentation.class) == ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__TRANSPARENCY) 
			{
				j3dObject.setTransparency(getTransparency());				
			}
			else if(notification.getFeatureID(CircularExclusionZonePresentation.class) == ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__PRESENTATION_MODE)
			{			
				j3dObject.setPresentationMode(this.getPresentationMode());
			}
			else if(notification.getFeatureID(CircularExclusionZonePresentation.class) == ApogyAddonsMobilityPathplannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION__HEIGHT)
			{			
				j3dObject.setHeight(this.getHeight());
			}
		}
		super.updateSceneObject(notification);
	}		
	
	@Override
	protected void initialSceneObject() 
	{
		CircularExclusionZoneSceneObject obj = (CircularExclusionZoneSceneObject) sceneObject;			
		obj.setHeight(this.getHeight());
		obj.setTransparency(this.getTransparency());		
		obj.setPresentationMode(this.presentationMode);		
		super.initialSceneObject();
	}
	
	
	@Override
	public Tuple3d basicGetCentroid()
	{			
		Point3d point3d = new Point3d();
		if(sceneObject != null)
		{
			point3d = sceneObject.getCentroid();
		}
		
		return ApogyCommonMathFacade.INSTANCE.createTuple3d(point3d);
	}	
} //CircularExclusionZonePresentationImpl
