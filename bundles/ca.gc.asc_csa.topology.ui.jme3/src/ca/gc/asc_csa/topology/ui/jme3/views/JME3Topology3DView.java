package ca.gc.asc_csa.topology.ui.jme3.views;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.viewer.TopologyViewer;
import ca.gc.asc_csa.topology.ui.viewer.actions.NewAbstractTopology3DViewAction;
import ca.gc.asc_csa.topology.ui.viewer.views.AbstractTopology3DView;
import ca.gc.space.topology.AggregateGroupNode;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TopologyFacade;
import ca.gc.space.topology.TopologyFactory;
import ca.gc.space.topology.TransformNode;
import ca.gc.space.topology.URLNode;
import ca.gc.space.topology.ui.GraphicsContext;
import ca.gc.space.topology.ui.TopologyUIFacade;

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
		return "ca.gc.asc_csa.topology.ui.jme3.views.JME3Topology3DView";
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
		urlNode.setUrl("file:///home/pallard/workspace/SYMPHONY/ca.gc.asc_csa.symphony.examples.lander/vrml/lander.obj");
		t2.getChildren().add(urlNode);
		
		count++;
		
		return root;
	}


}
