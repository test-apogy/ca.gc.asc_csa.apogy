package org.eclipse.symphony.core.invocator.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.ui.properties.sections.AbstractExtendedPropertySection;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.ui.composites.ContextsListComposite;

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