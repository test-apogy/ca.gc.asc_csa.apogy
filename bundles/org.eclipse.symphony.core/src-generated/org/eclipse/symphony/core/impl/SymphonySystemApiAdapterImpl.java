/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.math.Symphony__CommonMathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.OperationCallPositionedResult;
import org.eclipse.symphony.core.PoseCorrector;
import org.eclipse.symphony.core.PoseProvider;
import org.eclipse.symphony.core.Symphony__CoreFacade;
import org.eclipse.symphony.core.Symphony__CoreFactory;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.SymphonyInitializationData;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.OperationCallResult;
import org.eclipse.symphony.core.invocator.impl.TypeApiAdapterImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Symphony System Api Adapter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.SymphonySystemApiAdapterImpl#getPoseTransform <em>Pose Transform</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.SymphonySystemApiAdapterImpl#getPoseCorrector <em>Pose Corrector</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.impl.SymphonySystemApiAdapterImpl#getSymphonySystem <em>Symphony System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymphonySystemApiAdapterImpl extends TypeApiAdapterImpl implements	SymphonySystemApiAdapter 
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
	 * The cached value of the '{@link #getSymphonySystem() <em>Symphony System</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSymphonySystem()
	 * @generated
	 * @ordered
	 */
	protected SymphonySystem symphonySystem;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SymphonySystemApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CorePackage.Literals.SYMPHONY_SYSTEM_API_ADAPTER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM, oldPoseTransform, newPoseTransform);
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
				msgs = ((InternalEObject)poseTransform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM, null, msgs);
			if (newPoseTransform != null)
				msgs = ((InternalEObject)newPoseTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM, null, msgs);
			msgs = basicSetPoseTransform(newPoseTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM, newPoseTransform, newPoseTransform));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR, oldPoseCorrector, newPoseCorrector);
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
				msgs = ((InternalEObject)poseCorrector).eInverseRemove(this, Symphony__CorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER, PoseCorrector.class, msgs);
			if (newPoseCorrector != null)
				msgs = ((InternalEObject)newPoseCorrector).eInverseAdd(this, Symphony__CorePackage.POSE_CORRECTOR__SYMPHONY_SYSTEM_API_ADAPTER, PoseCorrector.class, msgs);
			msgs = basicSetPoseCorrector(newPoseCorrector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR, newPoseCorrector, newPoseCorrector));
	}

  @Override
	public OperationCallResult createResult(OperationCall operationCall) {
		return Symphony__CoreFactory.eINSTANCE.createOperationCallPositionedResult();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonySystem getSymphonySystem() {
		if (symphonySystem != null && symphonySystem.eIsProxy()) {
			InternalEObject oldSymphonySystem = (InternalEObject)symphonySystem;
			symphonySystem = (SymphonySystem)eResolveProxy(oldSymphonySystem);
			if (symphonySystem != oldSymphonySystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM, oldSymphonySystem, symphonySystem));
			}
		}
		return symphonySystem;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonySystem basicGetSymphonySystem() {
		return symphonySystem;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymphonySystem(SymphonySystem newSymphonySystem) {
		SymphonySystem oldSymphonySystem = symphonySystem;
		symphonySystem = newSymphonySystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM, oldSymphonySystem, symphonySystem));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Matrix4x4 createResultMatrix(OperationCall operationCall) {
		Matrix4d m = new Matrix4d();
		m.setIdentity();
		return Symphony__CommonMathFacade.INSTANCE.createMatrix4x4(m);
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
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
				if (poseCorrector != null)
					msgs = ((InternalEObject)poseCorrector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR, null, msgs);
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
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM:
				return basicSetPoseTransform(null, msgs);
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
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
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM:
				return getPoseTransform();
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
				return getPoseCorrector();
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM:
				if (resolve) return getSymphonySystem();
				return basicGetSymphonySystem();
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
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM:
				setPoseTransform((Matrix4x4)newValue);
				return;
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
				setPoseCorrector((PoseCorrector)newValue);
				return;
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM:
				setSymphonySystem((SymphonySystem)newValue);
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
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM:
				setPoseTransform((Matrix4x4)null);
				return;
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
				setPoseCorrector((PoseCorrector)null);
				return;
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM:
				setSymphonySystem((SymphonySystem)null);
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
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM:
				return poseTransform != null;
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR:
				return poseCorrector != null;
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM:
				return symphonySystem != null;
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
				case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM: return Symphony__CorePackage.POSE_PROVIDER__POSE_TRANSFORM;
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
				case Symphony__CorePackage.POSE_PROVIDER__POSE_TRANSFORM: return Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;
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
			case Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL:
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
		Matrix4x4 absolutePose = Symphony__CoreFacade.INSTANCE.computeAbsolutePoseMatrix(getSymphonySystem(), relativePose);

		result.setRelativePose(relativePose);
		result.setPose(absolutePose);

		return result;
	}

	@Override
	public void apply(AbstractInitializationData initializationData) {
		super.apply(initializationData);
		if (initializationData instanceof SymphonyInitializationData) {
			SymphonyInitializationData data = (SymphonyInitializationData) initializationData;
			setPoseTransform(EcoreUtil.copy(data.getInitialPoseTransform()));
		}
	}

	@Override
	public AbstractInitializationData createInitializationData() {
		return Symphony__CoreFactory.eINSTANCE.createSymphonyInitializationData();
	}

	@Override
	public void collect(AbstractInitializationData data) {
		super.collect(data);
		SymphonyInitializationData symphonyInitializationData = (SymphonyInitializationData) data;
		symphonyInitializationData.setInitialPoseTransform(EcoreUtil.copy(getPoseTransform()));
	}
		
} // SymphonySystemApiAdapterImpl
