package org.eclipse.symphony.core.invocator.ui.composites;

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
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.ContextsList;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
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
	 * Creates the composite.
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
	 * the composite. 
	 * @param contextsList Reference to the list of contexts.
	 */
	public void setContextsList(ContextsList contextsList){
		setContextsList(contextsList, true);
	}

	/**
	 * Sets the {@link ContextsList} managed by
	 * the composite. 
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
				Symphony__CoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS),
				EMFProperties.value(Symphony__CommonEMFPackage.Literals.NAMED__NAME));

		ViewerSupport.bind(destinationContextViewer, EMFObservables.observeList(
				contextsList,
				Symphony__CoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS),
				EMFProperties.value(Symphony__CommonEMFPackage.Literals.NAMED__NAME));

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