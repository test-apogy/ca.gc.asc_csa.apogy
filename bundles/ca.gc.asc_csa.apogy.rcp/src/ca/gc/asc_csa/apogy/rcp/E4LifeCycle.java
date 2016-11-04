package ca.gc.asc_csa.apogy.rcp;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.e4.ui.workbench.lifecycle.PreSave;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessAdditions;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessRemovals;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;

import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade;

/**
 * This is a stub implementation containing e4 LifeCycle annotated methods.<br />
 * There is a corresponding entry in <em>plugin.xml</em> (under the
 * <em>org.eclipse.core.runtime.products' extension point</em>) that references
 * this class.
 **/
@SuppressWarnings("restriction")
public class E4LifeCycle {

	private ResourceSetListener resourceSetListener;
	private IEclipseContext workbenchContext;
	private AdapterImpl workspaceAdapter;

	@PostContextCreate
	void postContextCreate(IEclipseContext workbenchContext) {		
		this.workbenchContext = workbenchContext;
		ApogyCommonEmfTransactionFacade.INSTANCE.getDefaultEditingDomain().addResourceSetListener(getResourceSetListener());
		ApogyWorkspaceFacade.INSTANCE.eAdapters().add(getWorkspaceAdapter());
	}

	@PreSave
	void preSave(IEclipseContext workbenchContext) {
	}

	@ProcessAdditions
	void processAdditions(IEclipseContext workbenchContext) {
	}

	@ProcessRemovals
	void processRemovals(IEclipseContext workbenchContext) {
	}

	private ResourceSetListener getResourceSetListener() {
		if (resourceSetListener == null){
			resourceSetListener = new ResourceSetListenerImpl(){
				@Override
				public void resourceSetChanged(ResourceSetChangeEvent event) {
					processEvent();
				}
			};
		}
		return resourceSetListener;
	}
	
	private void processEvent(){
		IEventBroker eventBroker = (IEventBroker) this.workbenchContext.get(IEventBroker.class.getName());
		eventBroker.send(UIEvents.REQUEST_ENABLEMENT_UPDATE_TOPIC, UIEvents.ALL_ELEMENT_ID);
	}
		
	private Adapter getWorkspaceAdapter() {
		if (workspaceAdapter == null){
			workspaceAdapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					processEvent();
				}
			};
		}
		return workspaceAdapter;
	}
}
