package org.eclipse.symphony.common.topology.ui.jme3;

import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.util.concurrent.Callable;

import javax.vecmath.Color3f;

import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.topology.ui.jme3.internal.CreateSceneGraphHTMLActionListener;
import org.eclipse.symphony.common.topology.ui.jme3.internal.CustomCameraControl;
import org.eclipse.symphony.common.topology.ui.jme3.internal.CustomScreenshotAppState;
import org.eclipse.symphony.common.topology.ui.jme3.internal.ICameraControl;
import org.eclipse.symphony.common.topology.ui.jme3.internal.MousePickListener;

import com.jme3.app.SimpleApplication;
import com.jme3.asset.AssetManager;
import com.jme3.light.AmbientLight;
import com.jme3.light.DirectionalLight;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.system.AppSettings;
import com.jme3.system.JmeContext;
import com.jme3.system.lwjgl.LwjglCanvas;

public class JME3Application extends SimpleApplication
{
	public static final String JME3_CANVAS_INIT_DELAY_ENV_VAR = "JME3_CANVAS_INIT_DELAY";
	public static final long DEFAULT_JME3_CANVAS_DELAY = 5000;
	
	private JME3RenderEngineDelegate jme3RenderEngineDelegate;
	
	private Composite jme3Window;
	private Frame jme3awtFrame;
	
	private DirectionalLight keyLight;
	private DirectionalLight fillLight;
	private DirectionalLight backLight;
	private DirectionalLight headLight;
	
	// Scene nodes.
	private com.jme3.scene.Node sceneCentreTransform;
	private com.jme3.scene.Node sceneRoot;

	private ICameraControl customCamera;	
	private CustomScreenshotAppState customScreenshotAppState;
	private CreateSceneGraphHTMLActionListener createSceneGraphHTMLActionListener;
	private MousePickListener mousePickListener;
	
	public JME3Application(Composite parent)
	{
		super();	
					
		AppSettings newSetting = new AppSettings(true);				
		newSetting.setFrameRate(org.eclipse.symphony.common.topology.ui.viewer.Activator.getDefault().getMaximumFrameRate());
		if(org.eclipse.symphony.common.topology.ui.viewer.Activator.getDefault().isAntialiasing())
		{
			newSetting.setSamples(4);			
		}
		else
		{
			newSetting.setSamples(0);			
		}
		
		//newSetting.setMinResolution(1280, 960);
		newSetting.setMinResolution(640, 480);		
		setSettings(newSetting);
								
		start(JmeContext.Type.Canvas);
				
		LwjglCanvas canvas = (LwjglCanvas) getContext();
		
		// Force to wait for canvas to have started.
		startCanvas(true);
		
		jme3Window = new Composite(parent, SWT.EMBEDDED);		
		jme3Window.addFocusListener(new FocusListener() 
		{
			private long focusLostTime = 0;
			
			@Override
			public void focusLost(FocusEvent e) 
			{
				focusLostTime = System.currentTimeMillis();				
				enableMouseNavigation(false);
			}
			
			@Override
			public void focusGained(FocusEvent e) 
			{			
				long now = System.currentTimeMillis();
				if((now - focusLostTime) > 1000)
				{
					enableMouseNavigation(true);
				}
				else
				{
					enableMouseNavigation(false);
				}
			}
		});
				
		jme3awtFrame = SWT_AWT.new_Frame(jme3Window);
		jme3awtFrame.add(canvas.getCanvas());		
		
		
		canvas.getCanvas().setFocusable(false);		
		setShowStatisticsEnabled(false);				
	}
		
	public void setJMERenderEngineDelegate(JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		this.jme3RenderEngineDelegate = jme3RenderEngineDelegate;			
	}		
	
	public JME3RenderEngineDelegate getJMERenderEngineDelegate() 
	{
		return jme3RenderEngineDelegate;
	}

	@Override
	public void simpleInitApp() 
	{
		// Wait for canvas initialization. Temporary fix to BUG 1555.
		waitForCanvasInitialization();
		
		setPauseOnLostFocus(false);
		
		// Creates the scene graph.
		createSceneGraph();
						
		// Sets the far clipping plane to 25 km.
		getCamera().setFrustumFar(25000f);	
		
		// Position the camera		
		getCamera().setLocation(new Vector3f(-10, 0, 0));
		getCamera().lookAt(new Vector3f(), Vector3f.UNIT_Z);
				
		// Initialize the lighting.
		initLighting();
			
		// Attach Camera Control.
		getFlyByCamera().setEnabled(false);
		
		customCamera = new CustomCameraControl(getCamera(), getSceneRoot(), inputManager, this);
		customCamera.setEnabled(true);		
		
		// Configure the Screen Shot Action listener.
		createSceneGraphHTMLActionListener = new CreateSceneGraphHTMLActionListener(inputManager, this);
		createSceneGraphHTMLActionListener.setEnabled(true);	
		
		// Add the mouse listener used for picking objects.
		getMousePickListener();		
	}
	
