package ca.gc.asc_csa.apogy.core.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.ui.composites.ApogySystem3dViewerComposite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class ApogySystem3dViewerPropertySection extends AbstractExtendedPropertySection 
{
	ApogySystem3dViewerComposite composite;
	
	@Override
	public void createControls(Composite parent,TabbedPropertySheetPage aTabbedPropertySheetPage) 
	{		
		super.createControls(parent, aTabbedPropertySheetPage);		
	}
	
	@Override
	protected Composite createComposite(Composite parent) {
		composite = new ApogySystem3dViewerComposite(parent, SWT.NONE);
		return composite;
	}
	
	@Override
	protected void render(EObject eObject) 
	{
		if (getEObject() instanceof ApogySystem)
		{
			composite.setApogySystem( (ApogySystem) getEObject());	
		}
/*		else if (getEObject() instanceof ApogySystemAPI){
			composite.setApogySystem( ((ApogySystemAPI) getEObject()).getSystem());
		}
//*/	
	}
	
	@Override
	public boolean shouldUseExtraSpace() {	
		return true;
	}	
}