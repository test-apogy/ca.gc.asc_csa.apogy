/**
 */
package org.eclipse.symphony.common.emf.ui.impl;

import java.lang.reflect.InvocationTargetException;


import javax.measure.unit.Unit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade;
import org.eclipse.symphony.common.emf.Ranges;
import org.eclipse.symphony.common.emf.ui.Activator;
import org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIFacade;
import org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Symphony__CommonEMFUIFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__CommonEMFUIFacade
{
	private static Symphony__CommonEMFUIFacade instance = null;
	
	public static Symphony__CommonEMFUIFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new Symphony__CommonEMFUIFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Symphony__CommonEMFUIFacadeImpl()
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
		return Symphony__CommonEMFUIPackage.Literals.SYMPHONY_COMMON_EMFUI_FACADE;
	}

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Color getColorForRange(Ranges range)
  {
	  return Activator.getDefault().getRangeColor(range, Display.getDefault());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  @SuppressWarnings("rawtypes")
  public Unit<?> getDisplayUnits(ETypedElement eTypedElement)
  {
	  Unit displayUnit = Activator.getDefault().getDisplayUnit(eTypedElement);
	  
	  // No display unit defined, return the native units.
	  if(displayUnit == null)
	  {
		  displayUnit = Symphony__CommonEMFFacade.INSTANCE.getEngineeringUnits(eTypedElement);
	  }
	  
	  return displayUnit;
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
			case Symphony__CommonEMFUIPackage.SYMPHONY_COMMON_EMFUI_FACADE___GET_COLOR_FOR_RANGE__RANGES:
				return getColorForRange((Ranges)arguments.get(0));
			case Symphony__CommonEMFUIPackage.SYMPHONY_COMMON_EMFUI_FACADE___GET_DISPLAY_UNITS__ETYPEDELEMENT:
				return getDisplayUnits((ETypedElement)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Symphony__CommonEMFUIFacadeImpl
