package ca.gc.asc_csa.apogy.examples.satellite.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation;

public class ImportConstellationRequestsCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) {
			AbstractConstellation constellation = (AbstractConstellation) selections.next();
			
			if (constellation != null) {
				constellation.addAll(constellation.importConstellationRequests(""));
			}
		}
		return null;
	}
}
