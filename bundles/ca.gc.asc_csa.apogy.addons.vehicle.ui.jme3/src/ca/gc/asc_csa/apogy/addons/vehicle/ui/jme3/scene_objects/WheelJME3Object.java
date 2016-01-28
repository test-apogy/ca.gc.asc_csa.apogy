package ca.gc.asc_csa.apogy.addons.vehicle.ui.jme3.scene_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;
import ca.gc.asc_csa.apogy.addons.vehicle.Wheel;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.FastMath;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Mesh.Mode;
import com.jme3.scene.shape.Cylinder;

public class WheelJME3Object extends DefaultJME3SceneObject<Wheel>
{							
	private Adapter adapter;			
	private AssetManager assetManager;	
	
	private Geometry wheelGeometry = null;

	private ColorRGBA wheelColor = ColorRGBA.White;
	
	public WheelJME3Object(Wheel node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);
				
		this.assetManager = jme3Application.getAssetManager();
						
		wheelGeometry = createWheelGeometry();
		getAttachmentNode().attachChild(wheelGeometry);
		
		// Listens for change of the Wheel.
		getTopologyNode().eAdapters().add(getAdapter());
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(wheelGeometry);
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
				if(wheelGeometry != null)
				{
					getAttachmentNode().detachChild(wheelGeometry);
				}
				
				wheelGeometry = createWheelGeometry();
				getAttachmentNode().attachChild(wheelGeometry);
				
				return null;
			}	
		});		
	}
	
	@Override
	public void setColor(RGB rgb) 
	{
		this.wheelColor = JME3Utilities.convertToColorRGBA(rgb);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{										
				if(wheelGeometry != null)
				{					
					wheelGeometry.getMaterial().setColor("Color", wheelColor.clone());					
				}														
				return null;
			}	
		});	
	}
	
	private Geometry createWheelGeometry()
	{
		Geometry geometry = new Geometry("Wheel Body", createWheelMesh());				
		geometry.setMaterial(createWheelMaterial());
		Quaternion q = new Quaternion();
		q.fromAngleAxis(FastMath.HALF_PI, new Vector3f(1, 0, 0));
		geometry.setLocalRotation(q);				
		return geometry;
	}
	
	private Mesh createWheelMesh()
	{
		Cylinder cylinder = new Cylinder(4, 18, (float) getTopologyNode().getRadius(), (float) getTopologyNode().getLength(), true);	
		cylinder.setMode(Mode.Lines);
		return cylinder;
	}
	
	private Material createWheelMaterial()
	{
		ColorRGBA color = wheelColor.clone();				
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
						int featureId = msg.getFeatureID(Wheel.class);
					
						switch (featureId) 
						{
							case ApogyAddonsVehiclePackage.WHEEL__LENGTH:
							case ApogyAddonsVehiclePackage.WHEEL__RADIUS:
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
