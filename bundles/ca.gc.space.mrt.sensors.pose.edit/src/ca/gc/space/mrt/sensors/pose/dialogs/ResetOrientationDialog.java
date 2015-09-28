package ca.gc.space.mrt.sensors.pose.dialogs;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.space.mrt.sensors.pose.OrientationSensor;
import ca.gc.space.mrt.sensors.pose.composites.EditOrientationComposite;
import ca.gc.space.mrt.sensors.pose.provider.PoseEditPlugin;

public class ResetOrientationDialog extends MessageDialog
{
	private OrientationSensor orientationSensor;
	
	private EditOrientationComposite editOrientationComposite;
	private static final int APPLY_BUTTON_ID = 0;
	private static final int CLOSE_BUTTON_ID = 1;
	
	public ResetOrientationDialog(Shell parentShell, String dialogTitle, Image dialogTitleImage, String dialogMessage, int dialogImageType, String[] dialogButtonLabels, int defaultIndex)
	{
		super(parentShell, dialogTitle, dialogTitleImage, dialogMessage, dialogImageType, dialogButtonLabels, defaultIndex);		
	}
	
	public ResetOrientationDialog(Shell parentShell, OrientationSensor orientationSensor)
	{
		super(parentShell, "Reset Orientation", null, null, MessageDialog.NONE,  new String[]{"Apply", "Close"}, 0);		
		this.orientationSensor = orientationSensor;
	}
	
	@Override
	protected Control createCustomArea(Composite parent)
	{		
		editOrientationComposite = new EditOrientationComposite(parent, SWT.NONE, this.orientationSensor); 
		return editOrientationComposite;
	}

	@Override
	protected void buttonPressed(int buttonId)
	{
		switch(buttonId)
		{
			case APPLY_BUTTON_ID:
			{
				try
				{
					this.orientationSensor.resetOrientation(editOrientationComposite.getNewValues());
				}
				catch(Exception e)
				{
					Logger.INSTANCE.log(PoseEditPlugin.ID, this,"Error occured while reseting orientation !", EventSeverity.ERROR);
				}
				break;			
			}						
			case CLOSE_BUTTON_ID:
			{
				this.close();
				break;
			}
			default:
			{
				this.close();
			}	
		}
	}
}
