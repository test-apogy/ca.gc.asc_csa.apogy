package ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions;
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

import java.awt.image.BufferedImage;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerProvider;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.internal.IConstants;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.internal.PluginImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;

public class TakeScreenShotAction extends Action 
{
	private String currentDir = System.getProperty("user.dir");
	
	private TopologyViewerProvider provider;

	public TakeScreenShotAction(TopologyViewerProvider provider) 
	{
		super("Take Screen Shot", IAction.AS_PUSH_BUTTON);
		
		this.provider = provider;
		
		ImageDescriptor enabledImageDescriptor = PluginImages.getImageDescriptor(IConstants.IMG_TAKE_SCREENSHOT);
		setImageDescriptor(enabledImageDescriptor);

		ImageDescriptor disabledImageDescriptor = PluginImages.getImageDescriptor(IConstants.IMG_TAKE_SCREENSHOT);
		setDisabledImageDescriptor(disabledImageDescriptor);
	}

	@Override
	public void run() 
	{	
		BufferedImage image = this.provider.getTopologyViewer().takeScreenshot();
		
		if(image != null)
		{
			EImage eImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();
			eImage.setImageContent(image);
			
			if(eImage != null)
			{
				// Open pop-up and save.
				IWorkbench wb = PlatformUI.getWorkbench();
				Shell shell = wb.getActiveWorkbenchWindow().getShell();	
				
				FileDialog fileChooser = new FileDialog(shell, SWT.SAVE);		
				fileChooser.setText("Saves image to file");
				fileChooser.setFilterPath(currentDir);
				fileChooser.setFilterExtensions(new String[] { "*.png;"});		
				String filename = fileChooser.open();
				if (filename != null)
				{			
					try
					{				
						if(filename.endsWith(".png"))
						{
							saveImageInJob(eImage, filename, SWT.IMAGE_PNG);
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
		}				
	}
	
	/**
	 * Save the current image to a file. This is done in a UIJob to 
	 * keep the desktop responsive in case of a long save process.
	 * @param fileName The destination file where to save the image.
	 * @param fileType The file type : SWT.IMAGE_JPEG or SWT.IMAGE_BMP or ...
	 */
	private void saveImageInJob(final AbstractEImage image, final String fileName, final int fileType)
	{		
		UIJob job = new UIJob("Save Image to file <" + fileName + ">")
		{
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) 
			{				
				try
				{
					// Save image.
					if(fileType == SWT.IMAGE_JPEG)
					{
						EImagesUtilities.INSTANCE.saveImageAsJPEG(fileName, image);
					}
					else if(fileType == SWT.IMAGE_PNG)
					{
						EImagesUtilities.INSTANCE.saveImageAsPNG(fileName, image);
					}
					
					Logger.INSTANCE.log(Activator.ID, this, "Sucessfully saved image to file <" + fileName + ">.", EventSeverity.OK);
					Status status = new Status(IStatus.OK, Activator.ID, "Sucessfully saved image to file <" + fileName + ">.");									
					return status;
				}
				catch(Exception e)
				{
					String message = "Failed to save the image to file <" + fileName + ">. The following exception was thrown : \n\n " + e.getMessage();

					Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.OK, e);
					Status status = new Status(IStatus.ERROR, Activator.ID, message, e);					
					return status;										
				}	
			}			
		};
		job.schedule();		
	}
}
