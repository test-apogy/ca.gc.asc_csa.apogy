package org.eclipse.symphony.core.ui.sirius.util;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NameDescWizard extends Wizard
{
	// Constants for page
	private static final String PAGE_NAME = "Name Description Page";
	private static final String PAGE_TITLE = "Enter the object's name and description; " +
											 "if cancelled, default values will be supplied instead.";
	
	// Used to keep track of the name and description
	private String enteredName;
	private String enteredDesc;
	
	// The required page for this wizard
	private NameDescPage page;
	
	public NameDescWizard()
	{
		// Create the required page and add it to the wizard
		page = new NameDescPage(PAGE_NAME, PAGE_TITLE);
		this.addPage(page);
		
		// Initially null
		enteredName = null;
		enteredDesc = null;
	}

	@Override
	public boolean performFinish()
	{
		// Set the connection point values accordingly
		enteredName = page.getEnteredName();
		enteredDesc = page.getEnteredDesc();
		
		// Return true
		return true;
	}
	
	public String getEnteredName()
	{
		// Just return the name
		return enteredName;
	}
	
	public String getEnteredDesc()
	{
		// Just return the description
		return enteredDesc;
	}
	
	private class NameDescPage extends WizardPage
	{
		// Constants for this page
		private static final String NAME_LABEL_STR = "Enter the name:       ";
		private static final String DESC_LABEL_STR = "Enter the description:";
		
		// The required widgets for the rendering the page
		private Text nameText;
		private Text descText;
		private Composite pageComposite;
		
		public NameDescPage(String pageName, String title)
		{
			// Call the superclass' constructor
			super(pageName, title, null);
		}

		@Override
		public void createControl(Composite parent)
		{
			// Create the composite
			pageComposite = new Composite(parent, SWT.NONE);
			pageComposite.setLayout(new GridLayout());
			pageComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			
			Composite nameComposite = new Composite(pageComposite, SWT.NONE);
			nameComposite.setLayout(new GridLayout(2, false));
			nameComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
			
			// Create the label for the name
			Label nameLabel = new Label(nameComposite, SWT.LEFT);
			nameLabel.setText(NAME_LABEL_STR);
			
			// Create the text for the name
			nameText = new Text(nameComposite, SWT.BORDER);
			nameText.setLayoutData(new GridData(SWT.FILL, SWT.LEFT, true, true));
			
			Composite descComposite = new Composite(pageComposite, SWT.NONE);
			descComposite.setLayout(new GridLayout(2, false));
			descComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			
			// Create the label for the description
			Label descLabel = new Label(descComposite, SWT.NONE);
			descLabel.setText(DESC_LABEL_STR);
			
			// Create the text for the description
			descText = new Text(descComposite, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
			descText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			
			
			// Set the control for the page
			setControl(pageComposite);
		}
		
		public String getEnteredName()
		{
			// If the appropriate Text has been created
			if (nameText != null)
			{
				// Return the value from that text
				return nameText.getText();
			}
			// Otherwise, it wasn't created
			else
			{
				// Just return the empty string
				return "";
			}
		}
		
		public String getEnteredDesc()
		{
			// If the appropriate Text has been created
			if (descText != null)
			{
				// Return the value from that text
				return descText.getText();
			}
			// Otherwise, it wasn't created
			else
			{
				// Just return the empty string
				return "";
			}
		}
	}
}