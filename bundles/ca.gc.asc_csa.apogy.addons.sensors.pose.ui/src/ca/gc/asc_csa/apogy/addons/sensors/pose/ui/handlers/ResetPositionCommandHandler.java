package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PositionSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.dialogs.ResetPositionDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class ResetPositionCommandHandler extends AbstractHandler implements IHandler
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
		
		while (selections.hasNext())
		{
			Object selection = selections.next();
			
			if (selection instanceof PositionSensor)
			{
				final PositionSensor positionSensor = (PositionSensor) selection;
				
				ResetPositionDialog  editPositionNodePositionDialog = new ResetPositionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
																							  positionSensor);
				
				editPositionNodePositionDialog.create();
				editPositionNodePositionDialog.open();
				editPositionNodePositionDialog.getReturnCode();
				
				break;
			}
		}
		
		return null;
	}
}
