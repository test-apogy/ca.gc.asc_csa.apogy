/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package ca.gc.asc_csa.jinput.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.asc_csa.jinput.EComponentQualifier;
import ca.gc.asc_csa.jinput.JInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EComponent Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EComponentQualifierImpl#getEComponentName <em>EComponent Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.jinput.impl.EComponentQualifierImpl#getEControllerName <em>EController Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EComponentQualifierImpl extends EObjectImpl implements EComponentQualifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * The default value of the '{@link #getEComponentName() <em>EComponent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String ECOMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEComponentName() <em>EComponent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEComponentName()
	 * @generated
	 * @ordered
	 */
	protected String eComponentName = ECOMPONENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEControllerName() <em>EController Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEControllerName()
	 * @generated
	 * @ordered
	 */
	protected static final String ECONTROLLER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEControllerName() <em>EController Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEControllerName()
	 * @generated
	 * @ordered
	 */
	protected String eControllerName = ECONTROLLER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EComponentQualifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JInputPackage.Literals.ECOMPONENT_QUALIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEComponentName() {
		return eComponentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEComponentName(String newEComponentName) {
		String oldEComponentName = eComponentName;
		eComponentName = newEComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME, oldEComponentName, eComponentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEControllerName() {
		return eControllerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEControllerName(String newEControllerName) {
		String oldEControllerName = eControllerName;
		eControllerName = newEControllerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME, oldEControllerName, eControllerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME:
				return getEComponentName();
			case JInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME:
				return getEControllerName();
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
			case JInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME:
				setEComponentName((String)newValue);
				return;
			case JInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME:
				setEControllerName((String)newValue);
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
			case JInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME:
				setEComponentName(ECOMPONENT_NAME_EDEFAULT);
				return;
			case JInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME:
				setEControllerName(ECONTROLLER_NAME_EDEFAULT);
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
			case JInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME:
				return ECOMPONENT_NAME_EDEFAULT == null ? eComponentName != null : !ECOMPONENT_NAME_EDEFAULT.equals(eComponentName);
			case JInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME:
				return ECONTROLLER_NAME_EDEFAULT == null ? eControllerName != null : !ECONTROLLER_NAME_EDEFAULT.equals(eControllerName);
		}
		return super.eIsSet(featureID);
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
		result.append(" (eComponentName: ");
		result.append(eComponentName);
		result.append(", eControllerName: ");
		result.append(eControllerName);
		result.append(')');
		return result.toString();
	}

} //EComponentQualifierImpl
