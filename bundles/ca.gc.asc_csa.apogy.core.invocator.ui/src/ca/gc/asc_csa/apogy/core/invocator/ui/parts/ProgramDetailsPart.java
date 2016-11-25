package ca.gc.asc_csa.apogy.core.invocator.ui.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;

import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.parts.AbstractFormPropertiesPart;
import ca.gc.asc_csa.apogy.core.invocator.ui.ProgramArgumentsPartSelection;

public class ProgramDetailsPart extends AbstractFormPropertiesPart {
	@Override
	protected boolean isReadOnly() {
		return true;
	}

	@Override
	protected List<String> getSelectionProvidersIds() {
		List<String> ids = new ArrayList<>();

		ids.add("ca.gc.asc_csa.apogy.rcp.part.ProgramArgumentsPart");

		return ids;
	}

	@Override
	protected List<ISelectionListener> getSelectionListeners() {
		List<ISelectionListener> listeners = new ArrayList<ISelectionListener>();

		listeners.add(new ISelectionListener() {
			@Override
			public void selectionChanged(MPart part, Object selection) {
				if (selection instanceof ProgramArgumentsPartSelection) {
					setEObject(((ProgramArgumentsPartSelection) selection).getEObject());
				}
			}
		});

		return listeners;
	}
}