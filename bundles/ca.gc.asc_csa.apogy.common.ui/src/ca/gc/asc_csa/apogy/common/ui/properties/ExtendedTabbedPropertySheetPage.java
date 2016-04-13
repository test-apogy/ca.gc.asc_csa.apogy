package ca.gc.asc_csa.apogy.common.ui.properties;
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

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class ExtendedTabbedPropertySheetPage extends TabbedPropertySheetPage implements ISelectionProvider {

	private ComposedAdapterFactory adapterFactory;	
	
	public static String PROPERTY_CONTRIBUTOR_ID = "ca.gc.asc_csa.apogy.common.ui.property.properties.ExtendedTabbedPropertySheetPage.Contributor";
	
	/**
	 * the contributor
	 */
	protected ITabbedPropertySheetPageContributor contributor;
	private boolean readOnly = false;
	
    /**
     * List of selection change listeners (element type: <code>ISelectionChangedListener</code>).
     */
    private ListenerList selectionChangedListeners = new ListenerList();

	private ISelection selection;
	

	/**
	 * Creates a {@link TabbedPropertySheetPage}. 
	 * @param tabbedPropertySheetPageContributor Reference to the contributor of the property sheet page. 
	 * @param adapterFactory Adapter Factory.
	 */
	public ExtendedTabbedPropertySheetPage(
			ITabbedPropertySheetPageContributor tabbedPropertySheetPageContributor,
			ComposedAdapterFactory adapterFactory){
		this(tabbedPropertySheetPageContributor, adapterFactory, false);
	}
			
	public ExtendedTabbedPropertySheetPage(
			ITabbedPropertySheetPageContributor tabbedPropertySheetPageContributor,
			ComposedAdapterFactory adapterFactory, boolean readOnly) {
		super(tabbedPropertySheetPageContributor);
		this.contributor = tabbedPropertySheetPageContributor;
		this.adapterFactory = adapterFactory;
		this.readOnly = readOnly;
	}	
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		super.selectionChanged(part, selection);
		setSelection(selection);
	}

	public EditingDomain getEditingDomain(){
		if(this.contributor instanceof IEditingDomainProvider){
			return ((IEditingDomainProvider)this.contributor).getEditingDomain();
		}else{
			return null;
		}	
	}
	
	public ComposedAdapterFactory getAdapterFactory(){
		return adapterFactory;
	}
	
	public Boolean isReadOnly(){
		return this.readOnly;
	}
	
	@Override
	public void refresh() {
		if (getCurrentTab() != null){
			super.refresh();
		}
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	@Override
	public ISelection getSelection() {
		return this.selection;
	}

	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);		
	}

	@Override
	public void setSelection(ISelection selection) {
		this.selection = selection; 
		for (int i = 0; i < selectionChangedListeners.size(); i++){
			((ISelectionChangedListener)selectionChangedListeners.getListeners()[i]).selectionChanged(new SelectionChangedEvent(this, selection));
		}		
	}
}