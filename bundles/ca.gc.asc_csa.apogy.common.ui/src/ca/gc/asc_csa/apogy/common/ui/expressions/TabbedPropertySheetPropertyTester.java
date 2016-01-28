package ca.gc.asc_csa.apogy.common.ui.expressions;

import org.eclipse.core.expressions.PropertyTester;
import ca.gc.asc_csa.apogy.common.ui.EclipseUiUtilities;
import org.eclipse.ui.views.properties.PropertySheet;

public class TabbedPropertySheetPropertyTester extends PropertyTester {

	public static final String PROPERTY_NAMESPACE = "ca.gc.asc_csa.apogy.common.ui.expressions.TabbedPropertySheetPropertyTester";
	public static final String PROPERTY_ACTIVE_SECTION = "activeSection";
	
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		boolean result = false;		
		if (PROPERTY_ACTIVE_SECTION.equals(property)){
			PropertySheet propertySheet = (PropertySheet) EclipseUiUtilities.findView(EclipseUiUtilities.PROPERTY_SHEET_ID);
			if (propertySheet != null){
				result = EclipseUiUtilities.getActiveTabbedPropertySheetSection(propertySheet, (String) expectedValue) != null;
			}
		}	
		return result;
	}
}