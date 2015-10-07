package org.eclipse.symphony.core.invocator.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.ui.composites.ContextsListComposite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;

public class ContextsListSection extends AbstractExtendedPropertySection {
		
	@Override
	protected void render(EObject eObject) {
		((Environment) getComposite()).setContextsList(((Environment) eObject).getContextsList());		
	}
	
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new ContextsListComposite(parent, SWT.NONE);
	}
}