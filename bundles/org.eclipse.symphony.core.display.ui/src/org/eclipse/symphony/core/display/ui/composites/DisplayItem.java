package org.eclipse.symphony.core.display.ui.composites;

import java.awt.Point;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.measure.unit.Unit;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;
import org.eclipse.symphony.core.display.DisplayFacade;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayFactory;
import org.eclipse.symphony.core.display.HistoryData;
import org.eclipse.symphony.core.display.HistoryDataHandler;
import org.eclipse.symphony.core.display.databindings.WatchFeatureNodeObservableValue;
import org.eclipse.symphony.core.display.provider.EMFEcoreInvocatorDisplayEditPlugin;
import org.eclipse.symphony.core.display.ui.Activator;
import org.eclipse.symphony.core.invocator.AbstractDisplay;
import org.eclipse.symphony.core.invocator.Context;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;

public class DisplayItem implements IPropertyChangeListener
{
	public static final String LIMITS_VALUES_SEPARATOR = ", ";
	public static final DisplayFacade DISPLAY_FACADE = EMFEcoreInvocatorDisplayFactory.eINSTANCE.createDisplayFacade();
	public static final String ITEM_IMAGE_PATH = "/full/obj16/DisplayFacade.gif";
	public static final String ITEM_IMAGE_NAME = "DisplayFacade";
	
	private DisplayTable watchFeatureTable;
	private AbstractDisplay abstractDisplay;
	
	private DataBindingContext dataBindingContext;
	
	// SWT Attributes.
	private TableItem tableItem;	
	private List<TableEditor> tableEditors = new ArrayList<TableEditor>();
		
	// Adapters
	private Adapter adapter = null;
	
	private WatchFeatureNodeObservableValue observableValue = null; 
	
	public DisplayItem(final DisplayTable watchFeatureTable, final AbstractDisplay abstractDisplay)
	{
		this.watchFeatureTable = watchFeatureTable;				
		setAbstractDisplay(abstractDisplay, -1);
		
		// Register for display unit changes.
		org.eclipse.symphony.common.emf.ui.Activator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
	}	
	
	public DisplayItem(final DisplayTable watchFeatureTable, final AbstractDisplay abstractDisplay, final int index)
	{
		this.watchFeatureTable = watchFeatureTable;				
		setAbstractDisplay(abstractDisplay, index);		
		
		// Register for display unit changes.
		org.eclipse.symphony.common.emf.ui.Activator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
	}	

	@Override
	public void propertyChange(PropertyChangeEvent event) 
	{
		System.out.println("DisplayItem.propertyChange()");
		
		// Update the displayed unit.
		// TODO
		
		// Force update of the abstractDisplay.
		updateWatchFeatureDisplayProperty();
	}		
	
	public void dispose()
	{		
		// Remove listener from watchFeature if applicable
		if(getAbstractDisplay() != null)
		{
			this.abstractDisplay.eAdapters().remove(getAdapter());
		}				
		
		// Dispose of all the editors.
		disposeOfEditors();
		
		// Removes the TableItem from the table.
		if(getTableItem() != null)			
		{
			if(!watchFeatureTable.isDisposed())
			{
				// Remove the TableItem from the table.
				int index = watchFeatureTable.indexOf(getTableItem());									
				if(index != -1) watchFeatureTable.remove(index);
			}
			
			// Dispose of the TableItem.
			getTableItem().dispose();
		}
								
		// Un-Binds the control
		if(getDataBindingContext() != null) getDataBindingContext().dispose();
							
		if(observableValue != null) observableValue.dispose();
		
		// Nulls out watchFeature.
		abstractDisplay = null;
		
		// Unregister from Preference Store.
		org.eclipse.symphony.common.emf.ui.Activator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
	}
	
	public AbstractDisplay getAbstractDisplay() 
	{
		return abstractDisplay;
	}

