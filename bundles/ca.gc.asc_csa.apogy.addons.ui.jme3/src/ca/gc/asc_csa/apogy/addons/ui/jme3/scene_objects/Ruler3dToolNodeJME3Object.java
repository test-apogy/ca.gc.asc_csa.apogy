package org.eclipse.symphony.addons.ui.jme3.scene_objects;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.vecmath.Color3f;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.symphony.addons.Ruler3DTool;
import org.eclipse.symphony.addons.Ruler3dToolNode;
import org.eclipse.symphony.addons.Symphony__AddonsPackage;
import org.eclipse.symphony.addons.ui.Ruler3dToolSceneObject;
import org.eclipse.symphony.common.topology.addons.primitives.ui.jme3.JME3PrimitivesUtilities;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Utilities;
import org.eclipse.symphony.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.material.RenderState.FaceCullMode;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Mesh.Mode;
import com.jme3.scene.Node;
import com.jme3.util.BufferUtils;

public class Ruler3dToolNodeJME3Object extends DefaultJME3SceneObject<Ruler3dToolNode> implements Ruler3dToolSceneObject
{					
	public static final int MAXIMUM_NUMBER_OF_TICK = 100;
	public static final ColorRGBA FROM_COLOR = ColorRGBA.Red;
	public static final ColorRGBA TO_COLOR = ColorRGBA.Blue;
	
	private Adapter adapter;	
		
	private AssetManager assetManager;	
	
	private Node fromTransformNode;
	private Node toTransformNode;
	
	private Geometry fromSphere = null;
	private Geometry toSphere = null;
		
	private Geometry rulerBodyGeometry = null;	
	private Geometry minorTicksGeometry = null;
	private Geometry majorTicksGeometry = null;
	
	private ColorRGBA rulerBodyColor = ColorRGBA.Red;
	private ColorRGBA minorTicksColor = ColorRGBA.Red;
	private ColorRGBA majorTicksColor = ColorRGBA.Red;
	
	public Ruler3dToolNodeJME3Object(Ruler3dToolNode node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);
				
		this.assetManager = jme3Application.getAssetManager();
						
		createGeometry();	
		
