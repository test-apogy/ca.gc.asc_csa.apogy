package org.eclipse.symphony.common.math.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.ui.composites.TransformMatrixComposite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;

public class TransformMatrixPropertySection extends AbstractExtendedPropertySection {

	@Override
	protected void render(EObject eObject) {
		((TransformMatrixComposite) getComposite()).setMatrix4x4((Matrix4x4) eObject);		
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new TransformMatrixComposite(parent, SWT.NONE, getEditingDomain());
	}
}