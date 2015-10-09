package org.eclipse.symphony.common.math.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.ui.composites.Matrix4x4Composite;
import org.eclipse.symphony.common.ui.properties.sections.AbstractExtendedPropertySection;

public class Matrix4x4PropertySection extends AbstractExtendedPropertySection {
		
	@Override
	protected void render(EObject eObject) {
		((Matrix4x4Composite) getComposite()).setMatrix4x4((Matrix4x4) eObject);		
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new Matrix4x4Composite(parent, SWT.NONE, getEditingDomain());
	}
}
