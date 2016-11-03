package ca.gc.asc_csa.apogy.common.emf.transaction;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain.Factory;

public class DefaultApogyEditingDomainFactory implements Factory {

	@Override
	public TransactionalEditingDomain createEditingDomain() {
		return TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
	}

	@Override
	public TransactionalEditingDomain createEditingDomain(ResourceSet rset) {
		return TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rset);
	}

	@Override
	public TransactionalEditingDomain getEditingDomain(ResourceSet rset) {
		return TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(rset);
	}
}