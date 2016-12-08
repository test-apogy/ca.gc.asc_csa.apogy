package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.scene_objects;
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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.vecmath.Color3f;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

import com.jme3.asset.AssetManager;
import com.jme3.asset.plugins.FileLocator;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.material.RenderState.BlendMode;
import com.jme3.material.RenderState.FaceCullMode;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.post.FilterPostProcessor;
import com.jme3.post.filters.BloomFilter;
import com.jme3.renderer.queue.RenderQueue.Bucket;
import com.jme3.renderer.queue.RenderQueue.ShadowMode;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Sphere;
import com.jme3.shadow.DirectionalLightShadowFilter;
import com.jme3.shadow.DirectionalLightShadowRenderer;
import com.jme3.shadow.EdgeFilteringMode;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.jme3.JME3PrimitivesUtilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSkyNode;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EnvironmentUIUtilities;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.Activator;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.EarthSurfaceEnvironmentJMEConstants;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.preferences.ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.scene_objects.EarthSkySceneObject;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.jme3.SurfaceEnvironmentJMEConstants;

public class EarthSkyNodeJME3Object extends DefaultJME3SceneObject<EarthSkyNode> implements IPropertyChangeListener, EarthSkySceneObject
{							
	private Adapter sunAdapter;
	private Adapter moonAdapter;
	
	private EarthSky earthSky;
	private AssetManager assetManager;		
	
//	public static final float CELESTIAL_SPHERE_RADIUS = 20000.0f; // 20km.
//	public static final float ATMOSPHERE_RADIUS       = CELESTIAL_SPHERE_RADIUS * 0.95f;
//	public static final float SUN_AND_MOON_RADIUS     = CELESTIAL_SPHERE_RADIUS * 0.9f;
//	public static final float HORIZON_RADIUS          = CELESTIAL_SPHERE_RADIUS * 0.85f;				
	
	private static ColorRGBA HORIZON_COLOR = new ColorRGBA(0.0753f, 0.04414f, 0.015686f, 1.0f);
	private static ColorRGBA SUN_SPHERE_COLOR = new ColorRGBA(0.976470588f, 0.968627451f, 0.6f, 1.0f);
	private static ColorRGBA MOON_SPHERE_COLOR = new ColorRGBA(1f, 1f, 1f, 0.2f);
	
	//private static ColorRGBA HORIZON_COLOR = new ColorRGBA(0.588f, 0.294f, 0f, 1.0f);

	// Horizon
	private boolean horizonVisible = true;
	
	// Sun
	private Node sunTransform= null;	
	private Geometry sunSphere;	
	private DirectionalLight sunLight;
		
	private boolean sunVisible = false;
	private boolean sunShadowsEnabled = true;
	private boolean sunCastingShadows = false;
	
	// Moon
	private Node moonTransform= null;	
	private Geometry moonSphere;	
	private DirectionalLight moonLight;
	
	private boolean moonVisible = false;
	private boolean moonShadowsEnabled = true;
	private boolean moonCastingShadows = false;
		
	@SuppressWarnings("unused")
	private boolean enableBloom = true;
	private FilterPostProcessor bloomFilterPostProcessor;
	private BloomFilter bloomFilter;
	
	
	private int shadowMapSize = 2048;
	private FilterPostProcessor shadowsFilterPostProcessor;
	private DirectionalLightShadowRenderer directionalLightShadowRenderer;
    private DirectionalLightShadowFilter directionalLightShadowFilter;
      	
	private Geometry horizon;
	private Geometry atmosphere;
	
	public EarthSkyNodeJME3Object(EarthSkyNode node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);		
				
		this.assetManager = jme3Application.getAssetManager();
		assetManager.registerLocator("/", FileLocator.class);
		
