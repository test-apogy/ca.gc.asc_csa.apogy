package org.eclipse.symphony.core.ui.sirius.util.topology;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NodeIdDescPage extends WizardPage
{
	// Constants for this page
	private static final String ID_LABEL_STR = "Enter the id:			";
	private static final String DESC_LABEL_STR = "Enter the description:";
	
	// The required widgets for the rendering the page
	private Text idText;
	private Text descText;
	private Composite pageComposite;
	
	public NodeIdDescPage(String pageName, String title)
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
		
		Composite idComposite = new Composite(pageComposite, SWT.NONE);
		idComposite.setLayout(new GridLayout(2, false));
		idComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		
		// Create the label for the id
		Label idLabel = new Label(idComposite, SWT.LEFT);
		idLabel.setText(ID_LABEL_STR);
		
		// Create the text for the name
		idText = new Text(idComposite, SWT.BORDER);
		idText.setLayoutData(new GridData(SWT.FILL, SWT.LEFT, true, true));
		
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
	
	public String getEnteredId()
	{
		// If the appropriate Text has been created
		if (idText != null)
		{
			// Return the value from that text
			return idText.getText();
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
