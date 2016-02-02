package ca.gc.asc_csa.apogy.common.topology.ui.jme3.views;
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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.common.topology.URLNode;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ITopologyViewer;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewer;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerProvider;
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
								GraphicsContext gc = ApogyCommonTopologyUIFacade.INSTANCE.createGraphicsContext(createTestTopology());
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
		AggregateGroupNode root = ApogyCommonTopologyFactory.eINSTANCE.createAggregateGroupNode();
		
		TransformNode t1 = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(10, 5, 5,0, 0, 0);
		root.getAggregatedChildren().add(t1);
		
		TransformNode t2 = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(10, 5, 5,0, 0, 0);
		t1.getAggregatedChildren().add(t2);
		
		URLNode urlNode = ApogyCommonTopologyFactory.eINSTANCE.createURLNode();
		urlNode.setUrl("platform:/plugin/ca.gc.asc_csa.apogy.examples.lander.apogy/vrml/lander.obj");
		t2.getChildren().add(urlNode);
				
		return root;
	}
}
