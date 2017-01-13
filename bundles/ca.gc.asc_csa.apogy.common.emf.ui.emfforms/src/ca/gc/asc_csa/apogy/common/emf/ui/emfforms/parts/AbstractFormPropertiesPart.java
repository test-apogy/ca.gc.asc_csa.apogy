package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.Activator;
import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractEObjectSelectionPart;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

public abstract class AbstractFormPropertiesPart extends AbstractEObjectSelectionPart {

	Composite contentComposite;

	@Override
	protected void createContentComposite(Composite parent, int style) {
		contentComposite = new Composite(parent, SWT.NONE);
		contentComposite.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());
		contentComposite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));		
	}

	@Override
	protected void setCompositeContents(EObject eObject) {
		for (Control control : contentComposite.getChildren()) {
			control.dispose();
		}
		try {
			VView viewModel = ViewProviderHelper.getView(eObject, null);
			if(isReadOnly()){
				viewModel.setAllContentsReadOnly();
			}	
			ECPSWTViewRenderer.INSTANCE.render(contentComposite, eObject, viewModel);
		} catch (Exception e) {
			String message = this.getClass().getSimpleName() + ".setCompositeContents(): " + "Error while opening EMF Forms";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
		}
		contentComposite.layout();
	}
	
	/**
	 * This method return true if the EMFForm is readOnly and false if it's editable.
	 * @return
	 */
	abstract protected boolean isReadOnly();
}