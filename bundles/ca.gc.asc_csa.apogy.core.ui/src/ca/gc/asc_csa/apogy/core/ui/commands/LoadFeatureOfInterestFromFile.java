package ca.gc.asc_csa.apogy.core.ui.commands;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestList;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ui.Activator;
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
							List<FeatureOfInterest> foiList = ApogyCoreFacade.INSTANCE.loadFeatureOfInterestFromFile(urlString);
																
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
