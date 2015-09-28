/**
 * <copyright>
 * </copyright>
 *
 * $Id: MemoryCartesianCoordinatesSetSourceImpl.java,v 1.2.4.2 2015/05/21 15:51:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.persistence.MemoryCartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Memory Cartesian Coordinates Set Source</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link ca.gc.space.mrt.geometry.data3d.persistence.impl.MemoryCartesianCoordinatesSetSourceImpl#getInternalDataSet
 * <em>Internal Data Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MemoryCartesianCoordinatesSetSourceImpl extends
		CartesianCoordinatesSetSourceImpl implements
		MemoryCartesianCoordinatesSetSource {
	/**
	 * The cached value of the '{@link #getInternalDataSet() <em>Internal Data Set</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getInternalDataSet()
	 * @generated
	 * @ordered
	 */
	protected CartesianCoordinatesSet internalDataSet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryCartesianCoordinatesSetSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSet getInternalDataSet() {
		return internalDataSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalDataSet(
			CartesianCoordinatesSet newInternalDataSet, NotificationChain msgs) {
		CartesianCoordinatesSet oldInternalDataSet = internalDataSet;
		internalDataSet = newInternalDataSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistencePackage.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET, oldInternalDataSet, newInternalDataSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setInternalDataSet(CartesianCoordinatesSet newInternalDataSet) {
		if (newInternalDataSet != internalDataSet) {
			NotificationChain msgs = null;
			if (internalDataSet != null)
				msgs = ((InternalEObject) internalDataSet)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- PersistencePackage.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET,
								null, msgs);
			if (newInternalDataSet != null)
				msgs = ((InternalEObject) newInternalDataSet)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- PersistencePackage.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET,
								null, msgs);
			msgs = basicSetInternalDataSet(newInternalDataSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					PersistencePackage.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET,
					newInternalDataSet, newInternalDataSet));

		setDataSet(getInternalDataSet());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PersistencePackage.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET:
				return basicSetInternalDataSet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET:
				return getInternalDataSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersistencePackage.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET:
				setInternalDataSet((CartesianCoordinatesSet)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PersistencePackage.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET:
				setInternalDataSet((CartesianCoordinatesSet)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PersistencePackage.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET:
				return internalDataSet != null;
		}
		return super.eIsSet(featureID);
	}

} // MemoryCartesianCoordinatesSetSourceImpl
