package ca.gc.asc_csa.apogy.addons.sensors.range.ui.impl;
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
import ca.gc.asc_csa.apogy.addons.sensors.range.ui.ApogyAddonsSensorsRangeUIPackage;
import ca.gc.asc_csa.apogy.addons.sensors.range.ui.RasterScanDataPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.range.ui.scene_objects.RasterScanDataSceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raster Scan Data Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.ui.impl.RasterScanDataPresentationImpl#getFovPresentationMode <em>Fov Presentation Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.ui.impl.RasterScanDataPresentationImpl#isFovVisible <em>Fov Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.ui.impl.RasterScanDataPresentationImpl#isDataVisible <em>Data Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RasterScanDataPresentationImpl extends NodePresentationImpl implements RasterScanDataPresentation
{
	/**
	 * The default value of the '{@link #getFovPresentationMode() <em>Fov Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFovPresentationMode()
	 * @generated
	 * @ordered
	 */
	protected static final MeshPresentationMode FOV_PRESENTATION_MODE_EDEFAULT = MeshPresentationMode.WIREFRAME;

	/**
	 * The cached value of the '{@link #getFovPresentationMode() <em>Fov Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFovPresentationMode()
	 * @generated
	 * @ordered
	 */
	protected MeshPresentationMode fovPresentationMode = FOV_PRESENTATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFovVisible() <em>Fov Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFovVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOV_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFovVisible() <em>Fov Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFovVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean fovVisible = FOV_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDataVisible() <em>Data Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDataVisible() <em>Data Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean dataVisible = DATA_VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RasterScanDataPresentationImpl()
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
		return ApogyAddonsSensorsRangeUIPackage.Literals.RASTER_SCAN_DATA_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshPresentationMode getFovPresentationMode()
	{
		return fovPresentationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFovPresentationMode(MeshPresentationMode newFovPresentationMode)
	{
		MeshPresentationMode oldFovPresentationMode = fovPresentationMode;
		fovPresentationMode = newFovPresentationMode == null ? FOV_PRESENTATION_MODE_EDEFAULT : newFovPresentationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_PRESENTATION_MODE, oldFovPresentationMode, fovPresentationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFovVisible()
	{
		return fovVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFovVisible(boolean newFovVisible)
	{
		boolean oldFovVisible = fovVisible;
		fovVisible = newFovVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_VISIBLE, oldFovVisible, fovVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataVisible()
	{
		return dataVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataVisible(boolean newDataVisible)
	{
		boolean oldDataVisible = dataVisible;
		dataVisible = newDataVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__DATA_VISIBLE, oldDataVisible, dataVisible));
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
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_PRESENTATION_MODE:
				return getFovPresentationMode();
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_VISIBLE:
				return isFovVisible();
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__DATA_VISIBLE:
				return isDataVisible();
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
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_PRESENTATION_MODE:
				setFovPresentationMode((MeshPresentationMode)newValue);
				return;
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_VISIBLE:
				setFovVisible((Boolean)newValue);
				return;
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__DATA_VISIBLE:
				setDataVisible((Boolean)newValue);
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
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_PRESENTATION_MODE:
				setFovPresentationMode(FOV_PRESENTATION_MODE_EDEFAULT);
				return;
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_VISIBLE:
				setFovVisible(FOV_VISIBLE_EDEFAULT);
				return;
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__DATA_VISIBLE:
				setDataVisible(DATA_VISIBLE_EDEFAULT);
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
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_PRESENTATION_MODE:
				return fovPresentationMode != FOV_PRESENTATION_MODE_EDEFAULT;
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_VISIBLE:
				return fovVisible != FOV_VISIBLE_EDEFAULT;
			case ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__DATA_VISIBLE:
				return dataVisible != DATA_VISIBLE_EDEFAULT;
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
		result.append(" (fovPresentationMode: ");
		result.append(fovPresentationMode);
		result.append(", fovVisible: ");
		result.append(fovVisible);
		result.append(", dataVisible: ");
		result.append(dataVisible);
		result.append(')');
		return result.toString();
	}
	

	@Override
	protected void updateSceneObject(Notification notification)
	{
		RasterScanDataSceneObject j3DObject = (RasterScanDataSceneObject) getSceneObject();
		if(notification.getFeatureID( RasterScanDataPresentation.class) == ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__DATA_VISIBLE)
		{
			j3DObject.setDataVisible(notification.getNewBooleanValue());
		}
		else if(notification.getFeatureID( RasterScanDataPresentation.class) == ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_VISIBLE)
		{
			j3DObject.setFovVisible(notification.getNewBooleanValue());
		}
		else if(notification.getFeatureID( RasterScanDataPresentation.class) == ApogyAddonsSensorsRangeUIPackage.RASTER_SCAN_DATA_PRESENTATION__FOV_PRESENTATION_MODE)
		{
			MeshPresentationMode meshPresentationMode = (MeshPresentationMode) notification.getNewValue();
			j3DObject.setFovMeshPresentationMode(meshPresentationMode);
		}
		super.updateSceneObject(notification);
	}
	
} //RasterScanDataPresentationImpl
