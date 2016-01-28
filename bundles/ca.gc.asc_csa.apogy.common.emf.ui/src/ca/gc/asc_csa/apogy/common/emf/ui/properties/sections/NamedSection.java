package ca.gc.asc_csa.apogy.common.emf.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.NamedComposite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;

public class NamedSection extends AbstractExtendedPropertySection {
	
	@Override
	protected void render(EObject eObject) {
		((NamedComposite) getComposite()).setNamed((Named) eObject);		
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new NamedComposite(parent, SWT.NONE, getEditingDomain());
	}
}