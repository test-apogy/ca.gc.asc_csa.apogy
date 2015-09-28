/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers;

import ca.gc.asc_csa.jinput.EComponent;

import org.eclipse.emf.ecore.EObject;

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
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#getAbstractInputConditioning()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInputConditioning extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" componentUnique="false"
	 * @generated
	 */
	float conditionInput(EComponent component);

} // AbstractInputConditioning
