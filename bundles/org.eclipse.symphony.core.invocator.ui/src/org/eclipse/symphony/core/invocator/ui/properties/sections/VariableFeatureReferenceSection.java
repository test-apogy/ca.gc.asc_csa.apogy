package org.eclipse.symphony.core.invocator.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.VariableFeatureReference;
import org.eclipse.symphony.core.invocator.VariablesList;
import org.eclipse.symphony.core.invocator.ui.composites.VariableFeatureReferenceComposite;

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