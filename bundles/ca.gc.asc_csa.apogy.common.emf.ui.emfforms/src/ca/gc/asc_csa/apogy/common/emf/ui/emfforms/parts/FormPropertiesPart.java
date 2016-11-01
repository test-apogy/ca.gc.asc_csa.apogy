package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.parts;

import javax.annotation.PostConstruct;
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
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

public class FormPropertiesPart {
	
	private Composite composite;

	@PostConstruct
	public void createPartControl(Composite parent) {
		composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, true));
		composite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		composite.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());
		composite.setLayoutData(GridDataFactory.fillDefaults().create());
	}

	@Inject @Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) EObject eObject) {
		if (eObject != null) {
			for (Control control : composite.getChildren()) {
				control.dispose();
			}

			try {
				ECPSWTViewRenderer.INSTANCE.render(composite, eObject);
			} catch (Exception e) {
				String message = this.getClass().getSimpleName() + ".setSelection(): "
						+ "Error while opening EMF Forms";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
			}
			composite.layout();
		}
	}
}