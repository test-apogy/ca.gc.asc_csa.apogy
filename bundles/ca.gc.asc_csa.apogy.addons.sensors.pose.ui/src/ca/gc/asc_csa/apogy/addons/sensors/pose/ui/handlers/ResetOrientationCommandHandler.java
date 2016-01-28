package org.eclipse.symphony.addons.sensors.pose.ui.handlers;

import java.util.Iterator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.symphony.addons.sensors.pose.OrientationSensor;
import org.eclipse.symphony.addons.sensors.pose.ui.dialogs.ResetOrientationDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class ResetOrientationCommandHandler extends AbstractHandler implements IHandler
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
		
		while (selections.hasNext())
		{
			Object selection = selections.next();
			
			if (selection instanceof OrientationSensor)
			{
				final OrientationSensor orientationSensor = (OrientationSensor) selection;
				
				ResetOrientationDialog  editPositionNodePositionDialog = new ResetOrientationDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
						                                                                            orientationSensor);
				
				editPositionNodePositionDialog.create();
				editPositionNodePositionDialog.open();
				editPositionNodePositionDialog.getReturnCode();
				
				break;
			}
		}
		
		return null;
	}

}
