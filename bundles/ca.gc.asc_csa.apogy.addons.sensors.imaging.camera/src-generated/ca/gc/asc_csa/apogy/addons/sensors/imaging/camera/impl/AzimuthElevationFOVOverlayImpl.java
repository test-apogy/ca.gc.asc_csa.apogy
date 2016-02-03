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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImagingUtilities;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.OverlayAlignment;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Azimuth Elevation FOV Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AzimuthElevationFOVOverlayImpl extends FOVOverlayImpl implements AzimuthElevationFOVOverlay 
{
	protected double azimuth = 0;
	protected double elevation = 0;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AzimuthElevationFOVOverlayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsImagingCameraPackage.Literals.AZIMUTH_ELEVATION_FOV_OVERLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void changeAzimuth(double azimuth) 
	{
		this.azimuth = azimuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void changeElevation(double elevation) 
	{
		this.elevation = elevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsSensorsImagingCameraPackage.AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_AZIMUTH__DOUBLE:
				changeAzimuth((Double)arguments.get(0));
				return null;
			case ApogyAddonsSensorsImagingCameraPackage.AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_ELEVATION__DOUBLE:
				changeElevation((Double)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public AbstractEImage applyOverlay(AbstractCamera camera,
			AbstractEImage cameraImage, OverlayAlignment overlayAlignment,
			int overlayWidth, int overlayHeight) 
	{
		RectangularFrustrumFieldOfView fov = camera.getFieldOfView();
		double horizontalFOVAngle = Math.toDegrees(fov.getHorizontalFieldOfViewAngle());
		double verticalFOVAngle = Math.toDegrees(fov.getVerticalFieldOfViewAngle());
				
		AbstractEImage overlayImage = ImagingUtilities.INSTANCE.getAzimuthElevationOverlay(overlayWidth, overlayHeight, azimuth, elevation, horizontalFOVAngle, verticalFOVAngle, getAzimuthDirection(), getElevationDirection(), getAngleInterval(), getFontName(), getFontSize(), getColorOfPositive(), getColorOfNegative(), getLineWidth());
		
		AbstractEImage result = EImagesUtilities.INSTANCE.applyOverlay(cameraImage, overlayImage, false);
		
		return result;
	}
	
	@Override
	public String getToolTipText(AbstractCamera camera,	ImageSnapshot imageSnapshot, int mouseButton, int x, int y) 
	{
		String text = null;
		
		if(imageSnapshot != null)
		{		
			double hDelta = Math.toDegrees(imageSnapshot.convertToHorizontalAngle(x));
			double vDelta = Math.toDegrees(imageSnapshot.convertToVerticalAngle(y));
			
			double hAngle = 0;
			double vAngle = 0;
			
			if(getAzimuthDirection() == AzimuthDirection.POSITIVE_TOWARD_RIGHT)
			{
				hAngle = azimuth - hDelta;
			}
			else
			{
				hAngle = azimuth + hDelta;
			}
			
			if(getElevationDirection() == ElevationDirection.POSITIVE_DOWN)
			{
				vAngle = elevation - vDelta;
			}
			else
			{
				vAngle = elevation + vDelta;
			}
			
			text = angleFormat.format(hAngle) + "°, " + angleFormat.format(vAngle) + "°";
		}
		
		return text;
	}
} //AzimuthElevationFOVOverlayImpl
