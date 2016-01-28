package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.composites;

import java.io.File;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingPackage;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.RectifiedImageSnapshot;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.Activator;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraImageAnnotation;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraTool;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.DrawnCameraOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageCameraOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.OverlayAlignment;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ToolTipTextProvider;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.listeners.CameraViewConfigurationListener;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ImageAlignment;
import ca.gc.asc_csa.apogy.common.images.ui.composites.ImageDisplayComposite;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

public class CameraViewConfigurationComposite extends Composite 
{
	public static final int DEFAULT_IMAGE_WIDTH = 640;
	public static final int DEFAULT_IMAGE_HEIGHT = 480;
	
	private CameraViewConfigurationListener cameraViewConfigurationListener = null;
	private Adapter cameraAdapter;
	
	// private Adapter cameraViewConfigurationAdapter;
	
	protected CameraViewConfiguration cameraViewConfiguration;
	protected AbstractCamera camera = null;
	
	private boolean displayRectifiedImage = false;
			
		
	private ScrolledComposite scrolledComposite = null;
	private ImageDisplayComposite imageDisplayComposite = null;
	
	private ImageSnapshot lastImageSnapshot = null;
	
	private MouseListener mouseListener;
	private MouseMoveListener mouseMoveListener;
	private int mouseButton = 0;
	
	private boolean busy = false;
	
	public CameraViewConfigurationComposite(Composite parent, int style) 
	{
		super(parent, style);	
		setLayout(new FillLayout(SWT.HORIZONTAL));
				
		scrolledComposite = new ScrolledComposite(this, SWT.H_SCROLL | SWT.V_SCROLL);		
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		imageDisplayComposite = new ImageDisplayComposite(scrolledComposite, SWT.BORDER);
		GridData gridData = new GridData(SWT.CENTER, SWT.CENTER, false, false);
		imageDisplayComposite.setLayoutData(gridData);	
		
		// Register listeners to the mouse.
		imageDisplayComposite.addImageMouseListener(getMouseListener());
		imageDisplayComposite.addImageMouseMoveListener(getMouseMoveListener());
		
		scrolledComposite.setContent(imageDisplayComposite);	
		
		imageDisplayComposite.setSize(getImageSize());
		scrolledComposite.setMinSize(getImageSize());
		
		imageDisplayComposite.setImageData(EImagesUtilities.INSTANCE.convertToImageData(getNoDataImage().asBufferedImage()));
		imageDisplayComposite.setImageData(EImagesUtilities.INSTANCE.convertToImageData(getNoDataImage().asBufferedImage()));
		imageDisplayComposite.fitImage();
		
		this.addPaintListener(new PaintListener() 
		{			
			@Override
			public void paintControl(PaintEvent e) 
			{			
//				imageDisplayComposite.setSize(getImageSize());
//				scrolledComposite.setMinSize(getImageSize());
//				imageDisplayComposite.fitImage();
			}
		});
		
		setDisplaySize(DEFAULT_IMAGE_WIDTH, DEFAULT_IMAGE_HEIGHT);
				
//		imageDisplayComposite.addImageMouseMoveListener(new MouseMoveListener() 
//		{		
//			@Override
//			public void mouseMove(MouseEvent e) 
//			{										
//				imageDisplayComposite.getToolTip().setText(e.x + " , " + e.y);								
//			}
//		});					
		
		Cursor cursor = new Cursor(getDisplay(), SWT.CURSOR_CROSS);	
		imageDisplayComposite.setCursor(cursor);
	}

	
	
	public boolean isDisplayRectifiedImage() 
	{
		return displayRectifiedImage;
	}

	public void setDisplayRectifiedImage(boolean displayRectifiedImage) 
	{
		this.displayRectifiedImage = displayRectifiedImage;
		forceImageUpdate();
	}
	
	public CameraViewConfiguration getCameraViewConfiguration() 
	{
		return cameraViewConfiguration;
	}

	public void setCameraViewConfiguration(CameraViewConfiguration newCameraViewConfiguration) 
	{		
		if(this.cameraViewConfiguration != null)
		{
			disposeOfAnnotations();		
		}
		
		this.cameraViewConfiguration = newCameraViewConfiguration;
		
		getCameraViewConfigurationListener().setCameraViewConfiguration(newCameraViewConfiguration);		
				
		if(newCameraViewConfiguration != null)
		{					
			setCamera(newCameraViewConfiguration.getCamera());	
			
			setDisplaySize(newCameraViewConfiguration.getImageWidth(), newCameraViewConfiguration.getImageHeight());
			setDisplayRectifiedImage(newCameraViewConfiguration.isDisplayRectifiedImage());
		}
	}	
	
