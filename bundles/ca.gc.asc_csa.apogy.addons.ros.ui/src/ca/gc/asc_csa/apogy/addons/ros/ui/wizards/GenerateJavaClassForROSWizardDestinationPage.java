package ca.gc.asc_csa.apogy.addons.ros.ui.wizards;

import java.util.Map;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.ros.EnvironmentVariables;

public class GenerateJavaClassForROSWizardDestinationPage extends WizardPage 
{
	protected static String path = System.getProperty("user.home");		
	private Composite container;
	private Button browseButton = null;
		
	public GenerateJavaClassForROSWizardDestinationPage(String pageName) 
	{
		super(pageName);
		setTitle("Generate ROS Java classes Settings.");
		setDescription("This wizard generates Java classes for a given ROS package.");
		
		String message = validate();
		setErrorMessage(message);
		setPageComplete(message == null);
	}
			
	public String getPath() 
	{		
		return path;
	}
	
	public String getROSPackagePath()
	{
		Map<String, String> env = System.getenv();
		String rosPackagePath = env.get(EnvironmentVariables.ROS_PACKAGE_PATH);		
		return rosPackagePath;
	}

	@Override
	public void createControl(Composite parent) 
	{
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(3, false);
		container.setLayout(layout);
		
		Label sourceROSPackagePathLabel = new Label(container, SWT.NONE);
		sourceROSPackagePathLabel.setText("ROS_PACKAGE_PATH = ");
		sourceROSPackagePathLabel.setToolTipText("The current value of the environment variable ROS_PACKAGE_PATH");
		
		Label sourceROSPackagePathDisplay = new Label(container, SWT.NONE);
		GridData sourceROSPackagePathGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		sourceROSPackagePathDisplay.setLayoutData(sourceROSPackagePathGridData);
		
		if(getROSPackagePath() != null)
		{			
			sourceROSPackagePathDisplay.setText(getROSPackagePath());
		}
		else
		{
			sourceROSPackagePathDisplay.setText("");
		}

		Label filler = new Label(container, SWT.NONE);
		filler.setText("");
		
		Label destinationFolderLabel = new Label(container, SWT.NONE);
		destinationFolderLabel.setText("Destination folder:");
		
		Label destinationFolderDisplay = new Label(container, SWT.NONE);
		GridData destinationFolderDisplayGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		destinationFolderDisplay.setLayoutData(destinationFolderDisplayGridData);
		destinationFolderDisplay.setText(getPath());
		
		browseButton = new Button(container, SWT.PUSH);
		browseButton.setText("Browse...");
		browseButton.addSelectionListener(new SelectionListener() 
		{			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				DirectoryDialog directoryDialog = new DirectoryDialog(getShell(), SWT.NONE);
				directoryDialog.setFilterPath(path);
				directoryDialog.setMessage("ROS Java class output folder.");
				
				
				String newPath = directoryDialog.open();
				if(newPath != null)
				{
					path = newPath;
					destinationFolderDisplay.setText(newPath);
				}								
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{						
			}
		});
		
		setControl(container);
	}			
	
	private String validate()
	{
		if(getROSPackagePath() == null)
		{
			return "ROS_PACKAGE_PATH environment variable is not defined !";
		}		
		else if(getPath() == null)
		{
			return "No destination path specified !";
		}
		else
		{
			return null;
		}
	}
}
