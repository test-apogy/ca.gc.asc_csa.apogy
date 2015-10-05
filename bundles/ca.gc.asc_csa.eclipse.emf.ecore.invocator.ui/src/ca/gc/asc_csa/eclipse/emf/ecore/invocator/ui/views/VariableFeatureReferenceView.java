package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableFeatureReference;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariablesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.composites.VariableFeatureReferenceComposite;
import ca.gc.asc_csa.eclipse.ui.views.AbstractView;

public class VariableFeatureReferenceView extends AbstractView {
	private VariableFeatureReferenceComposite variableFeatureReferenceComposite;

	@Override
	public void updatePartName() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		variableFeatureReferenceComposite = new VariableFeatureReferenceComposite(
				parent, SWT.None);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void updateSelection(ISelection selection) {
		List<VariableFeatureReference> vfrs = (List<VariableFeatureReference>) org.eclipse.symphony.common.converters.Activator
				.convert(selection, VariableFeatureReference.class);
		if (!vfrs.isEmpty()) {
			VariableFeatureReference vfr = vfrs.get(0);
			InvocatorSession session = EMFEcoreInvocatorFacade.INSTANCE
					.getActiveInvocatorSession();
			VariablesList variables = session.getEnvironment()
					.getVariablesList();
			variableFeatureReferenceComposite.set(variables, vfr);
		}
	}
}