package org.eclipse.symphony.core.ui.sirius.util;

import org.eclipse.jface.wizard.Wizard;

public class ObjIdDescWizard extends Wizard
{
	// Constants for page
	private static final String PAGE_NAME = "%1$s / Description Page";
	private static final String PAGE_TITLE = "Enter the %1$s and description; " +
											 "if no %s is entered, a default one will be supplied instead.";
	
	// Used to keep track of the object's identifier and description
	private String enteredObjId;
	private String enteredDesc;
	
	// The required page for this wizard
	private ObjIdDescPage page;
	
	public ObjIdDescWizard(String objIdFieldStr)
	{
		String fullPageName = String.format(PAGE_NAME, objIdFieldStr);
		String fullPageTitle = String.format(PAGE_TITLE, objIdFieldStr.toLowerCase());
		
		// Create the required page and add it to the wizard
		page = new ObjIdDescPage(fullPageName, fullPageTitle, objIdFieldStr.toLowerCase());
		this.addPage(page);
		
		// Initially null
		enteredObjId = null;
		enteredDesc = null;
	}

	@Override
	public boolean performFinish()
	{
		// Set the values accordingly
		enteredObjId = page.getEnteredObjId();
		enteredDesc = page.getEnteredDesc();
		
		// Return true
		return true;
	}
	
	public String getEnteredObjId()
	{
		// Just return the id
		return enteredObjId;
	}
	
	public String getEnteredDesc()
	{
		// Just return the description
		return enteredDesc;
	}
}