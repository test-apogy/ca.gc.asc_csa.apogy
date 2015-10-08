package org.eclipse.symphony.core.invocator.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

public class ContextsDefinitionComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private Environment environment;

	private ContextsListComposite contextsListComposite;

	private VariableImplementationsComposite variableImplementationsComposite;

	public ContextsDefinitionComposite(Composite parent, int style,
			Context context,
			Environment environment) {
		this(parent, style);
		setEnvironment(environment);
	}

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ContextsDefinitionComposite(Composite parent, int style) {
		super(parent, SWT.NONE);

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(2, false));
		
		Section sctnContexts = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		GridData gd_sctnContexts = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_sctnContexts.minimumWidth = 200;
		gd_sctnContexts.widthHint = 211;
		sctnContexts.setLayoutData(gd_sctnContexts);
		toolkit.paintBordersFor(sctnContexts);
		sctnContexts.setText("Contexts");
		
		contextsListComposite = new ContextsListComposite(sctnContexts, SWT.NONE){
			@Override
			protected void newSelection(ISelection selection) {
				variableImplementationsComposite.setContext(contextsListComposite.getSelectedContext());
				ContextsDefinitionComposite.this.newSelection(selection);
			}
			
		};
		toolkit.adapt(contextsListComposite);
		toolkit.paintBordersFor(contextsListComposite);
		sctnContexts.setClient(contextsListComposite);
		
		Section sctnVariableImplementations = toolkit.createSection(this, Section.TITLE_BAR | Section.EXPANDED);
		GridData gd_sctnVariableImplementations = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_sctnVariableImplementations.widthHint = 300;
		gd_sctnVariableImplementations.minimumWidth = 300;
		sctnVariableImplementations.setLayoutData(gd_sctnVariableImplementations);
		toolkit.paintBordersFor(sctnVariableImplementations);
		sctnVariableImplementations.setText("Variable Implementations");		
		
		variableImplementationsComposite = new VariableImplementationsComposite(sctnVariableImplementations, SWT.NONE){
			@Override
			protected void newSelection(ISelection selection) {
				ContextsDefinitionComposite.this.newSelection(selection);
			}			
		};
		toolkit.adapt(variableImplementationsComposite);
		toolkit.paintBordersFor(variableImplementationsComposite);
		sctnVariableImplementations.setClient(variableImplementationsComposite);	
		
		/** Perform a layout otherwise the VariableImplementation Content is not displayed without resize. */
		layout(true, true);
	}
	
	/** 
	 * This method is called when a new selection is made in the composite. 
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(ISelection selection){		
	}

	/**
	 * Binds the {@link Environment} with the composite.
	 * @param environment Reference to the environment.
	 */
	public void setEnvironment(Environment environment) {
		setEnvironment(environment, true);			
	}

	/**
	 * Sets the {@link Environment}.
	 * @param environment Reference to the environment.
	 * @param update If true then data bindings are created.
	 */
	private void setEnvironment(Environment environment, boolean update) {
		this.environment = environment;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}

			if (environment != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}

	/**
	 * Use this to prevent Window Pro Builder code analysis to fail with the
	 * complex data bindings code. Invokes
	 * {@link ContextsDefinitionComposite#initDataBindingsCustom()}.
	 * 
	 * @return Reference to the data bindings context.
	 * @see ContextsDefinitionComposite#initDataBindingsCustom()
	 */
	private DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Creates and returns the data bindings context that takes care of the
	 * Variables viewer and the Type Members viewer.
	 * 
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		contextsListComposite.setContextsList(environment.getContextsList());
		variableImplementationsComposite.setContext(contextsListComposite.getSelectedContext());
		
		return bindingContext;
	}

	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
	}
}