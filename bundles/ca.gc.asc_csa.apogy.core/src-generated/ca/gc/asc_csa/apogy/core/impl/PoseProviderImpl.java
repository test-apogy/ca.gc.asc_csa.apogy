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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.PoseProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pose Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.PoseProviderImpl#getPoseTransform <em>Pose Transform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoseProviderImpl extends MinimalEObjectImpl.Container implements PoseProvider
{
  /**
	 * The cached value of the '{@link #getPoseTransform() <em>Pose Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPoseTransform()
	 * @generated
	 * @ordered
	 */
  protected Matrix4x4 poseTransform;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PoseProviderImpl()
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
		return ApogyCorePackage.Literals.POSE_PROVIDER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Matrix4x4 getPoseTransform()
  {
		return poseTransform;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPoseTransform(Matrix4x4 newPoseTransform, NotificationChain msgs)
  {
		Matrix4x4 oldPoseTransform = poseTransform;
		poseTransform = newPoseTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM, oldPoseTransform, newPoseTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPoseTransform(Matrix4x4 newPoseTransform)
  {
		if (newPoseTransform != poseTransform) {
			NotificationChain msgs = null;
			if (poseTransform != null)
				msgs = ((InternalEObject)poseTransform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM, null, msgs);
			if (newPoseTransform != null)
				msgs = ((InternalEObject)newPoseTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM, null, msgs);
			msgs = basicSetPoseTransform(newPoseTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM, newPoseTransform, newPoseTransform));
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
			case ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM:
				return basicSetPoseTransform(null, msgs);
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
			case ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM:
				return getPoseTransform();
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
			case ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM:
				setPoseTransform((Matrix4x4)newValue);
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
			case ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM:
				setPoseTransform((Matrix4x4)null);
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
			case ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM:
				return poseTransform != null;
		}
		return super.eIsSet(featureID);
	}

} //PoseProviderImpl
