/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;
import org.eclipse.symphony.examples.satellite.OrbitalImage;
import org.eclipse.symphony.examples.satellite.Satellite;
import org.eclipse.symphony.examples.satellite.SatelliteCommand;
import org.eclipse.symphony.examples.satellite.SatelliteImager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImpl#getMaximumRollRate <em>Maximum Roll Rate</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImpl#getMaximumRoll <em>Maximum Roll</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImpl#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImpl#getImager <em>Imager</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SatelliteImpl extends MinimalEObjectImpl.Container implements Satellite {
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
	 * The default value of the '{@link #getMaximumRollRate() <em>Maximum Roll Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRollRate()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_ROLL_RATE_EDEFAULT = 0.017452778;
	/**
	 * The cached value of the '{@link #getMaximumRollRate() <em>Maximum Roll Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRollRate()
	 * @generated
	 * @ordered
	 */
	protected double maximumRollRate = MAXIMUM_ROLL_RATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaximumRoll() <em>Maximum Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRoll()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_ROLL_EDEFAULT = 0.087;
	/**
	 * The cached value of the '{@link #getMaximumRoll() <em>Maximum Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRoll()
	 * @generated
	 * @ordered
	 */
	protected double maximumRoll = MAXIMUM_ROLL_EDEFAULT;
	/**
	 * The cached value of the '{@link #getOrbitModel() <em>Orbit Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitModel()
	 * @generated
	 * @ordered
	 */
	protected OrbitModel orbitModel;
	/**
	 * The cached value of the '{@link #getImager() <em>Imager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImager()
	 * @generated
	 * @ordered
	 */
	protected SatelliteImager imager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatellitePackage.Literals.SATELLITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumRollRate() {
		return maximumRollRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRollRate(double newMaximumRollRate) {
		double oldMaximumRollRate = maximumRollRate;
		maximumRollRate = newMaximumRollRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL_RATE, oldMaximumRollRate, maximumRollRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumRoll() {
		return maximumRoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRoll(double newMaximumRoll) {
		double oldMaximumRoll = maximumRoll;
		maximumRoll = newMaximumRoll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL, oldMaximumRoll, maximumRoll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModel getOrbitModel() {
		return orbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrbitModel(OrbitModel newOrbitModel, NotificationChain msgs) {
		OrbitModel oldOrbitModel = orbitModel;
		orbitModel = newOrbitModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL, oldOrbitModel, newOrbitModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbitModel(OrbitModel newOrbitModel) {
		if (newOrbitModel != orbitModel) {
			NotificationChain msgs = null;
			if (orbitModel != null)
				msgs = ((InternalEObject)orbitModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL, null, msgs);
			if (newOrbitModel != null)
				msgs = ((InternalEObject)newOrbitModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL, null, msgs);
			msgs = basicSetOrbitModel(newOrbitModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL, newOrbitModel, newOrbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatelliteImager getImager() {
		return imager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImager(SatelliteImager newImager, NotificationChain msgs) {
		SatelliteImager oldImager = imager;
		imager = newImager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE__IMAGER, oldImager, newImager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImager(SatelliteImager newImager) {
		if (newImager != imager) {
			NotificationChain msgs = null;
			if (imager != null)
				msgs = ((InternalEObject)imager).eInverseRemove(this, Symphony__ExamplesSatellitePackage.SATELLITE_IMAGER__SATELLITE, SatelliteImager.class, msgs);
			if (newImager != null)
				msgs = ((InternalEObject)newImager).eInverseAdd(this, Symphony__ExamplesSatellitePackage.SATELLITE_IMAGER__SATELLITE, SatelliteImager.class, msgs);
			msgs = basicSetImager(newImager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE__IMAGER, newImager, newImager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean roll(double targetRollAngle) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitalImage acquireImage(double zoom) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public boolean enqueueSatelliteCommand(SatelliteCommand command) {
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
			case Symphony__ExamplesSatellitePackage.SATELLITE__IMAGER:
				if (imager != null)
					msgs = ((InternalEObject)imager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__ExamplesSatellitePackage.SATELLITE__IMAGER, null, msgs);
				return basicSetImager((SatelliteImager)otherEnd, msgs);
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
			case Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL:
				return basicSetOrbitModel(null, msgs);
			case Symphony__ExamplesSatellitePackage.SATELLITE__IMAGER:
				return basicSetImager(null, msgs);
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
			case Symphony__ExamplesSatellitePackage.SATELLITE__NAME:
				return getName();
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL_RATE:
				return getMaximumRollRate();
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL:
				return getMaximumRoll();
			case Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL:
				return getOrbitModel();
			case Symphony__ExamplesSatellitePackage.SATELLITE__IMAGER:
				return getImager();
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
			case Symphony__ExamplesSatellitePackage.SATELLITE__NAME:
				setName((String)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL_RATE:
				setMaximumRollRate((Double)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL:
				setMaximumRoll((Double)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL:
				setOrbitModel((OrbitModel)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__IMAGER:
				setImager((SatelliteImager)newValue);
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
			case Symphony__ExamplesSatellitePackage.SATELLITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL_RATE:
				setMaximumRollRate(MAXIMUM_ROLL_RATE_EDEFAULT);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL:
				setMaximumRoll(MAXIMUM_ROLL_EDEFAULT);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL:
				setOrbitModel((OrbitModel)null);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__IMAGER:
				setImager((SatelliteImager)null);
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
			case Symphony__ExamplesSatellitePackage.SATELLITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL_RATE:
				return maximumRollRate != MAXIMUM_ROLL_RATE_EDEFAULT;
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL:
				return maximumRoll != MAXIMUM_ROLL_EDEFAULT;
			case Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL:
				return orbitModel != null;
			case Symphony__ExamplesSatellitePackage.SATELLITE__IMAGER:
				return imager != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__ExamplesSatellitePackage.SATELLITE___ROLL__DOUBLE:
				return roll((Double)arguments.get(0));
			case Symphony__ExamplesSatellitePackage.SATELLITE___ACQUIRE_IMAGE__DOUBLE:
				return acquireImage((Double)arguments.get(0));
			case Symphony__ExamplesSatellitePackage.SATELLITE___DOWNLOAD_IMAGES__INT:
				return downloadImages((Integer)arguments.get(0));
			case Symphony__ExamplesSatellitePackage.SATELLITE___ENQUEUE_SATELLITE_COMMAND__SATELLITECOMMAND:
				return enqueueSatelliteCommand((SatelliteCommand)arguments.get(0));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", maximumRollRate: ");
		result.append(maximumRollRate);
		result.append(", maximumRoll: ");
		result.append(maximumRoll);
		result.append(')');
		return result.toString();
	}

} //SatelliteImpl
