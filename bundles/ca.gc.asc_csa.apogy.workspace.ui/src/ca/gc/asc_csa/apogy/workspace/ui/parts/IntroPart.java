package ca.gc.asc_csa.apogy.workspace.ui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.wizard.WizardDialog;
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

import ca.gc.asc_csa.apogy.workspace.ui.wizards.ImportRegisteredApogyProjectWizard;
import ca.gc.asc_csa.apogy.workspace.ui.wizards.NewApogyProjectWizard;
import ca.gc.asc_csa.apogy.workspace.ui.wizards.OpenApogyProjectWizard;

public class IntroPart {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		GridLayout gl_parent = new GridLayout(2, true);
		gl_parent.verticalSpacing = 10;
		parent.setLayout(gl_parent);
		
		Section sctnNewSectionOverview = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnNewSectionOverview.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
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
		
		Section sctnSession = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnSession.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		sctnSession.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		sctnSession.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		formToolkit.paintBordersFor(sctnSession);
		sctnSession.setText("Session");
		sctnSession.setExpanded(true);
		
		Composite compositeOpen = formToolkit.createComposite(sctnSession, SWT.NONE);
		formToolkit.paintBordersFor(compositeOpen);
		sctnSession.setClient(compositeOpen);
		GridLayout gl_composite_1 = new GridLayout(1, false);
		compositeOpen.setLayout(gl_composite_1);
		
		ImageHyperlink newProjectHyperlink = formToolkit.createImageHyperlink(compositeOpen, SWT.NONE);
		newProjectHyperlink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
				new WizardDialog(parent.getShell(), new NewApogyProjectWizard()).open();
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		newProjectHyperlink.setToolTipText("Create a new Apogy project.");
		newProjectHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(newProjectHyperlink);
		newProjectHyperlink.setText("New");
		
		ImageHyperlink openProjectHyperlink = formToolkit.createImageHyperlink(compositeOpen, SWT.NONE);
		openProjectHyperlink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
				new WizardDialog(parent.getShell(), new OpenApogyProjectWizard()).open();
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		openProjectHyperlink.setToolTipText("Open an existing Apogy project.");
		openProjectHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(openProjectHyperlink);
		openProjectHyperlink.setText("Open");
		
		ImageHyperlink closeProjectHyperlink = formToolkit.createImageHyperlink(compositeOpen, SWT.NONE);
		closeProjectHyperlink.setToolTipText("Close the active Apogy project.");
		closeProjectHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		closeProjectHyperlink.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.paintBordersFor(closeProjectHyperlink);
		closeProjectHyperlink.setText("Close");
		
		Section sctnSupport = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnSupport.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		sctnSupport.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolkit.paintBordersFor(sctnSupport);
		sctnSupport.setText("Support");
		
		Composite composite_2 = formToolkit.createComposite(sctnSupport, SWT.NONE);
		formToolkit.paintBordersFor(composite_2);
		sctnSupport.setClient(composite_2);
		composite_2.setLayout(new GridLayout(1, false));
		
		ImageHyperlink examplesHyperlink = formToolkit.createImageHyperlink(composite_2, SWT.NONE);
		examplesHyperlink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		examplesHyperlink.setToolTipText("Import an Apogy project example.");
		examplesHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		examplesHyperlink.setImage(null);
		formToolkit.paintBordersFor(examplesHyperlink);
		examplesHyperlink.setText("Examples");
		
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
		
		
		
		Section sctnImport = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnImport.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		sctnImport.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolkit.paintBordersFor(sctnImport);
		sctnImport.setText("Import");
		
		Composite composite = formToolkit.createComposite(sctnImport, SWT.NONE);
		sctnImport.setClient(composite);
		formToolkit.paintBordersFor(composite);
		composite.setLayout(new GridLayout(1, false));
		
		ImageHyperlink importDirectoryProjectHyperlink = formToolkit.createImageHyperlink(composite, SWT.NONE);
		importDirectoryProjectHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(importDirectoryProjectHyperlink);
		importDirectoryProjectHyperlink.setText("Directory");
		
		ImageHyperlink importArchiveProjectHyperlink = formToolkit.createImageHyperlink(composite, SWT.NONE);
		importArchiveProjectHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(importArchiveProjectHyperlink);
		importArchiveProjectHyperlink.setText("Archive");
		
		ImageHyperlink importRegisteredProjectHyperlink = formToolkit.createImageHyperlink(composite, SWT.NONE);
		importRegisteredProjectHyperlink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
				new WizardDialog(parent.getShell(), new ImportRegisteredApogyProjectWizard()).open();
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		importRegisteredProjectHyperlink.setToolTipText("Import an Apogy existing project into the current workspace.");
		importRegisteredProjectHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(importRegisteredProjectHyperlink);
		importRegisteredProjectHyperlink.setText("Registered");
		
		Section sctnExport = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnExport.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		sctnExport.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		sctnExport.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolkit.paintBordersFor(sctnExport);
		sctnExport.setText("Export");
		sctnExport.setExpanded(true);
		
		Composite compositeExport = formToolkit.createComposite(sctnExport, SWT.NONE);
		formToolkit.paintBordersFor(compositeExport);
		sctnExport.setClient(compositeExport);
		GridLayout gl_compositeExport = new GridLayout(1, false);
		compositeExport.setLayout(gl_compositeExport);
		
		ImageHyperlink exportProjectDirectoryHyperlink = formToolkit.createImageHyperlink(compositeExport, SWT.NONE);
		exportProjectDirectoryHyperlink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		exportProjectDirectoryHyperlink.setToolTipText("Export the active Apogy project.");
		exportProjectDirectoryHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(exportProjectDirectoryHyperlink);
		exportProjectDirectoryHyperlink.setText("Directory");
		
		ImageHyperlink exportProjectArchiveHyperlink = formToolkit.createImageHyperlink(compositeExport, SWT.NONE);
		exportProjectArchiveHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(exportProjectArchiveHyperlink);
		exportProjectArchiveHyperlink.setText("Archive");
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
	}
}
