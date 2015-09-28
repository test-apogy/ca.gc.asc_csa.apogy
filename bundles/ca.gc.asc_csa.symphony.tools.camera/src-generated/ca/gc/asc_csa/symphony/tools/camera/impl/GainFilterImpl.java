/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.eclipse.images.core.AbstractEImage;
import ca.gc.asc_csa.eclipse.images.core.EImagesUtilities;
import ca.gc.asc_csa.symphony.tools.camera.GainFilter;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gain Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.GainFilterImpl#getGain <em>Gain</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.GainFilterImpl#getBias <em>Bias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GainFilterImpl extends ImageFilterImpl implements GainFilter
{
  /**
	 * The default value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
  protected static final double GAIN_EDEFAULT = 50.0;

  /**
	 * The cached value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
  protected double gain = GAIN_EDEFAULT;

  /**
	 * The default value of the '{@link #getBias() <em>Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBias()
	 * @generated
	 * @ordered
	 */
  protected static final double BIAS_EDEFAULT = 50.0;

  /**
	 * The cached value of the '{@link #getBias() <em>Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBias()
	 * @generated
	 * @ordered
	 */
  protected double bias = BIAS_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected GainFilterImpl()
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
		return SymphonyCameraToolsPackage.Literals.GAIN_FILTER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getGain()
  {
		return gain;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setGain(double newGain)
  {
		double oldGain = gain;
		gain = newGain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.GAIN_FILTER__GAIN, oldGain, gain));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getBias()
  {
		return bias;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setBias(double newBias)
  {
		double oldBias = bias;
		bias = newBias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.GAIN_FILTER__BIAS, oldBias, bias));
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
			case SymphonyCameraToolsPackage.GAIN_FILTER__GAIN:
				return getGain();
			case SymphonyCameraToolsPackage.GAIN_FILTER__BIAS:
				return getBias();
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
			case SymphonyCameraToolsPackage.GAIN_FILTER__GAIN:
				setGain((Double)newValue);
				return;
			case SymphonyCameraToolsPackage.GAIN_FILTER__BIAS:
				setBias((Double)newValue);
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
			case SymphonyCameraToolsPackage.GAIN_FILTER__GAIN:
				setGain(GAIN_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.GAIN_FILTER__BIAS:
				setBias(BIAS_EDEFAULT);
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
			case SymphonyCameraToolsPackage.GAIN_FILTER__GAIN:
				return gain != GAIN_EDEFAULT;
			case SymphonyCameraToolsPackage.GAIN_FILTER__BIAS:
				return bias != BIAS_EDEFAULT;
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
		result.append(" (gain: ");
		result.append(gain);
		result.append(", bias: ");
		result.append(bias);
		result.append(')');
		return result.toString();
	}
  
  @Override
  public AbstractEImage filter(AbstractCamera camera,	AbstractEImage cameraImage) 
  {
	  return EImagesUtilities.INSTANCE.applyGainFilter(cameraImage, getGain(), getBias());
  }

} //GainFilterImpl
