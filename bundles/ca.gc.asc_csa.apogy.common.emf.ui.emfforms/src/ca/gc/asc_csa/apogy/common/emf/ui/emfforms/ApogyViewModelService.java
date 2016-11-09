package ca.gc.asc_csa.apogy.common.emf.ui.emfforms;

import org.eclipse.emf.ecp.ui.view.swt.DefaultReferenceService;

public class ApogyViewModelService extends DefaultReferenceService{

	public ApogyViewModelService() {
		super();
	}
	
	@Override
	public int getPriority() {
		return 5;
	}
}