	protected AbstractCamera getCamera() 
	{
		return camera;
	}

	protected void setCamera(AbstractCamera newCamera) 
	{
		// Unregister adapter to previous camera if applicable.
		if(this.camera!= null)
		{
			camera.eAdapters().remove(getCameraAdapter());								
		}
		
		this.camera = newCamera;
		
		// Updates camera tools.
		updateToolsCamera(newCamera);
		
		// Unregister adapter to previous camera if applicable.
		if(newCamera != null)
		{
			newCamera.eAdapters().add(getCameraAdapter());
			updateImageSnapshot(newCamera.getLatestImageSnapshot());			
		}
	}

	@Override
	public void dispose() 
	{
		if(getCameraViewConfiguration() != null)
		{
			disposeOfAnnotations();		
		}
				
		setCameraViewConfiguration(null);
		super.dispose();
	}
	
	protected void disposeOfAnnotations()
	{
		// Dispose of all Overlays.
		disposeOfOverlays();
					
		// Dispose of all Filters.
		disposeOfFilters();
					
		// Dispose of all tools.
		disposeOfCameraTools();	
	}
	
	protected void forceImageUpdate()
	{
		updateImageSnapshot(lastImageSnapshot);
	}
	
	protected void updateImageSnapshot(ImageSnapshot newImageSnapshot)
	{
		// If not busy processing the previous image.
		if(!busy)		
		{		
			try
			{
				// Gets the camera image.
				AbstractEImage cameraImage = null;
				
				if(newImageSnapshot != null)
				{
					busy = true;
					
					// Updates image count.
					if(newImageSnapshot != lastImageSnapshot)
					{
						getCameraViewConfiguration().setImageCount(getCameraViewConfiguration().getImageCount() + 1);
					}
					
					if(isDisplayRectifiedImage() && newImageSnapshot instanceof RectifiedImageSnapshot)
					{
						RectifiedImageSnapshot rectifiedImageSnapshot = (RectifiedImageSnapshot) newImageSnapshot;
						cameraImage = rectifiedImageSnapshot.getRectifiedImage();
					}
					else
					{
						cameraImage = newImageSnapshot.getImage();
					}
				}
				
				// If no camera image is available, used no data image.
				if(cameraImage == null)
				{
					cameraImage = getNoDataImage();
				}	
				else
				{
					cameraImage = applyFilters(cameraImage);
				}
				
				// Updates tools.
				updateToolsImageSnapshot(newImageSnapshot);
				
				// Resize the camera image to match the display size.
				Point imageSize = getImageSize();
				AbstractEImage resizedCameraImage = EImagesUtilities.INSTANCE.resize(cameraImage, imageSize.x, imageSize.y);
				
				// Applies overlays.
				AbstractEImage displayedImage = applyOverlays(resizedCameraImage);
								
				// Displays the image.
				updateDisplayedImage(displayedImage);
				
				// Save images if required.
				if(newImageSnapshot != lastImageSnapshot)
				{
					saveImages(resizedCameraImage, displayedImage);
				}
				
				lastImageSnapshot = newImageSnapshot;
			}
			catch(Throwable t)
			{
				t.printStackTrace();
				busy = false;
			}
		}
		else
		{			
			if(cameraViewConfiguration != null)
			{
				// Logger.INSTANCE.log(Activator.ID, this, "View <" + cameraViewConfiguration.getName() +"> busy skipping image update!", EventSeverity.WARNING);
			}
		}
	}
	
	protected void saveImages(final AbstractEImage rawImage, final AbstractEImage displayedImage)
	{
		if(getCameraViewConfiguration() != null)
		{
			if(getCameraViewConfiguration().isImageAutoSaveEnable())
			{
				AbstractEImage imageToSave = null;
				
				if(getCameraViewConfiguration().isSaveImageWithOverlays())
				{
					imageToSave = displayedImage;
				}
				else
				{
					imageToSave = rawImage;
				}
				
				if(imageToSave != null)
				{
					final int imageCount = getCameraViewConfiguration().getImageCount();
					final AbstractEImage image  = imageToSave;
					Job job = new Job("Save Image")
					{
						@Override
						protected IStatus run(IProgressMonitor monitor) 
						{
							// Creates image file name.
							String fileName = getCameraViewConfiguration().getName().replaceAll(" ", "_") + "_" + Integer.toString(imageCount) + ".png";
							String filePath = getCameraViewConfiguration().getImageAutoSaveFolderPath() + File.separator + fileName;
							
							try
							{
								// Saves image.
								EImagesUtilities.INSTANCE.saveImageAsPNG(filePath, image);
							
								return Status.OK_STATUS;
							}
							catch(Throwable t)
							{
								Logger.INSTANCE.log(Activator.ID, this, "Failed to save image to <" + filePath + "> !", EventSeverity.ERROR, t);
								return Status.OK_STATUS;
							}
						}
					};
					job.schedule();
				}
			}
		}
	}
	
