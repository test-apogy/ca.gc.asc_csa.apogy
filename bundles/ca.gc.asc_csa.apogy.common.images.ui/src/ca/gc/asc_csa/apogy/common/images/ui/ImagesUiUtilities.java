package ca.gc.asc_csa.apogy.common.images.ui;
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import org.eclipse.ui.progress.UIJob;

public class ImagesUiUtilities {

	private ImagesUiUtilities() {
	}
	
	/** 
	 * Exports the specified image into a file specified by the {@link FileDialog}. 
	 * @param imageData Reference to the {@link ImageData}.
	 */
	public static void export(ImageData imageData){		
		String currentDir = System.getProperty("user.dir");
		FileDialog fileChooser = new FileDialog(Display.getDefault().getActiveShell(), SWT.SAVE);
		fileChooser.setText("Open image file");
		fileChooser.setFilterPath(currentDir);
		fileChooser.setFilterExtensions(new String[] { "*.jpg;*.png;"});		
		String filename = fileChooser.open();
		if (filename != null)
		{			
			try
			{				
				EImage image = ApogyCommonImagesFactory.eINSTANCE.createEImage();				
				image.setImageContent(EImagesUtilities.INSTANCE.convertToBufferedImage(imageData));
				if(filename.endsWith(".jpg"))
				{
					saveImageInJob(image, filename, SWT.IMAGE_JPEG);					
				}
				else if(filename.endsWith(".png"))
				{
					saveImageInJob(image, filename, SWT.IMAGE_PNG);
				}				
				else
				{			
					String fileExtension = "";					
					if(filename.lastIndexOf(".") > 0)
					{
						fileExtension = filename.substring(filename.lastIndexOf("."));
					}
					String message = "Failed to save the image. The specified file extension <"+ fileExtension +"> is not supported.";
					
					Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, message);					
					Activator.getDefault().getLog().log(status);	
					
					MessageBox messageBox = new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);					
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
	
	/**
	 * Save the current image to a file. This is done in a UIJob to 
	 * keep the desktop responsive in case of a long save process.
	 * @param fileName The destination file where to save the image.
	 * @param fileType The file type : SWT.IMAGE_JPEG or SWT.IMAGE_BMP or ...
	 */
	private static void saveImageInJob(final AbstractEImage image, final String fileName, final int fileType)
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
					
					Status status = new Status(IStatus.OK, Activator.PLUGIN_ID, "Sucessfully saved image to file <" + fileName + ">.");					
					Activator.getDefault().getLog().log(status);					
					return status;
				}
				catch(Exception e)
				{
					String message = "Failed to save the image to file <" + fileName + ">. The following exception was thrown : \n\n " + e.getMessage();
					Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, e);					
					Activator.getDefault().getLog().log(status);	
					
					return status;										
				}	
			}			
		};
		job.schedule();		
	}
	
	
}