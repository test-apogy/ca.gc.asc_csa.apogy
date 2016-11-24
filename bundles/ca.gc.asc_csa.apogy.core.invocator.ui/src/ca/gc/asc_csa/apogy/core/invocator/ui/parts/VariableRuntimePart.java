package ca.gc.asc_csa.apogy.core.invocator.ui.parts;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractEObjectSelectionPart;
import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.ui.VariablesListPartSelection;

public class VariableRuntimePart extends AbstractEObjectSelectionPart {
	private AdapterImpl adapter;
	private Context activeContext;
	private Variable variable;

	@Inject
	@Optional
	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) VariablesListPartSelection selection) {
		if (selection != null) {
			variable = selection.getVariable();
			setEObject(selection.getVariable());
		}
	}
	
	
	@Override
	protected void createContentComposite(Composite parent, int style) {
		new EObjectComposite(parent, SWT.None);
	}
	
	@Override
	protected void setCompositeContents(EObject eObject) {	
		activeContext = variable
				.getEnvironment()
				.getActiveContext();
		activeContext.eAdapters().add(getAdapter());
		
		variable.getEnvironment().eAdapters().add(getAdapter());
		
		if(this.variable.getEnvironment().getActiveContext().isVariablesInstantiated()){
			((EObjectComposite)getActualComposite()).setEObject(eObject);
		}else{
			//Set a NoContentComposite if the variables are not instantiated
			setNoContentComposite();
		}
		
	}	

	@Override
	protected void createNoContentComposite(Composite parent, int style) {
		if (this.variable != null) {
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
	
	private Adapter getAdapter(){
		if (adapter == null){
			adapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					if(msg.getNotifier() instanceof Environment)
					{
						if (msg.getFeatureID(
								Environment.class) == ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT) {
							if(activeContext != null){
								activeContext.eAdapters().remove(getAdapter());
							}
							if(msg.getNewValue() != null ){
								((Context) msg.getNewValue()).eAdapters().add(getAdapter());
							}
							setEObject(variable);
						}
					}
					
					if(msg.getNotifier() instanceof Context)
					{
						if(msg.getFeatureID(Context.class) == ApogyCoreInvocatorPackage.CONTEXT__VARIABLES_INSTANTIATED){
							if((boolean)msg.getNewValue() == true){
								setEObject(variable);
							}else{
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
		if (variable != null) {
			variable.getVariablesList().getEnvironment().eAdapters().remove(getAdapter());
		}
		if (activeContext != null) {
			activeContext.eAdapters().remove(getAdapter());
		}
	}
}
