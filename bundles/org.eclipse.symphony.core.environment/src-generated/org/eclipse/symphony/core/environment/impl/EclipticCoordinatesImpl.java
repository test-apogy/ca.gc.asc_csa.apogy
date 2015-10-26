/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.EclipticCoordinates;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecliptic Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.EclipticCoordinatesImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.EclipticCoordinatesImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.EclipticCoordinatesImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EclipticCoordinatesImpl extends MinimalEObjectImpl.Container implements EclipticCoordinates
{
  /**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
  protected static final double LONGITUDE_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
  protected double longitude = LONGITUDE_EDEFAULT;

  /**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
  protected static final double LATITUDE_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
  protected double latitude = LATITUDE_EDEFAULT;

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
  protected EclipticCoordinatesImpl()
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
		return SymphonyEnvironmentPackage.Literals.ECLIPTIC_COORDINATES;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getLongitude()
  {
		return longitude;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLongitude(double newLongitude)
  {
		double oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__LONGITUDE, oldLongitude, longitude));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getLatitude()
  {
		return latitude;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLatitude(double newLatitude)
  {
		double oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__LATITUDE, oldLatitude, latitude));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__RADIUS, oldRadius, radius));
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
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__LONGITUDE:
				return getLongitude();
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__LATITUDE:
				return getLatitude();
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__RADIUS:
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
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__LATITUDE:
				setLatitude((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__RADIUS:
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
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__RADIUS:
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
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES__RADIUS:
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
		result.append(" (longitude: ");
		result.append(longitude);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(", radius: ");
		result.append(radius);
		result.append(')');
		return result.toString();
	}

} //EclipticCoordinatesImpl
