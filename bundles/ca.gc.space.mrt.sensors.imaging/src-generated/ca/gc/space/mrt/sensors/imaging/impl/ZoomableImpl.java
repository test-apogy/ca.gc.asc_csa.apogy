/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.imaging.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage;
import ca.gc.space.mrt.sensors.imaging.Zoomable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zoomable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.imaging.impl.ZoomableImpl#getCurrentZoom <em>Current Zoom</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.imaging.impl.ZoomableImpl#getCommandedZoom <em>Commanded Zoom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ZoomableImpl extends MinimalEObjectImpl.Container implements Zoomable
{
  /**
	 * The default value of the '{@link #getCurrentZoom() <em>Current Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCurrentZoom()
	 * @generated
	 * @ordered
	 */
  protected static final double CURRENT_ZOOM_EDEFAULT = 1.0;

  /**
	 * The cached value of the '{@link #getCurrentZoom() <em>Current Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCurrentZoom()
	 * @generated
	 * @ordered
	 */
  protected double currentZoom = CURRENT_ZOOM_EDEFAULT;

  /**
	 * The default value of the '{@link #getCommandedZoom() <em>Commanded Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCommandedZoom()
	 * @generated
	 * @ordered
	 */
  protected static final double COMMANDED_ZOOM_EDEFAULT = 1.0;

  /**
	 * The cached value of the '{@link #getCommandedZoom() <em>Commanded Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCommandedZoom()
	 * @generated
	 * @ordered
	 */
  protected double commandedZoom = COMMANDED_ZOOM_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ZoomableImpl()
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
		return MRTSensorsImagingPackage.Literals.ZOOMABLE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getCurrentZoom()
  {
		return currentZoom;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCurrentZoom(double newCurrentZoom)
  {
		double oldCurrentZoom = currentZoom;
		currentZoom = newCurrentZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRTSensorsImagingPackage.ZOOMABLE__CURRENT_ZOOM, oldCurrentZoom, currentZoom));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getCommandedZoom()
  {
		return commandedZoom;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCommandedZoom(double newCommandedZoom)
  {
		double oldCommandedZoom = commandedZoom;
		commandedZoom = newCommandedZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRTSensorsImagingPackage.ZOOMABLE__COMMANDED_ZOOM, oldCommandedZoom, commandedZoom));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean commandZoom(double newZoom)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getMinimumZoom()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getMaximumZoom()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case MRTSensorsImagingPackage.ZOOMABLE__CURRENT_ZOOM:
				return getCurrentZoom();
			case MRTSensorsImagingPackage.ZOOMABLE__COMMANDED_ZOOM:
				return getCommandedZoom();
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
			case MRTSensorsImagingPackage.ZOOMABLE__CURRENT_ZOOM:
				setCurrentZoom((Double)newValue);
				return;
			case MRTSensorsImagingPackage.ZOOMABLE__COMMANDED_ZOOM:
				setCommandedZoom((Double)newValue);
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
			case MRTSensorsImagingPackage.ZOOMABLE__CURRENT_ZOOM:
				setCurrentZoom(CURRENT_ZOOM_EDEFAULT);
				return;
			case MRTSensorsImagingPackage.ZOOMABLE__COMMANDED_ZOOM:
				setCommandedZoom(COMMANDED_ZOOM_EDEFAULT);
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
			case MRTSensorsImagingPackage.ZOOMABLE__CURRENT_ZOOM:
				return currentZoom != CURRENT_ZOOM_EDEFAULT;
			case MRTSensorsImagingPackage.ZOOMABLE__COMMANDED_ZOOM:
				return commandedZoom != COMMANDED_ZOOM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case MRTSensorsImagingPackage.ZOOMABLE___COMMAND_ZOOM__DOUBLE:
				return commandZoom((Double)arguments.get(0));
			case MRTSensorsImagingPackage.ZOOMABLE___GET_MINIMUM_ZOOM:
				return getMinimumZoom();
			case MRTSensorsImagingPackage.ZOOMABLE___GET_MAXIMUM_ZOOM:
				return getMaximumZoom();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (currentZoom: ");
		result.append(currentZoom);
		result.append(", commandedZoom: ");
		result.append(commandedZoom);
		result.append(')');
		return result.toString();
	}

} //ZoomableImpl
