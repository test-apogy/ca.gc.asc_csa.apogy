package ca.gc.asc_csa.apogy.core.programs.controllers.ui.commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFacade;
import ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint;
import ca.gc.asc_csa.apogy.core.programs.controllers.UserDefinedInputConditioning;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.Activator;
import org.eclipse.ui.handlers.HandlerUtil;

public class LoadUserDefinedInputConditioningFromFileCommand extends AbstractHandler implements IHandler 
{
	public static String path = System.getProperty("user.home");

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof UserDefinedInputConditioning) 
			{
				final UserDefinedInputConditioning userDefinedInputConditioning = (UserDefinedInputConditioning) selection;															
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
						List<CustomInputConditioningPoint> points = loadFile(filePath);
						userDefinedInputConditioning.getTransferFunction().clear();
						userDefinedInputConditioning.getTransferFunction().addAll(points);
						
						path = filePath.substring(0, filePath.lastIndexOf(File.separator));
																		
						Logger.INSTANCE.log(Activator.ID, this, "Loaded <" + points.size() + "> points from  UserDefinedInputConditioning file <" + filePath + ">.", EventSeverity.OK);
					}
					catch(Throwable t)
					{
						final String message = "Load UserDefinedInputConditioning profile from <" + filePath + " > failed! " + t.getMessage();
						 Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR, t);																												
					}					
				}
			}
		}
		return null;
	}	
	
	protected List<CustomInputConditioningPoint> loadFile(String path) throws Exception
	{
		List<CustomInputConditioningPoint> points = new ArrayList<CustomInputConditioningPoint>();
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line = null;
		while ((line = reader.readLine()) != null) 
		{
			line = line.trim();
			
			try
			{
				String[] entries = line.split(",");
				
				double inputValue = Double.parseDouble(entries[0]);
				double outputValue = Double.parseDouble(entries[1]);
				
				CustomInputConditioningPoint p = ApogyCoreProgramsControllersFacade.INSTANCE.createCustomInputConditioningPoint(inputValue, outputValue);
				
				points.add(p);
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
		
		reader.close();
		
		return points;
	}	
}
