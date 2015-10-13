package org.eclipse.symphony.addons.vehicle.ui.jme3.scene_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.addons.vehicle.LanderSphericalFoot;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.Wheel;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Utilities;
import org.eclipse.symphony.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Mesh.Mode;
import com.jme3.scene.shape.Sphere;

public class LanderSphericalFootJME3Object extends DefaultJME3SceneObject<LanderSphericalFoot>
{							
	private Adapter adapter;			
	private AssetManager assetManager;	
	
	private Geometry landerFootGeometry = null;

	private ColorRGBA landerFootColor = ColorRGBA.White;
	
	public LanderSphericalFootJME3Object(LanderSphericalFoot node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);
				
		this.assetManager = jme3Application.getAssetManager();
						
		landerFootGeometry = createLanderFootGeometry();
		getAttachmentNode().attachChild(landerFootGeometry);
		
		// Listens for change of the Wheel.
		getTopologyNode().eAdapters().add(getAdapter());
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(landerFootGeometry);
		return geometries;
	}
		
	
	@Override
	public void dispose()
	{
		if(getTopologyNode() != null)
		{
			getTopologyNode().eAdapters().remove(getAdapter());
		}
					
		// Calls super.
		super.dispose();
	}
			
	private void updateGeometry()
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{						
				// Detach previous geometry.
				if(landerFootGeometry != null)
				{
					getAttachmentNode().detachChild(landerFootGeometry);
				}
				
				landerFootGeometry = createLanderFootGeometry();
				getAttachmentNode().attachChild(landerFootGeometry);
				
				return null;
			}	
		});		
	}
	
	@Override
	public void setColor(RGB rgb) 
	{
		this.landerFootColor = JME3Utilities.convertToColorRGBA(rgb);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{										
				if(landerFootGeometry != null)
				{					
					landerFootGeometry.getMaterial().setColor("Color", landerFootColor.clone());					
				}														
				return null;
			}	
		});	
	}
	
	private Geometry createLanderFootGeometry()
	{
		Geometry geometry = new Geometry("Lander Spherical Foot Body", createLanderFootMesh());				
		geometry.setMaterial(createLanderFootMaterial());
		Quaternion q = new Quaternion();
		q.fromAngleAxis(FastMath.HALF_PI, new Vector3f(0, 1, 0));
		geometry.setLocalRotation(q);				
		return geometry;
	}
	
	private Mesh createLanderFootMesh()
	{
		Sphere sphere = new Sphere(18, 10, (float) getTopologyNode().getRadius());	
		sphere.setMode(Mode.Lines);
		return sphere;
	}
	
	private Material createLanderFootMaterial()
	{
		ColorRGBA color = landerFootColor.clone();				
		Material mat = new Material(assetManager,  "Common/MatDefs/Misc/Unshaded.j3md");				
		mat.setColor("Color", color);	
		
		return mat;
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
					if(msg.getNotifier() instanceof Wheel)
					{												
						int featureId = msg.getFeatureID(LanderSphericalFoot.class);
					
						switch (featureId) 
						{
							case SymphonyToolsVehiclePackage.LANDER_SPHERICAL_FOOT__RADIUS:							
								updateGeometry();
							break;

						default:
							break;
						}
					}
				}
			};
		}
		return adapter;
	}
}
