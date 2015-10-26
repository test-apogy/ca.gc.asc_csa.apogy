/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.Map#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Map#getLayers <em>Layers</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Map#getMapNode <em>Map Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(Matrix4x4)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getMap_Transformation()
	 * @model containment="true"
	 * @generated
	 */
  Matrix4x4 getTransformation();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.Map#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
  void setTransformation(Matrix4x4 value);

  /**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.AbstractMapLayer}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.AbstractMapLayer#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getMap_Layers()
	 * @see org.eclipse.symphony.core.environment.AbstractMapLayer#getMap
	 * @model opposite="map" containment="true"
	 * @generated
	 */
  EList<AbstractMapLayer> getLayers();

  /**
	 * Returns the value of the '<em><b>Map Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Node</em>' reference.
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getMap_MapNode()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
  MapNode getMapNode();

} // Map
