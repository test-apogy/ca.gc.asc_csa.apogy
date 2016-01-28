package ca.gc.asc_csa.apogy.core.invocator.ui.wizards;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EOperationsComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;

public class OperationCallEOperationsWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.OperationCallEOperationsWizardPage";
	private EOperationsComposite eOperationsComposite;
	private OperationCall operationCall;
	private AdapterImpl adapter;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public OperationCallEOperationsWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Select the Operation");
		setDescription("Select the operation to execute.");		
	}

	public OperationCallEOperationsWizardPage(OperationCall operationCall) {
		this();
		
		if (this.operationCall != null){
			this.operationCall.eAdapters().remove(getAdapter());
		}
		
		this.operationCall = operationCall;
		
		this.operationCall.eAdapters().add(getAdapter());
	}

	private Adapter getAdapter() {
		if (adapter == null){
			adapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					switch (msg.getFeatureID(VariableFeatureReference.class)) {
					case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__VARIABLE:
						operationCall.setTypeMemberReferenceListElement(null);
						operationCall.setFeatureRoot(null);
					case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT:
						operationCall.setFeatureRoot(null);
					case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT:						
						EClass eClass = ApogyCoreInvocatorFacade.INSTANCE.getInstanceClass(operationCall);	
						eOperationsComposite.setEClass(eClass);						
						break;

					default:
						break;
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
		eOperationsComposite = new EOperationsComposite(parent, SWT.None){
			@Override
			protected void newSelection(TreeSelection selection) {
				operationCall.setEOperation(getSelectedEOperation());
				validate();
			}
		};		
		setControl(eOperationsComposite);
		validate();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (this.operationCall != null){
			this.operationCall.eAdapters().remove(getAdapter());
		}
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {
		String errorStr = null;

		if (operationCall.getEOperation() == null){
			errorStr = "You must select an Operation.";
		}

		setErrorMessage(errorStr);
		setPageComplete(errorStr == null);
	}	
}