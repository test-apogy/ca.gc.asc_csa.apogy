package org.eclipse.symphony.common.emf.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.emf.ui.composites.NamedComposite;
import org.eclipse.symphony.common.ui.properties.sections.AbstractExtendedPropertySection;

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