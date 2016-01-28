package ca.gc.asc_csa.apogy.examples.satellite.ui.parts;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.invocator.IVariableListener;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableListenerEventType;
import ca.gc.asc_csa.apogy.core.invocator.listeners.VariableListener;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation;
import ca.gc.asc_csa.apogy.examples.satellite.ui.Activator;
import ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade;
import ca.gc.asc_csa.apogy.examples.satellite.ui.composites.ConstellationDashboardComposite;
import org.eclipse.ui.progress.UIJob;

public class ConstellationDashboardView extends AbstractView implements IEditingDomainProvider {

	/*
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "ca.gc.asc_csa.apogy.examples.satellite.ui.parts.ConstellationDashboardView";

	/*
	 * Reference to the composite.
	 */
	private ConstellationDashboardComposite constellationDashboardComposite;

	/*
	 * Constellation Variable Listener.
	 */
	private VariableListener variableListener;

	/*
	 * Refers to the variable that handles the constellation.
	 */
	private Variable variable;

	/*
	 * The constructor.
	 */
	public ConstellationDashboardView() {
	}

	/*
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		constellationDashboardComposite = new ConstellationDashboardComposite(parent, SWT.NONE);

		/* Get the constellation variable. */
		variable = ApogyExamplesSatelliteUiFacade.INSTANCE.getConstellationVariable();

		if (variable == null) {
			Logger.INSTANCE.log(Activator.PLUGIN_ID,
					"You must define a variable named <"
							+ ApogyExamplesSatelliteUiFacade.INSTANCE.getConstellationVariableName()
							+ "> in the session.",
					EventSeverity.ERROR);
		} else {
			updateConstellationInput(variable);

			/* Listens to active constellation. */
			ApogyCoreInvocatorFacade.INSTANCE.addVariableListener(getVariableListener());
		}
	}

	/*
	 * Listener used to update the UI content when the constellation is
	 * instantiated or cleared.
	 */
	private IVariableListener getVariableListener() {
		if (variableListener == null) {
			variableListener = new VariableListener() {
				@Override
				public void variableListenerNotification(Variable variable, VariableListenerEventType event) {
					if (variable == ConstellationDashboardView.this.variable) {
						updateConstellationInput(variable);
					}
				}
			};
		}
		return variableListener;
	}

	/*
	 * Update the {@link ConstellationDashboardComposite}.
	 */
	private void updateConstellationInput(Variable variable) {
		if (variable != null) {
			/* Displays the active constellation. */
			EObject instance = ApogyCoreInvocatorFacade.INSTANCE.getInstance(variable);
			final AbstractConstellation constellation = 
					instance instanceof AbstractConstellation ? 
							(AbstractConstellation) instance : 
							null;

			new UIJob("Update Constellation Dashboard Input") {
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					constellationDashboardComposite.setConstellation(constellation,
							ApogyExamplesSatelliteUiFacade.INSTANCE.getOperationCallResultsList());
					return Status.OK_STATUS;
				}
			}.schedule();
		}
	}

	/*
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
	}

	@Override
	public void updatePartName() {
	}

	@Override
	public void updateSelection(ISelection selection) {
	}

	@Override
	public EditingDomain getEditingDomain() {
		return AdapterFactoryEditingDomain
				.getEditingDomainFor(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
	}

	@Override
	public void dispose() {
		ApogyCoreInvocatorFacade.INSTANCE.removeVariableListener(getVariableListener());
		super.dispose();
	}
}