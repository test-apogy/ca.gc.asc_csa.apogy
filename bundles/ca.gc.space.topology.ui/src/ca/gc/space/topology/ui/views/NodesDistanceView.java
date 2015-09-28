package ca.gc.space.topology.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.composites.NodeToNodeDistanceComposite;

public class NodesDistanceView extends ViewPart implements ISelectionListener 
{
	private NodeToNodeDistanceComposite nodeToNodeDistanceComposite = null;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) 
	{
		List<Node> nodes = (List<Node>) ca.gc.asc_csa.eclipse.converters.Activator.convert(selection, Node.class);
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
