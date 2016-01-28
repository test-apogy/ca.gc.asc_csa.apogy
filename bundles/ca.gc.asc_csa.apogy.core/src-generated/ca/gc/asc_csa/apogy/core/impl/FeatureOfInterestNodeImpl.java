/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.math.Symphony__CommonMathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.topology.impl.TransformNodeImpl;
import org.eclipse.symphony.core.FeatureOfInterest;
import org.eclipse.symphony.core.FeatureOfInterestNode;
import org.eclipse.symphony.core.Symphony__CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Of Interest Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.FeatureOfInterestNodeImpl#getFeatureOfInterest <em>Feature Of Interest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureOfInterestNodeImpl extends TransformNodeImpl implements FeatureOfInterestNode 
{
	private Adapter adapter = null;
	
	/**
	 * The cached value of the '{@link #getFeatureOfInterest() <em>Feature Of Interest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterest()
	 * @generated
	 * @ordered
	 */
	protected FeatureOfInterest featureOfInterest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureOfInterestNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CorePackage.Literals.FEATURE_OF_INTEREST_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterest getFeatureOfInterest() {
		if (featureOfInterest != null && featureOfInterest.eIsProxy()) {
			InternalEObject oldFeatureOfInterest = (InternalEObject)featureOfInterest;
			featureOfInterest = (FeatureOfInterest)eResolveProxy(oldFeatureOfInterest);
			if (featureOfInterest != oldFeatureOfInterest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST, oldFeatureOfInterest, featureOfInterest));
			}
		}
		return featureOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterest basicGetFeatureOfInterest() {
		return featureOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFeatureOfInterest(FeatureOfInterest newFeatureOfInterest) 
	{
		FeatureOfInterest oldFeatureOfInterest = getFeatureOfInterest();
		
		if(oldFeatureOfInterest != null)
		{
			// Unregister from previous FeatureOfInterest
			oldFeatureOfInterest.eAdapters().remove(getAdapter());
			
			if(oldFeatureOfInterest.getPose() != null)
			{
				oldFeatureOfInterest.getPose().eAdapters().remove(getAdapter());
			}
		}
		
		setFeatureOfInterestGen(newFeatureOfInterest);
		
		if(newFeatureOfInterest != null)
		{
			// Register to new FeatureOfInterest
			newFeatureOfInterest.eAdapters().add(getAdapter());	
			
			if(newFeatureOfInterest.getPose() != null)
			{
				newFeatureOfInterest.getPose().eAdapters().add(getAdapter());
			}
		}				
		
		update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOfInterestGen(FeatureOfInterest newFeatureOfInterest) {
		FeatureOfInterest oldFeatureOfInterest = featureOfInterest;
		featureOfInterest = newFeatureOfInterest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST, oldFeatureOfInterest, featureOfInterest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST:
				if (resolve) return getFeatureOfInterest();
				return basicGetFeatureOfInterest();
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
			case Symphony__CorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST:
				setFeatureOfInterest((FeatureOfInterest)newValue);
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
			case Symphony__CorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST:
				setFeatureOfInterest((FeatureOfInterest)null);
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
			case Symphony__CorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST:
				return featureOfInterest != null;
		}
		return super.eIsSet(featureID);
	}

	private void update()
	{
		FeatureOfInterest foi = getFeatureOfInterest();
		Matrix4x4 pose = Symphony__CommonMathFacade.INSTANCE.createIdentityMatrix4x4();
		if(foi != null)
		{
			if(foi.getPose() != null)
			{								
				pose = EcoreUtil.copy(foi.getPose());
			}
		}
		
		setTransformation(pose.asMatrix4d());
	}
	
	private Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification notification) 
				{
					if(notification.getNotifier() instanceof FeatureOfInterest)
					{
						int featureId = notification.getFeatureID(FeatureOfInterest.class);	
						if(featureId == Symphony__CorePackage.FEATURE_OF_INTEREST__POSE)
						{
							// Unregister from previous Pose
							if(notification.getOldValue() instanceof Matrix4x4)
							{
								Matrix4x4 oldValue = (Matrix4x4) notification.getOldValue();
								oldValue.eAdapters().remove(getAdapter());
							}
							
							update();
							
							// Register from new Pose
							if(notification.getNewValue() instanceof Matrix4x4)
							{
								Matrix4x4 newValue = (Matrix4x4) notification.getNewValue();
								newValue.eAdapters().add(getAdapter());
							}
						}
					}
					else if(notification.getNotifier() instanceof Matrix4x4)
					{
						update();
					}
				}
			};
		}
		
		return adapter;
	}
} //FeatureOfInterestNodeImpl