	@Override
	public AssetManager getAssetManager() 
	{		
		int tries = 0;
		while(super.getAssetManager() == null && tries < 20)
		{
			try 
			{
				Thread.sleep(100);				
			} 
			catch (InterruptedException e) 
			{				
				e.printStackTrace();
			}
		}
		return super.getAssetManager();
	}
	
	public void setShowStatisticsEnabled(boolean enable) 
	{		
		setDisplayFps(enable);
		setDisplayStatView(enable);
	}
	
	public void setAntiAliasing(boolean enable) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting anti aliasing to <" + enable + ">.", EventSeverity.INFO);
				
		settings.setFrameRate(org.eclipse.symphony.common.topology.ui.viewer.Activator.getDefault().getMaximumFrameRate());
		
		if(enable)
		{
			settings.setSamples(4);			
		}
		else
		{
			settings.setSamples(0);			
		}
		
		enqueue(new Callable<Object>() 
		{ 
			@Override
			public Object call() throws Exception 
			{
				setSettings(settings);	
				restart();	
				return null;
			}
		});				
	}
	
	public void setMaximumFrameRate(int maximumFrameRate) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting Maximum Frame Rate to <" + maximumFrameRate + "> fps.", EventSeverity.INFO);		
		
		if(settings == null)
		{
			settings = new AppSettings(true);
		}
		
		settings.setFrameRate(maximumFrameRate);
		setSettings(settings);
	}
	
	public BufferedImage takeScreenshot() 
	{				
		getCustomScreenshotAppState().takeSnapshot();
		
		int tries = 0;
		while(getCustomScreenshotAppState().getCapturedImage() == null && tries < 5)
		{
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{				
				e.printStackTrace();
			}
			tries++;
		}
		
		return getCustomScreenshotAppState().getCapturedImage();
	}
	
	
	/**
	 * Cause the viewpoint orientation to be updated such that the view has the +Z in the up direction.
	 */
	public void levelViewPoint()
	{
		if(customCamera != null)
		{			
			customCamera.levelPose();
		}
	}
	
	public void setHighSpeedMotionEnabled(boolean highSpeedMotionEnabled) 
	{		
		if(customCamera != null)
		{			
			customCamera.setHighSpeedMotionEnabled(highSpeedMotionEnabled);
		}
	}
	
	public void setPickingModeEnabled(boolean pickingModeEnabled) 
	{
		if(mousePickListener != null)
		{
			mousePickListener.setPickEnabled(pickingModeEnabled);
		}
	}
	
	public void dispose()
	{
		// Disbale the Screen Shot Action Listener.
		getCustomScreenshotAppState().setEnabled(false);
		
		// Stops the viewer.
		stop();
		
		// Dispose of the AWt Frame.
		if(jme3awtFrame != null)
		{
			jme3awtFrame.dispose();
		}
	}
	
	public void setArbitraryViewPointLocation(Vector3f newLocation)
	{
		if(customCamera != null)
		{
			customCamera.setCurrentLocation(newLocation);
		}
	}
	
	public Vector3f getArbitraryViewPointLocation()
	{
		if(customCamera != null)
		{
			return customCamera.getCurrentLocation();
		}
		else
		{
			return new Vector3f();
		}
	}
	
	public void setArbitraryViewPointRotation(Quaternion newRotation)
	{
		if(customCamera != null)
		{
			customCamera.setCurrentOrientation(newRotation);
		}
	}
	
	public Quaternion getArbitraryViewPointRotation()
	{
		if(customCamera != null)
		{
			return customCamera.getCurrentOrientation();
		}
		else
		{
			return new Quaternion();
		}
	}
	
	protected void initLighting() 
	{
		float ambLightRBG = 0.25f;
		AmbientLight ambLight = new AmbientLight();
		ambLight.setColor(new ColorRGBA(ambLightRBG, ambLightRBG, ambLightRBG, 1f));

		// Directions
		javax.vecmath.Vector3f keyLightDirection = new javax.vecmath.Vector3f(1,0,0);
		javax.vecmath.Vector3f fillLightDirection = new javax.vecmath.Vector3f(1,0,0);
		javax.vecmath.Vector3f backLightDirection = new javax.vecmath.Vector3f(1,0,0);

		Color3f keyLightColor = new Color3f(1, 1, 1);
		Color3f fillLightColor = new Color3f(1, 1, 1);
		Color3f backLightColor = new Color3f(1, 1, 1);
		Color3f headLightColor = new Color3f(1, 1, 1);

		keyLight = new DirectionalLight();
		keyLight.setColor(JME3TypeFactory.INSTANCE.createColorRGBA(keyLightColor));
		keyLight.setDirection(JME3TypeFactory.INSTANCE.createVector3f(keyLightDirection));

		fillLight = new DirectionalLight();
		fillLight.setColor(JME3TypeFactory.INSTANCE.createColorRGBA(fillLightColor));
		fillLight.setDirection(JME3TypeFactory.INSTANCE.createVector3f(fillLightDirection));

		backLight = new DirectionalLight();
		backLight.setColor(JME3TypeFactory.INSTANCE.createColorRGBA(backLightColor));
		backLight.setDirection(JME3TypeFactory.INSTANCE.createVector3f(backLightDirection));

		headLight = new DirectionalLight();
		headLight.setColor(JME3TypeFactory.INSTANCE.createColorRGBA(headLightColor));
		headLight.setDirection(new Vector3f(0f, 0f, -1f));

		rootNode.addLight(keyLight);
		rootNode.addLight(fillLight);
		rootNode.addLight(backLight);
		rootNode.addLight(headLight);

		AmbientLight al = new AmbientLight();
        al.setColor(ColorRGBA.White.mult(1.0f));
        rootNode.addLight(al);
		
		// registerLightingPreferenceListener();
	}
			
	public com.jme3.scene.Node getSceneRoot() 
	{
		if (sceneRoot == null) 
		{
			sceneRoot = new com.jme3.scene.Node("Scene Root");
			rootNode.attachChild(sceneRoot);
		}
		return sceneRoot;
	}
	
	public AppSettings getAppSettings()
	{
		return settings;
	}
	
	private void waitForCanvasInitialization()
	{
		long delay = DEFAULT_JME3_CANVAS_DELAY;
		
		// Check to see if the JME3_CANVAS_INIT_DELAY env variable has been set.
		String delayString = System.getenv(JME3_CANVAS_INIT_DELAY_ENV_VAR); 
		if(delayString != null)
		{
			try
			{
				delay = Math.round(Math.abs((Double.parseDouble(delayString) * 1000)));
			}
			catch(Exception e)
			{			
				Logger.INSTANCE.log(Activator.ID, this, "Invalid value of <" + delayString  + "> found for " + JME3_CANVAS_INIT_DELAY_ENV_VAR + ", using default value of <" + DEFAULT_JME3_CANVAS_DELAY + "> ms...", EventSeverity.WARNING);
			}
		}
		
		
		// Wait for delay.
		try 
		{
			Logger.INSTANCE.log(Activator.ID, this, "Waiting for <" + delay + "> ms for JMECanvas to initialize...", EventSeverity.INFO);			
			Thread.sleep(delay);
			Logger.INSTANCE.log(Activator.ID, this, "Waiting for <" + delay + "> ms for JMECanvas to initialize completed.", EventSeverity.OK);
		} 
		catch (InterruptedException e) 
		{		
			e.printStackTrace();
		}
	}
	
	private void createSceneGraph() 
	{
		sceneCentreTransform = new com.jme3.scene.Node("Scene Centre Transform");
		getSceneRoot().attachChild(sceneCentreTransform);
	}
	
	private CustomScreenshotAppState getCustomScreenshotAppState()
	{
		if(customScreenshotAppState == null)
		{
			customScreenshotAppState = new CustomScreenshotAppState();
			stateManager.attach(customScreenshotAppState);
		}
		
		return customScreenshotAppState;
	}
	
	private void enableMouseNavigation(boolean mouseNavigationEnabled)
	{		
		LwjglCanvas canvas = (LwjglCanvas) getContext();	
		if(canvas != null)
		{
			canvas.getCanvas().setFocusable(mouseNavigationEnabled);
		}
	}
	
	private MousePickListener getMousePickListener()
	{
		if(mousePickListener == null)
		{
			mousePickListener = new MousePickListener(getCamera(), this, getInputManager())
			{				
				@Override
				protected void pickingEnabled(boolean enable) 
				{	
					// Disables navigation when picking.
					if(customCamera != null)
					{
						customCamera.setEnabled(!enable);
					}
				}
				
				@Override
				protected void fireSelectionChanged(SelectionChangedEvent event) 
				{				
					jme3RenderEngineDelegate.getTopologyViewer().setSelection(event.getSelection());
				}
			};
		}
		
		return mousePickListener;
	}
	
}
