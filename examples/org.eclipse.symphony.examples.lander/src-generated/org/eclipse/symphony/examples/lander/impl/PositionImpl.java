/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.impl;

import javax.vecmath.Matrix3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderPackage;
import org.eclipse.symphony.examples.lander.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.PositionImpl#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.PositionImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.PositionImpl#getZ <em>Z</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.impl.PositionImpl#getAttitude <em>Attitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position
{
  /**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
  protected static final double X_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
  protected double x = X_EDEFAULT;

  /**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
  protected static final double Y_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
  protected double y = Y_EDEFAULT;

  /**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
  protected static final double Z_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
  protected double z = Z_EDEFAULT;

  /**
	 * The default value of the '{@link #getAttitude() <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAttitude()
	 * @generated
	 * @ordered
	 */
  protected static final Matrix3d ATTITUDE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getAttitude() <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAttitude()
	 * @generated
	 * @ordered
	 */
  protected Matrix3d attitude = ATTITUDE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PositionImpl()
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
		return EMFEcoreExampleLanderPackage.Literals.POSITION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getX()
  {
		return x;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setX(double newX)
  {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.POSITION__X, oldX, x));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getY()
  {
		return y;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setY(double newY)
  {
		double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.POSITION__Y, oldY, y));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getZ()
  {
		return z;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setZ(double newZ)
  {
		double oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.POSITION__Z, oldZ, z));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Matrix3d getAttitude()
  {
	  Matrix3d tmp = getAttitudeGen();
	  if(tmp == null)
	  {
		  Matrix3d m = new Matrix3d();
		  m.setIdentity();
		  
		  setAttitude(m);
	  }
	  return tmp;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Matrix3d getAttitudeGen()
  {
		return attitude;
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAttitude(Matrix3d newAttitude)
  {
		Matrix3d oldAttitude = attitude;
		attitude = newAttitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleLanderPackage.POSITION__ATTITUDE, oldAttitude, attitude));
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
			case EMFEcoreExampleLanderPackage.POSITION__X:
				return getX();
			case EMFEcoreExampleLanderPackage.POSITION__Y:
				return getY();
			case EMFEcoreExampleLanderPackage.POSITION__Z:
				return getZ();
			case EMFEcoreExampleLanderPackage.POSITION__ATTITUDE:
				return getAttitude();
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
			case EMFEcoreExampleLanderPackage.POSITION__X:
				setX((Double)newValue);
				return;
			case EMFEcoreExampleLanderPackage.POSITION__Y:
				setY((Double)newValue);
				return;
			case EMFEcoreExampleLanderPackage.POSITION__Z:
				setZ((Double)newValue);
				return;
			case EMFEcoreExampleLanderPackage.POSITION__ATTITUDE:
				setAttitude((Matrix3d)newValue);
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
			case EMFEcoreExampleLanderPackage.POSITION__X:
				setX(X_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.POSITION__Y:
				setY(Y_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.POSITION__Z:
				setZ(Z_EDEFAULT);
				return;
			case EMFEcoreExampleLanderPackage.POSITION__ATTITUDE:
				setAttitude(ATTITUDE_EDEFAULT);
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
			case EMFEcoreExampleLanderPackage.POSITION__X:
				return x != X_EDEFAULT;
			case EMFEcoreExampleLanderPackage.POSITION__Y:
				return y != Y_EDEFAULT;
			case EMFEcoreExampleLanderPackage.POSITION__Z:
				return z != Z_EDEFAULT;
			case EMFEcoreExampleLanderPackage.POSITION__ATTITUDE:
				return ATTITUDE_EDEFAULT == null ? attitude != null : !ATTITUDE_EDEFAULT.equals(attitude);
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(", attitude: ");
		result.append(attitude);
		result.append(')');
		return result.toString();
	}

} //PositionImpl
