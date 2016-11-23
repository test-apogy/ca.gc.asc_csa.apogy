package ca.gc.asc_csa.apogy.core.invocator.ui.composites;
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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ContextsList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

public class SourceDestinationContextsComposite extends Composite {
	private DataBindingContext m_bindingContext;
	
	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private TableViewer sourceContextViewer;

	private Table sourceContextTable;
	private Table destinationContextTable;

	private ContextsList contextsList;

	private TableViewer destinationContextViewer;

	/**
	 * Creates the parentComposite.
	 * 
	 * @param parent
	 * @param style
	 */
	public SourceDestinationContextsComposite(Composite parent, int style) {
		super(parent, style);

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(2, true));		
		
		Section sctnSourceContext = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnSourceContext.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.paintBordersFor(sctnSourceContext);
		sctnSourceContext.setText("Source");	
		sourceContextViewer = new TableViewer(sctnSourceContext, SWT.BORDER
		| SWT.H_SCROLL | SWT.V_SCROLL);
		sourceContextViewer.setUseHashlookup(true);
		sourceContextTable = sourceContextViewer.getTable();
		sourceContextTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sourceContextTable.setLinesVisible(true);
		sctnSourceContext.setClient(sourceContextTable);
		
		sourceContextViewer.addSelectionChangedListener(new ISelectionChangedListener() {			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				sourceContextSelected();
			}
		});
		
		
		Section sctnDestinationContext = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnDestinationContext.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		toolkit.paintBordersFor(sctnDestinationContext);
		sctnDestinationContext.setText("Destination");		
		destinationContextViewer = new TableViewer(sctnDestinationContext, SWT.BORDER);		
		destinationContextTable = destinationContextViewer.getTable();
		destinationContextTable.setLinesVisible(true);
		toolkit.paintBordersFor(destinationContextTable);
		sctnDestinationContext.setClient(destinationContextTable);
		destinationContextViewer.addSelectionChangedListener(new ISelectionChangedListener() {			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				destinationContextSelected();				
			}
		});
	}

	/**
	 * Sets the {@link ContextsList} managed by
	 * the parentComposite. 
	 * @param contextsList Reference to the list of contexts.
	 */
	public void setContextsList(ContextsList contextsList){
		setContextsList(contextsList, true);
	}

	/**
	 * Sets the {@link ContextsList} managed by
	 * the parentComposite. 
	 * @param contextsList Reference to the list of contexts.
	 * @param update If true then data bindings are created.
	 */
	private void setContextsList(ContextsList contextsList,
			boolean update) {

		this.contextsList = contextsList;

		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			
			if (this.contextsList != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}

	/**
	 * Use this to prevent Window Pro Builder code analysis to fail with the complex 
	 * data bindings code.  Invokes {@link SourceDestinationContextsComposite#initDataBindingsCustom()}.
	 * @return Reference to the data bindings context.
	 * @see SourceDestinationContextsComposite#initDataBindingsCustom()
	 */
	private DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Creates and returns the data bindings.
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();
		
		ViewerSupport.bind(sourceContextViewer, EMFObservables.observeList(
				contextsList,
				ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS),
				EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME));

		ViewerSupport.bind(destinationContextViewer, EMFObservables.observeList(
				contextsList,
				ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS),
				EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME));

		return bindingContext;
	}


	@Override
	public void dispose() {
		super.dispose();
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
	}	
	
	/**
	 * This method is invoked when a new From context is selected.
	 */
	protected void sourceContextSelected(){		
	}

	/**
	 * This method is invoked when a new To context is selected.
	 */
	protected void destinationContextSelected(){		
	}	
	
	/** 
	 * Returns the selected From context.
	 * @return Reference to the context.
	 */
	public Context getSelectedSourceContext(){
		Context context = null;
		
		if (sourceContextViewer.getSelection() != null && 
			sourceContextViewer.getSelection() instanceof IStructuredSelection){
			IStructuredSelection selection = (IStructuredSelection) sourceContextViewer.getSelection();
			context = (Context) selection.getFirstElement();
		}
		
		return context;
	}
	
	/** 
	 * Returns the selected To context.
	 * @return Reference to the context.
	 */
	public Context getSelectedDestinationContext(){
		Context context = null;
		
		if (destinationContextViewer.getSelection() != null && 
			destinationContextViewer.getSelection() instanceof IStructuredSelection){
			IStructuredSelection selection = (IStructuredSelection) destinationContextViewer.getSelection();
			context = (Context) selection.getFirstElement();
		}		
		return context;		
	}
}