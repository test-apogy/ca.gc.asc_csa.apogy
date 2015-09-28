/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Based Time Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Time source that provides time based on a selection.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getSelectionBasedTimeSource()
 * @model
 * @generated
 */
public interface SelectionBasedTimeSource extends TimeSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model timedElementUnique="false"
	 * @generated
	 */
	void setSelection(Timed timedElement);

} // SelectionBasedTimeSource
