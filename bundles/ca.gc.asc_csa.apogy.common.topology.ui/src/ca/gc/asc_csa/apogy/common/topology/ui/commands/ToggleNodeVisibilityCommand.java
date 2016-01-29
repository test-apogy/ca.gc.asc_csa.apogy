package ca.gc.asc_csa.apogy.common.topology.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import org.eclipse.ui.handlers.HandlerUtil;

public class ToggleNodeVisibilityCommand extends AbstractHandler implements IHandler 
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();
			
			if(selection instanceof Node)
			{
				Node node = (Node) selection;								
				NodePresentation nodePresentation = (NodePresentation) ApogyCommonConvertersFacade.INSTANCE.convert(node, NodePresentation.class);
				
				if(nodePresentation != null)
				{
					nodePresentation.setVisible(!nodePresentation.isVisible());
				}				
			}			
		}
		return null;
	}
}