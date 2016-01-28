package ca.gc.asc_csa.apogy.addons.ui.jme3.scene_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.vecmath.Color3f;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.addons.SunVector3DTool;
import ca.gc.asc_csa.apogy.addons.SunVector3DToolNode;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.ui.jme3.Activator;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.jme3.JME3PrimitivesUtilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.material.RenderState.BlendMode;
import com.jme3.material.RenderState.FaceCullMode;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.queue.RenderQueue.Bucket;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Cylinder;
import com.jme3.scene.shape.Dome;

public class SunVector3DToolNodeJME3Object extends DefaultJME3SceneObject<SunVector3DToolNode>
{						
	public static final ColorRGBA TO_COLOR = ColorRGBA.Blue;	
	public static final ColorRGBA SUN_INTENSITY_LEVEL_COLOR = ColorRGBA.Green;
	
	public static final float OUTER_CYLINDER_ALPHA = 0.1f;
	
	public static final float CYLINDER_RADIUS = 0.01f;
	public static final float SUN_INTENSITY_CYLINDER_RADIUS = CYLINDER_RADIUS * 0.5f;
	
	public static final float TIP_BASE_RADIUS = 0.02f;
	public static final float TIP_LENGTH = 0.1f;
	
	private Adapter adapter;	
		
	private AssetManager assetManager;	
		
	private Node toTransformNode;			
	
	private Node sunVectorTipNode = null;
	private Geometry sunVectorTipGeometry = null;
	
	private Node sunVectorBodyNode = null;
	private Geometry sunVectorBodyGeometry = null;	
	
	private Node sunIntensityLevelNode = null;
	private Geometry sunIntensityLevelGeometry = null;
	

	private Geometry toSphere = null;
	
	private ColorRGBA sunVectorColor = ColorRGBA.Red;
	
	public SunVector3DToolNodeJME3Object(SunVector3DToolNode node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);
				
		this.assetManager = jme3Application.getAssetManager();
				
		// Call this on viewer thread.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				createGeometry();	
				getTopologyNode().getSunVector3DTool().eAdapters().add(SunVector3DToolNodeJME3Object.this.getAdapter());
				
