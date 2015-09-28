package ca.gc.asc_csa.eclipse.emf.ecore.ui.composites;

import java.util.HashMap;
import java.util.Map;

import javax.measure.unit.Unit;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class NativeToDisplayUnitsMapComposite extends Composite 
{
	private Table table = null;
	private Button addButton = null;
	private Button deleteButton = null;
	
	public NativeToDisplayUnitsMapComposite(Composite parent, int style) 
	{
		super(parent, style);
		
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL); 
		rowLayout.pack = true;
		rowLayout.fill = false;
		rowLayout.center = true;
		setLayout(rowLayout);
		
		Composite buttonsComposite = new Composite(this, SWT.NONE);
		buttonsComposite.setLayout(new GridLayout(2,false));
		RowData buttonsCompositeRowData = new RowData();  
		buttonsCompositeRowData.height = 37;	
		buttonsComposite.setLayoutData(buttonsCompositeRowData);
		
		addButton = new Button(buttonsComposite, SWT.PUSH);
		addButton.setText("Add");		
		addButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));		
		addButton.addSelectionListener(new SelectionListener() 
		{			
			@Override
			public void widgetSelected(SelectionEvent e)
			{				
				TableItem item = new TableItem (table, SWT.NONE);
				item.setText (0, "?");
				item.setText (1, "?");
				validate(item, "?", "?");
				table.select(table.getItemCount());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{						
			}
		});
		
		deleteButton = new Button(buttonsComposite, SWT.PUSH);
		deleteButton.setText("Delete");
		deleteButton.setEnabled(false);
		deleteButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		deleteButton.addSelectionListener(new SelectionListener() 
		{			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{								
				table.remove(table.getSelectionIndices());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{						
			}
		});
		
		table =  createTable(this);	
		
		RowData tableRowData = new RowData();  
		tableRowData.height = 137;	
		table.setLayoutData(tableRowData);
		
		table.addSelectionListener(new SelectionListener() 
		{			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				if(table.getSelectionIndices().length > 0)
				{
					deleteButton.setEnabled(true);
				}
				else
				{
					deleteButton.setEnabled(false);
				}								
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{				
			}
		});
	}

	public Map<String, String> getNativeToDisplayUnitsMap() 
	{
		Map<String, String>  map = new HashMap<String, String>();
		
		for(int i = 0; i < table.getItemCount(); i++)
		{
			TableItem item = table.getItem(i);
			map.put(item.getText(0), item.getText(1));
		}
		
		return map;
	}

	public void setNativeToDisplayUnitsMap(Map<String, String> newNativeToDisplayUnitsMap) 
	{						
		table.removeAll();
		
		if(newNativeToDisplayUnitsMap != null)
		{
			for(String key : newNativeToDisplayUnitsMap.keySet())
			{
				String value = newNativeToDisplayUnitsMap.get(key);
				
				TableItem item = new TableItem (table, SWT.NONE);
				item.setText (0, key);
				item.setText (1, value);
			
				validate(item, key, value);							
			}
		}
		else
		{
			table.removeAll();
		}
	}

	private Table createTable(Composite parent)
	{
		final Table table =  new Table (this, SWT.BORDER | SWT.MULTI);
		table.setLinesVisible (true);
		table.setHeaderVisible (true);
		
		String[] titles = {"Native Units ", "Displayed Units"};
		for (int i=0; i<titles.length; i++) 
		{
			TableColumn column = new TableColumn (table, SWT.NONE);
			column.setText (titles [i]);
		}	
		for (int i=0; i<titles.length; i++) {
			table.getColumn (i).pack ();
		}	
		
		final TableEditor editor = new TableEditor (table);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;
		table.addListener (SWT.MouseDown, new Listener () 
		{
			@Override
			public void handleEvent (Event event) 
			{
				Rectangle clientArea = table.getClientArea ();
				Point pt = new Point (event.x, event.y);
				int index = table.getTopIndex ();
				while (index < table.getItemCount ()) 
				{
					boolean visible = false;
					final TableItem item = table.getItem (index);
					for (int i=0; i<table.getColumnCount (); i++) 
					{
						Rectangle rect = item.getBounds (i);
						if (rect.contains (pt)) 
						{
							final int column = i;
							final Text text = new Text (table, SWT.NONE);
							Listener textListener = new Listener () 
							{
								@Override
								public void handleEvent (final Event e) 
								{
									switch (e.type) 
									{
										case SWT.FocusOut:
											item.setText (column, text.getText ());
											text.dispose ();
											break;
										case SWT.Traverse:
											switch (e.detail) 
											{
												case SWT.TRAVERSE_RETURN:
													item.setText (column, text.getText ());
													//FALL THROUGH
												case SWT.TRAVERSE_ESCAPE:
													text.dispose ();
													e.doit = false;
											}
											break;
									}
								}
							};
							text.addListener (SWT.FocusOut, textListener);
							text.addListener (SWT.Traverse, textListener);
							editor.setEditor (text, item, i);
							text.setText (item.getText (i));
							text.selectAll ();
							text.setFocus ();
							
							if(column == 0)
							{
								text.addListener (SWT.KEYPAD, new Listener () 
								{
									@Override
									public void handleEvent (Event e) 
									{										
										validate(item, text.getText(), item.getText(1));
									}
								});
							}
							else
							{								
								text.addListener (SWT.KEYPAD, new Listener () 
								{
									@Override
									public void handleEvent (Event e) 
									{
										validate(item, item.getText(0), text.getText());
									}
								});
							}
							
							return;
						}
						if (!visible && rect.intersects (clientArea)) 
						{
							visible = true;
						}
					}
					if (!visible) return;
					index++;
				}
			}
		});
		
		return table;
	}	
	
	protected void validate(TableItem item, String nativeUnitString, String displayUnitString)
	{
		// Checks validity of native unit.
		try
		{
			Unit.valueOf(nativeUnitString);	
			item.setBackground(0, null);
		}
		catch(Throwable t)
		{
			item.setBackground(0, new org.eclipse.swt.graphics.Color(getDisplay(), 255, 0, 0));
		}
		
		// Checks validity of display unit and compatibility with native unit.
		try
		{
			Unit<?> nativeUnit = Unit.valueOf(nativeUnitString);
			Unit<?> displayUnit = Unit.valueOf(displayUnitString);
			
			if(nativeUnit.getConverterTo(displayUnit) != null)
			{				
				item.setBackground(1, null);
			}
			else
			{				
				item.setBackground(1, new org.eclipse.swt.graphics.Color(getDisplay(), 255, 0, 0));
			}
				
		}
		catch(Throwable t)
		{					
			item.setBackground(1, new org.eclipse.swt.graphics.Color(getDisplay(), 255, 0, 0));
		}
	}
}
