package org.eclipse.symphony.core.environment.commands;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer;
import org.eclipse.ui.handlers.HandlerUtil;

public class TopologyTreeMapLayerUpdateCommandHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof CartesianTriangularMeshMapLayer) 
			{
				final CartesianTriangularMeshMapLayer layer = (CartesianTriangularMeshMapLayer) selection;
				IRunnableWithProgress runnable = new IRunnableWithProgress() 
				{				
					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException,	InterruptedException 
					{						
						Node node = layer.getAbstractMapLayerNode();
						NodePresentation nodePresentation = ca.gc.space.topology.ui.Activator.getTopologyPresentationRegistry().getPresentationNode(node);				
						if(nodePresentation != null)
						{
							nodePresentation.setVisible(!nodePresentation.isVisible());
						}
					}
				};
				
				try 
				{
					new ProgressMonitorDialog(Display.getCurrent().getActiveShell()).run(true, true, runnable);
				} 
				catch (InvocationTargetException e) 
				{				
					e.printStackTrace();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
