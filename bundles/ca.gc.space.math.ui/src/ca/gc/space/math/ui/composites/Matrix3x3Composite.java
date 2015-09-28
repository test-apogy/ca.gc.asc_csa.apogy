package ca.gc.space.math.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import ca.gc.asc_csa.eclipse.core.databinding.converters.DoubleToStringConverter;
import ca.gc.asc_csa.eclipse.core.databinding.converters.StringToDoubleConverter;
import ca.gc.space.math.MathPackage.Literals;

public class Matrix3x3Composite extends Composite {

	private DataBindingContext m_bindingContext;
	private ca.gc.space.math.Matrix3x3 matrix3x3;
	private Text m00Text;
	private Text m01Text;
	private Text m02Text;
	
	private Text m10Text;
	private Text m11Text;
	private Text m12Text;
	
	private Text m20Text;
	private Text m21Text;
	private Text m22Text;	
	private EditingDomain editingDomain = null;

	public Matrix3x3Composite(Composite parent, int style, EditingDomain editingDomain) {
		this(parent, style);
		this.editingDomain = editingDomain;
	}
	
	public Matrix3x3Composite(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout(3, true);
		setLayout(gridLayout);

		m00Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m00Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m01Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m01Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m02Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m02Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m10Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m10Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m11Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m11Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m12Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m12Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m20Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m20Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m21Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m21Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		m22Text = new Text(this, SWT.BORDER | SWT.SINGLE);
		m22Text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		if (matrix3x3 != null) {
			m_bindingContext = initCustomDataBindings();
		}
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public ca.gc.space.math.Matrix3x3 getMatrix3x3() {
		return matrix3x3;
	}

	public void setMatrix3x3(ca.gc.space.math.Matrix3x3 newMatrix3x3) {
		setMatrix3x3(newMatrix3x3, true);
	}

	public void setMatrix3x3(ca.gc.space.math.Matrix3x3 newMatrix3x3,
			boolean update) {
		matrix3x3 = newMatrix3x3;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (matrix3x3 != null) { 
				m_bindingContext = initCustomDataBindings();
			}
		}
	}

	protected DataBindingContext initCustomDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue m00ObserveWidget = SWTObservables.observeText(m00Text, SWT.FocusOut);
		IObservableValue m00ObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(matrix3x3, Literals.MATRIX3X3__M00) :
				EMFEditObservables.observeValue(editingDomain, matrix3x3, Literals.MATRIX3X3__M00);
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(m00ObserveWidget, m00ObserveValue, strategy, strategy_1);
		//
		IObservableValue m01ObserveWidget = SWTObservables.observeText(m01Text, SWT.FocusOut);
		IObservableValue m01ObserveValue = editingDomain == null ?
				EMFObservables.observeValue(matrix3x3, Literals.MATRIX3X3__M00) : 
				EMFEditObservables.observeValue(editingDomain, matrix3x3, Literals.MATRIX3X3__M01);
				
		UpdateValueStrategy strategy_2 = new UpdateValueStrategy();
		strategy_2.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_3 = new UpdateValueStrategy();
		strategy_3.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(m01ObserveWidget, m01ObserveValue, strategy_2, strategy_3);
		//
		IObservableValue m02ObserveWidget = SWTObservables.observeText(m02Text, SWT.FocusOut);
		IObservableValue m02ObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(matrix3x3, Literals.MATRIX3X3__M00):
				EMFEditObservables.observeValue(editingDomain, matrix3x3, Literals.MATRIX3X3__M02);
				
		UpdateValueStrategy strategy_4 = new UpdateValueStrategy();
		strategy_4.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_5 = new UpdateValueStrategy();
		strategy_5.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(m02ObserveWidget, m02ObserveValue, strategy_4, strategy_5);
		//
		IObservableValue m10ObserveWidget = SWTObservables.observeText(m10Text, SWT.FocusOut);
		IObservableValue m10ObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(matrix3x3, Literals.MATRIX3X3__M10):
				EMFEditObservables.observeValue(editingDomain, matrix3x3, Literals.MATRIX3X3__M10);
		UpdateValueStrategy strategy_8 = new UpdateValueStrategy();
		strategy_8.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_9 = new UpdateValueStrategy();
		strategy_9.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(m10ObserveWidget, m10ObserveValue, strategy_8, strategy_9);
		//
		IObservableValue m11ObserveWidget = SWTObservables.observeText(m11Text, SWT.FocusOut);
		IObservableValue m11ObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(matrix3x3, Literals.MATRIX3X3__M11):
				EMFEditObservables.observeValue(editingDomain, matrix3x3, Literals.MATRIX3X3__M11);
		UpdateValueStrategy strategy_10 = new UpdateValueStrategy();
		strategy_10.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_11 = new UpdateValueStrategy();
		strategy_11.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(m11ObserveWidget, m11ObserveValue, strategy_10, strategy_11);
		//
		IObservableValue m12ObserveWidget = SWTObservables.observeText(m12Text, SWT.FocusOut);
		IObservableValue m12ObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(matrix3x3, Literals.MATRIX3X3__M12): 
				EMFEditObservables.observeValue(editingDomain, matrix3x3, Literals.MATRIX3X3__M12);
		UpdateValueStrategy strategy_12 = new UpdateValueStrategy();
		strategy_12.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_13 = new UpdateValueStrategy();
		strategy_13.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(m12ObserveWidget, m12ObserveValue, strategy_12, strategy_13);
		//
		IObservableValue m20ObserveWidget = SWTObservables.observeText(m20Text, SWT.FocusOut);
		IObservableValue m20ObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(matrix3x3, Literals.MATRIX3X3__M20):
				EMFEditObservables.observeValue(editingDomain, matrix3x3, Literals.MATRIX3X3__M20);
		UpdateValueStrategy strategy_16 = new UpdateValueStrategy();
		strategy_16.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_17 = new UpdateValueStrategy();
		strategy_17.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(m20ObserveWidget, m20ObserveValue, strategy_16, strategy_17);
		//
		IObservableValue m21ObserveWidget = SWTObservables.observeText(m21Text, SWT.FocusOut);
		IObservableValue m21ObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(matrix3x3, Literals.MATRIX3X3__M21):
				EMFEditObservables.observeValue(editingDomain, matrix3x3, Literals.MATRIX3X3__M21);
		UpdateValueStrategy strategy_18 = new UpdateValueStrategy();
		strategy_18.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_19 = new UpdateValueStrategy();
		strategy_19.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(m21ObserveWidget, m21ObserveValue, strategy_18, strategy_19);
		//
		IObservableValue m22ObserveWidget = SWTObservables.observeText(m22Text, SWT.FocusOut);
		IObservableValue m22ObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(matrix3x3, Literals.MATRIX3X3__M22):
				EMFEditObservables.observeValue(editingDomain, matrix3x3, Literals.MATRIX3X3__M22);
		UpdateValueStrategy strategy_20 = new UpdateValueStrategy();
		strategy_20.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_21 = new UpdateValueStrategy();
		strategy_21.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(m22ObserveWidget, m22ObserveValue, strategy_20, strategy_21);				
		//
		return bindingContext;
	}
}