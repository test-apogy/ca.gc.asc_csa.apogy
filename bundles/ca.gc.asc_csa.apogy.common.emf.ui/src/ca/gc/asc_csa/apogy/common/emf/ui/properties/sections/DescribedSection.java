package ca.gc.asc_csa.apogy.common.emf.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.DescribedComposite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;

public class DescribedSection extends AbstractExtendedPropertySection {

	@Override
	protected void render(EObject eObject) {
		((DescribedComposite) getComposite()).setDescribed((Described) eObject);
	}
	
	@Override
	protected Composite createComposite(Composite parent) {
		return new DescribedComposite(parent, SWT.NONE, getEditingDomain());
	}
}