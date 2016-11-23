package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.parts;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.Activator;
import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractEObjectSelectionPart;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyAdvancedEditorPartSelection;

public class FormPropertiesPart extends AbstractEObjectSelectionPart {

	Composite contentComposite;

	@Override
	protected Composite createContentComposite(Composite parent) {
		contentComposite = new Composite(parent, SWT.NONE);
		contentComposite.setLayout(new GridLayout(1, true));
		contentComposite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		contentComposite.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());
		contentComposite.setLayoutData(GridDataFactory.fillDefaults().create());
		return contentComposite;
	}

	@Override
	protected void setSelectionInContentComposite(EObject eObject) {
		for (Control control : contentComposite.getChildren()) {
			control.dispose();
		}
		try {
			ECPSWTViewRenderer.INSTANCE.render(contentComposite, eObject);
		} catch (Exception e) {
			String message = this.getClass().getSimpleName() + ".setSelection(): " + "Error while opening EMF Forms";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
		}
		contentComposite.layout();
	}

	@Inject
	@Optional
	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ApogyAdvancedEditorPartSelection selection) {
		if(selection != null){
			setEObject(selection.getEObject());
		}
	}
}