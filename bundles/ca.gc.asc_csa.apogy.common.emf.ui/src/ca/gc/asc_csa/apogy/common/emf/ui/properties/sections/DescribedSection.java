package org.eclipse.symphony.common.emf.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.ui.composites.DescribedComposite;
import org.eclipse.symphony.common.ui.properties.sections.AbstractExtendedPropertySection;

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