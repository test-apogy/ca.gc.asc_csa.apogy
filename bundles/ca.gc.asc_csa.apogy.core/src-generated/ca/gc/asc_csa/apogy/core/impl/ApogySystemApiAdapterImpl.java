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

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogyInitializationData;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.OperationCallPositionedResult;
import ca.gc.asc_csa.apogy.core.PoseCorrector;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.impl.TypeApiAdapterImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Apogy System Api Adapter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl#getPoseTransform <em>Pose Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl#getPoseCorrector <em>Pose Corrector</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemApiAdapterImpl#getApogySystem <em>Apogy System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogySystemApiAdapterImpl extends TypeApiAdapterImpl implements	ApogySystemApiAdapter 
{
    private Matrix4x4 lastRawPose = null;
	
	/**
	 * The cached value of the '{@link #getPoseTransform() <em>Pose Transform</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPoseTransform()
	 * @generated
	 * @ordered
	 */
	protected Matrix4x4 poseTransform;
	/**
	 * The cached value of the '{@link #getPoseCorrector() <em>Pose Corrector</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPoseCorrector()
	 * @generated
	 * @ordered
	 */
  protected PoseCorrector poseCorrector;
  /**
	 * The cached value of the '{@link #getApogySystem() <em>Apogy System</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getApogySystem()
	 * @generated
	 * @ordered
	 */
	protected ApogySystem apogySystem;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogySystemApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCorePackage.Literals.APOGY_SYSTEM_API_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 getPoseTransform() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM, oldPoseTransform, newPoseTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated_NOT
   */
	public void setPoseTransform(Matrix4x4 newPoseTransform)
	{
		// Updates the last raw pose so we could bo back to it.
		lastRawPose = newPoseTransform;
		
		// If a pose corrector has been provided, use it.
		if(getPoseCorrector() != null)
		{
			Matrix4x4 correctedPose = getPoseCorrector().applyCorrection(newPoseTransform);
			setPoseTransformGen(correctedPose);
		}
		else
		{
			setPoseTransformGen(newPoseTransform);
		}
	}
  
  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoseTransformGen(Matrix4x4 newPoseTransform) {
		if (newPoseTransform != poseTransform) {
			NotificationChain msgs = null;
			if (poseTransform != null)
				msgs = ((InternalEObject)poseTransform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM, null, msgs);
			if (newPoseTransform != null)
				msgs = ((InternalEObject)newPoseTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM, null, msgs);
			msgs = basicSetPoseTransform(newPoseTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM, newPoseTransform, newPoseTransform));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PoseCorrector getPoseCorrector()
  {
		return poseCorrector;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPoseCorrector(PoseCorrector newPoseCorrector, NotificationChain msgs)
  {
		PoseCorrector oldPoseCorrector = poseCorrector;
		poseCorrector = newPoseCorrector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR, oldPoseCorrector, newPoseCorrector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setPoseCorrector(PoseCorrector newPoseCorrector)
  {
	  setPoseCorrectorGen(newPoseCorrector);
	  
	  // Force pose update.
	  setPoseTransform(lastRawPose);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPoseCorrectorGen(PoseCorrector newPoseCorrector)
  {
		if (newPoseCorrector != poseCorrector) {
			NotificationChain msgs = null;
			if (poseCorrector != null)
				msgs = ((InternalEObject)poseCorrector).eInverseRemove(this, ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER, PoseCorrector.class, msgs);
			if (newPoseCorrector != null)
				msgs = ((InternalEObject)newPoseCorrector).eInverseAdd(this, ApogyCorePackage.POSE_CORRECTOR__APOGY_SYSTEM_API_ADAPTER, PoseCorrector.class, msgs);
			msgs = basicSetPoseCorrector(newPoseCorrector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR, newPoseCorrector, newPoseCorrector));
	}

  @Override
	public OperationCallResult createResult(OperationCall operationCall) {
		return ApogyCoreFactory.eINSTANCE.createOperationCallPositionedResult();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySystem getApogySystem() {
		if (apogySystem != null && apogySystem.eIsProxy()) {
			InternalEObject oldApogySystem = (InternalEObject)apogySystem;
			apogySystem = (ApogySystem)eResolveProxy(oldApogySystem);
			if (apogySystem != oldApogySystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM, oldApogySystem, apogySystem));
			}
		}
		return apogySystem;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySystem basicGetApogySystem() {
		return apogySystem;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setApogySystem(ApogySystem newApogySystem) {
		ApogySystem oldApogySystem = apogySystem;
		apogySystem = newApogySystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM, oldApogySystem, apogySystem));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Matrix4x4 createResultMatrix(OperationCall operationCall) {
		Matrix4d m = new Matrix4d();
		m.setIdentity();
		return ApogyCommonMathFacade.INSTANCE.createMatrix4x4(m);
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
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
				if (poseCorrector != null)
					msgs = ((InternalEObject)poseCorrector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR, null, msgs);
				return basicSetPoseCorrector((PoseCorrector)otherEnd, msgs);
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
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM:
				return basicSetPoseTransform(null, msgs);
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
				return basicSetPoseCorrector(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM:
				return getPoseTransform();
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
				return getPoseCorrector();
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM:
				if (resolve) return getApogySystem();
				return basicGetApogySystem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM:
				setPoseTransform((Matrix4x4)newValue);
				return;
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
				setPoseCorrector((PoseCorrector)newValue);
				return;
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM:
				setApogySystem((ApogySystem)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM:
				setPoseTransform((Matrix4x4)null);
				return;
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
				setPoseCorrector((PoseCorrector)null);
				return;
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM:
				setApogySystem((ApogySystem)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM:
				return poseTransform != null;
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
				return poseCorrector != null;
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM:
				return apogySystem != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PoseProvider.class) {
			switch (derivedFeatureID) {
				case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM: return ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PoseProvider.class) {
			switch (baseFeatureID) {
				case ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM: return ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL:
				return createResultMatrix((OperationCall)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public OperationCallResult createResult(OperationCall operationCall, long invocationTime, Object resultValue, Exception exception) 
	{
		OperationCallPositionedResult result = (OperationCallPositionedResult) super.createResult(operationCall, invocationTime, resultValue, exception);

		// Computes the absolute pose of the result.
		Matrix4x4 relativePose = createResultMatrix(operationCall);
		Matrix4x4 absolutePose = ApogyCoreFacade.INSTANCE.computeAbsolutePoseMatrix(getApogySystem(), relativePose);

		result.setRelativePose(relativePose);
		result.setPose(absolutePose);

		return result;
	}

	@Override
	public void apply(AbstractInitializationData initializationData) {
		super.apply(initializationData);
		if (initializationData instanceof ApogyInitializationData) {
			ApogyInitializationData data = (ApogyInitializationData) initializationData;
			setPoseTransform(EcoreUtil.copy(data.getInitialPoseTransform()));
		}
	}

	@Override
	public AbstractInitializationData createInitializationData() {
		return ApogyCoreFactory.eINSTANCE.createApogyInitializationData();
	}

	@Override
	public void collect(AbstractInitializationData data) {
		super.collect(data);
		ApogyInitializationData apogyInitializationData = (ApogyInitializationData) data;
		apogyInitializationData.setInitialPoseTransform(EcoreUtil.copy(getPoseTransform()));
	}
		
} // ApogySystemApiAdapterImpl
