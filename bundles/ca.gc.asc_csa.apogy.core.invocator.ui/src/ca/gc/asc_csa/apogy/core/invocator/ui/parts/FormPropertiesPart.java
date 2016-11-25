package ca.gc.asc_csa.apogy.core.invocator.ui.parts;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;

import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.parts.AbstractFormPropertiesPart;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyAdvancedEditorPartSelection;

public class FormPropertiesPart extends AbstractFormPropertiesPart {
	@Inject
	@Optional
	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ApogyAdvancedEditorPartSelection selection) {
		if (selection != null) {
			setEObject(selection.getEObject());
		}
	}

	@Override
	protected boolean isReadOnly() {
		return false;
	}

	@Override
	protected List<String> getSelectionProvidersIds() {
		List<String> ids = new ArrayList<>();

		ids.add("ca.gc.asc_csa.apogy.rcp.part.ApogyAdvancedEditorPart");

		return ids;
	}

	@Override
	protected List<ISelectionListener> getSelectionListeners() {
		List<ISelectionListener> listeners = new ArrayList<ISelectionListener>();

		listeners.add(new ISelectionListener() {
			@Override
			public void selectionChanged(MPart part, Object selection) {
				if (selection instanceof ApogyAdvancedEditorPartSelection) {
					setSelection((ApogyAdvancedEditorPartSelection) selection);
				}
			}
		});

		return listeners;
	}
}