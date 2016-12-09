package ca.gc.asc_csa.apogy.core.environment.surface.ui.jme3.scene_objects;
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

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.renderer.queue.RenderQueue.ShadowMode;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Node;
import com.jme3.scene.control.BillboardControl;
import com.jme3.util.BufferUtils;

import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.AbstractTransformationJME3SceneObject;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestNode;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.scene_objects.FeatureOfInterestSceneObject;

public class FeatureOfInterestNodeJME3Object extends AbstractTransformationJME3SceneObject<FeatureOfInterestNode> implements FeatureOfInterestSceneObject
{					
	public static final float DEFAULT_FLAG_POLE_HEIGHT = 1.0f;
	
	public static final float FLAG_SIZE_PER_PIXEL = 0.005f;
	public static final ColorRGBA FLAG_POLE_COLOR = ColorRGBA.Cyan;
	public static final ColorRGBA FLAG_BACKGROUND_COLOR = ColorRGBA.Black;
	public static final ColorRGBA FLAG_TEXT_COLOR = ColorRGBA.Cyan;
	
	private float flagPoleHeight = DEFAULT_FLAG_POLE_HEIGHT;
	
	private Adapter featureOfInterestNodeAdapter = null;
	private FeatureOfInterestNode featureOfInterestNode = null;		
	
	private AssetManager assetManager;	
	
	private Node pole = null;
	private Node flag = null;	
	private BillboardControl billboardControl;
		
	public FeatureOfInterestNodeJME3Object(FeatureOfInterestNode node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);
				
		this.assetManager = jme3Application.getAssetManager();
		
		this.featureOfInterestNode = node;
		
		// Listens to the FeatureOfInterestNode
		featureOfInterestNode.eAdapters().add(getFeatureOfInterestNodeAdapter());		
		if(featureOfInterestNode.getFeatureOfInterest() != null)
		{			
			featureOfInterestNode.getFeatureOfInterest().eAdapters().add(getFeatureOfInterestNodeAdapter());
		}
		
