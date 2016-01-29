package ca.gc.asc_csa.apogy.core.environment.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import ca.gc.asc_csa.apogy.core.environment.ui.views.CoordinateConversionView;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class ToggleCoordinateConversionViewSelectionEnabledCommand extends AbstractHandler
{
	private static final String COORD_CONVERSION_VIEW_ID = "ca.gc.asc_csa.apogy.core.environment.ui.views.CoordinateConversionView";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		try
		{
			// Get the conversion coordinate view
			CoordinateConversionView coordConvView = (CoordinateConversionView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().
																					getActivePage().showView(COORD_CONVERSION_VIEW_ID);
			
			// Toggle the command state
			boolean enableSelections = !(HandlerUtil.toggleCommandState(event.getCommand()));
			
			// Toggle whether the coordinate view is allowed to make selections
			coordConvView.enableSelections(enableSelections);
		}
		catch(PartInitException ex)
		{
			// Print the stack trace
			ex.printStackTrace();
		}
		
		// Just return null
		return null;
	}
}
