package ca.gc.asc_csa.apogy.core.environment.ui.dialogs;
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

import java.util.HashMap;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import ca.gc.asc_csa.apogy.core.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.Map;
import ca.gc.asc_csa.apogy.core.environment.MapsList;
import ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.invocator.Context;

public class MapSelectionDialog extends Dialog 
{
	protected Context context;
	protected Map selectedMap;
	
	private HashMap<Integer, Map> indexToMapMap = new HashMap<Integer, Map>();
	
	public MapSelectionDialog(Shell parentShell) 
	{
		super(parentShell);
	}
	
	public MapSelectionDialog(Shell parentShell, Context context)
	{
		this(parentShell);
		this.context = context;
	}
	
	public Map getSelectedMap()
	{
		return selectedMap;
	}
		
	@Override
	protected void configureShell(Shell newShell) 
	{	
		super.configureShell(newShell);
		newShell.setText("Map Selection");
	}
	
	@Override
	protected Control createDialogArea(Composite parent) 
	{	
		Composite area = (Composite) super.createDialogArea(parent);
		
	    Composite container = new Composite(area, SWT.NONE);	    
	    container.setLayoutData(new GridData(GridData.FILL_BOTH));
	    GridLayout layout = new GridLayout(2, false);
	    container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	    container.setLayout(layout);
	    
	    Label mapLabel = new Label(container, SWT.NONE);
	    mapLabel.setText("Selected Map:");
	    
	    Combo combo = createMapSelectionCombo(container, context);
	    GridData comboGridData = new GridData(SWT.FILL, SWT.CENTER, false, false);
	    comboGridData.minimumWidth = 200;
	    comboGridData.widthHint = 200;
	    combo.setLayoutData(comboGridData);
	    	    
	    return area;
	}
	
	protected Combo createMapSelectionCombo(Composite parent, Context context)
	{
		final Combo combo = new Combo(parent, SWT.NONE);
		
		if(context.getEnvironment() instanceof ApogyEnvironment)
		{
			ApogyEnvironment apogyEnvironment = (ApogyEnvironment) context.getEnvironment();
			AbstractWorksite worksite = apogyEnvironment.getActiveWorksite();
			
			if(worksite instanceof SurfaceWorksite)
			{
				SurfaceWorksite surfaceWorksite = (SurfaceWorksite) worksite;
				MapsList mapList = surfaceWorksite.getMapsList();
				
				if(mapList != null && mapList.getMaps() != null && mapList.getMaps().size() > 0)
				{
					String[] items = new String[mapList.getMaps().size()];
					int i = 0;
					for(Map map : mapList.getMaps())
					{
						String itemName = map.getName();
						if(itemName == null)
						{
							itemName = Integer.toString(i);
							
						}
						items[i] = itemName;
						
						indexToMapMap.put(i, map);
								
						i++;
					}
					
					combo.setItems(items);
				}
			}
		}
		
		combo.addSelectionListener(new SelectionListener() 
		{			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				int index = combo.getSelectionIndex();
				selectedMap = indexToMapMap.get(index);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{						
			}
		});
		
		return combo;
	}
}
