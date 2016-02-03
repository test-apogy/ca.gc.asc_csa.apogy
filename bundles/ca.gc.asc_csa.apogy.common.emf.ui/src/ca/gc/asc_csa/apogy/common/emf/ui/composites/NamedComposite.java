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
import org.eclipse.swt.widgets.Text;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Named;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class NamedComposite extends Composite
{
	private DataBindingContext m_bindingContext;
	private Named named;
	private Text nameText;
	private EditingDomain editingDomain;
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	public NamedComposite(Composite parent, int style, EditingDomain editingDomain)
	{
		this(parent, style);
		this.editingDomain = editingDomain;
	}
	
	public NamedComposite(Composite parent, int style, Named newNamed)
	{
		this(parent, style);
		setNamed(newNamed);
	}

	public NamedComposite(Composite parent, int style)
	{
		super(parent, style);
		
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		
		setLayout(new GridLayout(2, false));

		toolkit.createLabel(this, "Name: ", SWT.NONE);

		nameText = toolkit.createText(this, "", SWT.BORDER | SWT.SINGLE);
		nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		if (named != null)
		{
			m_bindingContext = initCustomDataBindings();
		}
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	@SuppressWarnings("unused")
	private DataBindingContext initDataBindings()
	{
		IObservableValue nameObserveWidget = WidgetProperties.text(SWT.Modify).observe(nameText);
		IObservableValue nameObserveValue = EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME).observe(named);

		DataBindingContext bindingContext = new DataBindingContext();

		bindingContext.bindValue(nameObserveWidget, nameObserveValue, null, null);

		return bindingContext;
	}
	
	private DataBindingContext initCustomDataBindings()
	{
		IObservableValue nameObserveWidget = WidgetProperties.text(SWT.Modify).observe(nameText);
		IObservableValue nameObserveValue = (editingDomain == null ?
				EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME).observe(named) :
				EMFEditProperties.value(editingDomain, ApogyCommonEMFPackage.Literals.NAMED__NAME).observe(named));
		
		DataBindingContext bindingContext = new DataBindingContext();
		
		bindingContext.bindValue(nameObserveWidget, nameObserveValue, null,	null);
		
		return bindingContext;
	}
	
	public Named getNamed()
	{
		return named;
	}

	public void setNamed(Named newNamed)
	{
		setNamed(newNamed, true);
	}

	public void setNamed(Named newNamed, boolean update)
	{
		named = newNamed;
		
		if (update)
		{
			if (m_bindingContext != null)
			{
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			
			if (named != null)
			{
				m_bindingContext = initCustomDataBindings();
			}
		}
	}
	
	@Override
	public void dispose()
	{
		super.dispose();
		toolkit.dispose();
		
		if (m_bindingContext != null)
		{
			m_bindingContext.dispose();
			m_bindingContext = null;
		}		
	}
}
