package org.eclipse.symphony.addons.sensors.imaging.ui.celleditors;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

import ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorProvider;


public class ImageDataPropertyCellViewerContentProvider extends CellEditor implements PropertyCellEditorProvider
{	
	private ImageData imageData;
	
	public ImageDataPropertyCellViewerContentProvider() 
	{
		System.out.println("000000000000000000000000000000000000");
	}

	public ImageDataPropertyCellViewerContentProvider(Composite parent) 
	{
		super(parent);
		System.out.println("000000000000000000000000000000000000");
	}
	
	

	public CellEditor newInstance(Composite parent) 
	{
		return new ImageDataPropertyCellViewerContentProvider(parent);
	}

	@Override
	protected Control createControl(Composite parent) 
	{
		
		final Image image = new Image(parent.getShell().getDisplay(), imageData);

		Label label = new Label(parent, SWT.NONE);
		label.setImage(image);
		
		return label;
	}

	@Override
	protected Object doGetValue() {		
		return imageData;
	}

	@Override
	protected void doSetFocus() {
		// TODO Auto-generated method stub		
	}

	@Override
	protected void doSetValue(Object value) {
		// TODO Auto-generated method stub
		imageData = (ImageData) value;
	}
}