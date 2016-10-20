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
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Described;

public class DescribedComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private Described described;
	private StyledText descriptionText;
	private EditingDomain editingDomain;
	// private final int DESCRIPTION_TEXT_NUMBER_OF_LINES = 10;

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
		setLayout(new GridLayout(1, false));

		Label lblDescription = new Label(this, SWT.NONE);
		lblDescription.setText("Description");
		lblDescription.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, true, false, 1, 1));

		descriptionText = new StyledText(this, SWT.V_SCROLL | SWT.BORDER);
		descriptionText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		descriptionText.setAlwaysShowScrollBars(false);

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
		IObservableValue<?> descriptionObserveWidget = WidgetProperties.text(SWT.Modify).observe(descriptionText);
		@SuppressWarnings("unchecked")
		IObservableValue<?> descriptionObserveValue = (editingDomain == null
				? EMFProperties.value(ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION).observe(described)
				: EMFEditProperties.value(editingDomain, ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION)
						.observe(described));
		//
		DataBindingContext bindingContext = new DataBindingContext();
		//
		bindingContext.bindValue(descriptionObserveWidget, descriptionObserveValue, null, null);
		//
		return bindingContext;
	}

	private DataBindingContext initCustomDataBindings() {
		IObservableValue<?> descriptionObserveWidget = WidgetProperties
				.text(new int[] { SWT.Modify, SWT.FocusOut, SWT.DefaultSelection })
				.observeDelayed(500, descriptionText);

		@SuppressWarnings("unchecked")
		IObservableValue<?> descriptionObserveValue = editingDomain == null
				? EMFProperties.value(ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION).observe(described)
				: EMFEditProperties.value(editingDomain, ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION)
						.observe(described);

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
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
	}
}
