package ca.gc.asc_csa.apogy.core.programs.controllers.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.apogy.core.programs.controllers.AbstractInputConditioning;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.AbstractInputConditioningResponsePlotComposite;

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
