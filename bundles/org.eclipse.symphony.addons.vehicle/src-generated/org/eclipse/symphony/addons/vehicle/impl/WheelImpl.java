/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.Wheel;
import org.eclipse.symphony.common.topology.addons.dynamics.impl.PhysicalBodyImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wheel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.WheelImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.WheelImpl#getLenght <em>Lenght</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WheelImpl extends PhysicalBodyImpl implements Wheel
{
  /**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
  protected static final double RADIUS_EDEFAULT = 0.25;

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
	 * The default value of the '{@link #getLenght() <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLenght()
	 * @generated
	 * @ordered
	 */
  protected static final double LENGHT_EDEFAULT = 0.1;

  /**
	 * The cached value of the '{@link #getLenght() <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLenght()
	 * @generated
	 * @ordered
	 */
  protected double lenght = LENGHT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WheelImpl()
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
		return SymphonyToolsVehiclePackage.Literals.WHEEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.WHEEL__RADIUS, oldRadius, radius));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getLenght()
  {
		return lenght;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLenght(double newLenght)
  {
		double oldLenght = lenght;
		lenght = newLenght;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.WHEEL__LENGHT, oldLenght, lenght));
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
			case SymphonyToolsVehiclePackage.WHEEL__RADIUS:
				return getRadius();
			case SymphonyToolsVehiclePackage.WHEEL__LENGHT:
				return getLenght();
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
			case SymphonyToolsVehiclePackage.WHEEL__RADIUS:
				setRadius((Double)newValue);
				return;
			case SymphonyToolsVehiclePackage.WHEEL__LENGHT:
				setLenght((Double)newValue);
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
			case SymphonyToolsVehiclePackage.WHEEL__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case SymphonyToolsVehiclePackage.WHEEL__LENGHT:
				setLenght(LENGHT_EDEFAULT);
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
			case SymphonyToolsVehiclePackage.WHEEL__RADIUS:
				return radius != RADIUS_EDEFAULT;
			case SymphonyToolsVehiclePackage.WHEEL__LENGHT:
				return lenght != LENGHT_EDEFAULT;
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
		result.append(" (radius: ");
		result.append(radius);
		result.append(", lenght: ");
		result.append(lenght);
		result.append(')');
		return result.toString();
	}

} //WheelImpl
