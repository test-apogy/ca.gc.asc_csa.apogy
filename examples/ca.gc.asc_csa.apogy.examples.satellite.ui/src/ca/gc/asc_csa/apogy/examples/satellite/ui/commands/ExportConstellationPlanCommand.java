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
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade;

public class ExportConstellationPlanCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		AbstractConstellation constellation = (AbstractConstellation) ApogyCoreInvocatorFacade.INSTANCE.getInstance(ApogyExamplesSatelliteUiFacade.INSTANCE.getConstellationVariable());
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
		
		while (selections.hasNext()) {
			ConstellationCommandPlan plan = (ConstellationCommandPlan) selections.next();
			
			if (constellation != null) {
				constellation.export(plan, "");
			}
		}
		return null;
	}
}
