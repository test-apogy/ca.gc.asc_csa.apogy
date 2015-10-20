package org.eclipse.symphony.common.emf.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class DescribedComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private Described described;
	private Text descriptionText;
	private EditingDomain editingDomain;
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private final int DESCRIPTION_TEXT_NUMBER_OF_LINES = 10;

	public DescribedComposite(Composite parent, int style, EditingDomain editingDomain) {
		this(parent, style);
		this.editingDomain = editingDomain;
	}	
	
	public DescribedComposite(Composite parent, int style, Described newDescribed) {
		this(parent, style);
		setDescribed(newDescribed);
	}

	public DescribedComposite(Composite parent, int style) {
		super(parent, style);
		
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		
		setLayout(new GridLayout(2, false));

		Label label = toolkit.createLabel(this, "Description:", SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));

		descriptionText = toolkit.createText(this, "", SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		layoutData.heightHint = DESCRIPTION_TEXT_NUMBER_OF_LINES * descriptionText.getLineHeight();
		descriptionText.setLayoutData(layoutData);
				

		if (described != null) {
			m_bindingContext = initCustomDataBindings();
		}
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	@SuppressWarnings("unused")
	private DataBindingContext initDataBindings() {
		IObservableValue descriptionObserveWidget = WidgetProperties.text(SWT.Modify).observe(descriptionText);
		IObservableValue descriptionObserveValue = (editingDomain == null ? 
				EMFProperties.value(EMFEcorePackage.Literals.DESCRIBED__DESCRIPTION).observe(described):
				EMFEditProperties.value(editingDomain, EMFEcorePackage.Literals.DESCRIBED__DESCRIPTION).observe(described));
		//
		DataBindingContext bindingContext = new DataBindingContext();
		//
		bindingContext.bindValue(descriptionObserveWidget, descriptionObserveValue, null, null);
		//
		return bindingContext;
	}

	private DataBindingContext initCustomDataBindings() {
		IObservableValue descriptionObserveWidget = WidgetProperties.text(new int[]{SWT.Modify, SWT.FocusOut, SWT.DefaultSelection}).observeDelayed(500, descriptionText);
		
		IObservableValue descriptionObserveValue = editingDomain == null ? 
				EMFProperties.value(EMFEcorePackage.Literals.DESCRIBED__DESCRIPTION).observe(described):
				EMFEditProperties.value(editingDomain, EMFEcorePackage.Literals.DESCRIBED__DESCRIPTION).observe(described);

		//
		DataBindingContext bindingContext = new DataBindingContext();
		//
		bindingContext.bindValue(descriptionObserveWidget, descriptionObserveValue, null, null);
		//
		return bindingContext;
	}
	
	
	public Described getDescribed() {
		return described;
	}

	public void setDescribed(Described newDescribed) {
		setDescribed(newDescribed, true);
	}

	public void setDescribed(Described newDescribed, boolean update) {
		described = newDescribed;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (described != null) {
				m_bindingContext = initCustomDataBindings();
			}
		}
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
