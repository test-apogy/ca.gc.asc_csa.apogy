package ca.gc.asc_csa.apogy.core.invocator.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.VariableFeatureReferenceComposite;

public class VariableFeatureReferenceSection extends AbstractExtendedPropertySection {
		
	@Override
	protected void render(EObject eObject) {
		InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE
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