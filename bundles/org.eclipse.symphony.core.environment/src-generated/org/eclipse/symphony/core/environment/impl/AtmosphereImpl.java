/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.Atmosphere;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atmosphere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.AtmosphereImpl#getWindSpeed <em>Wind Speed</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.AtmosphereImpl#getWindDirection <em>Wind Direction</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.AtmosphereImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.AtmosphereImpl#getSurfacePressure <em>Surface Pressure</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.AtmosphereImpl#getSurfaceDensity <em>Surface Density</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtmosphereImpl extends MinimalEObjectImpl.Container implements Atmosphere
{
  /**
	 * The default value of the '{@link #getWindSpeed() <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWindSpeed()
	 * @generated
	 * @ordered
	 */
  protected static final double WIND_SPEED_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getWindSpeed() <em>Wind Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWindSpeed()
	 * @generated
	 * @ordered
	 */
  protected double windSpeed = WIND_SPEED_EDEFAULT;
  /**
	 * The default value of the '{@link #getWindDirection() <em>Wind Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWindDirection()
	 * @generated
	 * @ordered
	 */
  protected static final double WIND_DIRECTION_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getWindDirection() <em>Wind Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWindDirection()
	 * @generated
	 * @ordered
	 */
  protected double windDirection = WIND_DIRECTION_EDEFAULT;
  /**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
  protected static final double TEMPERATURE_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
  protected double temperature = TEMPERATURE_EDEFAULT;
  /**
	 * The default value of the '{@link #getSurfacePressure() <em>Surface Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSurfacePressure()
	 * @generated
	 * @ordered
	 */
  protected static final double SURFACE_PRESSURE_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getSurfacePressure() <em>Surface Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSurfacePressure()
	 * @generated
	 * @ordered
	 */
  protected double surfacePressure = SURFACE_PRESSURE_EDEFAULT;
  /**
	 * The default value of the '{@link #getSurfaceDensity() <em>Surface Density</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSurfaceDensity()
	 * @generated
	 * @ordered
	 */
  protected static final double SURFACE_DENSITY_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getSurfaceDensity() <em>Surface Density</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSurfaceDensity()
	 * @generated
	 * @ordered
	 */
  protected double surfaceDensity = SURFACE_DENSITY_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AtmosphereImpl()
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
		return SymphonyEnvironmentPackage.Literals.ATMOSPHERE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getWindSpeed()
  {
		return windSpeed;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWindSpeed(double newWindSpeed)
  {
		double oldWindSpeed = windSpeed;
		windSpeed = newWindSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.ATMOSPHERE__WIND_SPEED, oldWindSpeed, windSpeed));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getWindDirection()
  {
		return windDirection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWindDirection(double newWindDirection)
  {
		double oldWindDirection = windDirection;
		windDirection = newWindDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.ATMOSPHERE__WIND_DIRECTION, oldWindDirection, windDirection));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getTemperature()
  {
		return temperature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTemperature(double newTemperature)
  {
		double oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.ATMOSPHERE__TEMPERATURE, oldTemperature, temperature));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getSurfacePressure()
  {
		return surfacePressure;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSurfacePressure(double newSurfacePressure)
  {
		double oldSurfacePressure = surfacePressure;
		surfacePressure = newSurfacePressure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.ATMOSPHERE__SURFACE_PRESSURE, oldSurfacePressure, surfacePressure));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getSurfaceDensity()
  {
		return surfaceDensity;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSurfaceDensity(double newSurfaceDensity)
  {
		double oldSurfaceDensity = surfaceDensity;
		surfaceDensity = newSurfaceDensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.ATMOSPHERE__SURFACE_DENSITY, oldSurfaceDensity, surfaceDensity));
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
			case SymphonyEnvironmentPackage.ATMOSPHERE__WIND_SPEED:
				return getWindSpeed();
			case SymphonyEnvironmentPackage.ATMOSPHERE__WIND_DIRECTION:
				return getWindDirection();
			case SymphonyEnvironmentPackage.ATMOSPHERE__TEMPERATURE:
				return getTemperature();
			case SymphonyEnvironmentPackage.ATMOSPHERE__SURFACE_PRESSURE:
				return getSurfacePressure();
			case SymphonyEnvironmentPackage.ATMOSPHERE__SURFACE_DENSITY:
				return getSurfaceDensity();
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
			case SymphonyEnvironmentPackage.ATMOSPHERE__WIND_SPEED:
				setWindSpeed((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.ATMOSPHERE__WIND_DIRECTION:
				setWindDirection((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.ATMOSPHERE__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.ATMOSPHERE__SURFACE_PRESSURE:
				setSurfacePressure((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.ATMOSPHERE__SURFACE_DENSITY:
				setSurfaceDensity((Double)newValue);
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
			case SymphonyEnvironmentPackage.ATMOSPHERE__WIND_SPEED:
				setWindSpeed(WIND_SPEED_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.ATMOSPHERE__WIND_DIRECTION:
				setWindDirection(WIND_DIRECTION_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.ATMOSPHERE__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.ATMOSPHERE__SURFACE_PRESSURE:
				setSurfacePressure(SURFACE_PRESSURE_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.ATMOSPHERE__SURFACE_DENSITY:
				setSurfaceDensity(SURFACE_DENSITY_EDEFAULT);
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
			case SymphonyEnvironmentPackage.ATMOSPHERE__WIND_SPEED:
				return windSpeed != WIND_SPEED_EDEFAULT;
			case SymphonyEnvironmentPackage.ATMOSPHERE__WIND_DIRECTION:
				return windDirection != WIND_DIRECTION_EDEFAULT;
			case SymphonyEnvironmentPackage.ATMOSPHERE__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
			case SymphonyEnvironmentPackage.ATMOSPHERE__SURFACE_PRESSURE:
				return surfacePressure != SURFACE_PRESSURE_EDEFAULT;
			case SymphonyEnvironmentPackage.ATMOSPHERE__SURFACE_DENSITY:
				return surfaceDensity != SURFACE_DENSITY_EDEFAULT;
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
		result.append(" (windSpeed: ");
		result.append(windSpeed);
		result.append(", windDirection: ");
		result.append(windDirection);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(", surfacePressure: ");
		result.append(surfacePressure);
		result.append(", surfaceDensity: ");
		result.append(surfaceDensity);
		result.append(')');
		return result.toString();
	}

} //AtmosphereImpl
