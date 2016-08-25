package ca.gc.asc_csa.apogy.core.invocator.presentation;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.views.markers.MarkerItem;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.ui.properties.ExtendedTabbedPropertySheetPage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

/**
 * This is an example of a ApogyCoreInvocator model editor. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated_NOT
 */
public class CustomApogyCoreInvocatorEditor extends ApogyCoreInvocatorEditor
		implements ITabbedPropertySheetPageContributor {

	public static String ID = "ca.gc.asc_csa.apogy.core.invocator.presentation.ApogyCoreInvocatorEditorID";
	private Map<Object, Diagnostic> diagnosticErrorsMap;
	private Image errorOverlayImage;
	protected TabbedPropertySheetPage propertySheetPage;
	private CommandStackListener commandStackListener;
	private ISelectionListener selectionListener;
	private Map<IMarker, EObject> markerToObjectMap;
	private IPartListener editorPartPropertyListener;
	private InvocatorSession activeSession;

	/**
	 * This creates a model editor. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public CustomApogyCoreInvocatorEditor() {
		super();
	}

	/** 
	 * This listener detects when the editor is closed.  The active session is then set to null.
	 * @return Reference to the listener.
	 */
	private IPartListener getEditorListener() {
		if (editorPartPropertyListener == null){
			editorPartPropertyListener = new IPartListener() {

				@Override
				public void partActivated(IWorkbenchPart part) {
				}

				@Override
				public void partBroughtToTop(IWorkbenchPart part) {
				}

				@Override
				public void partClosed(IWorkbenchPart part) {				
					if (part == CustomApogyCoreInvocatorEditor.this){
						if (activeSession == ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession()){
							ApogyCoreInvocatorFacade.INSTANCE.setActiveInvocatorSession(null);
							activeSession = null;							
						}											
					}									
				}

				@Override
				public void partDeactivated(IWorkbenchPart part) {
				}

				@Override
				public void partOpened(IWorkbenchPart part) {
				}
			};
		}
		return editorPartPropertyListener;
	}

	/**
	 * @generated_NOT
	 */
	@Override
	public void dispose() {
		editingDomain.getCommandStack().removeCommandStackListener(
				getCommandStackListener());
		diagnosticErrorsMap = null;
		getSite().getPage().removeSelectionListener(getSelectionListener());
		getSite().getPage().removePartListener(getEditorListener());
		super.dispose();
		
	}
	
	@Override
	public void createModel() {
		super.createModel();
		EObject content = getEditingDomain().getResourceSet().getResources()
		.get(0).getContents().get(0);
		
		getSite().getPage().removePartListener(getEditorListener());  
		
		if (content instanceof InvocatorSession){
			activeSession = (InvocatorSession) content;			
						
			/** Load registered types. */
			ApogyCoreInvocatorFacade.INSTANCE.loadRegisteredTypes(activeSession);
			
			/** Set the active session. */
			ApogyCoreInvocatorFacade.INSTANCE.setActiveInvocatorSession(activeSession);
			
			// Register this listener to set the session to null when the editor is closed.
			getSite().getPage().addPartListener(getEditorListener());  
		}		
	}

	private ISelectionListener getSelectionListener() {
		if (selectionListener == null) {
			selectionListener = new ISelectionListener() {
				@Override
				public void selectionChanged(IWorkbenchPart part,
						ISelection selection) {
					showSelection(selection);
				}
			};
		}
		return selectionListener;
	}

	private void showSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			Object obj = ss.getFirstElement();
			if (obj instanceof MarkerItem) {
				MarkerItem markerItem = (MarkerItem) obj;
				IMarker marker = markerItem.getMarker();

				if (marker != null) {
					EObject eObject = getMarkerToEObjectMap().get(marker);
					if (eObject != null) {
						selectionViewer.setSelection(new StructuredSelection(
								eObject));
					}
				}
			}
		}
	}

	/**
	 * @generated_NOT
	 */
	@Override
    public String getContributorId() {
		return ExtendedTabbedPropertySheetPage.PROPERTY_CONTRIBUTOR_ID;
	}

	/**
	 * @generated_NOT
	 */
	@Override
    protected void initializeEditingDomain() {
		super.initializeEditingDomain();
		editingDomain.getCommandStack().addCommandStackListener(
				getCommandStackListener());
	}

	/**
	 * @generated_NOT
	 */
	private CommandStackListener getCommandStackListener() {
		if (commandStackListener == null) {
			commandStackListener = new CommandStackListener() {
				@Override
				public void commandStackChanged(EventObject event) {
					executeDiagnostician();
				}
			};
		}
		return commandStackListener;
	}

	/**
	 * @generated_NOT
	 */
	private void executeDiagnostician()
	{
		/** Clear errors and markers. */
		markerHelper.deleteMarkers(getEditingDomain().getResourceSet());
		getDiagnosticErrorsMap().clear();
		getMarkerToEObjectMap().clear();

		/** Validate. */
		Diagnostic diagnostic = Diagnostician.INSTANCE
									.validate(getEditingDomain().getResourceSet().getResources()
											.get(0).getContents().get(0));

		/** Create errors and markers if required. */
		if (diagnostic.getSeverity() != Diagnostic.OK)
		{
			Iterator<Diagnostic> diagnostics = diagnostic.getChildren().iterator();
			
			while (diagnostics.hasNext())
			{
				Diagnostic currentDiagnostic = diagnostics.next();
				
				if ((currentDiagnostic.getData() != null) && 
					(currentDiagnostic.getData().isEmpty() == false))
				{
					EObject eObject = (EObject) currentDiagnostic.getData().get(0);

					/** Create a marker. */
					try
					{
						IMarker marker = ApogyCommonEMFFacade.INSTANCE.getFile(eObject.eResource()).createMarker(IMarker.PROBLEM);

						marker.setAttribute(IMarker.MESSAGE, processMessage(currentDiagnostic.getMessage(),	eObject));
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						marker.setAttribute(IMarker.TRANSIENT, true);
						getMarkerToEObjectMap().put(marker, eObject);

					}
					catch (CoreException e)
					{
						e.printStackTrace();
					}

					/**
					 * Propagate the error to the parents.
					 */
					do
					{
						getDiagnosticErrorsMap().put(eObject, currentDiagnostic);

						if (eObject.eContainer() == null)
						{
							getDiagnosticErrorsMap().put(eObject.eResource(), currentDiagnostic);
						}
						
						eObject = eObject.eContainer();
						
					} while (eObject != null);
				}
			}
		}

		/** Invoke Label Providers. */
		getViewer().refresh();
	}

	private String processMessage(String message, EObject eObject) {
		String result = message;

		/**
		 * EMF Message Format
		 * "The required feature 'feature_name' of 'object' must be set";
		 */
		String[] sections = message.split("'");
		if (sections.length == 5) {
			String className = eObject
					.eClass()
					.getInstanceTypeName()
					.substring(
							eObject.eClass().getInstanceTypeName()
									.lastIndexOf(".") + 1);
			result = "Set the \"" + sections[1] + "\" of \"" + className + "\"";
		}

		return result;
	}

	private Map<IMarker, EObject> getMarkerToEObjectMap() {
		if (markerToObjectMap == null) {
			markerToObjectMap = new HashMap<IMarker, EObject>();
		}

		return markerToObjectMap;
	}

	@Override
	protected void updateProblemIndication() {
		super.updateProblemIndication();
		executeDiagnostician();
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model
	 * file. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		saveOptions.put(Resource.OPTION_LINE_DELIMITER,
				Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);

		// The following lines added.
		saveOptions.put(XMLResource.OPTION_URI_HANDLER,
				new URIHandlerImpl.PlatformSchemeAware());

		// Do the work within an operation because this is a long running
		// activity that modifies the workbench.
		//
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			// This is the method that gets invoked when the operation runs.
			//
			@Override
			public void execute(IProgressMonitor monitor) {
				// Save the resources to the file system.
				//
				boolean first = true;
				for (Resource resource : editingDomain.getResourceSet()
						.getResources()) {
					if ((first || !resource.getContents().isEmpty() || isPersisted(resource))
							&& !editingDomain.isReadOnly(resource)) {
						try {
							long timeStamp = resource.getTimeStamp();
							resource.save(saveOptions);
							if (resource.getTimeStamp() != timeStamp) {
								savedResources.add(resource);
							}
						} catch (Exception exception) {
							resourceToDiagnosticMap
									.put(resource,
											analyzeResourceProblems(resource,
													exception));
						}
						first = false;
					}
				}
			}
		};

		updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false,
					operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack) editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		} catch (Exception exception) {
			// Something went wrong that shouldn't.
			//
			ApogyCoreInvocatorEditorPlugin.INSTANCE.log(exception);
		}
		updateProblemIndication = true;
		updateProblemIndication();
		executeDiagnostician();
	}

	/**
	 * @generated_NOT
	 */
	private Map<Object, Diagnostic> getDiagnosticErrorsMap() {
		if (diagnosticErrorsMap == null) {
			diagnosticErrorsMap = new HashMap<Object, Diagnostic>();
		}
		return diagnosticErrorsMap;
	}

	/**
	 * This accesses a cached version of the property sheet. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
    public TabbedPropertySheetPage getPropertySheetPage() {
		propertySheetPage = new ExtendedTabbedPropertySheetPage(this,
				adapterFactory) {
			@Override
			public void setActionBars(IActionBars actionBars) {
				super.setActionBars(actionBars);
				getActionBarContributor().shareGlobalActions(this, actionBars);
			}
		};
		return propertySheetPage;
	}

	/**
	 * This is the method used by the framework to install your own controls.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public void createPages() {
		super.createPages();

		selectionViewer.setLabelProvider(new DecoratingLabelProvider(
				new AdapterFactoryLabelProvider(adapterFactory) {
					@Override
					public Image getImage(Object object) {
						Image image = super.getImage(object);
						if (getDiagnosticErrorsMap().containsKey(object)) {
							List<Image> images = new ArrayList<Image>();
							images.add(image);
							images.add(getErrorOverlayImage());
							image = ExtendedImageRegistry.INSTANCE
									.getImage(new ComposedImage(images));
						}
						return image;
					}
				}, PlatformUI.getWorkbench().getDecoratorManager()
						.getLabelDecorator()));

		selectionViewer.getTree().setLinesVisible(true);

        selectionViewer.addDoubleClickListener(new IDoubleClickListener() {

            /**
             * Double click listener that only reacts on JavaScriptProgram model
             * element and open the referenced JavaScript File in the default
             * editor.
             * If no JavaScript file selected opens Properties view.
             */
            @Override
            public void doubleClick(DoubleClickEvent event) {
                if (event.getSelection() instanceof TreeSelection) {
                    TreeSelection treeSelection = (TreeSelection) event.getSelection();
                    Object firstElement = treeSelection.getFirstElement();
                    if (firstElement instanceof EObject && "JavaScriptProgramImpl".equals(firstElement.getClass().getSimpleName())) { //$NON-NLS-1$
                        openJavaScriptEditor((EObject) firstElement);

                        // refresh selection to render the content of the Properties view
                        selectionViewer.getControl().setFocus();
                        selectionViewer.setSelection(event.getSelection(), true);
                    }
                }
            }
        });

		getSite().getPage().addSelectionListener(getSelectionListener());
		executeDiagnostician();
	}

	/**
	 * Look for the path of the JavaScript file and open it with the default
	 * editor.
	 * 
	 * @param javaScriptProgram
	 *            the JavaScriptProgram model element
	 */
	private void openJavaScriptEditor(EObject javaScriptProgram) {
		String relativePath = (String) javaScriptProgram.eGet(javaScriptProgram.eClass().getEStructuralFeature("scriptPath")); //$NON-NLS-1$

		if (relativePath == null || !relativePath.endsWith(".js")) { //$NON-NLS-1$
			// The file path is not set, open the properties view
			openProperties();
			return;
		}

		// Only open (and eventually create) the JavaScript File if the path
		// is non null and the file extension is ".js"
		
		IPath absolutePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(relativePath);
		
		File fileToOpen = new File(absolutePath.toOSString());

		if (!(fileToOpen.exists() && fileToOpen.isFile())) {
			// The file does not exist and need to be created
			// open the properties view
			openProperties();
			return;
		}

		if (fileToOpen.exists() && fileToOpen.isFile()) {
			// Open the file with the default editor
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

			try {
				IDE.openEditorOnFileStore(page, fileStore);
			} catch (PartInitException e) {
				ApogyCoreInvocatorEditorPlugin.INSTANCE.log(e);
			}
		}
	}

	private void openProperties() {
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(IPageLayout.ID_PROP_SHEET);
		} catch (PartInitException e) {
			ApogyCoreInvocatorEditorPlugin.INSTANCE.log(e);
		}
	}

	/**
	 * @generated_NOT
	 */
	protected Image getErrorOverlayImage() {
		if (errorOverlayImage == null) {
			errorOverlayImage = PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_DEC_FIELD_ERROR);
		}
		return errorOverlayImage;
	}

	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		executeDiagnostician();
	}
}