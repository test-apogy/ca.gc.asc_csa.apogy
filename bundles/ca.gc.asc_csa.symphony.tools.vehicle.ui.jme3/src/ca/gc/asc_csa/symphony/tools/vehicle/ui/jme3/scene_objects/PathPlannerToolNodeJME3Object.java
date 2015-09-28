package ca.gc.asc_csa.symphony.tools.vehicle.ui.jme3.scene_objects;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import ca.gc.asc_csa.symphony.tools.core.SymphonyToolsCorePackage;
import ca.gc.asc_csa.symphony.tools.vehicle.PathPlannerTool;
import ca.gc.asc_csa.symphony.tools.vehicle.PathPlannerToolNode;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

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
							case SymphonyToolsCorePackage.SIMPLE3_DTOOL__VISIBLE:
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
