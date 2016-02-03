package ca.gc.asc_csa.apogy.common.widgets.ui;
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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class SquareStateComposite extends Composite {
	private boolean green;

	private Label lblSquareState;
	

	public SquareStateComposite(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.verticalSpacing = 0;
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		gridLayout.horizontalSpacing = 0;
		setLayout(gridLayout);
		
		lblSquareState = new Label(this, SWT.NONE);
		lblSquareState.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));

	}
	
	public boolean isGreen() {
		return green;
	}

	public void setGreen(boolean green) {
		this.green = green;
		drawColoredSquare(green);
	}
	
	private synchronized void drawColoredSquare(boolean isGreen) {
		PaletteData palette = new PaletteData(0xFF , 0xFF00 , 0xFF0000);
	    ImageData imageData = new ImageData(20,20,24,palette); 
	    
	    int widthPx = 19;
	    int heightPx = 19;
	    
	    for (int x=1;x < widthPx;x++){
	        for(int y=1;y < heightPx;y++){
	            if(isGreen) {
	            	imageData.setPixel(x,y,0xFF00);   // green
	            } else {
	                imageData.setPixel(x,y,0xFF);   // red
	            }
	        }
	    };
	    Image image = new Image(getDisplay(),imageData); 
	    lblSquareState.setImage(image);
	    image.dispose();
	}
}
