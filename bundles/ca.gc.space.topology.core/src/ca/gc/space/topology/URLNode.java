/**
 * <copyright>
 * </copyright>
 *
 * $Id: URLNode.java,v 1.4.2.3 2015/02/03 20:01:29 rlarcheveque Exp $
 */
package ca.gc.space.topology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.URLNode#getUrl <em>Url</em>}</li>
 *   <li>{@link ca.gc.space.topology.URLNode#getPolygonCount <em>Polygon Count</em>}</li>
 *   <li>{@link ca.gc.space.topology.URLNode#getVertexCount <em>Vertex Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.TopologyPackage#getURLNode()
 * @model
 * @generated
 */
public interface URLNode extends Leaf {
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
	 * @see ca.gc.space.topology.TopologyPackage#getURLNode_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.URLNode#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Polygon Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Count</em>' attribute.
	 * @see #setPolygonCount(int)
	 * @see ca.gc.space.topology.TopologyPackage#getURLNode_PolygonCount()
	 * @model
	 * @generated
	 */
	int getPolygonCount();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.URLNode#getPolygonCount <em>Polygon Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon Count</em>' attribute.
	 * @see #getPolygonCount()
	 * @generated
	 */
	void setPolygonCount(int value);

	/**
	 * Returns the value of the '<em><b>Vertex Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertex Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertex Count</em>' attribute.
	 * @see #setVertexCount(int)
	 * @see ca.gc.space.topology.TopologyPackage#getURLNode_VertexCount()
	 * @model
	 * @generated
	 */
	int getVertexCount();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.URLNode#getVertexCount <em>Vertex Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertex Count</em>' attribute.
	 * @see #getVertexCount()
	 * @generated
	 */
	void setVertexCount(int value);

} // URLNode
