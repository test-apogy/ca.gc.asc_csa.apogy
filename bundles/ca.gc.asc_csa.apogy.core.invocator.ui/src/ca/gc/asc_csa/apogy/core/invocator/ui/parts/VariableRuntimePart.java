package ca.gc.asc_csa.apogy.core.invocator.ui.parts;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractEObjectSelectionPart;
import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory;
import ca.gc.asc_csa.apogy.core.invocator.ui.VariableRuntimePartSelection;
import ca.gc.asc_csa.apogy.core.invocator.ui.VariablesListPartSelection;

public class VariableRuntimePart extends AbstractEObjectSelectionPart {
	private AdapterImpl adapter;
	private Context activeContext;
	private VariableFeatureReference variableFeatureReference;
	
	@Override
	protected void createContentComposite(Composite parent, int style) {
		new EObjectComposite(parent, SWT.None){
			@Override
			protected void newSelection(ISelection selection) {
				if (selection.isEmpty()){
					setNullSelection();					
				}else {
					EObject eObject = ((EObjectComposite)getActualComposite()).getSelectedEObject();
					if (eObject != null) {
						VariableRuntimePartSelection selectionSent = ApogyCoreInvocatorUIFactory.eINSTANCE
								.createVariableRuntimePartSelection();
						selectionSent.setEObject(eObject);

						selectionService.setSelection(selectionSent);
					}
				}
			}
		};
	}
	
	@Override
	protected void setNullSelection() {
		selectionService.setSelection(ApogyCoreInvocatorUIFactory.eINSTANCE.createVariableRuntimePartSelection());
	}

	@Override
	protected void setCompositeContents(EObject eObject) {
		activeContext = variableFeatureReference.getVariable().getEnvironment().getActiveContext();
		activeContext.eAdapters().add(getAdapter());
		variableFeatureReference.getVariable().getEnvironment().eAdapters().add(getAdapter());

		if (this.variableFeatureReference.getVariable().getEnvironment().getActiveContext().isVariablesInstantiated()) {
			((EObjectComposite) getActualComposite())
					.setEObject(ApogyCoreInvocatorFacade.INSTANCE.getInstance((VariableFeatureReference) eObject));
		} else {
			// Set a NoContentComposite if the variables are not instantiated
			setNoContentComposite();
		}

	}

	@Override
	protected void createNoContentComposite(Composite parent, int style) {
		if (this.variableFeatureReference != null) {
			new NoContentComposite(parent, style) {
				@Override
				protected String getMessage() {
					return "Variables not instantiated";
				}
			};
		} else {
			super.createNoContentComposite(parent, style);
		}
	}

	private Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getNotifier() instanceof Environment) {
						if (msg.getFeatureID(
								Environment.class) == ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT) {
							if (activeContext != null) {
								activeContext.eAdapters().remove(getAdapter());
							}
							if (msg.getNewValue() != null) {
								((Context) msg.getNewValue()).eAdapters().add(getAdapter());
							}
							setEObject(variableFeatureReference);
						}
					}

					if (msg.getNotifier() instanceof Context) {
						if (msg.getFeatureID(
								Context.class) == ApogyCoreInvocatorPackage.CONTEXT__VARIABLES_INSTANTIATED) {
							if ((boolean) msg.getNewValue() == true) {
								setEObject(variableFeatureReference);
							} else {
								setEObject(null);
							}
						}
					}

				}
			};
		}
		return adapter;
	}

	@PreDestroy
	public void dispose() {
		if (variableFeatureReference.getVariable() != null) {
			variableFeatureReference.getVariable().getVariablesList().getEnvironment().eAdapters().remove(getAdapter());
		}
		if (activeContext != null) {
			activeContext.eAdapters().remove(getAdapter());
		}
	}

	@Override
	protected List<String> getSelectionProvidersIds() {
		List<String> ids = new ArrayList<>();
		
		ids.add("ca.gc.asc_csa.apogy.rcp.part.VariablesListPart");
		
		return ids;
	}

	@Override
	protected List<ISelectionListener> getSelectionListeners() {
		List<ISelectionListener> listeners = new ArrayList<ISelectionListener>();
		
		listeners.add(new ISelectionListener() {
			@Override
			public void selectionChanged(MPart part, Object selection) {
				if (selection instanceof VariablesListPartSelection) {
					variableFeatureReference = ((VariablesListPartSelection)selection).getVariableFeatureReference();
					setEObject(variableFeatureReference);
				}
			}
		});
	
		return listeners;
	}
}