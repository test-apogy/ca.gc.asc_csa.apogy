/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package ca.gc.asc_csa.apogy.common.io.jinput.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponent;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponents;
import ca.gc.asc_csa.apogy.common.io.jinput.EController;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EComponents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentsImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentsImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentsImpl#getEController <em>EController</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EComponentsImpl extends MinimalEObjectImpl.Container implements EComponents {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> components;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonIOJInputPackage.Literals.ECOMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentWithInverseEList<EComponent>(EComponent.class, this, ApogyCommonIOJInputPackage.ECOMPONENTS__COMPONENTS, ApogyCommonIOJInputPackage.ECOMPONENT__ECOMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonIOJInputPackage.ECOMPONENTS__NAME, oldName, name));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EController getEController() {
		if (eContainerFeatureID() != ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER) return null;
		return (EController)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EController basicGetEController() {
		if (eContainerFeatureID() != ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER) return null;
		return (EController)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEController(EController newEController, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEController, ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEController(EController newEController) {
		if (newEController != eInternalContainer() || (eContainerFeatureID() != ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER && newEController != null)) {
			if (EcoreUtil.isAncestor(this, newEController))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEController != null)
				msgs = ((InternalEObject)newEController).eInverseAdd(this, ApogyCommonIOJInputPackage.ECONTROLLER__ECOMPONENTS, EController.class, msgs);
			msgs = basicSetEController(newEController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER, newEController, newEController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonIOJInputPackage.ECOMPONENTS__COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponents()).basicAdd(otherEnd, msgs);
			case ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEController((EController)otherEnd, msgs);
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
			case ApogyCommonIOJInputPackage.ECOMPONENTS__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER:
				return basicSetEController(null, msgs);
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
			case ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER:
				return eInternalContainer().eInverseRemove(this, ApogyCommonIOJInputPackage.ECONTROLLER__ECOMPONENTS, EController.class, msgs);
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
			case ApogyCommonIOJInputPackage.ECOMPONENTS__COMPONENTS:
				return getComponents();
			case ApogyCommonIOJInputPackage.ECOMPONENTS__NAME:
				return getName();
			case ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER:
				if (resolve) return getEController();
				return basicGetEController();
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
			case ApogyCommonIOJInputPackage.ECOMPONENTS__NAME:
				setName((String)newValue);
				return;
			case ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER:
				setEController((EController)newValue);
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
			case ApogyCommonIOJInputPackage.ECOMPONENTS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER:
				setEController((EController)null);
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
			case ApogyCommonIOJInputPackage.ECOMPONENTS__COMPONENTS:
				return components != null && !components.isEmpty();
			case ApogyCommonIOJInputPackage.ECOMPONENTS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCommonIOJInputPackage.ECOMPONENTS__ECONTROLLER:
				return basicGetEController() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EComponentsImpl
