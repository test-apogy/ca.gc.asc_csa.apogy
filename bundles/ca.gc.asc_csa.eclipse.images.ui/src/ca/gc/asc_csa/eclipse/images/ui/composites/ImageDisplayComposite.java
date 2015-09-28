package ca.gc.asc_csa.eclipse.images.ui.composites;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.window.DefaultToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.progress.UIJob;

import ca.gc.asc_csa.eclipse.images.ui.Activator;

public class ImageDisplayComposite extends Composite 
{	
	private ImageData originalImageData = null;
	private ImageData displayedImageData = null;
	
	private double zoomFactor = 1.0;	
	private boolean areaSelectionEnabled = false;
	private AreaSelector areaSelector = null;
	private String currentDir = System.getProperty("user.dir");

	private ScrolledComposite scrolledComposite = null;
	private Label imageLabel = null;
	
	private DefaultToolTip toolTip = null;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ImageDisplayComposite(Composite parent, int style) 
	{
		super(parent, SWT.NONE);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		scrolledComposite = new ScrolledComposite(this, SWT.H_SCROLL | SWT.V_SCROLL);	
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		imageLabel = new Label(scrolledComposite, SWT.BORDER | SWT.CENTER);
		imageLabel.setAlignment(SWT.CENTER);
		scrolledComposite.setContent(imageLabel);		
		areaSelector =  new AreaSelector(this, this.imageLabel);	
		
		// Disable the area selection initially.
		setAreaSelectionEnabled(false);
		
		// Create toolTip
		toolTip = new DefaultToolTip(imageLabel);
		toolTip.setHideOnMouseDown(false);
		toolTip.setRespectDisplayBounds(true);
		toolTip.setRespectMonitorBounds(true);
		toolTip.setPopupDelay(0);
		toolTip.setHideDelay(0);
		toolTip.setShift(new Point(10,10));
	}
	
	/**
	 * Returns the ImageData to be displayed.
	 * @return The ImageData.
	 */
	public ImageData getImageData() {
		return originalImageData;
	}

	/**
	 * Sets the ImageData to be displayed.
	 * @param imgData The ImageData.
	 */
	public void setImageData(ImageData imgData) 
	{
		this.originalImageData = imgData;
		fitImage();		
	}	

	/**
	 * Return whether or not the he area selection of the image is enabled.
	 * @return True if area selection of the image is enabled, false otherwise.
	 */
	public boolean isAreaSelectionEnabled() {
		return areaSelectionEnabled;
	}

	/**
	 * Not used currently. Enables / disables the area selection of the image.
	 * @param areaSelectionEnabled
	 */
	public void setAreaSelectionEnabled(boolean areaSelectionEnabled) 
	{		
		this.areaSelectionEnabled = areaSelectionEnabled;
		if(areaSelector != null) areaSelector.setEnabled(areaSelectionEnabled);
	}

	/**
	 * Return the image data currently displayed.
	 * @return
	 */
	public ImageData getDisplayedImageData() {
		return displayedImageData;
	}
	
	/**
	 * Returns the current zoom factor.
	 * @return The zoom factor.
	 */
	public double getZoomFactor() {
		return zoomFactor;
	}

	/**
	 * Sets the zoom factor of the image displayed.
	 * @param zoomFactor The zoom factor. A zoom factor of -1 will make the image fit the size of the composite.
	 */
	public void setZoomFactor(double zoomFactor) 
	{		
		if(isDisposed()) return;
		
		ImageData newImage = zoomImage(getImageData(), zoomFactor);
		if(newImage != null)
		{
			updateImageLabel(newImage);
		}
	}

