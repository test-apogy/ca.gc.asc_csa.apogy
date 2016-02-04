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

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;
import java.util.List;

import com.jme3.app.Application;
import com.jme3.app.state.AbstractAppState;
import com.jme3.app.state.AppStateManager;
import com.jme3.input.InputManager;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.post.SceneProcessor;
import com.jme3.renderer.RenderManager;
import com.jme3.renderer.Renderer;
import com.jme3.renderer.ViewPort;
import com.jme3.renderer.queue.RenderQueue;
import com.jme3.texture.FrameBuffer;
import com.jme3.util.BufferUtils;
import com.jme3.util.Screenshots;

public class CustomScreenshotAppState extends AbstractAppState implements ActionListener, SceneProcessor  
{
	 private boolean capture = false;
	 private boolean busy = false;
	 
	 private Renderer renderer;
	 private ByteBuffer outBuf;	 
	 private BufferedImage awtImage;
	 private BufferedImage latestImage;
	  
	 public CustomScreenshotAppState()
	 {
	 }	 	 
	 
	 public BufferedImage getCapturedImage()
	 {
		 return latestImage;
	 }
	 
	 public void takeSnapshot()
	 {
		 if(!busy)
		 {
			 latestImage = null;
			 capture = true;
		 }
	 }
	 
	 @Override
	 public void initialize(AppStateManager stateManager, Application app) 
	 {
		 if (!super.isInitialized())
		 {
			 InputManager inputManager = app.getInputManager();
			 inputManager.addMapping("ScreenShot", new KeyTrigger(KeyInput.KEY_SYSRQ));
			 inputManager.addListener(this, "ScreenShot");
			  
			 List<ViewPort> vps = app.getRenderManager().getPostViews();
			 ViewPort last = vps.get(vps.size()-1);
			 last.addProcessor(this);			  			 
		 }
		 super.initialize(stateManager, app);
	 }
	  
	 public void onAction(String name, boolean value, float tpf) 
	 {		 
	 }
	  
	 public void initialize(RenderManager rm, ViewPort vp) 
	 {
		 renderer = rm.getRenderer();
		 reshape(vp, vp.getCamera().getWidth(), vp.getCamera().getHeight());
	 }
	  
	 @Override
	 public boolean isInitialized() 
	 {
		 return super.isInitialized() && renderer != null;
	 }
	  
	 public void reshape(ViewPort vp, int w, int h) 
	 {
		 outBuf = BufferUtils.createByteBuffer(w*h*4);
		 awtImage = new BufferedImage(w, h, BufferedImage.TYPE_4BYTE_ABGR);
	 }
	  
	 public void preFrame(float tpf) 
	 {
	 }
	  
	 public void postQueue(RenderQueue rq) 
	 {
	 }
	  
	 public void postFrame(FrameBuffer out) 
	 {
		 if (capture)
		 {
			 busy = true;
			 capture = false;	 
	  
			 renderer.readFrameBuffer(out, outBuf);
			 Screenshots.convertScreenShot(outBuf, awtImage);
	  
			 BufferedImage tempImage = new BufferedImage(awtImage.getWidth(), awtImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
			 Graphics g = tempImage.getGraphics();
			 g.drawImage(awtImage, 0, 0, null);
			 g.dispose();
			 
			 // Sets the last image.
			 latestImage = tempImage;
			 
			 // Not busy anymore.
			 busy = false;
		}
	 }	
}
