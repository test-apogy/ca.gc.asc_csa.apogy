package ca.gc.asc_csa.apogy.core.environment.ui.commands;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Point2d;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.environment.ui.Activator;
import ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider;
import org.eclipse.ui.handlers.HandlerUtil;

public class TrajectoryProviderSaveTrajectoryToFileCommand extends AbstractHandler implements IHandler 
{
	public static String path = System.getProperty("user.home");

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof TrajectoryProvider) 
			{
				final TrajectoryProvider trajectoryProvider = (TrajectoryProvider) selection;
				List<Point2d> points = trajectoryProvider.asListOfPoint2d();											
				
				final Shell shell = HandlerUtil.getActiveSite(event).getShell();
				
				FileDialog fd = new FileDialog(shell, SWT.SAVE);
				fd.setFilterPath(path);
				fd.setFilterExtensions(new String[]{"*.csv"});
				fd.setFileName("unnamed.csv");
				fd.setOverwrite(true);
				
				String filePath = fd.open();
		        				
				if(filePath != null)
				{
					try
					{
						saveToFile(filePath, convertToCSV(points));
						path = filePath.substring(0, filePath.lastIndexOf(File.separator));
						
						Logger.INSTANCE.log(Activator.ID, this, "Save trajectory to file <" + filePath + ">.", EventSeverity.OK);
					}
					catch(Throwable t)
					{
						final String message = "Save Trajectory to <" + filePath + " > failed! " + t.getMessage();
						Logger.INSTANCE.log(Activator.ID, this, message,EventSeverity.ERROR, t);																												
					}					
				}
			}
		}
		return null;
	}
	
	protected void saveToFile(String path, String cvsData) throws Exception
	{
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
	    writer.write (cvsData);
	    writer.close();
	}
	
	protected String convertToCSV(List<Point2d> points)
	{
		String csvString = new String();
		
		for(Point2d point : points)
		{
			csvString += point.getX() + "," + point.getY() + "\n";
		}
		
		return csvString;
	}
}
