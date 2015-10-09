package org.eclipse.symphony.common.topology.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.topology.PositionNode;
import org.eclipse.symphony.common.topology.ui.composites.PositionNodeComposite;
import org.eclipse.symphony.common.ui.properties.sections.AbstractExtendedPropertySection;

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