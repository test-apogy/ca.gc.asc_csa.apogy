package ca.gc.asc_csa.eclipse.emf.ecore.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.emf.ecore.ui.composites.EClassDocumentationComposite;
import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;

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