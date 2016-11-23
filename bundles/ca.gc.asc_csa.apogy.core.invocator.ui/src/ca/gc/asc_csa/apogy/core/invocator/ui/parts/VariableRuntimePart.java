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

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.ui.VariablesListPartSelection;

public class VariableRuntimePart extends AbstractSessionEObjectPart {
	private AdapterImpl adapter;
	private Environment environment;
	private Context activeContext;

	@Inject
	@Optional
	private void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) VariablesListPartSelection selection) {
		if (selection != null && selection.getVariables() != null && !selection.getVariables().isEmpty()) {
			
			Variable variable = selection.getVariables().get(0);
			
			EObject eObject = ApogyCoreInvocatorFacade.INSTANCE.getInstance(variable);	
			
			/* Listens the environment for change of active context. */
			environment = variable.getEnvironment();
			environment.eAdapters().remove(getAdapter());
			environment.eAdapters().add(getAdapter());
			
			activeContext = variable.getEnvironment().getActiveContext();
			if (activeContext != null){
				if (activeContext.isVariablesInstantiated()){
					setEObjectInComposite(eObject);	
				}else{
					setEObject(null);
				}	
				activeContext.eAdapters().remove(getAdapter());
				activeContext.eAdapters().add(getAdapter());
			}else{
				setEObject(null);
			}
		}
	}
	
	@Override
	protected void newInvocatorSession(InvocatorSession invocatorSession) {
		if (environment != null){
			environment.eAdapters().remove(getAdapter());
		}
		
		if (activeContext != null){
			activeContext.eAdapters().remove(getAdapter());
		}
		
		setEObject(null);
	}
	
	
	
	
	private Adapter getAdapter(){
		if (adapter == null){
			adapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					if(msg.getNotifier() instanceof Environment)
					{
						if(msg.getFeatureID(Environment.class) == ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT){
							if (environment != null){
								environment.eAdapters().remove(getAdapter());
							}
							
							if (activeContext != null){
								activeContext.eAdapters().remove(getAdapter());
							}
							setEObject(null);
						}						
					}
					
					if(msg.getNotifier() instanceof Context)
					{
						if(msg.getFeatureID(Context.class) == ApogyCoreInvocatorPackage.CONTEXT__VARIABLES_INSTANTIATED){
							if (environment != null){
								environment.eAdapters().remove(getAdapter());
							}
							
							if (activeContext != null){
								activeContext.eAdapters().remove(getAdapter());
							}
							setEObject(null);
						}						
					}					
					
				}
			};
		}
		return adapter;
	}
	
	@PreDestroy
	@Override
	protected void dispose() {
		if (environment != null){
			environment.eAdapters().remove(getAdapter());
		}
		
		if (activeContext != null){
			activeContext.eAdapters().remove(getAdapter());
		}
		
		super.dispose();		
	}
}
