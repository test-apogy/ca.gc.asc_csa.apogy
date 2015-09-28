/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.symphony.core.PoseCorrector;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter;
import ca.gc.space.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pose Corrector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.PoseCorrectorImpl#getSymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.PoseCorrectorImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PoseCorrectorImpl extends MinimalEObjectImpl.Container implements PoseCorrector
{
  /**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
  protected static final boolean ENABLED_EDEFAULT = false;
  /**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
  protected boolean enabled = ENABLED_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PoseCorrectorImpl()
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
		return SymphonyCorePackage.Literals.POSE_CORRECTOR;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonySystemApiAdapter getSymphonySystemApiAdapter()
  {
		if (eContainerFeatureID() != SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER) return null;
		return (SymphonySystemApiAdapter)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonySystemApiAdapter basicGetSymphonySystemApiAdapter()
  {
		if (eContainerFeatureID() != SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER) return null;
		return (SymphonySystemApiAdapter)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSymphonySystemApiAdapter(SymphonySystemApiAdapter newSymphonySystemApiAdapter, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newSymphonySystemApiAdapter, SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSymphonySystemApiAdapter(SymphonySystemApiAdapter newSymphonySystemApiAdapter)
  {
		if (newSymphonySystemApiAdapter != eInternalContainer() || (eContainerFeatureID() != SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER && newSymphonySystemApiAdapter != null)) {
			if (EcoreUtil.isAncestor(this, newSymphonySystemApiAdapter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSymphonySystemApiAdapter != null)
				msgs = ((InternalEObject)newSymphonySystemApiAdapter).eInverseAdd(this, SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR, SymphonySystemApiAdapter.class, msgs);
			msgs = basicSetSymphonySystemApiAdapter(newSymphonySystemApiAdapter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER, newSymphonySystemApiAdapter, newSymphonySystemApiAdapter));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isEnabled()
  {
		return enabled;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEnabled(boolean newEnabled)
  {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.POSE_CORRECTOR__ENABLED, oldEnabled, enabled));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Matrix4x4 applyCorrection(Matrix4x4 originalPose)
  {
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
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSymphonySystemApiAdapter((SymphonySystemApiAdapter)otherEnd, msgs);
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
			case SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER:
				return basicSetSymphonySystemApiAdapter(null, msgs);
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
			case SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER:
				return eInternalContainer().eInverseRemove(this, SymphonyCorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR, SymphonySystemApiAdapter.class, msgs);
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
			case SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER:
				if (resolve) return getSymphonySystemApiAdapter();
				return basicGetSymphonySystemApiAdapter();
			case SymphonyCorePackage.POSE_CORRECTOR__ENABLED:
				return isEnabled();
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
			case SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER:
				setSymphonySystemApiAdapter((SymphonySystemApiAdapter)newValue);
				return;
			case SymphonyCorePackage.POSE_CORRECTOR__ENABLED:
				setEnabled((Boolean)newValue);
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
			case SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER:
				setSymphonySystemApiAdapter((SymphonySystemApiAdapter)null);
				return;
			case SymphonyCorePackage.POSE_CORRECTOR__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
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
			case SymphonyCorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER:
				return basicGetSymphonySystemApiAdapter() != null;
			case SymphonyCorePackage.POSE_CORRECTOR__ENABLED:
				return enabled != ENABLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case SymphonyCorePackage.POSE_CORRECTOR___APPLY_CORRECTION__MATRIX4X4:
				return applyCorrection((Matrix4x4)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} //PoseCorrectorImpl
