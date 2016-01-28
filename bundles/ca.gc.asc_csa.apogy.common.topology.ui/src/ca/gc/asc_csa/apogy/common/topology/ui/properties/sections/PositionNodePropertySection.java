package ca.gc.asc_csa.apogy.common.topology.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.ui.composites.PositionNodeComposite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;

public class PositionNodePropertySection extends AbstractExtendedPropertySection 
{
	@Override
	protected void render(EObject eObject) {
		((PositionNodeComposite) getComposite()).setPositionNode((PositionNode) getEObject());
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new PositionNodeComposite(parent, SWT.NONE, getEditingDomain());
	}
}