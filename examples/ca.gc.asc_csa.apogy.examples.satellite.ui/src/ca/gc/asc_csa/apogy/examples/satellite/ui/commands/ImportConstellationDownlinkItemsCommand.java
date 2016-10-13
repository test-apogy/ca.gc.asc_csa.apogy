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
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink;
import ca.gc.asc_csa.apogy.examples.satellite.ui.Activator;
import ca.gc.asc_csa.apogy.examples.satellite.ui.Constants;

public class ImportConstellationDownlinkItemsCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		/* Look for preferences. */
		Preferences preferences = ConfigurationScope.INSTANCE.getNode(Activator.PLUGIN_ID);
		String default_url = preferences.get(Constants.DEFAULT_IMPORT_DOWNLINK_ITEMS_URL, System.getProperty("user.home"));

		/* Open File Dialog. */
		DirectoryDialog dialog = new DirectoryDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), SWT.OPEN);
		dialog.setText("Select the downlink directory to import");

		dialog.setFilterPath(default_url);
		String result = dialog.open();

		if (result != null) {
			/* Import the requests. */
			ConstellationDownlink constellationDownlink = (ConstellationDownlink) selections.next();
			List<AbstractConstellationDownlinkItem> downlinks = constellationDownlink.getConstellationDownlinksList().getConstellationState()
					.importConstellationDownlinkItems(result);
			if (downlinks != null) {
				EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(constellationDownlink);
				if (domain != null) {
					Command command = AddCommand.create(domain, constellationDownlink,
							ApogyExamplesSatellitePackage.eINSTANCE.getConstellationRequestsList_ConstellationRequests(),
							downlinks);
					domain.getCommandStack().execute(command);
				} else {
					constellationDownlink.getDownlinkItems().addAll(downlinks);
				}
			}

			/* Save the preferences. */
			Path path = Paths.get(result);
			String dirname = result.substring(0, result.indexOf(path.getFileName().toString()));
			preferences.put(Constants.DEFAULT_IMPORT_DOWNLINK_ITEMS_URL, dirname);
			try {
				preferences.flush();
			} catch (BackingStoreException e2) {
				e2.printStackTrace();
			}

		}
		return null;
	}
}