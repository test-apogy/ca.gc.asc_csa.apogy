package ca.gc.asc_csa.apogy.rcp.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.command.BasicCommandStack;

import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.rcp.Activator;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade;

public class SaveHandler {

	@Execute
	public void execute(){
		try {
			ApogyWorkspaceFacade.INSTANCE.saveActiveApogyProject();			
		} catch (Exception e) {
			Logger.INSTANCE.log(Activator.ID, "Problems while saving " + ApogyWorkspaceFacade.INSTANCE.getActiveProject().getName() + ">", EventSeverity.ERROR, e);
		}
	}
	
	@CanExecute
	public boolean canExecute(){
		boolean saveNeeded = ((BasicCommandStack)ApogyCommonEmfTransactionFacade.INSTANCE.getDefaultEditingDomain().getCommandStack()).isSaveNeeded();
		return saveNeeded;
	}
}