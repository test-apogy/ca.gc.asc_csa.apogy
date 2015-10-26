/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons;

import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.core.FeatureOfInterestList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Of Interest Picking Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A 3D tool used to create FeatureOfInterest.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getFeatureOfInterestList <em>Feature Of Interest List</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickAbsolutePosition <em>Pick Absolute Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickRelativePosition <em>Pick Relative Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickedNode <em>Picked Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickAbsoluteNormal <em>Pick Absolute Normal</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickRelativeNormal <em>Pick Relative Normal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getFeatureOfInterestPickingTool()
 * @model
 * @generated
 */
public interface FeatureOfInterestPickingTool extends Simple3DTool {
	/**
	 * Returns the value of the '<em><b>Feature Of Interest List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  List of Feature Of Interest where to add Feature Of Interest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Of Interest List</em>' reference.
	 * @see #setFeatureOfInterestList(FeatureOfInterestList)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getFeatureOfInterestPickingTool_FeatureOfInterestList()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false'"
	 * @generated
	 */
	FeatureOfInterestList getFeatureOfInterestList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getFeatureOfInterestList <em>Feature Of Interest List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Of Interest List</em>' reference.
	 * @see #getFeatureOfInterestList()
	 * @generated
	 */
	void setFeatureOfInterestList(FeatureOfInterestList value);

	/**
	 * Returns the value of the '<em><b>Pick Absolute Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pick Absolute Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick Absolute Position</em>' reference.
	 * @see #setPickAbsolutePosition(Tuple3d)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getFeatureOfInterestPickingTool_PickAbsolutePosition()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly' propertyCategory='PICKED_NODE'"
	 * @generated
	 */
	Tuple3d getPickAbsolutePosition();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickAbsolutePosition <em>Pick Absolute Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick Absolute Position</em>' reference.
	 * @see #getPickAbsolutePosition()
	 * @generated
	 */
	void setPickAbsolutePosition(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Pick Relative Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pick Relative Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick Relative Position</em>' reference.
	 * @see #setPickRelativePosition(Tuple3d)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getFeatureOfInterestPickingTool_PickRelativePosition()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' propertyCategory='PICKED_NODE'"
	 * @generated
	 */
	Tuple3d getPickRelativePosition();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickRelativePosition <em>Pick Relative Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick Relative Position</em>' reference.
	 * @see #getPickRelativePosition()
	 * @generated
	 */
	void setPickRelativePosition(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Picked Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picked Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picked Node</em>' reference.
	 * @see #setPickedNode(Node)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getFeatureOfInterestPickingTool_PickedNode()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' propertyCategory='PICKED_NODE'"
	 * @generated
	 */
	Node getPickedNode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickedNode <em>Picked Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picked Node</em>' reference.
	 * @see #getPickedNode()
	 * @generated
	 */
	void setPickedNode(Node value);

	/**
	 * Returns the value of the '<em><b>Pick Absolute Normal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pick Absolute Normal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick Absolute Normal</em>' reference.
	 * @see #setPickAbsoluteNormal(Tuple3d)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getFeatureOfInterestPickingTool_PickAbsoluteNormal()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' propertyCategory='PICKED_NODE'"
	 * @generated
	 */
	Tuple3d getPickAbsoluteNormal();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickAbsoluteNormal <em>Pick Absolute Normal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick Absolute Normal</em>' reference.
	 * @see #getPickAbsoluteNormal()
	 * @generated
	 */
	void setPickAbsoluteNormal(Tuple3d value);

	/**
	 * Returns the value of the '<em><b>Pick Relative Normal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pick Relative Normal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick Relative Normal</em>' reference.
	 * @see #setPickRelativeNormal(Tuple3d)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getFeatureOfInterestPickingTool_PickRelativeNormal()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' propertyCategory='PICKED_NODE'"
	 * @generated
	 */
	Tuple3d getPickRelativeNormal();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.FeatureOfInterestPickingTool#getPickRelativeNormal <em>Pick Relative Normal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick Relative Normal</em>' reference.
	 * @see #getPickRelativeNormal()
	 * @generated
	 */
	void setPickRelativeNormal(Tuple3d value);

} // FeatureOfInterestPickingTool
