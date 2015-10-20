package org.eclipse.symphony.core.invocator.ui.wizards;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.emf.ui.composites.DescribedComposite;
import org.eclipse.symphony.common.emf.ui.composites.NamedComposite;

public class NamedDescribedWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "org.eclipse.symphony.core.invocator.ui.wizards.NamedDescribedWizardPage";
	private NamedComposite namedComposite;
	private DescribedComposite describedComposite;
	private Adapter adapter; 
	private Named named;
	private Described described;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public NamedDescribedWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Name and Description");
		setDescription("Enter a name and a description (optional).");
	}

	public NamedDescribedWizardPage(
			Named name, Described description) {
		this();
		if (this.named != null){
			this.named.eAdapters().remove(getAdapter());
		}
		
		if (this.described != null){
			this.described.eAdapters().remove(getAdapter());
		}
		
		this.named = name;
		this.described = description;
		
		name.eAdapters().add(getAdapter());
		description.eAdapters().add(getAdapter());
	}

	private Adapter getAdapter() {
		if (adapter == null){
			adapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					validate();
				}
			};
		}				
		return adapter;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */	
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		container.setLayout(new GridLayout(1, false));

		namedComposite = new NamedComposite(container, SWT.None);
		namedComposite.setNamed(named);		
		namedComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		describedComposite = new DescribedComposite(container, SWT.None);
		describedComposite.setDescribed(described);
		describedComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));	
		
		setControl(container);
		
		namedComposite.setFocus();
		
		validate();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (this.named != null){
			this.named.eAdapters().remove(getAdapter());
		}
		if (this.described != null){
			this.described.eAdapters().remove(getAdapter());
		}		
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {
		String errorStr = null;
		String infoStr = null;
		
		if (named == null || named.getName() == null || named.getName().isEmpty()){
			errorStr = "A name must be provided.";
		}
		
		if (described == null || described.getDescription() == null || described.getDescription().isEmpty()){
			infoStr = "It is recommended to enter a description.";
		}	

		setMessage(infoStr);
		setErrorMessage(errorStr);
		setPageComplete(errorStr == null);
	}
}