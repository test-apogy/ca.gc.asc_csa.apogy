package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableFeatureReference;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariablesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.composites.VariableFeatureReferenceComposite;
import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;

public class VariableFeatureReferenceSection extends AbstractExtendedPropertySection {
		
	@Override
	protected void render(EObject eObject) {
		InvocatorSession session = EMFEcoreInvocatorFacade.INSTANCE
				.getActiveInvocatorSession();
		VariablesList variables = session.getEnvironment()
				.getVariablesList();
		((VariableFeatureReferenceComposite) getComposite()).set(variables, (VariableFeatureReference) eObject);		
	}
	
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new VariableFeatureReferenceComposite(parent, SWT.NONE);
	}
}