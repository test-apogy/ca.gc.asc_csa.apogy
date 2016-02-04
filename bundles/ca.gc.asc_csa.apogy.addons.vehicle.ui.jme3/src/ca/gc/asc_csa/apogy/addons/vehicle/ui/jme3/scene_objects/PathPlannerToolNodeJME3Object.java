package ca.gc.asc_csa.apogy.addons.vehicle.ui.jme3.scene_objects;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerTool;
import ca.gc.asc_csa.apogy.addons.vehicle.PathPlannerToolNode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

public class PathPlannerToolNodeJME3Object extends DefaultJME3SceneObject<PathPlannerToolNode>
{				
	private Adapter adapter;	

	public PathPlannerToolNodeJME3Object(PathPlannerToolNode node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);		
			
		// Register an adapter to the Trajectory3DTool.
		getTopologyNode().getPathPlannerTool().eAdapters().add(getAdapter());
		
		setVisible(getTopologyNode().getPathPlannerTool().isVisible());
	}
	
	@Override
	public void dispose()
	{		
		if(getTopologyNode() != null)
		{
			getTopologyNode().getPathPlannerTool().eAdapters().remove(getAdapter());
		}
		super.dispose();					
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
					if(msg.getNotifier() instanceof PathPlannerTool)
					{												
						int featureId = msg.getFeatureID(PathPlannerTool.class);
						
						switch(featureId)
						{
							case ApogyAddonsPackage.SIMPLE3_DTOOL__VISIBLE:
								setVisible(msg.getNewBooleanValue());
							break;
						}						
					}				
				}
			};
		}
		return adapter;
	}
}
