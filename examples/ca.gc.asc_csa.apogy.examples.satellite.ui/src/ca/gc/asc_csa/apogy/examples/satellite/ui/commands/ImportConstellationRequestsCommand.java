package ca.gc.asc_csa.apogy.examples.satellite.ui.commands;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.ui.Activator;
import ca.gc.asc_csa.apogy.examples.satellite.ui.Constants;

public class ImportConstellationRequestsCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		/* Look for preferences. */
		Preferences preferences = ConfigurationScope.INSTANCE.getNode(Activator.PLUGIN_ID);
		String default_url = preferences.get(Constants.DEFAULT_IMPORT_REQUESTS_URL, System.getProperty("user.home"));

		/* Open File Dialog. */
		FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), SWT.OPEN);
		dialog.setText("Select the requests file to import");
		
		if (SWT.getPlatform().equals("win32")){
			dialog.setFilterExtensions(new String[] { "*.reqs", "*.*" });
		}else{
			dialog.setFilterExtensions(new String[] { "*.reqs", "*" });
		}
		
		dialog.setFilterPath(default_url);
		String result = dialog.open();

		if (result != null) {
			/* Import the requests. */
			ConstellationRequestsList constellationRequestsList = (ConstellationRequestsList) selections.next();
			List<AbstractConstellationRequest> requests = constellationRequestsList.getConstellationState()
					.importConstellationRequests(result);
			if (requests != null) {
				constellationRequestsList.getConstellationRequests().addAll(requests);
			}

			/* Save the preferences. */
			Path path = Paths.get(result);
			String dirname = result.substring(0, result.indexOf(path.getFileName().toString()));			
			preferences.put(Constants.DEFAULT_IMPORT_REQUESTS_URL, dirname);
			try {
				preferences.flush();
			} catch (BackingStoreException e2) {
				e2.printStackTrace();
			}

		}
		return null;
	}
}