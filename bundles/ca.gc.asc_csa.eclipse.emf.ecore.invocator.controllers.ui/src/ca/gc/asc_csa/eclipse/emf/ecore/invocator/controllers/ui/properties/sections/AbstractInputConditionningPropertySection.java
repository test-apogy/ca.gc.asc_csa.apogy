package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.AbstractInputConditioning;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ui.composite.AbstractInputConditioningResponsePlotComposite;
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
