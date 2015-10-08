/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Result Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value of a basic type (i.e. no an EObject).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.AttributeResultValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getAttributeResultValue()
 * @model
 * @generated
 */
public interface AttributeResultValue extends AbstractResultValue
{
  /**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Reference to a container to the value.  This is required to permit
	 * the value to be seen as a property and to allow override getText().
	 * This permits as well to keep default implementation of
	 * serialization/deserialization of the data type EJavaObject defined
	 * in EMF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(AttributeValue)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getAttributeResultValue_Value()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' children='true' createChild='false'"
	 * @generated
	 */
  AttributeValue getValue();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.AttributeResultValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
  void setValue(AttributeValue value);

} // AttributeResultValue
