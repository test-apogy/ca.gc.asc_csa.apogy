package ca.gc.asc_csa.symphony.core.ui.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import ca.gc.asc_csa.symphony.core.ui.Activator;

public class SymphonyCorePreferencesPage extends PreferencePage implements IWorkbenchPreferencePage
{	
	/**
	 * Create the preference page.
	 */
	public SymphonyCorePreferencesPage() {
	}

	/**
	 * Create contents of the preference page.
	 * @param parent
	 */
	@Override
	public Control createContents(Composite parent) 
	{
		Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new GridLayout(1, true));
		
		Label label = new Label(container, SWT.NONE);
		label.setText("See sub-pages for settings.");
		
		return container;
	}		
	
	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) 
	{
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}	
}
