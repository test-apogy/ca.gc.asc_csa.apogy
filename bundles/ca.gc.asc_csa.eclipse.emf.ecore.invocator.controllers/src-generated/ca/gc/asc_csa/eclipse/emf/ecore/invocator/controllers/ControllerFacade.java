/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers;

import java.util.List;
import java.util.TreeSet;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.impl.ControllerFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Utilities
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#getControllerFacade()
 * @model
 * @generated
 */
public interface ControllerFacade extends EObject
{
  public static ControllerFacade INSTANCE = ControllerFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" eParameterUnique="false" valueUnique="false"
	 * @generated
	 */
  Object createValue(EParameter eParameter, float value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.TreeSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.CustomInputConditioningPoint>" unique="false" pointsDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.List<ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.CustomInputConditioningPoint>" pointsUnique="false" pointsMany="false"
	 * @generated
	 */
	TreeSet<CustomInputConditioningPoint> sortCustomInputConditioningPoint(List<CustomInputConditioningPoint> points);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" inputValueUnique="false" outputValueUnique="false"
	 * @generated
	 */
	CustomInputConditioningPoint createCustomInputConditioningPoint(double inputValue, double outputValue);

} // ControllerFacade
