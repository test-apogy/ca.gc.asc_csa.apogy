package org.eclipse.symphony.common.topology.ui.jme3.views;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.TopologyFactory;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.common.topology.URLNode;
import org.eclipse.symphony.common.topology.ui.GraphicsContext;
import org.eclipse.symphony.common.topology.ui.TopologyUIFacade;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.viewer.TopologyViewer;
import org.eclipse.symphony.common.topology.ui.viewer.actions.NewAbstractTopology3DViewAction;
import org.eclipse.symphony.common.topology.ui.viewer.views.AbstractTopology3DView;

public class JME3Topology3DView extends AbstractTopology3DView 
{		
	protected NewAbstractTopology3DViewAction newAbstractTopology3DViewAction = null;

	
	// DEBUG
	int count = 0;
	

	@Override
	public TopologyViewer createTopologyViewer(Composite parent) 
	{		
		JME3RenderEngineDelegate jme3RenderEngineDelegate = new JME3RenderEngineDelegate();
		TopologyViewer topologyViewer = new TopologyViewer(parent, jme3RenderEngineDelegate);
		return topologyViewer;
	}


	@Override
	public String getViewID() 
	{
		return "org.eclipse.symphony.common.topology.ui.jme3.views.JME3Topology3DView";
	}

	@Override
	public void addActions() 
	{	
		super.addActions();
		
		newAbstractTopology3DViewAction = new NewAbstractTopology3DViewAction(this);
		
		// We get the toolbar manager.
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
						
		// New View Action
		toolBarManager.add(newAbstractTopology3DViewAction);
	}
	
	@Override
	public void updateSelection(ISelection selection) 
	{
		GraphicsContext gc = TopologyUIFacade.INSTANCE.createGraphicsContext(createTestTopology());
		getTopologyViewer().setInput(gc);		
		
		updatePartName();
	}

	@Override
	protected String getPartNamePrefix() 
	{		
		return "Topology";
	}

	@Override
	protected String getPartNameSuffix() 
	{
		return "TEST";
	}
		
	private Node createTestTopology()
	{
		AggregateGroupNode root = TopologyFactory.eINSTANCE.createAggregateGroupNode();
		
		TransformNode t1 = TopologyFacade.INSTANCE.createTransformNodeXYZ(10, 5, 5,0, 0, 0);
		root.getAggregatedChildren().add(t1);
		
		
		double x = count * 1.5;
		System.out.println("X : " + x);
		
		
		TransformNode t2 = TopologyFacade.INSTANCE.createTransformNodeXYZ(x, 5, 5,0, 0, 0);
		t1.getAggregatedChildren().add(t2);
		
		URLNode urlNode = TopologyFactory.eINSTANCE.createURLNode();
		urlNode.setUrl("platform:/plugin/org.eclipse.symphony.examples.lander.symphony/vrml/lander.obj");
		t2.getChildren().add(urlNode);
		
		count++;
		
		return root;
	}


}
