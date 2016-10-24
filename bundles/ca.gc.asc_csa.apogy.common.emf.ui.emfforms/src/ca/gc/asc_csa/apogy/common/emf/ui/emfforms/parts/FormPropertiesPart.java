package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

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

	// FIXME: Issue #178: Make use of Selection to EObject converters.
	@Inject
	public void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) final ISelection selection)
			throws CoreException {

		if (selection != null && !selection.isEmpty()) {
			for (Control control : composite.getChildren()) {
				control.dispose();
			}
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection ss = (IStructuredSelection) selection;
				if (ss.getFirstElement() instanceof EObject) {
					try {
						ECPSWTViewRenderer.INSTANCE.render(composite, (EObject) ss.getFirstElement());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			composite.layout();
		}
	}
}