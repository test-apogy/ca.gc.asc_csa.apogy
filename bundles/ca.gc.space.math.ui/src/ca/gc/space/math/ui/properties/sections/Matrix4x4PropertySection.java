package ca.gc.space.math.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.space.math.Matrix4x4;
import ca.gc.space.math.ui.composites.Matrix4x4Composite;

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
