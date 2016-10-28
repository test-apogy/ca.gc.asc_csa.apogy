package ca.gc.asc_csa.apogy.rcp.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.workspace.ui.composites.RegisteredProjectsListComposite;
import ca.gc.asc_csa.apogy.workspace.ui.composites.WorkspaceProjectsListComposite;

public class IntroPart {
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
		
		Section sctnNewSectionOverview = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnNewSectionOverview.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		sctnNewSectionOverview.setFont(SWTResourceManager.getFont("Ubuntu", 25, SWT.BOLD));
		GridData gd_sctnNewSectionDescription = new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1);
		gd_sctnNewSectionDescription.widthHint = 278;
		sctnNewSectionOverview.setLayoutData(gd_sctnNewSectionDescription);
		formToolkit.paintBordersFor(sctnNewSectionOverview);
		sctnNewSectionOverview.setText("Apogy");
		
		Composite compositeOverview = formToolkit.createComposite(sctnNewSectionOverview, SWT.NONE);
		formToolkit.paintBordersFor(compositeOverview);
		sctnNewSectionOverview.setClient(compositeOverview);
		compositeOverview.setLayout(new GridLayout(1, false));
		
		FormText formText = formToolkit.createFormText(compositeOverview, false);
		GridData gd_formText = new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1);
		gd_formText.minimumHeight = 100;
		gd_formText.heightHint = 62;
		formText.setLayoutData(gd_formText);
		formText.marginHeight = 2;
		formToolkit.paintBordersFor(formText);
		formText.setText("Apogy is a multi-mission operations and planning software framework. Apogy uses Eclipse Modeling Framework models to define the systems being controlled, the environment in which these systems are operated, the operations being carried out and the corresponding data produced during operations.", false, false);
		
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
		
		Section sctnSupport = formToolkit.createSection(parent, Section.TWISTIE | Section.TITLE_BAR);
		sctnSupport.setFont(SWTResourceManager.getFont("Ubuntu", 18, SWT.BOLD));
		GridData gd_sctnSupport = new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1);
		gd_sctnSupport.widthHint = 452;
		sctnSupport.setLayoutData(gd_sctnSupport);
		formToolkit.paintBordersFor(sctnSupport);
		sctnSupport.setText("Help");
		
		Composite composite_2 = formToolkit.createComposite(sctnSupport, SWT.NONE);
		formToolkit.paintBordersFor(composite_2);
		sctnSupport.setClient(composite_2);
		composite_2.setLayout(new GridLayout(1, false));
			
		ImageHyperlink helpHyperLink = formToolkit.createImageHyperlink(composite_2, SWT.NONE);
		helpHyperLink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
//				parent.getShell().getWorkbench().getHelpSystem().displayHelpResource(Constants.APOGY_DOC_TOC_LOCATION);
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		helpHyperLink.setToolTipText("Browse the Apogy documentation.");
		helpHyperLink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(helpHyperLink);
		helpHyperLink.setText("Help");
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
