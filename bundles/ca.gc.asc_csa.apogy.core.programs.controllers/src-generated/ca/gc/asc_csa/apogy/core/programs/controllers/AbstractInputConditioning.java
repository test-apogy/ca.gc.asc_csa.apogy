/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.controllers;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Input Conditioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Input Conditioning
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getAbstractInputConditioning()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInputConditioning extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition the value of the component and produces an Argument that
	 * will be used as an input to an EOperation.
	 * <!-- end-model-doc -->
	 * @model unique="false" componentUnique="false"
	 * @generated
	 */
	float conditionInput(EComponent component);

} // AbstractInputConditioning
