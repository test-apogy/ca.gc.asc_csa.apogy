package ca.gc.asc_csa.apogy.core.invocator.ui.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;

import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.parts.AbstractFormPropertiesPart;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyAdvancedEditorPartSelection;

public class FormPropertiesPart extends AbstractFormPropertiesPart {

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
					setEObject(((ApogyAdvancedEditorPartSelection) selection).getEObject());
				}
			}
		});

		return listeners;
	}
}