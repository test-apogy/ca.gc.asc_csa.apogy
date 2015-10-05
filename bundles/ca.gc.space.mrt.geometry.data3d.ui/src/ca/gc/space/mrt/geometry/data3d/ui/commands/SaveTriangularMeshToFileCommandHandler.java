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
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.Data3DIO;
import ca.gc.space.mrt.geometry.data3d.ui.Activator;

public class SaveTriangularMeshToFileCommandHandler extends AbstractHandler implements IHandler
{
	protected static String currentDir = System.getProperty("user.dir");
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof CartesianTriangularMesh) 
			{
				final CartesianTriangularMesh mesh = (CartesianTriangularMesh) selection;
				
				// Open pop-up and save.
				IWorkbench wb = PlatformUI.getWorkbench();
				Shell shell = wb.getActiveWorkbenchWindow().getShell();								 				
				saveToFile(shell, mesh);				
			}
		}
		return null;
	}
	
	protected void saveToFile(final Shell shell, final CartesianTriangularMesh mesh)
	{
		FileDialog fileChooser = new FileDialog(shell, SWT.SAVE);
		fileChooser.setText("Save Mesh (" + mesh.getPoints().size() +" points, "+ mesh.getPolygons().size() + " triangles) to files");
		fileChooser.setFilterPath(currentDir);
		fileChooser.setFilterExtensions(new String[] { "*.tri;"});		
		String filename = fileChooser.open();
		if (filename != null)
		{			
			try
			{				
				if(filename.endsWith(".tri"))
				{
					String filePrefix = filename.substring(0, filename.lastIndexOf(".tri"));
					saveTriangularMeshAsASCII(mesh, filePrefix);
				}						
				else
				{			
					String fileExtension = "";					
					if(filename.lastIndexOf(".") > 0)
					{
						fileExtension = filename.substring(filename.lastIndexOf("."));
					}
					String message = "Failed to save the image. The specified file extension <"+ fileExtension +"> is not supported.";					
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
	
	protected void saveTriangularMeshAsASCII(CartesianTriangularMesh mesh, String filePrefix)
	{
		Logger.INSTANCE.log(Activator.ID, this, "Saving mesh to file <" + filePrefix + ".tri" + " and " + filePrefix + ".xyz...", EventSeverity.INFO);
		try
		{
			Data3DIO.INSTANCE.saveTriangularMeshAsASCII(mesh, filePrefix);
			Logger.INSTANCE.log(Activator.ID, this, "Saved mesh to file <" + filePrefix + ".tri" + " and " + filePrefix + ".xyz.", EventSeverity.OK);
		}
		catch(Throwable t)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to save mesh to file <" + filePrefix + ".tri" + " and " + filePrefix + ".xyz !", EventSeverity.ERROR, t);
		}
	}

}
