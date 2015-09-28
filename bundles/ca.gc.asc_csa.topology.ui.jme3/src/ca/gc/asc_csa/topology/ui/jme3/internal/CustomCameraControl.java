package ca.gc.asc_csa.topology.ui.jme3.internal;

import java.io.IOException;
import java.util.Stack;

import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

import ca.gc.asc_csa.topology.ui.jme3.JME3Application;

import com.jme3.export.JmeExporter;
import com.jme3.export.JmeImporter;
import com.jme3.input.InputManager;
import com.jme3.input.KeyInput;
import com.jme3.input.MouseInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.AnalogListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.MouseAxisTrigger;
import com.jme3.input.controls.MouseButtonTrigger;
import com.jme3.math.Matrix4f;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.Camera;
import com.jme3.renderer.RenderManager;
import com.jme3.renderer.ViewPort;
import com.jme3.scene.Spatial;
import com.jme3.scene.control.Control;

public class CustomCameraControl implements ActionListener, AnalogListener, ICameraControl, IPropertyChangeListener 
{		
	public static final String LEFT_MOUSE_BUTTON = "LeftMouseButton";		
	public static final String MIDDLE_MOUSE_BUTTON = "MiddleMouseButton";
	public static final String RIGHT_MOUSE_BUTTON = "RightMouseButton";
	
	public static final String MOUSE_MOTION_LEFT = "MouseMotionLeft";
	public static final String MOUSE_MOTION_RIGHT = "MouseMotionRight";		
	
	public static final String MOUSE_MOTION_UP = "MouseMotionUp";
	public static final String MOUSE_MOTION_DOWN = "MouseMotionDown";		
	
	public static final String MOUSE_MOTION_FORWARD = "MouseMotionForward";
	public static final String MOUSE_MOTION_AFT = "MouseMotionAft";		
	
	public static final String KEYBOARD_RESET_POSE = "ResetPose";
	public static final String KEYBOARD_SAVE_POSE = "RecordPose";
	public static final String KEYBOARD_GOTO_LAST_POSE = "GotoLastPose";
	public static final String KEYBOARD_LEVEL_POSE = "LevelPose";
	public static final String KEYBOARD_HIGH_TRANSLATION_SPEED = "HighTranslationSpeed";
	
    private String[] inputs = {LEFT_MOUSE_BUTTON, MIDDLE_MOUSE_BUTTON, RIGHT_MOUSE_BUTTON, MOUSE_MOTION_LEFT, MOUSE_MOTION_RIGHT, MOUSE_MOTION_DOWN, 
    		MOUSE_MOTION_UP, MOUSE_MOTION_FORWARD, MOUSE_MOTION_AFT, KEYBOARD_SAVE_POSE, KEYBOARD_GOTO_LAST_POSE, KEYBOARD_RESET_POSE, KEYBOARD_LEVEL_POSE, KEYBOARD_HIGH_TRANSLATION_SPEED};

	
	private boolean leftMouseButton = false;
	private boolean middleMouseButton = false;
	private boolean rightMouseButton = false;
	
	private boolean cameraPoseDirty = false;
	
	private boolean highSpeedMotionEnabled = false;
	
	private Vector3f initialLocation = new Vector3f();
	private Quaternion initialOrientation = new Quaternion();
	
	private Vector3f currentLocation = new Vector3f();
	private Quaternion currentOrientation = new Quaternion();
	
	private Stack<Matrix4f> poseStack = new Stack<Matrix4f>();
	
	////////////////////////////////
	
	private Spatial target = null;	
	
	private float translationSpeed = 2.0f;
	private float translationSpeedMultiplier = 1.0f;
	
	private float rotationSpeed = 1.0f;
	private float rotationSpeedMultiplier = 1.0f;
	
	private Camera cam = null;
	private InputManager inputManager;
	private JME3Application viewer;
		
	private boolean inputsRegistered = false;
	private boolean enabled = true;

    /**
     * Constructs the chase camera
     * @param cam the application camera
     * @param target the spatial to follow
     */
    public CustomCameraControl(Camera cam, final Spatial target) 
    {
        this.target = target;
        target.addControl(this);
        setCamera(cam);   
        
        ca.gc.asc_csa.topology.ui.viewer.Activator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
    }

