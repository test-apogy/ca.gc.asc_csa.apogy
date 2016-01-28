package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.scene_objects;

import java.util.concurrent.Callable;

import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.addons.sensors.fov.FieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.utils.AbstractFieldOfViewImageProjectorControl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.scene_objects.FieldOfViewSceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

import com.jme3.math.ColorRGBA;

public abstract class AbstractFieldOfViewJME3Object<R extends FieldOfView> extends DefaultJME3SceneObject<R> implements FieldOfViewSceneObject
{
	protected MeshPresentationMode meshPresentationMode = MeshPresentationMode.WIREFRAME;
	protected float transparency = 0.0f;
	protected boolean showProjection = false;
	protected boolean showOutlineOnly = false;
	protected ColorRGBA fovColor = new ColorRGBA(0f, 1f, 0.0f, 0.25f);
	protected RGB rgb = new  RGB(1, 1, 1);
	
	protected RGB projectionColor = new  RGB(1, 1, 1);
	
	public AbstractFieldOfViewJME3Object(R topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);		
	}

	@Override
	public void setColor(RGB rgb) 
	{
		this.rgb = rgb;
		fovColor = JME3Utilities.convertToColorRGBA(rgb);
	}
	
	@Override
	public RGB getColor() 
	{	
		return rgb;
	}
			
	@Override
	public MeshPresentationMode getPresentationMode() 
	{		
		return meshPresentationMode;
	}
	
	@Override
	public float getTransparency() {	
		return transparency;
	}
	
	@Override
	public boolean isShowProjection() 
	{		
		return showProjection;
	}
	
	@Override
	public boolean isShowOutlineOnly() 
	{		
		return showOutlineOnly;
	}
	
	@Override
	public void setProjectionColor(RGB color) 
	{	
		this.projectionColor = color;
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				getAbstractFieldOfViewImageProjectorControl().setProjectionColor(color);
				return null;
			}
		});					
	}
	
	@Override
	public RGB getProjectionColor() 
	{		
		return projectionColor;
	}
	
	public abstract AbstractFieldOfViewImageProjectorControl<R> getAbstractFieldOfViewImageProjectorControl();
}
