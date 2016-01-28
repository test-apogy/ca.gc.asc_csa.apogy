package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.composites;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingPackage;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.RectifiedImageSnapshot;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ui.ImageProvider;
import ca.gc.asc_csa.apogy.common.images.ui.composites.ImageDisplayComposite;

public class CameraImageComposite extends Composite implements ImageProvider
{
	private AbstractCamera camera = null;
	private Adapter abstractCameraAdapter = null;
	private boolean displayRectifiedImage = true;
	
	private ImageDisplayComposite imageDisplayComposite = null;
	private Button showRectifiedButton = null;
	
	private ImageSnapshot imageSnapshot = null;
	private AbstractEImage abstractEImage = null;

	public CameraImageComposite(Composite parent, int style) 
	{
		super(parent, style);
		setLayout(new GridLayout(1, true));
						
		showRectifiedButton = new Button(this, SWT.CHECK);
		GridData gridData1 = new GridData(SWT.CENTER, SWT.CENTER, false, false);
		showRectifiedButton.setLayoutData(gridData1);
		showRectifiedButton.setText("Show Rectified Image");
		showRectifiedButton.setToolTipText("Show Rectified Image if available.");
		showRectifiedButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{			
				setDisplayRectifiedImage(showRectifiedButton.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{				
				// Nothing to do.
			}
		});
				
		imageDisplayComposite = new ImageDisplayComposite(this, SWT.BORDER);
		GridData gridData2 = new GridData(SWT.FILL, SWT.FILL, true, true);
		imageDisplayComposite.setLayoutData(gridData2);
		
		setDisplayRectifiedImage(showRectifiedButton.getSelection());
	}

	public AbstractCamera getCamera() 
	{
		return camera;
	}

	@Override
	public AbstractEImage getImage() 
	{		
		return abstractEImage;
	}	
	
	public void setCamera(AbstractCamera newCamera) 
	{
		// UnRegister adapter from previous camera.
		if(this.camera != null)
		{
			this.camera.eAdapters().remove(getAbstractCameraAdapter());
		}
		
		this.camera = newCamera;
		
		if(newCamera != null)
		{
			// Gets the  latest image of the new camera.
			if(getCamera().getLatestImageSnapshot() != null)
			{
				imageSnapshot = getCamera().getLatestImageSnapshot();
				updateDisplayedImage(getCamera().getLatestImageSnapshot().getImage());
			}
			
			// Register adapter to new camera.
			newCamera.eAdapters().add(getAbstractCameraAdapter());
		}
	}
	
	public boolean isDisplayRectifiedImage() 
	{
		return displayRectifiedImage;
	}

	public void setDisplayRectifiedImage(boolean displayRectifiedImage) 
	{
		this.displayRectifiedImage = displayRectifiedImage;
		
		if(displayRectifiedImage)
		{
			if(imageSnapshot instanceof RectifiedImageSnapshot)
			{
				RectifiedImageSnapshot rectifiedImageSnapshot = (RectifiedImageSnapshot) imageSnapshot;
				updateDisplayedImage(rectifiedImageSnapshot.getRectifiedImage());				
				abstractEImage = rectifiedImageSnapshot.getRectifiedImage();
			}			
		}
		else
		{
			if(imageSnapshot instanceof ImageSnapshot)
			{
				updateDisplayedImage(imageSnapshot.getImage());
				abstractEImage = imageSnapshot.getImage();
			}
		}
	}

	protected void updateDisplayedImage(final AbstractEImage newImage)
	{
		// Updates current image.
		abstractEImage = newImage;
		
		if((imageDisplayComposite != null) && !imageDisplayComposite.isDisposed())
		{
			if(newImage != null)
			{
				getDisplay().asyncExec(new Runnable() {
					
					@Override
					public void run() 
					{					
						if(newImage.asBufferedImage() != null)
						{
							ImageData imageData = EImagesUtilities.INSTANCE.convertToImageData(newImage.asBufferedImage());
							imageDisplayComposite.setImageData(imageData);								
						}
						else
						{
							// TODO
						}
					}
				});				
			}
		}
	}	

	protected Adapter getAbstractCameraAdapter()
	{
		if(abstractCameraAdapter == null)
		{
			abstractCameraAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getFeatureID(AbstractCamera.class) == ApogyAddonsSensorsImagingPackage.ABSTRACT_CAMERA__LATEST_IMAGE_SNAPSHOT)
					{
						
						if(isDisplayRectifiedImage() && msg.getNewValue() instanceof RectifiedImageSnapshot)
						{
							RectifiedImageSnapshot rectifiedImageSnapshot = (RectifiedImageSnapshot) msg.getNewValue();
							updateDisplayedImage(rectifiedImageSnapshot.getRectifiedImage());
							imageSnapshot = rectifiedImageSnapshot;
						}
						else if(msg.getNewValue() instanceof ImageSnapshot)
						{
							ImageSnapshot newImageSnapshot = (ImageSnapshot) msg.getNewValue();
							updateDisplayedImage(newImageSnapshot.getImage());
							imageSnapshot = newImageSnapshot;
						}
						else
						{							
							updateDisplayedImage(null);
							imageSnapshot = null;
						}
					}
				}
			};
		}
		
		return abstractCameraAdapter;
	}


}
