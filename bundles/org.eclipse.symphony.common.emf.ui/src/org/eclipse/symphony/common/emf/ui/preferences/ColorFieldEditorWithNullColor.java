package org.eclipse.symphony.common.emf.ui.preferences;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class ColorFieldEditorWithNullColor extends ColorFieldEditor 
{
	private Composite container;	
	
	public ColorFieldEditorWithNullColor(String name, String string,
			Composite container) 
	{
		super(name, string, container);
		this.container = container;
	}

	@Override
	public int getNumberOfControls() {
		return super.getNumberOfControls() + 1;
	}
	
	@Override
	protected void doFillIntoGrid(Composite parent, int numColumns) 
	{			
		Control control = getLabelControl(parent);
		GridData gd = new GridData();
		gd.horizontalSpan = 1;
		control.setLayoutData(gd);

		Button colorButton = getChangeControl(parent);
		colorButton.setLayoutData(new GridData());
		
		createTransparentButton(parent);
	}
	
	protected Button createTransparentButton(Composite parent)
	{
		Button transparent = new Button(parent, SWT.PUSH);
		transparent.setText("None");
		transparent.setToolTipText("Set the color to null. This effectivelly makes the color transparent.");
		transparent.setLayoutData(new GridData());
		
		transparent.addSelectionListener(new SelectionAdapter() 
		{
			public void widgetSelected(SelectionEvent e) 
			{							
				RGB background = container.getBackground().getRGB();
				getColorSelector().setColorValue(background);	
			}
		});
		
		return transparent;
	}
	
	@Override
	protected void doLoad() 
	{			
		if (getColorSelector() == null) {
			return;
		}
		
		String value = getPreferenceStore().getString(getPreferenceName());

		RGB rgb = null;
		if (!IPreferenceStore.STRING_DEFAULT_DEFAULT.equals(value)) 
		{
			rgb = StringConverter.asRGB(value, null);			
		}
		
		if(rgb == null)
		{
			Color background = container.getBackground();
			if(background != null) rgb = background.getRGB();
		}
		
		getColorSelector().setColorValue(rgb);		
	}
	
	@Override
	protected void doStore() 
	{				
		RGB rgb = getColorSelector().getColorValue();
		RGB background = container.getBackground().getRGB();
		
		if((rgb.red == background.red) && (rgb.green == background.green) && (rgb.blue == background.blue))
		{
			// Color is equal to the container background selected -> no color.
			getPreferenceStore().setValue(getPreferenceName(), "");
		}
		else
		{
			PreferenceConverter.setValue(getPreferenceStore(), getPreferenceName(), getColorSelector().getColorValue());
		}		
	}
	
	@Override
	protected void doLoadDefault() 
	{	
		if (getColorSelector() == null) 
		{
			return;
		}
		
		String value = getPreferenceStore().getDefaultString(getPreferenceName());
		RGB rgb = null;
				
		if (!IPreferenceStore.STRING_DEFAULT_DEFAULT.equals(value)) 
		{
			rgb = StringConverter.asRGB(value, null);			
		}
		
		if(rgb == null)
		{
			Color background = container.getBackground();
			if(background != null) rgb = background.getRGB();
		}		
		
		getColorSelector().setColorValue(rgb);				
	}
}
