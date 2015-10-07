package org.eclipse.symphony.core.ui.commands;

import java.io.File;
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
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.FeatureOfInterest;
import org.eclipse.symphony.core.FeatureOfInterestList;
import org.eclipse.symphony.core.SymphonyCoreFacade;
import org.eclipse.symphony.core.ui.Activator;
import org.eclipse.ui.handlers.HandlerUtil;


public class LoadFeatureOfInterestFromFile extends AbstractHandler implements IHandler 
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
				
				FileDialog fd = new FileDialog(shell, SWT.OPEN);
				fd.setFilterPath(path);
				fd.setFilterExtensions(new String[]{"*.csv"});				
				fd.setOverwrite(true);
				
				String filePath = fd.open();
		        												
				if(filePath != null)
				{
					String urlString = "file://localhost/" + filePath.replace("\\", "/");	
					
					try
					{		
						Logger.INSTANCE.log(Activator.ID, this, "Loading Feature of Interest from file<" + urlString + ">...", EventSeverity.INFO);
						
						if(filePath.endsWith(".csv"))
						{																																		
							List<FeatureOfInterest> foiList = SymphonyCoreFacade.INSTANCE.loadFeatureOfInterestFromFile(urlString);
																
							if(foiList.size() > 0)
							{
								Logger.INSTANCE.log(Activator.ID, this, "Loaded <" + foiList.size() + "> Feature of Interest from file<" + urlString + ">.", EventSeverity.OK);							
								featureOfInterestList.getFeaturesOfInterest().addAll(foiList);
							}
							else
							{
								Logger.INSTANCE.log(Activator.ID, this, "Could not load any Feature of Interest from file<" + urlString + ">!", EventSeverity.WARNING);
							}
							
							path = filePath.substring(0, filePath.lastIndexOf(File.separator));
						}						
					}
					catch(Throwable t)
					{			
						Logger.INSTANCE.log(Activator.ID, this, "Failed to load Feature of Interest from file<" + urlString + ">!", EventSeverity.ERROR, t);						
					}					
				}
				else
				{
					Logger.INSTANCE.log(Activator.ID, this, "No file selected !", EventSeverity.WARNING);
				}
			
			}
		}
		return null;
	}
}
