package ca.gc.space.mrt.geometry.data3d.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.Data3DIO;
import ca.gc.space.mrt.geometry.data3d.ui.Activator;

public class SaveCartesianCoordinatesSetToFileCommandHandler extends AbstractHandler implements IHandler
{
	protected static String currentDir = System.getProperty("user.dir");
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof CartesianCoordinatesSet) 
			{
				final CartesianCoordinatesSet coordinatesSet = (CartesianCoordinatesSet) selection;
				
				// Open pop-up and save.
				IWorkbench wb = PlatformUI.getWorkbench();
				Shell shell = wb.getActiveWorkbenchWindow().getShell();								 				
				saveToFile(shell, coordinatesSet);				
			}
		}
		return null;
	}
	
	protected void saveToFile(final Shell shell, final CartesianCoordinatesSet coordinatesSet)
	{
		FileDialog fileChooser = new FileDialog(shell, SWT.SAVE);
		fileChooser.setText("Save Coordinates Set (" + coordinatesSet.getPoints().size() +" points) to file");
		fileChooser.setFilterPath(currentDir);
		fileChooser.setFilterExtensions(new String[] { "*.xyz;*.csv;"});		
		String filename = fileChooser.open();
		if (filename != null)
		{			
			try
			{				
				if(filename.endsWith(".xyz"))
				{
					saveAsXYZ(coordinatesSet, filename);
				}
				else if(filename.endsWith(".csv"))
				{
					saveAsCSV(coordinatesSet, filename);					
				}				
				else
				{			
					String fileExtension = "";					
					if(filename.lastIndexOf(".") > 0)
					{
						fileExtension = filename.substring(filename.lastIndexOf("."));
					}
					String message = "Failed to save the coordinates. The specified file extension <"+ fileExtension +"> is not supported.";
					
					Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
					
					MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);					
					messageBox.setMessage(message);
					messageBox.open();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();				
			}			
			currentDir = fileChooser.getFilterPath();
		}
	}
	
	protected void saveAsXYZ(CartesianCoordinatesSet coordinatesSet, String fileName)
	{
		Logger.INSTANCE.log(Activator.ID, this, "Saving coordinates to file <" + fileName + ">...", EventSeverity.INFO);
		try
		{
			Data3DIO.INSTANCE.saveCoordinatesSetToXYZ(coordinatesSet, fileName);
			Logger.INSTANCE.log(Activator.ID, this, "Saved coordinates to file <" + fileName + ">.", EventSeverity.OK);
		}
		catch(Throwable t)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to save coordinates to file <" + fileName + ">!", EventSeverity.ERROR, t);
		}
	}
	
	protected void saveAsCSV(CartesianCoordinatesSet coordinatesSet, String fileName)
	{		
		Logger.INSTANCE.log(Activator.ID, this, "Saving coordinates to file <" + fileName + ">...", EventSeverity.INFO);
		try
		{
			Data3DIO.INSTANCE.saveCoordinatesSetToCSV(coordinatesSet, fileName);
			Logger.INSTANCE.log(Activator.ID, this, "Saved coordinates to file <" + fileName + ">.", EventSeverity.OK);
		}
		catch(Throwable t)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to save coordinates to file <" + fileName + ">!", EventSeverity.ERROR, t);
		}
	}

}
