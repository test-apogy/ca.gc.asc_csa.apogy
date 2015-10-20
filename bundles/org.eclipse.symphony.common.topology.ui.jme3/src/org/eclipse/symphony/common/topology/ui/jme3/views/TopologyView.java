package org.eclipse.symphony.common.topology.ui.jme3.views;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.symphony.common.topology.ui.viewer.ITopologyViewer;
import org.eclipse.symphony.common.topology.ui.viewer.TopologyViewer;
import org.eclipse.symphony.common.topology.ui.viewer.TopologyViewerProvider;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;


public class TopologyView extends ViewPart implements IPartListener2, TopologyViewerProvider {

	private TopologyViewer topoViewer;

	private ISelectionListener selectionListener;

	private boolean importing = false;

	public TopologyView() 
	{	
	}

	@Override
	public void createPartControl(Composite parent) 
	{
		topoViewer = new TopologyViewer(parent, new JME3RenderEngineDelegate());
			
		// We register a listener.
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(getSelectionListener());
	}

	@Override
	public void setFocus() 
	{	
	}
	
	private boolean isPinned() { 
		return false;
	}
	
	private ISelectionListener getSelectionListener() {

		if (selectionListener == null) 
		{
			selectionListener = new ISelectionListener() 
			{
				@Override
				public void selectionChanged(IWorkbenchPart part, ISelection selection) 
				{
					if (!isPinned() && !importing) 
					{
						if (!selection.isEmpty()) 
						{
							if (selection instanceof IStructuredSelection) 
							{
								GraphicsContext gc = TopologyUIFacade.INSTANCE.createGraphicsContext(createTestTopology());
								getTopologyViewer().setInput(gc);
								
//								IStructuredSelection sSel = (IStructuredSelection) selection;
//
//								Object sel = sSel.getFirstElement();
//
//								if (sel != loadedSelection	&& sel instanceof PresentationTopology) 
//								{
//									getTopologyViewer().setInput(sel);
//								} 
//								else if (sel != loadedSelection) 
//								{
//									importGraphicsAdapter(sel);
//								} 
//								else if (sSel.getFirstElement() instanceof GraphicsContext) 
//								{
//									GraphicsContext ctx = (GraphicsContext) sSel.getFirstElement();
//									getTopologyViewer().setInput(ctx);
//								}
								
								
							}
						}
					}
				}
			};
		}

		return selectionListener;
	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partClosed(IWorkbenchPartReference partRef) 
	{		
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
	}

	@Override
	public ITopologyViewer getTopologyViewer() {
		return topoViewer;
	}

	private Node createTestTopology()
	{
		AggregateGroupNode root = TopologyFactory.eINSTANCE.createAggregateGroupNode();
		
		TransformNode t1 = TopologyFacade.INSTANCE.createTransformNodeXYZ(10, 5, 5,0, 0, 0);
		root.getAggregatedChildren().add(t1);
		
		TransformNode t2 = TopologyFacade.INSTANCE.createTransformNodeXYZ(10, 5, 5,0, 0, 0);
		t1.getAggregatedChildren().add(t2);
		
		URLNode urlNode = TopologyFactory.eINSTANCE.createURLNode();
		urlNode.setUrl("platform:/plugin/org.eclipse.symphony.examples.lander.symphony/vrml/lander.obj");
		t2.getChildren().add(urlNode);
				
		return root;
	}
}
