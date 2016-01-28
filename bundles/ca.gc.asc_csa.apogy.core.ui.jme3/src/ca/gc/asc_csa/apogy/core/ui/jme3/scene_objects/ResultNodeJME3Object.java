package ca.gc.asc_csa.apogy.core.ui.jme3.scene_objects;

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
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.AbstractTransformationJME3SceneObject;
import ca.gc.asc_csa.apogy.core.PositionedResult;
import ca.gc.asc_csa.apogy.core.ResultNode;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.ui.ResultNodeSceneObject;
import ca.gc.asc_csa.apogy.core.ui.jme3.Activator;

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

public class ResultNodeJME3Object extends AbstractTransformationJME3SceneObject<ResultNode> implements ResultNodeSceneObject
{					
	public static final float DEFAULT_FLAG_POLE_HEIGHT = 1.0f;
	
	public static final float FLAG_SIZE_PER_PIXEL = 0.005f;
	public static final ColorRGBA FLAG_POLE_COLOR = ColorRGBA.Yellow;
	public static final ColorRGBA FLAG_BACKGROUND_COLOR = ColorRGBA.Black;
	public static final ColorRGBA FLAG_TEXT_COLOR = ColorRGBA.Yellow;
	
	private boolean flagVisible = false;
	private float flagPoleHeight = DEFAULT_FLAG_POLE_HEIGHT;
		
	private AssetManager assetManager;	
	
	private Node pole = null;
	private Geometry poleGeometry = null;
	
	private Node flag = null;
	private Geometry flagGeometry = null;
		
	private BillboardControl billboardControl;		
		
	public ResultNodeJME3Object(ResultNode node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);
				
		this.assetManager = jme3Application.getAssetManager();
				
		Job job = new Job("ResultNodeJME3Object : Updating Geometry") 
		{			
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				updateGeometry();				
				return Status.OK_STATUS;
			}
		};
		job.schedule();				
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{
		List<Geometry> geometries = new ArrayList<Geometry>();			
		geometries.addAll(super.getGeometries());	
		
		if(poleGeometry != null) geometries.add(poleGeometry);
		if(flagGeometry != null) geometries.add(flagGeometry);
		
		return geometries;
	}
	
	@Override
	public void dispose() 
	{
		if(billboardControl != null)
		{
			billboardControl.setEnabled(false);
			billboardControl.setSpatial(null);			
		}
		
		if(pole != null)
		{
			pole.detachAllChildren();
			if(pole.getParent() != null)
			{
				pole.getParent().detachChild(pole);
			}
		}
		
		super.dispose();
	}
			
	public void setFlagPoleHeight(float poleHeight)
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting Flag Pole Height to <" + poleHeight + ">...", EventSeverity.INFO);		
		if(poleHeight > 0)
		{
			this.flagPoleHeight = poleHeight;
			updateGeometry();
		}		
	}
		
	@Override
	public float getFlagPoleHeight() 
	{		
		return flagPoleHeight;
	}
	
	@Override
	public void setFlagVisible(final boolean visible) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting Flag Visible to <" + visible + ">...", EventSeverity.INFO);		
		
		this.flagVisible = visible;
		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				if(flagVisible)
				{
					if(pole != null)
					{
						if(!getAttachmentNode().getChildren().contains(pole))
						{
							getAttachmentNode().attachChild(pole);
						}
					}
				}
				else
				{
					if(pole != null) getAttachmentNode().detachChild(pole);
				}
								
				return null;
			}
		});
	}

	@Override
	public boolean isFlagVisible() 
	{		
		return flagVisible;
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
				
				if(flagVisible)
				{
					getAttachmentNode().attachChild(pole);	
				}
								
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
		
		poleGeometry = new Geometry("Pole", mesh);
		
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
			if(getTopologyNode().getDescription() != null)
			{
				text = getTopologyNode().getDescription();
			}
			else if(getTopologyNode().getResult() != null)
			{
				text = getTopologyNode().getResult().getTime().toString();
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
	
		flagGeometry = new Geometry("Flag Geometry", flagMesh);		
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
		
	private boolean isResultHasError()
	{
		if(getTopologyNode().getResult() instanceof PositionedResult)
		{
			PositionedResult positionedResult  = (PositionedResult) getTopologyNode().getResult();
			
			if(positionedResult instanceof OperationCallResult)
			{
				OperationCallResult operationCallResult = (OperationCallResult) positionedResult;
				
				if(operationCallResult.getExceptionContainer() != null)
				{
					if(operationCallResult.getExceptionContainer().getException() != null)
					{
						return true;
					}
				}
			}					
		}		
		
		return false;
	}
	
	private ColorRGBA getFlagBackgroundColor()
	{
		if(isResultHasError())
		{
			return ColorRGBA.Red;
		}
		else
		{
			return ColorRGBA.Black;
		}
	}
	
	private ColorRGBA getTextColor()
	{
		if(isResultHasError())
		{
			return ColorRGBA.Black;
		}
		else
		{
			return ColorRGBA.Green;
		}
	}
	
	private BufferedImage createTextImage(String text, Font font, int borderWidth) 
	{			
		Color textColor = JME3Utilities.convertToAWTColor(getTextColor());
		Color backgroundColor = JME3Utilities.convertToAWTColor(getFlagBackgroundColor());
		AbstractEImage original = EImagesUtilities.INSTANCE.createTextImage(text, font, textColor, backgroundColor, borderWidth);
		
		int[] borderColor = JME3Utilities.convertToColorIntRGBA(FLAG_POLE_COLOR);         
        AbstractEImage imageWithBorder = EImagesUtilities.INSTANCE.addBorder(original, borderWidth, borderColor[0], borderColor[1], borderColor[2]);
                   
        return imageWithBorder.asBufferedImage();
    }
}
