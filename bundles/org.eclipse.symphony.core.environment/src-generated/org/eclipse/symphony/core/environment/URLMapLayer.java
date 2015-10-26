/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Map Layer containing a URL to some data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.URLMapLayer#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getURLMapLayer()
 * @model abstract="true"
 * @generated
 */
public interface URLMapLayer extends AbstractMapLayer
{
  /**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getURLMapLayer_Url()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='URL'"
	 * @generated
	 */
  String getUrl();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.URLMapLayer#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
  void setUrl(String value);

} // URLMapLayer
