package ca.gc.asc_csa.apogy.workspace.ui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.workspace.ui.composites.RegisteredProjectsListComposite;
import ca.gc.asc_csa.apogy.workspace.ui.composites.WorkspaceProjectsListComposite;

public class ProjectsPart {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private RegisteredProjectsListComposite registeredProjectsListComposite;
	private WorkspaceProjectsListComposite workspaceProjectsListComposite;

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		GridLayout gl_parent = new GridLayout(2, true);
		gl_parent.verticalSpacing = 10;
		parent.setLayout(gl_parent);
		
		Section sctnWorkspace = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnWorkspace.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		sctnWorkspace.setFont(SWTResourceManager.getFont("Ubuntu", 18, SWT.BOLD));
		sctnWorkspace.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		formToolkit.paintBordersFor(sctnWorkspace);
		sctnWorkspace.setText("Workspace");
		
		workspaceProjectsListComposite = new WorkspaceProjectsListComposite(sctnWorkspace, SWT.NONE);
		GridLayout gridLayout = (GridLayout) workspaceProjectsListComposite.getLayout();
		gridLayout.marginWidth = 0;
		formToolkit.adapt(workspaceProjectsListComposite);
		formToolkit.paintBordersFor(workspaceProjectsListComposite);
		sctnWorkspace.setClient(workspaceProjectsListComposite);
		
		Section sctnRegistry = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnRegistry.setFont(SWTResourceManager.getFont("Ubuntu", 18, SWT.BOLD));
		sctnRegistry.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolkit.paintBordersFor(sctnRegistry);
		sctnRegistry.setText("Registry");
		
		registeredProjectsListComposite = new RegisteredProjectsListComposite(sctnRegistry, SWT.NONE);
		GridLayout gridLayout_1 = (GridLayout) registeredProjectsListComposite.getLayout();
		gridLayout_1.marginWidth = 0;
		formToolkit.adapt(registeredProjectsListComposite);
		formToolkit.paintBordersFor(registeredProjectsListComposite);
		sctnRegistry.setClient(registeredProjectsListComposite);
	}

	@PreDestroy
	public void dispose() {
		workspaceProjectsListComposite.dispose();
		registeredProjectsListComposite.dispose();
	}

	@Focus
	public void setFocus() {
	}
}
