/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

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
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.AbstractMapLayer#getMap <em>Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.AbstractMapLayer#getAbstractMapLayerNode <em>Abstract Map Layer Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getAbstractMapLayer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMapLayer extends Named, Described
{

  /**
	 * Returns the value of the '<em><b>Map</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.environment.Map#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' container reference.
	 * @see #setMap(Map)
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getAbstractMapLayer_Map()
	 * @see ca.gc.asc_csa.symphony.environment.Map#getLayers
	 * @model opposite="layers" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  Map getMap();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.AbstractMapLayer#getMap <em>Map</em>}' container reference.
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
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getAbstractMapLayer_AbstractMapLayerNode()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  AbstractMapLayerNode getAbstractMapLayerNode();
} // AbstractMapLayer
