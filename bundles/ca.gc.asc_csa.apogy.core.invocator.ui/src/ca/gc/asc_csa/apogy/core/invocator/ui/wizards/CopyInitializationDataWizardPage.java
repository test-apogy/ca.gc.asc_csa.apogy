package ca.gc.asc_csa.apogy.core.invocator.ui.wizards;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.SourceDestinationContextsComposite;

public class CopyInitializationDataWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.CopyInitializationDataWizardPage";
	private SourceDestinationContextsComposite contextsComposite;
	
	/**
	 * Constructor for CopyInitializationDataWizardPage.
	 */
	public CopyInitializationDataWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Export Apogy Initialization Data");
		setDescription("Copy the Initialization Data from a source context to a destination context.");
		validate();
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		contextsComposite = new SourceDestinationContextsComposite(parent, SWT.NONE){
			@Override
			protected void destinationContextSelected() {
				validate();
			}
			
			@Override
			protected void sourceContextSelected() {
				validate();
			}
		};
		setControl(contextsComposite);
		
		InvocatorSession invocatorSession = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();

		if (invocatorSession == null){
			Logger.INSTANCE.log(Activator.ID, this, "There is no active session.", EventSeverity.ERROR);
		}else{
			contextsComposite.setContextsList(invocatorSession.getEnvironment().getContextsList());
		}
	}	
	
	public Context getSourceContext(){
		return contextsComposite == null ? null : contextsComposite.getSelectedSourceContext();
	}
	
	public Context getDestinationContext(){
		return contextsComposite == null ? null : contextsComposite.getSelectedDestinationContext();
	}

	protected void validate(){
		String message = null;
		if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() == null){
			message = "There is no active session.";
		} else if (getSourceContext() == null){
			message = "The context source is not defined.";
		}else if (getDestinationContext() == null){
			message = "The context destination is not defined.";
		}else if (getSourceContext() == getDestinationContext()){
			message = "Source and destination contexts cannot be the same";
		}
		
		setErrorMessage(message);
		setPageComplete(message == null);		
	}
}