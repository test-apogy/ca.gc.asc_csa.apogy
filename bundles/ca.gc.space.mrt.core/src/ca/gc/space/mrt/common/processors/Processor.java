/**
 * Canadian Space Agency 2007
 *
 * $Id: Processor.java,v 1.2.4.2 2015/05/21 15:51:13 pallard Exp $
 */
package ca.gc.space.mrt.common.processors;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an object that can process an input to get an output.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#getProcessor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Processor extends Monitorable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" inputRequired="true"
	 * @generated
	 */
	Object process(Object input);

} // Processor