	public void setAbstractDisplay(AbstractDisplay newWatchFeature, final int index) 
	{
		// Un-register listeners from previous watchFeature if applicable.
		if(this.abstractDisplay != null)
		{
			this.abstractDisplay.eAdapters().remove(getAdapter());
		}
		
		// Register listeners to new watchFeature if applicable.
		if(newWatchFeature != null)
		{
			newWatchFeature.eAdapters().add(getAdapter());
		}
		
		// Updates the watchFeature.
		this.abstractDisplay = newWatchFeature;
		
		// Update display.		
		updateWatchFeatureDisplayProperty(this.abstractDisplay, index);											
	}

	public TableItem getTableItem() {
		return tableItem;
	}

	public void setTableItem(TableItem tableItem) 
	{
		// Cleanup previous TableItem if applicable.
		if(this.tableItem != null)
		{			
			// Removes the TableItem from the table.
			int index = watchFeatureTable.indexOf(getTableItem());													
			if(index != -1) watchFeatureTable.remove(watchFeatureTable.indexOf(getTableItem()));
												
			// Dispose of the TableItem
			this.tableItem.dispose();
		}
		
		// Updates the TableItem.
		this.tableItem = tableItem;
	}
				
	public DataBindingContext getDataBindingContext() {
		return dataBindingContext;
	}

	public void setDataBindingContext(DataBindingContext dataBindingContext) 
	{
		// Un-binds previous context.
		if(getDataBindingContext() != null)
		{
			getDataBindingContext().dispose();
		}
						
		this.dataBindingContext = dataBindingContext;
	}
	
	public void updateContext(Context context)
	{
		if(context != null)
		{
			// Force updates of the item.
			if(abstractDisplay != null)
			{
				// Gets or create the TableItem.
				if(getTableItem() == null)
				{
					setTableItem(new TableItem(this.watchFeatureTable, SWT.NONE));
				}
				
				// Initialize the TableItem
				initializeTableItem(getTableItem());
							
				this.watchFeatureTable.redraw();
				this.watchFeatureTable.layout();
			}
		}
		else
		{
			// No more Context, dispose of item.
			dispose();
		}
	}
	
	public void updateControl()
	{
		if(abstractDisplay != null)
		{
			// Gets or create the TableItem.
			if(getTableItem() == null)
			{
				setTableItem(new TableItem(this.watchFeatureTable, SWT.NONE));
			}
			
			// Initialize the TableItem
			initializeTableItem(getTableItem());
						
			this.watchFeatureTable.redraw();
			this.watchFeatureTable.layout();
		}
	}
	
	public Control getValueControl()
	{
		if(tableEditors != null && tableEditors.size() > 1)
		{
			return tableEditors.get(1).getEditor();
		}
		else
		{
			return null;
		}
	}
	
	// Protected Methods.
	protected void updateEStructuralFeature(EStructuralFeature newEStructuralFeature)
	{
		if(newEStructuralFeature != null)
		{			
			// Gets or create the TableItem.
			if(getTableItem() == null)
			{
				setTableItem(new TableItem(this.watchFeatureTable, SWT.NONE));
			}
			
			// Initialize the TableItem
			initializeTableItem(getTableItem());
						
			this.watchFeatureTable.redraw();
			this.watchFeatureTable.layout();			
		}
		else
		{
			// EStructuralFeature is now undefined, needs to remove the TableItem from the table
			dispose();
		}
	}

	protected void updateWatchFeatureDisplayProperty(AbstractDisplay watchFeatureDisplayProperty, final int index)
	{
		if(watchFeatureDisplayProperty == null)
		{
			// Dispose of all the editors.
			disposeOfEditors();
			
			// Null out the TableItem. 
			setTableItem(null);
												
			// Un-Binds the control
			if(getDataBindingContext() != null) getDataBindingContext().dispose();	
		}
		else
		{			
			// Gets or create the TableItem.
			if(getTableItem() == null)
			{
				if(index != -1)
				{
					setTableItem(new TableItem(this.watchFeatureTable, SWT.NONE, index));
				}
				else 
				{
					setTableItem(new TableItem(this.watchFeatureTable, SWT.NONE));
				}
			}
			
			// Initialize the TableItem
			initializeTableItem(getTableItem());					
		}
		this.watchFeatureTable.redraw();
		this.watchFeatureTable.layout();
	}
	