	protected AbstractEImage applyFilters(final AbstractEImage cameraImage)
	{
		AbstractEImage filteredImage = EImagesUtilities.INSTANCE.copy(cameraImage);
		
		if(getCameraViewConfiguration() != null)
		{
			for(ImageFilter filter : getCameraViewConfiguration().getFilterList().getImageFilters())
			{
				if(filter.isEnabled())
				{
					filteredImage = filter.filter(getCameraViewConfiguration().getCamera(), filteredImage);
				}
			}
		}
		
		return filteredImage;
	}
	
	protected AbstractEImage applyOverlays(AbstractEImage cameraImage)
	{
		AbstractEImage displayedImage = null;
		
		if(getCameraViewConfiguration() != null)
		{
			AbstractCamera camera = getCameraViewConfiguration().getCamera();			
			displayedImage = EImagesUtilities.INSTANCE.copy(cameraImage);
			
			if(camera != null)
			{			
				for(CameraOverlay cameraOverlay : getCameraViewConfiguration().getOverlayList().getOverlays())
				{							
					try
					{
						// Process only overlay that are visible.
						if(cameraOverlay.isVisible())
						{						
							int overlayWidth = getCameraViewConfiguration().getImageWidth();
							int overlayHeight = getCameraViewConfiguration().getImageHeight();
								
							OverlayAlignment overlayAlignment = cameraOverlay.getOverlayAlignment();
							
							if(cameraOverlay instanceof DrawnCameraOverlay)
							{
								DrawnCameraOverlay drawnCameraOverlay = (DrawnCameraOverlay) cameraOverlay;
																						
								// Applies the overlay.
								displayedImage = drawnCameraOverlay.applyOverlay(camera, displayedImage, overlayAlignment, overlayWidth, overlayHeight);							
							}
							else if(cameraOverlay instanceof ImageCameraOverlay)
							{
								if(cameraOverlay.getOverlayAlignment() != OverlayAlignment.CENTER)
								{
									overlayWidth = (int) Math.floor((getCameraViewConfiguration().getImageWidth() * 0.5f));
									overlayHeight = (int) Math.floor((getCameraViewConfiguration().getImageHeight() * 0.5f));
								}
								
								ImageCameraOverlay imageCameraOverlay = (ImageCameraOverlay) cameraOverlay;
								
								// Gets the overlay image.
								AbstractEImage overlayImage = imageCameraOverlay.getOverlay(camera, overlayAlignment, overlayWidth, overlayHeight);
								
								// Applies overlay image onto camera image.
								ImageAlignment alignment = ImageAlignment.CENTER;
								switch (cameraOverlay.getOverlayAlignment().getValue()) 
								{
									case OverlayAlignment.LOWER_LEFT_CORNER_VALUE:
										alignment = ImageAlignment.LOWER_LEFT_CORNER;
									break;
									
									case OverlayAlignment.LOWER_RIGHT_CORNER_VALUE:
										alignment = ImageAlignment.LOWER_RIGHT_CORNER;
									break;
									
									case OverlayAlignment.UPPER_LEFT_CORNER_VALUE:
										alignment = ImageAlignment.UPPER_LEFT_CORNER;
									break;
										
									case OverlayAlignment.UPPER_RIGHT_CORNER_VALUE:
										alignment = ImageAlignment.UPPER_RIGHT_CORNER;
									break;
									
									default:
										alignment = ImageAlignment.CENTER;
									break;
								}
								
								displayedImage = EImagesUtilities.INSTANCE.superPoseImages(displayedImage, overlayImage, false, alignment);							
							}
						}
					}
					catch (Throwable t) 
					{
						Logger.INSTANCE.log(Activator.ID, this, "Error while applying overlay <" + cameraOverlay + ">!", EventSeverity.ERROR, t);
					}
				}
			}
		}
		else
		{
			displayedImage = cameraImage;
		}
		
		return displayedImage;
	}
	
