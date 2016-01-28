package ca.gc.asc_csa.apogy.core.invocator.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import org.eclipse.ui.handlers.HandlerUtil;

public class VariableInstancesCollectInitializationDataCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Iterator<?> selections = ((IStructuredSelection) HandlerUtil
				.getActiveMenuSelection(event)).iterator();
				
		TransactionalEditingDomain transactionalEditingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
		
		RecordingCommand command = new RecordingCommand(transactionalEditingDomain) {
			
			@Override
			protected void doExecute() {
				
				while (selections.hasNext()) {
					final Object selection = selections.next();

					if (selection instanceof Environment) {						
						ApogyCoreInvocatorFacade.INSTANCE
						.collectInitializationData((Environment) selection);
					}
				}
				
			}
		};
		
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
		domain.getCommandStack().execute(command);
		
		return null;
	}
}
