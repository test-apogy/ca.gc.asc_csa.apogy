package ca.gc.asc_csa.apogy.common.emf.ui.composites;
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
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
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
		super(parent, SWT.NONE);
		
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		
		setLayout(new GridLayout(2, false));

		Label label = toolkit.createLabel(this, "Description:", SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));

		descriptionText = toolkit.createText(this, "", SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.heightHint = 50;
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
				EMFProperties.value(ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION).observe(described):
				EMFEditProperties.value(editingDomain, ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION).observe(described));
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
				EMFProperties.value(ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION).observe(described):
				EMFEditProperties.value(editingDomain, ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION).observe(described);

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
