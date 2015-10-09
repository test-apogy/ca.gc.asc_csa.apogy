package org.eclipse.symphony.common.emf.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.emf.ui.composites.EClassDocumentationComposite;
import org.eclipse.symphony.common.ui.properties.sections.AbstractExtendedPropertySection;

public class EClassDocumentationSection extends AbstractExtendedPropertySection {

	@Override
	protected void render(EObject eObject) {
		((EClassDocumentationComposite) getComposite()).setEClass(eObject.eClass());
	}
	
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}
	
	@Override
	protected Composite createComposite(Composite parent) {
		return new EClassDocumentationComposite(parent, SWT.NONE);
	}
}