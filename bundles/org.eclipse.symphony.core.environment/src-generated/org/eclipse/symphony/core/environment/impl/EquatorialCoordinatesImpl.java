/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.EquatorialCoordinates;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equatorial Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.EquatorialCoordinatesImpl#getRightAscension <em>Right Ascension</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.EquatorialCoordinatesImpl#getDeclination <em>Declination</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.EquatorialCoordinatesImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquatorialCoordinatesImpl extends MinimalEObjectImpl.Container implements EquatorialCoordinates
{
  /**
	 * The default value of the '{@link #getRightAscension() <em>Right Ascension</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRightAscension()
	 * @generated
	 * @ordered
	 */
  protected static final double RIGHT_ASCENSION_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getRightAscension() <em>Right Ascension</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRightAscension()
	 * @generated
	 * @ordered
	 */
  protected double rightAscension = RIGHT_ASCENSION_EDEFAULT;

  /**
	 * The default value of the '{@link #getDeclination() <em>Declination</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDeclination()
	 * @generated
	 * @ordered
	 */
  protected static final double DECLINATION_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getDeclination() <em>Declination</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDeclination()
	 * @generated
	 * @ordered
	 */
  protected double declination = DECLINATION_EDEFAULT;

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
  protected EquatorialCoordinatesImpl()
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
		return SymphonyEnvironmentPackage.Literals.EQUATORIAL_COORDINATES;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getRightAscension()
  {
		return rightAscension;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRightAscension(double newRightAscension)
  {
		double oldRightAscension = rightAscension;
		rightAscension = newRightAscension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__RIGHT_ASCENSION, oldRightAscension, rightAscension));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getDeclination()
  {
		return declination;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDeclination(double newDeclination)
  {
		double oldDeclination = declination;
		declination = newDeclination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__DECLINATION, oldDeclination, declination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__RADIUS, oldRadius, radius));
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
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__RIGHT_ASCENSION:
				return getRightAscension();
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__DECLINATION:
				return getDeclination();
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__RADIUS:
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
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__RIGHT_ASCENSION:
				setRightAscension((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__DECLINATION:
				setDeclination((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__RADIUS:
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
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__RIGHT_ASCENSION:
				setRightAscension(RIGHT_ASCENSION_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__DECLINATION:
				setDeclination(DECLINATION_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__RADIUS:
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
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__RIGHT_ASCENSION:
				return rightAscension != RIGHT_ASCENSION_EDEFAULT;
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__DECLINATION:
				return declination != DECLINATION_EDEFAULT;
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES__RADIUS:
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
		result.append(" (rightAscension: ");
		result.append(rightAscension);
		result.append(", declination: ");
		result.append(declination);
		result.append(", radius: ");
		result.append(radius);
		result.append(')');
		return result.toString();
	}

} //EquatorialCoordinatesImpl