		Job job = new Job("StarFieldJME3Object : Updating Geometry") 
		{			
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				updateGeometry();	
				setAxisVisible(false);
				return Status.OK_STATUS;
			}
		};
		job.schedule();				
	}
	
	public void setFlagPoleHeight(float poleHeight)
	{
		if(poleHeight > 0)
		{
			this.flagPoleHeight = poleHeight;
		}		
	}
	
	@Override
	public void setFlagVisible(boolean visible) 
	{
		setVisible(visible);
	}
			
	private void updateGeometry()
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{					
				if(pole != null) getAttachmentNode().detachChild(pole);
				if(flag != null) getAttachmentNode().detachChild(flag);
				
				getBillboardControl().setSpatial(null);
				
				// Creates the pole.
				pole = createPole(flagPoleHeight);
				getAttachmentNode().attachChild(pole);
				
				// Creates the flag
				flag = createFlag(getFlagText(), 16);
				pole.attachChild(flag);				
				
				return null;
			}	
		});		
	}
	
	private Node createPole(float poleHeight)
	{
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();

		Vector3f p0 = new Vector3f(0, 0, 0);
		Vector3f p1 = new Vector3f(0, 0, poleHeight);
		verticesList.add(p0);
		verticesList.add(p1);
		indexesList.add(verticesList.indexOf(p0));
		indexesList.add(verticesList.indexOf(p1));	
		
		Mesh mesh = new Mesh();
		mesh.setMode(Mesh.Mode.Lines);		
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));								
		mesh.updateBound();
		mesh.updateCounts();
		
		Geometry poleGeometry = new Geometry("Pole", mesh);
		
		Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", FLAG_POLE_COLOR.clone());        
        poleGeometry.setMaterial(mat);        
        		
        Node node = new Node("Pole.");
        node.setShadowMode(ShadowMode.Off);
        node.attachChild(poleGeometry);
		
		return node;				
	}
	
	private String getFlagText()
	{
		String text = "?";
		
		if(getTopologyNode() != null)
		{
			FeatureOfInterest foi = getTopologyNode().getFeatureOfInterest();  
			
			if(foi != null)
			{
				if(foi.getName() != null && foi.getName().length() > 0)
				{
					text = foi.getName() ;
				}				
			}
		}
		
		return text;
	}
	
	private Node createFlag(String text, int fontSize)
	{		
		Node node = new Node("Flag");	
		node.setShadowMode(ShadowMode.Off);
		
		Node flagAttachmentPoint = new Node("Flag Attachment Point");
		flagAttachmentPoint.setLocalTranslation(0, 0, flagPoleHeight);		
		node.attachChild(flagAttachmentPoint);		
	
		// First, create the image that will hold the text.
		Font font = new Font("Serif", Font.BOLD, fontSize);				
		BufferedImage bufferedImage = createTextImage(text, font, 2);
				
		// Based on the image size, create the flag geometry.
		float flagWidth = FLAG_SIZE_PER_PIXEL * bufferedImage.getWidth();
		float flagHeight = FLAG_SIZE_PER_PIXEL * bufferedImage.getHeight();
		Mesh flagMesh = createFlagMesh(flagWidth, flagHeight);
	
		Geometry flagGeometry = new Geometry("Flag Geometry", flagMesh);		
		Material mat = JME3Utilities.createMaterial(bufferedImage, assetManager);         
        flagGeometry.setMaterial(mat);
                
        flagAttachmentPoint.addControl(getBillboardControl());     
        flagAttachmentPoint.attachChild(flagGeometry);	
        
		return node;
	}
	
	private Mesh createFlagMesh(float flagWidth, float flagHeight)
	{
		Vector3f [] vertices = new Vector3f[4];
		vertices[0] = new Vector3f(0, 0, 0);
		vertices[1] = new Vector3f(flagWidth, 0, 0);
		vertices[2] = new Vector3f(0, flagHeight, 0);	
		vertices[3] = new Vector3f(flagWidth, flagHeight, 0);		
		
		int [] indexes = { 2,0,1, 1,3,2 };
									
		Vector2f[] texCoord = new Vector2f[4];
		texCoord[0] = new Vector2f(0,0);
		texCoord[1] = new Vector2f(1,0);
		texCoord[2] = new Vector2f(0,1);
		texCoord[3] = new Vector2f(1,1);
		
		Mesh mesh = new Mesh();		
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(vertices));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.TexCoord, 2, BufferUtils.createFloatBuffer(texCoord));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index,    3, BufferUtils.createIntBuffer(indexes));									
		mesh.updateBound();
		mesh.updateCounts();
		
		return mesh;
	}
	
	private BillboardControl getBillboardControl()
	{
		if(billboardControl == null)
		{
			billboardControl = new BillboardControl();			
			billboardControl.setAlignment(BillboardControl.Alignment.Screen);
		}
		
		return billboardControl;
	}

	private Adapter getFeatureOfInterestNodeAdapter()
	{
		if(featureOfInterestNodeAdapter == null)
		{
			featureOfInterestNodeAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof FeatureOfInterestNode)
					{
						int featureId = msg.getFeatureID(FeatureOfInterestNode.class);						
						if(featureId == ApogyCorePackage.FEATURE_OF_INTEREST_NODE__POSITION || featureId == ApogyCorePackage.FEATURE_OF_INTEREST_NODE__ROTATION_MATRIX)
						{
							updateTransform();							
						}
						else if(featureId == ApogyCorePackage.FEATURE_OF_INTEREST_NODE__FEATURE_OF_INTEREST)
						{
							if(msg.getOldValue() instanceof FeatureOfInterest)
							{
								FeatureOfInterest oldFeatureOfInterest = (FeatureOfInterest) msg.getOldValue();
								oldFeatureOfInterest.eAdapters().remove(getFeatureOfInterestNodeAdapter());
							}
							
							if(msg.getNewValue() instanceof FeatureOfInterest)
							{
								FeatureOfInterest newFeatureOfInterest = (FeatureOfInterest) msg.getNewValue();
								newFeatureOfInterest.eAdapters().add(getFeatureOfInterestNodeAdapter());
								
								updateGeometry();
								// updateFlagPole(flagPole);
							}
						}
					}
					else if(msg.getNotifier() instanceof FeatureOfInterest)
					{
						int featureId = msg.getFeatureID(FeatureOfInterest.class);
						if(featureId == ApogyCorePackage.FEATURE_OF_INTEREST__NAME)
						{
							updateGeometry();
							// setFlagPoleText(msg.getNewStringValue());
						}
					}
				}
			};
		}
		
		return featureOfInterestNodeAdapter;
	}
		
	private BufferedImage createTextImage(String text, Font font, int borderWidth) 
	{			
		Color textColor = JME3Utilities.convertToAWTColor(FLAG_TEXT_COLOR);
		Color backgroundColor = JME3Utilities.convertToAWTColor(FLAG_BACKGROUND_COLOR);
		AbstractEImage original = EImagesUtilities.INSTANCE.createTextImage(text, font, textColor, backgroundColor, borderWidth);
		
		int[] borderColor = JME3Utilities.convertToColorIntRGBA(FLAG_POLE_COLOR);         
        AbstractEImage imageWithBorder = EImagesUtilities.INSTANCE.addBorder(original, borderWidth, borderColor[0], borderColor[1], borderColor[2]);
                   
        return imageWithBorder.asBufferedImage();
    }
}
