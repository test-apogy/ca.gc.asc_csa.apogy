/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageCountOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Count Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.ImageCountOverlayImpl#isIndicatorVisible <em>Indicator Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageCountOverlayImpl extends AbstractTextOverlayImpl implements ImageCountOverlay 
{
	public static final String DEFAULT_DISPLAYED_TEXT = "<?>";
	public static final String[] indicatorStrings = new String[]{"\u2012", "\\", "|", "/", "\u2012", "\\", "|", "/"};
	
	private String stringToDisplay = DEFAULT_DISPLAYED_TEXT;
	private int indicatorIndex = 0;
	private int previousImageCount = 0;
	
	/**
	 * The default value of the '{@link #isIndicatorVisible() <em>Indicator Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndicatorVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INDICATOR_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIndicatorVisible() <em>Indicator Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndicatorVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean indicatorVisible = INDICATOR_VISIBLE_EDEFAULT;
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageCountOverlayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCameraToolsPackage.Literals.IMAGE_COUNT_OVERLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndicatorVisible() {
		return indicatorVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicatorVisible(boolean newIndicatorVisible) {
		boolean oldIndicatorVisible = indicatorVisible;
		indicatorVisible = newIndicatorVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.IMAGE_COUNT_OVERLAY__INDICATOR_VISIBLE, oldIndicatorVisible, indicatorVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.IMAGE_COUNT_OVERLAY__INDICATOR_VISIBLE:
				return isIndicatorVisible();
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
			case SymphonyCameraToolsPackage.IMAGE_COUNT_OVERLAY__INDICATOR_VISIBLE:
				setIndicatorVisible((Boolean)newValue);
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
			case SymphonyCameraToolsPackage.IMAGE_COUNT_OVERLAY__INDICATOR_VISIBLE:
				setIndicatorVisible(INDICATOR_VISIBLE_EDEFAULT);
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
			case SymphonyCameraToolsPackage.IMAGE_COUNT_OVERLAY__INDICATOR_VISIBLE:
				return indicatorVisible != INDICATOR_VISIBLE_EDEFAULT;
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
		result.append(" (indicatorVisible: ");
		result.append(indicatorVisible);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getDisplayedString() 
	{
		stringToDisplay = DEFAULT_DISPLAYED_TEXT;
		CameraViewConfiguration cvc = getCameraOverlayList().getCameraViewConfiguration();
		if(cvc != null)
		{
			int newImageCount = cvc.getImageCount();
			
			// Updates the indicator index.
			if(previousImageCount != newImageCount)
			{
				indicatorIndex++;
				if(indicatorIndex >= indicatorStrings.length) indicatorIndex = 0;					
			}	
			
			stringToDisplay = Integer.toString(newImageCount);
			if(isIndicatorVisible())
			{										
				stringToDisplay += " " + indicatorStrings[indicatorIndex];
			}
			
			previousImageCount = newImageCount;
		}
		return stringToDisplay;
	}	
} //ImageCountOverlayImpl
