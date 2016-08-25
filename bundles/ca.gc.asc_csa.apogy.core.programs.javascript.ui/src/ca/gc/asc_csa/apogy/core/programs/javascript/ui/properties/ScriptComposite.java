/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Alexey Balyberdin (alexey.balyberdin@savoirfairelinux.com)
 *     Savoir-faire Linux - Initial API and implementation
 */

package ca.gc.asc_csa.apogy.core.programs.javascript.ui.properties;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;

import ca.gc.asc_csa.apogy.core.programs.javascript.ApogyCoreJavaScriptProgramsPackage.Literals;
import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;
import ca.gc.asc_csa.apogy.core.programs.javascript.provider.ApogyCoreJavaScriptProgramsEditPlugin;

public class ScriptComposite extends Composite {

	private DataBindingContext bindingContext;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private JavaScriptProgram javaScriptProgram;
	private IObservableValue javaScriptProgramScriptPathValue;

	private Label filelbl;
	private Button browseFileBtn;
	private Button newFileBtn;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 *            Reference to the parent composite.
	 * @param style
	 *            Composite style.
	 */
	public ScriptComposite(Composite parent, int style) {
		super(parent, SWT.NONE);

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(3, false));

		browseFileBtn = toolkit.createButton(this, "Browse", SWT.NONE);
		GridData gd_browseFileBtn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_browseFileBtn.widthHint = 80;
		browseFileBtn.setLayoutData(gd_browseFileBtn);

		newFileBtn = toolkit.createButton(this, "Create", SWT.NONE);
		GridData gd_newFileBtn = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_newFileBtn.widthHint = 80;
		newFileBtn.setLayoutData(gd_newFileBtn);

		filelbl = toolkit.createLabel(this, "Create new script", SWT.NONE);
		GridData gd_filelbl = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		filelbl.setLayoutData(gd_filelbl);

		// File browse dialog
		browseFileBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				openFileSectionDialog();
			}
		});

		// File creation dialog
		newFileBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				openFileCreationDialog();
			}
		});
	}

	/**
	 * Sets script path to the binded bean
	 * 
	 * @param file
	 */
	private void setScriptFile(IPath file) {
		IPath relativePath = file.makeRelative();
		javaScriptProgramScriptPathValue.setValue(relativePath.toPortableString());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.swt.widgets.Widget#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
		disposeBinding();
	}

	/**
	 * Binds {@link: JavaScriptProgram} to the composite
	 * 
	 * @param javaScriptProgram
	 *            the program
	 */
	public void setJavaScriptProgram(JavaScriptProgram javaScriptProgram) {
		disposeBinding();

		this.javaScriptProgram = javaScriptProgram;
		bindingContext = initDataBindings();
	}

	/**
	 * Returns binded {@link: JavaScriptProgram}
	 * 
	 * @return the program
	 */
	public JavaScriptProgram getJavaScriptProgram() {
		return javaScriptProgram;
	}

	/**
	 * Initiates data binding. It's a default method created by the Windows
	 * Builder, just calls {@link: #initDataBindingsCustom()}
	 * 
	 * @return
	 */
	protected DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Initiates custom data binding. Added all data binding wiring logic here,
	 * as the Windows Builder rewrites any custom changes made to
	 * {@link: #initDataBindings()}
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext binding = new DataBindingContext();

		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(getJavaScriptProgram());

		IObservableValue observeTextFilelblObserveWidget = WidgetProperties.text().observe(filelbl);
		// store binding reference to change selected file from wizards
		javaScriptProgramScriptPathValue = EMFEditProperties.value(editingDomain, Literals.JAVA_SCRIPT_PROGRAM__SCRIPT_PATH).observe(javaScriptProgram);
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		binding.bindValue(observeTextFilelblObserveWidget, javaScriptProgramScriptPathValue, strategy, strategy);
		return binding;
	}

	private void disposeBinding() {
		if (bindingContext != null) {
			bindingContext.dispose();
			bindingContext = null;
		}
	}

	/**
	 * Pops-up a file selection window in Eclipse. Sets the script file path to the {@link: JavaScriptProgram}}
	 */
	private void openFileSectionDialog() {
		ElementTreeSelectionDialog dlg = new ElementTreeSelectionDialog(browseFileBtn.getShell(), new WorkbenchLabelProvider(), new WorkbenchContentProvider());

		dlg.setInput(ResourcesPlugin.getWorkspace().getRoot());
		dlg.setAllowMultiple(false);
		dlg.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (!(element instanceof IFile)) {
					return true;
				}

				IFile file = (IFile) element;
				return "js".equals(file.getFileExtension());
			}
		});

		if (dlg.open() == Window.OK) {
			IFile file = (IFile) dlg.getFirstResult();
			setScriptFile(file.getFullPath());

			// Open the file with the default editor
			try {
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file, true);
			} catch (PartInitException ex) {
				ApogyCoreJavaScriptProgramsEditPlugin.INSTANCE.log(ex);
			}
		}
	}

	/**
	 * Opens a file creation wizard in Eclipse. Sets the script file path to the {@link: JavaScriptProgram}}
	 */
	private void openFileCreationDialog() {
		// override the finish method to extract the file selected by
		// user
		BasicNewFileResourceWizard wizard = new BasicNewFileResourceWizard() {
			@Override
			public boolean performFinish() {
				WizardNewFileCreationPage page = (WizardNewFileCreationPage) getPage("newFilePage1");
				IPath file = page.getContainerFullPath().append(page.getFileName());
				setScriptFile(file);
				return super.performFinish();
			}
		};

		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();

		ISelection selection = selectionService.getSelection();
		wizard.init(PlatformUI.getWorkbench(), (IStructuredSelection) selection);
		WizardDialog dialog = new WizardDialog(newFileBtn.getShell(), wizard);

		dialog.open();
	}
}
