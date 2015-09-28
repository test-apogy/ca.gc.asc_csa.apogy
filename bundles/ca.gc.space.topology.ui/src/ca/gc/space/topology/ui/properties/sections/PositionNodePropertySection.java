package ca.gc.space.topology.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.space.topology.PositionNode;
import ca.gc.space.topology.ui.composites.PositionNodeComposite;

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