	protected void updateWatchFeatureDisplayProperty()
	{
		if(!this.watchFeatureTable.isDisposed())
		{
			Control oldControl = getValueControl();
			
			// This seems to force the table to update its row height !
			this.watchFeatureTable.clearAll();
			
			// Gets or create the TableItem.
			if(getTableItem() == null)
			{
				setTableItem(new TableItem(this.watchFeatureTable, SWT.NONE));
			}				
			
			// Initialize the TableItem
			initializeTableItem(getTableItem());
			
			// Applies history data if applicable.			
			if(oldControl != null && abstractDisplay instanceof HistoryDataHandler)
			{
				HistoryDataHandler handler = (HistoryDataHandler) abstractDisplay;
				HistoryData historyData = handler.getHistoryData(oldControl);
				
				if(handler != null && historyData != null)
				{
					handler.applyHistoryData(this.getValueControl(), historyData);
				}			
			}
						
			this.watchFeatureTable.redraw();
			this.watchFeatureTable.layout();
			this.watchFeatureTable.update();
		}
	}
	
	protected Control createControl(AbstractDisplay watchFeature)
	{									
		if(watchFeature instanceof AbstractFeatureDisplay)
		{
			final AbstractFeatureDisplay abstractFeatureDisplay = (AbstractFeatureDisplay) watchFeature;
			
			final Control control = abstractFeatureDisplay.createControl(this.watchFeatureTable);		
			
			abstractFeatureDisplay.updateResolved(control, false);					
					
			setDataBindingContext(abstractFeatureDisplay.bindControl(control));
			
			return control;
		}
		
		return null;		
	}
	
	protected void initializeTableItem(TableItem tableItem)
	{		
		// Dispose of all the editors.
		disposeOfEditors();
				
		// Name editor	
		tableEditors.add(createNameEditor(tableItem));
		
		// Value Editor
		tableEditors.add(createValueEditor(tableItem));
		
		// Units Editor		
		tableEditors.add(createUnitsEditor(tableItem));
				
		// Position Editor
		// tableEditors.add(createPositionEditor(tableItem));
		
		this.watchFeatureTable.notifyListeners(SWT.Resize, new Event());				
		this.watchFeatureTable.redraw();
		
		tableItem.notifyListeners(SWT.RESIZE, new Event());
	}
	
	protected void disposeOfEditors()
	{
		// Dispose of all the editors.
		for(TableEditor editor : tableEditors)
		{
			if(editor.getEditor() != null) editor.getEditor().dispose();			
			editor.dispose();			
		}
		tableEditors.clear();
	}
	
	protected TableEditor createNameEditor(TableItem tableItem)
	{
		// Name editor (Column 0)
		String name = getDisplayedNamed(abstractDisplay);		
		if(name == null) name = "";
		
		Label nameText = new Label(this.watchFeatureTable, SWT.NONE);
		nameText.setText(name);		
		
		// Adds the description of the feature as tooltip text.
		nameText.setToolTipText(getFullDocumentation(getAbstractDisplay()));
		
		TableEditor nameEditor = new TableEditor(this.watchFeatureTable);	
		nameEditor.grabHorizontal = true;	
		nameEditor.setEditor(nameText,tableItem, DisplayTable.FEATURE_COLUMN_INDEX);				
			
		// Gets the image for the TableItem from the Activator ImageRegistry
		Image image = Activator.getDefault().getImageRegistry().get(ITEM_IMAGE_NAME);
		
		// If the image does not exist, creates it.
		if(image == null)
		{
			URL url = (URL) EMFEcoreInvocatorDisplayEditPlugin.INSTANCE.getPluginResourceLocator().getImage(ITEM_IMAGE_PATH);
			ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(url);
			image = imageDescriptor.createImage();
			Activator.getDefault().getImageRegistry().put(ITEM_IMAGE_NAME, image);
		}
								
		if(image != null)
		{
			tableItem.setImage(image);
		}
				
		return nameEditor;
	}
	
