package ca.gc.asc_csa.apogy.core.environment.ui.impl;
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
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jface.preference.IPreferenceStore;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ImageAlignment;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ui.Activator;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFacade;
import ca.gc.asc_csa.apogy.core.environment.ui.MapAnnotation;
import ca.gc.asc_csa.apogy.core.environment.ui.MapViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.listeners.MapViewConfigurationListener;
import ca.gc.asc_csa.apogy.core.environment.ui.preferences.ApogyEnvironmentUIPreferencesConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map View Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.MapViewConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.MapViewConfigurationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.MapViewConfigurationImpl#getMapLayers <em>Map Layers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.MapViewConfigurationImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.MapViewConfigurationImpl#getMapAnnotations <em>Map Annotations</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.MapViewConfigurationImpl#getDefaultRectangularRegion <em>Default Rectangular Region</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.MapViewConfigurationImpl#getMapImage <em>Map Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.MapViewConfigurationImpl#getMapImageRectangularRegion <em>Map Image Rectangular Region</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.MapViewConfigurationImpl#getExtent <em>Extent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapViewConfigurationImpl extends MinimalEObjectImpl.Container implements MapViewConfiguration
{	  
  private boolean mapIsDirty = true; 
  private boolean updateDerivedsBusy = false;
  
  private MapViewConfigurationListener mapViewConfigurationListener;
	
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getMapLayers() <em>Map Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMapLayers()
	 * @generated
	 * @ordered
	 */
  protected EList<ImageMapLayerPresentation> mapLayers;

  /**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
  protected static final Color3f BACKGROUND_COLOR_EDEFAULT = (Color3f)ApogyCoreEnvironmentUIFactory.eINSTANCE.createFromString(ApogyCoreEnvironmentUIPackage.eINSTANCE.getColor3f(), "1.0,1.0,1.0");
  /**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
  protected Color3f backgroundColor = BACKGROUND_COLOR_EDEFAULT;
  /**
	 * The cached value of the '{@link #getMapAnnotations() <em>Map Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMapAnnotations()
	 * @generated
	 * @ordered
	 */
  protected EList<MapAnnotation> mapAnnotations;

  /**
	 * The cached value of the '{@link #getDefaultRectangularRegion() <em>Default Rectangular Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRectangularRegion()
	 * @generated
	 * @ordered
	 */
	protected RectangularRegion defaultRectangularRegion;
		/**
	 * The cached value of the '{@link #getMapImage() <em>Map Image</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMapImage()
	 * @generated
	 * @ordered
	 */
  protected AbstractEImage mapImage;

  /**
	 * The cached value of the '{@link #getMapImageRectangularRegion() <em>Map Image Rectangular Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapImageRectangularRegion()
	 * @generated
	 * @ordered
	 */
	protected RectangularRegion mapImageRectangularRegion;
		/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected RectangularRegion extent;
		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected MapViewConfigurationImpl()
  {
	  super();
	  getMapViewConfigurationListener();
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCoreEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription()
  {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription)
  {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ImageMapLayerPresentation> getMapLayers()
  {
		if (mapLayers == null) {
			mapLayers = new EObjectContainmentEList<ImageMapLayerPresentation>(ImageMapLayerPresentation.class, this, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_LAYERS);
		}
		return mapLayers;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Color3f getBackgroundColor()
  {
		return backgroundColor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setBackgroundColor(Color3f newBackgroundColor)
  {
		Color3f oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<MapAnnotation> getMapAnnotations()
  {
		if (mapAnnotations == null) {
			mapAnnotations = new EObjectContainmentEList<MapAnnotation>(MapAnnotation.class, this, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS);
		}
		return mapAnnotations;
	}

  	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularRegion getDefaultRectangularRegion() 
	{
		RectangularRegion tmp = getDefaultRectangularRegionGen();
		
		if(tmp == null)
		{			
			IPreferenceStore store = Activator.getDefault().getPreferenceStore();
			
			tmp = ApogyCoreEnvironmentFactory.eINSTANCE.createRectangularRegion();			
			tmp.setXMin(store.getDouble(ApogyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MIN_ID));
			tmp.setXMax(store.getDouble(ApogyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_X_MAX_ID));
			tmp.setYMin(store.getDouble(ApogyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MIN_ID));
			tmp.setYMax(store.getDouble(ApogyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_CONFIGURATION_Y_MAX_ID));
			
			setDefaultRectangularRegion(tmp);
		}
		
		return tmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularRegion getDefaultRectangularRegionGen() 
	{
		if (defaultRectangularRegion != null && defaultRectangularRegion.eIsProxy()) {
			InternalEObject oldDefaultRectangularRegion = (InternalEObject)defaultRectangularRegion;
			defaultRectangularRegion = (RectangularRegion)eResolveProxy(oldDefaultRectangularRegion);
			if (defaultRectangularRegion != oldDefaultRectangularRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION, oldDefaultRectangularRegion, defaultRectangularRegion));
			}
		}
		return defaultRectangularRegion;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularRegion basicGetDefaultRectangularRegion() {
		return defaultRectangularRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultRectangularRegion(RectangularRegion newDefaultRectangularRegion) {
		RectangularRegion oldDefaultRectangularRegion = defaultRectangularRegion;
		defaultRectangularRegion = newDefaultRectangularRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION, oldDefaultRectangularRegion, defaultRectangularRegion));
	}

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public AbstractEImage getMapImage()
  {
	  if(mapIsDirty)
	  {		  
		  updateDeriveds();
	  }
	  
	  return getMapImageGen();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractEImage getMapImageGen()
  {
		if (mapImage != null && mapImage.eIsProxy()) {
			InternalEObject oldMapImage = (InternalEObject)mapImage;
			mapImage = (AbstractEImage)eResolveProxy(oldMapImage);
			if (mapImage != oldMapImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_IMAGE, oldMapImage, mapImage));
			}
		}
		return mapImage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractEImage basicGetMapImage()
  {
		return mapImage;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated_NOT
	*/
	public RectangularRegion getMapImageRectangularRegion()
	{
		RectangularRegion tmp = getMapImageRectangularRegionGen();
		if(tmp == null)
		{
		  tmp = ApogyCoreEnvironmentFactory.eINSTANCE.createRectangularRegion();
		  mapImageRectangularRegion = tmp;
		}
	
		return tmp;
	}    
  
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularRegion getMapImageRectangularRegionGen() {
		if (mapImageRectangularRegion != null && mapImageRectangularRegion.eIsProxy()) {
			InternalEObject oldMapImageRectangularRegion = (InternalEObject)mapImageRectangularRegion;
			mapImageRectangularRegion = (RectangularRegion)eResolveProxy(oldMapImageRectangularRegion);
			if (mapImageRectangularRegion != oldMapImageRectangularRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION, oldMapImageRectangularRegion, mapImageRectangularRegion));
			}
		}
		return mapImageRectangularRegion;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularRegion basicGetMapImageRectangularRegion() {
		return mapImageRectangularRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public RectangularRegion getExtent() 
	{
		RectangularRegion tmp = getExtentGen();
		
		if(tmp == null)
		{
			tmp = ApogyCoreEnvironmentFactory.eINSTANCE.createRectangularRegion();
			setExtent(tmp);
		}
		
		return tmp;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularRegion getExtentGen() {
		if (extent != null && extent.eIsProxy()) {
			InternalEObject oldExtent = (InternalEObject)extent;
			extent = (RectangularRegion)eResolveProxy(oldExtent);
			if (extent != oldExtent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__EXTENT, oldExtent, extent));
			}
		}
		return extent;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularRegion basicGetExtent() {
		return extent;
	}
  
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(RectangularRegion newExtent) {
		RectangularRegion oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__EXTENT, oldExtent, extent));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	synchronized public void forceUpdate() 
	{
		mapIsDirty = true;
		updateDeriveds();
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
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_LAYERS:
				return ((InternalEList<?>)getMapLayers()).basicRemove(otherEnd, msgs);
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS:
				return ((InternalEList<?>)getMapAnnotations()).basicRemove(otherEnd, msgs);
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
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__NAME:
				return getName();
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DESCRIPTION:
				return getDescription();
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_LAYERS:
				return getMapLayers();
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR:
				return getBackgroundColor();
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS:
				return getMapAnnotations();
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION:
				if (resolve) return getDefaultRectangularRegion();
				return basicGetDefaultRectangularRegion();
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_IMAGE:
				if (resolve) return getMapImage();
				return basicGetMapImage();
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION:
				if (resolve) return getMapImageRectangularRegion();
				return basicGetMapImageRectangularRegion();
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__EXTENT:
				if (resolve) return getExtent();
				return basicGetExtent();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_LAYERS:
				getMapLayers().clear();
				getMapLayers().addAll((Collection<? extends ImageMapLayerPresentation>)newValue);
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR:
				setBackgroundColor((Color3f)newValue);
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS:
				getMapAnnotations().clear();
				getMapAnnotations().addAll((Collection<? extends MapAnnotation>)newValue);
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION:
				setDefaultRectangularRegion((RectangularRegion)newValue);
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__EXTENT:
				setExtent((RectangularRegion)newValue);
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
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_LAYERS:
				getMapLayers().clear();
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS:
				getMapAnnotations().clear();
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION:
				setDefaultRectangularRegion((RectangularRegion)null);
				return;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__EXTENT:
				setExtent((RectangularRegion)null);
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
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_LAYERS:
				return mapLayers != null && !mapLayers.isEmpty();
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS:
				return mapAnnotations != null && !mapAnnotations.isEmpty();
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION:
				return defaultRectangularRegion != null;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_IMAGE:
				return mapImage != null;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION:
				return mapImageRectangularRegion != null;
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__EXTENT:
				return extent != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION___FORCE_UPDATE:
				forceUpdate();
				return null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(')');
		return result.toString();
	}

  private void updateDeriveds()
  {
	  if(!updateDerivedsBusy)
	  {
		  updateDerivedsBusy = true;
	  	  Logger.INSTANCE.log(Activator.ID, this, "Updating map...", EventSeverity.INFO);
		  
	  	  ExecutorService executor = Executors.newFixedThreadPool(10);
	  	  Callable<AbstractEImage> worker = new Callable<AbstractEImage>()
	  	  {
	  		  @Override
	  		  public AbstractEImage call() throws Exception 
	  		  {	  			
	  			  RectangularRegion oldRectangularRegion = getMapImageRectangularRegion();
	  			  AbstractEImage oldMapImage = getMapImage();
	  			  	  		 		  
	  			  // Gets the list of visible ImageMapLayerPresentation to generate the background image.
	  			  List<ImageMapLayerPresentation> visiblePresentations = ApogyCoreEnvironmentFacade.INSTANCE.getVisibleImageMapLayerPresentation(getMapLayers());
	  			  
	  			  // Updates size.
	  			  Tuple3d lowerLeftCorner = ApogyCommonMathFactory.eINSTANCE.createTuple3d(); 
	  			  Tuple3d upperRightCorner = ApogyCommonMathFactory.eINSTANCE.createTuple3d(); 
	  			  ApogyCoreEnvironmentFacade.INSTANCE.getRectangularRegionImageExtent(visiblePresentations, lowerLeftCorner, upperRightCorner);		  		 
	  			  
	  			  // Update MapImage.
	  			  AbstractEImage tmpEImage = ApogyCoreEnvironmentFacade.INSTANCE.createEImage(visiblePresentations);	
	  		
	  			  // Creates the background image.
	  			  int red = getBackgroundColor().get().getRed();
	  			  int green = getBackgroundColor().get().getGreen();
	  			  int blue = getBackgroundColor().get().getBlue();
	  			  
	  			  AbstractEImage background = EImagesUtilities.INSTANCE.createUniformColorImage(tmpEImage.getWidth(), tmpEImage.getHeight(), red, green, blue, 255);
	  			  
	  			  // Adds the image onto the background image.
	  			  mapImage = EImagesUtilities.INSTANCE.superPoseImages(background, tmpEImage, false, ImageAlignment.CENTER);	  	  	  
	  			  
	  			  // Update Image Extent.
	  			  RectangularRegion newRectangularRegion = ApogyCoreEnvironmentFactory.eINSTANCE.createRectangularRegion();
	  			  newRectangularRegion.setXMin(lowerLeftCorner.getX());
	  			  newRectangularRegion.setYMin(lowerLeftCorner.getY());	  
	  			  newRectangularRegion.setXMax(upperRightCorner.getX());
	  			  newRectangularRegion.setYMax(upperRightCorner.getY());	
	  			  		  		  		  
	  			  // Checks if the extent has changed.
	  			  boolean extentChanged = false;
	  			  if(newRectangularRegion.getXMin() != oldRectangularRegion.getXMin() ||
	  				 newRectangularRegion.getXMax() != oldRectangularRegion.getXMax() ||
	  				 newRectangularRegion.getYMin() != oldRectangularRegion.getYMin() ||
	  				 newRectangularRegion.getYMax() != oldRectangularRegion.getYMax() )
	  			  {
	  				  mapImageRectangularRegion = newRectangularRegion;
	  				  extentChanged = true;
	  			  }
	  			  
	  			  // Updates the Map Extent
	  			  List<RectangularRegionProvider> rectangularRegionProviders = ApogyCoreEnvironmentUIFacade.INSTANCE.getVisibleRectangularRegionProvider(MapViewConfigurationImpl.this);

	  			  Tuple3d mapLowerLeftCorner = ApogyCommonMathFactory.eINSTANCE.createTuple3d(); 
	  			  Tuple3d mapUpperRightCorner = ApogyCommonMathFactory.eINSTANCE.createTuple3d(); 
	  			  ApogyCoreEnvironmentFacade.INSTANCE.getRectangularRegionExtent(rectangularRegionProviders, mapLowerLeftCorner, mapUpperRightCorner);
	  			 
	  			  if(lowerLeftCorner.getX() < mapLowerLeftCorner.getX())
	  			  {
	  				  mapLowerLeftCorner.setX(lowerLeftCorner.getX());
	  			  }
	  			  
	  			  if(lowerLeftCorner.getY() < mapLowerLeftCorner.getY())
	  			  {
	  				  mapLowerLeftCorner.setY(lowerLeftCorner.getY());			  
	  			  }
	  			  
	  			  if(upperRightCorner.getX() > mapUpperRightCorner.getX())
	  			  {
	  				  mapUpperRightCorner.setX(upperRightCorner.getX());
	  			  }
	  			  
	  			  if(upperRightCorner.getY() > mapUpperRightCorner.getY())
	  			  {
	  				  mapUpperRightCorner.setY(upperRightCorner.getY());
	  			  }
	  			  
	  			  RectangularRegion newExtent = ApogyCoreEnvironmentFactory.eINSTANCE.createRectangularRegion();
	  			  newExtent.setXMin(mapLowerLeftCorner.getX());
	  			  newExtent.setXMax(mapUpperRightCorner.getX());
	  			  newExtent.setYMin(mapLowerLeftCorner.getY());
	  			  newExtent.setYMax(mapUpperRightCorner.getY());		  
	  			  setExtent(newExtent);
	  			  
	  			  // Not busy anymore
	  			  updateDerivedsBusy = false;
	  			  mapIsDirty = false;	
	  			  
	  			  Logger.INSTANCE.log(Activator.ID, this, "Updating map Done.", EventSeverity.OK);		 
	  			  
	  			  // Send notification.
	  			  if (eNotificationRequired()) 
	  			  {
	  					  InternalEObject source = MapViewConfigurationImpl.this;		  		  
	  					  source.eNotify(new ENotificationImpl(source, Notification.SET,ApogyCoreEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_IMAGE, oldMapImage, mapImage));
	  					  if(extentChanged) source.eNotify(new ENotificationImpl(source, Notification.SET,ApogyCoreEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION, oldRectangularRegion, newRectangularRegion));
	  			  }	 	  			  
	  			  return mapImage;
	  		  }
	  	  };
	  	  
	  	  executor.submit(worker);
	  	  	  	  	  	  
	  	  // Make the executor accepts NO new thread and complete all threads currently working.
		  executor.shutdown();		  
	  }
  }
    
  protected MapViewConfigurationListener getMapViewConfigurationListener()
  {
	  if(mapViewConfigurationListener == null)
	  {
		  mapViewConfigurationListener = new MapViewConfigurationListener(this)
		  {
			  @Override
			  protected void mapViewConfigurationUpdate() 
			  {
				  mapIsDirty = true;
			  }
		  };
	  }
	  
	  return mapViewConfigurationListener;
  }
} //MapViewConfigurationImpl
