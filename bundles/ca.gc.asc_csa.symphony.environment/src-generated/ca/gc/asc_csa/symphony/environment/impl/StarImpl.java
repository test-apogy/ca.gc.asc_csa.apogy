/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.symphony.environment.EquatorialCoordinates;
import ca.gc.asc_csa.symphony.environment.Star;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Star</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.StarImpl#getMagnitude <em>Magnitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.StarImpl#getEquatorialCoordinates <em>Equatorial Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StarImpl extends MinimalEObjectImpl.Container implements Star
{
  /**
	 * The default value of the '{@link #getMagnitude() <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMagnitude()
	 * @generated
	 * @ordered
	 */
  protected static final float MAGNITUDE_EDEFAULT = 0.0F;

  /**
	 * The cached value of the '{@link #getMagnitude() <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMagnitude()
	 * @generated
	 * @ordered
	 */
  protected float magnitude = MAGNITUDE_EDEFAULT;

  /**
	 * The cached value of the '{@link #getEquatorialCoordinates() <em>Equatorial Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEquatorialCoordinates()
	 * @generated
	 * @ordered
	 */
  protected EquatorialCoordinates equatorialCoordinates;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected StarImpl()
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
		return SymphonyEnvironmentPackage.Literals.STAR;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public float getMagnitude()
  {
		return magnitude;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMagnitude(float newMagnitude)
  {
		float oldMagnitude = magnitude;
		magnitude = newMagnitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.STAR__MAGNITUDE, oldMagnitude, magnitude));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EquatorialCoordinates getEquatorialCoordinates()
  {
		if (equatorialCoordinates != null && equatorialCoordinates.eIsProxy()) {
			InternalEObject oldEquatorialCoordinates = (InternalEObject)equatorialCoordinates;
			equatorialCoordinates = (EquatorialCoordinates)eResolveProxy(oldEquatorialCoordinates);
			if (equatorialCoordinates != oldEquatorialCoordinates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentPackage.STAR__EQUATORIAL_COORDINATES, oldEquatorialCoordinates, equatorialCoordinates));
			}
		}
		return equatorialCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EquatorialCoordinates basicGetEquatorialCoordinates()
  {
		return equatorialCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEquatorialCoordinates(EquatorialCoordinates newEquatorialCoordinates)
  {
		EquatorialCoordinates oldEquatorialCoordinates = equatorialCoordinates;
		equatorialCoordinates = newEquatorialCoordinates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.STAR__EQUATORIAL_COORDINATES, oldEquatorialCoordinates, equatorialCoordinates));
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
			case SymphonyEnvironmentPackage.STAR__MAGNITUDE:
				return getMagnitude();
			case SymphonyEnvironmentPackage.STAR__EQUATORIAL_COORDINATES:
				if (resolve) return getEquatorialCoordinates();
				return basicGetEquatorialCoordinates();
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
			case SymphonyEnvironmentPackage.STAR__MAGNITUDE:
				setMagnitude((Float)newValue);
				return;
			case SymphonyEnvironmentPackage.STAR__EQUATORIAL_COORDINATES:
				setEquatorialCoordinates((EquatorialCoordinates)newValue);
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
			case SymphonyEnvironmentPackage.STAR__MAGNITUDE:
				setMagnitude(MAGNITUDE_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.STAR__EQUATORIAL_COORDINATES:
				setEquatorialCoordinates((EquatorialCoordinates)null);
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
			case SymphonyEnvironmentPackage.STAR__MAGNITUDE:
				return magnitude != MAGNITUDE_EDEFAULT;
			case SymphonyEnvironmentPackage.STAR__EQUATORIAL_COORDINATES:
				return equatorialCoordinates != null;
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
		result.append(" (magnitude: ");
		result.append(magnitude);
		result.append(')');
		return result.toString();
	}

} //StarImpl
