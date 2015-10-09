package org.eclipse.symphony.common.math.ui.composites;

import java.text.DecimalFormat;

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
import org.eclipse.symphony.common.databinding.converters.DoubleToStringConverter;
import org.eclipse.symphony.common.databinding.converters.StringToDoubleConverter;
import org.eclipse.symphony.common.math.MathPackage.Literals;

public class Tuple3dComposite extends Composite 
{
	public org.eclipse.symphony.common.math.Tuple3d tuple3d;
	
	private String formatString = "0.000";
	private DecimalFormat decimalFormat;
	
	private DataBindingContext m_bindingContext;
	
	private Text xText;
	private Text yText;
	private Text zText;
	private EditingDomain editingDomain;
	private boolean enableEditing = true;
	
	
	public Tuple3dComposite(Composite parent, int style, EditingDomain editingDomain, String formatString) 
	{
		this(parent, style);		
		this.editingDomain = editingDomain;
		this.formatString = formatString;
	}
	
	public Tuple3dComposite(Composite parent, int style, EditingDomain editingDomain) 
	{
		this(parent, style, editingDomain, "0.000");				
	}

	public Tuple3dComposite(Composite parent, int style, String formatString) 
	{
		super(parent, style);
		this.formatString = formatString;
		
		setLayout(new GridLayout(3, true));

		xText = new Text(this, SWT.BORDER | SWT.SINGLE);
		xText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		yText = new Text(this, SWT.BORDER | SWT.SINGLE);
		yText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		zText = new Text(this, SWT.BORDER | SWT.SINGLE);
		zText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	}
	
