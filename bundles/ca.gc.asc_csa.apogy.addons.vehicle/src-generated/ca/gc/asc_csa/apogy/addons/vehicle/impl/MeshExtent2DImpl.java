/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.vehicle.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.vehicle.MeshExtent2D;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh Extent2 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshExtent2DImpl#getMinimumX <em>Minimum X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshExtent2DImpl#getMinimumY <em>Minimum Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshExtent2DImpl#getMaximumX <em>Maximum X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.impl.MeshExtent2DImpl#getMaximumY <em>Maximum Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeshExtent2DImpl extends MinimalEObjectImpl.Container implements MeshExtent2D
{
  /**
	 * The default value of the '{@link #getMinimumX() <em>Minimum X</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimumX()
	 * @generated
	 * @ordered
	 */
  protected static final double MINIMUM_X_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getMinimumX() <em>Minimum X</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimumX()
	 * @generated
	 * @ordered
	 */
  protected double minimumX = MINIMUM_X_EDEFAULT;

  /**
	 * The default value of the '{@link #getMinimumY() <em>Minimum Y</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimumY()
	 * @generated
	 * @ordered
	 */
  protected static final double MINIMUM_Y_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getMinimumY() <em>Minimum Y</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimumY()
	 * @generated
	 * @ordered
	 */
  protected double minimumY = MINIMUM_Y_EDEFAULT;

  /**
	 * The default value of the '{@link #getMaximumX() <em>Maximum X</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMaximumX()
	 * @generated
	 * @ordered
	 */
  protected static final double MAXIMUM_X_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getMaximumX() <em>Maximum X</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMaximumX()
	 * @generated
	 * @ordered
	 */
  protected double maximumX = MAXIMUM_X_EDEFAULT;

  /**
	 * The default value of the '{@link #getMaximumY() <em>Maximum Y</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMaximumY()
	 * @generated
	 * @ordered
	 */
  protected static final double MAXIMUM_Y_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getMaximumY() <em>Maximum Y</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMaximumY()
	 * @generated
	 * @ordered
	 */
  protected double maximumY = MAXIMUM_Y_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MeshExtent2DImpl()
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
		return ApogyAddonsVehiclePackage.Literals.MESH_EXTENT2_D;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getMinimumX()
  {
		return minimumX;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMinimumX(double newMinimumX)
  {
		double oldMinimumX = minimumX;
		minimumX = newMinimumX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MINIMUM_X, oldMinimumX, minimumX));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getMinimumY()
  {
		return minimumY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMinimumY(double newMinimumY)
  {
		double oldMinimumY = minimumY;
		minimumY = newMinimumY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MINIMUM_Y, oldMinimumY, minimumY));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getMaximumX()
  {
		return maximumX;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMaximumX(double newMaximumX)
  {
		double oldMaximumX = maximumX;
		maximumX = newMaximumX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MAXIMUM_X, oldMaximumX, maximumX));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getMaximumY()
  {
		return maximumY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMaximumY(double newMaximumY)
  {
		double oldMaximumY = maximumY;
		maximumY = newMaximumY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MAXIMUM_Y, oldMaximumY, maximumY));
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
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MINIMUM_X:
				return getMinimumX();
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MINIMUM_Y:
				return getMinimumY();
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MAXIMUM_X:
				return getMaximumX();
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MAXIMUM_Y:
				return getMaximumY();
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
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MINIMUM_X:
				setMinimumX((Double)newValue);
				return;
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MINIMUM_Y:
				setMinimumY((Double)newValue);
				return;
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MAXIMUM_X:
				setMaximumX((Double)newValue);
				return;
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MAXIMUM_Y:
				setMaximumY((Double)newValue);
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
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MINIMUM_X:
				setMinimumX(MINIMUM_X_EDEFAULT);
				return;
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MINIMUM_Y:
				setMinimumY(MINIMUM_Y_EDEFAULT);
				return;
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MAXIMUM_X:
				setMaximumX(MAXIMUM_X_EDEFAULT);
				return;
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MAXIMUM_Y:
				setMaximumY(MAXIMUM_Y_EDEFAULT);
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
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MINIMUM_X:
				return minimumX != MINIMUM_X_EDEFAULT;
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MINIMUM_Y:
				return minimumY != MINIMUM_Y_EDEFAULT;
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MAXIMUM_X:
				return maximumX != MAXIMUM_X_EDEFAULT;
			case ApogyAddonsVehiclePackage.MESH_EXTENT2_D__MAXIMUM_Y:
				return maximumY != MAXIMUM_Y_EDEFAULT;
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
		result.append(" (minimumX: ");
		result.append(minimumX);
		result.append(", minimumY: ");
		result.append(minimumY);
		result.append(", maximumX: ");
		result.append(maximumX);
		result.append(", maximumY: ");
		result.append(maximumY);
		result.append(')');
		return result.toString();
	}

} //MeshExtent2DImpl
