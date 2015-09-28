package ca.gc.asc_csa.symphony.core.ui.views;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.ui.views.AbstractView;
import ca.gc.asc_csa.symphony.core.ui.composites.DataProductsListsContainerComposite;

public class DataProductsListsContainerView extends AbstractView implements IEditingDomainProvider{

	private DataProductsListsContainerComposite dataProductsListsContainerComposite;
	private Adapter activeSessionAdapter;

	public DataProductsListsContainerView() {
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().add(getActiveSessionAdapter());
	}
	
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		dataProductsListsContainerComposite = new DataProductsListsContainerComposite(parent, SWT.None){
			@Override
			protected void newSelection(ISelection selection) {
				getSelectionProvider().setSelection(selection);
			}
		};
		setCompositeDataProductsListsContainer();
	}

	@Override
	public void updatePartName() {
	}

	@Override
	public void updateSelection(ISelection arg0) {
		// This view does not listen to selection.
	}
		
	private Adapter getActiveSessionAdapter() {
		if (activeSessionAdapter == null){
			activeSessionAdapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification notification) {
					setCompositeDataProductsListsContainer();
				}
			};
		}
		return activeSessionAdapter;
	}

	@Override
	public void dispose() {
		super.dispose();
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().remove(getActiveSessionAdapter());
	}

	/**
	 * Sets the Data Products Lists Container of the composite.
	 */
	private void setCompositeDataProductsListsContainer() {
		InvocatorSession session = EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		DataProductsListsContainer dataProductsListsContainer = 
				session == null ?
					null :
					session.getDataProductsListContainer();	
		
		dataProductsListsContainerComposite.setDataProductsListsContainer(dataProductsListsContainer);
	}

	@Override
	public EditingDomain getEditingDomain() {
		return AdapterFactoryEditingDomain.getEditingDomainFor(EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
	}
}