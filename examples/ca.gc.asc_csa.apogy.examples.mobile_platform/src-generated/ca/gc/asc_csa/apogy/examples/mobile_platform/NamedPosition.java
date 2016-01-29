/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.mobile_platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is used to represent a named variety of position
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.mobile_platform.NamedPosition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.ApogyExamplesMobilePlatformPackage#getNamedPosition()
 * @model
 * @generated
 */
public interface NamedPosition extends Position
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name associated with this set of Cartesian coordinates and pose angle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.ApogyExamplesMobilePlatformPackage#getNamedPosition_Name()
	 * @model default="" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly'"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.mobile_platform.NamedPosition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

} // NamedPosition