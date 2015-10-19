/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingPackage;
import org.eclipse.symphony.addons.sensors.imaging.Zoomable;
import org.eclipse.symphony.addons.sensors.imaging.impl.AbstractCameraImpl;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage;
import org.eclipse.symphony.examples.satellite.OrbitalImage;
import org.eclipse.symphony.examples.satellite.Satellite;
import org.eclipse.symphony.examples.satellite.SatelliteImager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite Imager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImagerImpl#getCurrentZoom <em>Current Zoom</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImagerImpl#getCommandedZoom <em>Commanded Zoom</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImagerImpl#getSatellite <em>Satellite</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImagerImpl#getImagesAcquired <em>Images Acquired</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatelliteImagerImpl extends AbstractCameraImpl implements SatelliteImager {
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
	 * The cached value of the '{@link #getImagesAcquired() <em>Images Acquired</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagesAcquired()
	 * @generated
	 * @ordered
	 */
	protected EList<OrbitalImage> imagesAcquired;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteImagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleSatellitePackage.Literals.SATELLITE_IMAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentZoom() {
		return currentZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentZoom(double newCurrentZoom) {
		double oldCurrentZoom = currentZoom;
		currentZoom = newCurrentZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__CURRENT_ZOOM, oldCurrentZoom, currentZoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCommandedZoom() {
		return commandedZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandedZoom(double newCommandedZoom) {
		double oldCommandedZoom = commandedZoom;
		commandedZoom = newCommandedZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__COMMANDED_ZOOM, oldCommandedZoom, commandedZoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Satellite getSatellite() {
		if (eContainerFeatureID() != EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE) return null;
		return (Satellite)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Satellite basicGetSatellite() {
		if (eContainerFeatureID() != EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE) return null;
		return (Satellite)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSatellite(Satellite newSatellite, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSatellite, EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatellite(Satellite newSatellite) {
		if (newSatellite != eInternalContainer() || (eContainerFeatureID() != EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE && newSatellite != null)) {
			if (EcoreUtil.isAncestor(this, newSatellite))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSatellite != null)
				msgs = ((InternalEObject)newSatellite).eInverseAdd(this, EMFEcoreExampleSatellitePackage.SATELLITE__IMAGER, Satellite.class, msgs);
			msgs = basicSetSatellite(newSatellite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE, newSatellite, newSatellite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrbitalImage> getImagesAcquired() {
		if (imagesAcquired == null) {
			imagesAcquired = new EObjectContainmentEList<OrbitalImage>(OrbitalImage.class, this, EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__IMAGES_ACQUIRED);
		}
		return imagesAcquired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<OrbitalImage> downloadImages(int maximumNumberOfImages) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean commandZoom(double newZoom) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumZoom() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumZoom() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSatellite((Satellite)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE:
				return basicSetSatellite(null, msgs);
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__IMAGES_ACQUIRED:
				return ((InternalEList<?>)getImagesAcquired()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE:
				return eInternalContainer().eInverseRemove(this, EMFEcoreExampleSatellitePackage.SATELLITE__IMAGER, Satellite.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__CURRENT_ZOOM:
				return getCurrentZoom();
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__COMMANDED_ZOOM:
				return getCommandedZoom();
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE:
				if (resolve) return getSatellite();
				return basicGetSatellite();
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__IMAGES_ACQUIRED:
				return getImagesAcquired();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__CURRENT_ZOOM:
				setCurrentZoom((Double)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__COMMANDED_ZOOM:
				setCommandedZoom((Double)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE:
				setSatellite((Satellite)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__IMAGES_ACQUIRED:
				getImagesAcquired().clear();
				getImagesAcquired().addAll((Collection<? extends OrbitalImage>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__CURRENT_ZOOM:
				setCurrentZoom(CURRENT_ZOOM_EDEFAULT);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__COMMANDED_ZOOM:
				setCommandedZoom(COMMANDED_ZOOM_EDEFAULT);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE:
				setSatellite((Satellite)null);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__IMAGES_ACQUIRED:
				getImagesAcquired().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__CURRENT_ZOOM:
				return currentZoom != CURRENT_ZOOM_EDEFAULT;
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__COMMANDED_ZOOM:
				return commandedZoom != COMMANDED_ZOOM_EDEFAULT;
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__SATELLITE:
				return basicGetSatellite() != null;
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__IMAGES_ACQUIRED:
				return imagesAcquired != null && !imagesAcquired.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Zoomable.class) {
			switch (derivedFeatureID) {
				case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__CURRENT_ZOOM: return MRTSensorsImagingPackage.ZOOMABLE__CURRENT_ZOOM;
				case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__COMMANDED_ZOOM: return MRTSensorsImagingPackage.ZOOMABLE__COMMANDED_ZOOM;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Zoomable.class) {
			switch (baseFeatureID) {
				case MRTSensorsImagingPackage.ZOOMABLE__CURRENT_ZOOM: return EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__CURRENT_ZOOM;
				case MRTSensorsImagingPackage.ZOOMABLE__COMMANDED_ZOOM: return EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER__COMMANDED_ZOOM;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Zoomable.class) {
			switch (baseOperationID) {
				case MRTSensorsImagingPackage.ZOOMABLE___COMMAND_ZOOM__DOUBLE: return EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER___COMMAND_ZOOM__DOUBLE;
				case MRTSensorsImagingPackage.ZOOMABLE___GET_MINIMUM_ZOOM: return EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER___GET_MINIMUM_ZOOM;
				case MRTSensorsImagingPackage.ZOOMABLE___GET_MAXIMUM_ZOOM: return EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER___GET_MAXIMUM_ZOOM;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER___DOWNLOAD_IMAGES__INT:
				return downloadImages((Integer)arguments.get(0));
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER___COMMAND_ZOOM__DOUBLE:
				return commandZoom((Double)arguments.get(0));
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER___GET_MINIMUM_ZOOM:
				return getMinimumZoom();
			case EMFEcoreExampleSatellitePackage.SATELLITE_IMAGER___GET_MAXIMUM_ZOOM:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (currentZoom: ");
		result.append(currentZoom);
		result.append(", commandedZoom: ");
		result.append(commandedZoom);
		result.append(')');
		return result.toString();
	}

} //SatelliteImagerImpl
