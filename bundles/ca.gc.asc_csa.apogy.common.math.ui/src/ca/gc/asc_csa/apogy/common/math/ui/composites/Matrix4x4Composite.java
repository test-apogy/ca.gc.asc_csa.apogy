package ca.gc.asc_csa.apogy.common.math.ui.composites;
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
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import ca.gc.asc_csa.apogy.common.databinding.converters.DoubleToStringConverter;
import ca.gc.asc_csa.apogy.common.databinding.converters.StringToDoubleConverter;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage.Literals;

public class Matrix4x4Composite extends Composite
{
	private DataBindingContext m_bindingContext;
	private ca.gc.asc_csa.apogy.common.math.Matrix4x4 matrix4x4;
	private Text m00Text;
	private Text m01Text;
	private Text m02Text;
	private Text m03Text;
	private Text m10Text;
	private Text m11Text;
	private Text m12Text;
	private Text m13Text;
	private Text m20Text;
	private Text m21Text;
	private Text m22Text;
	private Text m23Text;
	private Text m30Text;
	private Text m31Text;
	private Text m32Text;
	private Text m33Text;
	private EditingDomain editingDomain = null;

	public Matrix4x4Composite(Composite parent, int style, EditingDomain editingDomain)
	{
		this(parent, style);
		this.editingDomain = editingDomain;
	}
	
	public Matrix4x4Composite(Composite parent, int style)
	{
		super(parent, style);
		GridLayout gridLayout = new GridLayout(4, true);
		setLayout(gridLayout);

		m00Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m00Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m01Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m01Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m02Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m02Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m03Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m03Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m10Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m10Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m11Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m11Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m12Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m12Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m13Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m13Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m20Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m20Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m21Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m21Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m22Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m22Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m23Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m23Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m30Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m30Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m31Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m31Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m32Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m32Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m33Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m33Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		if (matrix4x4 != null)
		{
			m_bindingContext = initCustomDataBindings();
		}
	}

	@Override
	protected void checkSubclass()
	{
		// Disable the check that prevents subclassing of SWT components
	}

	public ca.gc.asc_csa.apogy.common.math.Matrix4x4 getMatrix4x4()
	{
		return matrix4x4;
	}

	public void setMatrix4x4(ca.gc.asc_csa.apogy.common.math.Matrix4x4 newMatrix4x4)
	{
		setMatrix4x4(newMatrix4x4, true);
	}

