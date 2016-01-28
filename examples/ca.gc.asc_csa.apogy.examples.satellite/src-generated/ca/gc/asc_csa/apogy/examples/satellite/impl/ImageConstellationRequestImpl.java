/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

import ca.gc.asc_csa.apogy.examples.satellite.ImageConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Constellation Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ImageConstellationRequestImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ImageConstellationRequestImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ImageConstellationRequestImpl#getElevation <em>Elevation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ImageConstellationRequestImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageConstellationRequestImpl extends AbstractConstellationRequestImpl implements ImageConstellationRequest {
	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected double longitude = LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected double latitude = LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected static final double ELEVATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected double elevation = ELEVATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected OrbitalImage image;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageConstellationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.IMAGE_CONSTELLATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(double newLongitude) {
		double oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(double newLatitude) {
		double oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElevation() {
		return elevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevation(double newElevation) {
		double oldElevation = elevation;
		elevation = newElevation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__ELEVATION, oldElevation, elevation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitalImage getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(OrbitalImage newImage, NotificationChain msgs) {
		OrbitalImage oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__IMAGE, oldImage, newImage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(OrbitalImage newImage) {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject)image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject)newImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__IMAGE, newImage, newImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__IMAGE:
				return basicSetImage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LONGITUDE:
				return getLongitude();
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LATITUDE:
				return getLatitude();
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__ELEVATION:
				return getElevation();
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__IMAGE:
				return getImage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LATITUDE:
				setLatitude((Double)newValue);
				return;
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__ELEVATION:
				setElevation((Double)newValue);
				return;
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__IMAGE:
				setImage((OrbitalImage)newValue);
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
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__ELEVATION:
				setElevation(ELEVATION_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__IMAGE:
				setImage((OrbitalImage)null);
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
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__ELEVATION:
				return elevation != ELEVATION_EDEFAULT;
			case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__IMAGE:
				return image != null;
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
		if (baseClass == GeographicCoordinates.class) {
			switch (derivedFeatureID) {
				case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LONGITUDE: return ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LONGITUDE;
				case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LATITUDE: return ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LATITUDE;
				case ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__ELEVATION: return ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__ELEVATION;
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
		if (baseClass == GeographicCoordinates.class) {
			switch (baseFeatureID) {
				case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LONGITUDE: return ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LONGITUDE;
				case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LATITUDE: return ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__LATITUDE;
				case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__ELEVATION: return ApogyExamplesSatellitePackage.IMAGE_CONSTELLATION_REQUEST__ELEVATION;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (longitude: ");
		result.append(longitude);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(", elevation: ");
		result.append(elevation);
		result.append(')');
		return result.toString();
	}

} //ImageConstellationRequestImpl
