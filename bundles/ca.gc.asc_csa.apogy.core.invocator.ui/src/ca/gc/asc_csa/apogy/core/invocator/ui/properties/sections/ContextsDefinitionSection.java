package ca.gc.asc_csa.apogy.core.invocator.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.apogy.core.invocator.ContextsList;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.ContextsDefinitionComposite;

public class ContextsDefinitionSection extends AbstractExtendedPropertySection {
	
	@Override
	protected void render(EObject eObject) {
		
		Environment environment = null;
		
		if (eObject instanceof Environment){
			environment = (Environment) eObject;
		}
		if (eObject instanceof ContextsList){
			ContextsList contextsList = (ContextsList) eObject;
			environment = contextsList.getEnvironment();
		}
		
		((ContextsDefinitionComposite) getComposite()).setEnvironment(environment);
	}
	
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new ContextsDefinitionComposite(parent, SWT.NONE);
	}
}