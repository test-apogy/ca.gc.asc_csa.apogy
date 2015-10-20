package org.eclipse.symphony.examples.satellite.ui.commands;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.SimpleTimeZone;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.symphony.examples.satellite.SatelliteCommand;
import org.eclipse.symphony.examples.satellite.SatelliteCommandAcquireImage;
import org.eclipse.symphony.examples.satellite.SatelliteCommandList;
import org.eclipse.symphony.examples.satellite.SatelliteCommandRoll;
import org.eclipse.ui.handlers.HandlerUtil;


public class ExportSatelliteCommandListToFile extends AbstractHandler implements IHandler 
{
	public static String path = System.getProperty("user.home");
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 	
		{
			Object selection = selections.next();

			if (selection instanceof SatelliteCommandList) 
			{
				final SatelliteCommandList satelliteCommandList = (SatelliteCommandList) selection;															
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
						saveToFile(filePath, convertToCSV(satelliteCommandList));
						path = filePath.substring(0, filePath.lastIndexOf(File.separator));						
					}
					catch(Throwable t)
					{						
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
	
	protected String convertToCSV(SatelliteCommandList commandList)
	{
		String csvString = new String();
		
		// Creates the CSV header line
		csvString += "Satellite, Start Time, Command Type, arg0, arg1\n";
		
		DecimalFormat rollFormat = new DecimalFormat("0.00");
		DecimalFormat zoomFormat = new DecimalFormat("0.0");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		dateFormat.setTimeZone(new SimpleTimeZone(0, "GMT"));
		dateFormat.applyPattern("dd MMM yyyy HH:mm:ss z");
		
		for(SatelliteCommand cmd : commandList.getCommands())
		{
			// First column is the satellite
			csvString += cmd.getSatellite().getName().replace(",", ";") + ",";
						
			// Second column is the time
			// Need this approach as toGMTString() is deprecated
			csvString += dateFormat.format(cmd.getCommandStartTime()) + ",";
									
			if(cmd instanceof SatelliteCommandRoll)
			{
				// Third column is command type
				SatelliteCommandRoll cmdRoll = (SatelliteCommandRoll) cmd;
				
				// Fourth column is cmd name
				csvString += "SatelliteCommandRoll,";
				
				// Fifth column is roll value (in deg).
				csvString += rollFormat.format(Math.toDegrees(cmdRoll.getTargetRollAngle())) + ",";
				
				// Fifth column is blank
				csvString += "";
			}
			else if(cmd instanceof SatelliteCommandAcquireImage)
			{				
				SatelliteCommandAcquireImage cmdAcquire = (SatelliteCommandAcquireImage) cmd;				
			
				// Third column is command type
				csvString += "SatelliteCommandAcquireImage,";
				
				// Fourth column is imageOrder ID (in deg).
				csvString += Integer.toString(cmdAcquire.getImageOrder().getOrderId()) + ",";
				
				// Fifth column is zoom value.
				csvString += zoomFormat.format(cmdAcquire.getImageOrder().getCommandedZoom());
			}	
			
			csvString += "\n";
		}
		
		return csvString;
	}
}
