/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage;
import org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding;
import org.eclipse.symphony.core.programs.controllers.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.TriggerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.TriggerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.TriggerImpl#getOperationCallControllerBinding <em>Operation Call Controller Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger
{
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TriggerImpl()
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
		return EMFEcoreControllersPackage.Literals.TRIGGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.TRIGGER__NAME, oldName, name));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.TRIGGER__DESCRIPTION, oldDescription, description));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallControllerBinding getOperationCallControllerBinding()
  {
		if (eContainerFeatureID() != EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING) return null;
		return (OperationCallControllerBinding)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallControllerBinding basicGetOperationCallControllerBinding()
  {
		if (eContainerFeatureID() != EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING) return null;
		return (OperationCallControllerBinding)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOperationCallControllerBinding(OperationCallControllerBinding newOperationCallControllerBinding, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newOperationCallControllerBinding, EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOperationCallControllerBinding(OperationCallControllerBinding newOperationCallControllerBinding)
  {
		if (newOperationCallControllerBinding != eInternalContainer() || (eContainerFeatureID() != EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING && newOperationCallControllerBinding != null)) {
			if (EcoreUtil.isAncestor(this, newOperationCallControllerBinding))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperationCallControllerBinding != null)
				msgs = ((InternalEObject)newOperationCallControllerBinding).eInverseAdd(this, EMFEcoreControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER, OperationCallControllerBinding.class, msgs);
			msgs = basicSetOperationCallControllerBinding(newOperationCallControllerBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING, newOperationCallControllerBinding, newOperationCallControllerBinding));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperationCallControllerBinding((OperationCallControllerBinding)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING:
				return basicSetOperationCallControllerBinding(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING:
				return eInternalContainer().eInverseRemove(this, EMFEcoreControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER, OperationCallControllerBinding.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case EMFEcoreControllersPackage.TRIGGER__NAME:
				return getName();
			case EMFEcoreControllersPackage.TRIGGER__DESCRIPTION:
				return getDescription();
			case EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING:
				if (resolve) return getOperationCallControllerBinding();
				return basicGetOperationCallControllerBinding();
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
			case EMFEcoreControllersPackage.TRIGGER__NAME:
				setName((String)newValue);
				return;
			case EMFEcoreControllersPackage.TRIGGER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING:
				setOperationCallControllerBinding((OperationCallControllerBinding)newValue);
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
			case EMFEcoreControllersPackage.TRIGGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EMFEcoreControllersPackage.TRIGGER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING:
				setOperationCallControllerBinding((OperationCallControllerBinding)null);
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
			case EMFEcoreControllersPackage.TRIGGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EMFEcoreControllersPackage.TRIGGER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EMFEcoreControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING:
				return basicGetOperationCallControllerBinding() != null;
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
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case EMFEcoreControllersPackage.TRIGGER__DESCRIPTION: return Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION;
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
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION: return EMFEcoreControllersPackage.TRIGGER__DESCRIPTION;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
