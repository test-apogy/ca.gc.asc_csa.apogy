/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.core.PoseProvider;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage;
import org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation;
import org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider;
import org.jfree.data.xy.XYSeries;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Trajectory Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.impl.VariableTrajectoryProviderImpl#getVariableAnnotation <em>Variable Annotation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.impl.VariableTrajectoryProviderImpl#getPoseProvider <em>Pose Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariableTrajectoryProviderImpl extends TrajectoryProviderImpl implements VariableTrajectoryProvider
{ 	
  private XYSeries xySeries = null;
	
  /**
	 * The cached value of the '{@link #getPoseProvider() <em>Pose Provider</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPoseProvider()
	 * @generated
	 * @ordered
	 */
  protected PoseProvider poseProvider;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VariableTrajectoryProviderImpl()
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
		return SymphonyEnvironmentUIPackage.Literals.VARIABLE_TRAJECTORY_PROVIDER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableTrajectoryAnnotation getVariableAnnotation()
  {
		if (eContainerFeatureID() != SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION) return null;
		return (VariableTrajectoryAnnotation)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableTrajectoryAnnotation basicGetVariableAnnotation()
  {
		if (eContainerFeatureID() != SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION) return null;
		return (VariableTrajectoryAnnotation)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariableAnnotation(VariableTrajectoryAnnotation newVariableAnnotation, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newVariableAnnotation, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION, msgs);
		return msgs;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setVariableAnnotation(VariableTrajectoryAnnotation newVariableAnnotation)
  {
	  setVariableAnnotationGen(newVariableAnnotation);
	  
	  if(newVariableAnnotation != null)
	  {
		  setPoseProvider(newVariableAnnotation.getSymphonySystemApiAdapter());		  		 
	  }
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableAnnotationGen(VariableTrajectoryAnnotation newVariableAnnotation)
  {
		if (newVariableAnnotation != eInternalContainer() || (eContainerFeatureID() != SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION && newVariableAnnotation != null)) {
			if (EcoreUtil.isAncestor(this, newVariableAnnotation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableAnnotation != null)
				msgs = ((InternalEObject)newVariableAnnotation).eInverseAdd(this, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER, VariableTrajectoryAnnotation.class, msgs);
			msgs = basicSetVariableAnnotation(newVariableAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION, newVariableAnnotation, newVariableAnnotation));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PoseProvider getPoseProvider()
  {
		if (poseProvider != null && poseProvider.eIsProxy()) {
			InternalEObject oldPoseProvider = (InternalEObject)poseProvider;
			poseProvider = (PoseProvider)eResolveProxy(oldPoseProvider);
			if (poseProvider != oldPoseProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER, oldPoseProvider, poseProvider));
			}
		}
		return poseProvider;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PoseProvider basicGetPoseProvider()
  {
		return poseProvider;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPoseProvider(PoseProvider newPoseProvider)
  {
		PoseProvider oldPoseProvider = poseProvider;
		poseProvider = newPoseProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER, oldPoseProvider, poseProvider));
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableAnnotation((VariableTrajectoryAnnotation)otherEnd, msgs);
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION:
				return basicSetVariableAnnotation(null, msgs);
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION:
				return eInternalContainer().eInverseRemove(this, SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER, VariableTrajectoryAnnotation.class, msgs);
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION:
				if (resolve) return getVariableAnnotation();
				return basicGetVariableAnnotation();
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER:
				if (resolve) return getPoseProvider();
				return basicGetPoseProvider();
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION:
				setVariableAnnotation((VariableTrajectoryAnnotation)newValue);
				return;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER:
				setPoseProvider((PoseProvider)newValue);
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION:
				setVariableAnnotation((VariableTrajectoryAnnotation)null);
				return;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER:
				setPoseProvider((PoseProvider)null);
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION:
				return basicGetVariableAnnotation() != null;
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER:
				return poseProvider != null;
		}
		return super.eIsSet(featureID);
	}
      
  @Override
  public XYSeries getXYSeries() 
  {	
	  if(xySeries == null)
	  {		  
		  String name = "Unamed";
		  if(getVariableAnnotation() != null && getVariableAnnotation().getVariable() != null)
		  {
			  name = getVariableAnnotation().getVariable().getName();
		  }
		  
		  xySeries = new XYSeries(name, false, true); 		
	  }	  
	  
	  return xySeries;
  }
} //VariableTrajectoryProviderImpl
