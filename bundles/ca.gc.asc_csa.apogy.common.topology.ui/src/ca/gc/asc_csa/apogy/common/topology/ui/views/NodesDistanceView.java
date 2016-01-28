package ca.gc.asc_csa.apogy.common.topology.ui.views;

import java.util.List;
import java.util.Iterator;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.composites.NodeToNodeDistanceComposite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

public class NodesDistanceView extends ViewPart implements ISelectionListener 
{
	private NodeToNodeDistanceComposite nodeToNodeDistanceComposite = null;
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) 
	{
		List<Object> nodes = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, Node.class);
		
		if(!nodes.isEmpty())
		{
			Iterator<Object> iter = nodes.iterator();
			
			while (iter.hasNext())
			{
				Node node = (Node) iter.next();
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
