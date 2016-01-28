package ca.gc.asc_csa.apogy.common.math.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.math.ui.composites.RotationMatrixComposite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;

public class RotationPropertySection extends AbstractExtendedPropertySection 
{	
	@Override
	protected void render(EObject eObject) {
		((RotationMatrixComposite) getComposite()).setMatrix3x3((ca.gc.asc_csa.apogy.common.math.Matrix3x3) eObject);		
	}
	
	@Override
	protected Composite createComposite(Composite parent) {
		return new RotationMatrixComposite(parent, SWT.NONE, getEditingDomain());
	}
}