package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.Activator;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.ui.parts.AbstractEObjectSelectionBasedPart;

public class FormPropertiesPart extends AbstractEObjectSelectionBasedPart {

	Composite contentComposite;

	@Override
	protected boolean isEObjectAcepted(EObject eObject) {
		return true;
	}

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
	protected void setEObjectInComposite(EObject eObject) {
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

}

// {
//
// private Composite composite;
//
// @PostConstruct
// public void createPartControl(Composite parent) {
// composite = new Composite(parent, SWT.NONE);
// composite.setLayout(new GridLayout(1, true));
// composite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
// composite.setLayout(GridLayoutFactory.fillDefaults().margins(10,
// 10).create());
// composite.setLayoutData(GridDataFactory.fillDefaults().create());
// }
//
// @Inject @Optional
// public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) EObject
// eObject) {
// if (eObject != null) {
// for (Control control : composite.getChildren()) {
// control.dispose();
// }
//
// try {
// ECPSWTViewRenderer.INSTANCE.render(composite, eObject);
// } catch (Exception e) {
// String message = this.getClass().getSimpleName() + ".setSelection(): "
// + "Error while opening EMF Forms";
// Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
// }
// composite.layout();
// }
// }
// }