		earthSky = (EarthSky) node.getSky();
								
		
		Job job = new Job("EarthSkyNodeJME3Object initialize.")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{														
				jme3Application.enqueue(new Callable<Object>() 
				{
					@Override
					public Object call() throws Exception 
					{			
						// Attaches the Sun.
						attachSun();	
						
						// Attaches the Moon.
						attachMoon();
						
						// Updates Geometry.
						updateGeometry();	
						
						// Blooming
						enableBloom(ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.Activator.getDefault().getPreferenceStore().getBoolean(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_BLOOM_ENABLED_ID));										
					   						
						// Shadow map.
						setShadowMapSize(ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.Activator.getDefault().getPreferenceStore().getInt(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_SHADOW_MAP_SIZE_ID));
						
					    // Shadows from Sun				
						setSunShadowsEnabled(ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.Activator.getDefault().getPreferenceStore().getBoolean(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_SUN_CAST_SHADOWS_ENABLED_ID));
		
						// Shadows from Moon.
						setMoonShadowsEnabled(ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.Activator.getDefault().getPreferenceStore().getBoolean(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_MOON_CAST_SHADOWS_ENABLED_ID));
		
						// Updates Visibility and Shadows.
						updateSunMoonVisibilityAndShadows();		

						// Listens for changes on the EarthSky.
						earthSky.getSun().getParent().eAdapters().add(getSunAdapter());
						earthSky.getMoon().getParent().eAdapters().add(getMoonAdapter());
						
						return null;			
					}
				});
				return Status.OK_STATUS;				
			}
		};
		job.schedule();
		
		ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.Activator.getDefault().getPreferenceStore().addPropertyChangeListener(this);		
	}
	
	@Override
	public void dispose() 
	{
		// Disable Shadows.
		setLightSourceCreatingShadow(null);
		
		// Disable bloom.
		if(jme3Application.getViewPort().getProcessors().contains(getBloomFilterPostProcessor()))
		{
			jme3Application.getViewPort().removeProcessor(getBloomFilterPostProcessor());
		}
		
		// Detach Sun light
		if(sunLight != null)
		{
			jme3Application.getRootNode().removeLight(sunLight);
		}
		
		// Detach Moon light
		if(moonLight != null)
		{
			jme3Application.getRootNode().removeLight(moonLight);
		}
						
		super.dispose();
	}	
	
	@Override
	public void propertyChange(final PropertyChangeEvent event) 
	{				
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				if(event.getProperty().compareTo(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_BLOOM_ENABLED_ID) == 0)
				{
					boolean value = ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.Activator.getDefault().getPreferenceStore().getBoolean(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_BLOOM_ENABLED_ID);
					enableBloom(value);
					updateSun();
				}
				else if(event.getProperty().compareTo(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_SHADOW_MAP_SIZE_ID) == 0)
				{
					setShadowMapSize(ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.Activator.getDefault().getPreferenceStore().getInt(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_SHADOW_MAP_SIZE_ID));
				}
				else if(event.getProperty().compareTo(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_SUN_CAST_SHADOWS_ENABLED_ID) == 0)
				{
					boolean value = ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.Activator.getDefault().getPreferenceStore().getBoolean(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_SUN_CAST_SHADOWS_ENABLED_ID);
					setSunShadowsEnabled(value);
				}
				else if(event.getProperty().compareTo(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_MOON_CAST_SHADOWS_ENABLED_ID) == 0)
				{
					boolean value = ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.jme3.Activator.getDefault().getPreferenceStore().getBoolean(ApogyEarthSurfaceEnvironmentUIJME3PreferencesConstants.DEFAULT_MOON_CAST_SHADOWS_ENABLED_ID);
					setMoonShadowsEnabled(value);
				}
				
				return null;
			}
		});		
	}
							
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(sunSphere);
		geometries.add(moonSphere);
		return geometries;
	}
	
	@Override
	public void setHorizonVisible(final boolean newHorizonVisible) 
	{		
		this.horizonVisible = newHorizonVisible;
		
		Logger.INSTANCE.log(Activator.ID, this, "Setting Horizon visibility to <" + newHorizonVisible + ">", EventSeverity.INFO);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{		
				if(getAttachmentNode() != null) 
				{
					if(horizonVisible)
					{
						getAttachmentNode().attachChild(getHorizon());
					}
					else
					{
						getAttachmentNode().detachChild(getHorizon());
					}
				}
				else
				{
					Logger.INSTANCE.log(Activator.ID, this, "Failed to set Horizon visibility to <" + newHorizonVisible + ">", EventSeverity.ERROR);
				}
				return null;
			}	
		});		
	}
	
	/**
	 * Enables or disable produced by the Sun.
	 * @param newSunShadowsEnabled Enable flag for Sun shadows.
	 */
	public void setSunShadowsEnabled(boolean newSunShadowsEnabled)
	{
		sunShadowsEnabled = newSunShadowsEnabled;
		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				updateSun();
				updateMoon();
				return null;
			}
		});			
	}
	
	/**
	 * Returns whether or not shadows produced by the Sun are enabled.
	 * @return True if Sun shadows are enabled, false otherwise.
	 */
	public boolean areSunShadowsEnabled()
	{
		return sunShadowsEnabled;
	}	
	
	/**
	 * Enables or disable produced by the Moon.
	 * @param newMoonShadowsEnabled Enable flag for Moon shadows.
	 */
	public void setMoonShadowsEnabled(boolean newMoonShadowsEnabled)
	{
		moonShadowsEnabled = newMoonShadowsEnabled;
		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				updateSun();
				updateMoon();
				return null;
			}
		});			
	}
	
	/**
	 * Returns whether or not shadows produced by the Moon are enabled.
	 * @return True if Moon shadows are enabled, false otherwise.
	 */
	public boolean areMoonShadowsEnabled()
	{
		return moonShadowsEnabled;
	}
	
	/**
	 * Returns whether or not the Sun is producing shadows.
	 * @return True if the Sun produces shadows, false otherwise.
	 */
	private boolean isSunCastingShadows()
	{
		return sunCastingShadows;
	}
	
	/**
	 * Return weather the Sun is currently visible.
	 * @return True if the Sun is visible, false otherwise.
	 */
	private boolean isSunVisible()
	{
		return sunVisible;
	}

	/**
	 * Return weather the Moon is currently visible.
	 * @return True if the Moon is visible, false otherwise.
	 */
	private boolean isMoonVisible()
	{
		return moonVisible;
	}

	/**
	 * Returns whether or not the Moon is producing shadows.
	 * @return True if the Moon produces shadows, false otherwise.
	 */
	private boolean isMoonCastingShadows()
	{
		return moonCastingShadows;
	}

	/**
	 * Updates the Sun and Moon visiblity based on the shadows settings and their elevation.
	 */
	private void updateSunMoonVisibilityAndShadows()
	{
		// Computes Sun Visibility
		TransformNode sunTranformNode = (TransformNode) earthSky.getSun().getParent();		
		Matrix4d mSun = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(sunTranformNode);		
		Vector3d vSun = new Vector3d();
		mSun.get(vSun);
		vSun.normalize();

		double rSun = vSun.length();
		double sunAltitude = Math.asin(vSun.z / rSun);
		
		// Sun is visible is above the horizon.
		sunVisible = (sunAltitude > 0);
		
		// Sun cast shadows only if enabled, and the Sun is above horizon
		sunCastingShadows = areSunShadowsEnabled() && sunVisible;						
		
		// Computes Moon Visibility
		TransformNode moonTranformNode = (TransformNode) earthSky.getMoon().getParent();		
		Matrix4d mMoon = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(moonTranformNode);		
		Vector3d vMoon = new Vector3d();
		mMoon.get(vMoon);
		vMoon.normalize();

		double rMoon = vMoon.length();
		double moonAltitude = Math.asin(vMoon.z / rMoon);
		
		// Moon is visible is above the horizon.
		moonVisible = (moonAltitude > 0);
		
		// Moon cast shadows only if enabled, and the Sun is not visible and the Moon is above horizon
		moonCastingShadows = areMoonShadowsEnabled() && moonVisible && !sunVisible;
				
		// Updates the light creating shadows.
		if(isSunCastingShadows())
		{
			setLightSourceCreatingShadow(getSunLight());
		}
		else if(isMoonCastingShadows())
		{
			setLightSourceCreatingShadow(getMoonLight());
		}
		else
		{
			setLightSourceCreatingShadow(null);
		}		
	}
	
	/**
	 * Selects which light (Sun, Moon, or none) is used to cast shadows.
	 * @param light The light that cast shadows, Can be null.
	 */
	private void setLightSourceCreatingShadow(DirectionalLight light)
	{
		if(jme3Application != null)
		{
			if(light != null)
			{
				if(!jme3Application.getViewPort().getProcessors().contains(getDirectionalLightShadowRenderer()))
				{
					jme3Application.getViewPort().addProcessor(getDirectionalLightShadowRenderer());	
				}
				
				if(!jme3Application.getViewPort().getProcessors().contains(getSunFilterPostProcessor()))
				{
					jme3Application.getViewPort().addProcessor(getSunFilterPostProcessor());
				}
				
				getDirectionalLightShadowRenderer().setLight(light);
				getDirectionalLightShadowFilter().setLight(light);
			}
			else
			{
				// Removes Shadow Processors.
				if(jme3Application.getViewPort().getProcessors().contains(getDirectionalLightShadowRenderer()))
				{
					jme3Application.getViewPort().removeProcessor(getDirectionalLightShadowRenderer());	
				}
				
				if(jme3Application.getViewPort().getProcessors().contains(getSunFilterPostProcessor()))
				{
					jme3Application.getViewPort().removeProcessor(getSunFilterPostProcessor());
				}								
			}
		}				
	}
	
	private void enableBloom(boolean newEnableBloom)
	{
		enableBloom = newEnableBloom;				
		
		if(jme3Application != null)
		{			
			if(newEnableBloom)
			{								
				if(!jme3Application.getViewPort().getProcessors().contains(getBloomFilterPostProcessor()))
				{
					jme3Application.getViewPort().addProcessor(getBloomFilterPostProcessor());
				}
				
				Logger.INSTANCE.log(Activator.ID, this, "Enabled Bloom." , EventSeverity.INFO);
			}
			else
			{
				if(jme3Application.getViewPort().getProcessors().contains(getBloomFilterPostProcessor()))
				{
					jme3Application.getViewPort().removeProcessor(getBloomFilterPostProcessor());
				}
				
				Logger.INSTANCE.log(Activator.ID, this, "Disabled Bloom." , EventSeverity.INFO);
			}
		}				
	}
	
	private FilterPostProcessor getBloomFilterPostProcessor()
	{
		if(bloomFilterPostProcessor == null)
		{
			bloomFilterPostProcessor = new FilterPostProcessor(assetManager);	
			bloomFilterPostProcessor.addFilter(getBloomFilter());
		}
		
		return bloomFilterPostProcessor;
	}
	
	/**
	 * Return the BloomFilter used to giove the Sun and Moon an aura.
	 * @return The BloomFilter.
	 */
	private BloomFilter getBloomFilter()
	{
		if(bloomFilter == null)
		{
			bloomFilter = new BloomFilter(BloomFilter.GlowMode.Objects);
			bloomFilter.setDownSamplingFactor(2);					    
			bloomFilter.setBlurScale(1.5f);				    					    
			bloomFilter.setExposurePower(3.30f); 
			bloomFilter.setExposureCutOff(0.2f); 
			bloomFilter.setBloomIntensity(20f);
		}
		
		return bloomFilter;
	}
	
	private void setShadowMapSize(int newShadowMapSize)
	{
		shadowMapSize = newShadowMapSize;
		
		if(jme3Application != null)
		{
			if(jme3Application.getViewPort().getProcessors().contains(getDirectionalLightShadowRenderer()))
			{
				jme3Application.getViewPort().removeProcessor(getDirectionalLightShadowRenderer());	
			}
			
			if(jme3Application.getViewPort().getProcessors().contains(getSunFilterPostProcessor()))
			{
				jme3Application.getViewPort().removeProcessor(getSunFilterPostProcessor());
			}
			
			shadowsFilterPostProcessor = null;
			directionalLightShadowRenderer = null;
			directionalLightShadowFilter = null;
			
			// Force shadow filter to be reloaded if required.
			updateSunMoonVisibilityAndShadows();
		}
		
		Logger.INSTANCE.log(Activator.ID, this, "Shadow Map Size set to " + newShadowMapSize + ">." , EventSeverity.INFO);
	}
	
	/**
	 * Gets the DirectionalLightShadowRenderer used to cast shadow from the Sun or the Moon.
	 * @return The DirectionalLightShadowRenderer.
	 */
	private DirectionalLightShadowRenderer getDirectionalLightShadowRenderer()
	{
		if(directionalLightShadowRenderer == null)
		{
		    // Shadows from Sun	
		    directionalLightShadowRenderer = new DirectionalLightShadowRenderer(assetManager, shadowMapSize, 3);		    
		    directionalLightShadowRenderer.setLight(getSunLight());
		    directionalLightShadowRenderer.setLambda(0.55f);
		    directionalLightShadowRenderer.setShadowIntensity(0.6f);
		    directionalLightShadowRenderer.setEdgeFilteringMode(EdgeFilteringMode.Nearest);
		    directionalLightShadowRenderer.setEnabledStabilization(true);
		}
		
		return directionalLightShadowRenderer;
	}
	
	private FilterPostProcessor getSunFilterPostProcessor()
	{
		if(shadowsFilterPostProcessor == null)
		{
			shadowsFilterPostProcessor = new FilterPostProcessor(assetManager);
			shadowsFilterPostProcessor.addFilter(getDirectionalLightShadowFilter());	
		}
		
		return shadowsFilterPostProcessor;
	}
	
	/**
	 * Gets the DirectionalLightShadowFilter used to cast shadow from the Sun or the Moon.
	 * @return The DirectionalLightShadowFilter.
	 */
	private DirectionalLightShadowFilter getDirectionalLightShadowFilter()
	{
		if(directionalLightShadowFilter == null)
		{
		    directionalLightShadowFilter = new DirectionalLightShadowFilter(assetManager, shadowMapSize, 3);	    
		    directionalLightShadowFilter.setLight(getSunLight());
		    directionalLightShadowFilter.setLambda(0.55f);
		    directionalLightShadowFilter.setShadowIntensity(0.6f);
		    directionalLightShadowFilter.setEdgeFilteringMode(EdgeFilteringMode.Nearest);
		    directionalLightShadowFilter.setEnabled(false);
		}
		
		return directionalLightShadowFilter;
	}
	
	/**
	 * Returns the Spherical Cap (half-sphere used to represent the horizon and hide the sky).
	 * @return The geometry.
	 */
	private Geometry getHorizon()
	{
		if(horizon == null)
		{
			Mesh horizonMesh = JME3PrimitivesUtilities.createSphericalCap(SurfaceEnvironmentJMEConstants.HORIZON_RADIUS, (float) Math.toRadians(-90), 0f, 32);
			horizonMesh.updateBound();
			horizonMesh.updateCounts();
			
			horizon = new Geometry("Horizon", horizonMesh);			
			horizon.setMaterial(createHorizonMaterial());
			horizon.setShadowMode(ShadowMode.Off);
		}
		
		return horizon;
	}
	
	/**
	 * Creates the material used on the horizon geometry.
	 * @return The Material.
	 */
	private Material createHorizonMaterial()
	{		
		Material mat = new Material(assetManager,  "Common/MatDefs/Misc/Unshaded.j3md");			
		mat.setColor("Color", HORIZON_COLOR.clone());				
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);
		
		return mat;
	}
	
	/**
	 * Return the full sphere used to represent the atmosphere (blue sky). 
	 * The atmosphere is made transparent at night to reveal the stars.
	 * @return The geometry.
	 */
	private Geometry getAtmosphere()
	{
		if(atmosphere == null)
		{
			Sphere sphere = new Sphere(10, 36, SurfaceEnvironmentJMEConstants.ATMOSPHERE_RADIUS);			
			atmosphere = new Geometry("Atmosphere", sphere);
			atmosphere.setQueueBucket(Bucket.Transparent);			
			atmosphere.setMaterial(createAtmosphereMaterial());	
			atmosphere.setShadowMode(ShadowMode.Off);
		}
		
		return atmosphere;
	}
	
	/**
	 * Creates the material used on the atmosphere geometry.
	 * @return The Material.
	 */
	private Material createAtmosphereMaterial()
	{		
		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");		
		ColorRGBA atmosphereColor = JME3Utilities.convertToColorRGBA(EnvironmentUIUtilities.DAY_SKY_COLOR);
		mat.setColor("Color", atmosphereColor);				
		mat.getAdditionalRenderState().setBlendMode(BlendMode.Alpha);				
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);		
		return mat;
	}
	
	/**
	 * Updates all the geometries used to represent the sky. NOT THREAD SAFE !
	 */
	private void updateGeometry()
	{
		// Updates the geometry.
		if(horizon != null) getAttachmentNode().detachChild(horizon);	
		if(atmosphere != null) getAttachmentNode().detachChild(atmosphere);	
		
		// Creates Horizon;
		getAttachmentNode().attachChild(getHorizon());
		
		// Creates Atmosphere
		getAttachmentNode().attachChild(getAtmosphere());
		
		// Updates the Sun and Moon visibility and Shadows Status.
		updateSunMoonVisibilityAndShadows();
		
		// Updates the Sun position
		updateSun();
		
		// Updates the moon Position.
		updateMoon();
				
	}
	
	/*--------------------------------------------------------------------------------------------------------------*
	 * Sun
	 * --------------------------------------------------------------------------------------------------------------*/	
	
	private void attachSun()
	{	
		getAttachmentNode().attachChild(getSunTransform());
		getSunTransform().attachChild(getSunSphere());		
		
		if(jme3Application != null)
		{			
			jme3Application.getRootNode().addLight(getSunLight());
		}		
	}
	
	private void updateSun()
	{				
		// Updates first visibility and shadow casting.
		updateSunMoonVisibilityAndShadows();
				
		TransformNode sunTranformNode = (TransformNode) earthSky.getSun().getParent();
		Vector3d v = new Vector3d(sunTranformNode.getPosition().asTuple3d());
		v.normalize();
		
		// Update the sun light					
		updateSunLight();
		
		// Updates sun position.
		v.scale(EarthSurfaceEnvironmentJMEConstants.SUN_AND_MOON_RADIUS);
		getSunTransform().setLocalTranslation((float) v.x, (float)v.y, (float)v.z);
								
		// Updates atmosphere.
		updateAtmosphere();		
	}
	
	private Node getSunTransform()
	{
		if(sunTransform == null)
		{
			sunTransform = new Node("Sun Transform");					
		}
		
		return sunTransform;
	}
	
	private Geometry getSunSphere()
	{				
		if(sunSphere == null)
		{
			float sunRadius = (float) (EarthSurfaceEnvironmentJMEConstants.SUN_AND_MOON_RADIUS * Math.tan(earthSky.getSunAngularDiameter() / 2.0) );
						
			Sphere sphere = new Sphere(10, 36, sunRadius);
			Material mat = new Material(assetManager,  "Common/MatDefs/Misc/Unshaded.j3md");	
			mat.setColor("GlowColor",SUN_SPHERE_COLOR.clone()); 			
			mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);
	        
			sunSphere = new Geometry("Sun", sphere);
			sunSphere.setMaterial(mat);
			sunSphere.setShadowMode(ShadowMode.Off);
		}
		return sunSphere;
	}
	
	private DirectionalLight getSunLight()
	{
		if(sunLight == null)
		{
			TransformNode sunTransformNode = (TransformNode) earthSky.getSun().getParent();		
			
			float x = (float) sunTransformNode.getPosition().getX();
			float y = (float) sunTransformNode.getPosition().getY();
			float z = (float) sunTransformNode.getPosition().getZ();
			
			Vector3f direction = new Vector3f(x,y,z);
								
			sunLight  = new DirectionalLight();
			sunLight.setName("Sun");
			sunLight.setDirection(direction.normalize());
			sunLight.setColor(getSunColor(direction));							
		}
		
		return sunLight;
	}
	
	private void updateSunLight()
	{
		TransformNode sunTranformNode = (TransformNode) earthSky.getSun().getParent();		
		Matrix4d m = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(sunTranformNode);
		
		Vector3d v = new Vector3d();
		m.get(v);
		v.normalize();
		
		Vector3f direction = new Vector3f((float) v.x, (float) v.y, (float) v.z);
									
		// Updates color.
		ColorRGBA color = getSunColor(direction);
		getSunLight().setColor(color);
		
		// Updates direction.					
		direction.negateLocal();		
		getSunLight().setDirection(direction.normalize());		
		
		// Update Glow Color.
		Material mat = getSunSphere().getMaterial().clone();
		mat.setColor("GlowColor", color.clone());				
		getSunSphere().setMaterial(mat);
	}
	
	private ColorRGBA getSunColor(Vector3f sunPosition)
	{		
		double r = sunPosition.length();
		double sunAltitude = Math.asin(sunPosition.z / r);		
		
		ColorRGBA sunColor = null;
		
		if(isSunVisible())
		{					
			sunColor = JME3Utilities.convertToColorRGBA(EnvironmentUIUtilities.INSTANCE.getSunLightColor(sunAltitude));
		}
		else
		{
			sunColor =  ColorRGBA.BlackNoAlpha;
		}
		return sunColor;
	}
	
	/*--------------------------------------------------------------------------------------------------------------*
	 * Moon
	 * --------------------------------------------------------------------------------------------------------------*/	
	
	private void attachMoon()
	{	
		getAttachmentNode().attachChild(getMoonTransform());
		getMoonTransform().attachChild(getMoonSphere());
		
		if(jme3Application instanceof JME3Application)
		{
			JME3Application viewer = (JME3Application) jme3Application;
			viewer.getRootNode().addLight(getMoonLight());
		}	
	}
	
	private void updateMoon()
	{	
		// Updates first visibility and shadow casting.
		updateSunMoonVisibilityAndShadows();
				
		// Updates the moon transform.
		TransformNode moonTranformNode = (TransformNode) earthSky.getMoon().getParent();
		Vector3d v = new Vector3d(moonTranformNode.getPosition().asTuple3d());
		v.normalize();
		v.scale(EarthSurfaceEnvironmentJMEConstants.SUN_AND_MOON_RADIUS);									
		getMoonTransform().setLocalTranslation((float) v.x, (float)v.y, (float)v.z);
				
		// Update the moon light					
		updateMoonLight();					
	}

	private void updateMoonLight()
	{
		TransformNode moonTranformNode = (TransformNode) earthSky.getMoon().getParent();
		
		Matrix4d m = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(moonTranformNode);
		
		Vector3d v = new Vector3d();
		m.get(v);
		v.normalize();
		
		Vector3f direction = new Vector3f((float) v.x, (float) v.y, (float) v.z);
									
		// Updates color.
		ColorRGBA color = getMoonColor(direction);
		getMoonLight().setColor(color);
		
		// Update Glow Color.
		Material mat = getSunSphere().getMaterial().clone();
		mat.setColor("GlowColor", color.clone());				
		getMoonSphere().setMaterial(mat);
		
		// Updates direction.					
		direction.negateLocal();		
		getMoonLight().setDirection(direction.normalize());
	}
	
	private DirectionalLight getMoonLight()
	{
		if(moonLight == null)
		{
			TransformNode sunTransformNode = (TransformNode) earthSky.getMoon().getParent();		
			
			float x = (float) sunTransformNode.getPosition().getX();
			float y = (float) sunTransformNode.getPosition().getY();
			float z = (float) sunTransformNode.getPosition().getZ();
			
			Vector3f direction = new Vector3f(x,y,z);
								
			moonLight  = new DirectionalLight();
			moonLight.setName("Moon");
			moonLight.setDirection(direction.normalize());
			moonLight.setColor(getMoonColor(direction));							
		}
		
		return moonLight;
	}
	
	private ColorRGBA getMoonColor(Vector3f moonPosition)
	{	
		ColorRGBA moonColor = null;
		
		// If the sun is up, turn off the moon
		if(sunVisible)
		{
			moonColor = new ColorRGBA(0, 0, 0, 0);
		}
		else
		{
			double rMoon = moonPosition.length();
			double moonAltitude = Math.asin(moonPosition.z / rMoon);	
			
			if(isMoonVisible())
			{			
				moonColor = JME3Utilities.convertToColorRGBA(EnvironmentUIUtilities.INSTANCE.getSunLightColor(moonAltitude));
			}
			else
			{
				moonColor = ColorRGBA.BlackNoAlpha;
			}
		}		
		
		return moonColor;
	}
		
	private Node getMoonTransform()
	{
		if(moonTransform == null)
		{
			moonTransform = new Node("Moon Transform");						
		}
		
		return moonTransform;
	}
	
	private Geometry getMoonSphere()
	{				
		if(moonSphere == null)
		{
			float moonRadius = (float) (EarthSurfaceEnvironmentJMEConstants.SUN_AND_MOON_RADIUS * Math.tan(earthSky.getMoonAngularDiameter() / 2.0) );
									
			Sphere sphere = new Sphere(10, 36, moonRadius);
			Material mat = new Material(assetManager,  "Common/MatDefs/Misc/Unshaded.j3md");	
			mat.setColor("GlowColor",MOON_SPHERE_COLOR.clone());    	
			mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);
			
	        moonSphere = new Geometry("Moon", sphere);
	        moonSphere.setMaterial(mat);
	        moonSphere.setShadowMode(ShadowMode.Off);
		}
		return moonSphere;
	}
	
	/*--------------------------------------------------------------------------------------------------------------*
	 * Atmosphere
	 * --------------------------------------------------------------------------------------------------------------*/	
	private void updateAtmosphere()
	{		
		float atmosphereTransparency = (float) EnvironmentUIUtilities.INSTANCE.getSkyTransparency(earthSky.getSunHorizontalCoordinates().getAltitude());										
		Color3f skyColor = EnvironmentUIUtilities.INSTANCE.getSkyColor(earthSky.getSunHorizontalCoordinates().getAltitude());
		ColorRGBA atmosphereColor = new ColorRGBA(skyColor.x, skyColor.y, skyColor.z, 1.0f - atmosphereTransparency);		
		getAtmosphere().getMaterial().setColor("Color", atmosphereColor);		
	}
	
	
	/*--------------------------------------------------------------------------------------------------------------*
	 * Adapters
	 * --------------------------------------------------------------------------------------------------------------*/	
	
	private Adapter getSunAdapter()
	{
		if(sunAdapter == null)
		{
			sunAdapter = new AdapterImpl()
			{
				public void notifyChanged(org.eclipse.emf.common.notify.Notification msg) 
				{
					jme3Application.enqueue(new Callable<Object>() 
					{
						@Override
						public Object call() throws Exception 
						{	
							updateSun();							
							return null;
						}
					});	
				}
			};
		}
		
		return sunAdapter;
	}
	
	private Adapter getMoonAdapter()
	{
		if(moonAdapter == null)
		{
			moonAdapter = new AdapterImpl()
			{
				public void notifyChanged(org.eclipse.emf.common.notify.Notification msg) 
				{			
					jme3Application.enqueue(new Callable<Object>() 
					{
						@Override
						public Object call() throws Exception 
						{
							updateMoon();
							return null;
						}
					});	
				}
			};
		}
		
		return moonAdapter;
	}


}
