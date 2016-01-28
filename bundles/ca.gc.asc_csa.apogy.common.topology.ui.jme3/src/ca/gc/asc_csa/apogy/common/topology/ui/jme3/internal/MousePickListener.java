package ca.gc.asc_csa.apogy.common.topology.ui.jme3.internal;

import java.util.concurrent.Callable;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;

import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;

import com.jme3.collision.CollisionResult;
import com.jme3.collision.CollisionResults;
import com.jme3.font.BitmapFont;
import com.jme3.font.BitmapText;
import com.jme3.input.InputManager;
import com.jme3.input.KeyInput;
import com.jme3.input.MouseInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.MouseButtonTrigger;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Ray;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.renderer.Camera;
import com.jme3.renderer.queue.RenderQueue.Bucket;
import com.jme3.scene.Geometry;
import com.jme3.system.AppSettings;

/**
 * Listener that generated event when a mouse pick is detected. 
 * @author pallard
 *
 */
public abstract class MousePickListener implements ActionListener 
{
	public static final String PICK_ENABLED_EVENT = "KeyboardP";
	public static final String PICK_EVENT = "LeftMouseButtonPickEvent";
	
	private String[] inputs = new String[]{PICK_ENABLED_EVENT, PICK_EVENT};
	
	private Camera camera = null;
	private InputManager inputManager;
	private JME3Application jme3Application;
	
	private BitmapText hudText;
	private BitmapFont guiFont;
		
	private boolean keyBoardInputRegistered = false;	
	private boolean mouseInputRegistered = false;
		
	private boolean pickEnabled = false;
	private boolean busy = false;
	
	public MousePickListener(Camera camera, JME3Application jme3Application, InputManager inputManager)
	{
		this.camera = camera;
		this.jme3Application = jme3Application;
		this.inputManager = inputManager;
		
		registerWithInput();
	}						
	
	/**
	 * Method called when a selection is made. Should be overloaded.
	 * @param event The SelectionChangedEvent.
	 */
	protected abstract void fireSelectionChanged(final SelectionChangedEvent event);	
	
	protected abstract void pickingEnabled(boolean enable);
	
	@Override
	public void onAction(String name, boolean keyPressed, float tpf) 
	{
		if(name.equals(PICK_EVENT) && keyPressed)
		{
			if(busy)
			{
				System.out.println("Busy !");
			}
			else if(pickEnabled)
			{
				busy = true;
				CollisionResults results = new CollisionResults();
				 
			    // Convert screen click to 3d position
			    Vector2f click2d = inputManager.getCursorPosition();
			    Vector3f click3d = camera.getWorldCoordinates(new Vector2f(click2d.x, click2d.y), 0f).clone();
			    Vector3f dir = camera.getWorldCoordinates(new Vector2f(click2d.x, click2d.y), 1f).subtractLocal(click3d).normalizeLocal();
			     
			    // Aim the ray from the clicked spot forwards.
			    Ray ray = new Ray(click3d, dir);
			     
			    // Collect intersections between ray and all nodes in results list.
			    jme3Application.getRootNode().collideWith(ray, results);
			     
			    if(results.size() > 0)
			    {
			    	 CollisionResult collisionResult =  results.getCollision(0);				    	 			         
			         Vector3f contactNormal = collisionResult.getContactNormal();			         
			         Geometry geometry = collisionResult.getGeometry();			         				         			         			         			         
			         
			         Node node = jme3Application.getJMERenderEngineDelegate().getTopologyNode(geometry);			        			         			         			        
			         if(node != null)
			         {			        	 			        	 
			        	 // Transform the pick position in the node frame.
				         Matrix4d m = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(node);
				         m.invert();				         
				         Point3d relativePosition = new Point3d(collisionResult.getContactPoint().x, collisionResult.getContactPoint().y, collisionResult.getContactPoint().z);				         
				         m.transform(relativePosition);
				         
				         // Converts the normal				         
				         javax.vecmath.Vector3f contactNormalVector = new javax.vecmath.Vector3f(contactNormal.x, contactNormal.y, contactNormal.z);
				         m.transform(contactNormalVector);
				         				         
				         TopologyPresentationSet topologyPresentationSet = null;
				         if(jme3Application.getJMERenderEngineDelegate().getTopologyViewer().getInput() instanceof GraphicsContext)
				         {
				        	 GraphicsContext graphicsContext = (GraphicsContext) jme3Application.getJMERenderEngineDelegate().getTopologyViewer().getInput();
				        	 topologyPresentationSet = graphicsContext.getTopologyPresentationSet();
				         }
				         				         
				         final NodeSelection nodeSelection = ApogyCommonTopologyUIFacade.INSTANCE.createNodeSelection(topologyPresentationSet, node, relativePosition, contactNormalVector);
				         
				         System.out.println("--------------------------------------------------------------");
				         System.out.println("                        PICK SELECTION");
				         System.out.println(nodeSelection.toString());
				         System.out.println("--------------------------------------------------------------");
				         
				         // DEBUG
//				         System.out.println("--------------------------------------------------------------");
//				         System.out.println("                        PICK SELECTION");
//				         System.out.println("Selected Node     : " + selection.getSelectedNode());
//				         System.out.println("Relative Position : " + selection.getRelativeIntersectionPoint());
//				         System.out.println("Absolute Position : " + selection.getAbsoluteIntersectionPoint());
//				         
//				         System.out.println("Relative Normal   : " + selection.getRelativeIntersectionNormal());
//				         System.out.println("Absolute Normal   : " + selection.getAbsoluteIntersectionNormal());
//				         System.out.println("--------------------------------------------------------------");
				         
				         Runnable runnable = new Runnable() 
				         {
								@Override
								public void run() 
								{
									try
									{
										if(jme3Application.getJMERenderEngineDelegate() != null)
										{
											StructuredSelection selection = new StructuredSelection(nodeSelection);
											
											SelectionChangedEvent event = new SelectionChangedEvent(jme3Application.getJMERenderEngineDelegate().getTopologyViewer(), selection);
																		
											fireSelectionChanged(event);
										}
									}
									catch(Throwable t)
									{
										
									}
									
									busy = false;
								}																
				         };
	
				         Display.getDefault().asyncExec(runnable);
			         }
			         else
			         {
			        	 busy = false;
			         }
			         
			    }
			    else
			    {
			    	busy = false;
			    }
			}
		}
		else if(name.equals(PICK_ENABLED_EVENT))
		{
			// Toggles pick enabled.
			setPickEnabled(!pickEnabled);
		}
	}
	
