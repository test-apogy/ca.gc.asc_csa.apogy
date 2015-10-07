package org.eclipse.symphony.core.invocator.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.invocator.ContextsList;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.ui.composites.ContextsDefinitionComposite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;

public class ContextsDefinitionSection extends AbstractExtendedPropertySection {
	
	@Override
	protected void render(EObject eObject) {
		
		Environment environment = null;
		
		if (eObject instanceof Environment){
			environment = (Environment) eObject;
		}
		if (eObject instanceof ContextsList){
			ContextsList contextsList = (ContextsList) eObject;
			environment = contextsList.getEnvironment();
		}
		
		((ContextsDefinitionComposite) getComposite()).setEnvironment(environment);
	}
	
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new ContextsDefinitionComposite(parent, SWT.NONE);
	}
}