package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.jme3.adapters;

import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.jme3.scene_objects.WayPointPathJME3Object;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject;

public class WayPointPathJME3Adapter implements JME3Adapter 
{
	public WayPointPathJME3Adapter() 
	{
		System.err.println("WayPointPathJME3Adapter.WayPointPathJME3Adapter()");		
	}
	
	@Override
	public JME3SceneObject getAdapter(Node obj, Object context) 
	{
		JME3SceneObject object = null;

		if (isAdapterFor(obj)) 
		{
			// Context should be an Application
			if (!(context instanceof JME3RenderEngineDelegate)) 
			{
				throw new IllegalArgumentException("Context must be a JME3RenderEngineDelegate.");
			}
			
			WayPointPath node = (WayPointPath) obj;
			object = new WayPointPathJME3Object(node, (JME3RenderEngineDelegate) context);
		}

		return object;
	}

	@Override
	public boolean isAdapterFor(Node obj) 
	{		
		return obj instanceof WayPointPath;
	}

	@Override
	public Class<?> getAdaptedClass() 
	{			
		return WayPointPath.class;
	}

}