    /**
     * Constructs the chase camera, and registers inputs
     * @param cam the application camera
     * @param target the spatial to follow
     * @param inputManager the inputManager of the application to register inputs
     */
    public CustomCameraControl(Camera cam, final Spatial target, InputManager inputManager, JME3Application viewer) 
    {
        this.target = target;
        this.viewer = viewer;
        target.addControl(this);
        setCamera(cam);
        registerWithInput(inputManager);
        
        ca.gc.asc_csa.topology.ui.viewer.Activator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
    }

    @Override
    public void dispose() 
    {
    	// Unregister preferences listener.
    	ca.gc.asc_csa.topology.ui.viewer.Activator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
    	
    	// Disable.
    	setEnabled(false);
    	
    	// Un-register all inputs.
    	if(inputManager != null)
    	{
    		unregisterInput(inputManager);
    		inputManager = null;
    	}
    	
    	// Detach from target.
    	if(target != null)
    	{
    		target.removeControl(this);
    		target = null;
    	}
    	
    	// Release pointer to camera
    	this.cam = null;
    	
    	// Release pointer to viewer
    	this.viewer = null;
    }
    
    @Override
	public Vector3f getCurrentLocation() 
    {		
		return currentLocation;
	}

	@Override
	public void setCurrentLocation(Vector3f newLocation) 
	{	
		this.currentLocation = newLocation;
		cameraPoseDirty = true;
	}

	@Override
	public Quaternion getCurrentOrientation() 
	{
		return currentOrientation;
	}

	@Override
	public void setCurrentOrientation(Quaternion newRotation) 
	{
		this.currentOrientation = newRotation;
		cameraPoseDirty = true;
	}
    
    public float getTranslationSpeed() 
    {
		return translationSpeed;
	}

	public void setTranslationSpeed(float translationSpeed) 
	{
		this.translationSpeed = translationSpeed;
	}

	public float getRotationSpeed() 
	{
		return rotationSpeed;
	}

	public void setRotationSpeed(float rotationSpeed) 
	{
		this.rotationSpeed = rotationSpeed;
	}

	public void resetLocation(Vector3f newLocation)
	{
		initialLocation = newLocation;
		resetPause();
	}
	
	public void resetOrientation(Quaternion newOrientation)
	{
		initialOrientation = newOrientation;
		resetPause();
	}
	
	public void onAction(String name, boolean keyPressed, float tpf) 
    {    
    	if(isEnabled())
    	{
    		// System.out.println("CustomCamera.onAction() " + name + " : " + keyPressed);
    		
	        if(name.equals(LEFT_MOUSE_BUTTON))
	        {
	        	if (keyPressed) 
	            {
	        		leftMouseButton = true;     
	        		inputManager.setCursorVisible(false);
	            } 
	            else 
	            {
	            	leftMouseButton = false; 
	            	inputManager.setCursorVisible(true);
	            }
	        }
	        else if(name.equals(MIDDLE_MOUSE_BUTTON))
	        {
	        	if (keyPressed) 
	            {
	        		middleMouseButton = true;           
	        		inputManager.setCursorVisible(false);
	            } 
	            else 
	            {
	            	middleMouseButton = false;   
	            	inputManager.setCursorVisible(true);
	            }
	        }
	        else if(name.equals(RIGHT_MOUSE_BUTTON))
	        {
	        	if (keyPressed) 
	            {
	        		rightMouseButton = true;    
	        		inputManager.setCursorVisible(false);
	            } 
	            else 
	            {
	            	rightMouseButton = false;  
	            	inputManager.setCursorVisible(true);
	            }
	        }
	        else if(name.equals(KEYBOARD_RESET_POSE))
	        {
	        	if(keyPressed)
	        	{
	        		resetPause();
	        	}
	        }
	        else if(name.equals(KEYBOARD_SAVE_POSE))
	        {
	        	if(keyPressed)
	        	{
	        		savePose();
	        	}
	        }
	        else if(name.equals(KEYBOARD_GOTO_LAST_POSE))
	        {
	        	if(keyPressed)
	        	{
	        		gotoLastPose();
	        	}
	        }
	        else if(name.equals(KEYBOARD_LEVEL_POSE))
	        {
	        	if(keyPressed)
	        	{
	        		levelPose();
	        	}
	        }	        
	        else if(name.equals(KEYBOARD_HIGH_TRANSLATION_SPEED))
	        {	        	
	        	setHighSpeedMotionEnabled(keyPressed);
	        }
    	}
    }

