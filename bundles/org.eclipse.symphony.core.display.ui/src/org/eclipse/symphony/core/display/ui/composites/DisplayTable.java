package org.eclipse.symphony.core.display.ui.composites;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;
import org.eclipse.symphony.core.display.DisplayFacade;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayFactory;
import org.eclipse.symphony.core.display.HistoryData;
import org.eclipse.symphony.core.display.HistoryDataHandler;
import org.eclipse.symphony.core.invocator.AbstractDisplay;
import org.eclipse.symphony.core.invocator.Context;

import org.eclipse.symphony.common.emf.AbstractFeatureNode;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;

public class DisplayTable extends Table 
{
	public static final String FEATURE_COLUMN_NAME = "Property";
	public static final int FEATURE_COLUMN_INDEX = 0;
	
	public static final String VALUE_COLUMN_NAME = "Value";
	public static final int VALUE_COLUMN_INDEX = 1;
	
	public static final String UNITS_COLUMN_NAME = "Units";
	public static final int UNITS_COLUMN_INDEX = 2;
	
	public static final String POSITION_COLUMN_NAME = "Position";
	public static final int POSITION_COLUMN_INDEX = 3;
	
	public static final DisplayFacade DISPLAY_FACADE = EMFEcoreInvocatorDisplayFactory.eINSTANCE.createDisplayFacade();
		
	private Map<AbstractDisplay, DisplayItem> abstractDisplayToItemMap = new HashMap<AbstractDisplay, DisplayItem>();
		
	private TableColumn propertyColumn;
	private TableColumn valueColumn;
	private TableColumn unitsColumn;
	private TableColumn positionColumn;
	
	public DisplayTable(Composite parent, int style) 
	{
		super(parent, style);	
		initialize();		
	}
	
	@Override
	public void dispose() 
	{
		// Dispose of all WatchFeatureItem
		Collection<DisplayItem> items = getAllWatchFeatureItem();
		for(DisplayItem item : items)
		{
			item.dispose();			
		}				
				
		propertyColumn.dispose();
		valueColumn.dispose();
		unitsColumn.dispose();
		positionColumn.dispose();
		
		super.dispose();
	}
	
	public void add(final AbstractDisplay abstractDisplay)
	{
		if(abstractDisplay != null)
		{
			// Creates a WatchFeatureItem.
			DisplayItem item = createWatchFeatureItem(abstractDisplay);																
			
			// Adds the item to the map.
			abstractDisplayToItemMap.put(abstractDisplay, item);
			
			// Redraws the table.
			redraw();
		}
	}
	
	public void add(List<AbstractDisplay> abstractDisplays)
	{
		for(AbstractDisplay abstractDisplay : abstractDisplays)
		{
			add(abstractDisplay);						
		}
		
		redraw();
	}
	
	public void remove(AbstractDisplay abstractDisplay)
	{	
		DisplayItem item = abstractDisplayToItemMap.get(abstractDisplay);
		
		if(item != null)
		{
			// Dispose of item.					
			item.dispose();
			
			// Removes the feature from the Map.
			abstractDisplayToItemMap.remove(abstractDisplay);
		}
				
		redraw();
	}
	
	public void remove(List<AbstractDisplay> abstractDisplays)
	{
		for(AbstractDisplay abstractDisplay : abstractDisplays)
		{
			remove(abstractDisplay);
		}
	}
	
	@Override
	public void removeAll() 
	{		
		super.removeAll();
		
		for(AbstractDisplay abstractDisplay : abstractDisplayToItemMap.keySet())
		{
			DisplayItem watchFeatureItem = abstractDisplayToItemMap.get(abstractDisplay);
			if(watchFeatureItem != null)
			{
				watchFeatureItem.dispose();
			}	
		}		
		
		// Clear the map.
		abstractDisplayToItemMap.clear();
		
		redraw();
	}
	
	public void moveDisplay(final AbstractDisplay abstractDisplay, final int fromIndex, final int toIndex)
	{				
		if(fromIndex != toIndex)
		{
			DisplayItem oldItem = abstractDisplayToItemMap.get(abstractDisplay);
		
			if(oldItem != null)
			{					
				HistoryData historyData = null;
				HistoryDataHandler handler = null;
				if(abstractDisplay instanceof HistoryDataHandler)
				{
					handler = (HistoryDataHandler) abstractDisplay;
					historyData = handler.getHistoryData(oldItem.getValueControl());
				}
											
				// Removes the previous display
				remove(abstractDisplay);
							
				// Creates a new Display at the insertIndex
				DisplayItem item = createDisplayItem(abstractDisplay, toIndex);																
				
				// Applies the history data if applicable
				if(handler != null && historyData != null)
				{
					handler.applyHistoryData(item.getValueControl(), historyData);
				}
				
				// Adds the new Display to the map.
				abstractDisplayToItemMap.put(abstractDisplay, item);
				
				// Redraws the table.
				redraw();
			}
		}
	}
		
	public void select(final AbstractDisplay abstractDisplay)
	{
		deselectAll();
		
		DisplayItem item = abstractDisplayToItemMap.get(abstractDisplay);
		
		if(item != null)
		{
			int index = this.indexOf(item.getTableItem());
			select(index);
		}
	}
	
