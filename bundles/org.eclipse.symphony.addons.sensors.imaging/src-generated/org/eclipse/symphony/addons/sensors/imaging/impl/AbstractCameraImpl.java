/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;
import org.eclipse.symphony.addons.sensors.imaging.AbstractCamera;
import org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot;
import org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingPackage;
import org.eclipse.symphony.addons.sensors.impl.SensorImpl;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Camera</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.impl.AbstractCameraImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.impl.AbstractCameraImpl#getLatestImageSnapshot <em>Latest Image Snapshot</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractCameraImpl extends SensorImpl implements AbstractCamera
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getLatestImageSnapshot() <em>Latest Image Snapshot</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLatestImageSnapshot()
	 * @generated
	 * @ordered
	 */
  protected ImageSnapshot latestImageSnapshot;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractCameraImpl()
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
		return MRTSensorsImagingPackage.Literals.ABSTRACT_CAMERA;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRTSensorsImagingPackage.ABSTRACT_CAMERA__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImageSnapshot getLatestImageSnapshot()
  {
		if (latestImageSnapshot != null && latestImageSnapshot.eIsProxy()) {
			InternalEObject oldLatestImageSnapshot = (InternalEObject)latestImageSnapshot;
			latestImageSnapshot = (ImageSnapshot)eResolveProxy(oldLatestImageSnapshot);
			if (latestImageSnapshot != oldLatestImageSnapshot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MRTSensorsImagingPackage.ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT, oldLatestImageSnapshot, latestImageSnapshot));
			}
		}
		return latestImageSnapshot;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImageSnapshot basicGetLatestImageSnapshot()
  {
		return latestImageSnapshot;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLatestImageSnapshot(ImageSnapshot newLatestImageSnapshot)
  {
		ImageSnapshot oldLatestImageSnapshot = latestImageSnapshot;
		latestImageSnapshot = newLatestImageSnapshot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRTSensorsImagingPackage.ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT, oldLatestImageSnapshot, latestImageSnapshot));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImageSnapshot takeSnapshot()
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
  public RectangularFrustrumFieldOfView getFieldOfView()
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
			case MRTSensorsImagingPackage.ABSTRACT_CAMERA__NAME:
				return getName();
			case MRTSensorsImagingPackage.ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT:
				if (resolve) return getLatestImageSnapshot();
				return basicGetLatestImageSnapshot();
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
			case MRTSensorsImagingPackage.ABSTRACT_CAMERA__NAME:
				setName((String)newValue);
				return;
			case MRTSensorsImagingPackage.ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT:
				setLatestImageSnapshot((ImageSnapshot)newValue);
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
			case MRTSensorsImagingPackage.ABSTRACT_CAMERA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MRTSensorsImagingPackage.ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT:
				setLatestImageSnapshot((ImageSnapshot)null);
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
			case MRTSensorsImagingPackage.ABSTRACT_CAMERA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MRTSensorsImagingPackage.ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT:
				return latestImageSnapshot != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case MRTSensorsImagingPackage.ABSTRACT_CAMERA__NAME: return EMFEcorePackage.NAMED__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.NAMED__NAME: return MRTSensorsImagingPackage.ABSTRACT_CAMERA__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
			case MRTSensorsImagingPackage.ABSTRACT_CAMERA___TAKE_SNAPSHOT:
				return takeSnapshot();
			case MRTSensorsImagingPackage.ABSTRACT_CAMERA___GET_FIELD_OF_VIEW:
				return getFieldOfView();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractCameraImpl
