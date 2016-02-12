package ca.gc.asc_csa.apogy.examples.satellite.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities;
import ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade;

public class ImportConstellationRequestsCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		AbstractConstellation constellation = (AbstractConstellation) ApogyCoreInvocatorFacade.INSTANCE.getInstance(ApogyExamplesSatelliteUiFacade.INSTANCE.getConstellationVariable());
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
		
		ConstellationUtilities.INSTANCE.addAllRequests((ConstellationRequestsList)selections.next(), constellation.importConstellationRequests(""));
		return null;
	}
}
