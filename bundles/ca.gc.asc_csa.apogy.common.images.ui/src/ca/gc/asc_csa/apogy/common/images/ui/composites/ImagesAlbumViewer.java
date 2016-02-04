package ca.gc.asc_csa.apogy.common.images.ui.composites;
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

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.nebula.jface.galleryviewer.GalleryTreeViewer;
import org.eclipse.nebula.widgets.gallery.DefaultGalleryItemRenderer;
import org.eclipse.nebula.widgets.gallery.NoGroupRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ImagesAlbum;
import ca.gc.asc_csa.apogy.common.images.ui.Activator;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;


public class ImagesAlbumViewer extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private ImagesAlbum album;
	private GalleryTreeViewer galleryTreeViewer;
	private NoGroupRenderer noGroupRenderer;
	
	/**
	 * Image data for the not found image
	 */
	private ImageData noImageData;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ImagesAlbumViewer(Composite parent, int style) {
		super(parent, style);

		initComponents();
		noImageData = null;
	}
	private void initComponents() {
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 0;
		setLayout(gridLayout);

		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		galleryTreeViewer = new GalleryTreeViewer(this, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL);
		galleryTreeViewer.getGallery().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		//The gallery tree viewer must always be used with two level of items. The first level is the group while the second
		//is the image item. To use it like that, the album is passed as a collection for the first level. Afterward, the images
		//are extracted from the album to provide the second level. All of the GalleryItem creation is done by the GalleryTreeViewer
		//itself and is transparent.
		galleryTreeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory){

			@Override
			public Object[] getChildren(Object parentElement) {
				super.getChildren(parentElement);
				if(!(parentElement instanceof ImagesAlbum)) {
					return new Object[0];
				}
				return ((ImagesAlbum)parentElement).getImages().toArray();
			}

			@Override
			public boolean hasChildren(Object element) {
				return (element instanceof ImagesAlbum);
			}
			
			@Override
			public Object[] getElements(Object object) {
				return (Object[]) object;
			}
		});
		
		//The GalleryTreeViewer uses the getImage method from the label provider to display the image on the screen.
		galleryTreeViewer.setLabelProvider(new DecoratingLabelProvider(new AdapterFactoryLabelProvider(adapterFactory), PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator()){
			
			@Override
			public Image getImage(Object element) 
			{
				if(element instanceof AbstractEImage) 
				{
					AbstractEImage image = (AbstractEImage) element;
					
					BufferedImage bufferedImage = image.asBufferedImage();
					ImageData data = null;
					
					if(bufferedImage != null)
					{
						data = EImagesUtilities.INSTANCE.convertToImageData(bufferedImage);
					}
					
					if(data != null)
					{
						data = data.scaledTo(noGroupRenderer.getItemWidth(), noGroupRenderer.getItemHeight());
					}
					else{
						data = getNoImageData();
					}
					
					return  new Image(getDisplay(),data);
				}
				return super.getImage(element);
			}
		});

		//Use a no group renderer to hide the group sections
		noGroupRenderer = new NoGroupRenderer();
		noGroupRenderer.setMinMargin(10);
		noGroupRenderer.setAutoMargin(true);
		noGroupRenderer.setItemSize(100, 100);

		galleryTreeViewer.getGallery().setGroupRenderer(noGroupRenderer);
		
		//Use the default item renderer and make it hide the labels.
		DefaultGalleryItemRenderer dgir = new DefaultGalleryItemRenderer();
		dgir.setShowLabels(false);
		galleryTreeViewer.getGallery().setItemRenderer(dgir);
		
		
		galleryTreeViewer.getGallery().setLowQualityOnUserAction(true);
	}


	public ImagesAlbum getImagesAlbum(){
		return album;
	}

	public void setImagesAlbum(ImagesAlbum imagesAlbum){
		this.album = imagesAlbum;
		Object[] albums;
		if(album == null) {
			albums = new Object[0];
		}
		else{
			//The album must be passed as an array since it will be the first level of the TreeViewer
			albums = new Object[] { album };
		}
		galleryTreeViewer.setInput(albums);

	}

	public GalleryTreeViewer getGalleryTreeViewer() {
		return galleryTreeViewer;
	}
	
	/**
	 * Change the size of the group renderer to match the one specified by the parameters
	 * @param width New width
	 * @param height New height
	 */
	public void setImageSize(int width, int height){
		noGroupRenderer.setItemSize(width, height);
	}
	
	/**
	 * Gets the ImageData for the image not found image
	 * @return Image not found ImageData
	 */
	protected ImageData getNoImageData() {
		if(noImageData == null) {
			ImageDescriptor descriptor = Activator.getDefault().getImageDescriptor("icons/image_not_found.gif");
			noImageData = descriptor.getImageData();
		}
		return noImageData;
	}
}
