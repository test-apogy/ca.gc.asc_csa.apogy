package ca.gc.asc_csa.apogy.core.invocator.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.OperationCallComposite;

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