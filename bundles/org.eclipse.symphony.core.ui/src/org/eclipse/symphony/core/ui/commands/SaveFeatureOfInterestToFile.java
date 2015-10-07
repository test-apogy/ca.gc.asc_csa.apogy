package org.eclipse.symphony.core.ui.commands;

import java.io.File;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.symphony.core.FeatureOfInterestList;
import org.eclipse.symphony.core.SymphonyCoreFacade;
import org.eclipse.ui.handlers.HandlerUtil;


public class SaveFeatureOfInterestToFile extends AbstractHandler implements IHandler 
{
	public static String path = System.getProperty("user.home");
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof FeatureOfInterestList) 
			{
				final FeatureOfInterestList featureOfInterestList = (FeatureOfInterestList) selection;															
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
						SymphonyCoreFacade.INSTANCE.saveFeatureOfInterestToFile(filePath, featureOfInterestList.getFeaturesOfInterest());												
						path = filePath.substring(0, filePath.lastIndexOf(File.separator));						
					}
					catch(Throwable t)
					{				
						t.printStackTrace();
					}					
				}
			}
		}
		return null;
	}
}
