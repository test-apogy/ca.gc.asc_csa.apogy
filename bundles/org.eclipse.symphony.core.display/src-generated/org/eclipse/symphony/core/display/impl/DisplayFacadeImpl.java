/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.symphony.common.emf.AbstractFeatureSpecifier;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;
import org.eclipse.symphony.core.display.DisplayFacade;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage;
import org.eclipse.symphony.core.display.databindings.WatchFeatureNodeObservableValue;
import org.eclipse.symphony.core.invocator.AbstractDisplay;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.Watch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DisplayFacadeImpl extends MinimalEObjectImpl.Container implements DisplayFacade
{
	private static DisplayFacade instance = null;
	
	public static DisplayFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new DisplayFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DisplayFacadeImpl()
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
		return EMFEcoreInvocatorDisplayPackage.Literals.DISPLAY_FACADE;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String getDisplayedName(AbstractFeatureDisplay abstractFeatureDisplay)
  {
	  return EMFEcoreInvocatorFacade.INSTANCE.getFullyQualifiedName(abstractFeatureDisplay.getAbstractFeatureNode());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EObject getSource(AbstractFeatureDisplay abstractFeatureDisplay)
  {
	  EObject eObject = null;
	 	  
	  Watch watch = EMFEcoreInvocatorFacade.INSTANCE.resolveWatch(abstractFeatureDisplay.getAbstractFeatureNode());
	  
	  if(watch != null)
	  {
		  Variable variable = watch.getVariable();
		  if(variable != null)
		  {
			  // Resolve variable.
			  eObject = EMFEcoreInvocatorFacade.INSTANCE.getInstance(variable);
		  }
	  }
	  
	  return eObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EStructuralFeature getEStructuralFeature(AbstractDisplay abstractDisplay)
  {
	  	EStructuralFeature eStructuralFeature = null;
		
	  	if(abstractDisplay instanceof AbstractFeatureDisplay)
	  	{
	  		AbstractFeatureDisplay abstractFeatureDisplay = (AbstractFeatureDisplay) abstractDisplay;
	  		
			if(abstractFeatureDisplay.getAbstractFeatureNode() instanceof AbstractFeatureSpecifier)
			{
				AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) abstractFeatureDisplay.getAbstractFeatureNode();			
				eStructuralFeature = abstractFeatureSpecifier.getStructuralFeature() ;		
			}
	  	}
		
		return eStructuralFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public IObservableValue getIObservableValue(final AbstractFeatureDisplay abstractFeatureDisplay, final Control control)
  {
	  if(abstractFeatureDisplay.getAbstractFeatureNode() instanceof AbstractFeatureSpecifier)
	  {		  
		  EObject eObject = getSource(abstractFeatureDisplay);
		  
		  WatchFeatureNodeObservableValue watchFeatureNodeObservableValue = new WatchFeatureNodeObservableValue(eObject, abstractFeatureDisplay.getAbstractFeatureNode())
		  {
			  public void resolved(final boolean newValue) 
			  {
				  Display.getCurrent().asyncExec (new Runnable () 
				  {
						public void run () 
					    {
							abstractFeatureDisplay.updateResolved(control, newValue);	
					    }
				  });
			  }
		  };
		  
		  return watchFeatureNodeObservableValue;
	  }
	  else
	  {
		  return null;
	  }
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case EMFEcoreInvocatorDisplayPackage.DISPLAY_FACADE___GET_DISPLAYED_NAME__ABSTRACTFEATUREDISPLAY:
				return getDisplayedName((AbstractFeatureDisplay)arguments.get(0));
			case EMFEcoreInvocatorDisplayPackage.DISPLAY_FACADE___GET_SOURCE__ABSTRACTFEATUREDISPLAY:
				return getSource((AbstractFeatureDisplay)arguments.get(0));
			case EMFEcoreInvocatorDisplayPackage.DISPLAY_FACADE___GET_ESTRUCTURAL_FEATURE__ABSTRACTDISPLAY:
				return getEStructuralFeature((AbstractDisplay)arguments.get(0));
			case EMFEcoreInvocatorDisplayPackage.DISPLAY_FACADE___GET_IOBSERVABLE_VALUE__ABSTRACTFEATUREDISPLAY_CONTROL:
				return getIObservableValue((AbstractFeatureDisplay)arguments.get(0), (Control)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
} //DisplayFacadeImpl
