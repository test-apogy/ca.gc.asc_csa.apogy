package org.eclipse.symphony.addons.geometry.paths.ui.jme3.adapters;

import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.addons.geometry.paths.ui.jme3.scene_objects.WayPointPathJME3Object;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject;

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
