package ca.gc.asc_csa.apogy.common.topology.ui.jme3.internal;
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

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;

import com.jme3.input.InputManager;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;

public class CreateSceneGraphHTMLActionListener implements ActionListener 
{
	public static final String F1_KEY = "F1_KEY";
	
	private String[] inputs = {F1_KEY};
	
	private boolean enabled = true;
	private boolean busy = false;
	private boolean inputsRegistered = false;
	
	private InputManager inputManager;
	private JME3Application viewer;
	
	public CreateSceneGraphHTMLActionListener(InputManager inputManager, JME3Application viewer)
	{
		this.inputManager = inputManager;
		this.viewer = viewer;
		registerWithInput(inputManager);
	}
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) 
	{
		this.enabled = enabled;
		
		if(!enabled)
		{
			if(inputsRegistered)
        	{
				// Unregisters inputs.
        		if(inputManager != null) unregisterInput(inputManager);
        	}
		}
		else
		{
			if(!inputsRegistered)
        	{
        		// Registers inputs.
				if(inputManager != null) registerWithInput(inputManager);
        	}
		}
	}



	@Override
	public void onAction(String name, boolean keyPressed, float tpf) 
	{		
		if(isEnabled() && !busy)
    	{
			if(name.equals(F1_KEY))
	        {
	        	if (keyPressed) 
	            {
	        		busy = true;
	        			        		
	        		printNode(viewer.getRootNode());	  
	        		
	        		busy = false;
	            } 	           
	        }
    	}
	}
	
	/**
     * Registers inputs with the input manager.
     * @param inputManager
     */
    private void registerWithInput(InputManager inputManager) 
    {  
    	inputManager.addMapping(F1_KEY, new KeyTrigger(KeyInput.KEY_F1));
    	inputManager.addListener(this, inputs);
    	inputsRegistered = true;
    }
	
    private void unregisterInput(InputManager inputManager)
    {
    	for(int i = 0; i < inputs.length; i++)
    	{
    		inputManager.deleteMapping(inputs[i]);	    		
    	}    	
    	
    	inputManager.removeListener(this);
    	
    	inputsRegistered = false;
    }
    
	/**
	* Print all children from this node on down
	*/
	private void printNode(com.jme3.scene.Node node) 
	{						
		try 
		{			
			String fileName = System.getProperty("user.dir") + File.separator + "scene_graph.html";
			
			Logger.INSTANCE.log(Activator.ID, this, "Printing Scene Graph to file <" + fileName + ">...", EventSeverity.INFO);

			String html = JME3Utilities.sceneTopologyAsHTML(node);
									
			final File f = new File(fileName);
			FileWriter fw = new FileWriter(f);
			fw.write(html);
			fw.flush();
			fw.close();
			
			Logger.INSTANCE.log(Activator.ID, this, "Printing Scene Graph to file <" + fileName + "> completed.", EventSeverity.OK);
			
			Job job = new Job("Opening JME3Viewer Scenegraph file...")
			{
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{
					try
					{
						Logger.INSTANCE.log(Activator.ID, this, "Openning <" + fileName + "> with web browser...", EventSeverity.INFO);
						Desktop.getDesktop().open(f);
						Logger.INSTANCE.log(Activator.ID, this, "Openning <" + fileName + "> with web browser completed", EventSeverity.OK);
						return Status.OK_STATUS;
					}
					catch(Throwable t)
					{
						return Status.CANCEL_STATUS;
					}					
				}
			};
			
			job.schedule(3000);
			
		} 
		catch (Throwable t ) 
		{
			t.printStackTrace();
		}		 		 		
	}

}
