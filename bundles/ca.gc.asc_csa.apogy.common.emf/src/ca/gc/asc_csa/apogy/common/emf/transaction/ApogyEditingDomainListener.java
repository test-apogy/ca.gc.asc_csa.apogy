package ca.gc.asc_csa.apogy.common.emf.transaction;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;

public class ApogyEditingDomainListener extends ResourceSetListenerImpl implements ResourceSetListener {
	@Override
	public void resourceSetChanged(ResourceSetChangeEvent event) {
		super.resourceSetChanged(event);
		System.out.println("ApogyEditingDomainListener.resourceSetChanged()");
	}
}