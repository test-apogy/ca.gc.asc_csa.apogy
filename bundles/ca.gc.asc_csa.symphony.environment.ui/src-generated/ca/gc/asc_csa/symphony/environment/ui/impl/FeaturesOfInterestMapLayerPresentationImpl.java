/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui.impl;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.geom.Ellipse2D;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Color3f;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.chart.annotations.XYShapeAnnotation;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.ui.TextAnchor;

import ca.gc.asc_csa.symphony.core.FeatureOfInterest;
import ca.gc.asc_csa.symphony.core.FeatureOfInterestList;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.environment.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.symphony.environment.RectangularRegion;
import ca.gc.asc_csa.symphony.environment.RectangularRegionProvider;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.ui.FeaturesOfInterestMapLayerPresentation;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIFactory;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage;
import ca.gc.space.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Features Of Interest Map Layer Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.FeaturesOfInterestMapLayerPresentationImpl#getFeaturesOfInterestMapLayer <em>Features Of Interest Map Layer</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.FeaturesOfInterestMapLayerPresentationImpl#getFeatureOfInterestRadius <em>Feature Of Interest Radius</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.FeaturesOfInterestMapLayerPresentationImpl#getFeatureOfInterestColor <em>Feature Of Interest Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeaturesOfInterestMapLayerPresentationImpl extends MapAnnotationImpl implements FeaturesOfInterestMapLayerPresentation 
{
	protected List<AbstractXYAnnotation> annotations = null;
	
	private FeaturesOfInterestMapLayerAdapter featuresOfInterestMapLayerAdapter = null;
	
	/**
	 * The cached value of the '{@link #getFeaturesOfInterestMapLayer() <em>Features Of Interest Map Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturesOfInterestMapLayer()
	 * @generated
	 * @ordered
	 */
	protected FeaturesOfInterestMapLayer featuresOfInterestMapLayer;

	/**
	 * The default value of the '{@link #getFeatureOfInterestRadius() <em>Feature Of Interest Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterestRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double FEATURE_OF_INTEREST_RADIUS_EDEFAULT = 0.25;

	/**
	 * The cached value of the '{@link #getFeatureOfInterestRadius() <em>Feature Of Interest Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterestRadius()
	 * @generated
	 * @ordered
	 */
	protected double featureOfInterestRadius = FEATURE_OF_INTEREST_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureOfInterestColor() <em>Feature Of Interest Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterestColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f FEATURE_OF_INTEREST_COLOR_EDEFAULT = (Color3f)SymphonyEnvironmentUIFactory.eINSTANCE.createFromString(SymphonyEnvironmentUIPackage.eINSTANCE.getColor3f(), "0.0,0.0,1.0");

	/**
	 * The cached value of the '{@link #getFeatureOfInterestColor() <em>Feature Of Interest Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterestColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f featureOfInterestColor = FEATURE_OF_INTEREST_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturesOfInterestMapLayerPresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEnvironmentUIPackage.Literals.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesOfInterestMapLayer getFeaturesOfInterestMapLayer() {
		if (featuresOfInterestMapLayer != null && featuresOfInterestMapLayer.eIsProxy()) {
			InternalEObject oldFeaturesOfInterestMapLayer = (InternalEObject)featuresOfInterestMapLayer;
			featuresOfInterestMapLayer = (FeaturesOfInterestMapLayer)eResolveProxy(oldFeaturesOfInterestMapLayer);
			if (featuresOfInterestMapLayer != oldFeaturesOfInterestMapLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER, oldFeaturesOfInterestMapLayer, featuresOfInterestMapLayer));
			}
		}
		return featuresOfInterestMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesOfInterestMapLayer basicGetFeaturesOfInterestMapLayer() {
		return featuresOfInterestMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFeaturesOfInterestMapLayer(FeaturesOfInterestMapLayer newFeaturesOfInterestMapLayer)
	{
		if(getFeaturesOfInterestMapLayer() != null)
		{
			getFeaturesOfInterestMapLayerAdapter().unregisterAdapter(getFeaturesOfInterestMapLayer());
		}
						
		setFeaturesOfInterestMapLayerGen(newFeaturesOfInterestMapLayer);
		
		// Updates annotation.
		updateAnnotations();
		
		if(newFeaturesOfInterestMapLayer != null)
		{
			// Register to new map layer.
			getFeaturesOfInterestMapLayerAdapter().registerAdapter(newFeaturesOfInterestMapLayer);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturesOfInterestMapLayerGen(FeaturesOfInterestMapLayer newFeaturesOfInterestMapLayer) {
		FeaturesOfInterestMapLayer oldFeaturesOfInterestMapLayer = featuresOfInterestMapLayer;
		featuresOfInterestMapLayer = newFeaturesOfInterestMapLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER, oldFeaturesOfInterestMapLayer, featuresOfInterestMapLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFeatureOfInterestRadius() {
		return featureOfInterestRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFeatureOfInterestRadius(double newFeatureOfInterestRadius) 
	{
		setFeatureOfInterestRadiusGen(newFeatureOfInterestRadius);
		
		// Force annotation to update.
		updateAnnotations();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOfInterestRadiusGen(double newFeatureOfInterestRadius) {
		double oldFeatureOfInterestRadius = featureOfInterestRadius;
		featureOfInterestRadius = newFeatureOfInterestRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS, oldFeatureOfInterestRadius, featureOfInterestRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getFeatureOfInterestColor() {
		return featureOfInterestColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFeatureOfInterestColor(Color3f newFeatureOfInterestColor) 
	{
		setFeatureOfInterestColorGen(newFeatureOfInterestColor);
		
		// Force annotation to update.
		updateAnnotations();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOfInterestColorGen(Color3f newFeatureOfInterestColor) {
		Color3f oldFeatureOfInterestColor = featureOfInterestColor;
		featureOfInterestColor = newFeatureOfInterestColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR, oldFeatureOfInterestColor, featureOfInterestColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_not
	 */
	public RectangularRegion getRegion() 
	{
		if(getFeaturesOfInterestMapLayer() != null)
		{
			return getFeaturesOfInterestMapLayer().getRegion();
		}
		else
		{
			return SymphonyEnvironmentFactory.eINSTANCE.createRectangularRegion();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER:
				if (resolve) return getFeaturesOfInterestMapLayer();
				return basicGetFeaturesOfInterestMapLayer();
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS:
				return getFeatureOfInterestRadius();
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR:
				return getFeatureOfInterestColor();
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
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER:
				setFeaturesOfInterestMapLayer((FeaturesOfInterestMapLayer)newValue);
				return;
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS:
				setFeatureOfInterestRadius((Double)newValue);
				return;
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR:
				setFeatureOfInterestColor((Color3f)newValue);
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
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER:
				setFeaturesOfInterestMapLayer((FeaturesOfInterestMapLayer)null);
				return;
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS:
				setFeatureOfInterestRadius(FEATURE_OF_INTEREST_RADIUS_EDEFAULT);
				return;
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR:
				setFeatureOfInterestColor(FEATURE_OF_INTEREST_COLOR_EDEFAULT);
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
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER:
				return featuresOfInterestMapLayer != null;
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS:
				return featureOfInterestRadius != FEATURE_OF_INTEREST_RADIUS_EDEFAULT;
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR:
				return FEATURE_OF_INTEREST_COLOR_EDEFAULT == null ? featureOfInterestColor != null : !FEATURE_OF_INTEREST_COLOR_EDEFAULT.equals(featureOfInterestColor);
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
				case SymphonyEnvironmentPackage.RECTANGULAR_REGION_PROVIDER___GET_REGION: return SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION___GET_REGION;
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
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION___GET_REGION:
				return getRegion();
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
		result.append(" (featureOfInterestRadius: ");
		result.append(featureOfInterestRadius);
		result.append(", featureOfInterestColor: ");
		result.append(featureOfInterestColor);
		result.append(')');
		return result.toString();
	}

	@Override
	public List<AbstractXYAnnotation> getXYShapeAnnotation() 
	{
		return getAnnotations();
	}

	synchronized protected void updateAnnotations()
	{				
		System.out
				.println("FeaturesOfInterestMapLayerPresentationImpl.updateAnnotations()");
		
		if(getFeaturesOfInterestMapLayer() != null)
		{
			Iterator<FeatureOfInterest> it = getFeaturesOfInterestMapLayer().getFeatures().getFeaturesOfInterest().iterator();
			
			// Creates a working list of annotations.
			List<AbstractXYAnnotation> annotationList = new ArrayList<AbstractXYAnnotation>();
			
			// Goes through the list of FeatureOfInterest
			while(it.hasNext())
			{
				try
				{
					FeatureOfInterest foi = it.next();				
					Vector3d position = new Vector3d();
					foi.getPose().asMatrix4d().get(position);

					double x = position.x;
					double y = position.y;										
					
					XYTextAnnotation textAnnotation = new XYTextAnnotation(foi.getName() + " ", x, y);
					
					Color foiColor = new Color(getFeatureOfInterestColor().x, getFeatureOfInterestColor().y, getFeatureOfInterestColor().z); 
					
					textAnnotation.setFont(new Font("SansSerif", Font.BOLD, 9));
					textAnnotation.setPaint(foiColor);
					textAnnotation.setTextAnchor(TextAnchor.HALF_ASCENT_RIGHT);
					textAnnotation.setRotationAnchor(TextAnchor.HALF_ASCENT_RIGHT);					
					textAnnotation.setRotationAngle(Math.toRadians(45));
					
					Ellipse2D e = new Ellipse2D.Double(x - getFeatureOfInterestRadius(), y - getFeatureOfInterestRadius(), 2 * getFeatureOfInterestRadius(), 2 * getFeatureOfInterestRadius());					
					XYShapeAnnotation dot = new XYShapeAnnotation(e, new BasicStroke(3f), foiColor);

					// Adds annotations to working list.
					annotationList.add(textAnnotation);
					annotationList.add(dot);
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}
			
			// Updates annotations.
			getXYShapeAnnotation().clear();
			getXYShapeAnnotation().addAll(annotationList);
		}						
	}
	
	synchronized protected List<AbstractXYAnnotation> getAnnotations() 
	{
		if(annotations == null)
		{
			annotations = new ArrayList<AbstractXYAnnotation>();
		}
		
		return annotations;
	}
			
	protected FeaturesOfInterestMapLayerAdapter getFeaturesOfInterestMapLayerAdapter() 
	{
		if(featuresOfInterestMapLayerAdapter == null)
		{
			featuresOfInterestMapLayerAdapter = new FeaturesOfInterestMapLayerAdapter(this);			
		}
		return featuresOfInterestMapLayerAdapter;
	}
} //FeaturesOfInterestMapLayerPresentationImpl
	
class FeaturesOfInterestMapLayerAdapter extends AdapterImpl
{				
	FeaturesOfInterestMapLayerPresentationImpl featuresOfInterestMapLayerPresentationImpl = null;
	
	public FeaturesOfInterestMapLayerAdapter(FeaturesOfInterestMapLayerPresentationImpl featuresOfInterestMapLayerPresentationImpl)
	{
		this.featuresOfInterestMapLayerPresentationImpl = featuresOfInterestMapLayerPresentationImpl;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(Notification msg) 
	{
		if(msg.getNotifier() instanceof FeaturesOfInterestMapLayer)
		{
			int featureID = msg.getFeatureID(FeaturesOfInterestMapLayer.class);
			
			if(featureID == SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES)
			{
				if(msg.getOldValue() instanceof FeatureOfInterestList)
				{
					FeatureOfInterestList oldFeatureOfInterestList = (FeatureOfInterestList) msg.getOldValue();					
					unregisterAdapter(oldFeatureOfInterestList);
				}
				
				if(msg.getNewValue() instanceof FeatureOfInterestList)
				{
					FeatureOfInterestList newFeatureOfInterestList = (FeatureOfInterestList) msg.getNewValue();
					registerAdapter(newFeatureOfInterestList);
				}
				
				featuresOfInterestMapLayerPresentationImpl.updateAnnotations();
			}						
		}
		else if(msg.getNotifier() instanceof FeatureOfInterestList)
		{
			if(msg.getEventType() == Notification.ADD)
			{
				if(msg.getNewValue() instanceof FeatureOfInterest)
				{
					FeatureOfInterest foi = (FeatureOfInterest) msg.getNewValue();
					registerAdapter(foi);	
				}
			}
			else if(msg.getEventType() == Notification.ADD_MANY)
			{						
				List<FeatureOfInterest> list = (List<FeatureOfInterest>) msg.getNewValue();
				
				for(FeatureOfInterest foi : list)
				{
					registerAdapter(foi);									
				}
			}
			else if(msg.getEventType() == Notification.REMOVE)
			{	
				if(msg.getOldValue() instanceof FeatureOfInterest)
				{
					FeatureOfInterest foi = (FeatureOfInterest) msg.getOldValue();
					unRegisterAdapter(foi);			
				}
			}
			else if(msg.getEventType() == Notification.REMOVE_MANY)
			{
				List<FeatureOfInterest> list = (List<FeatureOfInterest>) msg.getOldValue();
				
				for(FeatureOfInterest foi : list)
				{
					unRegisterAdapter(foi);							
				}
			}
			else
			{
				return;
			}
			
			featuresOfInterestMapLayerPresentationImpl.updateAnnotations();
			
		}
		else if(msg.getNotifier() instanceof FeatureOfInterest)
		{
			int featureID = msg.getFeatureID(FeatureOfInterest.class);
			
			if(featureID == SymphonyCorePackage.FEATURE_OF_INTEREST__POSE)
			{
				if(msg.getOldValue() instanceof Matrix4x4)
				{
					Matrix4x4 oldMatrix4x4 = (Matrix4x4) msg.getOldValue();
					oldMatrix4x4.eAdapters().remove(this);
				}
				
				if(msg.getNewValue() instanceof Matrix4x4)
				{
					Matrix4x4 newMatrix4x4 = (Matrix4x4) msg.getNewValue();
					newMatrix4x4.eAdapters().add(this);
				}
			}			
			
			featuresOfInterestMapLayerPresentationImpl.updateAnnotations();
		}
		else if(msg.getNotifier() instanceof Matrix4x4)
		{
			featuresOfInterestMapLayerPresentationImpl.updateAnnotations();
		}
	}
	
	protected void registerAdapter(FeaturesOfInterestMapLayer newFeaturesOfInterestMapLayer)
	{
		if(newFeaturesOfInterestMapLayer != null)
		{
			newFeaturesOfInterestMapLayer.eAdapters().add(this);
			
			if(newFeaturesOfInterestMapLayer.getFeatures() != null)
			{
				registerAdapter(newFeaturesOfInterestMapLayer.getFeatures());
			}
		}
	}
	
	protected void registerAdapter(FeatureOfInterestList featureOfInterestList)
	{
		if(featureOfInterestList != null)
		{
			featureOfInterestList.eAdapters().add(this);
			
			for(FeatureOfInterest foi : featureOfInterestList.getFeaturesOfInterest())
			{
				registerAdapter(foi);
			}
		}
	}
	
	protected void unregisterAdapter(FeaturesOfInterestMapLayer oldFeaturesOfInterestMapLayer)
	{
		if(oldFeaturesOfInterestMapLayer != null)
		{
			oldFeaturesOfInterestMapLayer.eAdapters().remove(this);
			
			if(oldFeaturesOfInterestMapLayer.getFeatures() != null)
			{
				unregisterAdapter(oldFeaturesOfInterestMapLayer.getFeatures());
			}
		}
	}
	
	protected void unregisterAdapter(FeatureOfInterestList oldFeatureOfInterestList)
	{
		if(oldFeatureOfInterestList != null)
		{
			oldFeatureOfInterestList.eAdapters().remove(this);
			
			for(FeatureOfInterest foi : oldFeatureOfInterestList.getFeaturesOfInterest())
			{
				unRegisterAdapter(foi);
			}
		}
	}
	
	protected void registerAdapter(FeatureOfInterest featureOfInterest)
	{
		if(featureOfInterest != null)
		{
			featureOfInterest.eAdapters().add(this);
			
			if(featureOfInterest.getPose() != null)
			{
				featureOfInterest.getPose().eAdapters().add(this);
			}
		}
	}
	
	protected void unRegisterAdapter(FeatureOfInterest featureOfInterest)
	{
		if(featureOfInterest != null)
		{
			featureOfInterest.eAdapters().remove(this);
			
			if(featureOfInterest.getPose() != null)
			{
				featureOfInterest.getPose().eAdapters().remove(this);
			}
		}
	}
}
