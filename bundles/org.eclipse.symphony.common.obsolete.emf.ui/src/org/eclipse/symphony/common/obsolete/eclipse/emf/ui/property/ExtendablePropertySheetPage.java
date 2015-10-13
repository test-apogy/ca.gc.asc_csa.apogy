package org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.Activator;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetEntry;

/**
 * Extensible Property Sheet Page.  {@link CellEditor} are contributed to the sheet page through
 * the org.eclipse.symphony.common.obsolete.eclipse.emf.ui.PropertyCellEditor extension point.
 * 
 * <PRE>
 * $Revision: 1.2.2.8 $
 * 
 * CSA Eclipse EMF UI Utilities.
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Quebec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE> 
 */
public class ExtendablePropertySheetPage extends ExtendedPropertySheetPage{

	private Action showDetailAction;
	private PropertyCellViewerContentContributor contributor;
	private Object dataSelected;
	private EObject eObjectSelection;	
	private AdapterImpl eObjectAdapter;
		
	@Override
	public void dispose() {
		if (eObjectSelection != null){
			eObjectSelection.eAdapters().remove(getEObjectAdapter());
		}
		super.dispose();
	}
		
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		super.selectionChanged(part, selection);				
		
		/** Remove the adapter from the previous selection. */
		if (eObjectSelection != null){
			eObjectSelection.eAdapters().remove(getEObjectAdapter());
		}
		
		if (selection instanceof IStructuredSelection){
			IStructuredSelection ssel = (IStructuredSelection) selection;

			/** Check if the selection is an EObject. */
			eObjectSelection = (EObject) (ssel.getFirstElement() instanceof EObject ? ((IStructuredSelection) selection).getFirstElement() : null);
			
			/** Register to the adapter if it is an EObject. */
			if (eObjectSelection != null){
				eObjectSelection.eAdapters().add(getEObjectAdapter());
			}
		}
	}	
	

	private Adapter getEObjectAdapter() {		
		if (eObjectAdapter == null){
			eObjectAdapter = new AdapterImpl(){
				private UIJob refreshingJob = null;
				private boolean refreshing = false;

				@Override
				public void notifyChanged(Notification msg) {
					if (!refreshing){
						getRefreshingJob().schedule(250);  // Refresh at 4Hz Maximum.
					}
				}

				private UIJob getRefreshingJob() {
					if (refreshingJob == null){
						refreshingJob = new UIJob("Refresh the property sheet page"){
							@Override
							public IStatus runInUIThread(IProgressMonitor monitor) {
								refreshing = true;
								if(!getControl().isDisposed()){
									if (!(getSite().getWorkbenchWindow().getActivePage().getActivePart() instanceof PropertySheet)){
										refresh();
									}
								}
								refreshing = false;
								return Status.OK_STATUS;
							}						
						};
					}
					return refreshingJob;
				}
			};
		}
		
		return eObjectAdapter;
	}


	/**
	 * Creates an extensible property sheet page.
	 * @param factory Factory that contains the item providers.
	 * @param editingDomain Domain that handles the edited objects.  Null may be passed.
	 */
	public ExtendablePropertySheetPage(AdapterFactory factory, AdapterFactoryEditingDomain editingDomain) {
		super(editingDomain);				
		setPropertySourceProvider(new AdapterFactoryContentProvider(factory){
			@Override
			protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource) {
				return new PropertySource(object, itemPropertySource){
					@Override
					protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
						return new PropertyDescriptor(object, itemPropertyDescriptor){
							@Override
							public CellEditor createPropertyEditor(Composite composite) {
								
							    if (!itemPropertyDescriptor.canSetProperty(object))
							    {
							      return null;
							    }
							    
								PropertyCellEditorContributors contributors = Activator.getDefault().getPropertyCellEditorContributors();								
								EStructuralFeature attribute = (EStructuralFeature) itemPropertyDescriptor.getFeature(object);								
								PropertyCellEditorContributor contributor = contributors.adapt(attribute.getEType().getInstanceClass());
								if (contributor != null){
									return contributor.getCellEditorProvider().newInstance(composite);
								}else{
									return super.createPropertyEditor(composite);
								}
							}
						};
					}
				};				
			}
		});		
	}	  
	  
	private Action getShowDetailAction(){
		if (showDetailAction == null){
			showDetailAction = new Action("Show Detail"){
				@Override
				public void run() {
					if (contributor != null){
						Dialog dialog = new Dialog(getSite().getShell()){
							@Override
							protected Control createDialogArea(Composite parent) {
								Composite composite = (Composite) super.createDialogArea(parent);
						        contributor.getCellViewerContentProvider().createContent(composite, dataSelected);						       						        
								return composite;
							}
							
							/**
							 * Override in order to have the OK button without the CANCEL button.
							 */
							@Override							
							protected void createButtonsForButtonBar(Composite parent) {
								createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
							}							
						};
						dialog.open();
					}
				}
			};
			showDetailAction.setToolTipText("Displays the data in a Dialog.");			
		}
		return showDetailAction;
	}
	
	@Override
	public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
		super.makeContributions(menuManager, toolBarManager, statusLineManager);
		toolBarManager.add(getShowDetailAction());
		menuManager.add(getShowDetailAction());		
	}

	@Override
	public void handleEntrySelection(ISelection selection) {
		super.handleEntrySelection(selection);

		StructuredSelection ssel = (StructuredSelection) selection;
		if (ssel.size() == 1){
			Object sel = ssel.getFirstElement();
			if (sel instanceof PropertySheetEntry){
				PropertySheetEntry entry = (PropertySheetEntry) sel;
				Object[] values = entry.getValues();
				if (values != null){
					if (values[0] instanceof IItemPropertySource){
						dataSelected = ((IItemPropertySource)values[0]).getEditableValue(null);
						contributor = Activator.getDefault().getPropertyCellViewerContentContributors().adapt(dataSelected.getClass());
					}
				}
			}
		}
		getShowDetailAction().setEnabled(contributor != null);
	}	
}