    public void onAnalog(String name, float value, float tpf) 
    {
    	if(isEnabled())
    	{
    		if (name.equals(MOUSE_MOTION_LEFT)) 
	        {        	
	        	if(leftMouseButton)
	        	{
	        		// Yaw left
	        		yawCamera(value);
	        	}
	        	else if(middleMouseButton)
	        	{
	        		// No motion
	        		moveCameraLeftRight(value);   
	        	}
	        	else if(rightMouseButton)
	        	{
	        		// Translate left
	        		moveCameraLeftRight(value);
	        	}
	        } 
	        else if (name.equals(MOUSE_MOTION_RIGHT)) 
	        {
	        	if(leftMouseButton)
	        	{
	        		// Yaw right
	        		yawCamera(-value);
	        	}
	        	else if(middleMouseButton)
	        	{
	        		// Nothing
	        		moveCameraLeftRight(-value);        		
	        	}
	        	else if(rightMouseButton)
	        	{
	        		// Translate right
	        		moveCameraLeftRight(-value);
	        	}         
	        } 
	        else if (name.equals(MOUSE_MOTION_UP)) 
	        {
	        	if(leftMouseButton)
	        	{
	        		// Pitch Up
	        		pitchCamera(-value);
	        	}
	        	else if(middleMouseButton)
	        	{
	        		// Move forward
	        		moveCameraForwardAft(value);
	        	}
	        	else if(rightMouseButton)
	        	{
	        		// Translate up   
	        		moveCameraUpDown(value);
	        	}
	        } 
	        else if (name.equals(MOUSE_MOTION_DOWN)) 
	        {
	        	if(leftMouseButton)
	        	{
	        		// Pitch Down
	        		pitchCamera(value);
	        	}
	        	else if(middleMouseButton)
	        	{
	        		// Move aft
	        		moveCameraForwardAft(-value);
	        	}
	        	else if(rightMouseButton)
	        	{
	        		// Translate down
	        		moveCameraUpDown(-value);
	        	}            
	        } 
	        else if (name.equals(MOUSE_MOTION_FORWARD)) 
	        {
	        	if(leftMouseButton)
	        	{
	        		// No motion
	        	}
	        	else if(middleMouseButton)
	        	{
	        		// Move forward
	        		moveCameraForwardAft(-value);
	        	}
	        	else if(rightMouseButton)
	        	{
	        		// No motion		
	        	}       
	            
	        } 
	        else if (name.equals(MOUSE_MOTION_AFT)) 
	        {
	        	if(leftMouseButton)
	        	{
	        		// No motion
	        	}
	        	else if(middleMouseButton)
	        	{
	        		// Move aft
	        		moveCameraForwardAft(value);
	        	}
	        	else if(rightMouseButton)
	        	{
	        		// No motion		
	        	}
	        }	        
    	}
    	
    	if(cameraPoseDirty)
    	{
    		updateCamera();
    		cameraPoseDirty = false;
    	}
    }

    public void levelPose()
    {
    	// Finds the current direction we are pointing at.
    	Vector3f v = new Vector3f(0, 0, 1);
    	v = currentOrientation.mult(v);
    	
    	// Flatten v on the xy plane.
    	v.z = 0;
    	v = v.normalize();
    	
    	// Update orientation to level the view.
    	currentOrientation.lookAt(v, new Vector3f(0, 0, 1f));
    	    	
    	// Updates the camera.
    	updateCamera();
    }
    
