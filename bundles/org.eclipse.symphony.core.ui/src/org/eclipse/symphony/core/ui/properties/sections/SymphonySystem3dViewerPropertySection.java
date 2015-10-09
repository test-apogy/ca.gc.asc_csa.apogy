package org.eclipse.symphony.core.ui.properties.sections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.ui.properties.sections.AbstractExtendedPropertySection;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.ui.composites.SymphonySystem3dViewerComposite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class SymphonySystem3dViewerPropertySection extends AbstractExtendedPropertySection 
{
	SymphonySystem3dViewerComposite composite;
	
	@Override
	public void createControls(Composite parent,TabbedPropertySheetPage aTabbedPropertySheetPage) 
	{		
		super.createControls(parent, aTabbedPropertySheetPage);		
	}
	
	@Override
	protected Composite createComposite(Composite parent) {
		composite = new SymphonySystem3dViewerComposite(parent, SWT.NONE);
		return composite;
	}
	
	@Override
	protected void render(EObject eObject) 
	{
		if (getEObject() instanceof SymphonySystem)
		{
			composite.setSymphonySystem( (SymphonySystem) getEObject());	
		}
/*		else if (getEObject() instanceof SymphonySystemAPI){
			composite.setSymphonySystem( ((SymphonySystemAPI) getEObject()).getSystem());
		}
//*/	
	}
	
	@Override
	public boolean shouldUseExtraSpace() {	
		return true;
	}	
}