package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.services;

import org.eclipse.emf.ecp.ui.view.swt.DefaultReferenceService;

public class ApogyReferenceService extends DefaultReferenceService{

	public ApogyReferenceService() {
		super();
	}
	
	@Override
	public int getPriority() {
		return 5;
	}
}