    public void setHighSpeedMotionEnabled(boolean highSpeedMotionEnabled)
    {    	
    	this.highSpeedMotionEnabled = highSpeedMotionEnabled;
    	if(highSpeedMotionEnabled)
    	{
    		translationSpeedMultiplier = (float) ca.gc.asc_csa.topology.ui.viewer.Activator.getDefault().getNavigationLinearHighSpeedFactor();
    	}
    	else
    	{
    		translationSpeedMultiplier = (float) ca.gc.asc_csa.topology.ui.viewer.Activator.getDefault().getNavigationLinearLowSpeedFactor();
    	}
    }
    
    private void setCamera(Camera camera)
    {
    	this.cam = camera;
    	
    	currentLocation = cam.getLocation().clone();
    	currentOrientation = cam.getRotation().clone();
    	    	
    	initialLocation = cam.getLocation().clone();
    	initialOrientation = cam.getRotation().clone();
    }
    
    /**
     * Registers inputs with the input manager.
     * @param inputManager
     */
    private void registerWithInput(InputManager inputManager) 
    {  
    	//System.out.println("registerWithInput()");
    	
        this.inputManager = inputManager;
    
        inputManager.addMapping(LEFT_MOUSE_BUTTON, new MouseButtonTrigger(MouseInput.BUTTON_LEFT));
        inputManager.addMapping(MIDDLE_MOUSE_BUTTON, new MouseButtonTrigger(MouseInput.BUTTON_MIDDLE));
        inputManager.addMapping(RIGHT_MOUSE_BUTTON, new MouseButtonTrigger(MouseInput.BUTTON_RIGHT));
        
        inputManager.addMapping(MOUSE_MOTION_LEFT, new MouseAxisTrigger(0, true));
        inputManager.addMapping(MOUSE_MOTION_RIGHT, new MouseAxisTrigger(0, false));
        
        inputManager.addMapping(MOUSE_MOTION_DOWN, new MouseAxisTrigger(1, true));
        inputManager.addMapping(MOUSE_MOTION_UP, new MouseAxisTrigger(1, false));
        
        inputManager.addMapping(MOUSE_MOTION_FORWARD, new MouseAxisTrigger(2, true));
        inputManager.addMapping(MOUSE_MOTION_AFT, new MouseAxisTrigger(2, false));
        
        inputManager.addMapping(KEYBOARD_SAVE_POSE, new KeyTrigger(KeyInput.KEY_S));
        inputManager.addMapping(KEYBOARD_GOTO_LAST_POSE, new KeyTrigger(KeyInput.KEY_B));
        inputManager.addMapping(KEYBOARD_RESET_POSE, new KeyTrigger(KeyInput.KEY_R));
        inputManager.addMapping(KEYBOARD_LEVEL_POSE, new KeyTrigger(KeyInput.KEY_L));
        
        inputManager.addMapping(KEYBOARD_HIGH_TRANSLATION_SPEED, new KeyTrigger(KeyInput.KEY_Q));        
            
        inputManager.addListener(this, inputs);
               
        inputsRegistered = true;

        updateCamera();
    }
    
    private void unregisterInput(InputManager inputManager)
    {
    	for(int i = 0; i < inputs.length; i++)
    	{
    		if(inputManager.hasMapping(inputs[i]))
    		{
    			inputManager.deleteMapping(inputs[i]);
    		}
    	}    	
    	
    	inputManager.removeListener(this);
    	
    	
    	inputsRegistered = false;
    }
    
    private void resetPause()
    {    	    	
    	currentLocation = initialLocation.clone();
    	currentOrientation = initialOrientation.clone();
    }
    
    private void gotoLastPose()
    {    	    	
    	if(!poseStack.isEmpty())
    	{
    		Matrix4f lastPose = poseStack.pop();
    		
    		currentLocation = lastPose.toTranslationVector().clone();
    		currentOrientation = lastPose.toRotationQuat().clone();
    	}
    	else
    	{    	
    		currentLocation = initialLocation.clone();
    		currentOrientation = initialOrientation.clone();
    	}
    }
            
    private void savePose()
    {
    	Matrix4f pose = new Matrix4f();
    	pose.loadIdentity();
    	
    	pose.setTranslation(currentLocation.clone());
    	pose.setRotationQuaternion(currentOrientation.clone());
    	
    	poseStack.push(pose);
    }
        
