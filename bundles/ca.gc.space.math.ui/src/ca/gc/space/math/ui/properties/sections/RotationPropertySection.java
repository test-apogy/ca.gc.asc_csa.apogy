package ca.gc.space.math.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.space.math.ui.composites.RotationMatrixComposite;

public class RotationPropertySection extends AbstractExtendedPropertySection 
{	
	@Override
	protected void render(EObject eObject) {
		((RotationMatrixComposite) getComposite()).setMatrix3x3((ca.gc.space.math.Matrix3x3) eObject);		
	}
	
	@Override
	protected Composite createComposite(Composite parent) {
		return new RotationMatrixComposite(parent, SWT.NONE, getEditingDomain());
	}
}