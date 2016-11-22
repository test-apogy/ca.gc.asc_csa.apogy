package ca.gc.asc_csa.apogy.core.invocator.ui.parts;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.VariablesListPartSelection;

public class VariableRuntimePart extends EObjectEditorPart {
	private InvocatorSession invocatorSession;

	@Inject
	@Optional
	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) VariablesListPartSelection selection) {
		if (selection != null && selection.getVariables() != null && !selection.getVariables().isEmpty()) {
			EObject eObject = ApogyCoreInvocatorFacade.INSTANCE.getInstance(selection.getVariables().get(0));
			
			// FIXME Check FACADE Variables Status 
			if (eObject!= null){
				setEObjectInComposite(eObject);
			}
		}
	}
	
	@Override
	protected void newInvocatorSession(InvocatorSession invocatorSession) {
		this.invocatorSession = invocatorSession;
//		if (invocatorSession )
		super.newInvocatorSession(invocatorSession);
	}
}
