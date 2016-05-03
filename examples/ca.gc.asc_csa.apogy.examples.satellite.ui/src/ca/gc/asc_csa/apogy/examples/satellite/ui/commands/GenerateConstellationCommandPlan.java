package ca.gc.asc_csa.apogy.examples.satellite.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.ui.Activator;

public class GenerateConstellationCommandPlan extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
		AbstractConstellationPlanner planner = (AbstractConstellationPlanner) selections.next();
		
		if (planner != null) {
			try {
				new Job("Constellation Planner"){
					@Override
					protected IStatus run(IProgressMonitor monitor) {
						try {
							planner.plan();
							EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(planner);
							if (domain != null){
								domain.getCommandStack().execute(IdentityCommand.INSTANCE);
							}														
						} catch (Exception e) {
							Logger.INSTANCE.log(Activator.PLUGIN_ID, e.getMessage(), EventSeverity.ERROR, e);
						}
						return Status.OK_STATUS;
					}					
				}.schedule();
			} catch (Exception e) {
				Logger.INSTANCE.log(Activator.PLUGIN_ID, e.getMessage(), EventSeverity.ERROR, e);
			}
		}
		return null;
	}
}
