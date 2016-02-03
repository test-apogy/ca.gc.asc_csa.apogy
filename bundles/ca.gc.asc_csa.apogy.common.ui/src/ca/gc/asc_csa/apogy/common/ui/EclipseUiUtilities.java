package ca.gc.asc_csa.apogy.common.ui;
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

import java.util.Iterator;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.ISectionDescriptor;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;


public class EclipseUiUtilities {
	
	public final static String PROPERTY_SHEET_ID = "org.eclipse.ui.views.PropertySheet";
	
	private EclipseUiUtilities() {	
	}

	/** 
	 * Returns a reference to the {@link ViewPart} specified by the id.
	 * @param id {@link ViewPart} identifier.
	 * @return Reference to the {@link ViewPart} or null if not found.
	 */
	public static IViewPart findView(String id){
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(id);		
	}
	
	/**
	 * Returns the active {@link ISection} with the specified {@link ISection} id. 
	 * @param propertySheet Reference to the {@link PropertySheet}.
	 * @param sectionId {@link ISection} id.
	 * @return Reference to the {@link ISection} or null if not found.
	 */
	@SuppressWarnings("unchecked")
	public static ISection getActiveTabbedPropertySheetSection(PropertySheet propertySheet, String sectionId){
		ISection result = null;
		IPage currentPage = propertySheet.getCurrentPage();
		if (currentPage instanceof TabbedPropertySheetPage){
			TabbedPropertySheetPage propertySheetPage = (TabbedPropertySheetPage) currentPage;
			
			/** Get all section descriptors. */
			ITabDescriptor tabDescriptor = propertySheetPage.getSelectedTab();
			
			/** Search the section descriptor with the specified section id. */
			Iterator<ISectionDescriptor> iter = tabDescriptor.getSectionDescriptors().iterator();
			ISectionDescriptor sectionDescriptor = null;
			while (iter.hasNext() && sectionDescriptor == null){
				ISectionDescriptor currentSectionDescriptor = iter.next();										
				if (currentSectionDescriptor.getId().equals(sectionId)){
					sectionDescriptor = currentSectionDescriptor;
				}
			}
			
			/** Verify if a section descriptor has been found. */ 
			if (sectionDescriptor != null){
				/** Search and get the matching section. */
				ISection[] sections = propertySheetPage.getCurrentTab().getSections();
				int i = 0;
				while (i < sections.length && result == null){
					if (sections[i].getClass().equals(sectionDescriptor.getSectionClass().getClass())){
						result = sections[i];
					}
					i++;
				}				
			}
		}		
		return result;
	}
}