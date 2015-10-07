/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.FeatureOfInterest;
import org.eclipse.symphony.core.FeatureOfInterestList;
import org.eclipse.symphony.core.FeatureOfInterestListNode;
import org.eclipse.symphony.core.SymphonyCoreFactory;

import ca.gc.asc_csa.symphony.environment.AbstractMapLayerNode;
import ca.gc.asc_csa.symphony.environment.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.symphony.environment.RectangularRegion;
import ca.gc.asc_csa.symphony.environment.RectangularRegionProvider;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Features Of Interest Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.FeaturesOfInterestMapLayerImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeaturesOfInterestMapLayerImpl extends AbstractMapLayerImpl implements FeaturesOfInterestMapLayer 
{
	private FeatureOfInterestListNode featureOfInterestListNode = null;
	private boolean listIsDirty = true;
	
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected FeatureOfInterestList features;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturesOfInterestMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEnvironmentPackage.Literals.FEATURES_OF_INTEREST_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public FeatureOfInterestList getFeatures() 
	{
		FeatureOfInterestList tmp = getFeaturesGen();
//		
//		if(tmp == null)
//		{
//			tmp = SymphonyCoreFactory.eINSTANCE.createFeatureOfInterestList();
//			setFeatures(tmp);
//		}
		
		return tmp;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestList getFeaturesGen() 
	{
		return features;
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatures(FeatureOfInterestList newFeatures, NotificationChain msgs) {
		FeatureOfInterestList oldFeatures = features;
		features = newFeatures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES, oldFeatures, newFeatures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFeatures(FeatureOfInterestList newFeatures)
	{
		System.out.println("setFeatures (" + newFeatures + ")");
		setFeaturesGen(newFeatures);
		getFeatureOfInterestListNode().setFeatureOfInterestList(newFeatures);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturesGen(FeatureOfInterestList newFeatures) {
		if (newFeatures != features) {
			NotificationChain msgs = null;
			if (features != null)
				msgs = ((InternalEObject)features).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES, null, msgs);
			if (newFeatures != null)
				msgs = ((InternalEObject)newFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES, null, msgs);
			msgs = basicSetFeatures(newFeatures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES, newFeatures, newFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularRegion getRegion() 
	{
		RectangularRegion region = SymphonyEnvironmentFactory.eINSTANCE.createRectangularRegion();
		
		if(getFeatures().getFeaturesOfInterest().size() > 0)
		{
			double xMin = Double.POSITIVE_INFINITY;
			double yMin = Double.POSITIVE_INFINITY;
			double xMax = Double.NEGATIVE_INFINITY;
			double yMax = Double.NEGATIVE_INFINITY;
			
			for(FeatureOfInterest foi : getFeatures().getFeaturesOfInterest())
			{
				Vector3d position = new Vector3d();
				foi.getPose().asMatrix4d().get(position);
				
				if(position.x < xMin) xMin = position.x;
				if(position.x > xMax) xMax = position.x;
				
				if(position.y < yMin) yMin = position.y;
				if(position.y > yMax) yMax = position.y;
			}
			
			region.setXMin(xMin);
			region.setXMax(xMax);
			region.setYMin(yMin);
			region.setYMax(yMax);
		}
		
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES:
				return basicSetFeatures(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES:
				return getFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES:
				setFeatures((FeatureOfInterestList)newValue);
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
			case SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES:
				setFeatures((FeatureOfInterestList)null);
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
			case SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES:
				return features != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RectangularRegionProvider.class) {
			switch (baseOperationID) {
				case SymphonyEnvironmentPackage.RECTANGULAR_REGION_PROVIDER___GET_REGION: return SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER___GET_REGION;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER___GET_REGION:
				return getRegion();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public AbstractMapLayerNode getAbstractMapLayerNode() 
	{
		AbstractMapLayerNode abstractMapLayerNode = super.getAbstractMapLayerNode();
							
		// Forces update of FeatureOfInterestListNode
		getFeatureOfInterestListNode();
		
		return abstractMapLayerNode;
	}

	synchronized protected FeatureOfInterestListNode getFeatureOfInterestListNode() 
	{
		if(featureOfInterestListNode == null)
		{
			featureOfInterestListNode = SymphonyCoreFactory.eINSTANCE.createFeatureOfInterestListNode();
			featureOfInterestListNode.setFeatureOfInterestList(getFeatures());
			getAbstractMapLayerNode().getChildren().add(featureOfInterestListNode);
		}
		return featureOfInterestListNode;
	}
	
	
} //FeaturesOfInterestMapLayerImpl
