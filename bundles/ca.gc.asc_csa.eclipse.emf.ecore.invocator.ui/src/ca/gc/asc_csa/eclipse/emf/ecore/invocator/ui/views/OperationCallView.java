package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariablesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.composites.OperationCallComposite;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.composites.VariableFeatureReferenceComposite;
import ca.gc.asc_csa.eclipse.ui.views.AbstractView;

public class OperationCallView extends AbstractView {
	private OperationCallComposite operationCallComposite;
	private VariableFeatureReferenceComposite variableFeatureReferenceComposite;

	@Override
	public void updatePartName() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		Composite containerComposite = new Composite(parent, SWT.None);
		containerComposite.setLayout(new GridLayout(1, false));
		
		variableFeatureReferenceComposite = new VariableFeatureReferenceComposite(containerComposite, SWT.None);	
		variableFeatureReferenceComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		operationCallComposite = new OperationCallComposite(
				containerComposite, SWT.None){
			protected void newSelection(TreeSelection selection) {
				getSelectionProvider().setSelection(selection);
			}
		};
		operationCallComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}

	@SuppressWarnings("unchecked")
	@Override
	public void updateSelection(ISelection selection) {
		List<OperationCall> operationCalls = (List<OperationCall>) ca.gc.asc_csa.eclipse.converters.Activator
				.convert(selection, OperationCall.class);
		if (!operationCalls.isEmpty()) {
			InvocatorSession session = EMFEcoreInvocatorFacade.INSTANCE
					.getActiveInvocatorSession();
			VariablesList variables = session.getEnvironment()
					.getVariablesList();
			OperationCall operationCall = operationCalls.get(0);
			variableFeatureReferenceComposite.set(variables, operationCall);
			operationCallComposite.setOperationCall(operationCall);
		}
	}
	
	@Override
	public void dispose() {
		variableFeatureReferenceComposite.dispose();
		operationCallComposite.dispose();
		super.dispose();
	}
}