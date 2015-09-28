/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.Position;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.impl.PositionImpl#getX <em>X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.impl.PositionImpl#getY <em>Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.impl.PositionImpl#getTheta <em>Theta</em>}</li>
 * </ul>
 * </p>
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
	 * The default value of the '{@link #getTheta() <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTheta()
	 * @generated
	 * @ordered
	 */
  protected static final double THETA_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getTheta() <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTheta()
	 * @generated
	 * @ordered
	 */
  protected double theta = THETA_EDEFAULT;

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
		return EMFEcoreExampleMobilePlatformPackage.Literals.POSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleMobilePlatformPackage.POSITION__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleMobilePlatformPackage.POSITION__Y, oldY, y));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getTheta()
  {
		return theta;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTheta(double newTheta)
  {
		double oldTheta = theta;
		theta = newTheta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleMobilePlatformPackage.POSITION__THETA, oldTheta, theta));
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
			case EMFEcoreExampleMobilePlatformPackage.POSITION__X:
				return getX();
			case EMFEcoreExampleMobilePlatformPackage.POSITION__Y:
				return getY();
			case EMFEcoreExampleMobilePlatformPackage.POSITION__THETA:
				return getTheta();
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
			case EMFEcoreExampleMobilePlatformPackage.POSITION__X:
				setX((Double)newValue);
				return;
			case EMFEcoreExampleMobilePlatformPackage.POSITION__Y:
				setY((Double)newValue);
				return;
			case EMFEcoreExampleMobilePlatformPackage.POSITION__THETA:
				setTheta((Double)newValue);
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
			case EMFEcoreExampleMobilePlatformPackage.POSITION__X:
				setX(X_EDEFAULT);
				return;
			case EMFEcoreExampleMobilePlatformPackage.POSITION__Y:
				setY(Y_EDEFAULT);
				return;
			case EMFEcoreExampleMobilePlatformPackage.POSITION__THETA:
				setTheta(THETA_EDEFAULT);
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
			case EMFEcoreExampleMobilePlatformPackage.POSITION__X:
				return x != X_EDEFAULT;
			case EMFEcoreExampleMobilePlatformPackage.POSITION__Y:
				return y != Y_EDEFAULT;
			case EMFEcoreExampleMobilePlatformPackage.POSITION__THETA:
				return theta != THETA_EDEFAULT;
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
		result.append(", theta: ");
		result.append(theta);
		result.append(')');
		return result.toString();
	}

} //PositionImpl
