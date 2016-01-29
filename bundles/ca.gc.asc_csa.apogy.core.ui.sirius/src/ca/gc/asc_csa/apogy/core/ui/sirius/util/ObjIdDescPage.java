package ca.gc.asc_csa.apogy.core.ui.sirius.util;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ObjIdDescPage extends WizardPage
{
	// Constants for this page
	private static final String OBJ_ID_LABEL_STR = "Enter the %1$s:";
	private static final String DESC_LABEL_STR = "Enter the description:";
	
	// The required widgets for the rendering the page
	private String objIdStr;
	private Text objIdText;
	private Text descText;
	private Composite pageComposite;
	
	public ObjIdDescPage(String pageName, String title, String objIdFieldStr)
	{
		// Call the superclass' constructor
		super(pageName, title, null);
		
		// Set the object's identifier string
		this.objIdStr = String.format(OBJ_ID_LABEL_STR, objIdFieldStr);
		
		// While the string is not the correct length
		while (this.objIdStr.length() < DESC_LABEL_STR.length())
		{
			// Add a space
			this.objIdStr += " ";
		}
	}

	@Override
	public void createControl(Composite parent)
	{
		// Create the composite
		pageComposite = new Composite(parent, SWT.NONE);
		pageComposite.setLayout(new GridLayout());
		pageComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		Composite objIdComposite = new Composite(pageComposite, SWT.NONE);
		objIdComposite.setLayout(new GridLayout(2, false));
		objIdComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		
		// Create the label for the object's identifier
		Label objIdLabel = new Label(objIdComposite, SWT.LEFT);
		objIdLabel.setText(objIdStr);
		
		// Create the text for the object's identifier
		objIdText = new Text(objIdComposite, SWT.BORDER);
		objIdText.setLayoutData(new GridData(SWT.FILL, SWT.LEFT, true, true));
		
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
	
	public String getEnteredObjId()
	{
		// If the appropriate Text has been created
		if (objIdText != null)
		{
			// Return the value from that text
			return objIdText.getText();
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
