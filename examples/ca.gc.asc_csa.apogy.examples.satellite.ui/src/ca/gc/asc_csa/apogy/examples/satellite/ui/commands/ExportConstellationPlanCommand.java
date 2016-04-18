/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.ui.commands;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

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

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.ui.Activator;
import ca.gc.asc_csa.apogy.examples.satellite.ui.Constants;

public class ExportConstellationPlanCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
		
		/* Look for preferences. */
		Preferences preferences = ConfigurationScope.INSTANCE.getNode(Activator.PLUGIN_ID);
		String default_url = preferences.get(Constants.DEFAULT_EXPORT_PLAN_URL, System.getProperty("user.home"));

		/* Open File Dialog. */
		FileDialog dialog = new FileDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), SWT.SAVE);
		dialog.setText("Select the requests file to import");
		dialog.setFilterNames(new String[]{"Plan Files", "All Files (*)"});		
		if (SWT.getPlatform().equals("win32")){
			dialog.setFilterExtensions(new String[] { "*.plan", "*.*" });
		}else{
			dialog.setFilterExtensions(new String[] { "*.plan", "*" });	
		}
		
		dialog.setFilterPath(default_url);
		String result = dialog.open();

		if (result != null) {
			AbstractConstellationCommandPlan plan = (AbstractConstellationCommandPlan) selections.next();
			plan.getConstellationState().export(plan, result);

			/* Save the preferences. */
			Path path = Paths.get(result);
			String dirname = result.substring(0, result.indexOf(path.getFileName().toString()));			
			preferences.put(Constants.DEFAULT_EXPORT_PLAN_URL, dirname);
			try {
				preferences.flush();
			} catch (BackingStoreException e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}
}
