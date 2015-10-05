package org.eclipse.symphony.common.images.ui.views;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.images.ui.composites.SWTImageCanvas;
import org.eclipse.ui.progress.UIJob;

import ca.gc.asc_csa.eclipse.ui.views.AbstractView;

public class ImageView extends AbstractView {

	public final static String ID = "org.eclipse.symphony.common.images.ui.ImageView";
	public final static String NAME = "Image View"; 
	private SWTImageCanvas imageCanvas;
	private AbstractEImage abstractEImage;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		imageCanvas = new SWTImageCanvas(parent, SWT.NONE);	
	}
	
	public SWTImageCanvas getCanvas(){
		return imageCanvas;
	}
	
	@Override
	public void dispose() {
		imageCanvas.dispose();
		super.dispose();		
	}
	
	@Override
	public void updatePartName() {
	}
	
	/**
	 * Called when we must grab focus.
	 * @see org.eclipse.ui.part.ViewPart#setFocus
	 */
	public void setFocus() {
		imageCanvas.setFocus();
	}
	
	@Override
	public void updateSelection(ISelection selection) {

		List<?> images = ca.gc.asc_csa.eclipse.converters.Activator.convert(selection, AbstractEImage.class);
		if(!images.isEmpty())
		{
			abstractEImage = (AbstractEImage) images.get(0);			
			String height = Integer.toString(abstractEImage.getHeight());
			String width = Integer.toString(abstractEImage.getWidth());
			this.setPartName(NAME + " (" + width + " w x " + height + " h)");						

			new UIJob("Update Image View") 
			{				
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) 
				{
					if(abstractEImage != null && abstractEImage.asBufferedImage() != null)
					{
						ImageData imageData = EImagesUtilities.INSTANCE.convertToImageData(abstractEImage.asBufferedImage());
						if (imageData != null){
							imageCanvas.setImageData(imageData);
						}
					}
					return Status.OK_STATUS;
				}				
			}.schedule();
		}
	}
}