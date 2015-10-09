package org.eclipse.symphony.common.topology.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.composites.NodeToNodeDistanceComposite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

public class NodesDistanceView extends ViewPart implements ISelectionListener 
{
	private NodeToNodeDistanceComposite nodeToNodeDistanceComposite = null;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) 
	{
		List<Node> nodes = (List<Node>) org.eclipse.symphony.common.converters.Activator.convert(selection, Node.class);
		if(!nodes.isEmpty())
		{				
			for(Node node : nodes)
			{			
				nodeToNodeDistanceComposite.selectNode(node);
			}									
		}	
	}

	@Override
	public void createPartControl(Composite parent) 
	{		
		nodeToNodeDistanceComposite = new NodeToNodeDistanceComposite(parent, SWT.NONE);
		
		getSite().getPage().addSelectionListener(this);
	}

	@Override
	public void setFocus() 
	{		
	}
	
	@Override
	public void dispose() 
	{
		getSite().getPage().removeSelectionListener(this);
		super.dispose();
	}

}
