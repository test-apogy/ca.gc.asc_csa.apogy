/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.HorizontalCoordinates;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horizontal Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.HorizontalCoordinatesImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.HorizontalCoordinatesImpl#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.HorizontalCoordinatesImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HorizontalCoordinatesImpl extends MinimalEObjectImpl.Container implements HorizontalCoordinates
{
  /**
	 * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
  protected static final double ALTITUDE_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
  protected double altitude = ALTITUDE_EDEFAULT;
  /**
	 * The default value of the '{@link #getAzimuth() <em>Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAzimuth()
	 * @generated
	 * @ordered
	 */
  protected static final double AZIMUTH_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getAzimuth() <em>Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAzimuth()
	 * @generated
	 * @ordered
	 */
  protected double azimuth = AZIMUTH_EDEFAULT;
  /**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
  protected static final double RADIUS_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
  protected double radius = RADIUS_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HorizontalCoordinatesImpl()
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
		return Symphony__CoreEnvironmentPackage.Literals.HORIZONTAL_COORDINATES;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getAltitude()
  {
		return altitude;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAltitude(double newAltitude)
  {
		double oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__ALTITUDE, oldAltitude, altitude));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getAzimuth()
  {
		return azimuth;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAzimuth(double newAzimuth)
  {
		double oldAzimuth = azimuth;
		azimuth = newAzimuth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__AZIMUTH, oldAzimuth, azimuth));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getRadius()
  {
		return radius;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRadius(double newRadius)
  {
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__RADIUS, oldRadius, radius));
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
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__ALTITUDE:
				return getAltitude();
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__AZIMUTH:
				return getAzimuth();
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__RADIUS:
				return getRadius();
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
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__ALTITUDE:
				setAltitude((Double)newValue);
				return;
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__AZIMUTH:
				setAzimuth((Double)newValue);
				return;
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__RADIUS:
				setRadius((Double)newValue);
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
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__ALTITUDE:
				setAltitude(ALTITUDE_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__AZIMUTH:
				setAzimuth(AZIMUTH_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__RADIUS:
				setRadius(RADIUS_EDEFAULT);
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
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__ALTITUDE:
				return altitude != ALTITUDE_EDEFAULT;
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__AZIMUTH:
				return azimuth != AZIMUTH_EDEFAULT;
			case Symphony__CoreEnvironmentPackage.HORIZONTAL_COORDINATES__RADIUS:
				return radius != RADIUS_EDEFAULT;
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
		result.append(" (altitude: ");
		result.append(altitude);
		result.append(", azimuth: ");
		result.append(azimuth);
		result.append(", radius: ");
		result.append(radius);
		result.append(')');
		return result.toString();
	}

} //HorizontalCoordinatesImpl
