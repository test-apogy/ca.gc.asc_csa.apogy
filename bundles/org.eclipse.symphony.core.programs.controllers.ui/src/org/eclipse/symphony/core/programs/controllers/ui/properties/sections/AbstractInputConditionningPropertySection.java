package org.eclipse.symphony.core.programs.controllers.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.programs.controllers.AbstractInputConditioning;
import org.eclipse.symphony.core.programs.controllers.ui.composite.AbstractInputConditioningResponsePlotComposite;

import ca.gc.asc_csa.eclipse.ui.properties.sections.AbstractExtendedPropertySection;

public class AbstractInputConditionningPropertySection extends AbstractExtendedPropertySection {
		
	@Override
	protected void render(EObject eObject) {
		((AbstractInputConditioningResponsePlotComposite) getComposite()).setAbstractInputConditioning( (AbstractInputConditioning) eObject);		
	}
	
	@Override
	public boolean shouldUseExtraSpace() {	
		return true;
	}	
	
	@Override
	protected Composite createComposite(Composite parent) {
		return new AbstractInputConditioningResponsePlotComposite(parent, SWT.NONE);
	}
}