/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.controllers;

import java.util.List;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import ca.gc.asc_csa.apogy.core.programs.controllers.impl.ApogyCoreProgramsControllersFacadeImpl;

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
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getApogyCoreProgramsControllersFacade()
 * @model
 * @generated
 */
public interface ApogyCoreProgramsControllersFacade extends EObject
{
  public static ApogyCoreProgramsControllersFacade INSTANCE = ApogyCoreProgramsControllersFacadeImpl.getInstance();
	
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
	 * @model dataType="ca.gc.asc_csa.apogy.core.programs.controllers.TreeSet<ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint>" unique="false" pointsDataType="ca.gc.asc_csa.apogy.core.programs.controllers.List<ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint>" pointsUnique="false" pointsMany="false"
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

} // ApogyCoreProgramsControllersFacade
