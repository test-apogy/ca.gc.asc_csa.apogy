/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display.impl;

import java.text.DecimalFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.symphony.common.databinding.converters.BooleanToStringConverter;
import org.eclipse.symphony.common.databinding.converters.IntegerToStringConverter;
import org.eclipse.symphony.common.emf.Ranges;
import org.eclipse.symphony.common.emf.databinding.EMFReferenceUpdateStrategy;
import org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade;
import org.eclipse.symphony.common.emf.ui.converters.AbstractNativeToDisplayConverter;
import org.eclipse.symphony.core.display.DisplayFacade;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage;
import org.eclipse.symphony.core.display.TextDisplay;
import org.eclipse.symphony.core.display.databindings.EnumUpdateValueStrategy;
import org.eclipse.symphony.core.display.databindings.UpdateValueStrategyWithRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.display.impl.TextDisplayImpl#getDecimalFormat <em>Decimal Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextDisplayImpl extends AbstractFeatureDisplayImpl implements TextDisplay
{	
  /**
	 * The default value of the '{@link #getDecimalFormat() <em>Decimal Format</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDecimalFormat()
	 * @generated
	 * @ordered
	 */
  protected static final String DECIMAL_FORMAT_EDEFAULT = "0.000";

  /**
	 * The cached value of the '{@link #getDecimalFormat() <em>Decimal Format</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDecimalFormat()
	 * @generated
	 * @ordered
	 */
  protected String decimalFormat = DECIMAL_FORMAT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TextDisplayImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EMFEcoreInvocatorDisplayPackage.Literals.TEXT_DISPLAY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDecimalFormat()
  {
		return decimalFormat;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDecimalFormat(String newDecimalFormat)
  {
		String oldDecimalFormat = decimalFormat;
		decimalFormat = newDecimalFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorDisplayPackage.TEXT_DISPLAY__DECIMAL_FORMAT, oldDecimalFormat, decimalFormat));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case EMFEcoreInvocatorDisplayPackage.TEXT_DISPLAY__DECIMAL_FORMAT:
				return getDecimalFormat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EMFEcoreInvocatorDisplayPackage.TEXT_DISPLAY__DECIMAL_FORMAT:
				setDecimalFormat((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case EMFEcoreInvocatorDisplayPackage.TEXT_DISPLAY__DECIMAL_FORMAT:
				setDecimalFormat(DECIMAL_FORMAT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case EMFEcoreInvocatorDisplayPackage.TEXT_DISPLAY__DECIMAL_FORMAT:
				return DECIMAL_FORMAT_EDEFAULT == null ? decimalFormat != null : !DECIMAL_FORMAT_EDEFAULT.equals(decimalFormat);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (decimalFormat: ");
		result.append(decimalFormat);
		result.append(')');
		return result.toString();
	}
  
  @Override
  public Control createControl(Composite parent) 
  {
  	// Creates the control.
	Text text = new Text(parent, SWT.CENTER);
	text.setBackground(new Color(parent.getDisplay(), 255, 0, 0));			
	return text;	  	  
  }
  
  @Override
  public DataBindingContext bindControl(Control control) 
  {
		DataBindingContext bindingContext = null;				
		
		IObservableValue observeValue = DisplayFacade.INSTANCE.getIObservableValue(this, control);
				
		// Creates a new binding.
		if(observeValue != null)
		{
			bindingContext = new DataBindingContext();
						
			EStructuralFeature eStructuralFeature = getEStructuralFeature(this);
			
			if(eStructuralFeature != null)
			{
				if(eStructuralFeature.getEType() instanceof EEnum)
				{
					// If the item is an ENUM
					IObservableValue textObserveValue = PojoObservables.observeValue(control, "text");																
					EnumUpdateValueStrategy strategy = new EnumUpdateValueStrategy(eStructuralFeature, this, control);
					strategy.setConverter(new IntegerToStringConverter());
					bindingContext.bindValue(textObserveValue, observeValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy);
					
					// Sets the background to UNKNOWN for now.
					control.setBackground(EMFEcoreUIFacade.INSTANCE.getColorForRange(Ranges.UNKNOWN));								
				}
				else if(eStructuralFeature.getEType() instanceof EClass)
				{					
					IObservableValue textObserveValue = PojoObservables.observeValue(control, "text");				
					UpdateValueStrategy strategy = new EMFReferenceUpdateStrategy();				
					bindingContext.bindValue(textObserveValue, observeValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy);
								
					// Sets the background to UNKNOWN for now.
					control.setBackground(EMFEcoreUIFacade.INSTANCE.getColorForRange(Ranges.UNKNOWN));					
				}
				else
				{
					// If the item is a simple type.
					IObservableValue observeWidget = PojoObservables.observeValue(control, "text");		// SWTObservables.observeText(text, SWT.NONE);															
					UpdateValueStrategyWithRange strategy = new UpdateValueStrategyWithRange(eStructuralFeature, this, control);	
					
					// Used the appropriate Converter.
					Converter converter = null;
					
					String formatString = this.getDecimalFormat();
					if(formatString == null || formatString.length() == 0)
					{
						formatString = "0.000";
					}
					
					if(eStructuralFeature.getEType().getInstanceClass() == double.class || 
					   eStructuralFeature.getEType().getInstanceClass() == float.class)
					{				
						converter = new AbstractNativeToDisplayConverter(eStructuralFeature, new DecimalFormat(formatString));	
					}					
					else if(eStructuralFeature.getEType().getInstanceClass() == int.class)
					{
						converter = new IntegerToStringConverter();	
					}
					else if(eStructuralFeature.getEType().getInstanceClass() == boolean.class)
					{
						converter = new BooleanToStringConverter();
					}
					strategy.setConverter(converter);
					
					bindingContext.bindValue(observeWidget, observeValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy);				
				}
			}
		}

		return bindingContext;
  }
  
  @Override
  public void updateRange(Control control, Ranges range) 
  {
	  if(!control.isDisposed())
	  {
			control.setBackground(EMFEcoreUIFacade.INSTANCE.getColorForRange(range));
	  }
  }
  
  @Override
  public void updateResolved(Control control, boolean resolved) 
  {
	  if(control instanceof Text )
	  {
		  Text text = (Text) control;
		  if(!text.isDisposed())
		  {
			  FontData fontData = text.getFont().getFontData()[0];
			  
			  if(resolved)
			  {
				  fontData.setStyle(SWT.NORMAL);
			  }
			  else
			  {
				  fontData.setStyle(SWT.ITALIC);
			  }
			  
			  text.setFont(new Font(Display.getDefault(), fontData));	
		  }
	  }
  }
} //TextDisplayImpl
