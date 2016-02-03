package ca.gc.asc_csa.apogy.core.ui.composites;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import ca.gc.asc_csa.apogy.common.emf.TimeSource;
import ca.gc.asc_csa.apogy.common.emf.ui.Activator;
import ca.gc.asc_csa.apogy.common.emf.ui.TimeSourceCompositeProvider;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.AbstractTimeSourceComposite;
import ca.gc.asc_csa.apogy.core.TimeSourcesList;

public class TimeSourcesListComposite extends Composite 
{
	private Map<TimeSource, TabItem> timeSourceToTabItemMap = new HashMap<TimeSource, TabItem>();
	private TimeSourcesList timeSourcesList;	
	private TabFolder tabFolder;
	
	public TimeSourcesListComposite(Composite parent, int style) {
		this(parent, style, null);		
	}

	public TimeSourcesListComposite(Composite parent, int style, TimeSourcesList timeSourcesList) 
	{
		super(parent, SWT.BORDER);
				
		setTimeSourcesList(timeSourcesList);
									
		// Creates and populate the TabFolder.
		tabFolder = new TabFolder(this, SWT.NONE);
		tabFolder.setLayout(new FillLayout());						
	}

	public TimeSourcesList getTimeSourcesList() {
		return timeSourcesList;
	}

	public void setTimeSourcesList(TimeSourcesList timeSourcesList) 
	{
		this.timeSourcesList = timeSourcesList;
		
		// Populates the tabFolder
		populateTabFolder(tabFolder);			
	}		
	
	public void enableTimeSourceTab(TimeSource timeSource)
	{
		TabItem tabItem = getTabItem(timeSource);		
		if(tabItem != null) tabItem.getControl().setEnabled(true);
	}
	
	public void disableTimeSourceTab(TimeSource timeSource)
	{
		TabItem tabItem = getTabItem(timeSource);		
		if(tabItem != null) tabItem.getControl().setEnabled(false);
	}
	
	public void setSelectedTimeSourceTab(TimeSource timeSource)
	{
		if(!isDisposed())
		{
			// Disable all tab.
			int numberItems = tabFolder.getItemCount();
			for(int i =0; i < numberItems; i++)
			{
				TabItem tabItem = tabFolder.getItem(i);
				if(tabItem != null && !tabItem.isDisposed())
				{
					if(tabItem.getControl() instanceof AbstractTimeSourceComposite)
					{
						AbstractTimeSourceComposite atsc = (AbstractTimeSourceComposite) tabItem.getControl();
					
						if(atsc.getTimeSource() == timeSource)
						{
							atsc.activate(true);
							
							// Selects the tab
							tabFolder.setSelection(i);
						}
						else
						{
							atsc.activate(false);
						}
					}								
				}
			}
		}
	}
	
	protected TabItem getTabItem(TimeSource timeSource)
	{
		return timeSourceToTabItemMap.get(timeSource);
	}
	
	protected void populateTabFolder(TabFolder tabFolder)
	{
		timeSourceToTabItemMap.clear();
		if(getTimeSourcesList() != null)
		{
			for(TimeSource timeSource : getTimeSourcesList().getTimeSources())
			{
				TabItem tabItem = createTabItem(tabFolder, timeSource);			
				timeSourceToTabItemMap.put(timeSource, tabItem);
			}
			tabFolder.pack();
		}
		else
		{
			clearTabFolder(tabFolder);
		}
	}
	
	protected void clearTabFolder(TabFolder tabFolder)
	{
		if(tabFolder != null && tabFolder.getItemCount() > 0)
		{
			// Clear items.
			List<TabItem> items = new ArrayList<TabItem>();
			
			int numberItems = tabFolder.getItemCount();
			for(int i =0; i < numberItems; i++)
			{
				items.add(tabFolder.getItem(i));				
			}
			
			for(TabItem item : items)
			{
				if(item != null)
				{
					item.dispose();
				}
			}
		}
	}
	
	protected TabItem createTabItem(TabFolder tabFolder, TimeSource timeSource)
	{
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		
		tabItem.setText(getTimeSourceText(timeSource));				
		AbstractTimeSourceComposite composite = createAbstractTimeSourceComposite(tabFolder, timeSource);
		tabItem.setControl(composite);
				
		return tabItem;
	}
	
	protected String getTimeSourceText(TimeSource timeSource)
	{
		String text = timeSource.eClass().getName();
		return text;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected AbstractTimeSourceComposite createAbstractTimeSourceComposite(Composite parent, TimeSource timeSource)
	{
		AbstractTimeSourceComposite composite = null;
		
		TimeSourceCompositeProvider provider = Activator.getDefault().getTimeSourceCompositeProvider(timeSource);
		
		if(provider != null)
		{
			composite = provider.getComposite(parent, SWT.NONE, timeSource);
		}
		
		return composite;
	}
}
