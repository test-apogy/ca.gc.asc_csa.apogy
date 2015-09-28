package ca.gc.asc_csa.symphony.tools.ui.jme3.scene_objects;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import ca.gc.asc_csa.symphony.tools.core.SymphonyToolsCorePackage;
import ca.gc.asc_csa.symphony.tools.core.Trajectory3DTool;
import ca.gc.asc_csa.symphony.tools.core.Trajectory3DToolNode;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

public class Trajectory3DToolNodeJME3Object extends DefaultJME3SceneObject<Trajectory3DToolNode>
{				
	private Adapter adapter;	

	public Trajectory3DToolNodeJME3Object(Trajectory3DToolNode node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);		
			
		// Register an adapter to the Trajectory3DTool.
		getTopologyNode().getTrajectory3DTool().eAdapters().add(getAdapter());
		
		setVisible(getTopologyNode().getTrajectory3DTool().isVisible());
	}
	
	@Override
	public void dispose()
	{		
		if(getTopologyNode() != null)
		{
			getTopologyNode().getTrajectory3DTool().eAdapters().remove(getAdapter());
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
					if(msg.getNotifier() instanceof Trajectory3DTool)
					{												
						int featureId = msg.getFeatureID(Trajectory3DTool.class);
						
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
