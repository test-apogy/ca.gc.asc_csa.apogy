package org.eclipse.symphony.core.invocator.ui.wizards;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.VariableFeatureReference;
import org.eclipse.symphony.core.invocator.VariablesList;
import org.eclipse.symphony.core.invocator.ui.composites.VariableFeatureReferenceComposite;

public class VariableFeatureReferenceWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "org.eclipse.symphony.core.invocator.ui.wizards.VariableFeatureReferenceWizardPage";
	private VariableFeatureReferenceComposite variableFeatureReferenceComposite; 
	protected VariableFeatureReference variableFeatureReference;
	private VariablesList variablesList;
	protected AdapterImpl adapter;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public VariableFeatureReferenceWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Variable / Type / Feature Selection");
		setDescription("Select the Variable/Type/Feature.");
	}

	public VariableFeatureReferenceWizardPage(
			VariablesList variablesList, VariableFeatureReference variableFeatureReference) {
		this();

		if (this.variableFeatureReference != null){
			this.variableFeatureReference.eAdapters().remove(getAdapter());
		}
		
		this.variableFeatureReference = variableFeatureReference;
		this.variablesList = variablesList;
				
		variableFeatureReference.eAdapters().add(getAdapter());
	}
	
	protected Adapter getAdapter() {
		if (adapter == null){
			adapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(VariableFeatureReference.class) == EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE){
						validate();
					}
				}
			};
		}				
		return adapter;
	}	

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		variableFeatureReferenceComposite = new VariableFeatureReferenceComposite(parent, SWT.None);
		variableFeatureReferenceComposite.set(variablesList, this.variableFeatureReference);
		setControl(variableFeatureReferenceComposite);
		validate();
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {
		String errorStr = null;
		
		if (variableFeatureReference.getVariable() == null){
			errorStr = "Select the variable.";
		}

		setErrorMessage(errorStr);
		setPageComplete(errorStr == null);
	}
}