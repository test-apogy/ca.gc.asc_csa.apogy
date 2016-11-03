package ca.gc.asc_csa.apogy.rcp.emf.transaction;
import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;

public class ApogyEditingDomainListener extends ResourceSetListenerImpl implements ResourceSetListener {
	
	@Inject IEventBroker eventBroker;
	
	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		System.out.println("ApogyEditingDomainListener.resourceSetChanged()");

		System.out.println("ApogyEditingDomainListener.resourceSetChanged(): eventBroker = " + eventBroker);
		if (eventBroker != null){
			eventBroker.send(UIEvents.REQUEST_ENABLEMENT_UPDATE_TOPIC, "ca.gc.asc_csa.apogy.rcp.handler.save");
		}
	}
}