/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.eclipse.images.core.AbstractEImage;
import ca.gc.asc_csa.eclipse.images.core.EImagesUtilities;
import ca.gc.asc_csa.symphony.tools.camera.ContrastAndBrightnessFilter;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contrast And Brightness Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.ContrastAndBrightnessFilterImpl#getContrast <em>Contrast</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.ContrastAndBrightnessFilterImpl#getBrightness <em>Brightness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContrastAndBrightnessFilterImpl extends ImageFilterImpl implements ContrastAndBrightnessFilter
{
  /**
	 * The default value of the '{@link #getContrast() <em>Contrast</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContrast()
	 * @generated
	 * @ordered
	 */
  protected static final double CONTRAST_EDEFAULT = 1.0;

  /**
	 * The cached value of the '{@link #getContrast() <em>Contrast</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContrast()
	 * @generated
	 * @ordered
	 */
  protected double contrast = CONTRAST_EDEFAULT;

  /**
	 * The default value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
  protected static final double BRIGHTNESS_EDEFAULT = 1.0;

  /**
	 * The cached value of the '{@link #getBrightness() <em>Brightness</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBrightness()
	 * @generated
	 * @ordered
	 */
  protected double brightness = BRIGHTNESS_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ContrastAndBrightnessFilterImpl()
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
		return SymphonyCameraToolsPackage.Literals.CONTRAST_AND_BRIGHTNESS_FILTER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getContrast()
  {
		return contrast;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setContrast(double newContrast)
  {
		double oldContrast = contrast;
		contrast = newContrast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST, oldContrast, contrast));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getBrightness()
  {
		return brightness;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setBrightness(double newBrightness)
  {
		double oldBrightness = brightness;
		brightness = newBrightness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS, oldBrightness, brightness));
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
			case SymphonyCameraToolsPackage.CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST:
				return getContrast();
			case SymphonyCameraToolsPackage.CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS:
				return getBrightness();
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
			case SymphonyCameraToolsPackage.CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST:
				setContrast((Double)newValue);
				return;
			case SymphonyCameraToolsPackage.CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS:
				setBrightness((Double)newValue);
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
			case SymphonyCameraToolsPackage.CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST:
				setContrast(CONTRAST_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS:
				setBrightness(BRIGHTNESS_EDEFAULT);
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
			case SymphonyCameraToolsPackage.CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST:
				return contrast != CONTRAST_EDEFAULT;
			case SymphonyCameraToolsPackage.CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS:
				return brightness != BRIGHTNESS_EDEFAULT;
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
		result.append(" (contrast: ");
		result.append(contrast);
		result.append(", brightness: ");
		result.append(brightness);
		result.append(')');
		return result.toString();
	}

  @Override
  public AbstractEImage filter(AbstractCamera camera, AbstractEImage cameraImage) 
  {
	  return EImagesUtilities.INSTANCE.applyContrastAndBrightnessFilter(cameraImage, getContrast(), getBrightness());
  }
} //ContrastAndBrightnessFilterImpl
