/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;

import ca.gc.asc_csa.symphony.tools.camera.FOVOverlay;
import ca.gc.asc_csa.symphony.tools.camera.OverlayAlignment;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsFactory;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.asc_csa.symphony.tools.camera.ToolTipTextProvider;
import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;
import ca.gc.space.mrt.sensors.imaging.AzimuthDirection;
import ca.gc.space.mrt.sensors.imaging.ElevationDirection;
import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;
import ca.gc.space.mrt.sensors.imaging.ImagingUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FOV Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.FOVOverlayImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.FOVOverlayImpl#getPositiveValuesColor <em>Positive Values Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.FOVOverlayImpl#getNegativeValueColor <em>Negative Value Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.FOVOverlayImpl#getAngleInterval <em>Angle Interval</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.FOVOverlayImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.FOVOverlayImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.FOVOverlayImpl#getAzimuthDirection <em>Azimuth Direction</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.FOVOverlayImpl#getElevationDirection <em>Elevation Direction</em>}</li>
 * </ul>
 * </p>
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
	protected static final Color3f POSITIVE_VALUES_COLOR_EDEFAULT = (Color3f)SymphonyCameraToolsFactory.eINSTANCE.createFromString(SymphonyCameraToolsPackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");
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
	protected static final Color3f NEGATIVE_VALUE_COLOR_EDEFAULT = (Color3f)SymphonyCameraToolsFactory.eINSTANCE.createFromString(SymphonyCameraToolsPackage.eINSTANCE.getColor3f(), "1.0,0.0,0.0");
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
		return SymphonyCameraToolsPackage.Literals.FOV_OVERLAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.FOV_OVERLAY__LINE_WIDTH, oldLineWidth, lineWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.FOV_OVERLAY__POSITIVE_VALUES_COLOR, oldPositiveValuesColor, positiveValuesColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.FOV_OVERLAY__NEGATIVE_VALUE_COLOR, oldNegativeValueColor, negativeValueColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.FOV_OVERLAY__ANGLE_INTERVAL, oldAngleInterval, angleInterval));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_NAME, oldFontName, fontName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_SIZE, oldFontSize, fontSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.FOV_OVERLAY__AZIMUTH_DIRECTION, oldAzimuthDirection, azimuthDirection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.FOV_OVERLAY__ELEVATION_DIRECTION, oldElevationDirection, elevationDirection));
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
			case SymphonyCameraToolsPackage.FOV_OVERLAY__LINE_WIDTH:
				return getLineWidth();
			case SymphonyCameraToolsPackage.FOV_OVERLAY__POSITIVE_VALUES_COLOR:
				return getPositiveValuesColor();
			case SymphonyCameraToolsPackage.FOV_OVERLAY__NEGATIVE_VALUE_COLOR:
				return getNegativeValueColor();
			case SymphonyCameraToolsPackage.FOV_OVERLAY__ANGLE_INTERVAL:
				return getAngleInterval();
			case SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_NAME:
				return getFontName();
			case SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_SIZE:
				return getFontSize();
			case SymphonyCameraToolsPackage.FOV_OVERLAY__AZIMUTH_DIRECTION:
				return getAzimuthDirection();
			case SymphonyCameraToolsPackage.FOV_OVERLAY__ELEVATION_DIRECTION:
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
			case SymphonyCameraToolsPackage.FOV_OVERLAY__LINE_WIDTH:
				setLineWidth((Integer)newValue);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__POSITIVE_VALUES_COLOR:
				setPositiveValuesColor((Color3f)newValue);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__NEGATIVE_VALUE_COLOR:
				setNegativeValueColor((Color3f)newValue);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__ANGLE_INTERVAL:
				setAngleInterval((Integer)newValue);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_NAME:
				setFontName((String)newValue);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__AZIMUTH_DIRECTION:
				setAzimuthDirection((AzimuthDirection)newValue);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__ELEVATION_DIRECTION:
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
			case SymphonyCameraToolsPackage.FOV_OVERLAY__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__POSITIVE_VALUES_COLOR:
				setPositiveValuesColor(POSITIVE_VALUES_COLOR_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__NEGATIVE_VALUE_COLOR:
				setNegativeValueColor(NEGATIVE_VALUE_COLOR_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__ANGLE_INTERVAL:
				setAngleInterval(ANGLE_INTERVAL_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_NAME:
				setFontName(FONT_NAME_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__AZIMUTH_DIRECTION:
				setAzimuthDirection(AZIMUTH_DIRECTION_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__ELEVATION_DIRECTION:
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
			case SymphonyCameraToolsPackage.FOV_OVERLAY__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__POSITIVE_VALUES_COLOR:
				return POSITIVE_VALUES_COLOR_EDEFAULT == null ? positiveValuesColor != null : !POSITIVE_VALUES_COLOR_EDEFAULT.equals(positiveValuesColor);
			case SymphonyCameraToolsPackage.FOV_OVERLAY__NEGATIVE_VALUE_COLOR:
				return NEGATIVE_VALUE_COLOR_EDEFAULT == null ? negativeValueColor != null : !NEGATIVE_VALUE_COLOR_EDEFAULT.equals(negativeValueColor);
			case SymphonyCameraToolsPackage.FOV_OVERLAY__ANGLE_INTERVAL:
				return angleInterval != ANGLE_INTERVAL_EDEFAULT;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_NAME:
				return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
			case SymphonyCameraToolsPackage.FOV_OVERLAY__FONT_SIZE:
				return fontSize != FONT_SIZE_EDEFAULT;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__AZIMUTH_DIRECTION:
				return azimuthDirection != AZIMUTH_DIRECTION_EDEFAULT;
			case SymphonyCameraToolsPackage.FOV_OVERLAY__ELEVATION_DIRECTION:
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
				case SymphonyCameraToolsPackage.TOOL_TIP_TEXT_PROVIDER___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT: return SymphonyCameraToolsPackage.FOV_OVERLAY___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT;
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
			case SymphonyCameraToolsPackage.FOV_OVERLAY___GET_TOOL_TIP_TEXT__ABSTRACTCAMERA_IMAGESNAPSHOT_INT_INT_INT:
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
