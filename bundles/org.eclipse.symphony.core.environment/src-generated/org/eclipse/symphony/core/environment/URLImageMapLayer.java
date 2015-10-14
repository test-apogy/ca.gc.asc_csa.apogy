/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * ImageMapLayer that refers to an image at a URL
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.URLImageMapLayer#getLegendURL <em>Legend URL</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getURLImageMapLayer()
 * @model
 * @generated
 */
public interface URLImageMapLayer extends ImageMapLayer, URLMapLayer
{

  /**
	 * Returns the value of the '<em><b>Legend URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URL to the Image Map Layer legend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legend URL</em>' attribute.
	 * @see #setLegendURL(String)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getURLImageMapLayer_LegendURL()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='URL'"
	 * @generated
	 */
  String getLegendURL();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.URLImageMapLayer#getLegendURL <em>Legend URL</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend URL</em>' attribute.
	 * @see #getLegendURL()
	 * @generated
	 */
  void setLegendURL(String value);
} // URLImageMapLayer