	public void setEnabled(boolean enabled) 
	{		
		if(enabled)
		{
			if(!keyBoardInputRegistered)
			{
				registerWithInput();
			}
			Logger.INSTANCE.log(Activator.ID, this, "Pick is enabled.", EventSeverity.INFO);
		}
		else
		{
			if(keyBoardInputRegistered)
			{
				unregisterInput();
			}
			Logger.INSTANCE.log(Activator.ID, this, "Pick is disabled.", EventSeverity.INFO);
		}
	}
	
	public void setPickEnabled(boolean enabled)
	{
		pickingEnabled(enabled);
		
		if(enabled)
		{
			if(!mouseInputRegistered)
			{
				registerMouseInput();
			}
		}
		else
		{
			if(mouseInputRegistered)
			{
				unregisterMouseInput();
			}
		}
		
		// Updates the GUI.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{													
				if(enabled)
				{
					if(!jme3Application.getGuiNode().getChildren().contains(getHudText()))
					{																
						updateHudText();
						jme3Application.getGuiNode().attachChild(getHudText());
					}
				}
				else
				{
					if(jme3Application.getGuiNode().getChildren().contains(getHudText()))
					{
						jme3Application.getGuiNode().detachChild(getHudText());
					}
				}				
				return null;
			}
		});
		
		
		pickEnabled = enabled;
	}
	
	protected BitmapText getHudText()
	{
		if(hudText == null)
		{
			hudText = new BitmapText(getGuiFont(), false);          
			hudText.setSize(guiFont.getCharSet().getRenderedSize());      // font size
			hudText.setColor(ColorRGBA.Yellow);                             // font color
			hudText.setText("Picking Enabled");  	
			updateHudText();
		}
		
		return hudText;
	}
	
	protected void updateHudText()
	{
		BitmapText text = getHudText();						
		AppSettings settings = jme3Application.getAppSettings();
		
		float x = 0;
		float y = hudText.getLineHeight();
		
		System.out.println(settings.getWidth() + " x " + settings.getHeight());
		
		text.setLocalTranslation(x, y, 0); // position
		text.setQueueBucket(Bucket.Gui);
	}
	
	protected BitmapFont getGuiFont() 
	{
		if(guiFont == null)
		{
			guiFont = jme3Application.getAssetManager().loadFont("Interface/Fonts/Default.fnt");
		}
		return guiFont;
	}
	
	
	protected void registerMouseInput()
	{		
		if(!inputManager.hasMapping(PICK_EVENT))
		{
			inputManager.addMapping(PICK_EVENT, new MouseButtonTrigger(MouseInput.BUTTON_LEFT));
			inputManager.addListener(this, new String[]{PICK_EVENT});
		}
		
		mouseInputRegistered = true;
	}
	
	protected void unregisterMouseInput()
	{		
		if(inputManager.hasMapping(PICK_EVENT))
		{
			inputManager.deleteMapping(PICK_EVENT);
		}
		mouseInputRegistered = false;
	}
	
	/**
     * Registers inputs with the input manager.
     * @param inputManager
     */
    private void registerWithInput() 
    {      	    
    	if(!inputManager.hasMapping(PICK_ENABLED_EVENT))
    	{
    		inputManager.addMapping(PICK_ENABLED_EVENT, new KeyTrigger(KeyInput.KEY_P));    	
    		inputManager.addListener(this, new String[]{PICK_ENABLED_EVENT});
    	}
    	
    	keyBoardInputRegistered = true;
    }
    
    private void unregisterInput()
    {
    	for(int i = 0; i < inputs.length; i++)
    	{
    		if(!inputManager.hasMapping(inputs[i]))
    		{
    			inputManager.deleteMapping(inputs[i]);
    		}
    	}    	    
    	
    	keyBoardInputRegistered = false;
    }
}
