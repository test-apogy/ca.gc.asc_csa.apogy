/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.antenna.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.antenna.DishAntenna;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.antenna.EMFEcoreExampleAntennaPackage;
import ca.gc.space.mrt.sensors.fov.ConicalFieldOfView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dish Antenna</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.antenna.impl.DishAntennaImpl#getFov <em>Fov</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DishAntennaImpl extends AntennaImpl implements DishAntenna
{
	/**
	 * The cached value of the '{@link #getFov() <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFov()
	 * @generated
	 * @ordered
	 */
	protected ConicalFieldOfView fov;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DishAntennaImpl()
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
		return EMFEcoreExampleAntennaPackage.Literals.DISH_ANTENNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConicalFieldOfView getFov()
	{
		return fov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFov(ConicalFieldOfView newFov, NotificationChain msgs)
	{
		ConicalFieldOfView oldFov = fov;
		fov = newFov;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreExampleAntennaPackage.DISH_ANTENNA__FOV, oldFov, newFov);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFov(ConicalFieldOfView newFov)
	{
		if (newFov != fov) {
			NotificationChain msgs = null;
			if (fov != null)
				msgs = ((InternalEObject)fov).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleAntennaPackage.DISH_ANTENNA__FOV, null, msgs);
			if (newFov != null)
				msgs = ((InternalEObject)newFov).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleAntennaPackage.DISH_ANTENNA__FOV, null, msgs);
			msgs = basicSetFov(newFov, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleAntennaPackage.DISH_ANTENNA__FOV, newFov, newFov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case EMFEcoreExampleAntennaPackage.DISH_ANTENNA__FOV:
				return basicSetFov(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case EMFEcoreExampleAntennaPackage.DISH_ANTENNA__FOV:
				return getFov();
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
			case EMFEcoreExampleAntennaPackage.DISH_ANTENNA__FOV:
				setFov((ConicalFieldOfView)newValue);
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
			case EMFEcoreExampleAntennaPackage.DISH_ANTENNA__FOV:
				setFov((ConicalFieldOfView)null);
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
			case EMFEcoreExampleAntennaPackage.DISH_ANTENNA__FOV:
				return fov != null;
		}
		return super.eIsSet(featureID);
	}

} //DishAntennaImpl
