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

import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AzimuthDirection;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ElevationDirection;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImagingUtilities;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.FOVOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.OverlayAlignment;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraFactory;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ToolTipTextProvider;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FOV Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.FOVOverlayImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.FOVOverlayImpl#getPositiveValuesColor <em>Positive Values Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.FOVOverlayImpl#getNegativeValueColor <em>Negative Value Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.FOVOverlayImpl#getAngleInterval <em>Angle Interval</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.FOVOverlayImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.FOVOverlayImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.FOVOverlayImpl#getAzimuthDirection <em>Azimuth Direction</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.FOVOverlayImpl#getElevationDirection <em>Elevation Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FOVOverlayImpl extends DrawnCameraOverlayImpl implements FOVOverlay 
{	
	protected DecimalFormat angleFormat = new DecimalFormat("0.0");
	
	/**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = 2;
	/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositiveValuesColor() <em>Positive Values Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveValuesColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f POSITIVE_VALUES_COLOR_EDEFAULT = (Color3f)ApogyAddonsSensorsImagingCameraFactory.eINSTANCE.createFromString(ApogyAddonsSensorsImagingCameraPackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");
	/**
	 * The cached value of the '{@link #getPositiveValuesColor() <em>Positive Values Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveValuesColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f positiveValuesColor = POSITIVE_VALUES_COLOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getNegativeValueColor() <em>Negative Value Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeValueColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f NEGATIVE_VALUE_COLOR_EDEFAULT = (Color3f)ApogyAddonsSensorsImagingCameraFactory.eINSTANCE.createFromString(ApogyAddonsSensorsImagingCameraPackage.eINSTANCE.getColor3f(), "1.0,0.0,0.0");
	/**
	 * The cached value of the '{@link #getNegativeValueColor() <em>Negative Value Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeValueColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f negativeValueColor = NEGATIVE_VALUE_COLOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getAngleInterval() <em>Angle Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int ANGLE_INTERVAL_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getAngleInterval() <em>Angle Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleInterval()
	 * @generated
	 * @ordered
	 */
	protected int angleInterval = ANGLE_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_EDEFAULT = "SansSerif";
	/**
	 * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected String fontName = FONT_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FONT_SIZE_EDEFAULT = 10;
	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected int fontSize = FONT_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAzimuthDirection() <em>Azimuth Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzimuthDirection()
	 * @generated
	 * @ordered
	 */
	protected static final AzimuthDirection AZIMUTH_DIRECTION_EDEFAULT = AzimuthDirection.POSITIVE_TOWARD_LEFT;
	/**
	 * The cached value of the '{@link #getAzimuthDirection() <em>Azimuth Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzimuthDirection()
	 * @generated
	 * @ordered
	 */
	protected AzimuthDirection azimuthDirection = AZIMUTH_DIRECTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getElevationDirection() <em>Elevation Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ElevationDirection ELEVATION_DIRECTION_EDEFAULT = ElevationDirection.POSITIVE_UP;
	/**
	 * The cached value of the '{@link #getElevationDirection() <em>Elevation Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationDirection()
	 * @generated
	 * @ordered
	 */
	protected ElevationDirection elevationDirection = ELEVATION_DIRECTION_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FOVOverlayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsImagingCameraPackage.Literals.FOV_OVERLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__LINE_WIDTH, oldLineWidth, lineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getPositiveValuesColor() {
		return positiveValuesColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveValuesColor(Color3f newPositiveValuesColor) {
		Color3f oldPositiveValuesColor = positiveValuesColor;
		positiveValuesColor = newPositiveValuesColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__POSITIVE_VALUES_COLOR, oldPositiveValuesColor, positiveValuesColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getNegativeValueColor() {
		return negativeValueColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegativeValueColor(Color3f newNegativeValueColor) {
		Color3f oldNegativeValueColor = negativeValueColor;
		negativeValueColor = newNegativeValueColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__NEGATIVE_VALUE_COLOR, oldNegativeValueColor, negativeValueColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAngleInterval() {
		return angleInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleInterval(int newAngleInterval) {
		int oldAngleInterval = angleInterval;
		angleInterval = newAngleInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__ANGLE_INTERVAL, oldAngleInterval, angleInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontName() {
		return fontName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontName(String newFontName) {
		String oldFontName = fontName;
		fontName = newFontName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__FONT_NAME, oldFontName, fontName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(int newFontSize) {
		int oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzimuthDirection getAzimuthDirection() {
		return azimuthDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzimuthDirection(AzimuthDirection newAzimuthDirection) {
		AzimuthDirection oldAzimuthDirection = azimuthDirection;
		azimuthDirection = newAzimuthDirection == null ? AZIMUTH_DIRECTION_EDEFAULT : newAzimuthDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__AZIMUTH_DIRECTION, oldAzimuthDirection, azimuthDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevationDirection getElevationDirection() {
		return elevationDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationDirection(ElevationDirection newElevationDirection) {
		ElevationDirection oldElevationDirection = elevationDirection;
		elevationDirection = newElevationDirection == null ? ELEVATION_DIRECTION_EDEFAULT : newElevationDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__ELEVATION_DIRECTION, oldElevationDirection, elevationDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getToolTipText(AbstractCamera camera, ImageSnapshot imageSnapshot, int mouseButton, int x, int y) 
	{
		String text = null;
		
		if(imageSnapshot != null)
		{
			double hAngle = Math.toDegrees(imageSnapshot.convertToHorizontalAngle(x));
			double vAngle = Math.toDegrees(imageSnapshot.convertToVerticalAngle(y));
			
			if(getAzimuthDirection() == AzimuthDirection.POSITIVE_TOWARD_RIGHT)
			{
				hAngle = -hAngle;
			}
			
			if(getElevationDirection() == ElevationDirection.POSITIVE_DOWN)
			{
				vAngle = -vAngle;
			}
			
			text = angleFormat.format(hAngle) + "°, " + angleFormat.format(vAngle) + "°";
		}
		
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__LINE_WIDTH:
				return getLineWidth();
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__POSITIVE_VALUES_COLOR:
				return getPositiveValuesColor();
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__NEGATIVE_VALUE_COLOR:
				return getNegativeValueColor();
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__ANGLE_INTERVAL:
				return getAngleInterval();
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__FONT_NAME:
				return getFontName();
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__FONT_SIZE:
				return getFontSize();
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__AZIMUTH_DIRECTION:
				return getAzimuthDirection();
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__ELEVATION_DIRECTION:
				return getElevationDirection();
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
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__LINE_WIDTH:
				setLineWidth((Integer)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__POSITIVE_VALUES_COLOR:
				setPositiveValuesColor((Color3f)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__NEGATIVE_VALUE_COLOR:
				setNegativeValueColor((Color3f)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__ANGLE_INTERVAL:
				setAngleInterval((Integer)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__FONT_NAME:
				setFontName((String)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__AZIMUTH_DIRECTION:
				setAzimuthDirection((AzimuthDirection)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__ELEVATION_DIRECTION:
				setElevationDirection((ElevationDirection)newValue);
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
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__POSITIVE_VALUES_COLOR:
				setPositiveValuesColor(POSITIVE_VALUES_COLOR_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__NEGATIVE_VALUE_COLOR:
				setNegativeValueColor(NEGATIVE_VALUE_COLOR_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__ANGLE_INTERVAL:
				setAngleInterval(ANGLE_INTERVAL_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__FONT_NAME:
				setFontName(FONT_NAME_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__AZIMUTH_DIRECTION:
				setAzimuthDirection(AZIMUTH_DIRECTION_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__ELEVATION_DIRECTION:
				setElevationDirection(ELEVATION_DIRECTION_EDEFAULT);
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
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__POSITIVE_VALUES_COLOR:
				return POSITIVE_VALUES_COLOR_EDEFAULT == null ? positiveValuesColor != null : !POSITIVE_VALUES_COLOR_EDEFAULT.equals(positiveValuesColor);
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__NEGATIVE_VALUE_COLOR:
				return NEGATIVE_VALUE_COLOR_EDEFAULT == null ? negativeValueColor != null : !NEGATIVE_VALUE_COLOR_EDEFAULT.equals(negativeValueColor);
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__ANGLE_INTERVAL:
				return angleInterval != ANGLE_INTERVAL_EDEFAULT;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__FONT_NAME:
				return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__FONT_SIZE:
				return fontSize != FONT_SIZE_EDEFAULT;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__AZIMUTH_DIRECTION:
				return azimuthDirection != AZIMUTH_DIRECTION_EDEFAULT;
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY__ELEVATION_DIRECTION:
				return elevationDirection != ELEVATION_DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ToolTipTextProvider.class) {
			switch (baseOperationID) {
				case ApogyAddonsSensorsImagingCameraPackage.TOOL_TIP_TEXT_PROVIDER___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT: return ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsSensorsImagingCameraPackage.FOV_OVERLAY___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT:
				return getToolTipText((AbstractCamera)arguments.get(0), (ImageSnapshot)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
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
		result.append(" (lineWidth: ");
		result.append(lineWidth);
		result.append(", positiveValuesColor: ");
		result.append(positiveValuesColor);
		result.append(", negativeValueColor: ");
		result.append(negativeValueColor);
		result.append(", angleInterval: ");
		result.append(angleInterval);
		result.append(", fontName: ");
		result.append(fontName);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", azimuthDirection: ");
		result.append(azimuthDirection);
		result.append(", elevationDirection: ");
		result.append(elevationDirection);
		result.append(')');
		return result.toString();
	}

	@Override
	public AbstractEImage applyOverlay(AbstractCamera camera,
			AbstractEImage cameraImage, OverlayAlignment overlayAlignment,
			int overlayWidth, int overlayHeight) 
	{
		RectangularFrustrumFieldOfView fov = camera.getFieldOfView();
		double horizontalFOVAngle = Math.toDegrees(fov.getHorizontalFieldOfViewAngle());
		double verticalFOVAngle = Math.toDegrees(fov.getVerticalFieldOfViewAngle());
				
		AbstractEImage overlayImage = ImagingUtilities.INSTANCE.getAzimuthElevationOverlay(overlayWidth, overlayHeight, 0.0, 0.0, horizontalFOVAngle, verticalFOVAngle, getAzimuthDirection(), getElevationDirection(), getAngleInterval(), getFontName(), getFontSize(), getColorOfPositive(), getColorOfNegative(), getLineWidth());
		
		AbstractEImage result = EImagesUtilities.INSTANCE.applyOverlay(cameraImage, overlayImage, false);
		
		return result;
	}
	
	
	protected Color getColorOfPositive()
	{
		 if(getPositiveValuesColor() != null)
		 {
			  return new Color(getPositiveValuesColor().getX(), getPositiveValuesColor().getY(), getPositiveValuesColor().getZ());
		 }
		 else
		 {
			  return Color.GREEN;
		 }
	}
	
	protected Color getColorOfNegative()
	{
		 if(getNegativeValueColor() != null)
		 {
			  return new Color(getNegativeValueColor().getX(), getNegativeValueColor().getY(), getNegativeValueColor().getZ());
		 }
		 else
		 {
			  return Color.GREEN;
		 }
	}
	
} //FOVOverlayImpl
