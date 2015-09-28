/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment;

import ca.gc.space.topology.TransformNode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Surface Worksite Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.EarthSurfaceWorksiteNode#getSkyTransformNode <em>Sky Transform Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getEarthSurfaceWorksiteNode()
 * @model
 * @generated
 */
public interface EarthSurfaceWorksiteNode extends SurfaceWorksiteNode
{

  /**
	 * Returns the value of the '<em><b>Sky Transform Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sky Transform Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sky Transform Node</em>' reference.
	 * @see #setSkyTransformNode(TransformNode)
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getEarthSurfaceWorksiteNode_SkyTransformNode()
	 * @model transient="true"
	 * @generated
	 */
  TransformNode getSkyTransformNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.EarthSurfaceWorksiteNode#getSkyTransformNode <em>Sky Transform Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sky Transform Node</em>' reference.
	 * @see #getSkyTransformNode()
	 * @generated
	 */
  void setSkyTransformNode(TransformNode value);
} // EarthSurfaceWorksiteNode
