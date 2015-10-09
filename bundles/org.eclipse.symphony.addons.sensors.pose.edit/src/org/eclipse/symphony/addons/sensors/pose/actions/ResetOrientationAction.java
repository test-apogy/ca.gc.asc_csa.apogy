package org.eclipse.symphony.addons.sensors.pose.actions;

import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.symphony.addons.sensors.pose.OrientationSensor;
import org.eclipse.symphony.addons.sensors.pose.dialogs.ResetOrientationDialog;
import org.eclipse.ui.PlatformUI;

public class ResetOrientationAction extends WorkbenchWindowActionDelegate {

	public void run(IAction action)
	{
		try
		{
			IStructuredSelection sel = (IStructuredSelection) getSelection();
						
			OrientationSensor orientationSensor = (OrientationSensor) sel.getFirstElement();
			ResetOrientationDialog  editPositionNodePositionDialog = new ResetOrientationDialog( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), orientationSensor);
			editPositionNodePositionDialog.create();				
			editPositionNodePositionDialog.open();	
			editPositionNodePositionDialog.getReturnCode();								
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}	

}
