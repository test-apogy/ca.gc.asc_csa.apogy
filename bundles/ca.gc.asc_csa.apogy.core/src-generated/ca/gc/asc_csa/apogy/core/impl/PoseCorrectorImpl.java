package ca.gc.asc_csa.apogy.core.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.PoseCorrector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pose Corrector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.PoseCorrectorImpl#getApogySystemApiAdapter <em>Apogy System Api Adapter</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.PoseCorrectorImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
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
		return ApogyCorePackage.Literals.POSE_CORRECTOR;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogySystemApiAdapter getApogySystemApiAdapter()
  {
		if (eContainerFeatureID() != ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER) return null;
		return (ApogySystemApiAdapter)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogySystemApiAdapter basicGetApogySystemApiAdapter()
  {
		if (eContainerFeatureID() != ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER) return null;
		return (ApogySystemApiAdapter)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetApogySystemApiAdapter(ApogySystemApiAdapter newApogySystemApiAdapter, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newApogySystemApiAdapter, ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setApogySystemApiAdapter(ApogySystemApiAdapter newApogySystemApiAdapter)
  {
		if (newApogySystemApiAdapter != eInternalContainer() || (eContainerFeatureID() != ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER && newApogySystemApiAdapter != null)) {
			if (EcoreUtil.isAncestor(this, newApogySystemApiAdapter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApogySystemApiAdapter != null)
				msgs = ((InternalEObject)newApogySystemApiAdapter).eInverseAdd(this, ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR, ApogySystemApiAdapter.class, msgs);
			msgs = basicSetApogySystemApiAdapter(newApogySystemApiAdapter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER, newApogySystemApiAdapter, newApogySystemApiAdapter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.POSE_CORRECTOR__ENABLED, oldEnabled, enabled));
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
			case ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApogySystemApiAdapter((ApogySystemApiAdapter)otherEnd, msgs);
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
			case ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER:
				return basicSetApogySystemApiAdapter(null, msgs);
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
			case ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER:
				return eInternalContainer().eInverseRemove(this, ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR, ApogySystemApiAdapter.class, msgs);
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
			case ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER:
				if (resolve) return getApogySystemApiAdapter();
				return basicGetApogySystemApiAdapter();
			case ApogyCorePackage.POSE_CORRECTOR__ENABLED:
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
			case ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER:
				setApogySystemApiAdapter((ApogySystemApiAdapter)newValue);
				return;
			case ApogyCorePackage.POSE_CORRECTOR__ENABLED:
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
			case ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER:
				setApogySystemApiAdapter((ApogySystemApiAdapter)null);
				return;
			case ApogyCorePackage.POSE_CORRECTOR__ENABLED:
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
			case ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER:
				return basicGetApogySystemApiAdapter() != null;
			case ApogyCorePackage.POSE_CORRECTOR__ENABLED:
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
			case ApogyCorePackage.POSE_CORRECTOR___APPLY_CORRECTION__MATRIX4X4:
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