				return null;
			}
		});						
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(sunVectorTipGeometry);
		geometries.add(sunVectorBodyGeometry);
		geometries.add(sunIntensityLevelGeometry);
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
					if(toTransformNode != null)
					{
						jme3Application.getRootNode().detachChild(toTransformNode);										
					}
					getRoot().detachChild(getAttachmentNode());
				} 
				else if (visible && !isVisible()) 
				{				
					if(toTransformNode != null)
					{
						jme3Application.getRootNode().attachChild(toTransformNode);
					}
					getRoot().attachChild(getAttachmentNode());
				}
				
				return null;
			}
		});						
	}
	
	@Override
	public void setColor(final RGB rgb) 
	{
		if(rgb != null)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Setting color to <" + rgb + ">...", EventSeverity.INFO);
			
			this.sunVectorColor = JME3Utilities.convertToColorRGBA(rgb);
			jme3Application.enqueue(new Callable<Object>() 
			{
				@Override
				public Object call() throws Exception 
				{										
					if(sunVectorTipGeometry != null)
					{					
						sunVectorTipGeometry.getMaterial().setColor("Color", sunVectorColor.clone());					
					}
					
					if(sunVectorBodyGeometry != null)
					{				
						ColorRGBA color = sunVectorColor.clone();
						color.a = 0.5f;
						sunVectorBodyGeometry.getMaterial().setColor("Color", color);					
					}
									
					return null;
				}	
			});	
		}		
	}
	
	@Override
	public void dispose()
	{		
		if(getTopologyNode() != null && getTopologyNode().getSunVector3DTool() != null)
		{
			getTopologyNode().getSunVector3DTool().eAdapters().remove(SunVector3DToolNodeJME3Object.this.getAdapter());
		}
		
		jme3Application.getRootNode().detachChild(toTransformNode);				
		getAttachmentNode().detachAllChildren();		
		super.dispose();	
	}
	
	public void setEndPointRadius(float newRadius) 
	{						
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				// Detach existing spheres.							
				if(toSphere != null) toTransformNode.detachChild(toSphere);

				if(newRadius >= 0)
				{
					toSphere = JME3PrimitivesUtilities.createSphere(newRadius, assetManager);
					toSphere.setMaterial(createToSphereMaterial());
					
					// Attaches the sphere.
					toTransformNode.attachChild(toSphere);
				}	
								
				return null;
			}	
		});	
	}	
	
	private void createGeometry()
	{
		sunVectorColor = JME3Utilities.convertToColorRGBA(getTopologyNode().getSunVector3DTool().getVectorColor());
		
		// Creates the to node.
		toTransformNode = new Node("Sun Vector To");
		jme3Application.getRootNode().attachChild(toTransformNode);

		// Creates Vector Tip
		sunVectorTipNode = createSunVectorTipNode();
		sunVectorTipGeometry = createSunVectorTipGeometry();
		sunVectorTipNode.attachChild(sunVectorTipGeometry);						
		toTransformNode.attachChild(sunVectorTipNode);
		
		// Creates the vector body and attached it to the tip.
		sunVectorBodyNode = createSunVectorBodyNode();
		sunVectorBodyGeometry = createSunVectorBodyGeometry();
		sunVectorBodyNode.attachChild(sunVectorBodyGeometry);		
		sunVectorTipNode.attachChild(sunVectorBodyNode);			
		
		// Creates the sun intensity and attach it to the tip.
		sunIntensityLevelNode = createSunIntensityLevelBodyNode();
		sunIntensityLevelGeometry = createSunIntensityLevelGeometry();
		sunIntensityLevelNode.attachChild(sunIntensityLevelGeometry);
		sunVectorTipNode.attachChild(sunIntensityLevelNode);
		
		// Creates to sphere
		toSphere = JME3PrimitivesUtilities.createSphere((float) getTopologyNode().getSunVector3DTool().getEndPointRadius(), assetManager);
		toSphere.setMaterial(createToSphereMaterial());
		toTransformNode.attachChild(toSphere);	
		
		// Updates the geometry.
		updateFromTo();
		updateSunVectorBody();	
		updateSunVectorTip();
		updateSunIntensityLevelBody();
	}
	
	private void updateGeometry()
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				updateFromTo();
				updateSunVectorTip();
				updateSunVectorBody();	
				updateSunIntensityLevelBody();
												
				return null;
			}	
		});		
	}	
	
	private void updateFromTo()
	{	
		if(getTopologyNode().getSunVector3DTool().getToNode() != null)
		{				
			toTransformNode.setLocalTranslation(JME3Utilities.convertToVector3f(getTopologyNode().getSunVector3DTool().getToAbsolutePosition().asTuple3d()));
		}
		else
		{
			// TODO Detach from scene ?
		}
	}
	
	// Sun vector cylinder
	
	private Node createSunVectorBodyNode()
	{
		Node node = new Node("Sun Vector Body");
		return node;
	}
	
	private Geometry createSunVectorBodyGeometry()
	{		
		Geometry geometry = new Geometry("Ruler Body", getSunVectorBodyMesh());
		geometry.setMaterial(createSunVectorBodyMaterial());
		
		geometry.setQueueBucket(Bucket.Transparent);
		
		Quaternion q = new Quaternion();
		q = q.fromAngleAxis(FastMath.PI / 2, new Vector3f(0, 1, 0));		
		geometry.setLocalRotation(q);
				
		return geometry;
	}
	
	private Material createSunVectorBodyMaterial()
	{
		ColorRGBA color = sunVectorColor.clone();
		color.a = OUTER_CYLINDER_ALPHA;
		
		Material mat = new Material(getApplication().getAssetManager(), "Common/MatDefs/Misc/Unshaded.j3md");		
		mat.getAdditionalRenderState().setBlendMode(BlendMode.Alpha);		
		mat.setColor("Color", color);	
		
		return mat;
	}
	
	private Mesh getSunVectorBodyMesh() 
	{
		Cylinder cylinder = new Cylinder(4, 10, CYLINDER_RADIUS, 1.0f, true);
		return cylinder;
	}
	
	private void updateSunVectorBody()
	{
		float length = (float) getTopologyNode().getSunVector3DTool().getVectorLength();
		sunVectorBodyGeometry.setLocalScale(1, 1, length);
		sunVectorBodyNode.setLocalTranslation(length / 2.0f + TIP_LENGTH, 0, 0);
	}
	
	// Sun intensity cylinder
	
	private Node createSunIntensityLevelBodyNode()
	{
		Node node = new Node("Sun Intensity Level Body");
		return node;
	}
	
	private Geometry createSunIntensityLevelGeometry()
	{
		Geometry geometry = new Geometry("Sun Intensity Level", getSunIntensityLevelMesh());
		geometry.setMaterial(createSunIntensityLevelMaterial());
		
		Quaternion q = new Quaternion();
		q = q.fromAngleAxis(FastMath.PI / 2, new Vector3f(0, 1, 0));
		geometry.setLocalRotation(q);
		
		return geometry;
	}
	
	private Material createSunIntensityLevelMaterial()
	{		
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");		
		mat.getAdditionalRenderState().setBlendMode(BlendMode.Alpha);
		mat.setColor("Color", SUN_INTENSITY_LEVEL_COLOR.clone());
		
		return mat;
	}
	
	private Mesh getSunIntensityLevelMesh() 
	{
		Cylinder cylinder = new Cylinder(10, 10, CYLINDER_RADIUS, 1.0f);
		return cylinder;
	}
	
	private void updateSunIntensityLevelBody()
	{				
		float fullLength = (float) getTopologyNode().getSunVector3DTool().getVectorLength();		
		float relativeSunIntensity = (float) (getTopologyNode().getSunVector3DTool().getCurrentSunIntensityPercentage() / 100.0);		
		float length = relativeSunIntensity * fullLength;
		
		sunIntensityLevelGeometry.setLocalScale(1, 1, length);		
		sunIntensityLevelNode.setLocalTranslation(length / 2.0f + TIP_LENGTH, 0, 0);
	}
	
	// Sun Vector Tip
	
	private Node createSunVectorTipNode()
	{
		Node node = new Node("Sun Vector Tip");						
		return node;
	}
	
	private Geometry createSunVectorTipGeometry()
	{
		Geometry geometry = new Geometry("Sun Vector Tip", createSunVectorTipMesh());
		geometry.setMaterial(createSunVectorTipMaterial());
		
		// Scale the basic cone to make it more pointy.
		geometry.setLocalScale(1, TIP_LENGTH / TIP_BASE_RADIUS, 1);
		geometry.setLocalTranslation(TIP_LENGTH, 0, 0);
		
		Quaternion q = new Quaternion();
		q = q.fromAngleAxis(FastMath.PI / 2, new Vector3f(0, 0, 1));		
		geometry.setLocalRotation(q);
		
		return geometry;
	}
	
	private Material createSunVectorTipMaterial()
	{
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  		
		mat.setColor("Color", sunVectorColor.clone());		
		return mat;
	}
	
	private Mesh createSunVectorTipMesh() 
	{
		Dome dome = new Dome(2, 12, TIP_BASE_RADIUS);				
		return dome;
	}
	
	private void updateSunVectorTip()
	{
		if(getTopologyNode().getSunVector3DTool().getFromNode() != null && getTopologyNode().getSunVector3DTool().getToNode() != null)
		{
			Vector3f v = getSunVectorDirection();
			v = v.normalize();
			
			// Orients the geometry
			Quaternion rot = getQuarternionV1ToV2(new Vector3f(1, 0, 0), v);						
			sunVectorTipNode.setLocalRotation(rot);		
									
			// Re-Attaches the geometry if it has been previously detached.
			if(!toTransformNode.getChildren().contains(sunVectorTipNode))
			{
				toTransformNode.attachChild(sunVectorTipNode);
			}
		}
		else
		{
			// Detach the geometry from the scene.
			toTransformNode.detachChild(sunVectorTipNode);											
		}
	}
	
	// End sphere
	
		
	private Material createToSphereMaterial()
	{
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  		
		mat.setColor("Color", TO_COLOR);		
		return mat;
	}
	
	private Vector3f getSunVectorDirection()
	{
		Matrix4d sunMatrix = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(getTopologyNode().getSunVector3DTool().getFromNode());				
		javax.vecmath.Vector3d sun = new Vector3d();
		sunMatrix.get(sun);
		
		Matrix4d toMatrix = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(getTopologyNode().getSunVector3DTool().getToNode());
		javax.vecmath.Vector3d to = new Vector3d();
		toMatrix.get(to);				
		
		javax.vecmath.Vector3d dir = new javax.vecmath.Vector3d(sun);
		dir.sub(to);

		Vector3f v = new Vector3f((float) dir.x, (float) dir.y, (float) dir.z);				
		return v;
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
		
	private RGB convertToRGB(Color3f color)
	{
		int red = (int) Math.round((color.x * 255.0f));
		int green = (int) Math.round((color.y * 255.0f));
		int blue = (int) Math.round((color.z * 255.0f));
		
		return new RGB(red, green, blue);				
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
					if(msg.getNotifier() instanceof SunVector3DToolNode)
					{												
						int featureId = msg.getFeatureID(SunVector3DToolNode.class);
						
						if(featureId == ApogyAddonsPackage.SUN_VECTOR3_DTOOL_NODE__SUN_VECTOR3_DTOOL)
						{
							if(msg.getOldValue() instanceof SunVector3DToolNode)
							{
								SunVector3DToolNode oldValue = (SunVector3DToolNode) msg.getOldValue();
								oldValue.eAdapters().remove(getAdapter());
								updateGeometry();
							}
							
							if(msg.getNewValue() instanceof SunVector3DToolNode)
							{
								SunVector3DToolNode newValue = (SunVector3DToolNode) msg.getNewValue();
								newValue.eAdapters().add(getAdapter());
								updateGeometry();
							}
						}						
					}
					else if(msg.getNotifier() instanceof SunVector3DTool)
					{
						SunVector3DTool sunVector3DTool = (SunVector3DTool) msg.getNotifier();
						
						if(!sunVector3DTool.isDisposed())
						{
							int featureId = msg.getFeatureID(SunVector3DTool.class);
							switch(featureId)
							{
								case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_LENGTH:
								case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__FROM_RELATIVE_POSITION:
								case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__FROM_ABSOLUTE_POSITION:
								case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__TO_ABSOLUTE_POSITION:
								case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_INTENSITY:
								case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__TO_RELATIVE_POSITION:
										updateGeometry();
								break;
								case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__VECTOR_COLOR:
										if(msg.getNewValue() instanceof Color3f)
										{
											Color3f color = (Color3f) msg.getNewValue();
											setColor(convertToRGB(color));								
										}
								break;							
								case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__END_POINT_RADIUS:
								{
									setEndPointRadius((float) msg.getNewDoubleValue());
								}		
								break;
								case ApogyAddonsPackage.SIMPLE3_DTOOL__VISIBLE:
									setVisible(msg.getNewBooleanValue());
								break;
								case ApogyAddonsPackage.SUN_VECTOR3_DTOOL__SUN_VECTOR3_DTOOL_NODE:
									
									// Removes adapter if applicable.
									if(getTopologyNode().getSunVector3DTool() != null)
									{
										getTopologyNode().getSunVector3DTool().eAdapters().remove(getAdapter());
									}
									
									if(msg.getNewValue() == null)
									{
										jme3Application.enqueue(new Callable<Object>() 
										{
											@Override
											public Object call() throws Exception 
											{	
												dispose();
												
												return null;
											}
										});
									}
								break;
								case ApogyAddonsPackage.SIMPLE3_DTOOL___DISPOSE:
									jme3Application.enqueue(new Callable<Object>() 
									{
										@Override
										public Object call() throws Exception 
										{	
											dispose();
											
											return null;
										}
									});									
								break;
							}
						}
					}
				}
			};
		}
		return adapter;
	}
}
