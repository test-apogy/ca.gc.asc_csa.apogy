package org.eclipse.symphony.common.topology.ui.jme3.views;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.TopologyFactory;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.common.topology.URLNode;
import org.eclipse.symphony.common.topology.ui.GraphicsContext;
import org.eclipse.symphony.common.topology.ui.GraphicsContextAdapter;
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
	private Object loadedSelection;

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

	private void importGraphicsAdapter(final Object sel) {
		Job importJob = new Job("Importing Topology") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {

				importing = true;

				monitor.beginTask("Importing", 3);
				monitor.subTask("Loading file " + sel);

				List<GraphicsContextAdapter> gcAdapters = Activator.getDefault().getRegisteredGraphicsContextAdapters();

				// We find a loader for file
				boolean found = false;
				GraphicsContextAdapter fileAdapter = null;

				for (GraphicsContextAdapter adapter : gcAdapters) 
				{
					found = adapter.isAdapterFor(sel);

					if (found) 
					{
						fileAdapter = adapter;
						break;
					}
				}

				monitor.worked(1);

				if (found) 
				{
					monitor.subTask("Importing");
					// We load the file
					GraphicsContext adapter = fileAdapter.getAdapter(sel, monitor);

					monitor.worked(1);

					monitor.subTask("Configuring topology viewer");
					topoViewer.setInput(adapter);
					monitor.worked(1);
					loadedSelection = sel;
				} else {
					monitor.done();
				}

				monitor.done();

				importing = false;

				return Status.OK_STATUS;
			}
		};

		importJob.setUser(true);
		importJob.setPriority(Job.INTERACTIVE);
		importJob.schedule();
	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partClosed(IWorkbenchPartReference partRef) 
	{		
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

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
		urlNode.setUrl("file:///home/pallard/workspace/SYMPHONY/ca.gc.asc_csa.symphony.examples.lander/vrml/lander.obj");
		t2.getChildren().add(urlNode);
		
		
		
		return root;
	}
}