	protected TableEditor createValueEditor(TableItem tableItem)
	{
		// Value Editor (Column 1)
		Control control = createControl(abstractDisplay);					
		TableEditor valueEditor = new TableEditor(this.watchFeatureTable);								
		valueEditor.grabHorizontal = true;
		valueEditor.horizontalAlignment = SWT.CENTER;
		valueEditor.setEditor(control, tableItem, DisplayTable.VALUE_COLUMN_INDEX);		
								
		// Sets the minimum size data.
		if(this.abstractDisplay != null)
		{				
			if(this.abstractDisplay instanceof AbstractFeatureDisplay)
			{
				AbstractFeatureDisplay abstractFeatureDisplay = (AbstractFeatureDisplay) this.abstractDisplay;
				
				Point point = abstractFeatureDisplay.getControlMinimumSize(control);
				
				// Set the size if it is defined.
				if(point != null)
				{
					if(!tableItem.isDisposed()) tableItem.setData(point);
				}
			}
		}
		
		valueEditor.layout();
		
		return valueEditor;
	}
	
	protected TableEditor createUnitsEditor(TableItem tableItem)
	{
		// Units Editor (Column 2)
		EStructuralFeature eStructuralFeature = DisplayFacade.INSTANCE.getEStructuralFeature(abstractDisplay);
		String units = null;
		String toolTipText = "";
		if(eStructuralFeature != null)
		{
			Unit<?> displayUnits = EMFEcoreUIFacade.INSTANCE.getDisplayUnits(eStructuralFeature);
			Unit<?> nativeUnits = EMFEcoreFacade.INSTANCE.getEngineeringUnits(eStructuralFeature);
			if(displayUnits != null && nativeUnits != null)
			{
				try
				{
					toolTipText += "Native units : " + nativeUnits.toString();
					toolTipText += "\nDisplay units : " + displayUnits.toString();
					
					nativeUnits.getConverterTo(displayUnits);					
					units = displayUnits.toString();
				}
				catch(Throwable t)
				{
					t.printStackTrace();					
					units = EMFEcoreFacade.INSTANCE.getEngineeringUnitsAsString(eStructuralFeature);	
				}
			}
			else
			{
				units = EMFEcoreFacade.INSTANCE.getEngineeringUnitsAsString(eStructuralFeature);
			}
		}
		if(units == null) units = "";
		
		
		Label unitsLabel = new Label(this.watchFeatureTable, SWT.CENTER);
		unitsLabel.setText(units);				
		unitsLabel.setToolTipText(toolTipText);
		
		TableEditor unitsEditor = new TableEditor(this.watchFeatureTable);	
		unitsEditor.grabHorizontal = true;	
		unitsEditor.setEditor(unitsLabel,tableItem, DisplayTable.UNITS_COLUMN_INDEX);		
		unitsEditor.layout();
		
		
		return unitsEditor;
	}
	
	protected String getDisplayedNamed(final AbstractDisplay abstractDisplay)
	{
		if(abstractDisplay instanceof AbstractFeatureDisplay)
		{			
			return DisplayFacade.INSTANCE.getDisplayedName((AbstractFeatureDisplay) abstractDisplay);			
		}
		else
		{
			return "?";
		}
	}
	
