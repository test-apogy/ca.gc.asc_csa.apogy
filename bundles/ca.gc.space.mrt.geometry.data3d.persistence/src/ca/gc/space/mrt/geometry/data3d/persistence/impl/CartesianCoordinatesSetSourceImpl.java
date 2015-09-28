/**
 * <copyright>
 * </copyright>
 *
 * $Id: CartesianCoordinatesSetSourceImpl.java,v 1.3.4.2 2015/05/21 15:51:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.persistence.CartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Set Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.persistence.impl.CartesianCoordinatesSetSourceImpl#getDataSet <em>Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CartesianCoordinatesSetSourceImpl extends EObjectImpl implements CartesianCoordinatesSetSource {
	/**
	 * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSet()
	 * @generated
	 * @ordered
	 */
	protected CartesianCoordinatesSet dataSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesSetSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.CARTESIAN_COORDINATES_SET_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSet getDataSet() {
		if (dataSet != null && dataSet.eIsProxy()) {
			InternalEObject oldDataSet = (InternalEObject)dataSet;
			dataSet = (CartesianCoordinatesSet)eResolveProxy(oldDataSet);
			if (dataSet != oldDataSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PersistencePackage.CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET, oldDataSet, dataSet));
			}
		}
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSet basicGetDataSet() {
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSet(CartesianCoordinatesSet newDataSet) {
		CartesianCoordinatesSet oldDataSet = dataSet;
		dataSet = newDataSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET, oldDataSet, dataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET:
				if (resolve) return getDataSet();
				return basicGetDataSet();
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
			case PersistencePackage.CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET:
				setDataSet((CartesianCoordinatesSet)newValue);
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
			case PersistencePackage.CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET:
				setDataSet((CartesianCoordinatesSet)null);
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
			case PersistencePackage.CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET:
				return dataSet != null;
		}
		return super.eIsSet(featureID);
	}

} //CartesianCoordinatesSetSourceImpl