		Job job = new Job("Ruler3dToolNodeJME3Object : Updating Geometry") 
		{			
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{								
				getTopologyNode().getRuler3DTool().eAdapters().add(Ruler3dToolNodeJME3Object.this.getAdapter());
				
				return Status.OK_STATUS;
			}
		};
		job.schedule();				
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(fromSphere);
		geometries.add(toSphere);
		geometries.add(rulerBodyGeometry);
		geometries.add(minorTicksGeometry);
		geometries.add(majorTicksGeometry);
		return geometries;
	}
	
	@Override
	public void setVisible(boolean visible) 
	{	
		// Call this on viewer thread.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{												
				if (!visible && isVisible()) 
				{
					if(fromTransformNode != null) jme3Application.getRootNode().detachChild(fromTransformNode);
					if(toTransformNode != null) jme3Application.getRootNode().detachChild(toTransformNode);					
					getRoot().detachChild(getAttachmentNode());
				} 
				else if (visible && !isVisible()) 
				{
					if(fromTransformNode != null) jme3Application.getRootNode().attachChild(fromTransformNode);
					if(toTransformNode != null) jme3Application.getRootNode().attachChild(toTransformNode);
					getRoot().attachChild(getAttachmentNode());
				}
				
				return null;
			}
		});						
	}
	
	@Override
	public void dispose()
	{
		jme3Application.getRootNode().detachChild(fromTransformNode);
		jme3Application.getRootNode().detachChild(toTransformNode);
														
		fromTransformNode = null;
		toTransformNode = null;				
		fromSphere = null;
		toSphere = null;					
		rulerBodyGeometry = null;	
		minorTicksGeometry = null;
		majorTicksGeometry = null;			
					
		// Calls super.
		super.dispose();
	}
	
	
	@Override
	public void setRulerColor(final Color3f color) 
	{
		this.rulerBodyColor = JME3Utilities.convertToColorRGBA(color);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				ColorRGBA newColor = JME3Utilities.convertToColorRGBA(color);
				if(rulerBodyGeometry != null)
				{					
					rulerBodyGeometry.getMaterial().setColor("Color", newColor);					
				}
								
				return null;
			}	
		});	
	}

	@Override
	public void setMinorTicksColor(Color3f color) 
	{
		this.minorTicksColor = JME3Utilities.convertToColorRGBA(color);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				ColorRGBA newColor = JME3Utilities.convertToColorRGBA(color);
				if(minorTicksGeometry != null)
				{					
					minorTicksGeometry.getMaterial().setColor("Color", newColor);					
				}
								
				return null;
			}	
		});	
	}

	@Override
	public void setMajorTicksColor(Color3f color) 
	{
		this.majorTicksColor = JME3Utilities.convertToColorRGBA(color);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				ColorRGBA newColor = JME3Utilities.convertToColorRGBA(color);
				if(majorTicksGeometry != null)
				{					
					majorTicksGeometry.getMaterial().setColor("Color", newColor);					
				}
								
				return null;
			}	
		});	
	}

	@Override
	public void setMinorTickSpacing(float minorTickSpacing) 
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				updateMinorTicks();			
				return null;
			}	
		});			
	}

	@Override
	public void setMajorTickSpacing(float majorTickSpacing) 
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				updateMajorTicks();			
				return null;
			}	
		});	
	}

	@Override
	public void setMinorTickLength(float minorTickLength) 
	{		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				updateMinorTicks();			
				return null;
			}	
		});	
	}

	@Override
	public void setMajorTickLength(float majorTickLength) 
	{		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				updateMajorTicks();			
				return null;
			}	
		});	
	}

	@Override
	public void setExtremitiesRadius(float newRadius) 
	{						
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				// Detach existing spheres.
				if(fromSphere != null) fromTransformNode.detachChild(fromSphere);						
				if(toSphere != null) toTransformNode.detachChild(toSphere);

				if(newRadius >= 0)
				{
					// Creates new spheres
					fromSphere = JME3PrimitivesUtilities.createSphere(newRadius, assetManager);
					fromSphere.setMaterial(createFromSphereMaterial());
					
					toSphere = JME3PrimitivesUtilities.createSphere(newRadius, assetManager);
					toSphere.setMaterial(createToSphereMaterial());
					
					// Attaches the spheres.
					fromTransformNode.attachChild(fromSphere);
					toTransformNode.attachChild(toSphere);
				}	
								
				return null;
			}	
		});	
	}	
	
	private void createGeometry()
	{
		rulerBodyColor = JME3Utilities.convertToColorRGBA(getTopologyNode().getRuler3DTool().getRulerColor());
		minorTicksColor = JME3Utilities.convertToColorRGBA(getTopologyNode().getRuler3DTool().getMinorTickColor());
		majorTicksColor = JME3Utilities.convertToColorRGBA(getTopologyNode().getRuler3DTool().getMajorTickColor());
				
		// Creates the from node.
		fromTransformNode = new Node("Ruler From");
		jme3Application.getRootNode().attachChild(fromTransformNode);
	
		// Creates the to node.
		toTransformNode = new Node("Ruler To");
		jme3Application.getRootNode().attachChild(toTransformNode);
		
		// Creates the ruler body and attaches it to the from node.
		rulerBodyGeometry = createRulerBodyGeometry();
		fromTransformNode.attachChild(rulerBodyGeometry);	
		
		// Creates minor ticks
		minorTicksGeometry = createMinorTicksGeometry();
		fromTransformNode.attachChild(minorTicksGeometry);	
		
		// Creates major ticks
		majorTicksGeometry = createMajorTicksGeometry();
		fromTransformNode.attachChild(majorTicksGeometry);	
		
		// Adds the extremities.
		fromSphere = JME3PrimitivesUtilities.createSphere((float)getTopologyNode().getRuler3DTool().getExtremitiesRadius(), assetManager);
		fromSphere.setMaterial(createFromSphereMaterial());
		fromTransformNode.attachChild(fromSphere);	
		
		toSphere = JME3PrimitivesUtilities.createSphere((float)getTopologyNode().getRuler3DTool().getExtremitiesRadius(), assetManager);
		toSphere.setMaterial(createToSphereMaterial());
		toTransformNode.attachChild(toSphere);	
	}
	
	private void updateGeometry()
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				updateFromTo();
				updateRulerBody();
				updateMinorTicks();
				updateMajorTicks();
								
				return null;
			}	
		});		
	}	

	private Geometry createRulerBodyGeometry()
	{
		Geometry geometry = new Geometry("Ruler Body", getRulerBodyMesh());
		geometry.setMaterial(createRulerBodyMaterial());
		return geometry;
	}
	
	private Material createRulerBodyMaterial()
	{
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  		
		mat.setColor("Color", rulerBodyColor);		
		return mat;
	}
	
	private Mesh getRulerBodyMesh() 
	{
		Mesh mesh = new Mesh();
		mesh.setMode(Mode.Lines);	
		
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();
		
		verticesList.add(new Vector3f());
		verticesList.add(new Vector3f());
		
		indexesList.add(new Integer(0));
		indexesList.add(new Integer(1));						
		
		mesh = new Mesh();
		mesh.setMode(Mode.Lines);
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));
		mesh.updateBound();
		mesh.updateCounts();		
		
		return mesh;
	}
	
	private void updateFromTo()
	{
		if(getTopologyNode().getRuler3DTool().getFromNode() != null)
		{					
			fromTransformNode.setLocalTranslation(JME3Utilities.convertToVector3f(getTopologyNode().getRuler3DTool().getFromAbsolutePosition().asTuple3d()));
		}
		else
		{
			// TODO Detach from scene ?
		}
		
		if(getTopologyNode().getRuler3DTool().getToNode() != null)
		{				
			toTransformNode.setLocalTranslation(JME3Utilities.convertToVector3f(getTopologyNode().getRuler3DTool().getToAbsolutePosition().asTuple3d()));
		}
		else
		{
			// TODO Detach from scene ?
		}
	}
		
	private void updateRulerBody()
	{
		if(getTopologyNode().getRuler3DTool().getFromNode() != null &&
		   getTopologyNode().getRuler3DTool().getToNode() != null)
		{
			
			Vector3f v = toTransformNode.getWorldTranslation().subtract(fromTransformNode.getWorldTranslation());
												
			FloatBuffer vertices = rulerBodyGeometry.getMesh().getFloatBuffer(com.jme3.scene.VertexBuffer.Type.Position);	
			vertices.rewind();
			vertices.put(0f);
			vertices.put(0f);
			vertices.put(0f);
			
			vertices.put((float) v.x);
			vertices.put((float) v.y);
			vertices.put((float) v.z);
			
			rulerBodyGeometry.getMesh().setBuffer(com.jme3.scene.VertexBuffer.Type.Position, 3, vertices);
			rulerBodyGeometry.getMesh().updateBound();
			rulerBodyGeometry.getMesh().updateCounts();	
			
			// Re-Attaches the geometry if it has been previously detached.
			if(!fromTransformNode.getChildren().contains(rulerBodyGeometry))
			{
				fromTransformNode.attachChild(rulerBodyGeometry);
			}
		}
		else
		{
			// Detach the geometry from the scene.
			fromTransformNode.detachChild(rulerBodyGeometry);											
		}
	}
				
	private Geometry createMinorTicksGeometry()
	{
		Geometry geometry = new Geometry("Ruler Minor Ticks", createMinorTicksMesh());
		geometry.setMaterial(createMinorTicksMaterial());
		return geometry;
	}
	
	private Material createMinorTicksMaterial()
	{
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  		
		mat.setColor("Color", minorTicksColor);		
		return mat;
	}
	
	private Mesh createMinorTicksMesh() 
	{		
		Mesh mesh = new Mesh();
		mesh.setMode(Mode.Lines);	
		
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();
				
		for(int i = 0; i < MAXIMUM_NUMBER_OF_TICK; i++)
		{
			Vector3f p1 = new Vector3f(i,0,-0.001f);
			Vector3f p2 = new Vector3f(i,0, 0.001f);
			Vector3f p3 = new Vector3f(i,-0.001f,0);
			Vector3f p4 = new Vector3f(i,0.001f ,0);
			
			verticesList.add(p1);
			verticesList.add(p2);
			verticesList.add(p3);
			verticesList.add(p4);
						
			// First Line.
			indexesList.add(new Integer(verticesList.indexOf(p1)));
			indexesList.add(new Integer(verticesList.indexOf(p2)));
						
			// Second Line.
			indexesList.add(new Integer(verticesList.indexOf(p3)));				
			indexesList.add(new Integer(verticesList.indexOf(p4)));						
		}
		
		mesh = new Mesh();
		mesh.setMode(Mode.Lines);
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));
		mesh.updateBound();
		mesh.updateCounts();				
		
		return mesh;
	}

	private void updateMinorTicks()
	{
		if(getTopologyNode().getRuler3DTool().getFromNode() != null && getTopologyNode().getRuler3DTool().getToNode() != null)
		{					
			Vector3f v = toTransformNode.getWorldTranslation().subtract(fromTransformNode.getWorldTranslation());
			float length = v.length();
			
			FloatBuffer vertices = minorTicksGeometry.getMesh().getFloatBuffer(com.jme3.scene.VertexBuffer.Type.Position);	
			vertices.rewind();
														
			// Place a line at the from.
			float tickIncrement = (float) getTopologyNode().getRuler3DTool().getMinorTickSpacing();
			if(tickIncrement <= 0) return;
			
			int numberOfTicks = 0;
			float tickZ = (float) getTopologyNode().getRuler3DTool().getMinorTickLength() / 2.0f;
											
			float position = 0;
			while(position <= length && numberOfTicks <  MAXIMUM_NUMBER_OF_TICK)
			{
				Vector3f p1 = new Vector3f(position, 0, tickZ);
				Vector3f p2 = new Vector3f(position, 0, -tickZ);
				Vector3f p3 = new Vector3f(position, tickZ, 0);
				Vector3f p4 = new Vector3f(position, -tickZ, 0);
								
				vertices.put(p1.x);
				vertices.put(p1.y);
				vertices.put(p1.z);
				
				vertices.put(p2.x);
				vertices.put(p2.y);
				vertices.put(p2.z);
				
				vertices.put(p3.x);
				vertices.put(p3.y);
				vertices.put(p3.z);
				
				vertices.put(p4.x);
				vertices.put(p4.y);
				vertices.put(p4.z);
				
				position += tickIncrement;
				numberOfTicks++;
			}
			
			// Sets the remaining ticks at 0
			while (numberOfTicks < MAXIMUM_NUMBER_OF_TICK)
			{
				// Puts the 4 vertex of each tick to zero.
				for(int i = 0; i < 4; i++)
				{
					vertices.put(0);
					vertices.put(0);
					vertices.put(0);
				}
				
				numberOfTicks++;
			}
			
			// Updates the mesh.
			minorTicksGeometry.getMesh().setBuffer(com.jme3.scene.VertexBuffer.Type.Position, 3, vertices);			
			minorTicksGeometry.getMesh().updateBound();
			minorTicksGeometry.getMesh().updateCounts();
			
			// Re-Attaches the geometry if it has been previously detached.
			if(!fromTransformNode.getChildren().contains(minorTicksGeometry))
			{
				fromTransformNode.attachChild(minorTicksGeometry);
			}
			
			// Orients the geometry
			Quaternion rot = getQuarternionV1ToV2(new Vector3f(1, 0, 0), v.normalize());
			minorTicksGeometry.setLocalRotation(rot);			
		}
		else
		{
			// Detach the geometry from the scene.
			fromTransformNode.detachChild(minorTicksGeometry);	
		}
		
	}
	
	private Geometry createMajorTicksGeometry()
	{
		Geometry geometry = new Geometry("Ruler Major Ticks", createMajorTicksMesh());
		geometry.setMaterial(createMajorTicksMaterial());
		return geometry;
	}
	
	private Material createMajorTicksMaterial()
	{
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  		
		mat.setColor("Color", majorTicksColor);		
		return mat;
	}
	
	private Mesh createMajorTicksMesh() 
	{		
		Mesh mesh = new Mesh();
		mesh.setMode(Mode.Lines);	
		
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();
				
		for(int i = 0; i < MAXIMUM_NUMBER_OF_TICK; i++)
		{
			Vector3f p1 = new Vector3f(i,0,-0.001f);
			Vector3f p2 = new Vector3f(i,0, 0.001f);
			Vector3f p3 = new Vector3f(i,-0.001f,0);
			Vector3f p4 = new Vector3f(i,0.001f ,0);
			
			verticesList.add(p1);
			verticesList.add(p2);
			verticesList.add(p3);
			verticesList.add(p4);
						
			// First Line.
			indexesList.add(new Integer(verticesList.indexOf(p1)));
			indexesList.add(new Integer(verticesList.indexOf(p2)));
						
			// Second Line.
			indexesList.add(new Integer(verticesList.indexOf(p3)));				
			indexesList.add(new Integer(verticesList.indexOf(p4)));						
		}
		
		mesh = new Mesh();
		mesh.setMode(Mode.Lines);
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));
		mesh.updateBound();
		mesh.updateCounts();				
		
		return mesh;
	}

	private void updateMajorTicks()
	{
		if(getTopologyNode().getRuler3DTool().getFromNode() != null && getTopologyNode().getRuler3DTool().getToNode() != null)
		{					
			Vector3f v = toTransformNode.getWorldTranslation().subtract(fromTransformNode.getWorldTranslation());
			float length = v.length();
			
			FloatBuffer vertices = majorTicksGeometry.getMesh().getFloatBuffer(com.jme3.scene.VertexBuffer.Type.Position);	
			vertices.rewind();
														
			// Place a line at the from.
			float tickIncrement = (float) getTopologyNode().getRuler3DTool().getMajorTickSpacing();
			if(tickIncrement <= 0) return;
			
			int numberOfTicks = 0;
			float tickZ = (float) getTopologyNode().getRuler3DTool().getMajorTickLength() / 2.0f;
											
			float position = 0;
			while(position <= length && numberOfTicks <  MAXIMUM_NUMBER_OF_TICK)
			{
				Vector3f p1 = new Vector3f(position, 0, tickZ);
				Vector3f p2 = new Vector3f(position, 0, -tickZ);
				Vector3f p3 = new Vector3f(position, tickZ, 0);
				Vector3f p4 = new Vector3f(position, -tickZ, 0);
								
				vertices.put(p1.x);
				vertices.put(p1.y);
				vertices.put(p1.z);
				
				vertices.put(p2.x);
				vertices.put(p2.y);
				vertices.put(p2.z);
																							
				vertices.put(p3.x);
				vertices.put(p3.y);
				vertices.put(p3.z);
				
				vertices.put(p4.x);
				vertices.put(p4.y);
				vertices.put(p4.z);
											
				position += tickIncrement;
				numberOfTicks++;								
			}
			
			// Sets the remaining ticks at 0
			while(numberOfTicks < MAXIMUM_NUMBER_OF_TICK)
			{				
				// Puts the 4 vertex of each tick to zero.
				for(int i = 0; i < 4; i++)
				{
					vertices.put(0);
					vertices.put(0);
					vertices.put(0);
				}
				
				numberOfTicks++;
			}
			
			// Updates the mesh.
			majorTicksGeometry.getMesh().setBuffer(com.jme3.scene.VertexBuffer.Type.Position, 3, vertices);			
			majorTicksGeometry.getMesh().updateBound();
			majorTicksGeometry.getMesh().updateCounts();
			
			// Re-Attaches the geometry if it has been previously detached.
			if(!fromTransformNode.getChildren().contains(majorTicksGeometry))
			{
				fromTransformNode.attachChild(majorTicksGeometry);
			}
			
			// Orients the geometry
			Quaternion rot = getQuarternionV1ToV2(new Vector3f(1, 0, 0), v.normalize());
			majorTicksGeometry.setLocalRotation(rot);			
		}
		else
		{
			// Detach the geometry from the scene.
			fromTransformNode.detachChild(majorTicksGeometry);	
		}		
	}
	
	private Material createFromSphereMaterial()
	{
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  		
		mat.setColor("Color", FROM_COLOR);		
		return mat;
	}
	
	private Material createToSphereMaterial()
	{
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  		
		mat.setColor("Color", TO_COLOR);		
		return mat;
	}
	
	
	private Quaternion getQuarternionV1ToV2(Vector3f v1, Vector3f v2)
	{
		float angle = v2.angleBetween(v1);
		
		// Cross product gives the vector about which to rotate.
		Vector3f axis = v1.cross(v2);
		axis = axis.normalize();
		Quaternion q = new Quaternion();
		q = q.fromAngleAxis(angle, axis);
		return q;
	}
	
	private Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{					
					if(msg.getNotifier() instanceof Ruler3dToolNode)
					{												
						int featureId = msg.getFeatureID(Ruler3dToolNode.class);
						if(featureId == Symphony__AddonsPackage.RULER3D_TOOL_NODE__RULER3_DTOOL)
						{
							if(msg.getOldValue() instanceof Ruler3dToolNode)
							{
								Ruler3dToolNode oldValue = (Ruler3dToolNode) msg.getOldValue();
								oldValue.eAdapters().remove(getAdapter());
								updateGeometry();
							}
							
							if(msg.getNewValue() instanceof Ruler3dToolNode)
							{
								Ruler3dToolNode newValue = (Ruler3dToolNode) msg.getNewValue();
								newValue.eAdapters().add(getAdapter());
								updateGeometry();
							}
						}						
					}
					else if(msg.getNotifier() instanceof Ruler3DTool)
					{
						int featureId = msg.getFeatureID(Ruler3DTool.class);
						switch(featureId)
						{							
							case Symphony__AddonsPackage.RULER3_DTOOL__FROM_ABSOLUTE_POSITION:
							case Symphony__AddonsPackage.RULER3_DTOOL__TO_ABSOLUTE_POSITION:
								
								updateGeometry();
																	
								break;
							case Symphony__AddonsPackage.RULER3_DTOOL__RULER_COLOR:
									if(msg.getNewValue() instanceof Color3f)
									{
										Color3f color = (Color3f) msg.getNewValue();
										setRulerColor(color);								
									}
								break;
							case Symphony__AddonsPackage.RULER3_DTOOL__MINOR_TICK_SPACING:
									setMinorTickSpacing((float) msg.getNewDoubleValue());
								break;
							case Symphony__AddonsPackage.RULER3_DTOOL__MAJOR_TICK_SPACING:
									setMajorTickSpacing((float) msg.getNewDoubleValue());
								break;
							case Symphony__AddonsPackage.RULER3_DTOOL__MINOR_TICK_LENGTH:
									setMinorTickLength((float) msg.getNewDoubleValue());
								break;
							case Symphony__AddonsPackage.RULER3_DTOOL__MAJOR_TICK_LENGTH:
									setMajorTickLength((float) msg.getNewDoubleValue());		
								break;
							case Symphony__AddonsPackage.RULER3_DTOOL__MINOR_TICK_COLOR:
									if(msg.getNewValue() instanceof Color3f)
									{
										Color3f color = (Color3f) msg.getNewValue();
										setMinorTicksColor(color);								
									}
								break;
							case Symphony__AddonsPackage.RULER3_DTOOL__MAJOR_TICK_COLOR:
									if(msg.getNewValue() instanceof Color3f)
									{
										Color3f color = (Color3f) msg.getNewValue();
										setMajorTicksColor(color);								
									}
								break;
							case Symphony__AddonsPackage.RULER3_DTOOL__EXTREMITIES_RADIUS:
							{
								setExtremitiesRadius((float) msg.getNewDoubleValue());
							}
							break;
							
							case Symphony__AddonsPackage.SIMPLE3_DTOOL__VISIBLE:							
								setVisible(msg.getNewBooleanValue());
							break;
							
							case Symphony__AddonsPackage.RULER3_DTOOL__RULER3D_TOOL_NODE:
								
								// Removes adapter if applicable.
								if(getTopologyNode().getRuler3DTool() != null)
								{
									getTopologyNode().getRuler3DTool().eAdapters().remove(getAdapter());
								}
								
								if(msg.getNewValue() == null)
								{
									dispose();
								}
							break;
						
							case Symphony__AddonsPackage.SIMPLE3_DTOOL___DISPOSE:	
								dispose();
							break;
								
						}
					}
				}
			};
		}
		return adapter;
	}
}
