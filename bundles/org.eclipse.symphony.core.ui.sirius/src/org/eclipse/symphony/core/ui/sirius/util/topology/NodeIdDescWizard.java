package org.eclipse.symphony.core.ui.sirius.util.topology;

import org.eclipse.jface.wizard.Wizard;

public class NodeIdDescWizard extends Wizard
{
	// Constants for page
	private static final String PAGE_NAME = "Node Id / Description Page";
	private static final String PAGE_TITLE = "Enter the node's id and description; " +
											 "if no id is entered, a default one will be supplied instead.";
	
	// Used to keep track of the id and description
	private String enteredId;
	private String enteredDesc;
	
	// The required page for this wizard
	private NodeIdDescPage page;
	
	public NodeIdDescWizard()
	{
		// Create the required page and add it to the wizard
		page = new NodeIdDescPage(PAGE_NAME, PAGE_TITLE);
		this.addPage(page);
		
		// Initially null
		enteredId = null;
		enteredDesc = null;
	}

	@Override
	public boolean performFinish()
	{
		// Set the values accordingly
		enteredId = page.getEnteredId();
		enteredDesc = page.getEnteredDesc();
		
		// Return true
		return true;
	}
	
	public String getEnteredId()
	{
		// Just return the id
		return enteredId;
	}
	
	public String getEnteredDesc()
	{
		// Just return the description
		return enteredDesc;
	}
}