package org.eclipse.symphony.common.ui.properties.sections;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.ui.properties.ExtendedTabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class AdvancedPropertySection extends
		org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection {

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent,
			TabbedPropertySheetPage tabbedPropertySheetPage) {		
		super.createControls(parent, tabbedPropertySheetPage);
		ExtendedTabbedPropertySheetPage propertySheetPage = (ExtendedTabbedPropertySheetPage) tabbedPropertySheetPage;

		//Set the control enablement to false if there is no editing domain (makes it read-only)
		page.getControl().setEnabled(propertySheetPage.getEditingDomain() != null);
		page.setPropertySourceProvider(new AdapterFactoryContentProvider(
			propertySheetPage.getAdapterFactory()));
	}
}