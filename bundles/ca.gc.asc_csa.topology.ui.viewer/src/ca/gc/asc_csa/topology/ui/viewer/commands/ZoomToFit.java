package ca.gc.asc_csa.topology.ui.viewer.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.topology.ui.viewer.TopologyViewerProvider;

public class ZoomToFit extends AbstractHandler {		

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbenchWindow activeWorkbenchWindow = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);

		if (activeWorkbenchWindow.getActivePage().getActivePart() instanceof TopologyViewerProvider) 
		{
			TopologyViewerProvider topoView = (TopologyViewerProvider) activeWorkbenchWindow.getActivePage().getActivePart();
			topoView.getTopologyViewer().zoomToFit();		
		}
		return null;
	}

}
