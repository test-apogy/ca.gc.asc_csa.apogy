/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import java.awt.image.BufferedImage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.symphony.core.environment.GeographicCoordinates;

import org.eclipse.symphony.examples.satellite.OrbitalImage;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orbital Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl#getRollAngle <em>Roll Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrbitalImageImpl extends MinimalEObjectImpl.Container implements OrbitalImage {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected GeographicCoordinates coordinates;

	/**
	 * The default value of the '{@link #getRollAngle() <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double ROLL_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRollAngle() <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollAngle()
	 * @generated
	 * @ordered
	 */
	protected double rollAngle = ROLL_ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbitalImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatellitePackage.Literals.ORBITAL_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCoordinates getCoordinates() {
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinates(GeographicCoordinates newCoordinates, NotificationChain msgs) {
		GeographicCoordinates oldCoordinates = coordinates;
		coordinates = newCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__COORDINATES, oldCoordinates, newCoordinates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinates(GeographicCoordinates newCoordinates) {
		if (newCoordinates != coordinates) {
			NotificationChain msgs = null;
			if (coordinates != null)
				msgs = ((InternalEObject)coordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__COORDINATES, null, msgs);
			if (newCoordinates != null)
				msgs = ((InternalEObject)newCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__COORDINATES, null, msgs);
			msgs = basicSetCoordinates(newCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__COORDINATES, newCoordinates, newCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRollAngle() {
		return rollAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollAngle(double newRollAngle) {
		double oldRollAngle = rollAngle;
		rollAngle = newRollAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__ROLL_ANGLE, oldRollAngle, rollAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedImage asBufferedImage() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__COORDINATES:
				return basicSetCoordinates(null, msgs);
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
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__WIDTH:
				return getWidth();
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__HEIGHT:
				return getHeight();
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__COORDINATES:
				return getCoordinates();
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__ROLL_ANGLE:
				return getRollAngle();
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
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__COORDINATES:
				setCoordinates((GeographicCoordinates)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__ROLL_ANGLE:
				setRollAngle((Double)newValue);
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
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__COORDINATES:
				setCoordinates((GeographicCoordinates)null);
				return;
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__ROLL_ANGLE:
				setRollAngle(ROLL_ANGLE_EDEFAULT);
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
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__COORDINATES:
				return coordinates != null;
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE__ROLL_ANGLE:
				return rollAngle != ROLL_ANGLE_EDEFAULT;
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
			case Symphony__ExamplesSatellitePackage.ORBITAL_IMAGE___AS_BUFFERED_IMAGE:
				return asBufferedImage();
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", rollAngle: ");
		result.append(rollAngle);
		result.append(')');
		return result.toString();
	}

} //OrbitalImageImpl