	protected String getFullDocumentation(final AbstractDisplay abstractDisplay)
	{
		String fullDoc = new String();

		// Adds the full qualified name of the feature.
		fullDoc += "Feature : " + getDisplayedNamed(abstractDisplay) + "\n";		
		
		EStructuralFeature eStructuralFeature = DisplayFacade.INSTANCE.getEStructuralFeature(abstractDisplay);
		
		if(eStructuralFeature != null)
		{
			// Adds the displayedItem documentation
			String documentation = EMFEcoreFacade.INSTANCE.getDocumentation(eStructuralFeature);		
			if(documentation != null)
			{
				fullDoc += "Description : " + documentation + "\n";
			}		
			
			// Adds the units if available.
			String units = EMFEcoreFacade.INSTANCE.getEngineeringUnitsAsString(eStructuralFeature);
			if(units != null)
			{
				fullDoc += "Units : " + units + "\n";
			}
			
			// Out of range limits.
			Number OORMin = EMFEcoreFacade.INSTANCE.getOutOfRangeMinValue(eStructuralFeature);							
			Number OORMax = EMFEcoreFacade.INSTANCE.getOutOfRangeMaxValue(eStructuralFeature);		
			fullDoc += getLimitsString("Out Of Range Limits : ", OORMin, OORMax);
					
			// Alarm limits		
			Number alarmMin = EMFEcoreFacade.INSTANCE.getAlarmMinValue(eStructuralFeature);		
			Number alarmMax = EMFEcoreFacade.INSTANCE.getAlarmMaxValue(eStructuralFeature);				
			fullDoc += getLimitsString("Alarm Limits        : ", alarmMin, alarmMax);
					
			// Warning limits.		
			Number warningMin = EMFEcoreFacade.INSTANCE.getWarningMinValue(eStructuralFeature);		
			Number warningMax = EMFEcoreFacade.INSTANCE.getWarningMaxValue(eStructuralFeature);
			fullDoc += getLimitsString("Warning Limits      : ", warningMin, warningMax);		
		}
		return fullDoc;
	}
	
	/**
	 * Return the string description for a limit range.
	 * @param limitDescription The description  associated with the range.
	 * @param minLimit The lower limit of the range, can be null.
	 * @param maxLimit The upper limit of the range, can be null.
	 * @return The description string.
	 */
	protected String getLimitsString(String limitDescription, Number minLimit, Number maxLimit)
	{
		DecimalFormat decimalFormat = new DecimalFormat("#.###");
		String result = new String();
		
		result += limitDescription + "[";
		
		if(minLimit != null)
		{
			result += decimalFormat.format(minLimit.doubleValue());
		}
		else
		{
			result += "?";
		}
		
		result += LIMITS_VALUES_SEPARATOR;
		
		if(maxLimit != null)
		{
			result += decimalFormat.format(maxLimit.doubleValue());
		}
		else
		{
			result += "?";
		}
		result += "] \n";
		
		return result;
	}
	
	protected void updateWatchFeatureDisplayProperty(AbstractDisplay abstractDisplay)
	{
		if(abstractDisplay == null)
		{
			// Dispose of all the editors.
			disposeOfEditors();
			
			// Null out the TableItem. 
			setTableItem(null);
												
			// Un-Binds the control
			if(getDataBindingContext() != null) getDataBindingContext().dispose();	
		}
		else
		{			
			// Gets or create the TableItem.
			if(getTableItem() == null)
			{
				setTableItem(new TableItem(this.watchFeatureTable, SWT.NONE));
			}
			
			// Initialize the TableItem
			initializeTableItem(getTableItem());					
		}
		this.watchFeatureTable.redraw();
		this.watchFeatureTable.layout();
	}
	
	/**
	 * Returns the Content Adapter that responds to change on the watchFeature.
	 * @return The Adapter.
	 */
	protected Adapter getAdapter() 
	{
		if(adapter == null)
		{
			adapter = new EContentAdapter()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					// If a change occurs on a WatchFeatureDisplayProperty
					if(msg.getNotifier() instanceof AbstractDisplay)
					{						
						// Respond only to change of feature, not adapters events
						if(msg.getEventType() != Notification.REMOVING_ADAPTER &&
						   msg.getEventType() != Notification.RESOLVE)
						{						
							updateWatchFeatureDisplayProperty();
						}
					}																		
					super.notifyChanged(msg);
				}
			};
		}
		
		return adapter;
	}	
}