	public void setMatrix4x4(ca.gc.asc_csa.apogy.common.math.Matrix4x4 newMatrix4x4, boolean update)
	{
		matrix4x4 = newMatrix4x4;
		
		if (update)
		{
			if (m_bindingContext != null)
			{
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			
			if (matrix4x4 != null)
			{ 
				m_bindingContext = initCustomDataBindings();
			}
		}
	}
	
	protected DataBindingContext initCustomDataBindings()
	{
		DataBindingContext bindingContext = new DataBindingContext();
		
		//
		IObservableValue m00ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m00Text);
		IObservableValue m00ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M00).observe(matrix4x4) :
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M00).observe(matrix4x4));
		
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m00ObserveWidget, m00ObserveValue, strategy, strategy_1);
		
		//
		IObservableValue m01ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m01Text);
		IObservableValue m01ObserveValue = (editingDomain == null ?
				EMFProperties.value(Literals.MATRIX4X4__M01).observe(matrix4x4) : 
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M01).observe(matrix4x4));
				
		UpdateValueStrategy strategy_2 = new UpdateValueStrategy();
		strategy_2.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_3 = new UpdateValueStrategy();
		strategy_3.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m01ObserveWidget, m01ObserveValue, strategy_2, strategy_3);
		
		//
		IObservableValue m02ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m02Text);
		IObservableValue m02ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M02).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M02).observe(matrix4x4));
				
		UpdateValueStrategy strategy_4 = new UpdateValueStrategy();
		strategy_4.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_5 = new UpdateValueStrategy();
		strategy_5.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m02ObserveWidget, m02ObserveValue, strategy_4, strategy_5);
		
		//
		IObservableValue m03ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m03Text);
		IObservableValue m03ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M03).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M03).observe(matrix4x4));
		
		UpdateValueStrategy strategy_6 = new UpdateValueStrategy();
		strategy_6.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_7 = new UpdateValueStrategy();
		strategy_7.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m03ObserveWidget, m03ObserveValue, strategy_6, strategy_7);
		
		//
		IObservableValue m10ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m10Text);
		IObservableValue m10ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M10).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M10).observe(matrix4x4));
		
		UpdateValueStrategy strategy_8 = new UpdateValueStrategy();
		strategy_8.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_9 = new UpdateValueStrategy();
		strategy_9.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m10ObserveWidget, m10ObserveValue, strategy_8, strategy_9);
		
		//
		IObservableValue m11ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m11Text);
		IObservableValue m11ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M11).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M11).observe(matrix4x4));
		
		UpdateValueStrategy strategy_10 = new UpdateValueStrategy();
		strategy_10.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_11 = new UpdateValueStrategy();
		strategy_11.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m11ObserveWidget, m11ObserveValue, strategy_10, strategy_11);
		
		//
		IObservableValue m12ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m12Text);
		IObservableValue m12ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M12).observe(matrix4x4): 
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M12).observe(matrix4x4));
		
		UpdateValueStrategy strategy_12 = new UpdateValueStrategy();
		strategy_12.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_13 = new UpdateValueStrategy();
		strategy_13.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m12ObserveWidget, m12ObserveValue, strategy_12, strategy_13);
		
		//
		IObservableValue m13ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m13Text);
		IObservableValue m13ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M13).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M13).observe(matrix4x4));
		
		UpdateValueStrategy strategy_14 = new UpdateValueStrategy();
		strategy_14.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_15 = new UpdateValueStrategy();
		strategy_15.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m13ObserveWidget, m13ObserveValue, strategy_14, strategy_15);
		
		//
		IObservableValue m20ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m20Text);
		IObservableValue m20ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M20).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M20).observe(matrix4x4));
		
		UpdateValueStrategy strategy_16 = new UpdateValueStrategy();
		strategy_16.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_17 = new UpdateValueStrategy();
		strategy_17.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m20ObserveWidget, m20ObserveValue, strategy_16, strategy_17);
		
		//
		IObservableValue m21ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m21Text);
		IObservableValue m21ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M21).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M21).observe(matrix4x4));
				
		UpdateValueStrategy strategy_18 = new UpdateValueStrategy();
		strategy_18.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_19 = new UpdateValueStrategy();
		strategy_19.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m21ObserveWidget, m21ObserveValue, strategy_18, strategy_19);
		
		//
		IObservableValue m22ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m22Text);
		IObservableValue m22ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M22).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M22).observe(matrix4x4));
		
		UpdateValueStrategy strategy_20 = new UpdateValueStrategy();
		strategy_20.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_21 = new UpdateValueStrategy();
		strategy_21.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m22ObserveWidget, m22ObserveValue, strategy_20, strategy_21);
		
		//
		IObservableValue m23ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m23Text);
		IObservableValue m23ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M23).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M23).observe(matrix4x4));
		
		UpdateValueStrategy strategy_22 = new UpdateValueStrategy();
		strategy_22.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_23 = new UpdateValueStrategy();
		strategy_23.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m23ObserveWidget, m23ObserveValue, strategy_22, strategy_23);
		
		//
		IObservableValue m30ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m30Text);
		IObservableValue m30ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M30).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M30).observe(matrix4x4));
		
		UpdateValueStrategy strategy_24 = new UpdateValueStrategy();
		strategy_24.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_25 = new UpdateValueStrategy();
		strategy_25.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m30ObserveWidget, m30ObserveValue, strategy_24, strategy_25);
		
		//
		IObservableValue m31ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m31Text);
		IObservableValue m31ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M31).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M31).observe(matrix4x4));
		
		UpdateValueStrategy strategy_26 = new UpdateValueStrategy();
		strategy_26.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_27 = new UpdateValueStrategy();
		strategy_27.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m31ObserveWidget, m31ObserveValue, strategy_26, strategy_27);
		
		//
		IObservableValue m32ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m32Text);
		IObservableValue m32ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M32).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M32).observe(matrix4x4));
		
		UpdateValueStrategy strategy_28 = new UpdateValueStrategy();
		strategy_28.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_29 = new UpdateValueStrategy();
		strategy_29.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m32ObserveWidget, m32ObserveValue, strategy_28, strategy_29);
		
		//
		IObservableValue m33ObserveWidget = WidgetProperties.text(SWT.FocusOut).observe(m33Text);
		IObservableValue m33ObserveValue = (editingDomain == null ? 
				EMFProperties.value(Literals.MATRIX4X4__M33).observe(matrix4x4):
				EMFEditProperties.value(editingDomain, Literals.MATRIX4X4__M33).observe(matrix4x4));
					
		UpdateValueStrategy strategy_30 = new UpdateValueStrategy();
		strategy_30.setConverter(new StringToDoubleConverter());
		
		UpdateValueStrategy strategy_31 = new UpdateValueStrategy();
		strategy_31.setConverter(new DoubleToStringConverter());
		
		bindingContext.bindValue(m33ObserveWidget, m33ObserveValue, strategy_30, strategy_31);
		
		return bindingContext;
	}
}