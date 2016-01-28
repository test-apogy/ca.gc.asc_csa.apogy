package ca.gc.asc_csa.apogy.core.invocator.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EOperationsComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

/**
 * This class provides UI components to select an {@link EOperation} and to specify the argument values.
 */
public class OperationCallComposite extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	
	private DataBindingContext m_bindingContext;
	private Section sctnOperation;	
	private EOperationsComposite eOperationsComposite;
	private Section sctnArguments;
	private OperationCallArgumentsComposite argumentsComposite;
	private OperationCall operationCall;	
	private EditingDomain editingDomain;

	private AdapterImpl operationCallAdapter;
	AdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	/**
	 * Create the composite.
	 * @param parent Reference to the parent composite.
	 * @param style Composite style.
	 */
	public OperationCallComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(3, true));
		
		/**
		 * Operation
		 */
		sctnOperation = toolkit.createSection(this, Section.TITLE_BAR);
		GridData gd_sctnOperation = new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1);
		sctnOperation.setLayoutData(gd_sctnOperation);
		toolkit.paintBordersFor(sctnOperation);
		sctnOperation.setText("Operation");
		sctnOperation.setExpanded(true);
				
		eOperationsComposite = new EOperationsComposite(sctnOperation, SWT.BORDER){
			@Override
			protected void newSelection(TreeSelection selection) {		
				CommandParameter commandParameter = 
						new CommandParameter(getOperationCall(), 
											 ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION, 
											 selection.getFirstElement());
				IEditingDomainItemProvider editingDomainItemProvider = (IEditingDomainItemProvider) adapterFactory.adapt(getOperationCall(), IEditingDomainItemProvider.class);
				Command command = editingDomainItemProvider.createCommand(getOperationCall(), editingDomain, SetCommand.class, commandParameter);
				editingDomain.getCommandStack().execute(command);				
				OperationCallComposite.this.newSelection(selection);
			}
		};
		sctnOperation.setClient(eOperationsComposite);
		toolkit.adapt(eOperationsComposite);
				
		/** 
		 * Arguments.
		 */
		sctnArguments = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnArguments.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		toolkit.paintBordersFor(sctnArguments);
		sctnArguments.setText("Arguments");
		sctnArguments.setExpanded(true);
		
		argumentsComposite = new OperationCallArgumentsComposite(sctnArguments, SWT.NONE){
			@Override
			protected void newSelection(TreeSelection selection) {
				OperationCallComposite.this.newSelection(selection);
			}
		};
		sctnArguments.setClient(argumentsComposite);
		toolkit.adapt(argumentsComposite);
		new Label(this, SWT.NONE);
	}
	
	/** 
	 * This method is called when a new selection is made in the composite. 
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(TreeSelection selection){		
	}		
	
	/**
	 * Returns the reference to the {@link OperationCall}.
	 * @return Reference to the {@link OperationCall}.
	 */
	public OperationCall getOperationCall(){
		return operationCall;
	}
	
	/**
	 * Binds the {@link OperationCall} with the UI components.
	 * @param operationCall Reference to the {@link OperationCall}.
	 */
	public void setOperationCall(OperationCall operationCall){
		
		if (this.operationCall != null){
			this.operationCall.eAdapters().remove(getOperationCallAdapter());
		}
		
		this.operationCall = operationCall;
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		
		if (operationCall != null){			
			m_bindingContext = initDataBindings();	
			operationCall.eAdapters().add(getOperationCallAdapter());
		}
	}

	/**
	 * Invokes {@link #initDataBindingsCustom()}
	 * @return Reference to the data bindings.
	 */
	protected DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}
	
	/**
	 * Custom implementation of data bindings.  Use this pattern to prevent Window Pro builder to override the code.
	 * @return Reference to the data bindings.
	 */
	protected DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(getOperationCall());
		
		if (getOperationCall().getVariable()!=null){		
			eOperationsComposite.setEClass(ApogyCoreInvocatorFacade.INSTANCE.getInstanceClass(getOperationCall()), getOperationCall().getEOperation());
			argumentsComposite.setOperationCall(getOperationCall());
		}else{
			eOperationsComposite.setEClass(null);
			argumentsComposite.setOperationCall(null);			
		}
		
		return bindingContext;
	}
	
	/** 
	 * Returns a lazy loaded adapter used to listen to {@link OperationCall} events.
	 * @return Reference to the adapter.
	 */
	private Adapter getOperationCallAdapter() {
		
		if (operationCallAdapter == null){
			operationCallAdapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					switch (msg.getFeatureID(OperationCall.class)){			
						/**
						 * Only need to listen Arguments List because this feature is reset if any OperationCall 
						 * feature is set.  
						 * @see {link OperationCallItemProvider#createSetCommand}.
						 */
						case ApogyCoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST:
							setOperationCall(operationCall);  // Unable to set bidirectional binding with Tree Selection.
							break;					
					}
				}
			};
		}		
		return operationCallAdapter;
	}
	
	/**
	 * Disposes the current composite.
	 */
	@Override
	public void dispose() {
		super.dispose();
		
		toolkit.dispose();
		
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		
		if (operationCall != null){
			operationCall.eAdapters().remove(getOperationCallAdapter());
		}
	}
}