package org.eclipse.symphony.common.ui.properties.sections;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.ui.EclipseUiUtilities;
import org.eclipse.symphony.common.ui.properties.ExtendedTabbedPropertySheetPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.services.IEvaluationService;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;
import org.eclipse.ui.views.properties.tabbed.ITabSelectionListener;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public abstract class AbstractExtendedPropertySection extends AbstractPropertySection {

	/**
	 * The property sheet page associated.
	 */
	private ExtendedTabbedPropertySheetPage propertySheetPage;
	
	/**
	 * The current selected object or the first object in the selection when
	 * multiple objects are selected.
	 */
	private EObject eObject;

	/**
	 * The list of current selected objects.
	 */
	private List<EObject> eObjectList;

	private ISelection oldSelection;

	private Composite composite;

	private ITabSelectionListener tabSelectionListener;

	private ISelectionChangedListener selectionChangedListener;

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		propertySheetPage = (ExtendedTabbedPropertySheetPage) aTabbedPropertySheetPage;
		composite = createComposite(parent);
		getPropertySheetPage().addTabSelectionListener(
				getTabSelectionListener());
		getPropertySheetPage().addSelectionChangedListener(
				getSelectionChangedListener());
	}
	
	
	private ITabSelectionListener getTabSelectionListener() {
		if (tabSelectionListener == null) {
			tabSelectionListener = new ITabSelectionListener() {
				@Override
				public void tabSelected(ITabDescriptor tabDescriptor) {
					refreshContributions();
				}
			};
		}
		return tabSelectionListener;
	}

	private ISelectionChangedListener getSelectionChangedListener() {
		if (selectionChangedListener == null) {
			selectionChangedListener = new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					refreshContributions();
				}
			};
		}
		return selectionChangedListener;
	}
	
	protected void refreshContributions() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IEvaluationService evaluationService = (IEvaluationService) window
				.getService(IEvaluationService.class);
		evaluationService
				.requestEvaluation("org.eclipse.symphony.common.ui.expressions.TabbedPropertySheetPropertyTester.activeSection");
		getPropertySheetPage().refresh();

		PropertySheet propertySheet = (PropertySheet) EclipseUiUtilities
				.findView(EclipseUiUtilities.PROPERTY_SHEET_ID);
		 propertySheet.getViewSite().getActionBars().updateActionBars();
	}
	
	/** 
	 * Returns the property sheet page.
	 * @return Property sheet page.
	 */
	public ExtendedTabbedPropertySheetPage getPropertySheetPage(){
		return propertySheetPage;
	}
	
	@SuppressWarnings("unchecked")
	public void setInput(IWorkbenchPart part, ISelection selection) {
				
		/** 
		 * setInput is invoked two times.  That is why it is filtered.
		 */
		if (oldSelection == null || !oldSelection.equals(selection)){		
			super.setInput(part, selection);
			oldSelection = selection;
			
			getPropertySheetPage().refresh();
			
			if (!(selection instanceof IStructuredSelection)) {
				return;
			}
			if (((IStructuredSelection) selection).getFirstElement() instanceof EObject) {
				eObject = (EObject) ((IStructuredSelection) selection)
					.getFirstElement();
				
				eObjectList = ((IStructuredSelection) selection).toList();
				render(eObject);
				
			}			
		}
		getComposite().layout(true, true);
	}	

	abstract protected void render(EObject eObject);
	
	abstract protected Composite createComposite(Composite parent);
		
	public Composite getComposite(){
		return composite;
	}
	
	/** 
	 * Returns the selected object if only one object is selected.
	 * @return Reference to the object.
	 */
	public EObject getEObject() {
		return eObject;
	}

	/** 
	 * Returns the list of selected objects if more that one object are selected.
	 * @return Reference to the list.
	 */	
	public List<EObject> getEObjectList() {
		return eObjectList;
	}
	
	/** 
	 * Returns the editing domain.
	 * @return Reference to the editing domain. 
	 */
	public EditingDomain getEditingDomain(){
		return getPropertySheetPage().getEditingDomain();
	}
	
	@Override
	public void dispose() {
		
		if (getPropertySheetPage() != null){
			getPropertySheetPage().removeTabSelectionListener(getTabSelectionListener());
			getPropertySheetPage().removeSelectionChangedListener(getSelectionChangedListener());
		}

		if (composite != null){
			if (!composite.isDisposed()){
				composite.dispose();
				composite = null;
			}
		}
		super.dispose();
	}
}