    private void yawCamera(float value) 
    {
    	Quaternion delta = new Quaternion();                
        delta.fromAngleAxis(value * rotationSpeed * rotationSpeedMultiplier, new Vector3f(0,1,0));                   
        currentOrientation = currentOrientation.mult(delta);
       	updateCamera();
    }

    private void pitchCamera(float value) 
    {   	
        Quaternion delta = new Quaternion();                
        delta.fromAngleAxis(value * rotationSpeed* rotationSpeedMultiplier, new Vector3f(1,0,0));                   
        currentOrientation = currentOrientation.mult(delta);                
        updateCamera();
    }
    
    private void moveCameraForwardAft(float value) 
    {
        Vector3f delta = new Vector3f(0, 0, value * translationSpeed * translationSpeedMultiplier);
        delta = currentOrientation.mult(delta);    
        currentLocation = currentLocation.add(delta);                        
        updateCamera();
    }
    
    private void moveCameraLeftRight(float value) 
    {
    	Vector3f delta = new Vector3f(value * translationSpeed * translationSpeedMultiplier, 0, 0);
        delta = currentOrientation.mult(delta);    
        currentLocation = currentLocation.add(delta);                        
        updateCamera();
    }

    private void moveCameraUpDown(float value) 
    {
        Vector3f delta = new Vector3f(0, value * translationSpeed * translationSpeedMultiplier,0);
        delta = currentOrientation.mult(delta);        
        currentLocation = currentLocation.add(delta);                                       
        updateCamera();
    }
    

    /**
     * Update the camera, should only be called internally
     */
    public void updateCamera() 
    {      
    	cameraPoseDirty = true;
        cam.setLocation(currentLocation);
        cam.setRotation(currentOrientation);       
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(boolean enabled) 
    {
    	// System.out.println("CustomCameraControl.setEnabled() " + enabled);
    	
    	// Reset mouse buttons.
      	leftMouseButton = false;
    	middleMouseButton = false;
    	rightMouseButton = false;
    	
        if (!enabled) 
        {     	
        	// Detach from camera
        	if(target != null) target.removeControl(this);
        	
        	if(inputsRegistered)
        	{
        		if(inputManager != null) unregisterInput(inputManager);
        	}
        }
        else
        {
        	if(target != null && (target.getControl(CustomCameraControl.class) == null))
        	{        		
        		target.addControl(this);    
        	}
        	
        	if(!inputsRegistered)
        	{
        		// Register inputs.
        		registerWithInput(inputManager);
        	}
        }
                      
        this.enabled = enabled;
    }
    /**
     * clone this camera for a spatial
     * @param spatial
     * @return
     */
    public Control cloneForSpatial(Spatial spatial) 
    {
    	CustomCameraControl cc = new CustomCameraControl(cam, spatial, inputManager, viewer);        
        return cc;
    }

    /**
     * Sets the spacial for the camera control, should only be used internally
     * @param spatial
     */
    public void setSpatial(Spatial spatial) {
        target = spatial;
    }

    /**
     * update the camera control, should only be used internally
     * @param tpf
     */
    public void update(float tpf) 
    {    	
    	if(enabled) updateCamera();    	
    }

    /**
     * renders the camera control, should only be used internally
     * @param rm
     * @param vp
     */
    public void render(RenderManager rm, ViewPort vp) {
        // nothing to render
    }

    /**
     * Write the camera
     * @param ex the exporter
     * @throws IOException
     */
    public void write(JmeExporter ex) throws IOException {        
    }

    /**
     * Read the camera
     * @param im
     * @throws IOException
     */
    public void read(JmeImporter im) throws IOException 
    {        
    }

	@Override
	public void propertyChange(PropertyChangeEvent event) 
	{						
		if(highSpeedMotionEnabled)
    	{
    		translationSpeedMultiplier = (float) ca.gc.asc_csa.topology.ui.viewer.Activator.getDefault().getNavigationLinearHighSpeedFactor();
    	}
    	else
    	{
    		translationSpeedMultiplier = (float) ca.gc.asc_csa.topology.ui.viewer.Activator.getDefault().getNavigationLinearLowSpeedFactor();
    	}				
	}	
}
