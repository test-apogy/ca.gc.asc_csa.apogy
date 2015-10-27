/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.core.environment.ImageMapLayer;
import org.eclipse.symphony.core.environment.ImageMapLayerPresentation;
import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.RectangularRegionImage;
import org.eclipse.symphony.core.environment.RectangularRegionProvider;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Map Layer Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.ImageMapLayerPresentationImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageMapLayerPresentationImpl extends MapLayerPresentationImpl implements ImageMapLayerPresentation {
	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final float ALPHA_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected float alpha = ALPHA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageMapLayerPresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreEnvironmentPackage.Literals.IMAGE_MAP_LAYER_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setAlpha(float newAlpha) 
	{
		// Clamps the alpha value between 0 and 1.
		float alphaValue = newAlpha;
		if(newAlpha < 0) alphaValue = 0.0f;
		if(newAlpha > 1) alphaValue = 1.0f;		
		setAlphaGen(alphaValue);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphaGen(float newAlpha) {
		float oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ImageMapLayer getImageMapLayer() 
	{
		if(getMapLayer() instanceof ImageMapLayer)
		{
			return (ImageMapLayer) getMapLayer();
		}
		else
		{
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage getRegionImage() 
	{
		  if(getImageMapLayer() != null)
		  {
			  if(getAlpha() == 1.0)
			  {
				  return getImageMapLayer().getRegionImage();
			  }
			  else
			  {			  
				  return EImagesUtilities.INSTANCE.applyAlpha(getImageMapLayer().getRegionImage(), getAlpha());
			  }
		  }
		  else
		  {
			  return null;
		  } 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getResolution() 
	{
		  if(getImageMapLayer() != null)
		  {
			  return getImageMapLayer().getResolution(); 
		  }
		  else
		  {
			  return -1;
		  }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularRegion getRegion() 
	{
		  if(getImageMapLayer() != null)
		  {
			  return getImageMapLayer().getRegion(); 
		  }
		  else
		  {
			  RectangularRegion rectangularRegion = Symphony__CoreEnvironmentFactory.eINSTANCE.createRectangularRegion();
			  return rectangularRegion;
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
			case Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA:
				return getAlpha();
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
			case Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA:
				setAlpha((Float)newValue);
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
			case Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
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
			case Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA:
				return alpha != ALPHA_EDEFAULT;
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
				case Symphony__CoreEnvironmentPackage.RECTANGULAR_REGION_PROVIDER___GET_REGION: return Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_REGION;
				default: return -1;
			}
		}
		if (baseClass == RectangularRegionImage.class) {
			switch (baseOperationID) {
				case Symphony__CoreEnvironmentPackage.RECTANGULAR_REGION_IMAGE___GET_REGION_IMAGE: return Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_REGION_IMAGE;
				case Symphony__CoreEnvironmentPackage.RECTANGULAR_REGION_IMAGE___GET_RESOLUTION: return Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_RESOLUTION;
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
			case Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_IMAGE_MAP_LAYER:
				return getImageMapLayer();
			case Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_REGION_IMAGE:
				return getRegionImage();
			case Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_RESOLUTION:
				return getResolution();
			case Symphony__CoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_REGION:
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
		result.append(" (alpha: ");
		result.append(alpha);
		result.append(')');
		return result.toString();
	}

} //ImageMapLayerPresentationImpl
