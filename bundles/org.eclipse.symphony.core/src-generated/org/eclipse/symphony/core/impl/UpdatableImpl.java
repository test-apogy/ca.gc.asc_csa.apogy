/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.Updatable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Updatable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.UpdatableImpl#isUpdating <em>Updating</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.UpdatableImpl#isAutoUpdateEnabled <em>Auto Update Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UpdatableImpl extends MinimalEObjectImpl.Container implements Updatable {
	/**
	 * The default value of the '{@link #isUpdating() <em>Updating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUpdating() <em>Updating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdating()
	 * @generated
	 * @ordered
	 */
	protected boolean updating = UPDATING_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoUpdateEnabled() <em>Auto Update Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoUpdateEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_UPDATE_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoUpdateEnabled() <em>Auto Update Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoUpdateEnabled()
	 * @generated_NOT
	 * @ordered
	 */
	protected boolean autoUpdateEnabled = getDefaultAutoUpdateEnabled();;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdatableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCorePackage.Literals.UPDATABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdating() {
		return updating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdating(boolean newUpdating) {
		boolean oldUpdating = updating;
		updating = newUpdating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.UPDATABLE__UPDATING, oldUpdating, updating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoUpdateEnabled() {
		return autoUpdateEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setAutoUpdateEnabled(boolean newAutoUpdateEnabled)
	{
		boolean previousautoUpdateEnabled  = getDefaultAutoUpdateEnabled();
		
		setAutoUpdateEnabledGen(newAutoUpdateEnabled);
		
		// If AutoUpdateEnabled has changed from false to true, updates.
		if(newAutoUpdateEnabled && !previousautoUpdateEnabled)
		{
			try
			{
				update();
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoUpdateEnabledGen(boolean newAutoUpdateEnabled) {
		boolean oldAutoUpdateEnabled = autoUpdateEnabled;
		autoUpdateEnabled = newAutoUpdateEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.UPDATABLE__AUTO_UPDATE_ENABLED, oldAutoUpdateEnabled, autoUpdateEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public boolean getDefaultAutoUpdateEnabled() 
	{
		return false;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update() throws Exception {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCorePackage.UPDATABLE__UPDATING:
				return isUpdating();
			case SymphonyCorePackage.UPDATABLE__AUTO_UPDATE_ENABLED:
				return isAutoUpdateEnabled();
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
			case SymphonyCorePackage.UPDATABLE__UPDATING:
				setUpdating((Boolean)newValue);
				return;
			case SymphonyCorePackage.UPDATABLE__AUTO_UPDATE_ENABLED:
				setAutoUpdateEnabled((Boolean)newValue);
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
			case SymphonyCorePackage.UPDATABLE__UPDATING:
				setUpdating(UPDATING_EDEFAULT);
				return;
			case SymphonyCorePackage.UPDATABLE__AUTO_UPDATE_ENABLED:
				setAutoUpdateEnabled(AUTO_UPDATE_ENABLED_EDEFAULT);
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
			case SymphonyCorePackage.UPDATABLE__UPDATING:
				return updating != UPDATING_EDEFAULT;
			case SymphonyCorePackage.UPDATABLE__AUTO_UPDATE_ENABLED:
				return autoUpdateEnabled != AUTO_UPDATE_ENABLED_EDEFAULT;
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
			case SymphonyCorePackage.UPDATABLE___GET_DEFAULT_AUTO_UPDATE_ENABLED:
				return getDefaultAutoUpdateEnabled();
			case SymphonyCorePackage.UPDATABLE___UPDATE:
				try {
					update();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		result.append(" (updating: ");
		result.append(updating);
		result.append(", autoUpdateEnabled: ");
		result.append(autoUpdateEnabled);
		result.append(')');
		return result.toString();
	}

} //UpdatableImpl