	public Tuple3dComposite(Composite parent, int style) 
	{
		this(parent, style, "0.000");
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	public boolean isEnableEditing() {
		return enableEditing;
	}

	public void setEnableEditing(final boolean enableEditing) 
	{
		this.enableEditing = enableEditing;
		
		if (m_bindingContext != null) 
		{
			m_bindingContext.dispose();
			m_bindingContext = null;
		}		
		
		// Sets the Editing propert of the text fields.
		getDisplay().asyncExec(new Runnable()
    	{
    		public void run()
    		{
    			if(enableEditing)
    			{			
    				xText.setEditable(true);
    				yText.setEditable(true);
    				zText.setEditable(true);			
    			}
    			else
    			{
    				xText.setEditable(false);
    				yText.setEditable(false);
    				zText.setEditable(false);			
    			}
    		}
    	});
				
		if (tuple3d != null) 
		{
			if(this.enableEditing)
			{				
				m_bindingContext = custom_initDataBindings();
			}
			else
			{				
				m_bindingContext = initDataBindingsNoEditing();
			}
		}				
	}

	public org.eclipse.symphony.common.math.Tuple3d getTuple3d() {
		return tuple3d;
	}

	public void setTuple3d(org.eclipse.symphony.common.math.Tuple3d newTuple3d) {
		setTuple3d(newTuple3d, true);
	}

	public void setTuple3d(org.eclipse.symphony.common.math.Tuple3d newTuple3d, boolean update) {
		tuple3d = newTuple3d;
		if (update) 
		{
			if (m_bindingContext != null) 
			{
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (tuple3d != null) 
			{
				if(enableEditing)
				{
					m_bindingContext = custom_initDataBindings();
				}
				else
				{
					m_bindingContext = initDataBindingsNoEditing();
				}
			}
		}
	}
	
	protected DecimalFormat getDecimalFormat()
	{
		if(decimalFormat == null)
		{
			decimalFormat = new DecimalFormat(formatString);
		}
		return decimalFormat;
	}
	
	protected DataBindingContext custom_initDataBindings() 
	{
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue xObserveWidget = SWTObservables.observeText(xText, SWT.FocusOut);
		IObservableValue xObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(tuple3d, Literals.TUPLE3D__X):
				EMFEditObservables.observeValue(editingDomain, tuple3d, Literals.TUPLE3D__X);
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new DoubleToStringConverter(getDecimalFormat()));
		bindingContext.bindValue(xObserveWidget, xObserveValue, strategy, strategy_1);
		//
		IObservableValue yObserveWidget = SWTObservables.observeText(yText, SWT.FocusOut);
		IObservableValue yObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(tuple3d, Literals.TUPLE3D__Y):
				EMFEditObservables.observeValue(editingDomain, tuple3d, Literals.TUPLE3D__Y);
					
		UpdateValueStrategy strategy_2 = new UpdateValueStrategy();
		strategy_2.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_3 = new UpdateValueStrategy();
		strategy_3.setConverter(new DoubleToStringConverter(getDecimalFormat()));
		bindingContext.bindValue(yObserveWidget, yObserveValue, strategy_2, strategy_3);
		//
		IObservableValue zObserveWidget = SWTObservables.observeText(zText, SWT.FocusOut);
		IObservableValue zObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(tuple3d, Literals.TUPLE3D__Z):
				EMFEditObservables.observeValue(editingDomain, tuple3d, Literals.TUPLE3D__Z);
					
		UpdateValueStrategy strategy_4 = new UpdateValueStrategy();
		strategy_4.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_5 = new UpdateValueStrategy();
		strategy_5.setConverter(new DoubleToStringConverter(getDecimalFormat()));
		bindingContext.bindValue(zObserveWidget, zObserveValue, strategy_4, strategy_5);
		//
		return bindingContext;
	}
	
	protected DataBindingContext initDataBindingsNoEditing() 
	{
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue xObserveWidget = SWTObservables.observeText(xText, SWT.FocusOut);
		IObservableValue xObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(tuple3d, Literals.TUPLE3D__X):
				EMFEditObservables.observeValue(editingDomain, tuple3d, Literals.TUPLE3D__X);
		
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new DoubleToStringConverter(getDecimalFormat()));
		bindingContext.bindValue(xObserveWidget, xObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy_1);
		//
		IObservableValue yObserveWidget = SWTObservables.observeText(yText, SWT.FocusOut);
		IObservableValue yObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(tuple3d, Literals.TUPLE3D__Y):
				EMFEditObservables.observeValue(editingDomain, tuple3d, Literals.TUPLE3D__Y);
					
		
		UpdateValueStrategy strategy_3 = new UpdateValueStrategy();
		strategy_3.setConverter(new DoubleToStringConverter(getDecimalFormat()));
		bindingContext.bindValue(yObserveWidget, yObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy_3);
		//
		IObservableValue zObserveWidget = SWTObservables.observeText(zText, SWT.FocusOut);
		IObservableValue zObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(tuple3d, Literals.TUPLE3D__Z):
				EMFEditObservables.observeValue(editingDomain, tuple3d, Literals.TUPLE3D__Z);
					
		
		UpdateValueStrategy strategy_5 = new UpdateValueStrategy();
		strategy_5.setConverter(new DoubleToStringConverter(getDecimalFormat()));
		bindingContext.bindValue(zObserveWidget, zObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy_5);
		//
		return bindingContext;
	}
	
	
	
/*	protected DataBindingContext ORIGINAL_initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue xObserveWidget = SWTObservables.observeText(xText, SWT.FocusOut);
		IObservableValue xObserveValue = EMFObservables.observeValue(tuple3d, Literals.TUPLE3D__X);
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(xObserveWidget, xObserveValue, strategy, strategy_1);
		//
		IObservableValue yObserveWidget = SWTObservables.observeText(yText, SWT.FocusOut);
		IObservableValue yObserveValue = EMFObservables.observeValue(tuple3d, Literals.TUPLE3D__Y);
		UpdateValueStrategy strategy_2 = new UpdateValueStrategy();
		strategy_2.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_3 = new UpdateValueStrategy();
		strategy_3.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(yObserveWidget, yObserveValue, strategy_2, strategy_3);
		//
		IObservableValue zObserveWidget = SWTObservables.observeText(zText, SWT.FocusOut);
		IObservableValue zObserveValue = EMFObservables.observeValue(tuple3d, Literals.TUPLE3D__Z);
		UpdateValueStrategy strategy_4 = new UpdateValueStrategy();
		strategy_4.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_5 = new UpdateValueStrategy();
		strategy_5.setConverter(new DoubleToStringConverter());
		bindingContext.bindValue(zObserveWidget, zObserveValue, strategy_4, strategy_5);
		//
		return bindingContext;
	}*/
	
}