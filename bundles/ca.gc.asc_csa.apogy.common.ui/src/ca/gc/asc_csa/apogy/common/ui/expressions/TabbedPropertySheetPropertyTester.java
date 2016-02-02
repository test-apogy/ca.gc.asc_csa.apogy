package ca.gc.asc_csa.apogy.common.ui.expressions;
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