	/**
	 * Updates the Image Label image with the specified ImageData.
	 * @param imageData The image data to display.
	 */
	private void updateImageLabel(ImageData imageData)
	{
		if(isDisposed()) return;
		
		if(imageData != null)
		{
			// Makes a copy of the original and sets it to the displayed value.
			displayedImageData = (ImageData) imageData.clone();
			
			Image image = new Image(this.getDisplay(), getDisplayedImageData());
			
			if ( imageLabel.getImage() != null )
				imageLabel.getImage().dispose();
			
			imageLabel.setImage(image);			
			
			Point size = imageLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT);
			scrolledComposite.setMinSize(size);	
		}
	}
	
	/**
	 * Fits the image to the current display.
	 */
	public void fitImage()
	{				
		if(isDisposed()) return;
		@SuppressWarnings("unused")
		ImageData orig = getImageData();		
		updateImageLabel(zoomImage(getImageData(), -1));
	}
	
	/**
	 * Allows the user to save the current image to a file.
	 */
	public void saveImageToFile()
	{
		if(isDisposed()) return;
		FileDialog fileChooser = new FileDialog(getShell(), SWT.OPEN);
		fileChooser.setText("Open image file");
		fileChooser.setFilterPath(currentDir);
		fileChooser.setFilterExtensions(new String[] { "*.gif;*.jpg;*.png;*.bmp;*.ico;"});		
		String filename = fileChooser.open();
		if (filename != null)
		{			
			try
			{				
				if(filename.endsWith(".gif"))
				{
					saveImageInJob(filename, SWT.IMAGE_GIF);
				}
				else if(filename.endsWith(".jpg"))
				{
					saveImageInJob(filename, SWT.IMAGE_JPEG);					
				}
				else if(filename.endsWith(".png"))
				{
					saveImageInJob(filename, SWT.IMAGE_PNG);
				}
				else if(filename.endsWith(".bmp"))
				{
					saveImageInJob(filename, SWT.IMAGE_BMP);
				}
				else if(filename.endsWith(".ico"))
				{
					saveImageInJob(filename, SWT.IMAGE_ICO);
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
					
					MessageBox messageBox = new MessageBox(getShell(), SWT.ICON_ERROR | SWT.OK);					
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
	private void saveImageInJob(final String fileName, final int fileType)
	{
		final ImageDisplayComposite composite = this;
		if(isDisposed()) return;
		
		UIJob job = new UIJob("Save Image to file <" + fileName + ">")
		{
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) 
			{				
				try
				{
					ImageLoader imageLoader = new ImageLoader();
					
					if(!composite.isDisposed()) imageLoader.data = new ImageData[] {getImageData()};					
					if(!composite.isDisposed()) imageLoader.save(fileName, fileType);				
														
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
	
	/**
	 * Not used currently. Zoom in the specified region.
	 * @param region The specified region of the currently displayed image.
	 */
	public void zoomInRegion(Rectangle region) 
	{			
			int x = region.x;
			int y = region.y;
			int w = region.width;
			int h = region.height;
			
			if((w > 0) && (h > 0))
			{
				Image image = imageLabel.getImage();
				Image cropImage = new Image(getShell().getDisplay(), w, h);
		
				if (x + w > image.getBounds().width) {
					w = image.getBounds().width - x;
				}
				if (y + h > image.getBounds().height) {
					h = image.getBounds().height - y;
				}
		
				GC cropGC = new GC(cropImage);
				cropGC.drawImage(image, x, y, w, h, 0, 0, w, h);
				cropGC.dispose();
		
				ImageData cropImageData = cropImage.getImageData();
				cropImage.dispose();
				
				// ImageData newImage = zoomImage(cropImageData, -1);
				updateImageLabel(cropImageData);									
			}
	}
	
	/**
	 * Creates a zoomed version of the specified image.
	 * @param imageData The specified image.
	 * @param zoomFactor The zoom factor. Specifying -1 scale the image to fit on the image label.
	 * @return The zoomed image, or null if imageData was null.
	 */
	private ImageData zoomImage(final ImageData imageData, double zoomFactor)
	{
		if(isDisposed()) return null;
		
		if(imageData != null)
		{
			if(zoomFactor == -1.0)
			{									
				int compositeWidth  = getSize().x - imageLabel.getBorderWidth();
				int compositeHeight = getSize().y - imageLabel.getBorderWidth() - 10;
				
				if ( compositeWidth < 0 ) compositeWidth = 0;
				if ( compositeHeight < 0 ) compositeHeight = 0;
				
				int imageWidth = getImageData().width;
				int imageHeight = getImageData().height;
				
				double widthFactor = ((double) imageWidth) / compositeWidth;
				double heightFactor = ((double) imageHeight) / compositeHeight;
				
				if(widthFactor > heightFactor)
				{
					this.zoomFactor = 1.0 / widthFactor;
				}
				else
				{
					this.zoomFactor = 1.0 / heightFactor;
				}				
			}
			else
			{
				this.zoomFactor = zoomFactor;							
			}					
			int newWidth = (int) Math.floor(getImageData().width * this.zoomFactor);
			int newHeight = (int) Math.floor(getImageData().height * this.zoomFactor);

			if ( newWidth <= 0 )
				newWidth = 1;
			
			if ( newHeight <= 0 )
				newHeight = 1;				
			
			return imageData.scaledTo(newWidth, newHeight);	
		}
		else
		{
			return null;
		}		
	}
	
	public void addImageMouseListener(MouseListener mouseListener)
	{
		getImageLabel().addMouseListener(mouseListener);
	}
	
	public void removeImageMouseListener(MouseListener mouseListener)
	{
		getImageLabel().removeMouseListener(mouseListener);
	}
	
	public void addImageMouseMoveListener(MouseMoveListener mouseMoveListener)
	{
		getImageLabel().addMouseMoveListener(mouseMoveListener);
	}
	
	public void removeImageMouseMoveListener(MouseMoveListener mouseMoveListener)
	{
		getImageLabel().removeMouseMoveListener(mouseMoveListener);
	}
	
	public Point convertMouseEventPositionToImagePosition(MouseEvent e)
	{			
		Rectangle rect = getImageLabel().getBounds();
		
		if(getImageLabel().getImage() != null && (originalImageData != null))
		{
			ImageData imgData =  getImageLabel().getImage().getImageData();
						
			int xOffset = (int) ((rect.width -  imgData.width ) * 0.5);
			int yOffset = (int) ((rect.height - imgData.height) * 0.5);
					
			int x = e.x - xOffset;
			int y = e.y - yOffset;
			
			if(x < 0) x = 0;
			if(x > imgData.width) x = imgData.width;
			
			if(y < 0) y = 0;
			if(y > imgData.height) y = imgData.height;
		
			double hRatio = (double) x / (double) imgData.width;
			double vRatio = (double) y / (double) imgData.height;
			
			int imageX = (int) Math.round(hRatio * originalImageData.width);
			int imageY = (int) Math.round(vRatio * originalImageData.height);
						
			return new Point(imageX, imageY);
		}
		else
		{
			return new Point(0, 0);
		}
	}
	
	public Label getImageLabel() {
		return imageLabel;
	}

	public DefaultToolTip getToolTip() {
		return toolTip;
	}		
}
