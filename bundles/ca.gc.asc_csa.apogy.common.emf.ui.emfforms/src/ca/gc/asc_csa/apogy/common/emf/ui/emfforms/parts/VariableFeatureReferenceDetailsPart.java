package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.parts;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;

import ca.gc.asc_csa.apogy.core.invocator.ui.VariableRuntimePartSelection;

public class VariableFeatureReferenceDetailsPart extends AbstractFormPropertiesPart {
	/**
	 * Injections for the different selections in the part from the TODO
	 * {@link ESelectionService}
	 *
	 **/
	@Inject
	@Optional
	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) VariableRuntimePartSelection selection) {
		if (selection != null) {
			setEObject(selection.getEObject());
		}
	}

	@Override
	boolean isReadOnly() {
		return true;
	}

	@Override
	protected List<String> getSelectionProvidersIds() {
		List<String> ids = new ArrayList<>();

		ids.add("ca.gc.asc_csa.apogy.rcp.part.VariableRuntimePart");

		return ids;
	}

	@Override
	protected List<ISelectionListener> getSelectionListeners() {
		List<ISelectionListener> listeners = new ArrayList<ISelectionListener>();

		listeners.add(new ISelectionListener() {
			@Override
			public void selectionChanged(MPart part, Object selection) {
				if (selection instanceof VariableRuntimePartSelection) {
					setSelection((VariableRuntimePartSelection) selection);
				}
			}
		});

		return listeners;
	}
}