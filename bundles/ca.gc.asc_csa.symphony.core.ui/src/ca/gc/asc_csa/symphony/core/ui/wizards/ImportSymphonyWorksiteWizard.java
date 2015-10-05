package ca.gc.asc_csa.symphony.core.ui.wizards;

import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.symphony.core.AbstractWorksite;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.core.SymphonyEnvironment;
import ca.gc.asc_csa.symphony.core.WorksiteContributor;
import ca.gc.asc_csa.symphony.core.ui.Activator;

public class ImportSymphonyWorksiteWizard extends Wizard implements INewWizard {
	private SymphonyWorksiteSelectionWizardPage page;

	/**
	 * Constructor for NewSymphonySessionWizard.
	 */
	public ImportSymphonyWorksiteWizard() {
		super();
		setWindowTitle("Import Symphony Worksite");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID,
				"icons/wizban/symphony_import_worksite.png");
		setDefaultPageImageDescriptor(image);
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		page = new SymphonyWorksiteSelectionWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {

		WorksiteContributor worksiteContributor = page.getWorksiteContributor();

		try {
			List<EObject> content = EMFEcoreFacade.INSTANCE
					.getContent(worksiteContributor.uri);
			AbstractWorksite worksite = (AbstractWorksite) content.get(0);

			InvocatorSession session = EMFEcoreInvocatorFacade.INSTANCE
					.getActiveInvocatorSession();
			SymphonyEnvironment environment = (SymphonyEnvironment) session
					.getEnvironment();

			/**
			 * Create and Execute Command Stack Command.
			 */
			EditingDomain editingDomain = AdapterFactoryEditingDomain
					.getEditingDomainFor(session);

			CompoundCommand command = new CompoundCommand();
			command.append(new AddCommand(editingDomain, environment
					.getWorksitesList(),
					SymphonyCorePackage.Literals.WORKSITES_LIST__WORKSITES,
					worksite));

			command.append(new SetCommand(
					editingDomain,
					environment,
					SymphonyCorePackage.Literals.SYMPHONY_ENVIRONMENT__ACTIVE_WORKSITE,
					worksite));
			editingDomain.getCommandStack().execute(command);

		} catch (Throwable e) {
			Logger.INSTANCE.log(Activator.ID, this, "Unable to load the worksite " + worksiteContributor.uri.toString(), EventSeverity.ERROR, e);			
			return false;
		}

		return true;
	}
}