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
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewer;
import ca.gc.asc_csa.apogy.core.ApogyTopology;

public abstract class AbstractApogy3dPart extends AbstractApogyTopologyBasedPart {

	private String currentDirectory = System.getProperty("user.dir");
	private TopologyViewer topologyViewer;
	@Inject
	Shell shell;

	@Override
	protected void createContentComposite(Composite parent, int style) {
		JME3RenderEngineDelegate jme3RenderEngineDelegate = createJME3RenderEngineDelegate();
		topologyViewer = new TopologyViewer(parent, jme3RenderEngineDelegate);

		jme3RenderEngineDelegate.setMaximumFrameRate(topologyViewer.getMaximumFrameRate());
		jme3RenderEngineDelegate.setVerbose(topologyViewer.isVerbose());
		jme3RenderEngineDelegate.setAntiAliasing(topologyViewer.isAntiAliasingEnabled());
		jme3RenderEngineDelegate.setShowStatisticsEnabled(topologyViewer.isShowStatisticsEnabled());
	}

	public TopologyViewer getTopologyViewer() {
		return topologyViewer;
	}

	@Override
	protected void newTopology(ApogyTopology apogyTopology) {
		GraphicsContext graphicsContext = ApogyCommonTopologyUIFacade.INSTANCE
				.createGraphicsContext(apogyTopology.getRootNode());
		topologyViewer.setInput(graphicsContext);
	}

	/*
	 * Methods that create the JME3RenderEngineDelegate to be used.
	 * 
	 * @return The JME3RenderEngineDelegate to be used.
	 */
	protected abstract JME3RenderEngineDelegate createJME3RenderEngineDelegate();

	/*
	 * Sets the actual zoom to display the entire loaded scene.
	 */
	public void zoomToFit() {
		getTopologyViewer().zoomToFit();
	}

	/*
	 * Enables or disables anti-aliasing rendering.
	 * 
	 * @param enable true enables the anti-aliasing.
	 */
	public void setAntiAliasing(boolean enable) {
		getTopologyViewer().setAntiAliasing(enable);
	}

	/*
	 * Enables or disables high speed motion while using the mouse.
	 * 
	 * @param enable true enables high speed.
	 */
	public void setHighSpeedMode(boolean enable) {
		getTopologyViewer().setHighSpeedMotionEnabled(enable);
	}

	/*
	 * Enables or disables the picking mode.
	 * 
	 * @param enable true enables the picking mode.
	 */
	public void setPickingMode(boolean enable) {
		getTopologyViewer().setPickingModeEnabled(enable);
	}

	/*
	 * Shows of hides the renderer statistics.
	 * 
	 * @param enable true enables the statistics display.
	 */
	public void showStatisticsDisplay(boolean enable) {
		getTopologyViewer().setShowStatisticsEnabled(enable);
	}

	/*
	 * Resets the horizontal view point.
	 */
	public void resetLevelViewpoint() {
		getTopologyViewer().levelViewPoint();
	}

	/*
	 * Takes a screenshot and prompts the user to identify the file type and the
	 * filename.
	 */
	public void takeScreenshot() {
		getTopologyViewer().takeScreenshot();

		BufferedImage image = getTopologyViewer().takeScreenshot();
		if (image != null) {
			EImage eImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();
			eImage.setImageContent(image);

			if (eImage != null) {
				// Open pop-up and save.
				FileDialog fileChooser = new FileDialog(shell, SWT.SAVE);
				fileChooser.setText("Saves image to file");
				fileChooser.setFilterPath(currentDirectory);
				fileChooser.setFilterExtensions(new String[] { "*.png;" });
				String filename = fileChooser.open();
				if (filename != null) {
					try {
						if (filename.endsWith(".png")) {
							saveImageInJob(eImage, filename, SWT.IMAGE_PNG);
						} else {
							String fileExtension = "";
							if (filename.lastIndexOf(".") > 0) {
								fileExtension = filename.substring(filename.lastIndexOf("."));
							}
							String message = "Failed to save the image. The specified file extension <" + fileExtension
									+ "> is not supported.";

							Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);

							MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
							messageBox.setMessage(message);
							messageBox.open();
						}
					} catch (Exception e) {
						Logger.INSTANCE.log(Activator.ID, this, "Unable to save image to file <" + filename + ">.",
								EventSeverity.OK);
					}
					currentDirectory = fileChooser.getFilterPath();
				}
			}
		}

	}

	/*
	 * Saves the current image to a file. This is done in a UIJob to keep the
	 * desktop responsive in case of a long save process.
	 * 
	 * @param fileName The destination file where to save the image.
	 * 
	 * @param fileType The file type : SWT.IMAGE_JPEG or SWT.IMAGE_BMP or ...
	 */
	private void saveImageInJob(final AbstractEImage image, final String fileName, final int fileType) {
		UIJob job = new UIJob("Save Image to file <" + fileName + ">") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				try {
					// Save image.
					if (fileType == SWT.IMAGE_JPEG) {
						EImagesUtilities.INSTANCE.saveImageAsJPEG(fileName, image);
					} else if (fileType == SWT.IMAGE_PNG) {
						EImagesUtilities.INSTANCE.saveImageAsPNG(fileName, image);
					}

					Logger.INSTANCE.log(Activator.ID, this, "Sucessfully saved image to file <" + fileName + ">.",
							EventSeverity.OK);
					Status status = new Status(IStatus.OK, Activator.ID,
							"Sucessfully saved image to file <" + fileName + ">.");
					return status;
				} catch (Exception e) {
					String message = "Failed to save the image to file <" + fileName
							+ ">. The following exception was thrown : \n\n " + e.getMessage();

					Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.OK, e);
					Status status = new Status(IStatus.ERROR, Activator.ID, message, e);
					return status;
				}
			}
		};
		job.schedule();
	}
}