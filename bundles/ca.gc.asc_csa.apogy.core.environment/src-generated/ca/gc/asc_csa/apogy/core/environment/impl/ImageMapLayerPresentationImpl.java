package ca.gc.asc_csa.apogy.core.environment.impl;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Map Layer Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.ImageMapLayerPresentationImpl#getAlpha <em>Alpha</em>}</li>
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
		return ApogyCoreEnvironmentPackage.Literals.IMAGE_MAP_LAYER_PRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA, oldAlpha, alpha));
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
			  RectangularRegion rectangularRegion = ApogyCoreEnvironmentFactory.eINSTANCE.createRectangularRegion();
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
			case ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA:
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
			case ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA:
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
			case ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA:
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
			case ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA:
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
				case ApogyCoreEnvironmentPackage.RECTANGULAR_REGION_PROVIDER___GET_REGION: return ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_REGION;
				default: return -1;
			}
		}
		if (baseClass == RectangularRegionImage.class) {
			switch (baseOperationID) {
				case ApogyCoreEnvironmentPackage.RECTANGULAR_REGION_IMAGE___GET_REGION_IMAGE: return ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_REGION_IMAGE;
				case ApogyCoreEnvironmentPackage.RECTANGULAR_REGION_IMAGE___GET_RESOLUTION: return ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_RESOLUTION;
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
			case ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_IMAGE_MAP_LAYER:
				return getImageMapLayer();
			case ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_REGION_IMAGE:
				return getRegionImage();
			case ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_RESOLUTION:
				return getResolution();
			case ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION___GET_REGION:
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
