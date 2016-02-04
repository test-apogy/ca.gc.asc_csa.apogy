package ca.gc.asc_csa.apogy.common.emf.ui.composites;
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

import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class AvailableUnitsComposite extends Composite 
{	
	private List list = null;
	private Label listTitle = null;

	public AvailableUnitsComposite(Composite parent, int style) 
	{
		super(parent, style);
		
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL); 
		rowLayout.pack = true;
		rowLayout.fill = false;
		rowLayout.center = true;
		setLayout(rowLayout);
				
		listTitle = new Label(this, SWT.NONE);
		listTitle.setText("Available Units");
		RowData listTitleRowData = new RowData();  
		listTitleRowData.height = 37;		
		listTitle.setLayoutData(listTitleRowData);
		
		list = new List (this, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);		
		RowData listRowData = new RowData();  
		listRowData.height = 150;			
		list.setLayoutData(listRowData);
		populateList(list);					
		list.pack();		
		
		final Clipboard cb = new Clipboard(this.getDisplay());
		
		Menu menu = new Menu (parent.getShell(), SWT.POP_UP);
		list.setMenu (menu);
		MenuItem item = new MenuItem (menu, SWT.PUSH);
		item.setText ("Copy Selection");
		item.addListener (SWT.Selection, new Listener () 
		{
			@Override
			public void handleEvent (Event event) 
			{
				String text = list.getItem(list.getSelectionIndex());			
				TextTransfer textTransfer = TextTransfer.getInstance();
				cb.setContents(new Object[] { text }, new Transfer[] { textTransfer });
			}
		});
	}
	
	private void populateList(List list)
	{
		// SI units.
		SI si = SI.getInstance();
		for(Unit<?> unit : si.getUnits())
		{
			String unitsAsString = unit.toString();
			if(unitsAsString != null)
			{
				list.add(unitsAsString);
			}
		}
		
		// SI units.
		NonSI nonSi = NonSI.getInstance();
		for(Unit<?> unit : nonSi.getUnits())
		{
			String unitsAsString = unit.toString();
			if(unitsAsString != null)
			{
				list.add(unitsAsString);
			}
		}
	}
	
}