	public void select(AbstractFeatureNode node)
	{
		deselectAll();
		
		// Creates a list containing the specified node and its descendants.
		List<AbstractFeatureNode> nodes = EMFEcoreFacade.INSTANCE.getDescendants(node);
		nodes.add(node);
		
		List<DisplayItem> selectedList = new ArrayList<DisplayItem>();
		
		for(AbstractFeatureNode n : nodes)
		{
			Iterator<AbstractDisplay> it = abstractDisplayToItemMap.keySet().iterator();
			while(it.hasNext())
			{
				AbstractDisplay abstractDisplay = it.next();
				if(abstractDisplay instanceof AbstractFeatureDisplay)
				{
					AbstractFeatureDisplay abstractFeatureDisplay = (AbstractFeatureDisplay) abstractDisplay;
					if(abstractFeatureDisplay.getAbstractFeatureNode() == n)
					{
						DisplayItem item = abstractDisplayToItemMap.get(abstractDisplay); 
						if(item != null) selectedList.add(item);
					}
				}
			}
		}
				
		for(DisplayItem item : selectedList)
		{
			int index = this.indexOf(item.getTableItem());
			select(index);
		}		
	}
	
	protected DisplayItem createWatchFeatureItem(final AbstractDisplay abstractDisplay)
	{
		DisplayItem item = new DisplayItem(this, abstractDisplay);			
		return item;
	}
	
	protected DisplayItem createDisplayItem(final AbstractDisplay abstractDisplay, final int index)
	{
		DisplayItem item = new DisplayItem(this, abstractDisplay, index);			
		return item;
	}
	
	protected void updateContext(Context context)
	{
		// Updates the variable of all items.
		List<DisplayItem> allWatchFeatureItems = getAllWatchFeatureItem();
		for(DisplayItem item : allWatchFeatureItems)
		{
			item.updateContext(context);			
		}
	}
	
	protected void initialize()
	{
		// Configure the table display properties.
		setLinesVisible(true);
		setHeaderVisible(true);
						
		// Creates the columns.
		propertyColumn = new TableColumn(this, SWT.NONE);
		propertyColumn.setText(FEATURE_COLUMN_NAME);
		propertyColumn.setAlignment(SWT.CENTER);
		propertyColumn.setWidth(200);
		propertyColumn.setMoveable(true);		
		
		valueColumn = new TableColumn(this, SWT.NONE);
		valueColumn.setText(VALUE_COLUMN_NAME);
		valueColumn.setAlignment(SWT.CENTER);
		valueColumn.setWidth(500);
		valueColumn.setMoveable(true);
		
		unitsColumn = new TableColumn(this, SWT.NONE);
		unitsColumn.setText(UNITS_COLUMN_NAME);
		unitsColumn.setAlignment(SWT.CENTER);
		unitsColumn.setWidth(100);	
		unitsColumn.setMoveable(true);
		
		positionColumn = new TableColumn(this, SWT.NONE);
		positionColumn.setText(POSITION_COLUMN_NAME);
		positionColumn.setAlignment(SWT.CENTER);
		positionColumn.setWidth(0);	
		positionColumn.setMoveable(true);		
		
		setSortColumn(positionColumn);
		setSortDirection(SWT.DOWN);
		
		final Table table = this;
		
		/*
     	 * NOTE: MeasureItem is called repeatedly.  Therefore it is critical
     	 * for performance that this method be as efficient as possible.
     	 */
		table.addListener(SWT.MeasureItem, new Listener() 
     	{
     		public void handleEvent(Event event) 
     		{     		
     			if(event.type == SWT.MeasureItem)
     			{
	     			try
	     			{
	     				TableItem item = (TableItem) event.item;   				
	     				if(item.getData() instanceof Point)
	     				{     					
		     				Point p = (Point) item.getData();	     				
		     				event.height = p.x;
		     				event.width = p.y;
		     				
		     				//System.out.println("p " + p.toString());
	     				}
	     			}
	     			catch(Throwable t)
	     			{
	     				t.printStackTrace();
	     			}
     			}
     		}
     	});
		
		// Setup drag and drop	
	    Transfer[] types = new Transfer[] { TextTransfer.getInstance() };
	    DragSource source = new DragSource(table, DND.DROP_MOVE | DND.DROP_COPY);
	    source.setTransfer(types);
	    
	    source.addDragListener(new DragSourceAdapter() 
	    {
			@Override
			public void dragSetData(DragSourceEvent event) {
				event.data = new Integer(table.getSelectionIndex()).toString();
			}
		});

	    // Create the drop target
	    DropTarget target = new DropTarget(table, DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_DEFAULT);
	    target.setTransfer(types);
	    target.addDropListener(new DropTargetAdapter() 
	    {
			@Override
			public void dragEnter(DropTargetEvent event) {
				if (event.detail == DND.DROP_DEFAULT) {
					event.detail = (event.operations & DND.DROP_COPY) != 0 ? DND.DROP_COPY
							: DND.DROP_NONE;
				}
			}

			@Override
			public void dragOver(DropTargetEvent event) {
				event.feedback = DND.FEEDBACK_SELECT | DND.FEEDBACK_SCROLL;
			}

			@Override
			public void drop(DropTargetEvent event) 
			{				
				int dropIndex = -1;
				int i = 0;
				while ((dropIndex < 0) && (i < table.getItems().length)) 
				{
					if (table.getItem(i) == event.item) 
					{
						dropIndex = i;
					}
					i++;
				}

				int fromIndex = table.getSelectionIndex();
								
				if (fromIndex != dropIndex) 
				{					
					// TODO updatePosition(fromIndex, dropIndex);					
					redraw();
				}
			}
		});
	}
		
	
	protected List<DisplayItem> getAllWatchFeatureItem()
	{
		List<DisplayItem> itemList = new ArrayList<DisplayItem>();
		
		for(DisplayItem item : abstractDisplayToItemMap.values())
		{
			if(item != null) itemList.add(item);
		}
		
		return itemList;
	}
	
	protected void checkSubclass() {};
}
