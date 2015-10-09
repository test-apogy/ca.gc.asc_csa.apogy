package org.eclipse.symphony.common.emf.ui.preferences;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.symphony.common.emf.ui.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import ca.gc.asc_csa.eclipse.emf.ecore.Ranges;

public class InvocatorDisplayPreferencePage extends PreferencePage implements IWorkbenchPreferencePage
{	
	private IPropertyChangeListener preferencesListener = null;
	
//	private StringFieldEditor instanceTypeNameFilter;
//	private CCombo instanceTypecombo;		
	private Map<Ranges, ColorFieldEditor> rangesToChooseColorButtonsMap = new HashMap<Ranges, ColorFieldEditor>();
		
	/**
	 * Create the preference page.
	 */
	public InvocatorDisplayPreferencePage() 
	{
	}

	/**
	 * Create contents of the preference page.
	 * @param parent
	 */
	@Override
	public Control createContents(Composite parent) 
	{
		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(1, false));
		
//		Group filterGroup = new Group(container,SWT.None);
//		filterGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
//		filterGroup.setLayout(new GridLayout(2, true));
//		filterGroup.setText("Filters");
//		
//		try
//		{
//			Label lblDefaultInstanceType = new Label(filterGroup, SWT.NONE);
//			lblDefaultInstanceType.setText("Default Instance Type Filter:");		
//			
//			instanceTypecombo = new CCombo(filterGroup, SWT.BORDER);
//			instanceTypecombo.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false, 1, 1));
//			
//			List<EClass> classes = org.eclipse.symphony.common.emf.EMFEcoreFacade.INSTANCE.getAllAvailableEClasses();
//						
//			updateInstanceTypeCombo(classes);		
//			selectInstanceType(getPreferenceStore().getString(PreferencesConstants.INSTANCE_TYPE_CLASS_FILTER_ID));
//							
//			instanceTypeNameFilter = new StringFieldEditor(PreferencesConstants.INSTANCE_TYPE_NAME_FILTER_ID, "Default Instance Type Name Filter:", filterGroup);
//			instanceTypeNameFilter.setPreferenceStore(getPreferenceStore());			
//			instanceTypeNameFilter.load();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}			
		
		Group colorGroup = new Group(container,SWT.None);
		colorGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		colorGroup.setLayout(new GridLayout(2, true));
		colorGroup.setText("Ranges Color");
		
		// Populates the Range Color Selection Button.
		for(Ranges range : Ranges.VALUES)
		{			
			try
			{
				ColorFieldEditor editor = createColorFieldEditor(colorGroup, range);
				rangesToChooseColorButtonsMap.put(range, editor);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}	
		
		// Register a listener to the preference store
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(getPreferencesListener());
		
		updateControls();
		
		return container;
	}
		
	@Override
	public void dispose() 
	{
		Activator.getDefault().getPreferenceStore().removePropertyChangeListener(getPreferencesListener());
		super.dispose();
	}
	
	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	public boolean performOk() 
	{
		storePreferences();			
		return super.performOk();
	}
	
	@Override
	protected void performApply() 
	{
		storePreferences();
		super.performApply();
	}
	
	@Override
	protected void performDefaults() 
	{		
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Reset to default the preferences.		
		store.setToDefault(PreferencesConstants.INSTANCE_TYPE_NAME_FILTER_ID);
		store.setToDefault(PreferencesConstants.INSTANCE_TYPE_CLASS_FILTER_ID);		
		store.setToDefault(PreferencesConstants.NATIVE_TO_DISPLAY_UNITS_ID);
		// instanceTypeNameFilter.loadDefault();
		
		for(Ranges range : rangesToChooseColorButtonsMap.keySet())
		{			
			ColorFieldEditor colorEditor = rangesToChooseColorButtonsMap.get(range);						
			colorEditor.loadDefault();			
		}			

		super.performDefaults();
	}
	
	private void updateControls()
	{
		// Updates filter type
		// selectInstanceType(getPreferenceStore().getString(PreferencesConstants.INSTANCE_TYPE_CLASS_FILTER_ID));
	}
	
	private ColorFieldEditor createColorFieldEditor(final Composite container, final Ranges range)
	{
		ColorFieldEditor colorEditor = new ColorFieldEditorWithNullColor( range.getName(),range.getName() + " :", container);				
		
		// Set the editor up to use this page	
		colorEditor.setPreferenceStore(getPreferenceStore());
		colorEditor.load();

		return colorEditor;
	}
	
//	private void selectInstanceType(String className)
//	{
//		if((className == null) || (className.length() == 0))
//		{
//			instanceTypecombo.select(0);
//		}
//		else
//		{
//			String[] items =  instanceTypecombo.getItems();
//			for(int i = 0; i < items.length; i++)
//			{
//				if(items[i].compareTo(className) == 0)
//				{
//					instanceTypecombo.select(i);
//					return;
//				}
//			}
//		}
//	}
	
//	private void updateInstanceTypeCombo(List<EClass> eClasses)
//	{
//		instanceTypecombo.removeAll();
//				
//		String[] typeNames = new String[eClasses.size() + 1];
//		typeNames[0] = "";
//		for(int i = 0; i < eClasses.size(); i++)
//		{
//			typeNames[i+1] = eClasses.get(i).getInstanceClassName();			
//		}
//		instanceTypecombo.setItems(typeNames);	
//	}
	
	private void storePreferences()
	{
//		getPreferenceStore().setValue(PreferencesConstants.INSTANCE_TYPE_CLASS_FILTER_ID, instanceTypecombo.getItem(instanceTypecombo.getSelectionIndex()));		
//		instanceTypeNameFilter.store();
		
		for(Ranges range : rangesToChooseColorButtonsMap.keySet())
		{			
			ColorFieldEditor colorEditor = rangesToChooseColorButtonsMap.get(range);								
			colorEditor.store();				
		}		
	}
	 
	private IPropertyChangeListener getPreferencesListener()
	{
		if(preferencesListener == null)
		{
			preferencesListener = new IPropertyChangeListener() 
			{
				@Override
				public void propertyChange(PropertyChangeEvent event) 
				{	
					updateControls();
				}	
			};
		}
		
		return preferencesListener;
	}
}
