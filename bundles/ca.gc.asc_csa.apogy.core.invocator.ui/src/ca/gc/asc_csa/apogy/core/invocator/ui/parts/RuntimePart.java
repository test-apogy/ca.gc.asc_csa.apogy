package ca.gc.asc_csa.apogy.core.invocator.ui.parts;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractEObjectPart;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ui.VariablesListPartSelection;

public class RuntimePart extends AbstractEObjectPart {
	@Inject
	@Optional
	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) VariablesListPartSelection selection) {
		System.out.println("RuntimePart.setSelection()");
		
		if (selection != null && selection.getVariables() != null && !selection.getVariables().isEmpty()) {
			EObject eObject = ApogyCoreInvocatorFacade.INSTANCE.getInstance(selection.getVariables().get(0));
			setEObject(eObject);
		}
	}
	
	
	
//	if (obj instanceof Variable){
//		Variable variable = (Variable) obj;				
//		selectedEObject = ApogyCoreInvocatorFacade.INSTANCE.getInstance(variable);				
//	}
//	if (obj instanceof AbstractTypeImplementation){
//		AbstractTypeImplementation abstractTypeImplementation = (AbstractTypeImplementation) obj;
//		selectedEObject = abstractTypeImplementation.getInstance();
//	}
}
