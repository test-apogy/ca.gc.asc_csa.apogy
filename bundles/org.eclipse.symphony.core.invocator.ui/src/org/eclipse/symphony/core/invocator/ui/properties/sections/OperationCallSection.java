package org.eclipse.symphony.core.invocator.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.ui.composites.OperationCallComposite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;

public class OperationCallSection extends AbstractExtendedPropertySection {

	@Override
	protected void render(EObject eObject) {
		((OperationCallComposite) getComposite()).setOperationCall((OperationCall) eObject);		
	}
	
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}
	
	@Override
	protected Composite createComposite(Composite parent) {
		return new OperationCallComposite(parent, SWT.NONE);		
	}
}