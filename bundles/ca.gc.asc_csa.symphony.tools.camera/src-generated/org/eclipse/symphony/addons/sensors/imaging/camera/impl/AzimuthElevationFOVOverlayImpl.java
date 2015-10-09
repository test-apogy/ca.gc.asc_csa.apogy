/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.sensors.imaging.camera.AzimuthElevationFOVOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment;
import org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;

import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;
import ca.gc.space.mrt.sensors.imaging.AzimuthDirection;
import ca.gc.space.mrt.sensors.imaging.ElevationDirection;
import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;
import ca.gc.space.mrt.sensors.imaging.ImagingUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Azimuth Elevation FOV Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
		return SymphonyCameraToolsPackage.Literals.AZIMUTH_ELEVATION_FOV_OVERLAY;
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
			case SymphonyCameraToolsPackage.AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_AZIMUTH__DOUBLE:
				changeAzimuth((Double)arguments.get(0));
				return null;
			case SymphonyCameraToolsPackage.AZIMUTH_ELEVATION_FOV_OVERLAY___CHANGE_ELEVATION__DOUBLE:
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
