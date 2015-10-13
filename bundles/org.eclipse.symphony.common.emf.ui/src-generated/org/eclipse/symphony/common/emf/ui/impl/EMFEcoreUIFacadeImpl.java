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
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
import org.eclipse.symphony.common.emf.Ranges;
import org.eclipse.symphony.common.emf.ui.Activator;
import org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade;
import org.eclipse.symphony.common.emf.ui.EMFEcoreUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMFEcoreUIFacadeImpl extends MinimalEObjectImpl.Container implements EMFEcoreUIFacade
{
	private static EMFEcoreUIFacade instance = null;
	
	public static EMFEcoreUIFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new EMFEcoreUIFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EMFEcoreUIFacadeImpl()
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
		return EMFEcoreUIPackage.Literals.EMF_ECORE_UI_FACADE;
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
  public Unit getDisplayUnits(ETypedElement eTypedElement)
  {
	  Unit displayUnit = Activator.getDefault().getDisplayUnit(eTypedElement);
	  
	  // No display unit defined, return the native units.
	  if(displayUnit == null)
	  {
		  displayUnit = EMFEcoreFacade.INSTANCE.getEngineeringUnits(eTypedElement);
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
			case EMFEcoreUIPackage.EMF_ECORE_UI_FACADE___GET_COLOR_FOR_RANGE__RANGES:
				return getColorForRange((org.eclipse.symphony.common.emf.Ranges)arguments.get(0));
			case EMFEcoreUIPackage.EMF_ECORE_UI_FACADE___GET_DISPLAY_UNITS__ETYPEDELEMENT:
				return getDisplayUnits((ETypedElement)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EMFEcoreUIFacadeImpl
