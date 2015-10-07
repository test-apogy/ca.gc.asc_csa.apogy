/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.programs.controllers.AbstractInputConditioning;
import org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage;

import ca.gc.asc_csa.jinput.EComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Input Conditionning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AbstractInputConditioningImpl extends MinimalEObjectImpl.Container implements AbstractInputConditioning
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractInputConditioningImpl()
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
		return EMFEcoreControllersPackage.Literals.ABSTRACT_INPUT_CONDITIONING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public float conditionInput(EComponent component)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case EMFEcoreControllersPackage.ABSTRACT_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT:
				return conditionInput((EComponent)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractInputConditionningImpl
