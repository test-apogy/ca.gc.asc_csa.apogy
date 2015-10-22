/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display.impl;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.symphony.common.emf.Ranges;
import org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade;
import org.eclipse.symphony.core.display.BooleanDisplay;
import org.eclipse.symphony.core.display.DisplayFacade;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage;
import org.eclipse.symphony.core.display.databindings.UpdateValueStrategyWithRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BooleanDisplayImpl extends AbstractFeatureDisplayImpl implements BooleanDisplay
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BooleanDisplayImpl()
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
		return EMFEcoreInvocatorDisplayPackage.Literals.BOOLEAN_DISPLAY;
	}

  @Override
  public Control createControl(Composite parent) 
  {
	  Button button = new Button(parent, SWT.CENTER | SWT.CHECK);	  		  
	  button.setSelection(false);	
	  return button;  
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
				if(eStructuralFeature.getEType().getInstanceClass() == boolean.class)
				{
					IObservableValue observeWidget = PojoProperties.value("selection").observe(control);					
					
					UpdateValueStrategyWithRange strategy = new UpdateValueStrategyWithRange(eStructuralFeature, this, control);
					
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
	 if(control instanceof Button)
	 {
		 Button button = (Button) control;
		 button.setEnabled(false);
	 }
  }
} //BooleanDisplayImpl
