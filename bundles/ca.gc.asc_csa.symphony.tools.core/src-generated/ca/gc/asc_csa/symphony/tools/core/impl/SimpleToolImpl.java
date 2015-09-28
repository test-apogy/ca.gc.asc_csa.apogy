/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.symphony.tools.core.SimpleTool;
import ca.gc.asc_csa.symphony.tools.core.SimpleToolList;
import ca.gc.asc_csa.symphony.tools.core.SymphonyToolsCorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.core.impl.SimpleToolImpl#getToolList <em>Tool List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.core.impl.SimpleToolImpl#isActive <em>Active</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.core.impl.SimpleToolImpl#isDisposed <em>Disposed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SimpleToolImpl extends AbstractToolImpl implements SimpleTool {
	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPOSED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected boolean disposed = DISPOSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyToolsCorePackage.Literals.SIMPLE_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleToolList getToolList() {
		if (eContainerFeatureID() != SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST) return null;
		return (SimpleToolList)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleToolList basicGetToolList() {
		if (eContainerFeatureID() != SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST) return null;
		return (SimpleToolList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolList(SimpleToolList newToolList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newToolList, SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolList(SimpleToolList newToolList) {
		if (newToolList != eInternalContainer() || (eContainerFeatureID() != SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST && newToolList != null)) {
			if (EcoreUtil.isAncestor(this, newToolList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newToolList != null)
				msgs = ((InternalEObject)newToolList).eInverseAdd(this, SymphonyToolsCorePackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS, SimpleToolList.class, msgs);
			msgs = basicSetToolList(newToolList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST, newToolList, newToolList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.SIMPLE_TOOL__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisposed() {
		return disposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposed(boolean newDisposed) {
		boolean oldDisposed = disposed;
		disposed = newDisposed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.SIMPLE_TOOL__DISPOSED, oldDisposed, disposed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void dispose() 
	{
		setDisposed(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetToolList((SimpleToolList)otherEnd, msgs);
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
			case SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST:
				return basicSetToolList(null, msgs);
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
			case SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST:
				return eInternalContainer().eInverseRemove(this, SymphonyToolsCorePackage.SIMPLE_TOOL_LIST__SIMPLE_TOOLS, SimpleToolList.class, msgs);
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
			case SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST:
				if (resolve) return getToolList();
				return basicGetToolList();
			case SymphonyToolsCorePackage.SIMPLE_TOOL__ACTIVE:
				return isActive();
			case SymphonyToolsCorePackage.SIMPLE_TOOL__DISPOSED:
				return isDisposed();
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
			case SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST:
				setToolList((SimpleToolList)newValue);
				return;
			case SymphonyToolsCorePackage.SIMPLE_TOOL__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case SymphonyToolsCorePackage.SIMPLE_TOOL__DISPOSED:
				setDisposed((Boolean)newValue);
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
			case SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST:
				setToolList((SimpleToolList)null);
				return;
			case SymphonyToolsCorePackage.SIMPLE_TOOL__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case SymphonyToolsCorePackage.SIMPLE_TOOL__DISPOSED:
				setDisposed(DISPOSED_EDEFAULT);
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
			case SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST:
				return basicGetToolList() != null;
			case SymphonyToolsCorePackage.SIMPLE_TOOL__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case SymphonyToolsCorePackage.SIMPLE_TOOL__DISPOSED:
				return disposed != DISPOSED_EDEFAULT;
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
			case SymphonyToolsCorePackage.SIMPLE_TOOL___DISPOSE:
				dispose();
				return null;
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
		result.append(" (active: ");
		result.append(active);
		result.append(", disposed: ");
		result.append(disposed);
		result.append(')');
		return result.toString();
	}

} //SimpleToolImpl
