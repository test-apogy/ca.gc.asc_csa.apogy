package ca.gc.space.mrt.sensors.pose.actions;

import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;

import ca.gc.space.mrt.sensors.pose.PositionSensor;
import ca.gc.space.mrt.sensors.pose.dialogs.ResetPositionDialog;

public class ResetPositionAction extends WorkbenchWindowActionDelegate {

	public void run(IAction action)
	{
		try
		{
			IStructuredSelection sel = (IStructuredSelection) getSelection();
						
			PositionSensor positionSensor = (PositionSensor) sel.getFirstElement();
			ResetPositionDialog  editPositionNodePositionDialog = new ResetPositionDialog( PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), positionSensor);
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
