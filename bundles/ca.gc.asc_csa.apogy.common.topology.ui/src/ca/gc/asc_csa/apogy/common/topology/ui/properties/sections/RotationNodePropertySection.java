package ca.gc.asc_csa.apogy.common.topology.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.ui.composites.RotationNodeComposite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;

public class RotationNodePropertySection extends AbstractExtendedPropertySection 
{
	@Override
	protected void render(EObject eObject) {
		((RotationNodeComposite) getComposite()).setRotationNode((RotationNode) getEObject());		
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new RotationNodeComposite(parent, SWT.NONE, getEditingDomain());
	}
}