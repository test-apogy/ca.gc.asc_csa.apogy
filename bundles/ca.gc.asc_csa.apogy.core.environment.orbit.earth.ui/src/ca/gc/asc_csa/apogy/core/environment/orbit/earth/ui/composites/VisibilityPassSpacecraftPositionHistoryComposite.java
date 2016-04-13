package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.composites;
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
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory;

public class VisibilityPassSpacecraftPositionHistoryComposite extends Composite 
{
	private VisibilityPassSpacecraftPositionHistory positionHistory = null; 
	
	private TabFolder tabFolder;
	private VisibilityPassSpacecraftPositionHistoryAzElComposite azimuthElevationComposite;
	private VisibilityPassSpacecraftPositionHistoryRangeComposite rangeComposite;
	private VisibilityPassSpacecraftPositionHistoryAnglesComposite anglesComposite;
	
	public VisibilityPassSpacecraftPositionHistoryComposite(Composite parent, int style) 
	{
		super(parent, style);			
		setLayout(new FillLayout());
		
		// Creates and populate the TabFolder.
		tabFolder = new TabFolder(this, SWT.NONE);
		tabFolder.setLayout(new FillLayout());
		
		TabItem azimuthElevationTabItem = new TabItem(tabFolder, SWT.NONE);		
		azimuthElevationTabItem.setText("Azimuth - Elevation");				
		azimuthElevationComposite = new VisibilityPassSpacecraftPositionHistoryAzElComposite(tabFolder, SWT.NONE);
		azimuthElevationTabItem.setControl(azimuthElevationComposite);
		
		TabItem rangeTabItem = new TabItem(tabFolder, SWT.NONE);		
		rangeTabItem.setText("Range");				
		rangeComposite = new VisibilityPassSpacecraftPositionHistoryRangeComposite(tabFolder, SWT.NONE);
		rangeTabItem.setControl(rangeComposite);
		
		TabItem anglesTabItem = new TabItem(tabFolder, SWT.NONE);		
		anglesTabItem.setText("Along and Cross Track Angles");				
		anglesComposite = new VisibilityPassSpacecraftPositionHistoryAnglesComposite(tabFolder, SWT.NONE);
		anglesTabItem.setControl(anglesComposite);
				
		tabFolder.pack();
	}

	public VisibilityPassSpacecraftPositionHistory getPositionHistory() 
	{
		return positionHistory;
	}

	public void setPositionHistory(VisibilityPassSpacecraftPositionHistory positionHistory) 
	{
		this.positionHistory = positionHistory;
		
		if(azimuthElevationComposite != null && !azimuthElevationComposite.isDisposed())
		{
			azimuthElevationComposite.setPositionHistory(positionHistory);
		}
		
		if(rangeComposite != null && !rangeComposite.isDisposed())
		{
			rangeComposite.setPositionHistory(positionHistory);
		}
		
		if(anglesComposite != null && !anglesComposite.isDisposed())
		{
			anglesComposite.setPositionHistory(positionHistory);
		}
	}

}
