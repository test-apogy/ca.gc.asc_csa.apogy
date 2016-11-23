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

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class AreaSelector implements MouseListener, MouseMoveListener
{
	public static int SELECTION_BOX_DEFAULT_LINE_WIDTH = 1;
	public static Color SELECTION_BOX_DEFAULT_COLOR = new Color(Display.getDefault(), 0,0,0); 
	
	private Color selectionBoxLineColor = SELECTION_BOX_DEFAULT_COLOR;
	private int selectionBoxLineWidth = SELECTION_BOX_DEFAULT_LINE_WIDTH;
	
	private ImageDisplayComposite imageDisplayComposite = null;
	private Label imageLabel;
	private Cursor cursor = null;
	private boolean enabled = true;
	private Point corner1 = null;
	private Point corner2 = null;
	
	private Rectangle selectedArea = null;
	private boolean zoomOnMouseUp = true;

	public AreaSelector(ImageDisplayComposite imageDisplayComposite, Label imageLabel) 
	{
		this.imageDisplayComposite = imageDisplayComposite;
		this.imageLabel = imageLabel;
		
		this.imageLabel.addMouseListener(this);
		this.imageLabel.addMouseMoveListener(this);
		
		cursor = new Cursor(this.imageLabel.getDisplay(),SWT.CURSOR_CROSS);
		this.imageLabel.setCursor(cursor);
	}
	
	public boolean isEnabled() 
	{
		return enabled;
	}

	public void setEnabled(boolean enabled) 
	{
		this.enabled = enabled;
		enableCursor(enabled);
	}
	
	public boolean isZoomOnMouseUp() {
		return zoomOnMouseUp;
	}

	/**
	 * Sets whether or not zoom should be called when the mouse is released.
	 * @param zoomOnMouseUp True to zoom on mouse up, false otherwise.
	 */
	public void setZoomOnMouseUp(boolean zoomOnMouseUp) {
		this.zoomOnMouseUp = zoomOnMouseUp;
	}

	public Color getSelectionBoxLineColor() 
	{
		return selectionBoxLineColor;
	}

	public void setSelectionBoxLineColor(Color lineColor) 
	{
		this.selectionBoxLineColor = lineColor;
	}

	public int getSelectionBoxLineWidth() {
		return selectionBoxLineWidth;
	}

	public void setSelectionBoxLineWidth(int selectionBoxLineWidth) {
		this.selectionBoxLineWidth = selectionBoxLineWidth;
	}

	private void enableCursor(boolean enable)
	{
		if(enable)
		{
			cursor = new Cursor(this.imageLabel.getDisplay(),SWT.CURSOR_CROSS);
			this.imageLabel.setCursor(cursor);			
		}
		else
		{
			this.imageLabel.setCursor(null);
		}
	}

	@Override
	public void mouseMove(MouseEvent e) 
	{		
		if(isEnabled())
		{
			corner2 = new Point(e.x, e.y);
			Point c2 = convertToImageCoordinates(corner2);
			
			// Turn the cursor ON/OFF 
			if(coordinatesFallsOnImage(c2))
			{
				enableCursor(true);
			}
			else
			{
				enableCursor(false);
			}
			
			if(corner1 != null) 
			{
				Point c1 = convertToImageCoordinates(corner1);				
				
				// Draw a box in doted line to show the selected region.
				Image image = new Image(this.imageLabel.getDisplay(), imageDisplayComposite.getDisplayedImageData());
				GC gc = new GC(image);						
				gc.setForeground(selectionBoxLineColor);
				gc.setLineWidth(selectionBoxLineWidth);
				gc.setLineStyle(SWT.LINE_DOT); 
		        gc.drawLine(c1.x, c1.y, c2.x, c1.y);
		        gc.drawLine(c2.x, c1.y, c2.x, c2.y);
		        gc.drawLine(c2.x, c2.y, c1.x, c2.y);
		        gc.drawLine(c1.x, c2.y, c1.x, c1.y);		        
		        this.imageLabel.setImage(image);	  		        		        
			}
		}					
	}

	@Override
	public void mouseDoubleClick(MouseEvent e) 
	{

	}

	@Override
	public void mouseDown(MouseEvent e) 
	{		
		if(isEnabled())
		{
			corner1 = new Point(e.x, e.y);
		}	
	}

	@Override
	public void mouseUp(MouseEvent e) 
	{	
		if(isEnabled())
		{			
			if(corner1 != null)
			{
				corner2 = new Point(e.x, e.y);
				
				// Converts the coordinates to image coordinates.
				Point c1 = convertToImageCoordinates(corner1);
				Point c2 = convertToImageCoordinates(corner2);
				
				// Creates the Rectangle that describes the region of interest.
				int x = 0;
				int y = 0;
				int width = 0;
				int height = 0;
				if(c1.x < c2.x)
				{
					x = c1.x;
					width = c2.x - c1.x;
					
					if(c1.y < c2.y)
					{				
						y = c1.y;				
						height = c2.y - c1.y;
					}
					else
					{
						y = c2.y;
						height = c1.y - c2.y;
					}
				}
				else
				{
					x = c2.x;
					width = c1.x - c2.x;
					
					if(c1.y < c2.y)
					{				
						y = c1.y;				
						height = c2.y - c1.y;
					}
					else
					{
						y = c2.y;
						height = c2.y - c1.y;
					}
				}
				
				// Create a Rectangle that describes the area inside the selected area.
				int borderWidth = selectionBoxLineWidth;
				selectedArea = new Rectangle(x + borderWidth, y + borderWidth, width - 2*borderWidth, height - 2*borderWidth);
				
				if(zoomOnMouseUp)
				{
					// Call the zoomInRegion of the parentComposite.
					imageDisplayComposite.zoomInRegion(selectedArea);
				}
				
				// Calls the new selection				
				newSelection(convertToOriginalImageCoordinates(selectedArea));
				
				corner1 = null;
				corner2 = null;
			}
		}		
	}

	/**
	 * Returns the selected rectangle, in image coordinates.
	 * @return The selected rectangle (in image coordinates), or null if no selection has been made.
	 */
	public Rectangle getSelectedArea()
	{
		return selectedArea;
	}
	
	/**
	 * Called when a new rectangle is selected. Can be overloaded by subclasses.
	 * @param rectangle The selected rectangle, in image coordinates.
	 */
	public void newSelection(Rectangle rectangle)
	{
	}
	
	public void setSelectedArea(Rectangle rectangle)
	{
		selectedArea = rectangle;		
		drawSelectedArea(rectangle);		
	}
	
	private void drawSelectedArea(Rectangle rectangle)
	{
		Point c1 = convertToLabelCoordinates(new Point(rectangle.x, rectangle.y));
		Point c2 = convertToLabelCoordinates(new Point(rectangle.x + rectangle.width, rectangle.y + rectangle.height));
				
		// Draw a box in doted line to show the selected region.
		Image image = new Image(this.imageLabel.getDisplay(), imageDisplayComposite.getDisplayedImageData());
		GC gc = new GC(image);						
		gc.setForeground(selectionBoxLineColor);
		gc.setLineWidth(selectionBoxLineWidth);
		gc.setLineStyle(SWT.LINE_DOT); 
        gc.drawLine(c1.x, c1.y, c2.x, c1.y);
        gc.drawLine(c2.x, c1.y, c2.x, c2.y);
        gc.drawLine(c2.x, c2.y, c1.x, c2.y);
        gc.drawLine(c1.x, c2.y, c1.x, c1.y);		        
        this.imageLabel.setImage(image);	
        this.imageLabel.redraw();
	}
	
	/**
	 * Converts a position in the image label coordinates to image coordinates.
	 * @param point The position, in image label coordinates.
	 * @return The position, in image coordinates.
	 */
	private Point convertToImageCoordinates(Point point)
	{		
		int x0 = (int) Math.floor((this.imageLabel.getSize().x - imageDisplayComposite.getDisplayedImageData().width) / 2.0);
		int y0 = (int) Math.floor((this.imageLabel.getSize().y - imageDisplayComposite.getDisplayedImageData().height) / 2.0);															
		int x = point.x - x0;				
		int y = point.y - y0;
		
		return new Point(x,y);
	}
	
	private Rectangle convertToOriginalImageCoordinates(Rectangle rectangle)
	{
		float ratio = imageDisplayComposite.getImageData().width / imageLabel.getImage().getBounds().width;
		
		int x = Math.round(ratio * rectangle.x);
		int y = Math.round(ratio * rectangle.y);
		int width = Math.round(ratio * rectangle.width);		
		int height = Math.round(ratio * rectangle.height);
		
		return new Rectangle(x, y, width, height);		
	}
	
	private Point convertToLabelCoordinates(Point point)
	{	
		float xRatio = ((float)point.x / (float) imageDisplayComposite.getImageData().width);
		int x = Math.round(xRatio * imageLabel.getImage().getBounds().width);
		
		float yRatio = ((float)point.y / (float) imageDisplayComposite.getImageData().height);
		int y = Math.round(yRatio * imageLabel.getImage().getBounds().height);

		return new Point(x, y);
	}
	
	/**
	 * Tells whether or not the specified coordinates falls within the image currently displayed in the image parentComposite.
	 * @param point The point representing coordinates in THE IMAGE FRAME.
	 * @return True if the coordinates falls within the image, false otherwise.
	 */
	private boolean coordinatesFallsOnImage(Point point)
	{
		
		if((point.x >= 0) && 
		   (point.y >= 0) && 
		   (point.x <= imageDisplayComposite.getDisplayedImageData().width) && 
		   (point.y <= imageDisplayComposite.getDisplayedImageData().height))
		{
			return true;
		}
		return false;
		
	}
	
}
