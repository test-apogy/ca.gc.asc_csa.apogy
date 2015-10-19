/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A layer representing a terrain map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.AbstractMapLayer#getMap <em>Map</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.AbstractMapLayer#getAbstractMapLayerNode <em>Abstract Map Layer Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getAbstractMapLayer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMapLayer extends Named, Described
{

  /**
	 * Returns the value of the '<em><b>Map</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.Map#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' container reference.
	 * @see #setMap(Map)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getAbstractMapLayer_Map()
	 * @see org.eclipse.symphony.core.environment.Map#getLayers
	 * @model opposite="layers" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  Map getMap();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.AbstractMapLayer#getMap <em>Map</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' container reference.
	 * @see #getMap()
	 * @generated
	 */
  void setMap(Map value);

  /**
	 * Returns the value of the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Map Layer Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Map Layer Node</em>' reference.
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getAbstractMapLayer_AbstractMapLayerNode()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  AbstractMapLayerNode getAbstractMapLayerNode();
} // AbstractMapLayer
