package ca.gc.asc_csa.apogy.rcp.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.core.ui.wizards.NewApogyProjectWizard;
import ca.gc.asc_csa.apogy.doc.Constants;
import org.eclipse.swt.widgets.Label;

public class IntroPart {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.verticalSpacing = 10;
		parent.setLayout(gl_parent);
		
		Section sctnNewSectionOverview = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnNewSectionOverview.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		sctnNewSectionOverview.setFont(SWTResourceManager.getFont("Ubuntu", 25, SWT.BOLD));
		GridData gd_sctnNewSectionDescription = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
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
		
		Section sctnNewSectionTodo = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnNewSectionTodo.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		sctnNewSectionTodo.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		sctnNewSectionTodo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		formToolkit.paintBordersFor(sctnNewSectionTodo);
		sctnNewSectionTodo.setText("What would you like to do?");
		sctnNewSectionTodo.setExpanded(true);
		
		Composite compositeTodo = formToolkit.createComposite(sctnNewSectionTodo, SWT.NONE);
		formToolkit.paintBordersFor(compositeTodo);
		sctnNewSectionTodo.setClient(compositeTodo);
		GridLayout gl_composite_1 = new GridLayout(1, false);
		gl_composite_1.verticalSpacing = 20;
		compositeTodo.setLayout(gl_composite_1);
		
		formToolkit.createLabel(compositeTodo, "", SWT.NONE);
		
		ImageHyperlink newProjectHyperlink = formToolkit.createImageHyperlink(compositeTodo, SWT.NONE);
		newProjectHyperlink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
				new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), new NewApogyProjectWizard()).open();
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		newProjectHyperlink.setToolTipText("Create a new Apogy project.");
		newProjectHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(newProjectHyperlink);
		newProjectHyperlink.setText("New Project");
		
		ImageHyperlink openProjectHyperlink = formToolkit.createImageHyperlink(compositeTodo, SWT.NONE);
		openProjectHyperlink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		openProjectHyperlink.setToolTipText("Open an existing Apogy project.");
		openProjectHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(openProjectHyperlink);
		openProjectHyperlink.setText("Open Project");
		
		Label label_1 = formToolkit.createSeparator(compositeTodo, SWT.HORIZONTAL);
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		
		ImageHyperlink importProjectHyperlink = formToolkit.createImageHyperlink(compositeTodo, SWT.NONE);
		importProjectHyperlink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		importProjectHyperlink.setToolTipText("Import an Apogy existing project into the current workspace.");
		importProjectHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(importProjectHyperlink);
		importProjectHyperlink.setText("Import Project");
		
		ImageHyperlink exportProjectHyperlink = formToolkit.createImageHyperlink(compositeTodo, SWT.NONE);
		exportProjectHyperlink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		exportProjectHyperlink.setToolTipText("Export the active Apogy project.");
		exportProjectHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(exportProjectHyperlink);
		exportProjectHyperlink.setText("Export Project");
		
		Label label = formToolkit.createSeparator(compositeTodo, SWT.HORIZONTAL);
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		
		ImageHyperlink examplesHyperlink = formToolkit.createImageHyperlink(compositeTodo, SWT.NONE);
		examplesHyperlink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
			}
			public void linkEntered(HyperlinkEvent e) {
			}
			public void linkExited(HyperlinkEvent e) {
			}
		});
		examplesHyperlink.setToolTipText("Open an Apogy project example.");
		examplesHyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		examplesHyperlink.setImage(null);
		formToolkit.paintBordersFor(examplesHyperlink);
		examplesHyperlink.setText("Examples");
		
		ImageHyperlink helpHyperLink = formToolkit.createImageHyperlink(compositeTodo, SWT.NONE);
		helpHyperLink.addHyperlinkListener(new IHyperlinkListener() {
			public void linkActivated(HyperlinkEvent e) {
				PlatformUI.getWorkbench().getHelpSystem().displayHelpResource(Constants.APOGY_DOC_TOC_LOCATION);
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
	}

	@Focus
	public void setFocus() {
	}
}
