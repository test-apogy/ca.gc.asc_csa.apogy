package ca.gc.asc_csa.eclipse.emf.ecore.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

public class EClassDocumentationComposite extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private EClass eClass;
	
	private DataBindingContext m_bindingContext;
	private EOperationsComposite eOperationsComposite;
	private EObjectDocumentationComposite eOperationDocumentationComposite;
	private Section sctnOperation;
	private Section sctnDocumentation;
	private EObjectDocumentationComposite eClassDocumentationComposite;
	private Section sctnInterface;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public EClassDocumentationComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		
		GridLayout gridLayout = new GridLayout(2, true);
		setLayout(gridLayout);
		
		sctnInterface = toolkit.createSection(this, Section.TWISTIE | Section.TITLE_BAR);
		GridData gd_sctnInterface = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		gd_sctnInterface.heightHint = 300;
		gd_sctnInterface.minimumHeight = 300;
		sctnInterface.setLayoutData(gd_sctnInterface);
		toolkit.paintBordersFor(sctnInterface);
		sctnInterface.setText("Interface");
		sctnInterface.setExpanded(true);
		
		eClassDocumentationComposite = new EObjectDocumentationComposite(sctnInterface, SWT.BORDER);
		sctnInterface.setClient(eClassDocumentationComposite);
		toolkit.adapt(eClassDocumentationComposite);
		
		sctnOperation = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnOperation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		sctnOperation.setText("Operations");
		sctnOperation.setExpanded(true);
		
		eOperationsComposite = new EOperationsComposite(sctnOperation, SWT.NONE){
			@Override
			protected void newSelection(TreeSelection selection) {
				eOperationDocumentationComposite.setEObject((EObject) selection.getFirstElement());
			}
		};
		eOperationsComposite.showParameters(true);
		sctnOperation.setClient(eOperationsComposite);
		
		sctnDocumentation = toolkit.createSection(this, Section.EXPANDED | Section.TITLE_BAR);
		sctnDocumentation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		sctnDocumentation.setText("Documentation");
		
		eOperationDocumentationComposite = new EObjectDocumentationComposite(sctnDocumentation, SWT.BORDER);
		sctnDocumentation.setClient(eOperationDocumentationComposite);
		m_bindingContext = initDataBindings();

	}
	
	public EClass getEClass(){
		return eClass;
	}
	
	public void setEClass(EClass eClass){
		this.eClass = eClass;
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		if (eClass != null){
			m_bindingContext = initDataBindings();
		}
	}
	
	/**
	 * Invokes {@link #initDataBindingsCustom()}
	 * @return Reference to the data bindings.
	 */
	protected DataBindingContext initDataBindings(){
		return initDataBindingsCustom();
	}
	
	/**
	 * Custom implementation of data bindings.  Use this pattern to prevent Window Pro builder to override the code.
	 * @return Reference to the data bindings.
	 */
	protected DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		eOperationsComposite.setEClass(eClass);
		eClassDocumentationComposite.setEObject(eClass);

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