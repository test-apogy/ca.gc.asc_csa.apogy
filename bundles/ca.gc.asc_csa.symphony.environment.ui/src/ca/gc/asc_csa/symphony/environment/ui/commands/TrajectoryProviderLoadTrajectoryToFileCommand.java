package ca.gc.asc_csa.symphony.environment.ui.commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
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
import org.eclipse.ui.handlers.HandlerUtil;
import org.jfree.data.xy.XYDataItem;

import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.asc_csa.symphony.environment.ui.Activator;
import ca.gc.asc_csa.symphony.environment.ui.TrajectoryProvider;

public class TrajectoryProviderLoadTrajectoryToFileCommand extends AbstractHandler implements IHandler 
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
				final Shell shell = HandlerUtil.getActiveSite(event).getShell();
				
				FileDialog fd = new FileDialog(shell, SWT.OPEN);
				fd.setFilterPath(path);
				fd.setFilterExtensions(new String[]{"*.csv"});				
				fd.setOverwrite(true);
				
				String filePath = fd.open();
		        				
				if(filePath != null)
				{
					try
					{
						List<Point2d> points = loadFile(filePath);
						trajectoryProvider.clear();
						addPoints(trajectoryProvider, points);
						
						path = filePath.substring(0, filePath.lastIndexOf(File.separator));
						
						Logger.INSTANCE.log(Activator.ID, this, "Loaded <" + points.size() + "> points from  trajectory file <" + filePath + ">.", EventSeverity.OK);
					}
					catch(Throwable t)
					{
						final String message = "Load Trajectory from <" + filePath + " > failed! " + t.getMessage();
						Logger.INSTANCE.log(Activator.ID, this, message,EventSeverity.ERROR, t);																												
					}					
				}
			}
		}
		return null;
	}	
	
	protected List<Point2d> loadFile(String path) throws Exception
	{
		List<Point2d> points = new ArrayList<Point2d>();
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line = null;
		while ((line = reader.readLine()) != null) 
		{
			line = line.trim();
			String[] entries = line.split(",");
			
			double x = Double.parseDouble(entries[0]);
			double y = Double.parseDouble(entries[1]);
			
			Point2d p = new Point2d(x, y);
			
			points.add(p);
		}
		
		reader.close();
		
		return points;
	}	
	
	protected void addPoints(TrajectoryProvider trajectoryProvider, List<Point2d> points)
	{
		for(Point2d p : points)
		{
			 XYDataItem xyDataItem = new XYDataItem(p.getX(), p.getY());
			 trajectoryProvider.getXYSeries().add(xyDataItem);
		}
	}
}
