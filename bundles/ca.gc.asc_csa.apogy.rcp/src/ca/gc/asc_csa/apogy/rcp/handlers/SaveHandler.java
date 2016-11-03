package ca.gc.asc_csa.apogy.rcp.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;

import ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade;

public class SaveHandler {

	@Execute
	public void execute(){
		try {
			ApogyWorkspaceFacade.INSTANCE.saveActiveApogyProject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@CanExecute
	public boolean canExecute(){
		return true;
	}
}