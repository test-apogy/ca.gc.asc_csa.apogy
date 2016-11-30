package ca.gc.asc_csa.apogy.core.topology.ui.parts;
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
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.awt.image.BufferedImage;

import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.progress.UIJob;

import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewer;
import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.common.ui.parts.AbstractApogyPart;
import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade;

abstract public class AbstractApogyTopologyBasedPart extends AbstractApogyPart{
	
	private Adapter adapter;
	private TopologyViewer topologyViewer;	
	@Inject Shell shell;
	private String currentDirectory = System.getProperty("user.dir");

	@Override
	protected void createContentComposite(Composite parent, int style) {
		topologyViewer = createTopologyViewer(parent);
	}
	
	public TopologyViewer getTopologyViewer() {
		return topologyViewer;
	}
	
	abstract public TopologyViewer createTopologyViewer(Composite parent);	
	
	@Override
	protected void createNoContentComposite(Composite parent, int style) {
		new NoContentComposite(parent, SWT.None){
			@Override
			protected String getMessage() {
				return "No active session";
			}
		};	
	}
			
	@Override
	protected EObject getInitializeObject() {
		ApogyCoreTopologyFacade.INSTANCE.eAdapters().add(getAdapter());
		return ApogyCoreTopologyFacade.INSTANCE.getApogyTopology();
	} 
	
	protected void newTopology(ApogyTopology apogyTopology) {
		GraphicsContext graphicsContext = ApogyCommonTopologyUIFacade.INSTANCE
				.createGraphicsContext(apogyTopology.getRootNode());
		topologyViewer.setInput(graphicsContext);
	}

	@Override
	protected void setCompositeContent(EObject eObject) {
		newTopology((ApogyTopology) eObject); 
	}
	/**
	 * Gets an adapter that sets the part's parentComposite to a
	 * {@link NoActiveSessionComposite} if there is no active session.
	 * 
	 * @return the {@link Adapter}
	 */
	private Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					setEObject(ApogyCoreTopologyFacade.INSTANCE.getApogyTopology());
				}
			};
		}
		return adapter;
	}

	public void dispose() {
		ApogyCoreTopologyFacade.INSTANCE.eAdapters().remove(getAdapter());
	}
	
	
	public void zoomToFit(){
		getTopologyViewer().zoomToFit();
	}
	
	public void setAntiAliasing(boolean enable){		
		getTopologyViewer().setAntiAliasing(enable);
	}
	
	public void setHighSpeedMode(boolean enable){
		getTopologyViewer().setHighSpeedMotionEnabled(enable);
	}
	
	public void setPickingMode(boolean enable){
		getTopologyViewer().setPickingModeEnabled(enable);
	}
	
	public void showStatisticsDisplay(boolean enable){
		getTopologyViewer().setShowStatisticsEnabled(enable);
	}
	
	public void resetLevelViewpoint(){
		getTopologyViewer().levelViewPoint();
	}
	
	public void takeScreenshot(){
		getTopologyViewer().takeScreenshot();
		
		BufferedImage image = getTopologyViewer().takeScreenshot();		
		if(image != null)
		{
			EImage eImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();
			eImage.setImageContent(image);
			
			if(eImage != null)
			{
				// Open pop-up and save.
				FileDialog fileChooser = new FileDialog(shell, SWT.SAVE);		
				fileChooser.setText("Saves image to file");
				fileChooser.setFilterPath(currentDirectory);
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
						Logger.INSTANCE.log(Activator.ID, this, "Unable to save image to file <" + filename + ">.", EventSeverity.OK);
					}			
					currentDirectory = fileChooser.getFilterPath();
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