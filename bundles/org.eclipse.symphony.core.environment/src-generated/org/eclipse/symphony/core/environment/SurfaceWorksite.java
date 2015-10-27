/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.SurfaceWorksite#getSky <em>Sky</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.SurfaceWorksite#getMapsList <em>Maps List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getSurfaceWorksite()
 * @model abstract="true"
 * @generated
 */
public interface SurfaceWorksite extends Worksite
{

  /**
	 * Returns the value of the '<em><b>Sky</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.Sky#getSurfaceWorksite <em>Surface Worksite</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sky</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sky</em>' containment reference.
	 * @see #setSky(Sky)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getSurfaceWorksite_Sky()
	 * @see org.eclipse.symphony.core.environment.Sky#getSurfaceWorksite
	 * @model opposite="surfaceWorksite" containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
  Sky getSky();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.SurfaceWorksite#getSky <em>Sky</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sky</em>' containment reference.
	 * @see #getSky()
	 * @generated
	 */
  void setSky(Sky value);

  /**
	 * Returns the value of the '<em><b>Maps List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps List</em>' containment reference.
	 * @see #setMapsList(MapsList)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getSurfaceWorksite_MapsList()
	 * @model containment="true" required="true"
	 * @generated
	 */
  MapsList getMapsList();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.SurfaceWorksite#getMapsList <em>Maps List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps List</em>' containment reference.
	 * @see #getMapsList()
	 * @generated
	 */
  void setMapsList(MapsList value);
} // SurfaceWorksite
