package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.jme3.adapters;
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
