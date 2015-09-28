package ca.gc.asc_csa.symphony.environment.orbit.earth.ui.composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import ca.gc.asc_csa.symphony.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory;

public class VisibilityPassSpacecraftPositionHistoryComposite extends Composite 
{
	private VisibilityPassSpacecraftPositionHistory positionHistory = null; 
	
	private TabFolder tabFolder;
	private VisibilityPassSpacecraftPositionHistoryAzElComposite azimuthElevationComposite;
	private VisibilityPassSpacecraftPositionHistoryRangeComposite rangeComposite;
	
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
	}

}