	protected void updateDisplayedImage(final AbstractEImage newImage)
	{
		if((imageDisplayComposite != null) && !imageDisplayComposite.isDisposed())
		{
			if(newImage != null)
			{
				final ImageData imgData = EImagesUtilities.INSTANCE.convertToImageData(newImage.asBufferedImage());
				
				getDisplay().asyncExec(new Runnable() 
				{					
					@Override
					public void run() 
					{					
						try
						{
							if(newImage.asBufferedImage() != null)
							{							
								imageDisplayComposite.setImageData(imgData);	
								imageDisplayComposite.fitImage();							
							}
							else
							{								
							}						
							busy = false;
						}
						catch(Throwable t)
						{
							busy = false;
						}
					}
				});				
			}
		}
	}	
	
	protected void setDisplaySize(final int width, final int height)
	{
		if(imageDisplayComposite != null && !imageDisplayComposite.isDisposed())
		{
			getDisplay().asyncExec(new Runnable() 
			{			
				@Override
				public void run() 
				{											
					imageDisplayComposite.setSize(width, height);
					scrolledComposite.setMinSize(width, height);
					imageDisplayComposite.fitImage();				
				}
			});		
		}
	}
	
	protected Adapter getCameraAdapter()
	{
		if(cameraAdapter == null)
		{
			cameraAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{				
					if(msg.getFeatureID(AbstractCamera.class) == ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT)
					{															
						ImageSnapshot newImageSnapshot = (ImageSnapshot) msg.getNewValue();
						updateImageSnapshot(newImageSnapshot);												
					}
				}
			};
		}
		
