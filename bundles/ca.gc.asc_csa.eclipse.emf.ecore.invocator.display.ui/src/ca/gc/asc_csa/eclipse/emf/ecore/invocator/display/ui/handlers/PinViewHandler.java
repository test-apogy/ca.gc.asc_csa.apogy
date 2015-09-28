package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.ui.views.TelemetryView;

public class PinViewHandler extends AbstractHandler implements IHandler 
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		if(HandlerUtil.getActivePart(event) instanceof TelemetryView)
		{
			TelemetryView telemetryView = (TelemetryView) HandlerUtil.getActivePart(event);
			
			Command command = event.getCommand();		
			boolean oldValue = HandlerUtil.toggleCommandState(command); 
			telemetryView.setPinView(!oldValue);
		}
		
		return null;
	}
}
