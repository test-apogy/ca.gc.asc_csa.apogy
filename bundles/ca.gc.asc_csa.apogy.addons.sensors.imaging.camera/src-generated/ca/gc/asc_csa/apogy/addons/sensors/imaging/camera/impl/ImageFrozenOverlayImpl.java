/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFrozenOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.internal.WatchDog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Frozen Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.ImageFrozenOverlayImpl#isFrozen <em>Frozen</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.ImageFrozenOverlayImpl#getExpectedImageUpdatePeriod <em>Expected Image Update Period</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.ImageFrozenOverlayImpl#getFrozenMessage <em>Frozen Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageFrozenOverlayImpl extends AbstractTextOverlayImpl implements ImageFrozenOverlay 
{	
	private CameraViewConfiguration cvc = null;
	
	protected Adapter cameraViewConfigurationAdapter = null;
	protected WatchDog imageWatchDog = null;
	
	/**
	 * The default value of the '{@link #isFrozen() <em>Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrozen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FROZEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFrozen() <em>Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrozen()
	 * @generated
	 * @ordered
	 */
	protected boolean frozen = FROZEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedImageUpdatePeriod() <em>Expected Image Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedImageUpdatePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double EXPECTED_IMAGE_UPDATE_PERIOD_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getExpectedImageUpdatePeriod() <em>Expected Image Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedImageUpdatePeriod()
	 * @generated
	 * @ordered
	 */
	protected double expectedImageUpdatePeriod = EXPECTED_IMAGE_UPDATE_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrozenMessage() <em>Frozen Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrozenMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String FROZEN_MESSAGE_EDEFAULT = "Frozen";

	/**
	 * The cached value of the '{@link #getFrozenMessage() <em>Frozen Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrozenMessage()
	 * @generated
	 * @ordered
	 */
	protected String frozenMessage = FROZEN_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageFrozenOverlayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsImagingCameraPackage.Literals.IMAGE_FROZEN_OVERLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFrozen() {
		return frozen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrozen(boolean newFrozen) {
		boolean oldFrozen = frozen;
		frozen = newFrozen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN, oldFrozen, frozen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExpectedImageUpdatePeriod() {
		return expectedImageUpdatePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setExpectedImageUpdatePeriod(double newExpectedImageUpdatePeriod) 
	{
		setExpectedImageUpdatePeriodGen(newExpectedImageUpdatePeriod);		
		getImageWatchDog().setTimeout(Math.round(newExpectedImageUpdatePeriod * 1000));
		setFrozen(false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedImageUpdatePeriodGen(double newExpectedImageUpdatePeriod) {
		double oldExpectedImageUpdatePeriod = expectedImageUpdatePeriod;
		expectedImageUpdatePeriod = newExpectedImageUpdatePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD, oldExpectedImageUpdatePeriod, expectedImageUpdatePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrozenMessage() {
		return frozenMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrozenMessage(String newFrozenMessage) {
		String oldFrozenMessage = frozenMessage;
		frozenMessage = newFrozenMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE, oldFrozenMessage, frozenMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN:
				return isFrozen();
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD:
				return getExpectedImageUpdatePeriod();
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE:
				return getFrozenMessage();
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
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN:
				setFrozen((Boolean)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD:
				setExpectedImageUpdatePeriod((Double)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE:
				setFrozenMessage((String)newValue);
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
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN:
				setFrozen(FROZEN_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD:
				setExpectedImageUpdatePeriod(EXPECTED_IMAGE_UPDATE_PERIOD_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE:
				setFrozenMessage(FROZEN_MESSAGE_EDEFAULT);
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
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN:
				return frozen != FROZEN_EDEFAULT;
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD:
				return expectedImageUpdatePeriod != EXPECTED_IMAGE_UPDATE_PERIOD_EDEFAULT;
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE:
				return FROZEN_MESSAGE_EDEFAULT == null ? frozenMessage != null : !FROZEN_MESSAGE_EDEFAULT.equals(frozenMessage);
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
		result.append(" (frozen: ");
		result.append(frozen);
		result.append(", expectedImageUpdatePeriod: ");
		result.append(expectedImageUpdatePeriod);
		result.append(", frozenMessage: ");
		result.append(frozenMessage);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getDisplayedString() 
	{
		if(cvc == null)
		{
			cvc = getCameraOverlayList().getCameraViewConfiguration();
			if(cvc != null)
			{
				cvc.eAdapters().add(getCameraViewConfigurationAdapter());
			}
		}
		
		if(isFrozen())
		{
			return getFrozenMessage();
		}
		else
		{
			return null;
		}		
	}
	
	@Override
	public void dispose() 
	{
		getImageWatchDog().dispose();
		
		super.dispose();
	}
			
	protected Adapter getCameraViewConfigurationAdapter() 
	{
		if(cameraViewConfigurationAdapter == null)
		{
			cameraViewConfigurationAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof CameraViewConfiguration)
					{
						int featureId = msg.getFeatureID(CameraViewConfiguration.class);
						switch (featureId) 
						{
							case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_COUNT:
								getImageWatchDog().kick();
								setFrozen(false);
							
							break;

							default:
							break;
						}
					}
				}
			};
		}
		return cameraViewConfigurationAdapter;
	}

	protected WatchDog getImageWatchDog()
	{
		if(imageWatchDog == null)
		{
			imageWatchDog = new WatchDog(Math.round(getExpectedImageUpdatePeriod() * 1000))
			{
				@Override
				public void timeoutOccured() 
				{
					setFrozen(true);
				}
			};
		}
		
		return imageWatchDog;
	}

} //ImageFrozenOverlayImpl
