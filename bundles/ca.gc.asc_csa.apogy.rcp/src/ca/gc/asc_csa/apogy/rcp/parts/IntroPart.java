package ca.gc.asc_csa.apogy.rcp.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.ui.forms.widgets.ColumnLayout;
import org.eclipse.ui.forms.widgets.ColumnLayoutData;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.custom.StyledText;

public class IntroPart {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	public IntroPart() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.verticalSpacing = 10;
		parent.setLayout(gl_parent);
		
		Section sctnNewSection = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnNewSection.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		sctnNewSection.setFont(SWTResourceManager.getFont("Ubuntu", 25, SWT.BOLD));
		GridData gd_sctnNewSection = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_sctnNewSection.widthHint = 278;
		sctnNewSection.setLayoutData(gd_sctnNewSection);
		formToolkit.paintBordersFor(sctnNewSection);
		sctnNewSection.setText("Apogy");
		
		Composite composite = formToolkit.createComposite(sctnNewSection, SWT.NONE);
		formToolkit.paintBordersFor(composite);
		sctnNewSection.setClient(composite);
		composite.setLayout(new GridLayout(1, false));
		
		FormText formText = formToolkit.createFormText(composite, false);
		GridData gd_formText = new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1);
		gd_formText.minimumHeight = 100;
		gd_formText.heightHint = 62;
		formText.setLayoutData(gd_formText);
		formText.marginHeight = 2;
		formToolkit.paintBordersFor(formText);
		formText.setText("Apogy is a multi-mission operations and planning software framework. Apogy uses Eclipse Modeling Framework models to define the systems being controlled, the environment in which these systems are operated, the operations being carried out and the corresponding data produced during operations.", false, false);
		
		Section sctnNewSection_1 = formToolkit.createSection(parent, Section.TITLE_BAR);
		sctnNewSection_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		sctnNewSection_1.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		sctnNewSection_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		formToolkit.paintBordersFor(sctnNewSection_1);
		sctnNewSection_1.setText("What would you like to do?");
		sctnNewSection_1.setExpanded(true);
		
		Composite composite_1 = formToolkit.createComposite(sctnNewSection_1, SWT.NONE);
		formToolkit.paintBordersFor(composite_1);
		sctnNewSection_1.setClient(composite_1);
		GridLayout gl_composite_1 = new GridLayout(1, false);
		gl_composite_1.verticalSpacing = 20;
		composite_1.setLayout(gl_composite_1);
		
		Label lblNewLabel = formToolkit.createLabel(composite_1, "", SWT.NONE);
		
		ImageHyperlink mghprlnkNewImagehyperlink_3 = formToolkit.createImageHyperlink(composite_1, SWT.NONE);
		mghprlnkNewImagehyperlink_3.setToolTipText("Create a new Apogy project.");
		mghprlnkNewImagehyperlink_3.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(mghprlnkNewImagehyperlink_3);
		mghprlnkNewImagehyperlink_3.setText("New Project");
		
		ImageHyperlink mghprlnkNewImagehyperlink_2 = formToolkit.createImageHyperlink(composite_1, SWT.NONE);
		mghprlnkNewImagehyperlink_2.setToolTipText("Open an existing Apogy project.");
		mghprlnkNewImagehyperlink_2.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(mghprlnkNewImagehyperlink_2);
		mghprlnkNewImagehyperlink_2.setText("Open Project");
		
		ImageHyperlink mghprlnkNewImagehyperlink = formToolkit.createImageHyperlink(composite_1, SWT.NONE);
		mghprlnkNewImagehyperlink.setToolTipText("Open an Apogy project example.");
		mghprlnkNewImagehyperlink.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		mghprlnkNewImagehyperlink.setImage(null);
		formToolkit.paintBordersFor(mghprlnkNewImagehyperlink);
		mghprlnkNewImagehyperlink.setText("Examples");
		
		ImageHyperlink mghprlnkNewImagehyperlink_1 = formToolkit.createImageHyperlink(composite_1, SWT.NONE);
		mghprlnkNewImagehyperlink_1.setToolTipText("Jump into the available Apogy tutorials.");
		mghprlnkNewImagehyperlink_1.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(mghprlnkNewImagehyperlink_1);
		mghprlnkNewImagehyperlink_1.setText("Tutorials");
		
		ImageHyperlink mghprlnkHelp = formToolkit.createImageHyperlink(composite_1, SWT.NONE);
		mghprlnkHelp.setToolTipText("Browse the Apogy documentation.");
		mghprlnkHelp.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		formToolkit.paintBordersFor(mghprlnkHelp);
		mghprlnkHelp.setText("Help");
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		// TODO	Set the focus to control
	}
}