		return cameraAdapter;
	}
	
	protected void updateToolsImageSnapshot(final ImageSnapshot imageSnapshot)
	{
		if(getCameraViewConfiguration() != null)
		{
			for(CameraTool cameraTool : getCameraViewConfiguration().getToolList().getTools())
			{
				try
				{
					cameraTool.updateImageSnapshot(imageSnapshot);
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}
		}
	}
	
	protected void updateToolsCamera(final AbstractCamera newCamera)
	{
		if(getCameraViewConfiguration() != null)
		{
			for(CameraTool cameraTool : getCameraViewConfiguration().getToolList().getTools())
			{
				try
				{
					cameraTool.initializeCamera(newCamera);
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}	
		}
	}
	
	protected void disposeOfOverlays()
	{
		if(getCameraViewConfiguration() != null)
		{
			for(CameraOverlay cameraOverlay : getCameraViewConfiguration().getOverlayList().getOverlays())
			{
				try
				{
					cameraOverlay.dispose();
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}	
		}
	}
	
	protected void disposeOfFilters()
	{
		if( getCameraViewConfiguration() != null)
		{
			for(ImageFilter imageFilter : getCameraViewConfiguration().getFilterList().getImageFilters())
			{
				try
				{
					imageFilter.dispose();
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}	
		}
	}
	
	protected void disposeOfCameraTools()
	{
		if(getCameraViewConfiguration() != null)
		{
			for(CameraTool cameraTool : getCameraViewConfiguration().getToolList().getTools())
			{
				try
				{
					cameraTool.dispose();
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}	
		}
	}
	
	protected Point getImageSize()
	{
		int width = 0;
		int height = 0;
		
		if(getCameraViewConfiguration() != null)
		{
			width = getCameraViewConfiguration().getImageWidth();
			height = getCameraViewConfiguration().getImageHeight();
		}
		else
		{
			width = DEFAULT_IMAGE_WIDTH;
			height = DEFAULT_IMAGE_HEIGHT;
		}
		
		return new Point(width, height);
	}
	
	protected AbstractEImage getNoDataImage()
	{		
		Point size = getImageSize();
		
		AbstractEImage image = EImagesUtilities.INSTANCE.createUniformColorImage(size.x, size.y, 0, 0, 0, 255);
		
		return image;
	}
			
	protected CameraViewConfigurationListener getCameraViewConfigurationListener() 
	{
		if(cameraViewConfigurationListener == null)
		{
			cameraViewConfigurationListener = new CameraViewConfigurationListener(null)
			{
				@Override
				protected void cameraChanged(AbstractCamera newCamera) 
				{				
					setCamera(newCamera);
				}
				
				@Override
				protected void displayRectifiedChanged(boolean newRectified) 
				{
					setDisplayRectifiedImage(newRectified);
				}
				
				@Override
				protected void imageSizeChanged(int newImageWidth, int newImageHeigh) 
				{
					setDisplaySize(newImageWidth, newImageHeigh);
				}
				
				@Override
				protected void imageFiltersChanged() 
				{
					forceImageUpdate();
				}
				
				@Override
				protected void overlaysChanged() 
				{
					forceImageUpdate();
				}
			};
		}
		return cameraViewConfigurationListener;
	}	
	
	protected MouseListener getMouseListener() 
	{
		if(mouseListener == null)
		{
			mouseListener = new MouseListener() 
			{		
				@Override
				public void mouseUp(MouseEvent e) 
				{			
					mouseButton = 0;
				}
				
				@Override
				public void mouseDown(MouseEvent e) 
				{					
					if(getCamera() != null)
					{
						// Updates mouseButton
						mouseButton = e.button;
						
						Point point = convertToCurrentImageCoordinates(e);	
						
						AbstractEImage cameraImage = null;
						if(getCamera().getLatestImageSnapshot() != null)
						{
							cameraImage = getCamera().getLatestImageSnapshot().getImage();	
						}
							
						// Sends the event to all active tools.
						for(CameraTool cameraTool : getCameraViewConfiguration().getToolList().getTools())
						{
							if(cameraTool.isVisible())
							{
								try
								{
									cameraTool.positionSelected(cameraImage, mouseButton, point.x, point.y);									
								}
								catch(Throwable t)
								{
									t.printStackTrace();
								}
							}
						}
									
						// Gets the tool tip text
						String toolTipText = getToolTipText(getCamera(), lastImageSnapshot, mouseButton, point.x, point.y);
												
						// Set the toolTipText.
						imageDisplayComposite.getToolTip().setText(toolTipText);
					}					
				}
				
				@Override
				public void mouseDoubleClick(MouseEvent e) 
				{
					// Updates mouseButton
					mouseButton = e.button;
				}
			};
		}
		return mouseListener;
	}

	protected MouseMoveListener getMouseMoveListener() 
	{
		if(mouseMoveListener == null)
		{
			mouseMoveListener = new MouseMoveListener() 
			{			
				@Override
				public void mouseMove(MouseEvent e) 
				{
					if(getCamera() != null)
					{
						Point point = convertToCurrentImageCoordinates(e);												
						
						AbstractEImage cameraImage = null;
						if(getCamera().getLatestImageSnapshot() != null)
						{
							cameraImage = getCamera().getLatestImageSnapshot().getImage();	
						}
									
						// Sends the event to all active tools.
						for(CameraTool cameraTool : getCameraViewConfiguration().getToolList().getTools())
						{
							if(cameraTool.isVisible())
							{
								try
								{
									cameraTool.mouseMoved(cameraImage, mouseButton, point.x, point.y);
								}
								catch(Throwable t)
								{
									t.printStackTrace();
								}
							}
						}
						
						// Gets the tool tip text
						String toolTipText = getToolTipText(getCamera(), lastImageSnapshot, mouseButton, point.x, point.y);
												
						// Set the toolTipText.
						imageDisplayComposite.getToolTip().setText(toolTipText);
					}
				}
			};
		}
		return mouseMoveListener;
	}			
	
	protected String getToolTipText(AbstractCamera camera, ImageSnapshot imageSnapshot, int mouseButton, int x, int y)
	{
		// Gets the tool tip text
		String toolTipText = null;
		
		List<CameraImageAnnotation> annotations = getCameraViewConfiguration().getCameraImageAnnotations();
		for(CameraImageAnnotation annotation : annotations)
		{
			if(annotation.isVisible())
			{
				if(annotation instanceof ToolTipTextProvider)
				{
					ToolTipTextProvider toolTipTextProvider = (ToolTipTextProvider) annotation;
					String annotationToolTipText = toolTipTextProvider.getToolTipText(getCamera(), lastImageSnapshot, mouseButton, x,y);
					
					if(annotationToolTipText != null) 
					{
						String prefix = new String();
						if(annotation.getName() != null)
						{
							prefix = annotation.getName() + " : ";
						}
						else
						{
							prefix = "? : ";
						}
						
						if(toolTipText != null)
						{
							toolTipText += "\n" + prefix + annotationToolTipText;
						}
						else
						{
							toolTipText = new String();
							toolTipText += prefix + annotationToolTipText;
						}
					}
				}
			}
		}
			
		return toolTipText;
	}
	
	protected Point convertToCurrentImageCoordinates(MouseEvent e)
	{
		Point point = imageDisplayComposite.convertMouseEventPositionToImagePosition(e);
		Point currentImageSize = getImageSize();
		
		int x = point.x;
		int y = point.y;
		
		if(lastImageSnapshot != null && lastImageSnapshot.getImage() != null)
		{
			// Scale to original image.
			x = (int) Math.round(((double) point.x / (double) currentImageSize.x) * lastImageSnapshot.getImage().getWidth());
			y = (int) Math.round(((double) point.y / (double) currentImageSize.y) * lastImageSnapshot.getImage().getHeight());	
		}						
		
		return new Point(x,y);
	}	
}
